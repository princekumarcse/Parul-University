#3.A program that generates a random password of a specified length. 

import random 
length=int(input("Enter Password length: "))

chars = "abcdefghijklmnopqrstuvwxyz123456789"

password=""

for i in range(length):
    password += random.choice(chars)

print("Your Password is : ", password)