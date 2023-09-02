package abc;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int tr[][]= {{1,2,3},{4,5,6},{4,6,7}};
	      {
	    	  System.out.println("print matrix without transpose|:");
	    	  for(int i=0;i<3;i++)
	    		  for(int j=0;j<3;j++)
	    			  System.out.println(tr[i][j]+"");
	    	  System.out.println();
	      }
	      System.out.println("print matrix after transpose:");
	      {
	    	  for(int i=0;i<2;i++) {
	    		  for(int j=0;j<2;j++) {
	    			  System.out.println(tr[i][j]+"");
	    		  }
	    		  System.out.println();
	    		  }
	      }
		}

	

	}


