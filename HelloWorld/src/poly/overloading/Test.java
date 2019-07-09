package poly.overloading;
class A
{
	static void add() {
		System.out.println("default method");
	}
	static void add(int a, int b) {
		System.out.println("add of two:"+(a+b));
	}
	static void add(float a, float b) {
		System.out.println("add of two:"+(a+b));
	}
	static void add(int a, float b) {
		System.out.println("add of two:"+(a+b));
	}
	static void add(float a, int b) {
		System.out.println("add of two:"+(a+b));
	}
}
class Test {
 public static void main(String[] args)
 {
	 A.add();
	 A.add('a','b');
	 A.add(12.123f,20.12f);
	 A.add(12.9f,20);
	 A.add(12,20.14f); }
}
