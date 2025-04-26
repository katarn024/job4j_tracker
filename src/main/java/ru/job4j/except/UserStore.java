package ru.job4j.except;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login == user.getUsername()) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователя нет в списках");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username too short");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Polina", true)
        };
        try {
            User user = findUser(users, "Polina");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}
