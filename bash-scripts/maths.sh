#!/bin/bash

echo "Heyy guys write your age ; "

read age

getrich=$((($RANDOM % 15) + $age ))

sleep 1

echo "Calculating time, waiting pls"

sleep 2

echo ".........."
sleep 1
echo "*........."
sleep 1
echo "**........"
sleep 1
echo "***......."
sleep 1
echo "****......"
sleep 1
echo "*****....."
sleep 1
echo "******...."
sleep 1
echo "*******..."
sleep 1
echo "********.."
sleep 1
echo "*********."
sleep 1
echo "**********"

sleep 1

echo "Calculated"


echo "You are gonna become a millonaire at $getrich age ."

#math expression  $(( 4+4 )) seklinde yapiliyor.
