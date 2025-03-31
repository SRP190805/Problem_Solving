#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char s[100];
    int unique_chars[256] = {0};  // ASCII array to track unique characters
    int count = 0;
    int has_alnum = 0;

    printf("Enter a string: ");
    fgets(s, sizeof(s), stdin);  // Read input with spaces

    for (int i = 0; s[i] != '\0' && s[i] != '\n'; i++) {
        if (!unique_chars[(unsigned char)s[i]]) {
            unique_chars[(unsigned char)s[i]] = 1;
            count++;
        }
        if (isalnum(s[i])) {
            has_alnum = 1;
        }
    }

    printf("%d\n", has_alnum ? count : 0);
    return 0;
}
