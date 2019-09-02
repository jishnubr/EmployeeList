package pgm;
import java.util.ArrayList;
public class EmployeeList {
	int n=100;
	class Data{
			int age,salary;
			String name;
			Data(String name,int age,int salary){
				this.name = name; 
	            this.age = age; 
	            this.salary = salary;
			}
	}
	public static void main(String args[]){ 
	        // suppose the custom input data of "100 employees"
		String name[] = {"Sobin", "Atul", "Ayush", "Rupesh","Anil", "Atul", "Ayush", "Rupesh","Sobin",
	        		"Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul",
	        		"Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Varun", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush",
	        		"Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh",
	        		"Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin",
	        		"Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush",
	        		"Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin",
	        		"Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh","Sobin", "Atul", "Ayush", "Rupesh"};
		int age[] = {25,25,45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26,
	        		25,25,45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26,25,25,
	        		45,54,21,32,45,33,45,26,25,25,45,54,21,32,45,33,45,26};
		int salary[] = {1200,1300,1400,1500,3300,3700,1800,1900,2000,2500,1200,1300,1400,1500,3300,1700,3800,1900,2000,2500,
	        		1200,3300,1400,1500,3300,1700,1800,1900,4000,2500,1200,1300,1400,1500,3300,1700,1800,1900,2000,2500,1200,1300,
	        		1400,1500,3300,3700,1800,1900,2000,2500,3200,1300,1400,3500,3300,1700,1800,1900,2000,2500,1200,1300,1400,1500,
	        		3300,1700,1800,1900,2000,2500,1200,1300,3600,1500,3300,1700,1800,1900,2000,2500,1200,1300,1400,1500,3300,1700,1800,1900,
	        		2000,2500,1200,1300,1400,1500,3300,1700,1800,1900,2000,2500};
		
	        EmployeeList custom = new EmployeeList();
	        custom.addValues( name, age, salary); 
	 }
	    public void addValues(String name[], int age[],int salary[]){
	    	//Add data to the list
	    	ArrayList<Data> list=new ArrayList<>();
	    	for (int i = 0; i < n; i++){
	    		list.add(new Data(name[i], age[i],salary[i])); 
	        }
	        System.out.println("List of salaries of employees {*with salary greater than 3000} is listed below\n");
	        printValues(list); 
	    }
	    
	    public void printValues(ArrayList<Data> list){ 
	    	//Printing required result from listed data
	    	int SalarySum=0,count=0;
	        for (int i = 0; i < n; i++){ 
	            Data data = list.get(i); 
	            if(data.salary>3000){
	            System.out.println(data.name+" "+data.age+" "+data.salary);
	            SalarySum += data.salary;
	            count++;
	        }
	    } 
	    System.out.println("Mean of salaries of above list is "+" "+SalarySum/count);
	}
}
