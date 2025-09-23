# Abstract Class & Interface Cheat Sheet (Java)

## 🚀 Definition
- **Abstract Class**: A class that **cannot be instantiated** (you cannot create an object of it). It is meant to be **extended** by other classes. It can have **abstract methods (without body)** and **concrete methods (with body)**.
- **Interface**: A **contract** that defines a set of methods a class must implement. It supports **multiple inheritance**.

---

## ✨ Abstract Class
### ✅ Rules
- Declared using `abstract` keyword.
- Can have **abstract methods** and **concrete methods**.
- Can have **constructors** (but cannot be directly instantiated).
- Can have variables (instance & static).
- A subclass must implement **all abstract methods** or be declared abstract itself.
- Supports **single inheritance**.

### ✅ Example
```java
abstract class Shape {
    abstract void draw(); // abstract method (no body)

    void info() { // concrete method
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.info();
    }
}
```
**Output:**
```
Drawing a Circle
This is a shape
```

---

## ✨ Interface
### ✅ Rules
- Declared using `interface` keyword.
- All methods are **public & abstract** by default (until Java 7).
- Since **Java 8**, interfaces can have:
  - **Default methods** (with body, using `default` keyword).
  - **Static methods** (can be called using `InterfaceName.method()`).
- Since **Java 9**, interfaces can have **private methods** (to reuse code inside default methods).
- Variables are **public, static, and final** by default.
- A class can **implement multiple interfaces**.

### ✅ Example
```java
interface Animal {
    void sound(); // abstract method
    default void eat() { // default method
        System.out.println("Animal is eating");
    }
    static void info() { // static method
        System.out.println("Animal Interface");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
        Animal.info();
    }
}
```
**Output:**
```
Dog barks
Animal is eating
Animal Interface
```

---

## ⚡ Difference Between Abstract Class & Interface

| Feature                  | Abstract Class | Interface |
|---------------------------|---------------|-----------|
| **Keyword**              | `abstract`    | `interface` |
| **Methods**              | Abstract + Concrete | Abstract (till Java 7), Default + Static (Java 8+), Private (Java 9+) |
| **Constructors**         | ✅ Yes | ❌ No |
| **Variables**            | Instance + Static | Public + Static + Final only |
| **Multiple Inheritance** | ❌ No | ✅ Yes |
| **Access Modifiers**     | Any (public, protected, private) | Only public |
| **Use Case**             | "Is-a" relationship, base class with partial implementation | 100% abstraction, contracts, multiple inheritance |

---

## 🎯 Common Interview Questions & Quick Answers

1. **Can an abstract class have a constructor?**
   - ✅ Yes, used for initialization when subclass object is created.

2. **Can an interface have a constructor?**
   - ❌ No, because it cannot be instantiated.

3. **Can an abstract class be final?**
   - ❌ No, because final classes cannot be extended, and abstract classes must be extended.

4. **Can an interface extend an abstract class?**
   - ❌ No, interfaces can only extend other interfaces.

5. **Can we create object of abstract class?**
   - ❌ No, but we can use **upcasting** (`Shape s = new Circle();`).

6. **Why use abstract class over interface?**
   - When you need **partial abstraction** + **code reuse**.

7. **Why use interface over abstract class?**
   - When you need **full abstraction** + **multiple inheritance**.

---

## 🔑 Tricks to Remember
- **Abstract Class** → Think "incomplete base class" → can have both declared & defined methods.
- **Interface** → Think "contract/blueprint" → everything must be implemented by the class.
- **Use Abstract Class** when: common state (fields) + behavior (methods).
- **Use Interface** when: only behavior, no state, and multiple inheritance needed.

---

## 📝 Mini Practice Q/A

### Q1: Can an abstract class have `main()` method?
✅ Yes, just like any normal class.

### Q2: Can an interface have variables?
✅ Yes, but they are implicitly `public static final`.

### Q3: Can we mark an interface as abstract?
❌ No need, because it's abstract by default.

### Q4: Can we create anonymous class of abstract class?
✅ Yes.
 
### Q : What is Anonymous inner class?
✅ We can not create object of abstract class to create object of abstract class we have 2 options either make a child class and create object of child class or we can create anonymous inner class.
```java
abstract class Vehicle {
    abstract void drive();
}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() {  // Anonymous inner class
            void drive() {
                System.out.println("Driving...");
            }
        };
        v.drive();
    }
}
```

---

## 🏁 Final Note
👉 Always use **abstract class** when you want to share common logic & state.  
👉 Always use **interface** when you want multiple inheritance or just a contract.

