package ok.lesson12;

import java.util.Comparator;


public class UserSalaryComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        if (user1.getSalary() >= user2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }

}
