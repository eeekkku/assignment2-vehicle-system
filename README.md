# assignment2-vehicle-system

# project overview

This project shows basic object-oriented programming concepts: inheritance, abstraction, composition, and aggregation.
It allows creating different vehicles and assigning drivers to them. All vehicles share common properties and methods from the Vehicle class.
(inheritance, abstraction). Each vehicle has a driver, and one driver can drive several vehicles.(composition, aggregation)

# class hierarchy 

The main class is Vehicle with fields brand, year, and driver.
It has abstract methods startEngine() and stopEngine(), and a concrete method displayInfo() to show vehicle and driver info.

Subclasses:

Car has doors and fuel type;
Motorcycle has a field for a sidecar;
TRuck has capacity and number of axles;
Bicycle has a field for gears;
Electric scooter has battery capacity and maximum speed.

Each subclass overrides startEngine() and stopEngine() to show its own messages.

# instructions to compile and run

1. open terminal in the folder with all .java files;
2. compile: javac *.java ;
3. run: java Main .

# screenshots

They are in the "docs".

# reflection

Inheritance made it easier to write the code because all vehicles share the same basic fields and methods.
Overriding startEngine() and stopEngine() lets each vehicle type show its own messages.
Using protected fields helped subclasses access data without making everything public, 
but sometimes it was tricky to decide which access level to use.

