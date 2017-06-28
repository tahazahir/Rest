package ma.restaurant.models;
import ma.restaurant.models.SendMailTLS;
import ma.restaurant.services.MessageService;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ReservationService s = new ReservationService();
   //  for( Reservation t: s.getAllFacture())

	//	System.out.println(t.getTables());
	
	 /*  for( Reservation t: s.GetTableLibreRR((long) 2))

			System.out.println(t.getTables());
		}*/

//SendMailTLS t=new SendMailTLS();
//t.send("mehditemmante@gmail.com", "bonjouiiiii");
MessageService m= new MessageService();
Message mm=new Message("test","t@t.t","test");
m.addMessage(mm);


}}
