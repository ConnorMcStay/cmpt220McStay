
public class TenPointThree {

	 public static void main(String[] args) {
		 
	myInteger int1 = new myInteger(15);

    myInteger int2 = new myInteger(10);

    myInteger int3 = new myInteger(60);

    myInteger int4 = new myInteger(42);



    System.out.printf("15 is prime? %s%n", int1.getValue(), int1.isPrime());

    System.out.printf("10 is prime? %s%n", int2.getValue(), int2.isPrime());

    System.out.printf("60 is prime? %s%n", int3.getValue(), int3.isPrime());



    System.out.printf("15 is even? %s%n", int1.getValue(), int1.isEven());

    System.out.printf("10 is even? %s%n", int2.getValue(), int2.isEven());

    System.out.printf("60 is even? %s%n", int3.getValue(), int3.isEven());



    System.out.printf("60 is odd? %s%n", myInteger.isOdd(93));

    

    System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));



    System.out.printf("%d%n", myInteger.parseInt(new char[] {'9', '1', '3'}));

    System.out.printf("%d%n", myInteger.parseInt("454"));

}

}

 