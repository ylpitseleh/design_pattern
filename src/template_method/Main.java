package template_method;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("");

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
