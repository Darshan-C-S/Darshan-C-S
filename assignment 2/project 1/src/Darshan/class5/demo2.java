package Darshan.class5;

class UserAldreadyLoggedin extends Exception {

}

class Authenticate {
    private boolean isLoggedIn = false;

    public void login(String email, String password) throws UserAldreadyLoggedin {
        if (!isLoggedIn) {
            if (email.equals("adam") && password.equals("123")) {
                System.out.println("welcome");
            } else {
                System.out.println("login failed try again");
            }
        } else {
            throw new UserAldreadyLoggedin();


        }


    }
}

    public class demo2 {
        public static void main(String[] args) {
            Authenticate a = new Authenticate();
            try {
                a.login("adam", "123");
            } catch (UserAldreadyLoggedin e) {
                e.printStackTrace();
            }
            try {
                a.login("adam", "123");
            } catch (UserAldreadyLoggedin e) {
                //e.printStackTrace();
                System.out.println("Hey! you already logged In");
            }
        }

    }

