/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.StackCode;

/**
 *
 * @author shnid
 */
import java.util.*;



class GfgMinStack

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s=new Stack<Integer>();

    /*returns min element from stack*/
    int getMin(){
        ArrayList<Integer> al=new ArrayList<>();
        
       
        if(s.empty()) return -1;
        else{
            al.addAll(s);
            int ele=al.get(0);
            for(int i=1;i<al.size();i++){
                if(al.get(i)<ele){
                    ele=al.get(i);
                }
            }
            
         return ele;  
        }
        
	// Your code here
    }
    
    /*returns poped element from stack*/
    int pop()
    {
      int ele=-1;
        if(s.empty()) return ele;
        else{
           ele=  s.pop();
        }
        return ele;
	// Your code here	
    }

    /*push element x into the stack*/
    void push(int x)
    {
        s.push(x);
	// Your code here	
    }	
}
