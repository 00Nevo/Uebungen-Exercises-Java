Learn Java the Easy Way
A Hands-On Introduction to Programming

Introduction
Why Should I Learn to Code?
Why Should I Learn Java?
What’s in This Book?
What Tools Do I Need?
Online Resources
Start Now!

1
Getting Started
Java on Windows, macOS , and Linux
Installing Java 8 and 9 for Developers
Installing the Eclipse IDE for Java Developers
Setting Up Eclipse
Installing the WindowBuilder Editor
Customizing Eclipse’s Look and Feel
Installing Android Studio for Mobile App Development
Getting to Know Java with JShell
Running JShell

// why are comments not working!?
/* test test test
*/

btw. starting from command line the java program is much shorter:

jshell> System.out.println("Hello, Java!")

instead doing this on exercism it was much longer:

public class Greeter {

    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
    }
}


Running JShell from the Command Line
Running JShell from a Shortcut
Working with Java Expressions in JShell
Declaring Java Variables in JShell
Numeric Variables
String Variables
Printing Output in Java
JShell Commands
What You Learned

2
Build a
Hi -Lo Guessing Game App!

