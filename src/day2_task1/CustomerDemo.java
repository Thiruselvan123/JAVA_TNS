package day2_task1;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		Customer c4=new Customer();
		Customer c5=new Customer();
		
		c1.setCid(221);
		c1.setCname("thiru");
		c1.setCity("vpm");
		c1.setAddress("chitra nagar");
		
		c2.setCid(222);
		c2.setCname("yokesh");
		c2.setCity("vikravaandi");
		c2.setAddress("kp");
		
		c3.setCid(223);
		c3.setCname("pravin");
		c3.setCity("pondy");
		c3.setAddress("auroville");

		c4.setCid(224);
		c4.setCname("sanjay");
		c4.setCity("vpm");
		c4.setAddress("sithalingamadam");
		
		c5.setCid(225);
		c5.setCname("sivaraman");
		c5.setCity("cuddalore");
		c5.setAddress("nellikuppam");
		
		System.out.println("cid:"+c1.getCid()+" name:"+c1.getCname()+" city:"+c1.getCity()+" address:"+c1.getAddress());
		System.out.println("cid:"+c2.getCid()+" name:"+c2.getCname()+" city:"+c2.getCity()+" address:"+c2.getAddress());
		System.out.println("cid:"+c3.getCid()+" name:"+c3.getCname()+" city:"+c3.getCity()+" address:"+c3.getAddress());
		System.out.println("cid:"+c4.getCid()+" name:"+c4.getCname()+" city:"+c4.getCity()+" address:"+c4.getAddress());
		System.out.println("cid:"+c5.getCid()+" name:"+c5.getCname()+" city:"+c5.getCity()+" address:"+c5.getAddress());

	}

}
