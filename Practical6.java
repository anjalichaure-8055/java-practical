class Practical67{
void displayPattern(int n)
{
for(int line=1;line<=n;line++)
{
for(int space=1;space<=n-line;space++)
{
System.out.print(" ");
}
for(int star=1;star<=2*line-1;star++)
{
System.out.print("+");
}
System.out.println();
}
for (int line = 1; line<=2; line++) {
  for (int space = 1; space <=line; space++) {
            
                System.out.print(" ");
            }
            
            
            for (int star = 1; star <=3-2*(line-1); star++) {
                System.out.print("+");
            }
            System.out.println(); 
        }


for(int line=1;line<=4;line++)
{
for(int space=4-line;space>0;space--){
System.out.print(" ");
}
for(int i=2*line-1;i>0;i--)
{
if(i%2!=0)
{
System.out.print("*");
  else
{
System.out.print("+");
}
}
System.out.println();
}
for(int line=1;line<=4;line++)
{
for(int space=1;space<=line;space++)
{
System.out.print(" ");
}
for(int star=1;star<=5-2*(line-1);star++)
{
if(star%2!=0)
{
System.out.print("*");
}
else{
System.out.print("+");
}
}
System.out.println();
}
  for(int line=1;line<=n;line++)
{
for(int space=n - line;space >0;space--)
{ 
System.out.print(" ");
}
for(int i=2*line -1; i >0;i--)
{
if(i%2 == 0)
{
System.out.print(" ");
}
else{
System.out.print("+");
}
}
System.out.println();
}
for(int line=n-1;line>0;line--){
for(int space=n-line;space>0;space--)
{
System.out.print(" ");
}
for(int i=2*line-1;i>0;i--)
  {
if(i%2==0)
{
System.out.print(" ");
}
else{
System.out.print("*");
}
}
System.out.println();
}
}




public static void main(String[] args){
Practical67 obj=new Practical67();
obj.displayPattern(3);
}
}
