#!/bin/bash

#First beast battle

echo "Welcome tarnished. Please select your class :
1 - Prisoner
2 - Samurai
3 - Prophet"

read class

case $class in
        1)
            type="Prisoner"
            hp=20
            attack=4
            ;;
        2)
            type="Samurai"
            hp=12
            attack=14
            ;;
        3)
            type="Prophet"
            hp=30
            attack=4
            ;;
esac

echo "You have chosen $type class. Your HP is $hp and your attack is $attack."
gamer="unal" #variable=value assigning.. for use second part

beast=$(( $RANDOM % 2 ))

echo "Your first beast approaches . Prepare to battle . Pick up a number between 0-1 (0/1)"

read tarnished

# We can do more than just equals and we can use < > <= >= etc.
if [[ $beast == $tarnished && 47 > 23 ]] ; then # && means both have to be true ,so two things (conditionals) evaluated
    echo "Beast VANQUISHED!! Congrat fellow tarnished "
else
    echo "You died"
    exit 1 # Burasi calisirsa yani contionnal false verirse geri kalan bloklar calismaz.
fi

echo "Waiting for next level"
sleep 1
echo "..."
sleep 1
echo "*.."
sleep 1
echo "**."
sleep 1
echo "***"

echo "Who are you, write your gamer name !!!"
# username=$1 # we can do with Positional argument but if use this we have to write < ./eldenring.sh Bernard ? command to win.
read gamer



echo "Boss battle. Get scared. It's MARGIT. Pick up a number between 0-9 (0-9) "

margit=$(( $RANDOM % 10 ))

read tarnished

if [[ $margit == $tarnished || $tarnished == "coffee" ]] ; then # || means if either those are true , the do this ..
    if [[ $USER == "root" ]] ; then #nested if
        echo "Beast VANQUISHED!! Congrat fellow tarnished"
    elif [[ $gamer == "unal" ]] ; then #If the if blog is not correct/true, this will work, so we gave the user a second chance.
        echo "Heyy $gamer welcome eldenring games, You can always win here"
    else
        echo "You can't win man , for the win you have to root and unal"
    fi
else
    echo "You died"
    exit 1
fi

