# Errors and Exception Handling

* ### *What is an exception?*
An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions (oracle.com).

* ### *How to catch an exception?*
In order to catch an exception (in both languages) you can do the following (according to tutorialspoint.com):

+ try: A try block identifies a block of code for which particular exceptions is activated. It is followed by one or more catch blocks.

+ catch: A program catches an exception with an exception handler at the place in a program where you want to handle the problem. The catch keyword indicates the catching of an exception.

+ finally: The finally block is used to execute a given set of statements, whether an exception is thrown or not thrown. For example, if you open a file, it must be closed whether an exception is raised or not.

+ throw: A program throws an exception when a problem shows up. This is done using a throw keyword.

* ### *Exception Hierarchy:*
If a super class is mentioned in a catch before a subclass of an exception, then it will always occurs (which makes deciding specifically the problem or the exception harder if you want to know excatly what happened). That is why you try to mention the subclass before the superclass. 


---
[Home](../README.md)


