# Java-Lab-002

## Variables, Types and Operators

Be able to explain what variables are. Understand variable types, allowed names, and valid values.
Know how to create and use string, integer, floating-point, and boolean variables.

### Part 1 - LikeAGirl.java - [Like a Girl](https://www.youtube.com/watch?v=5yLXrWLvwAo)

The lab template contains a program that prints the following if you choose "0":
```
What does it mean to do something, "Like a Girl"?
Show me what it looks like to run, "Like a Girl."
Show me what it looks like to fight, "Like a Girl."
How do you think it affects them when somebody uses "Like a Girl" as an insult? Choice (good: 0, bad: 1) 0
You answered 0
Always wants to change that.
Emotional Damage 100.000000.
Did you answer like a nice person? FALSE
```
... OR the following if you choose "1":
```
What does it mean to do something, "Like a Girl"?
Show me what it looks like to run, "Like a Girl."
Show me what it looks like to fight, "Like a Girl."
How do you think it affects them when somebody uses "Like a Girl" as an insult? Choice (good: 0, bad: 1) 1
You answered 1
Good for you.
Emotional Damage 0.000000.
Did you answer like a nice person? TRUE
```

Ignore the code that you don't fully recognize and concentrate on changing the variables to alter the script to say the following if 1 is chosen:
```
What does it mean to do something, "Like a Boy"?
Show me what it looks like to run, "Like a Boy."
Show me what it looks like to fight, "Like a Boy."
How do you think it affects them when somebody uses "Like a Boy" as an insult? Choice (good: 1, bad: 2) 1
You answered 1
Good for you.
Emotional Damage 50.000000.
Did you answer like a nice person? TRUE
```
OR to say the following if 2 is chosen:
```
What does it mean to do something, "Like a Boy"?
Show me what it looks like to run, "Like a Boy."
Show me what it looks like to fight, "Like a Boy."
How do you think it affects them when somebody uses "Like a Boy" as an insult? Choice (good: 1, bad: 2) 2
You answered 2
Always wants to change that.
Emotional Damage 100.000000.
Did you answer like a nice person? FALSE
```

### Part 2 - Interpretation
Take note of the various variables and their data types. Write a brief summary in this section of the README.md file listing the:
* Variable name
* Its data type
* and example values you can assign them.

Variable Name: good, emotionalDamage, trueOrFalse

Its data type: 

good: integer data type

emotionalDamage: float data type

trueOrFalse: boolean data type

Example values you can assign them: 

good: I assigned 1 since it is an integer data type 

emotionalDamage: I assigned 100.0f since it is a float data type

trueOrFalse: true or false 

Next give TWO example variable names and TWO example variable assignments that are **WRONG** and explain why.
* Hint: your IDE can help you discover wrong assignments or variable names!

int hour: 7.5;  this is wrong because integers can only be whole numbers. 

double y = 2/8; a common mistake, the assignments are integers instead they should be
2.0 and 8.0, assign floating-point values to floating-point variables always. 

### Part 3 - Bonus: Play around with Java String Format Specifiers.

Pick several of the Java format specifiers below and define variables of the correct type utilize **sout** and **String.format** to view the resulting formats.

![Format Specifiers](JavaStringFormatSpecifiers.png)

### Part 4 - Submission
* Just as you did last week (Reference the Lab video in your Week 1 module), create a Feature1 branch of your code
* Commit your working code to your local copy
* Push it to your Remote/origin branch (i.e. GitHub: Feature1 -> origin/Feature1)
* Then issue a Pull request to my instructor branch
    * Make sure to **COPY** the Pull request URL and submit it for the lab/assignment.
