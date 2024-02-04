package main_1;

import javax.swing.*;
import javax.swing.border.Border;

import java.net.URI;
import java .awt.*;
import java.awt.event.*;
class p0 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	p0()
	{
		f=new JFrame("Insertion Sort Program ");
		title=new JLabel(" Insertion Sort Program");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(120,60);
	    h.setLocation(60,600);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(120,60);
	    back.setLocation(60,690);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		
		t=new JTextArea("\n\n\n\t\t\t\t#include<stdio.h>\r\n"
				+ "\t\t\t\tvoid insort(int *a,int n)\r\n"
				+ "\t\t\t\t{\r\n"
				+ "  \t\t\t\t  int i,j,key;\r\n"
				+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "      \t\t\t\t  key=a[i];\r\n"
				+ "        \t\t\t\tj=i-1;\r\n"
				+ "        \t\t\t\twhile(j>=0&&a[j]>key)\r\n"
				+ "        \t\t\t\t{\r\n"
				+ "          \t\t\t\t  a[j+1]=a[j];\r\n"
				+ "           \t\t\t\t j--;\r\n"
				+ "        \t\t\t\t}\r\n"
				+ "        \t\t\t\ta[j+1]=key;\r\n"
				+ "  \t\t\t\t}\r\n"
				+ "    \t\t\t\tprintf(\"\\n After sorting :\");\r\n"
				+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "      \t\t\t\t  printf(\"%d \",a[i]);\r\n"
				+ "    \t\t\t\t}\r\n"
				+ "\t\t\t\t}\r\n"
				+ "\t\t\t\tint main()\r\n"
				+ "\t\t\t\t{\r\n"
				+ "  \t\t\t\t  int n;\r\n"
				+ "    \t\t\t\tprintf(\"\\n Enter the size of the aray:\");\r\n"
				+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
				+ "    \t\t\t\tint a[n];\r\n"
				+ "    \t\t\t\tint i,j,key;\r\n"
				+ "    \t\t\t\tprintf(\"\\n Enter the Elements in the array:\");\r\n"
				+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "      \t\t\t\t  scanf(\"%d\",&a[i]);\r\n"
				+ "   \t\t\t\t}\r\n"
				+ "    \t\t\t\tprintf(\"\\n Before Sorting:\");\r\n"
				+ "    \t\t\t\tfor(i=0;i<n;i++)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "      \t\t\t\t  printf(\"%d \",a[i]);\r\n"
				+ "    \t\t\t\t}\r\n"
				+ "    \t\t\t\tinsort(a,n);\r\n"
				+ "  \t\t\t\t  return 0;\r\n"
				+ "\t\t\t\t}\r\n"
				+ "");
		f.add(t);
		t.setEditable(false);
		t.setBackground(Color.cyan);
		
		f.setSize(800,800);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}
	}
}
class t0 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	t0()
	{
         f=new JFrame("Time Complexity ");
		title=new JLabel("Time Complexity");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(100,50);
	    h.setLocation(500,10);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(100,50);
	    back.setLocation(650,10);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\tBest Case Analysis\r\n"
				+ "\tIn Best Case i.e., when the array is already sorted, tj = 1\r\n"
				+ "\tTherefore,T( n ) = C1 * n + ( C2 + C3 ) * ( n - 1 ) + C4 * ( n - 1 ) + ( C5 + C6 ) * ( n - 2 ) + C8 * ( n - 1 )\r\n"
				+ "\twhich when further simplified has dominating factor of n and gives T(n) = C * ( n ) or O(n)\r\n"
				+ "\r\n"
				+ "\n\tWorst Case Analysis\r\n"
				+ "\tIn Worst Case i.e., when the array is reversly sorted (in descending order), tj = j\r\n"
				+ "\tTherefore,T( n ) = C1 * n + ( C2 + C3 ) * ( n - 1 ) + C4 * ( n - 1 ) ( n ) / 2 + ( C5 + C6 ) * ( ( n - 1 ) (n ) / 2 - 1) + C8 * ( n - 1 )\r\n"
				+ "\twhich when further simplified has dominating factor of n2 and gives T(n) = C * ( n 2) or O( n2 )\r\n"
				+ "\r\n"
				+ "\n\tAverage Case Analysis\r\n"
				+ "\tLet's assume that tj = (j-1)/2 to calculate the average case\r\n"
				+ "\tTherefore,T( n ) = C1 * n + ( C2 + C3 ) * ( n - 1 ) + C4/2 * ( n - 1 ) ( n ) / 2 + ( C5 + C6 )/2 * ( ( n - 1 ) (n ) / 2 - 1) + C8 * ( n - 1 )\r\n"
				+ "\twhich when further simplified has dominating factor of n2 and gives T(n) = C * ( n 2) or O( n2 )");
		f.add(t);
		t.setEditable(false);		
		t.setBackground(Color.LIGHT_GRAY);
		f.setSize(800,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}								
	}
}
class Insertion implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton home,youtube,tcom,pg;
    Insertion()
	{
		f=new JFrame("Insertion Sort  ");
		title=new JLabel("Insertion Sort ");
		title.setFont(new Font("Arial Black", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(150,2);
		title.setForeground(Color.white);
		f.add(title);
		home=new JButton("Home");
		home.setSize(120,60);
	    home.setLocation(60,100);
	    home.setBackground(Color.WHITE);
		home.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		home.addActionListener(this);
		f.add(home);
		youtube=new JButton("Youtube");
		youtube.setSize(120,60);
	    youtube.setLocation(250,100);
	    youtube.setBackground(Color.red);
		youtube.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		youtube.addActionListener(this);
		f.add(youtube);
		tcom=new JButton("Time Complexity");
		tcom.setSize(120,60);
		tcom.setLocation(60,200);
		tcom.setBackground(Color.GREEN);
		tcom.setFont(new Font("Bauhaus 93",Font.PLAIN,11));
		tcom.addActionListener(this);
		f.add(tcom);
		pg=new  JButton("Program");
		pg.setSize(120,60);
		pg.setLocation(250,200);
		pg.setBackground(Color.cyan);
		pg.setFont(new Font("Bauhaus 93",Font.PLAIN,20));
		pg.addActionListener(this);
		f.add(pg);
		ImageIcon icon=new ImageIcon("C:\\Users\\moksh\\Desktop\\sort.jpeg");
		f.add(new JLabel(icon));
		f.pack();
		f.setSize(500,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==home)
		{
			f.dispose();
			new Project();
		}
		else if(e.getSource()==youtube)
		{
	        openWebPage("https://youtu.be/EdIKIf9mHk0");
		}
		else if(e.getSource()==pg)
		{
			f.dispose();
			new p0();
		}
		else if(e.getSource()==tcom)
		{
			f.dispose();
			new t0();
		}
	}
	private void openWebPage(String url) {
		try{
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
	   }
	   catch (java.io.IOException e) {
	       System.out.println(e.getMessage());
	   }
	}
}
class p1 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	p1()
	{
		f=new JFrame("Quick Sort Program ");
		title=new JLabel(" Quick Sort Program");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(120,60);
	    h.setLocation(60,600);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(120,60);
	    back.setLocation(60,690);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\t\t\t\t#include<stdio.h>\r\n"
				+ "\t\t\t\tint QuickSort(int a[],int first,int last)\r\n"
				+ "\t\t\t\t{\r\n"
				+ "    \t\t\t\tint i,pivot,j,t;\r\n"
				+ "    \t\t\t\tif(first<last)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "        \t\t\t\tpivot=first;\r\n"
				+ "       \t\t\t\t i=first;\r\n"
				+ "        \t\t\t\tj=last;\r\n"
				+ "        \t\t\t\twhile(i<j)\r\n"
				+ "        \t\t\t\t{\r\n"
				+ "            \t\t\t\twhile(a[i]<=a[pivot])\r\n"
				+ "            \t\t\t\t{\r\n"
				+ "               \t\t\t\t i++;\r\n"
				+ "            \t\t\t\t}\r\n"
				+ "            \t\t\t\twhile(a[j]>a[pivot])\r\n"
				+ "            \t\t\t\t{\r\n"
				+ "               \t\t\t\t j--;\r\n"
				+ "            \t\t\t\t}\r\n"
				+ "            \t\t\t\tif(i<j)\r\n"
				+ "            \t\t\t\t{\r\n"
				+ "                \t\t\t\tt=a[i];\r\n"
				+ "                \t\t\t\ta[i]=a[j];\r\n"
				+ "                \t\t\t\ta[j]=t;\r\n"
				+ "            \t\t\t\t}\r\n"
				+ "        \t\t\t\t}\r\n"
				+ "       \t\t\t\t t=a[j];\r\n"
				+ "        \t\t\t\ta[j]=a[pivot];\r\n"
				+ "       \t\t\t\t a[pivot]=t;\r\n"
				+ "        \t\t\t\tQuickSort(a,first,j-1);\r\n"
				+ "        \t\t\t\tQuickSort(a,j+1,last);        \r\n"
				+ "    \t\t\t\t}    \r\n"
				+ "\t\t\t\t}\r\n"
				+ "\t\t\t\tint main()\r\n"
				+ "\t\t\t\t{\r\n"
				+ "    \t\t\t\tint n,first,last;\r\n"
				+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
				+ "    \t\t\t\tint a[n];\r\n"
				+ "    \t\t\t\tfor(int i=0;i<n;i++)\r\n"
				+ "    \t\t\t\tscanf(\"%d\",&a[i]);\r\n"
				+ "    \t\t\t\tfirst=0;\r\n"
				+ "    \t\t\t\tlast=n-1;\r\n"
				+ "    \t\t\t\tQuickSort(a,first,last);\r\n"
				+ "    \t\t\t\tfor(int i=0;i<n;i++)\r\n"
				+ "        \t\t\t\tprintf(\"%4d \",a[i]);\r\n"
				+ "\t\t\t\t}\r\n"
				+ "");
		f.add(t);
		t.setBackground(Color.cyan);
		t.setEditable(false);
		f.setSize(800,900);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}
	}
}
class t1 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	t1()
	{
		f=new JFrame("Time Complexity ");
		title=new JLabel("Time Complexity");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(100,50);
	    h.setLocation(500,10);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(100,50);
	    back.setLocation(650,10);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\n\n\n\tBest Case Complexity - In Quicksort, the best-case occurs when the pivot element is the middle element or near to the middle element.\n"
				+ "\tThe best-case time complexity of quicksort is O(n*logn).\r\n\n"
				+ "\tAverage Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly\n"
				+ "\t  descending.The average case time complexity of quicksort is O(n*logn).\r\n\n"
				+ "\tWorst Case Complexity - In quick sort, worst case occurs when the pivot element is either greatest or smallest element. Suppose,\n"
				+ "\tif the pivot element is always the last element of the array, the worst case would occur when the given array is sorted already \n"
				+ "\tin ascending or descending order. The worst-case time complexity of quicksort is O(n2).");
		f.add(t);
		t.setEditable(false);
		t.setBackground(Color.LIGHT_GRAY);
		f.setSize(800,380);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}									
	}
}
class Quick implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton home,youtube,tcom,pg;
    Quick()
	{
		f=new JFrame("Quick Sort  ");
		title=new JLabel("Quick Sort ");
		title.setFont(new Font("Arial Black", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(150,2);
		title.setForeground(Color.white);
		f.add(title);
		home=new JButton("Home");
		home.setSize(120,60);
	    home.setLocation(60,100);
	    home.setBackground(Color.WHITE);
		home.setFont(new 
Font("Bauhaus 93",Font.PLAIN,15));
		home.addActionListener(this);
		f.add(home);
		youtube=new JButton("Youtube");
		youtube.setSize(120,60);
	    youtube.setLocation(250,100);
	    youtube.setBackground(Color.red);
		youtube.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		youtube.addActionListener(this);
		f.add(youtube);
		tcom=new JButton("Time Complexity");
		tcom.setSize(120,60);
		tcom.setLocation(60,200);
		tcom.setBackground(Color.GREEN);
		tcom.setFont(new Font("Bauhaus 93",Font.PLAIN,11));
		tcom.addActionListener(this);
		f.add(tcom);
		pg=new  JButton("Program");
		pg.setSize(120,60);
		pg.setLocation(250,200);
		pg.setBackground(Color.cyan);
		pg.setFont(new Font("Bauhaus 93",Font.PLAIN,20));
		pg.addActionListener(this);
		f.add(pg);
		ImageIcon icon=new ImageIcon("C:\\Users\\moksh\\Desktop\\sort.jpeg");
		f.add(new JLabel(icon));
		f.pack();
		f.setSize(500,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==home)
		{
			f.dispose();
			new Project();
		}
		else if(e.getSource()==youtube)
		{
	        openWebPage("https://youtu.be/kDgvnbUIqT4");
		}
		else if(e.getSource()==pg)
		{
			f.dispose();
			new p1();
		}
		else if(e.getSource()==tcom)
		{
			f.dispose();
			new t1();
		}
	}
	private void openWebPage(String url) {
		try
		{
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
	   }
	   catch (java.io.IOException e) {
	       System.out.println(e.getMessage());
	   }
		
	}
}
class p3 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	p3()
	{
		f=new JFrame("Merge Sort Program ");
		title=new JLabel(" Merge Sort Program");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(120,60);
	    h.setLocation(60,600);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(120,60);
	    back.setLocation(60,690);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\n\t\t\t\tvoid merge(int arr[], int p, int q, int r) {\r\n"
				+ "\r\n"
				+ "    \t\t\t\tint n1 = q - p + 1;\r\n"
				+ "    \t\t\t\tint n2 = r - q;\r\n"
				+ "\r\n"
				+ "\t\t\t\t    int L[n1], M[n2];\r\n"
				+ "\r\n"
				+ "    \t\t\t\tfor (int i = 0; i < n1; i++)\r\n"
				+ "        \t\t\t\tL[i] = arr[p + i];\r\n"
				+ "    \t\t\t\tfor (int j = 0; j < n2; j++)\r\n"
				+ "       \t\t\t\t M[j] = arr[q + 1 + j];\r\n"
				+ "\r\n"
				+ "   \t\t\t\t int i, j, k;\r\n"
				+ "    \t\t\t\ti = 0;\r\n"
				+ "    \t\t\t\tj = 0;\r\n"
				+ "    \t\t\t\tk = p;\r\n"
				+ "\r\n"
				+ "    \t\t\t\twhile (i < n1 && j < n2) {\r\n"
				+ "        \t\t\t\tif (L[i] <= M[j]) {\r\n"
				+ "            \t\t\t\tarr[k] = L[i];\r\n"
				+ "           \t\t\t\t i++;\r\n"
				+ "       \t\t\t\t } else {\r\n"
				+ "            \t\t\t\tarr[k] = M[j];\r\n"
				+ "         \t\t\t\t   j++;\r\n"
				+ "        \t\t\t\t}\r\n"
				+ "       \t\t\t\t k++;\r\n"
				+ "    \t\t\t\t}\r\n"
				+ "\r\n"
				+ "   \t\t\t\t while (i < n1) {\r\n"
				+ "        \t\t\t\tarr[k] = L[i];\r\n"
				+ "        \t\t\t\ti++;\r\n"
				+ "       \t\t\t\t k++;\r\n"
				+ "   \t\t\t\t }\r\n"
				+ "\r\n"
				+ "    \t\t\t\twhile (j < n2) {\r\n"
				+ "       \t\t\t\t arr[k] = M[j];\r\n"
				+ "        \t\t\t\tj++;\r\n"
				+ "       \t\t\t\t k++;\r\n"
				+ "   \t\t\t\t }\r\n"
				+ "\t\t\t\t}");
		f.add(t);
		t.setBackground(Color.cyan);
		t.setEditable(false);
		f.setSize(800,800);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}
	}
}
class t3 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	t3()
	{
		f=new JFrame("Time Complexity ");
		title=new JLabel("Time Complexity");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(100,50);
	    h.setLocation(500,10);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(100,50);
	    back.setLocation(650,10);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\n\tMerge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.\r\n"
				+ "\r\n"
				+ "\tT(n) = 2T(n/2) + O(n)\r\n"
				+ "\r\n"
				+ "\tThe solution of the above recurrence is O(nLogn). The list of size N is divided into a max of Logn parts, and the merging of\n"
				+ "\t all sublists into a single list takes O(N) time, the worst-case run time of this algorithm is O(nLogn)\r\n"
				+ "\r\n"
				+ "\tBest Case Time Complexity: O(n*log n)\r\n"
				+ "\r\n"
				+ "\tWorst Case Time Complexity: O(n*log n)\r\n"
				+ "\r\n"
				+ "\tAverage Time Complexity: O(n*log n)\r\n"
				+ "\r\n"
				+ "\tThe time complexity of MergeSort is O(n*Log n) in all the 3 cases (worst, average and best) as the mergesort always divides\n"
				+ "\t the array into two halves and takes linear time to merge two halves.");
		f.add(t);
		t.setEditable(false);
		t.setBackground(Color.LIGHT_GRAY);
		f.setSize(800,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}								
	}
}
class Merge implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton home,youtube,tcom,pg;
    Merge()
	{
		f=new JFrame("Merge Sort  ");
		title=new JLabel("Merge Sort ");
		title.setFont(new Font("Arial Black", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(150,2);
		title.setForeground(Color.white);
		f.add(title);
		home=new JButton("Home");
		home.setSize(120,60);
	    home.setLocation(60,100);
	    home.setBackground(Color.WHITE);
		home.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		home.addActionListener(this);
		f.add(home);
		youtube=new JButton("Youtube");
		youtube.setSize(120,60);
	    youtube.setLocation(250,100);
	    youtube.setBackground(Color.red);
		youtube.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		youtube.addActionListener(this);
		f.add(youtube);
		tcom=new JButton("Time Complexity");
		tcom.setSize(120,60);
		tcom.setLocation(60,200);
		tcom.setBackground(Color.GREEN);
		tcom.setFont(new Font("Bauhaus 93",Font.PLAIN,11));
		tcom.addActionListener(this);
		f.add(tcom);
		pg=new  JButton("Program");
		pg.setSize(120,60);
		pg.setLocation(250,200);
		pg.setBackground(Color.cyan);
		pg.setFont(new Font("Bauhaus 93",Font.PLAIN,20));
		pg.addActionListener(this);
		f.add(pg);
		ImageIcon icon=new ImageIcon("C:\\Users\\moksh\\Desktop\\sort.jpeg");
		f.add(new JLabel(icon));
		f.pack();
		
		f.setSize(500,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==home)
		{
			f.dispose();
			new Project();
		}
		else if(e.getSource()==youtube)
		{
	        openWebPage("https://youtu.be/dENca26N6V4");
		}
		else if(e.getSource()==pg)
		{
			f.dispose();
			new p3();
		}
		else if(e.getSource()==tcom)
		{
			f.dispose();
			new t3();
		}
	}
	private void openWebPage(String url) {
		try
		{
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
	   }
	   catch (java.io.IOException e) {
	       System.out.println(e.getMessage());
	   }
	}
}
class p4 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	p4()
	{
		f=new JFrame("Bubble Sort Program ");
		title=new JLabel(" Bubble Sort Program");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(120,60);
	    h.setLocation(60,600);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(120,60);
	    back.setLocation(60,690);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\t\t\t\t#include <stdio.h> \r\n"
				+ "\t\t\t\tint main()\r\n"
				+ "\t\t\t\t{\r\n"
				+ "    \t\t\t\tint n, temp;\r\n"
				+ "    \t\t\t\tprintf(\"\\nEnter the size of array : \");\r\n"
				+ "    \t\t\t\tscanf(\"%d\",&n);\r\n"
				+ "    \t\t\t\tint arr[n];\r\n"
				+ "    \t\t\t\tfor (int i = 0; i < n; i++)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "       \t\t\t\t scanf(\"%d\", &arr[i]);\r\n"
				+ "    \t\t\t\t}\r\n"
				+ "        \t\t\t\tprintf(\"\\nBefore Sorting \");\r\n"
				+ "    \t\t\t\tfor (int i = 0; i < n; i++)\r\n"
				+ "    \t\t\t\t{\r\n"
				+ "        \t\t\t\tprintf(\"%d \", arr[i]);\r\n"
				+ "    \t\t\t\t}\r\n"
				+ "\r\n"
				+ "\t\t\t\t    printf(\"\\n\");\r\n"
				+ "\r\n"
				+ "   \t\t\t\tfor (int i = 0; i < n-1; i++){ \r\n"
				+ "       \t\t\t\tprintf(\"Pass = %d\\n\",i);\r\n"
				+ "      \t\t\t\t for (int j = 0; j < n-i-1; j++){\r\n"
				+ "          \t\t\t\t if (arr[j] > arr[j+1])\r\n"
				+ "          \t\t\t\t  {    \r\n"
				+ "             \t\t\t\t   temp = arr[j];\r\n"
				+ "            \t\t\t\t    arr[j] = arr[j+1];\r\n"
				+ "              \t\t\t\t  arr[j+1] = temp;\r\n"
				+ "           \t\t\t\t }\r\n"
				+ "     \t\t\t\t   printf(\"\\n\");\r\n"
				+ "      \t\t\t\t  for(int i=0;i<n;i++)\r\n"
				+ "      \t\t\t\t  printf(\"%d \",arr[i]);\r\n"
				+ "   \t\t\t\t    }\r\n"
				+ "     \t\t\t\t   printf(\"\\n\");\r\n"
				+ "   \t\t\t\t}\r\n"
				+ "        \r\n"
				+ "   \t\t\t\t printf(\"\\nAfter Sorting \"); \r\n"
				+ "  \r\n"
				+ "  \t\t\t\t  for (int i = 0; i < n; i++)\r\n"
				+ "   \t\t\t\t {\r\n"
				+ "     \t\t\t\t   printf(\"%d \", arr[i]);\r\n"
				+ "  \t\t\t\t  }\r\n"
				+ "   \t\t\t\t return 0;\r\n"
				+ "\t\t\t\t}\r\n"
				+ "\r\n"
				+ "");
		f.add(t);
		t.setBackground(Color.cyan);
		t.setEditable(false);
		f.setSize(800,800);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}
	}
}
class t4 implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton h,back;
	t4()
	{
		f=new JFrame("Time Complexity ");
		title=new JLabel("Time Complexity");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(300,5);
		f.add(title);
		h=new JButton("HOME");
		h.setSize(100,50);
	    h.setLocation(500,10);
	    h.setBackground(Color.WHITE);
		h.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		h.addActionListener(this);
		f.add(h);
		back=new JButton("Back");
	    back.setSize(100,50);
	    back.setLocation(650,10);
	    back.setBackground(Color.PINK);
		back.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		back.addActionListener(this);
		f.add(back);
		t=new JTextArea("\n\n\n\n\tThe Time Complexity of the Bubble Sort Algorithm\r\n"
				+ "\tBubble sort employs two loops: an inner loop and an outer loop.\r\n"
				+ "\tThe inner loop performs O(n) comparisons deterministically.\r\n"
				+ "\n\tWorst Case\r\n"
				+ "\tIn the worst-case scenario, the outer loop runs O(n) times.\r\n"
				+ "\tAs a result, the worst-case time complexity of bubble sort is O(n x n) = O(n x n) (n2).\r\n"
				+ "\n\tBest Case\r\n"
				+ "\tIn the best-case scenario, the array is already sorted, but just in case, bubble sort performs O(n) comparisons.\r\n"
				+ "\tAs a result, the time complexity of bubble sort in the best-case scenario is O(n).\r\n"
				+ "\n\tAverage Case\r\n"
				+ "\tBubble sort may require (n/2) passes and O(n) comparisons for each pass in the average case.\r\n"
				+ "\tAs a result, the average case time complexity of bubble sort is O(n/2 x n) = O(n/2 x n) = O(n/2 x n) = O(n/2 x n) = O (n2).");
		f.add(t);
		t.setEditable(false);
		t.setBackground(Color.LIGHT_GRAY);
		f.setSize(800,400);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==h)
		{
			f.dispose();
			new Project();
		}
		if(e.getSource()==back)
		{
			f.dispose();
			new Insertion();
		}							
	}
}
class Bubble implements ActionListener
{
	JFrame f;
	JLabel l,title;
	JTextArea t;
	JButton home,youtube,tcom,pg;
    Bubble()
	{
		f=new JFrame("Bubble Sort  ");
		title=new JLabel("Bubble Sort ");
		title.setFont(new Font("Arial Black", Font.PLAIN, 25));
		title.setSize(300,50);
		title.setLocation(150,2);
		title.setForeground(Color.white);
		f.add(title);
		home=new JButton("Home");
		home.setSize(120,60);
	    home.setLocation(60,100);
	    home.setBackground(Color.WHITE);
		home.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		home.addActionListener(this);
		f.add(home);
		youtube=new JButton("Youtube");
		youtube.setSize(120,60);
	    youtube.setLocation(250,100);
	    youtube.setBackground(Color.red);
		youtube.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		youtube.addActionListener(this);
		f.add(youtube);
		tcom=new JButton("Time Complexity");
		tcom.setSize(120,60);
		tcom.setLocation(60,200);
		tcom.setBackground(Color.GREEN);
		tcom.setFont(new Font("Bauhaus 93",Font.PLAIN,11));
		tcom.addActionListener(this);
		f.add(tcom);
		pg=new  JButton("Program");
		pg.setSize(120,60);
		pg.setLocation(250,200);
		pg.setBackground(Color.cyan);
		pg.setFont(new Font("Bauhaus 93",Font.PLAIN,20));
		pg.addActionListener(this);
		f.add(pg);
		ImageIcon icon=new ImageIcon("C:\\Users\\moksh\\Desktop\\sort.jpeg");
		f.add(new JLabel(icon));
		f.pack();
		f.setSize(500,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==home)
		{
			f.dispose();
			new Project();
		}
		else if(e.getSource()==youtube)
		{
	        openWebPage("https://youtu.be/14La4BKNoqc");
		}
		else if(e.getSource()==pg)
		{
			f.dispose();
			new p4();
		}
		else if(e.getSource()==tcom)
		{
			f.dispose();
			new t4();
		}
	}
	private void openWebPage(String url) {
		try
		{
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
	   }
	   catch (java.io.IOException e) {
	       System.out.println(e.getMessage());
	   }
		
	}
}
class com implements ActionListener
{
	JFrame f;
	JLabel title,comp;
	JButton home;
	JTextArea l;
	com()
	{
		f=new JFrame("comparisons");
		JPanel p0=new JPanel();
		String title0="Insertion Sort:";
		Border border0 = BorderFactory.createTitledBorder(title0);
		p0.setBorder(border0);
		JTextArea a0=new JTextArea();
		a0.setText("\n\nBest Case:O(n)"
				+ "\n\n\n\nAverage Case:O(n^2)"
				+ "\n\n\n\nWorst Case:(O(n^2)");
		Font font0 = new Font("Segoe Script", Font.BOLD, 17);
        a0.setFont(font0);
		a0.setBackground(Color.lightGray);
		a0.setEditable(false);
		p0.add(a0);
		p0.setBackground(Color.lightGray);
		f.add(p0);
		JPanel p1=new JPanel();
		String title1="Quick Sort:";
		Border border1 = BorderFactory.createTitledBorder(title1);
		p1.setBorder(border1);
		JTextArea a1=new JTextArea();
		a1.setText("\n\nBest Case:O(n log(n))"
				+ "\n\n\n\nAverage Case:O(n log(n)"
				+ "\n\n\n\nWorst Case:(O(n^2)");
		Font font1 = new Font("Segoe Script", Font.BOLD, 17);
        a1.setFont(font1);
		a1.setBackground(Color.lightGray);
		a1.setEditable(false);
		p1.add(a1);
		p1.setBackground(Color.lightGray);
		f.add(p1);
		JPanel p2=new JPanel();
		String title2="Merge Sort:";
		Border border2 = BorderFactory.createTitledBorder(title2);
		p2.setBorder(border2);
		JTextArea a2=new JTextArea();
		a2.setText("\n\nBest Case:O(n log(n))"
				+ "\n\n\n\nAverage Case:O(n log(n)"
				+ "\n\n\n\nWorst Case:(O(n log(n)");
		Font font2 = new Font("Segoe Script", Font.BOLD, 17);
        a2.setFont(font2);
		a2.setBackground(Color.lightGray);
		a2.setEditable(false);
		p2.add(a2);
		p2.setBackground(Color.lightGray);
		f.add(p2);
		JPanel p3=new JPanel();
		String title3="Bubble Sort:";
		Border border3 = BorderFactory.createTitledBorder(title3);
		p3.setBorder(border3);
		JTextArea a3=new JTextArea();
		a3.setText("\n\nBest Case:O(n)"
				+ "\n\n\n\nAverage Case:O(n^2)"
				+ "\n\n\n\nWorst Case:(O(n^2)");
		Font font3 = new Font("Segoe Script", Font.BOLD, 17);
        a3.setFont(font3);
		a3.setBackground(Color.lightGray);
		a3.setEditable(false);
		p3.add(a3);
		p3.setBackground(Color.lightGray);
		f.add(p3);
		JPanel p4=new JPanel();
		String title4="Shell Sort:";
		Border border4 = BorderFactory.createTitledBorder(title4);
		p4.setBorder(border4);
		JTextArea a4=new JTextArea();
		a4.setText("\n\nBest Case:O(n^2)"
				+ "\n\n\n\nAverage Case:O(n log(n)"
				+ "\n\n\n\nWorst Case:(O(n log(n)");
		Font font4 = new Font("Segoe Script", Font.BOLD, 17);
        a4.setFont(font4);
		a4.setBackground(Color.lightGray);
		a4.setEditable(false);
		p4.add(a4);
		p4.setBackground(Color.lightGray);
		f.add(p4);
		JPanel p5=new JPanel();
		home=new JButton("Home");
	    home.setBackground(Color.LIGHT_GRAY);
		home.setFont(new Font("Bauhaus 93",Font.PLAIN,15));
		home.addActionListener(this);
		p5.add(home);
		p5.setBackground(Color.lightGray);
		f.add(p5);
		f.setVisible(true);
		f.setSize(1920,1080);
		f.setLayout(new GridLayout(2,4));
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==home)
		{
			f.dispose();
			new Project();
		}
	}
}
public class Project implements ActionListener
{
	JFrame f;
	JLabel title;
	JButton in,qu,me,sh,bu;
	Project()
	{	
		f=new JFrame("Sorting Techinques");
		title=new JLabel("Sorting Techinques");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(600,50);
		title.setLocation(620,380);
		f.add(title);
		in=new JButton("Insertion Sort");
		in.setSize(520,126);
		in.setLocation(0,50);
		in.setBackground(Color.RED);
		in.setFont(new Font("Arial", Font.PLAIN, 30));
		in.addActionListener(this);
		f.add(in);
		qu=new JButton("Quick Sort");
		qu.setSize(520,126);
		qu.setLocation(0,200);
		qu.setBackground(Color.WHITE);
		qu.setFont(new Font("Arial", Font.PLAIN, 30));
		qu.addActionListener(this);
		f.add(qu);
		me=new JButton("Merge Sort");
		me.setSize(520,126);
		me.setLocation(0, 350);
		me.setBackground(Color.YELLOW);
		me.setFont(new Font("Arial", Font.PLAIN, 30));
		me.addActionListener(this);
		f.add(me);
		sh=new JButton("Comparisons");
		sh.setSize(520,126);
		sh.setLocation(0,650);
		sh.setBackground(Color.GREEN);
		sh.setFont(new Font("Arial", Font.PLAIN, 30));
		sh.addActionListener(this);
		f.add(sh);
		bu=new JButton("Bubble Sort");
		bu.setSize(520,126);
		bu.setLocation(0,500);
		bu.setBackground(Color.PINK);
		bu.setFont(new Font("Arial", Font.PLAIN, 30));
		bu.addActionListener(this);
		f.add(bu);
		ImageIcon icon=new ImageIcon("C:\\Users\\moksh\\Desktop\\Sorting.png");
		f.add(new JLabel(icon));
		f.pack();
		f.setSize(1920,1080);
		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==in)
		{
			f.dispose();
			new Insertion();
		}
		else if(e.getSource()==qu)
		{
			f.dispose();
			new Quick();
		}
		else if(e.getSource()==sh)
		{
			f.dispose();
			new com();
		}
		else if(e.getSource()==me)
		{
			f.dispose();
			new Merge();
		}
		else if(e.getSource()==bu)
		{
			f.dispose();
			new Bubble();
		}
	}
	public static void main(String args[])
	{
		new Project();
	}
}
