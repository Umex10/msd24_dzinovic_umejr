# Questions

## What is required to generate Maven Site documentation?

The plugin for maven site, which generates the HTML files.

```xml

           <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-site-plugin</artifactId>
               <version>3.12.1</version>
           </plugin>

```

But also these plugins:

```xml
           <!-- new reporting block in pom.xml -->
           <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-project-info-reports-plugin</artifactId>
               <version>3.5.0</version>
           </plugin>

           <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-site-plugin</artifactId>
               <version>3.12.1</version>
           </plugin>
```

You could of course also implement other plugins, which could be very efficient. For example you could build the src/site/ folder to convert given files to HTML, if needed. But the section above is enough to generate a Maven Site Documentation.

## What different aspects, configurations, information, etc., are configured in site.xml and pom.xml?

### `pom.xml`

In the `pom.xml` file, we define various aspects of the build process, including dependencies, plugins, and other configurations that dictate how the project will be built and tested. For this exercise, we need to configure several needed sections to integrate tools like **Javadoc** and **JaCoCo**:

#### Key Sections in `pom.xml`

1. **Javadoc Configuration**
   The `javadoc` plugin is included in the `pom.xml` to generate API documentation from the `/** */` comments in our Java classes (e.g., `Calculator` class). The plugin makes it easier for other developers to navigate and understand the code by providing well-structured HTML documentation.

   Example configuration for `Javadoc`:

   ```xml
    <!-- Java Doc within Maven Site Documentation -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <!-- Disable JavaDoc warnings -->
                    <additionalJOption>-Xdoclint:none</additionalJOption>
                </configuration>
            </plugin>
   ```

2. **Jacoco Configuration**
   The `jacoco` plugin is also included in pom.xml. `jacoco` is used for monitoring the test results when you use `mvn clean test`, which deletes all folder and files which were generated before and runs the test afterwards. If you now included a build section in pom.xml, it will convert the test coverage into a html file, which is also readable on the Maven Site Documentation.

   Example configuration for `jacoco`:

   ```xml
    <!-- Test Coverage from JaCoCo Plugin integration in Maven Site Documentation -->
           <plugin>
               <groupId>org.jacoco</groupId>
               <artifactId>jacoco-maven-plugin</artifactId>
               <version>0.8.12</version>
               <reportSets>
                   <reportSet>
                       <reports>
                           <!-- select non-aggregate reports -->
                           <report>report</report>
                       </reports>
                   </reportSet>
               </reportSets>
           </plugin>
   ```

#### Key Sections in `site.xml`

When you look down below, you will see an example for a site.xml.
Now if you run mvn site again, it will generate these html files and uploud it also onto the maven site documentation.

Example configuration:

```xml
<project name="Calculator">
    <publishDate position="right"/>
    <version position="left"/>
    <body>
        <menu name="Overview">
            <item name="Introduction" href="index.html"/>
            <item name="GoodStyle" href="good_style.html"/>
        </menu>
        <menu ref="reports"/>
    </body>
</project>

```
