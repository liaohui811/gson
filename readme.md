# Gson

Gson is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object.
Gson can work with arbitrary Java objects including pre-existing objects that you do not have source-code of.

There are a few open-source projects that can convert Java objects to JSON. However, most of them require that you place Java annotations in your classes; something that you can not do if you do not have access to the source-code. Most also do not fully support the use of Java Generics. Gson considers both of these as very important design goals.

### Goals
  * Provide simple `toJson()` and `fromJson()` methods to convert Java objects to JSON and vice-versa
  * Allow pre-existing unmodifiable objects to be converted to and from JSON
  * Extensive support of Java Generics
  * Allow custom representations for objects
  * Support arbitrarily complex objects (with deep inheritance hierarchies and extensive use of generic types)

### Download

Gradle:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}



dependencies {
    implementation 'com.github.meyoustu:gson:2020.6.10.2122'
}
```

Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>




<dependency>
    <groupId>com.github.meyoustu</groupId>
    <artifactId>gson</artifactId>
    <version>2020.6.10.2122</version>
</dependency>
```
