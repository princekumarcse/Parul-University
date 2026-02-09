# A program that calculates the factorial of a numbers 

num= int(input("Enter a Number: "))

fact=1

for i in range(1, num+1):
    fact=fact*i

print("Factorial is: ", fact)