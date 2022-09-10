#Loops allows us to write scripts that repeat loops.
# while loops / until loops / for loops

#while loop will loop or repeat your script over and over . As long as something is true.

x=1

while [[ $x -le 100 ]]  # -le means ,  x less than or equal 100.
do
    echo "Hey, you just did $x pushups"   # What's going to be looped is between do and done.
    (( x ++ )) # That's means = x + 1 so we increment the variable x by one ,each time it was run .
done # We must put those to close it out.
