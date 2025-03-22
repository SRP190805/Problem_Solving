#include <stdio.h>

void TwoSum(int a[], int n, int t) {
    int indices[2];
    for (int i = 0; i < n; i++) {
        for (int j = n - 1; j > i; j--) {
            if (a[i] + a[j] == t) {
                indices[0] = i;
                indices[1] = j;
                printf("[%d, %d]\n", indices[0], indices[1]);
                return;
            }
        }
    }
}

void mainFunction(int test) {
    while (test > 0) {
        int n;
        printf("Enter the number of elements: ");
        scanf("%d", &n);
        int arr[n];
        
        printf("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }

        int target;
        printf("Enter the target: ");
        scanf("%d", &target);

        TwoSum(arr, n, target);
        test--;
    }
}

int main() {
    int test;
    printf("Enter the number of test cases: ");
    scanf("%d", &test);
    mainFunction(test);
    return 0;
}
