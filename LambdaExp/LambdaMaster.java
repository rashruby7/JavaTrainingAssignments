package LambdaExp;


interface Dog {
	
	
	void eat();
}
interface printer
{
	void print(String name,int times);
}
public class LambdaMaster
{
	public static void main(String[] args) {
		
		Dog d1=()->{System.out.println("the dog is barking");	};
		printer p1=(s,t)->{for(int i=1;i<=t;i++) {
			System.out.println("");
		}
	};
	}
}