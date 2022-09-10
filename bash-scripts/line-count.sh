#!/bin/bash

x=0

# This while loop literally go through each  line by line and echo  "Line $x $line" it out.
# And as long as there's a line to read which is what that condtion is saying ,it'll go through it all.

while read -r line ; # read -r Do not treat a backslash character in any special way. Consider each backslash to be part  of  the  input line.
do
    echo "Line $x $line" # $line ile dosya icinde x'in karsilik geldigi satiri alacak.Mesela ilk basta x=0 oldugu icin x file ilk satirini alacak.Ouput'u incelersin.
    (( x ++ ))
done < /home/ubuntu/.bash_logout # Bir tane dosya path'i yaz.