#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *itoa(int n){
  return strcat("", *n);
}

int main(int argc, char **argv){
  printf("%s", itoa(724));
  return 0;
}
