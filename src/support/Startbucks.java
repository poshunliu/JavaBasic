package support;

public class Startbucks implements CoffeeShop, Decoration{

    @Override
    public void type() {

        System.out.println("Ice Coffee, Hot Latte, or other");

    }

    @Override
    public void size() {

        System.out.println("Small, Medium, Large ");

    }

    @Override
    public void bean() {

        System.out.println("Coffee Arabica, Coffee Robusta, Coffee Liberica");

    }


    @Override
    public void light() {

    }

    @Override
    public void door() {

    }

    @Override
    public void wallpaper() {

    }
}
