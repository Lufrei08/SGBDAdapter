package sgbdadapter;

import java.util.Scanner;

/**
 *
 * @author lufrei
 */
public class AdapterUser implements SGBD {

    private FreeUser freeUser;
    private BasicUser basicUser;
    private UltimateUser UltimateUser;

    public AdapterUser(FreeUser free, String user) {
        this.freeUser = free;
        this.freeUser.setUser(user);

    }

    public AdapterUser(BasicUser basic, String user) {
        this.basicUser = basic;
        this.basicUser.addBasicUser(user);
    }

    public AdapterUser(UltimateUser ultimate, String user) {
        this.UltimateUser = ultimate;
        this.UltimateUser.addUltimateUser(user);
    }

    @Override
    public void Insert() {

        if (UltimateUser != null) {
            UltimateUser.InsertMySQL();
        }
        if (freeUser != null) {
            freeUser.InsertParadox();

        }
        if (basicUser != null) {
            basicUser.InsertFireBird();
        }

    }

    @Override
    public void Update() {

        if (UltimateUser != null) {
            UltimateUser.UpdateMySQL();
        }
        if (freeUser != null) {
            freeUser.UpdateParadox();
        }
        if (basicUser != null) {
            basicUser.UpdateFireBird();
        }
    }

    @Override
    public void Delete() {
        if (UltimateUser != null) {
            UltimateUser.DeleteMySQL();
        }
        if (freeUser != null) {
            freeUser.DeleteParadox();
        }
        if (basicUser != null) {
            basicUser.DeleteFireBird();
        }
    }

    @Override
    public void addUser() {
        if (freeUser != null) {
            System.out.println("Seu plano não permite multiplos usuários!");
        }
        if (basicUser != null) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome do usuário: ");
            String user = scan.nextLine();
            this.basicUser.addBasicUser(user);
            System.out.println("Usuário "+user+" adicionado!");
        }

        if (UltimateUser != null) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome do usuário: ");
            String user = scan.nextLine();
            this.UltimateUser.addUltimateUser(user);
            System.out.println("Usuário "+user+" adicionado!");
        }

    }

    @Override
    public String toString() {
        if(freeUser != null){
            return freeUser.toString();
        }
        if(basicUser != null){
            return basicUser.toString();
        }
        if(UltimateUser != null){
            return UltimateUser.toString();
        }
        return null;
    }
    
    

}
