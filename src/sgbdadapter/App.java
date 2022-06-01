package sgbdadapter;

/**
 *
 * @author lufrei
 */
public class App {

    public static void main(String[] args) {
        BasicUser basic = new BasicUser();
        FreeUser free = new FreeUser();
        UltimateUser ultimate = new UltimateUser();
        
        
        AdapterUser adapt = new AdapterUser(free, "Teste");
        AdapterUser adapt2 = new AdapterUser(basic, "Lucas");
        AdapterUser adapt3 = new AdapterUser(ultimate, "Ciclano");
        
        adapt.Insert();
        adapt2.Delete();
        adapt3.Update();
        
        adapt.addUser();
        adapt3.addUser();
        
        System.out.println(adapt.toString());
        
        System.out.println(adapt2.toString());
        adapt2.addUser();
        System.out.println(adapt2.toString());
        
        System.out.println(adapt3.toString());
    }
    
}
