#Loops allows us to write scripts that repeat loops.
# while loops / until loops / for loops

#while loop will loop or repeat your script over and over . As long as something is true.

#!/bin/bash
x=1 # we create a counter for while loop.

while [[ $x -le 10 ]]  # -le means ,  x less than or equal 100.
do
    read -p "Pushup $x : Press enter to continue " # -p prompt output the string PROMPT without a trailing newline before attempting to read
    (( x ++ )) # That's means = x + 1 so we increment the variable x by one ,each time it was run .

done # We must put those to close it out.

echo "Congrats, you completed your pushups."
