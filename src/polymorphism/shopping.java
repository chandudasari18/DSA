package polymorphism;

class shopping {
    private String name;
    private double price;
    private String category;

    public shopping(String name) {
        this.name = name;
        this.price = 0.0;
        this.category = "Not Specified";
    }

    public shopping(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = "Not Specified";
    }

    public shopping(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println("Product name is :" + name);
        System.out.println("Product price is :" + price);
        System.out.println("Product category is :" + category);
        
    }



    public static void main(String args[]) {
        shopping s1 = new shopping("Laptop");
        shopping s2 = new shopping("Smartphone", 25000.0);
        shopping s3 = new shopping("Headphones", 1500.0, "Electronics");

        s1.display();
        s2.display();
        s3.display();
    }
}
