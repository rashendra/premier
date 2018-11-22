# Service Victoria Coding challenge
This is the solution for the coding challenge given by Service Victoria 

## Pre-requisites

JDK 1.8.x 

Technologies/ Libraries used

    Java 8
    Spring boot
    Mockito
    AssertJ
    Gradle wrapper 
    
## How to run the application 

Go to the project root directory and run following commands
###### To build the application
    ./gradlew build    or just gradle build
    
once build, execute the main method of 
com.example.premier.premier.PremierApplication.java. That will prompt 
below allowing user to set value for K and N 

    Enter the list of share prices below ( Cmd + d / Ctrl+ d to exit)
    Enter value for K :
    Enter number of children (n) :


User should enter a valid values for the K and N. No validations has been applied in this scenario.
# Data structures used 
    In the example I have used a simple List to hold the children. 
    I have used a model Child, only to hold an id and a name. This can be eliminated and reduced 
    for a List<Integer> to improve memory. 

# Runtime order complexity 
    The above progarm will loop exactly n-1 times until there is only one element/child left in the list. 
    Main benefit would be, regardless of the value we set for K, this will not loop more than n-1 times.
    So the run time compleplexity for this would be O(n-1) when n is the number of children.
    This program would, calculate the number of shifts required in the ArrayList and will eliminate the designated element 
    without iterating over all the element.
    This will benefit specially when the value for K is much larger than n 


## Further enhancements 
    Initially , this application design to be run as a web application with a RestApi 
    exposed to receive values for the K and N and return the winning child/element
    Test coverage for the Child object.

 
 