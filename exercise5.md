# Questions

## Why are logging libraries used?
    * We are using it, because it creates protocols about the code-execution. 
    * This helps wto idenify errors and to monitor the program
    * Log4j is one of the most popular Logger in java


## What log levels are available in Log4J and what do they mean?

We can use various level to define special problems. Thus, we can describe a problem with a level. 

| Level | Explanation | Example | 
| -------- | -------- | -------- | 
| `TRACE`   | Also Debug infos, but with more details | logger.trace("Detailed information") |
| `DEBUG`    | Debug infos, mostly used, but with less details | logger.debug("less detailed information") |
| `INFO`    | General information about status of sytem | logger.info("User has successfully loged in into system") |
| `WARN`     | recognizes potential danger. it warns you literally. | logger.warn("Application was started, but it didn't write into file") |
| `ERROR`    | protocols big errors, like database connection failed | logger.error("Database connection failed") |
| `FATAL`    | Critical Errors | logger.fatal("Exeption was not handled, shutting system down") |

## What configuration options does log4J provide?

   * It provides it as a .xml file
   * You could also use `Logger` with initializing a static logger object --> As well as `Appender` and `layouts`
   * This is only for the README.md, since we won't add `log4j2.xml` to the rep, but the `log4j2.xml.template` file 
   * As a `.properties` file
   






