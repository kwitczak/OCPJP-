class Person{
static{System.out.println("Im first");}
public static void main(String[] args){System.out.println("Im second"); Person p = new Person();}
{System.out.println("Im third");}
}
