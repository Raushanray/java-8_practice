package lambda.exp.program.list;

import java.util.ArrayList;
import java.util.List;

public class SortStrings {

	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("JoHn");
        names.add("Jane");
        names.add("Mark");
        names.add("Alice");
        names.add("Bob");
        names.add("RaVi");
        names.add("sUmIt");
        names.add("SaM");
        System.out.println("Before sorting.....");
        for (String name : names) {
			System.out.println(name);
		}
        
        System.out.println("List After sorting.....");
        names.sort((nam1,nam2) -> nam1.compareTo(nam2));
        for (String listAfterSorting : names) {
			System.out.println(listAfterSorting);
		}

    }
}
