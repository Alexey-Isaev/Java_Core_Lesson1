package Domen.Alex;

public class app {
	public static void main(String[] args) {
		
		
		
		
				//задание 1
		
				boolean bo = true;
				char c = 'F';
				byte by = 22;
				short s = 10;
				int x = 12;
				long l = 15L;
				float f = 10.34F;
				double d = 12.43D;
				
				
				
				
				

				//задание 2
				
				System.out.println("Boolean не имеет минимального или максимального значения. его значения только: true и False");
				
				System.out.println("Character = "+ (int)Character.MAX_VALUE);
				System.out.println("Character = "+ (int)Character.MIN_VALUE);
				
				System.out.println("Byte = "+ Byte.MAX_VALUE);
				System.out.println("Byte = "+ Byte.MIN_VALUE);
				
				System.out.println("Short = "+ Short.MAX_VALUE);
				System.out.println("Short = "+ Short.MIN_VALUE);
				
				System.out.println("Integer = "+ Integer.MAX_VALUE);
				System.out.println("Integer = "+ Integer.MIN_VALUE);
				
				System.out.println("Long = "+ Long.MAX_VALUE);
				System.out.println("Long = "+ Long.MIN_VALUE);
				
				System.out.println("Double = "+ Double.MAX_VALUE);
				System.out.println("Double = "+ Double.MIN_VALUE);
				
				
				
				System.out.println();
				System.out.println();
				
				
				
				//задание 3
				
				int [] array = new int [10];
				int max = 0, min = 100;
				
				for (int i = 0 ; i<10 ; i++) {
					array[i] = i+1;
				}
				
				for(int i: array) {
					System.out.print(i + " ");
				}
				
				for (int i = 0 ; i<10 ; i++) {
					if (array[i] > max) {
						max = array[i];
					}
					if (array[i] < min) {
						min = array[i];
					}
					
				}
				System.out.println();
				System.out.println("минимальное значение массива = "+ min);
				System.out.println("максимальное значение массива = "+ max);
		
	}
}
