# Function to count words in a file
def count_words(filename):
    try:
        with open(filename, "r") as file:
            text = file.read()
            words = text.split()
            print("Total number of words:", len(words))
    except FileNotFoundError:
        print("File not found! Please check the file name.")

# Main program
filename = input("Enter the file name (example: data.txt): ")
count_words(filename)
