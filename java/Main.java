
public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ahmadullin Shamil", "Lawyer", "shamil123@list.ru", "79509809962", 95000, 49);
        persArray[1] = new Person("Pim Alex", "Top manager", "alex13@mail.ru", "79515612252", 120000, 42);
        persArray[2] = new Person("Krug Daria Ivanovna", "Technologist", "dasha.krug@ls.ru", "79637548964", 25000, 25);
        persArray[3] = new Person("Ogorodnikov Evgeny Petrovich", "Chief mechanical engineer", "oep@list.ru", "79333387258", 230000, 52);
        persArray[4] = new Person("Saydasheva Maria Sergeevna", "Quality engineer", "babysitter@gmail.com", "79233538363", 40000, 35);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print();
            }
        }
    }
}
