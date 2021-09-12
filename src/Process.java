
public class Process {

	int salary, sales, sum;	
	
	public Process(int salary, int sales) {
		this.salary = salary;
		this.sales = sales;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public int processTotalMoney() {
		if(this.salary <= 10000) {
			if(this.sales <= 50000) {
				this.sum = (int)((0.05)*this.sales);
				this.sum = this.sum + this.salary;
			}
			else if(this.sales > 50000) {
				this.sum = (int)((0.10)*this.sales);
				this.sum = this.sum + this.salary;
			}
		}
		else if(this.salary > 10000) {
			if(this.sales <= 100000) {
				this.sum = (int)((0.05)*this.sales);
				this.sum = this.sum + this.salary;
			}
			else if(this.sales > 100000) {
				this.sum = (int)((0.10)*this.sales);
				this.sum = this.sum + this.salary;
			}
		}
		
		return this.sum;
		
	}
	
}
