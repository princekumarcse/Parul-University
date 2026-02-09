#1 A program that convcerts temprature from fehrenheit to celcious and vice versa

print("Enter 1 for Celsious to Ferenhite")
print("Enter 2 for Ferenhite to Celsious")

choice=int(input("Enter your Choice 1 or 2: "))

if(choice==1):
    c=float(input("Enter temprature in celsious:"))
    f = (c * 9/5) + 32 # formula to convert c to f
    print("Temprature in Ferenhite is: ",f)

elif(choice==2):
    f=float(input("Enter temprature in Ferenhite: "))
    c=(f - 32) * 5/9
    print("Temprateure in Celsious is: ",c)

else:
    print("Invalid Choice")
