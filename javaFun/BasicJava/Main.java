/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    for (int i = 0; i < 256; i++)
      {
	System.out.println (i);
      }
    for (int i = 0; i <= 255; i++)
      {
	if (i % 2 == 0)
	  System.out.println (i);
      }
    for (int i = 0; i < 256; i++)
      {
	i += i;
	System.out.println (i);
      }
    int[] myArray = { 1, 3, 5, 7, 9, 13 };
    for (int i = 0; i < myArray.length; i++)
      {
	System.out.println (myArray[i]);
      }
    int[] array = { -3, -5, -7 };
    int last = array[0];
    for (int i = 0; i < array.length; i++)
      {

	if (last < array[i])
	  {
	    last = array[i];
	  }

      }
    System.out.println (last);
    int[] arr = { 3, 2, 10 };
    int sum = 0;
    int avg = 0;
    int counter = 0;
    for (int i = 0; i < arr.length; i++)
      {
	sum += arr[i];
	counter += 1;
      }
    sum /= counter;
    System.out.println (sum);
    ArrayList < Integer > myarray = new ArrayList < Integer > ();
    for (int i = 0; i <= 255; i++)
      {
	if (i % 3 == 0)
	  myarray.add (i);

	System.out.println (myarray);
      }

    int[] arr1 = { 8, 5, 3, 2, 10 };
    int counter1 = 0;
    int Y = 5;
    for (int i = 0; i < arr1.length; i++)
      {
	if (Y < arr1[i])
	  counter1 += 1;
      }

    System.out.println (counter1);

    int[] a = { 1, 5, 10, -2 };
    ArrayList < Integer > m = new ArrayList < Integer > ();

    for (int i = 0; i < a.length; i++)
      {
	a[i] *= a[i];
	m.add (a[i]);

      }
    System.out.println (m);

    int[] b = { 1, 5, 10, -2 };
    ArrayList < Integer > n = new ArrayList < Integer > ();

    for (int i = 0; i < b.length; i++)
      {
	if (b[i] > 0)
	  {
	    n.add (b[i]);
	  }
	else
	  {
	    b[i] = 0;
	    n.add (b[i]);

	  }
      }
    System.out.println (n);



    int[] array2 = { -5 , 1 , 4 , 10 };
    int max = 0;
    int min = 0;
    for (int i = 0; i < array2.length; i++)
      {
	if (max < array2[i])
	  {
	    max = array2[i];
	  }
	if (min > array2[i])
	  {
	    min = array2[i];
	  }
      }
    System.out.println (max);
    System.out.println (min);
      
  }
}



  


	public static void main(String[] args) {
		int[] array2 = { 1 , 4 , 10 };
    int max = 0;
    int min = 0;
    int counter2 = 0;
    for (int i = 0; i < array2.length; i++)
      {
	if (max < array2[i])
	  {
	    max = array2[i];
	  }
	if (min > array2[i])
	  {
	    min = array2[i];
	  }
	  }
	  
        System.out.println (max);
        System.out.println (min);
	}
}
