import re

def main():
    s = input("Enter a string: ")
    unique_chars = []
    
    for char in s:
        if char not in unique_chars:
            unique_chars.append(char)
    
    # Check if the string contains at least one alphanumeric character
    if re.search("[a-zA-Z0-9]", s):
        return len(unique_chars)
    else:
        return 0  # If no alphanumeric characters, return 0

print(main())
