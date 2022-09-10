#!/bin/bash
echo "Do you like coffee ? (y/n)"

read coffee

if [[ $coffee == "y" ]] ; then
       echo "You are awesome"
else
    echo "leave right now"
fi
