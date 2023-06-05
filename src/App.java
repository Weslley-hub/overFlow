public class App {
    public static void main(String[] args) throws Exception {

    Pessoa pessoa1 = new Pessoa("André", 25);

    String  name = pessoa1.getName();
    int age = pessoa1.getAge();

    System.out.println("Nome: " + name);
    System.out.println("Idade: " + age);
    
    pessoa1.setName("Maria");
    pessoa1.setAge(30);
   
    pessoa1.printInfo();

    }
}
