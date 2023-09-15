class Food {
	
	private String name;
  private int fat;
	private int carb;
	private int fiber;
	private double price;
	
	public Food (String name, double price, int fat, int carb, int fiber) {
		this.name = name;
    this.price = price;
		this.fat = fat;
		this.fiber = fiber;
		this.carb = carb;               
	}
	
  public void setName(String name){
		this.name = name;
	}
  
	public String getName() {
	 return name;
  }

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;	
	}
	
	public void setFat(int fat){
		this.fat = fat;
	}

	public int getFat(){
		return fat;	
	}
	
	public void setCarb(int carb){
		this.carb = carb;
	}

	public int getCarb(){
		return carb;	
	}
  
	public void setFiber(int fiber){
		this.fiber = fiber;
	}

	public int getFiber(){
		return fiber;	
	}

  public String toString(){

    String foodObject;
    foodObject = "Each " + this.getName() + " has " + this.getFat() + "g of fat, " + this.getCarb() + "g of carbs, and " + this.getFiber() + "g of fiber.";
    return foodObject;
  }
  
}