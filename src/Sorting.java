
public class Sorting {
	
	public static void SelectionSort ( int [ ] num )
	{
	     int i, j, first, temp;  
	     for ( i = num.length - 1; i > 0; i-- )  
	     {
	          first = 0;   //initialize to subscript of first element
	          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
	          {
	               if( num[ j ] < num[ first ] )         
	                 first = j;
	          }
	          temp = num[ first ];   //swap smallest found with element in position i.
	          num[ first ] = num[ i ];
	          num[ i ] = temp; 
	      }           
	}
	
	public static void InsertionSort( int [ ] num)
	{
	     int j;                     // the number of items sorted so far
	     int key;                // the item to be inserted
	     int i;  

	     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
	    {
	           key = num[ j ];
	           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
	          {
	                 num[ i+1 ] = num[ i ];
	          }
	         num[ i+1 ] = key;    // Put the key in its proper location
	     }
	}
	public static int seqsearch(int [ ] numbers, int key)
	{
	       for (int index = 0; index < numbers.length; index++)
	      {
	           if ( numbers[index] == key ) 
	                 return index;  //We found it!!!
	      }
	     // If we get to the end of the loop, a value has not yet
	     // been returned.  We did not find the key in this array.
	     return -1;
	}

	 
}
