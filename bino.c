#include <stdio.h>

// Function to calculate the number of ways to distribute mangos
unsigned long long numway(int input1, int input2) {
    // Handle base cases
    if (input1 == 0 || input2 == 0) {
        return 1; // If no mangos or no persons, there's only one way (doing nothing).
    }

    // Initialize result
    unsigned long long result = 1;

    // Calculate binomial coefficient (input1 + input2 - 1) choose (input2 - 1)
    int n = input1 + input2 - 1; // Total items to choose from
    int k = input2 - 1;          // Number of partitions needed

    // Compute nCk using an iterative approach to avoid overflow
    if (k > n - k) {
        k = n - k; // Take advantage of symmetry property: C(n, k) == C(n, n-k)
    }
    int i;	
    for (i = 0; i < k; i++) {
        result *= (n - i);       // Numerator part of nCk
        result /= (i + 1);       // Denominator part of nCk
    }

    return result; // The binomial coefficient
}

int main() {
    int mangos, persons;

    // Taking inputs
    printf("Enter the number of mangos: ");
    scanf("%d", &mangos);
    printf("Enter the number of persons: ");
    scanf("%d", &persons);

    // Call the numway function and get the result
    unsigned long long ways = numway(mangos, persons);

    // Output the result
    printf("Number of ways to distribute %d mangos to %d persons is: %llu\n", mangos, persons, ways);

    return 0;
}
