import Application.Approaches;
import Application.Person;

import java.util.List;

public class Main {
    Approaches approaches = new Approaches() {
        public void printPersons(
                List<Person> roster, CheckPerson tester) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }
        }
    };
}
