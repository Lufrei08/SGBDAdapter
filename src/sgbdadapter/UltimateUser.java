package sgbdadapter;

import java.util.ArrayList;

/**
 *
 * @author lufrei
 */
public class UltimateUser {

    private ArrayList<String> users = new ArrayList<>();

    public void addUltimateUser(String user) {
        this.users.add(user);
    }

    public void InsertMySQL() {
        System.out.println("Insert no SGBD MySQL");
    }

    public void UpdateMySQL() {
        System.out.println("Update no SGBD MySQL");
    }

    public void DeleteMySQL() {
        System.out.println("Delete no SGBD MySQL");
    }

    @Override
    public String toString() {
        return  "Você assinou o plano ultimate, você tem acesso a multiplos usuários, e também multi transferências\n"
                + "Seus usuários cadastrados são:\n"
                + "Usuário{" +
                "nome ='" + users + '\'' +
                '}';
    }
    
}
