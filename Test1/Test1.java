import java.util.Scanner;
class Test1
{
	static int best = 100;
	static char grade;
	static int max = 60;
	static char g;
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of students:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int score[] = new int[n];
	
    System.out.print("Enter " + n + " scores:");
 
        for (int i = 0; i < score.length; i++) 
		{
            score[i] = input.nextInt();
        }
    
        for (int i = 0; i < score.length; i++) {
            
			if (score[i] >= best - 10){
                grade = 'A';
			}
            else if (score[i] >= best - 20){
				grade = 'B';
			}	
            else if (score[i] >= best - 30){
				grade = 'C';
			}	
            else if (score[i] >= best - 40){
				grade = 'D';
            }
			else{
                grade = 'F';
            }
        System.out.println("Student " + i +" score is " + score[i] +" and grade is " + grade);
		}
        {  
		    for (int i = 0; i < score.length; i++){
			if(score[i] > max) {
                  max = score[i];				
		    }		
        }  
		if(max >= 90){
			g='A';
		}
        else if(max >= 80){
			g='B';
		} 
        else if(max >= 70){
			g='C';
		} 
		else if(max >= 0){
			g='D';
		}
        else{
            g='F';
		}			
		System.out.println("Maximum score is " + max +" and Grade is "+ g );
    }
}	
}