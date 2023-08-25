for i in range(5):
    num = int(input(f"Enter integer {i + 1}: "))
for j in range(i):
    if num == int(input(f"Enter integer {j + 1} again: ")):
        print("DUPLICATES")
else:
    print("ALL UNIQUE")
