/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class App {
    public static void main(String[] args) {
        /* Parent */
        Employee employee = new Employee("Settha", "CEO", 500000);
        /* Children: Group of Sales */
        Employee sales = new Employee("Kamphaka", "Head Sales", 300000);
        sales.children.add(new Employee("Wiroj", "Sales", 150000));
        sales.children.add(new Employee("Weeranan", "Sales", 100000));
        employee.children.add(sales);
        /* Children: Group of Marketing */
        Employee marketing = new Employee("UngInk", "Head Marketing", 300000);
        marketing.children.add(new Employee("Oak", "Marketing", 200000));
        marketing.children.add(new Employee("Aem", "Marketing", 250000));
        employee.children.add(marketing);
        /* Another Parent */
        Employee employee1 = new Employee("Mane", "CEO", 1000000);
        /* Call Operation */
        printAllEmployee(employee);
        printAllEmployee(employee1);
    }

    public static void printAllEmployee(Employee employee) {
        System.out.println(employee);
    }
}
