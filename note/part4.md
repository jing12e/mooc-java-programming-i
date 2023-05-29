Part4.1
===
Changing an instance variable's value in a method
---
add growOlder() method 

```java
public void growOlder() {
    this.age = this.age + 1;
}
```
Returning a value from a method
------
void - the method does not return a value 

the method below returns an `int` type variable of value 10
```java
public class Teacher {
    public int grade() {
        return 10;
    }
}
```
For the return value to be used, it needs to be assigned to a variable.
```java
public static void main(String[] args) {
    Teacher teacher = new Teacher();

    int grading = teacher.grade();

    System.out.println("The grade received is " + grading);
}
```
The return value could also be used to form part of an expression.
```java
public static void main(String[] args) {
    Teacher first = new Teacher();
    Teacher second = new Teacher();
    Teacher third = new Teacher();

    double average = (first.grade() + second.grade() + third.grade()) / 3.0;

    System.out.println("Grading average " + average);
}
```




