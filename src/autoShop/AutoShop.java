package autoShop;
	
	class Car {
	    private int speed;
	    private double regularPrice;
	    private String color;
	    /**
	     * Creating super class Car and initialize the fields of Super class
	     * @param speed - getting a Speed of a car
	     * @param regularPrice - getting price 
	     * @param color - for color 
	     */

	    public Car(int speed, double regularPrice, String color) {
	        this.speed = speed;
	        this.regularPrice = regularPrice;
	        this.color = color;
	    }

	    public double getSalePrice() {
	        return regularPrice;
	    }
	}
	class Truck extends Car {
	    private int weight;

	    public Truck(int speed, double regularPrice, String color, int weight) {
	        super(speed, regularPrice, color);
	        this.weight = weight;
	    }
	    /**
	     * create a subclass named Truck and initialize Weight and check the discount percentage 
	     */
	    public double getSalePrice() {
	        return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
	    }
	}
	class Seden extends Car {
	    private int length;

	    public Seden(int speed, double regularPrice, String color, int length) {
	        super(speed, regularPrice, color);
	        this.length = length;
	    }
	    
	    /**
	     * create a subclass named Seden and calculate its Percentage
	     */

	    public double getSalePrice() {
	        return super.getSalePrice() * (length < 20 ? 0.95 : 0.90);
	    }
	}
	
	/**
	 * create a subclass Ford and calculate the manufactureDiscount
	 * @author DELL
	 *
	 */
	class Ford extends Car {
	    private int year;
	    public int manufacturerDiscount;

	    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
	        super(speed, regularPrice, color);
	        this.year = year;
	        this.manufacturerDiscount = manufacturerDiscount;
	    }

	    public double getSalePrice() {
	        return super.getSalePrice() - manufacturerDiscount;
	    }
	}
	public class AutoShop {
	    public static void main(String[] args) {
	        Seden seden = new Seden(500, 500, "red", 30);
	        Ford fordOne = new Ford(300, 300, "black", 2021, 35);
	        Ford fordTwo = new Ford(250, 250, "yellow", 2020, 40);
	        Car car = new Car(100, 100, "white");
	        System.out.println("seden "+seden.getSalePrice());
	        System.out.println("fordOne "+fordOne.getSalePrice());
	        System.out.println("fordTwo "+fordTwo.getSalePrice());
	        System.out.println("car  "+car.getSalePrice());
	    }
	}
