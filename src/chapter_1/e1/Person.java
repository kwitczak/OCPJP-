package e1;

// Tests legal Identifiers for class members
class Person {
  int age;
  int _age;
  int $age;
  int a1ge;
  int _;
  int $;
  int $1;
  int _1;
  int __________1;
  int _$_$_$_$_; 
  Person(){
    System.out.println("New Person created!");
  }
}
