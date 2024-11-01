public class Test {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("abc@gmail.com", "12345", "Matara");
        Contacts c2 = new Contacts("godage@gmail.com", "00000", "Colombo");
        Author[] a = new Author[3];
        a[0] = new Author("Anusara Punchihewa", c1);
        Publisher p1 = new Publisher("Godage Book Shop", c2);

        Publication pub = new Publication("OOP-Testing", a, p1, 2024);

        System.out.println("\n\n\n" + pub);
    }
}
