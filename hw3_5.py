items = {}

item1_name = input("Enter Item 1 Name: ")
item1_price = float(input("Enter Item 1 Price: "))
items[item1_name] = item1_price

item2_name = input("Enter Item 2 Name: ")
item2_price = float(input("Enter Item 2 Price: "))
items[item2_name] = item2_price

tax_rate = 10
total_price = sum(items.values())
tax = total_price * tax_rate / 100
total_bill = total_price + tax

print("\nBill Details:")
for item, price in items.items():
    print(item,price)

print("Total ", total_price)
print("Tax (at", tax_rate, "%)", tax)
print("Total Bill: ", total_bill)
