
public class Pizza {
	private String size;
	private int noOfChees;
	private int noOfPeperoni;
	private int noOfHam;
	
	public Pizza(String size, int noOfChees, int noOfPeperoni, int noOfHam) {
		super();
		this.size = size;
		this.noOfChees = noOfChees;
		this.noOfPeperoni = noOfPeperoni;
		this.noOfHam = noOfHam;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getNoOfChees() {
		return noOfChees;
	}

	public void setNoOfChees(int noOfChees) {
		this.noOfChees = noOfChees;
	}

	public int getNoOfPeperoni() {
		return noOfPeperoni;
	}

	public void setNoOfPeperoni(int noOfPeperoni) {
		this.noOfPeperoni = noOfPeperoni;
	}

	public int getNoOfHam() {
		return noOfHam;
	}

	public void setNoOfHam(int noOfHam) {
		this.noOfHam = noOfHam;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", noOfChees=" + noOfChees + ", noOfPeperoni=" + noOfPeperoni + ", noOfHam="
				+ noOfHam + "]";
	}
	
	public double calcCost(){
		double cost = 0.0;
		
		if (size.equalsIgnoreCase("small")) {
            cost = 10.0;
        } else if (size.equalsIgnoreCase("medium")) {
            cost = 12.0;
        } else if (size.equalsIgnoreCase("large")) {
            cost = 14.0;
        }
		
		double toppingCost = (noOfChees + noOfPeperoni + noOfHam) * 2.0;
		
		return cost + toppingCost;
	}
	
	public String getDescription() {
        return "Pizza size: " + size +
               ", Cheese toppings: " + noOfChees +
               ", Pepperoni toppings: " + noOfPeperoni +
               ", Ham toppings: " + noOfHam;
    }
	
}
