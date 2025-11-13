package Design.Patterns.creational.singleton;


/*
* ENUM singleton is most simple and efficient way for defining singleton classes
*
* Advantages
* 1. Avoids Deserialization issues ( special serialization and deserialization in case of enums)
* 2. Avoids multi threading issues ( instance is created at the time of class loading)
* 3. NO Reflection issues ( JVM forbids reflection in enums)
* 4. Less boilerplate code
* 5. Clone safe ( we can't create new instance by cloning in enum)
*   JVM forbids cloning in enum , if you do u will get clone not supported exception
* 6. Enum instance is created only when the enum is referenced. (Although it is still eager initialization in context of class)
*
* So when does Bill pugh singleton used compared to enum singleton
*
* 1. when you want proper lazy initialization (more flexibility in defining methods)
* 2. Enums can't extend any other classes. But Bill Pugh can do (in that case it is better than enum )
* 3. More functionality ( you can have as many as methods and variables compared to enums)
*
*
* */
public enum EnumSingleton {
    ENUM_SINGLETON

    /*
    In java enum constants are by default public static final
    the above line is compiled as
    public static final EnumSingleton ENUM_SINGLETON = new EnumSingleton();
    using enum for singleton pattern provides us safety from Reflection and multi threading

    this is lazy initialization of singleton design pattern
    the ENUM_SINGLETON is initialized only when the EnumSingleton class is referenced elsewhere

    refer this link to understand better why enum provides us with lazy initialization
    https://stackoverflow.com/questions/16771373/singleton-via-enum-way-is-lazy-initialized
     */
}
