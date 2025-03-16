# Lindrome
---
A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward and forward. [wikipedia](https://en.wikipedia.org/wiki/Palindrome) Since the name was to often used by many programmers, I decided to name it ***Lindrome***.

## Installation
---
Simply download the [zip](https://www.swisstransfer.com/d/e9eec0d4-0100-4166-967e-fd18b4d725e1) folder. 
* Under Windows
    1. Navigate to the "Download" folder and search for ==**Lindrome.zip**==
    2. Right-click the folder and select **"Extract all"**
    3. Follow the steps of the assistent
* Under Linux
    1. Simpy open a new terminal and navigate to "Downloads"
    2. Extract the zip folder with the command `unzip` ==**Lindrome.zip**== 
* Under macOS
    1. Navigate to the "Download" folder and search for ==**Lindrome.zip**==
    2. Double-click the ZIP file to extract it.

## Usage
---
Since my project is working with direct arguments (inputs) you need to use it with an terminal of your choice. Therefore, simply open the terminal inside your Code-Editor or the terminal provided by your operating system. 

To make sure what is meant with a palindrome, below is a list, which displays it. 
| input | Reversed input | Palindrome? |
| :-------: | :------------: | :-----------: |
| otto | otto | **yes**  
| 1991 | 1991 | **yes** 
| something | gnihtemos | **no** 

Now, if you want to try it out, follow these simple steps:
1. To begin with, you need to compile the java program. 
2. Then call it with the following syntax: `java Lindrome otto 1991 "evil olive" Something`
    * Note that you can input as many words as you want, it only has to be a *space* in between them.
    * You can also add a sentence like 'evil olive'.
3. The program will then check the words separately as well as display it in this way. 

You can find a short gif below, which shows you how to use my program:

![Test](https://s3.gifyu.com/images/bSJgW.gif)

## Code Explanation
---
1. **Main Method**
    In the main method, i defined a String[] variable "arguments". Then I created a for loop to iterate over the String[] args array, to gain access to the input from the user and to be able to use the method MakeLindrome(). 
2. **MakeLindrome Method**
    As you can see, I used regex to replace special characters with a blank space. I also created multiple char arrays, one for the original String and one for the modified String. This is why I set up to parameters for this method. In addition to this, I of course performed some Palindrome checks. And last but not least, I used the equals method to check if the two char arrays are equal. 
3. **loops Method**
    If the statement is true, it will continue the loop! This was an older version of my code, but you don't need it!

## Contributing
---
Thank you for your interest in my little project! This is an open-source project, and everybody is welcome to extend it, suggest new features, etc. Feel free to create a new Repository, new branches, etc. Don't forget to upload it again, so I can see it!

## About Me
---
👋 **Name:** Umejr Dzinovic
🎂 **Age:** 19
💻 **Hobby:** Coding

I am a passionate student at FH Joanneum, currently studying **Mobile Software Development**. This project was created as part of an exercise session in my course. I enjoy exploring new technologies and improving my skills in software development, especially in mobile applications, so I added a little spice to our exercise! 😉

Feel free to connect with me or check out my other projects! 

My GitHub profile: [GitHub](https://github.com/Umex10)
The universitys website: [FH](https://www.fh-joanneum.at)

1. [Exercise1](exercise1.md)
    * This includes some links and pictures as well as header. We trained our Markdown Syntax skills
2. [Exercise2](exercise2.md)
    * This includes some git commands with description, but also some pictures of git commands examples in the git bash CLI. 
3. [Exercise3](exercise3.md)
    * This includes my working flow with maven




