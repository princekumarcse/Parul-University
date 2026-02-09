# A program that checks if a given year is a leap year.

year= int(input("Enter a Year: "))

if(year %400==0) or (year%4==0) and (year %100 !=0): 
    print("It is a Leap year")

else:
    print("Not a leap year")