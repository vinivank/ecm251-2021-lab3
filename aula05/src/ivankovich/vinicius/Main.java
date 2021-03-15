package ivankovich.vinicius;

public class Main {

    public static void main(String[] args) {
	Conta c1;
	c1=new Conta();
	c1.cliente=new Cliente();

	c1.cliente.titular="adam";
	c1.saldo=199.99;


	c1.visualizarsaldo();
	c1.visualizarsaldo();


	Conta c2=new Conta();
	c2.cliente=new Cliente();
	c2.cliente.titular="triss";
	c2.saldo=1000;


	c2.visualizarsaldo();

	c1.depositar(100);
	c2.depositar(299);
	c1.visualizarsaldo();
	c2.visualizarsaldo();

	c1.sacar(50);
	c2.sacar(150);
	c1.visualizarsaldo();
	c2.visualizarsaldo();

	c1.transferirpara(100,c2);
	c1.visualizarsaldo();
	c2.visualizarsaldo();
		System.out.println(c1.toString());
		System.out.println(c2.toString());



    }
}
