import java.util.Scanner;
public class DemoProject {

	public static void main(String[] args) {
	
		String id, name;
		int salary, sales, n;
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter number of Employee : ");
		n = input.nextInt();
		
		EmpData obj[] = new EmpData[n];
		Process obj2[] = new Process[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter Id : ");
			id = input.next();
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter salary: ");
			salary = input.nextInt();
			
			obj[i] = new EmpData(id, name, salary);
		}
		
		System.out.print("ID \t Salary ");
		System.out.print("\n");
		
		for(int i=0; i<n; i++) {
			System.out.println(obj[i].toString());
		}
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter sales : ");
			sales = input.nextInt();
			
			obj2[i] = new Process(obj[i].salary,sales);
		}
		
		for(int i=0; i<n; i++) {
			Output output = new Output(obj[i], obj2[i]);
		}
		
	}

}
