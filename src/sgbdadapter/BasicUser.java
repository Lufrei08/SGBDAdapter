package sgbdadapter;

import java.util.ArrayList;

/**
 *
 * @author lufrei
 */
public class BasicUser {

    private ArrayList<String> users = new ArrayList<>();

    public void addBasicUser(String user) {
        this.users.add(user);
    }

    public void InsertFireBird() {
        System.out.println("Insert no SGBD FireBird");
    }

    public void UpdateFireBird() {
        System.out.println("Update no SGBD FireBird");
    }

    public void DeleteFireBird() {
        System.out.println("Delete no SGBD FireBird");
    }

    @Override
    public String toString() {
        return  "Você assinou o plano básico, você tem acesso a multiplos usuários, mas apenas single transferências\n"
                + "Seus usuários cadastrados são:\n"
                + "Usuário{" +
                "nome ='" + users + '\'' +
                '}';
    }

}
