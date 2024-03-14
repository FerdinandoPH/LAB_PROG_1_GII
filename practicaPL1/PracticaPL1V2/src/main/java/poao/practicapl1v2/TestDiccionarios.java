package poao.practicapl1v2;
import java.util.Arrays;
import java.util.Hashtable;
public class TestDiccionarios {
    public static void main(String[] args) {
        Hashtable<String,Integer> prueba=new Hashtable<String,Integer>();
        prueba.put("Fernando",19);
        prueba.put("Alberto",53);
        System.out.println(prueba.toString());
        System.out.println(prueba.get("Fernando"));
        String[] llaves=prueba.keySet().toArray(new String[prueba.keySet().size()]);
        System.out.println("Llaves: "+Arrays.toString(llaves));
        Integer[] valores=prueba.values().toArray(new Integer[prueba.values().size()]);
        System.out.println("Valores: "+Arrays.toString(valores));
    }
}
