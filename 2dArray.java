class 2dArray{
public static void main(String args[]){
// this is 2dArray example
Scanner in = new Scanner(System.in);
int[][] 2dArray = new int[2][2];
for(int i=0; i<2dArray.length;i++){
for(int j=0; j<2dArray[i].length;j++){
 2dArray[i][j]= in.nextInt();
}
}
System.out.println("Action is Completed");
  }
}
