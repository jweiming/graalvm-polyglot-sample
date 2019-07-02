# 1. Creating a simple polyglot application on GraalVM

Learn how to create a simple polyglot application on GraalVM. In this example, your will be embedding guest languages (Ruby, Python and JavaScript) into the Java application.

### 1.1 What you will need

To complete this example, you will need the following:

- Some time on your hands
- A decent text editior or IDE
- GraalVM ([Installation guide](https://www.graalvm.org/docs/getting-started/))

### 1.2 Verify GraalVM installation

Once you are done with the installation, the PATH environment variables should be set properly, you can check the JVM
```
$ java -version
java version "1.8.0_212"
Java(TM) SE Runtime Environment (build 1.8.0_212-b31)
Java HotSpot(TM) 64-Bit GraalVM EE 19.0.2 (build 25.212-b31-jvmci-19-b04, mixed mode)

$ node -v
v10.15.2

$ lli --version
LLVM (GraalVM EE Native 19.0.2)
```

### 1.3 Install guest languages

Java runs the JVM with GraalVM's default compiler. The Ruby, Python executables become available only if you install the corresponding language engines. For this example, you need to install Ruby and Python.
```
$ gu install ruby
$ gu install python
```

### 1.4 Compiling and running the example

Once you have the above configured and set up, you are ready to compile and run the Java class as you would on a familiar Hotspot JVM.

```
$ javac polyglotAbs.java
$ java polyglotAbs

This polyglot example runs abs functions.
running abs in JavaScript!
42
running abs in Python!
42
running abs in Ruby!
42
```

### 1.5 References

- https://www.graalvm.org/docs/reference-manual/embed/
- https://www.graalvm.org/docs/getting-started/
- https://guides.micronaut.io/micronaut-creating-first-graal-app/guide/index.html
