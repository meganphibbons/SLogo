# Adding In New Features - mep76


Planned feature to change: add a view that shows all turtle images and allows
the user to change the image when they click on a turtle. 

### Estimation:
**How Long It'll Take:**  
Personally, I think it'll take 45 minutes to an hour to make these changes
to SLogo. I would think it'd be shorter, but I am going to work on a
front-end feature instead of a back-end feature. This is for two reasons. 
The first is that I remember feeling like the Parser wouldn't actually
need to change if I added new commands. Additionally, I kind of want to
experience trying to make changes to others' code to see if I can figure out
what they did (and also if my teammates had as good of design that I thought).
**Note: I edited this slightly after I finished because I realized that I had
made a mistake. I thought that we had implemented the back-end commands 
already but when I went to test the commands, I realized that those 
commands are actually new and I was confused from reading about them in 
the properties files for parsing.**

**How Many Files Changes:**  
Because this is front-end and I worked on back-end, I'm not entirely sure
how many files will need to be changed. However, I anticipate that it will
be no more than two or three files, because it is a relatively small change
that is specific to the front-end.

### Review
**How Long It Took:**  
Honestly, this went by _significantly_ faster than I expected because we
had already implemented relatively similar functionality. When we were 
designing SLogo, we decided relatively early on that any buttons/commands
that were given to the turtle from means other than the text box (i.e.
clicking on a turtle to tell it to go right), we would send the command
through the parser to ensure that front-end and back-end were on the same
page. Additionally, we had already implemented the front-end extension of
allowing a view that can see all of the turtles (active or not) because
if a turtle is inactive, it still shows up on our palette, it just is
slightly smaller than the others. In all, it took me around 15 minutes
to run our code, figure out that I wanted to change the dropdown of the
turtle right-click, find the class that corresponded to the dropdown, and
modify it. 

**Files Changed:**  
I only actually needed to change one file, because the change was relatively
small based on our previous design. We already had the functionality of 
clicking on a turtle and also all of the turtles were always visible.
I just needed to add in another parameter to the ``contextSpecificCommandsWithInput``
variable that corresponded to the SLogo English command for changing 
the appearance (SetShape). In all, I actually only needed to change two
lines of code to do this extension.

**Completely Right:**  
I actually was completely right the first time around, just because it was
very simple to figure out exactly what I should be doing. Although I did 
not work on the front-end of SLogo, I still was able to navigate
the files fairly easily due to their use of packages. Additionally,
I didn't mess up the command name, because I was on Parser and very 
familiar with all of the names of the commands. That being said, I was
honestly still shocked when I opened up the environment and tested it and
it worked.

### Analysis
**As good/bad As I Remember:**  
Our code/design is definitely as good as I remember. My entire SLogo team
is on my VOOGA team, and we were all pretty excited about the extensions
because we knew we designed for them well. Going into the code, I could
navigate our repository pretty quickly with the help of modules and 
packages. Additionally, the fact that I only had to change two lines
to add in a new feature definitely solidifies the fact that we did a good
job designing this project.

**Improvements:**  
The only improvement I can think is possibly better naming for the classes.
Since this was a command relating to a turtle, I obviously opted to go 
to the Turtle package in the front-end module. However, I almost 
didn't look any further because I wasn't really sure what a ``SubContextMenu``
would be and there were some other classes for ``TurtleView`` objects.
On that note, although this is unrelated to the extension, I find it very
strange that we have a separate class for each turtle picture. This is not
sustainable at all, and I think it'd be better to have one class 
that can change views. But again, that's unrelated to the extension I worked
on. 

**If I wasn't familiar:**  
I think that if I wasn't familiar with our code (or our functionality) it
probably would have taken me longer. However, I think it may have still
been doable if I could realize that the code uses the parser and back-end
even when the text box isn't used. Additionally, I think our naming of 
modules and packages is pretty intuitive. If I was told to change something
about turtles in the front-end, I think it's fair to say that going to
the front_end module into the Turtle package is a pretty intuitive step to take.
