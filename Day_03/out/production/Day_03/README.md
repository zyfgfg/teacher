## static 特性:
###  可以修饰属性  可以修饰方法
###  随着类的加载而加载  
###  优先于对象存在
###  被类的所有对象共享
      这就是我们判断是否使用static 关键字的条件(如果被共享了 就不需要提供访问方法)
###  静态方法里面是没有 this 关键字
###   静态的方法只能访问静态的成员变量,成员方法

对于静态成员的调用:    类名.属性名     类名.方法名()

## 静态变量和成员变量的区别
   1. 静态变量属于类  也叫类变量
      成员变量属于对象  也叫对象变量(实例变量)
   2. 存在的位置:
      静态变量存在 方法区里面的静态区
      成员变量存在 堆里面
   3. 生命周期
      静态变量随着类的加载而加载  随着类的消失而消失
      成员变量随着对象创建而创建 随着对象的消失而消失
   4. 调用不同
        静态:  通过类名调用(对象名调用)
        成员变量  对象名调用

    类里面有:  属性{  基本数据类型   
                    引用类型 String  
                    数组  
                    类
    
                    }
    
              方法

###   extends  继承
        子类 继承父类  可以引用父类的成员
        如果多个类存在相同的属性和行为的时候,这些内容可以抽取到单独的一个类中   那么其他类(子类或者派生类)就无须再去定义
        只需要继承这个单独类（父类,超类,基类）就行
    
    在父类中  被private 修饰的 一律不能被继承
    java只支持单继承 可以多层继承
    继承的弊端:  打破了封装性
    
    //子类能不能继承父类的构造方法
    
    父类对象在子类对象创建之前 优先创建
    
    不要为了部分功能去继承 
    
    子类方法如果要调用属性  那么会从方法内部先去找,如果方法内部没有就去方法外面（全局变量）找
    
    
    方法重写: 一般发生在继承中, 子类里面的方法和父类里面的方法一样 
    子类在重写父类的方法的时候  权限一定要大于等于父类的权限
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


