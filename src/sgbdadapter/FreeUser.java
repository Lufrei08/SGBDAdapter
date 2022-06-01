package sgbdadapter;

/**
 *
 * @author lufrei
 */
public class FreeUser {

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void InsertParadox() {
        System.out.println("Insert no SGBD Paradox");
    }

    public void UpdateParadox() {
        System.out.println("Update no SGBD Paradox");
    }

    public void DeleteParadox() {
        System.out.println("Delete no SGBD Paradox");
    }

    @Override
    public String toString() {
        return  "Seu plano é gratuito, você não tem acesso a multiplos usuários, nem para multi transferências\n"
                + "Seu usuário cadastrado é:\n"
                + "Usuário{" +
                "nome ='" + user + '\'' +
                '}';
    }
    
    
}
