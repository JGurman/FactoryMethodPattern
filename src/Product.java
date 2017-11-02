public class Product {
}
class ConcreteProductA extends Product {

}
class ConcreteProductB extends Product {

}
abstract class Creator {
    public abstract Product factoryMethod();
    //
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

