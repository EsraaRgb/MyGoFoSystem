# MyGoFoSystem
this is a System for booking a playground for players and Owners
-GoFoSystem --> contain all project files, classes, source code, and java doc file
 -src--> contain implementaion code for our system GoFo which consists of 9 files, 8 classec and a main class
	JavaDoc--> contain java documentation files for all packages and classes with information about authors.
	GitHub evidance--> contain screenshots to show our collaporates on github. 
	-Tools --> 
		-intellij IDE--> used for implementing  java code and generating javaDoc.
		-lucidchart--> used to design calss diagrams and sequence diagrams. 
			  visial-paradigm --> used to design state diagram.
CS251-2021-S22-Eptehal Nasser-20190090-FinalGoFoSDSv0.0.pdf --> a pdf contain SDS diagrams such as class diagrams, sequence diagrams, and state diagram for playground.

-classes description-->
    -Class person --> contain all information for any user on the system.
     -Class Player --> inehrits from class person to contain information about players in the system, and some extra methods to book a playground.
     -Class owner --> inehrits from class person to contain information about Owners in the system, and some extra methods to register his playground.
     -Class Playground is for input a playground into a system and input his info and waiting for activation from administrator.
     -Class booking --> contain information about each booking in the system,who is the player booked, which playground, and who is the owner.
     - class TimeSlot --> conatin information about the timeslot which had booked by the player.
     - class GoFo --> conatin arraylists for all players, owners, and playeground on the system to control the process of login and signup and booking.
     - main calss --> allow us to use the system correctly and do many operations like sign in , signup, serch for playground, and book a playground.

