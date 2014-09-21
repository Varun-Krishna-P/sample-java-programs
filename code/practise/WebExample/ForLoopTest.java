package code.practise.WebExample;

public class ForLoopTest {
	public static void main(String args[]){
		for(int i=1 ; i<=8 ; i = i*2)
		{
			if(i==6)
				continue;
			System.out.println(i+ "\n"+i);
		}
	}

}
