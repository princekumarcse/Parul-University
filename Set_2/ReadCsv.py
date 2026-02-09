import csv

# Function to calculate average
def calculate_average(filename, column_name):
    try:
        total = 0
        count = 0

        # Open the CSV file
        with open(filename, "r") as file:
            reader = csv.DictReader(file)

            # Read each row
            for row in reader:
                value = float(row[column_name])  # Convert to number
                total += value
                count += 1

        # Calculate and print average
        if count > 0:
            print("Average of", column_name, "=", total / count)
        else:
            print("No data found in the column.")

    except FileNotFoundError:
        print("File not found! Please check the file name.")
    except KeyError:
        print("Column not found! Please check the column name.")
    except ValueError:
        print("Column contains non-numeric values.")

# Main Program
filename = input("Enter CSV file name (example: data.csv): ")
column_name = input("Enter column name to find average: ")

calculate_average(filename, column_name)
