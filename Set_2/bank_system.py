# Customer Class
class Customer:
    def __init__(self, customer_id, name): #self means current object  
        self.customer_id = customer_id # stores cx id 
        self.name = name # stores cx name 

    def display_customer(self):# calling same funtion 
        print("Customer ID:", self.customer_id)
        print("Name:", self.name)


# Account Class
class Account:
    def __init__(self, account_number, customer, balance=0):
        self.account_number = account_number
        self.customer = customer
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print("Deposited:", amount)
        else:
            print("Invalid deposit amount")

    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient balance")
        elif amount <= 0:
            print("Invalid withdrawal amount")
        else:
            self.balance -= amount
            print("Withdrawn:", amount)

    def display_account(self):
        print("\nAccount Number:", self.account_number)
        self.customer.display_customer()
        print("Balance:", self.balance)


# Bank Class
class Bank:
    def __init__(self, bank_name):
        self.bank_name = bank_name
        self.accounts = []

    def create_account(self, customer, account_number, initial_balance=0):
        account = Account(account_number, customer, initial_balance)
        self.accounts.append(account)
        print("\nAccount created successfully!")
        return account

    def display_all_accounts(self):
        print("\nBank Name:", self.bank_name)
        for account in self.accounts:
            account.display_account()


# Main Program
bank = Bank("Tech Bank")

# Take Customer Details
cust_id = int(input("Enter Customer ID: "))
cust_name = input("Enter Customer Name: ")

# Create Customer
customer1 = Customer(cust_id, cust_name)

# Take Account Details
acc_number = int(input("Enter Account Number: "))
initial_balance = float(input("Enter Initial Balance: "))

# Create Account
account1 = bank.create_account(customer1, acc_number, initial_balance)

# Perform Operations
deposit_amount = float(input("Enter amount to deposit: "))
account1.deposit(deposit_amount)

withdraw_amount = float(input("Enter amount to withdraw: "))
account1.withdraw(withdraw_amount)

# Display Details
bank.display_all_accounts()

