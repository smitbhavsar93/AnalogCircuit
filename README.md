# AnalogCircuit
My final project for my first Java Course at Ryerson University and got to say, though it may not look the hardest or longest out of my entire repositories, trust me, it was.

An electric circuit will be described by the user. Each line will describe either a Resistor or a DC Voltage source or be a single word command.
The format for describing (for example) a 5.2 Ohm resistor connected between nodes 2 and 3 is:

r 2 3 5.2

The format for describing a 6.5 Volt source connected between nodes 1 and 2 (where the positive side of the source is connected to node 1) is:

v 1 2 6.5

A complete circuit could be described as follows:

v 1 0 2.0

r 1 2 0.25

v 2 0 3

r 2 3 0.5

r 3 0 1.0

end

To be correct, a circuit with n nodes must name the nodes 0, 1,...n-1. The order in which the components are described does not matter. For non-polarized components (such as a resistor), the order in which the nodes are named does not matter. For example,

r 1 2 0.25

is equivalent to:

r 2 1 0.25

For polarized components (such as a voltage source), the order does matter. Thus: v 1 0 2.0 is equivalent to: v 0 1 -2.0

In addition to lines describing the components of a circuit, there are 2 other single word commands that can be entered: spice and end.

The end is the simplest to understand and implement. When the end command is entered, the
program should print All Done and terminate.

The spice command should print the spice description of the circuit entered so far. In the spice
description, uppercase letters are used, components are numbered sequentially and DC is used in the
description of voltage sources. 

An example session follows (the lines in bold denote output from the program; the non-bold lines are input):

v 1 0 2.0

r 1 2 0.25

v 2 0 3

r 2 3 0.5

r 3 0 1.0

spice

V1 1 0 DC 2.0

R1 1 2 0.25

V2 2 0 DC 3.0

R2 2 3 0.5

R3 3 0 1.0

end

All Done

## How to run code
For this code to work, drag and drop the .java file into any java programming compiler, the code for us was written on a software called NetBeans 8.2.
And that's it! No really. That's it. If you want User Input, use the "UserMain.java" class, if you want the program to test itself, use the "JUnitTesting.java" class.

## NetBeans 8.2
This program was coded on Eclipse, to download NetBeans 8.2, visit : https://netbeans.org/downloads/old/8.2/ and download their latest release on your compatible device.
