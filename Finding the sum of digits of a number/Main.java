#include <stdio.h>
int main() {
  long num, temp, digit, sum = 0;
    scanf("%ld", &num);
    temp = num;
    while (num > 0)
    {
        digit = num % 10;
        sum  = sum + digit;
        num /= 10;
    }
    printf("%ld", sum);
  return 0;
}