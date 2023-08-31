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

Some example variables could be the stringTemplateLine(s) since they are variables assigned to the String class/data type, as well as ansGood,
ansBad, and likeaBoy. Others could be good, bad, or emotionalDamage which are assigned to the int, float, boolean and double class types, and the 
Scanner class type is included too.
Example values that could be assigned to these variables and class types could be changing up the answer section from 0 and 1 or 1 and 2 to random 
numbers that the person answering would then type in. Or increasing or decreasing the emotionalDamage or dEmotionalDamage. Could also 
change the String values to println whatever script preferred for the different stringTemplates.


The data types 
Next give TWO example variable names and TWO example variable assignments that are **WRONG** and explain why.
* Hint: your IDE can help you discover wrong assignments or variable names!

Two example variable names that are wrong would be attempting to assign a variable name that is a class/data type like "public", or "static". These 
would be wrong because these names are used in Java to be class/data types rather than variable names and would create a syntax error. 
Two example variable assignments that are wrong would be attempting to assign a floating point number to the int data type, as well as trying to assign 
a String variable to the int data type without trying to parseInt first to covert a String class type to an int class type. 

### Part 3 - Bonus: Play around with Java String Format Specifiers.

Pick several of the Java format specifiers below and define variables of the correct type utilize **sout** and **String.format** to view the resulting formats.

![Format Specifiers](JavaStringFormatSpecifiers.png)

%n is a format specifier that has no data type but acts as a line separator much like \n.
After assigning a String value using _String (variable name) = "Example string."_, can use %s to reference back to that string.
%B or %b directly references the boolean class type and the trueOrFalse variables.

### Part 4 - Submission
* Just as you did last week (Reference the Lab video in your Week 1 module), create a Feature1 branch of your code
* Commit your working code to your local copy
* Push it to your Remote/origin branch (i.e. GitHub: Feature1 -> origin/Feature1)
* Then issue a Pull request to my instructor branch
    * Make sure to **COPY** the Pull request URL and submit it for the lab/assignment.
