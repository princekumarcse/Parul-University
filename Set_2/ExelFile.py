import openpyxl

# Function to read and display Excel data
def read_excel(filename):
    try:
        # Load the Excel file
        workbook = openpyxl.load_workbook(filename)
        sheet = workbook.active   # Get the active sheet

        print("\nData in Tabular Format:\n")

        # Read and print each row
        for row in sheet.iter_rows(values_only=True):
            for cell in row:
                print(cell, end="\t")
            print()  # New line after each row

    except FileNotFoundError:
        print("File not found! Please check the file name.")
    except Exception as e:
        print("Error:", e)

# Main Program
filename = input("Enter Excel file name (example: data.xlsx): ")
read_excel(filename)
