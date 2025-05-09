# Documentation

## New Maven Project

1. I've created a new maven project in the existing root folder from our previous homework. 

2. I've extracted the pom.xml file and the /src file from it, and moved it into the root folder. 

3. I've deleted the "Calculator" Folder, since I moved the necessary files into root folder

## New Class and new main

We needed to create a new Calculator.java file. I've added some basic arithmetic operations in form of methods to this file. The execution of these methods is done in main.java. 

### First question

```After the first execution, you should see an additional folder in your project folder in your project. Please document which new folder was created.```

**It is the ``/target`` folder.**

### Second - Screenshot of complete folder

![Screenshot](resources/images/ex3_1.png)


## New block in ***pom.xml***

Afterwards I needed to add some blocks in pom.xml to specify a dependency

1. New dependency. This was necessary, because we can now add a build-plugin

```
<dependencies>
    <dependency>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.13.0</version>
    </dependency>
</dependencies>
```

2. After we added the dependency, we can now add the new block as mentioned above

```
 <build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.13.0</version>
             <configuration>
                 <release>21</release>
            </configuration>
         </plugin>
     </plugins>
</build>
```

## mvn compile

After the insertion of the new blocks (dependency and build-plugin) we can now call ```mvn compile``` as command in CLI. 

###  Execute your main class / main method in the console.

Since we have not specified the main class inside pom.xml we neet to execute it manually: 

1. Create build/classes folder

``` 
mkdir -p build/classes
```

2. Compile all java files inside our package, and save the *.cllass files inside the new created folder build/classes

``` 
javac -d build/classes src/main/java/at/fhj/msd/*.java 
```

3. Execute main-class 

```
java -cp build/classes at.fhj.msd.Main
```

We have successfully executed main.java manually!

I will now ignore the folder ``/build``, since it was only needed for manually execution --> Added to ``.gitignore``

## Screenshot of gitbash with command ``mvn compile``

![Screenshot 2](resources/images/ex3_2.png)

### Appendix

Since i added the whole /src folder to repository, I forgot, that App.java was still inside it.

So I commited and App.java was a part of the repository. 

I've deleted App.java and used the following command:

```
git rm --cached src/App.java 
```

I did that also with AppTest.java

```
git rm --cached src/AppTest.java 
```

## New plugin in pom.xml with mainClass: Main

Added following plugin: 

```
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>exec-maven-plugin</artifactId>
    <version>3.0.0</version>
    <configuration>
        <mainClass>at.fhj.msd.Main</mainClass>
    </configuration>
</plugin>
```

Also added a new ``System.out.println()`` statement to Main.java

## Screenshot of gitbash with command ``mvn exec:java``

![Screenshot](resources/images/ex3_3.png)

I've already inserted a screenshot before this one, but I noticed that the screenshot doesn't look good. So I removed the ex3_3.png from repository and made a new Screenshot and added it to the repository.

I've used following commands:

```
git rm --cached pfad/zum/ex3_3.png
rm pfad/zum/ex3_3.png  #To delete the screenshot locally
```
    


