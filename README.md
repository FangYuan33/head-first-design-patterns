## 《Head First 设计模式》及一些应用示例

- **随时想到系统以后可能需要的变化以及应付变化的原则**
- 良好的OO设计必须具备可复用、可扩充、可维护三个特性
- 代码应该如同晚霞中的莲花一样地关闭（免于改变），如同晨曦中的莲花一样地开放（能够扩展）

## 1. 设计原则
1. 找出应用中**可能需要变化之处**，把它们**独立出来**，**不要和那些不需要变化的代码混在一起**
2. **面向接口编程**，而不是面向实现编程
> 接口是Java中的`interface`，当然这里强调的不是它，而是 **"概念"**，面向接口编程强调的是**多态**。这就类似在Spring中注入的bean是具体实现，
> 但是它们的引用却是接口，这样声明的字段不用管注入的是谁，直接调用方法即可，而且可以在运行时改变实现类型，"切换不同的策略"。

3. 多用组合，少用继承
4. 为**松耦合**的实现努力
5. **开放-关闭原则**: 类应该对扩展开放，对修改关闭
6. **依赖倒置原则**: 依赖抽象，不要依赖具体实现类
> 依赖倒置原则变量尽量不持有具体类的引用，也就是说尽可能不使用new，可以改用工厂模式来代替

## 2. 策略模式
> **策略模式**定义了算法族，分别封装起来，让它们之间可以互相替换。我理解的是在Spring中，一个Bean有多种实现，在注入时我们可以选择注入想要的实现。

- 策略模式代码示例在 chapter2 包下

## 3. 观察者模式
> **观察者模式**定义了对象之间一对多的关系（主题对多个观察者），这样一来，当主题改变状态时，它的所有观察者都会收到通知。
> 主题和观察者对象是**松耦合**的，因为主题唯一依赖的东西是一个实现了 `Observer` 接口的观察者对象列表，在运行时可以用新的观察者替换旧的观察者，
> 主题的代码不需要改变

- 观察者模式代码示例在 chapter3 包下，通过JDK内置的 `Observable` 和 `Observer` 来实现。

但是JDK提供的现成的观察者组件也有它自己的问题：
1. `Observable`是一个**类**，这也就导致了必须创建一个类来实现的， 而且Java是单继承的，所以要想再继承其他类的功能是行不通的
2. `Observable`中`setChanged()`的方法是被`protected`修饰的，这也就导致了，我们没有办法通过**组合**Observable实例到我们自己的对象中来实现
想要的功能。这也违反了**多用组合，少用继承**的原则

![](images/观察者模式1.jpg)

### 3.1 zookeeper中watch机制使用的观察者模式
如下图所示，客户端在调用`getData()`方法的时候会对指定的路径添加观察者，保存在 **"主题"** 中，path发生改变后通知这些观察者

![](images/观察者模式2.jpg)

- 代码示例在 chapter3/zookeeper 下

## 4. 装饰器模式
> **装饰器模式**能够**动态地**在被装饰者的方法调用**之前/之后**加上新的执行逻辑。装饰者和被装饰者有**相同的超类**，
> 每个装饰者中都 **"包装"一个超类的引用**，以保存某个被装饰者，也因此能够在运行时动态地来更换装饰者。
> 但是它的**缺点是有很多小类**，使得代码复杂度增加

- 代码示例在 chapter4/decorator 下，类关系和调用关系如下图所示

![](images/装饰者模式.jpg)

### 4.1 Java I/O 对装饰器模式的应用
**Java IO** 对装饰器模式的使用和上方的例子类似，类关系图如下，它们公共的超类是 `InputStream`

![](images/装饰者模式javaio.jpg)

- 代码示例在 chapter4/javaio 下，写了一个将字符小写处理的输入流**装饰器**

## 5. 工厂模式
- **所有工厂模式都是用来封装对象创建的**，它是对**依赖倒置原则**很好的体现，使用的是抽象类型，
而无需关注具体的子类，具体返回的类型由子类来决定，也因此促进**松耦合**

### 5.1 简单工厂
简单工厂**其实不是一个设计模式**，它更像是一个**编程习惯**，把**创建对象的代码包装进一个类中**，当创建对象的逻辑需要发生改变时，
只需要修改这个简单工厂类即可（对应设计原则的第一条）

- 代码示例在 chapter5/simple 下，对应的类的继承和组合关系如下
  ![img.png](images/简单工厂.jpg)

实际完成的代码抽取动作如下

![img.png](images/img_1.png)

### 5.2 工厂方法模式
> **工厂方法模式**定义抽象的工厂方法，通过让**子类**实现该方法来定制化实现对象的创建，以达到封装创建对象代码的目的

- 代码示例在 chapter5/factorymethod 下，对应的类继承和组合关系如下，主要有两大类：**创建者类**和**产品类**
  ![](images/工厂方法模式.jpg)

创建者抽象类通常会依赖抽象的产品类，而这些抽象的产品对象由子类创建，创建者不关心具体的类型

### 5.3 抽象工厂模式
> **抽象工厂模式**定义一个**接口**，用来**创建一大组相关的对象**，而不需要指定对象具体的类型，也就是说工厂方法的返回值对象也是抽象的。

先看一组类图，"各地不同的原料工厂创建各地的食材"，如下

![](images/抽象工厂模式.jpg)

`IngredientsFactory` 定义接口，包含两个方法，用来创建对象: `Cheese` 和 `Veggie`。`ChinaIngredientsFactory` 和
`UKIngredientsFactory` 做具体实现，来创建各地不同的食材。

- 代码示例在 chapter5/abstractfactory 下

为什么要使用抽象工厂模式？

因为**各地的**披萨店需要**各地的**食材来做披萨，而食材中**包含多种食材**，
这样我们就必须要使用抽象工厂模式来**创建一批食材对象**。

### 5.4 工厂模式和抽象工厂模式的区别

- **实现不同**
  - **工厂方法模式**: 通过**继承**来重写**单个工厂方法**
  - **抽象工厂模式**: 定义一个**接口**，由不同的子类实现**多个工厂方法**，创建一系列相关的对象

## 6. 单例模式
> **单例模式**确保**一个类只有一个实例**，并提供一个全局的访问点

- 构造器私有
- 公开出静态方法创建对象
- 双重检测锁机制注意标记volatile

### 6.1 饿汉式
如果应用程序总是创建并使用该单例对象。或者在创建和运行时方面的负担不太繁重，可以**急迫地**创建该单例

```java
/**
 * 饿汉式单例模式
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return singleton;
    }
}
```

**JVM保证在任何线程访问 `singleton` 静态变量之前，一定先创建此实例**

### 6.2 懒汉式
如果程序**可以接受**同步的getInstance方法造成的额外负担，那么可以采用如下的方法

```java
/**
 * 懒汉式单例模式
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }
    
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        
        return singleton;
    }
}
```

### 6.3 双重检测锁
如果想在用到时才创建对象且运行时比较关注性能的话，可以采用这种机制，因为在该对象创建完成后，便不会再有加锁操作出现了

```java
/**
 * 双重检测锁单例模式
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
```
- volatile关键字确保 `singleton` 对象被创建后其他线程能及时的知道

## 15. 责任链模式
> **责任链模式**可以实现多个对象对请求进行处理，而且是将请求和请求的处理者**解耦**：请求的发送者无需关心处理的细节和请求的传递，只需将请求发送到责任链上即可

### 15.1 工作中对责任链模式的使用
项目开放外部接口调用，请求进来都有一套必走的逻辑，如下

![img.png](images/img.png)

通过使用Spring的AOP切面技术并结合责任链模式，能够**按顺序**将以上处理节点进行封装，按需对请求进行处理，满足业务需求并达到**解耦**的目的

- 代码示例在 chapter15 下，结构如下图所示

![](images/责任链模式.jpg)

### 15.2 zookeeper对责任链模式的使用
![img.png](images/zookeeper.png)

zookeeper在处理create请求时，会封装一条如上图所示的责任链（理解流程需要了解zookeeper相关知识）

- **LeaderRequestProcessor**: 校验工作
- **PrepRequestProcessor**: 请求入队
- **ProposalRequestProcessor**: 两阶段提交的proposal阶段
- **SyncRequestProcessor**: 将数据写入本地事务文件
- **CommitProcessor**: 等到过半ack后，处理接下来的节点任务
- **ToBeAppliedRequestProcessor**: do noting
- **FinalRequestProcessor**: 将数据写到内存 Map 中
