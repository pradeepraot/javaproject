package collections;

 public class ImmutableDemo {

		final String pancardNumber;  
		  
		private ImmutableDemo(String pancardNumber){  
		this.pancardNumber=pancardNumber;  
		}  
		  
		public String getPancardNumber(){  
		return pancardNumber;  
		}  
		  
		}