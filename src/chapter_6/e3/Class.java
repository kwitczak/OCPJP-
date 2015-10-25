class Class{
public static void main(String args[]){
char a = 'a';
switch (a){
case 'b':
	System.out.println("b");
	break;
case Character.MAX_VALUE+1:
	System.out.println("many");
	break;
case "c":
	System.out.println("many");
	break;
default: {System.out.println("df");}
}
}
}
