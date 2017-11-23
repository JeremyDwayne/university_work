#include <iostream>

void print1(std::string s) {
  std::cout << &s << std::endl;
}

void print2(std::string *s) {
  std::cout << &s << std::endl;
}

void print3(std::string &s) {
  std::cout << &s << std::endl;
}

int main(int argc, char **argv) {
  std::string text = "This is a string!";
  std::cout << &text << std::endl;
  print1(text);
  print2(&text);
  print3(text);
  return 0;
}
