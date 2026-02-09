# A program that checks if a given string is a palindrome 
# Examples of Palindrome words:
# madam
# level
# racecar


text= input("Enter a test: ")

if text== text[::-1]:
    print("Given text is Palindrome")
else: 
    print("Not a Palindrome")