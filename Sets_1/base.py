# A program that converts given number from one basde to another base 
num= input("Enter number")

base=int(input("Enter Base"))

to_base=int(input("Enter target"))

decimal= int(num, base)

if base==2:
    print(bin(decimal))

elif base==8:
    print(oct(decimal))

elif base== 10:
    print(decimal)

elif base==16:
    print(hex(decimal))