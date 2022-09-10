#!/bin/bash

date=$(date)

echo "Bonjour, Pourriez-vous ecrire a votre nom svp"

sleep 1 

read nom

echo "Ohh merci, Aussi ecrivez-vous votre age svp"

sleep 1

read age

echo "Le système démarre"

echo "..."

sleep 2

echo "......"

sleep 1

echo "........."

sleep 3

echo "Re-bonjour, Vous etes $nom et , Vous avez $age ans. !"

echo "$RANDOM , $USER, $HOSTNAME, $PWD, $SHELL" #Linux built-in variables.

# $RANDOM its generate random number between 0-32767.

sleep 2

echo "$date"

echo "$uni"
echo "$twitter"

# uni="hesso-valais" Like that we can set our variables in linux.After to show it we can write echo "$uni" command.
# We have convert him into a full blown environment variables for use sh files or child processes.
# For this we can use <export uni> command.
#.bashrc file = our logon script .Yani log-in oldugumuzda calisacak seyler gibi bisi.
#Set edilen variablelarin logout olduktan sonra gitmemesi icin .bashrc file icine kaydedilmesi <export uni="HES-SO VALAIS"> gerekir.
#So we made our variables as permanent. :)
