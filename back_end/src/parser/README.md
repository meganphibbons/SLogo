### Design Idea
Our team decided to split this project up into front-end and back-end. Within
back-end, we split up parsing user input and executing commands. I chose to work 
on parsing user commands by implementing my own parser and text validator. 
We were not provided any guidance on how to make a working parser, so I was also
responsible for creating a strong design.

One of the primary properties of the Logo language is that every single 
command outputs a numerical value. Therefore, any command can be used as a 
parameter in another command. Because of this, my primary focus was on recursively
building a data structure to store this information. Initially, I decided that parsing
user input would return a single CommandNode with children nodes representing
input values. However, I realized that this would not take into account sequential
commands. Therefore, I finally decided to create a list of CommandNodes, each
of which was the head of its own parse tree. Further details on the data structure
and algorithm can be found below. 

### Main Data Structure
As mentioned above, the parser returns a list of CommandNode objects. Each 
CommandNode is the head of its own command tree. Any children that the CommandNode has 
represent nested commands or argument parameters. Ultimately, I chose this data
structure because I felt that it was most intuitive for the structure of 
Logo commands. Each command can have >= 0 parameters, some of which 
can be functions. Therefore, a tree of CommandNodes is perfect because it allows
variable numbers of child nodes. Additionally, it can be executed recursively, 
which allows nested commands to be processed in the correct order without 
needed to store additional information. 

To understand the way the parse tree I created works, let's use an example.  
Input: 
```
forward sum 5 sum 10 sum 20 sum 1 1
right 90
```
This is a completely valid input to a SLogo program. The result of this call would be the turtle moving forward by 37 then turning right.
When running this command through the parser, it will return a list of 
two CommandNodes, each of which is the head of its own tree. To visualize the tree created by my parser, I 
have included a graphic below. My code generates this tree, while the code under back_end/src/nodes handles
executing the commands themselves. Note that I did not write the execution code, but I did create the 
data structure for storing the commands and write the code that calls the 
`.evaluate()` method on the root node of each command.
![](doc/Parse_Tree_Example.png) 

### Algorithm Information
I specifically chose to use recursion to build and parse this tree because 
nested commands are very common in SLogo. Because the parameters to a command
can be one or more commands as well, it is important to inherently develop
a structure that can handle nested commands. 

In this code, I use indirect recursion in the method `Parser.makeNodeTree()`. This
method calls `Parser.addChildren()`, which then calls `Parser.addChild()`, which finally calls `Parser.makeNodeTree()` again. 
This continues until there are no longer nested commands to continue reading, in which case
a new root node is created for the next sequential command. This way, each 
parameter added to a command has the potential to be a command of its own. In 
calling `Parser.makeNodeTree()`, I ensure that all of the necessary parameters for 
nested commands get created as well. 

The parsing itself happens from left to right in terms of the text input
by the user. In doing research on parsing algorithms after the fact,
I believe this is a recursive descent parser, which is typically not very 
efficient. In order to save on time complexity, I could increase the space
complexity slightly and create some memoization based on previous commands and
their parameters. Additionally, there are other more efficient parsing algorithms
that are more difficult to implement. With more time, I would look into alternative 
approaches. However, I do want to emphasize that I developed this algorithm 
without any research into parsing algorithms. While it is not the most efficient, it is
an algorithm that I designed almost entirely independently. 