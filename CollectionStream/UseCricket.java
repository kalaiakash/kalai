package CollectionStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseCricket {
	public static void main(String[]args) {
		Cricket c1=new Cricket("Sachine",42,150,true);
		Cricket c2=new Cricket("HitMan",35,250,true);
		Cricket c3=new Cricket("Natrajan",30,15,false);
		Cricket c4=new Cricket("Kolhi",36,61,true);
		Cricket c5=new Cricket("Bumrah",28,159,false);
		ArrayList<Cricket>bat=new ArrayList<>();
		bat.add(c1);
		bat.add(c2);
		bat.add(c3);
		bat.add(c4);
		bat.add(c5);
		List<Cricket>l=bat.stream().filter(x->x.getIsBatsman()==true&&x.getScore()>100).collect(Collectors.toList());
		for(Cricket c:l) {
			System.out.println(c.getName());
		}
		List<Character>m=bat.stream().filter(y->y.getScore()%2==0).map(z->z.getName().charAt(z.getName().length()-1)).collect(Collectors.toList());
		System.out.println(m);
		
		List<String>o=bat.stream().filter(x->x.getIsBatsman()!=true&&x.getScore()>100).map(r->r.getName().toUpperCase()).collect(Collectors.toList());
		for(String c:o) {
			System.out.println(o);
			System.out.println(c.charAt(0));
		}
		
			
		

	}

}
