package command.line.args;

public class Test {
	public static void main(String[] args) {
		int num=0;
		if(args.length!=1) {
			System.out.println("Usage : java Table <NUMBER>");
			System.exit(0);
		}
		
		num = Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+ " * "+ i + " = "+(num*i));
		}
	}
}
