import java.util.Scanner;
 class qu14
{
public static void main(String[] args)
{int rows=5;

for (int m = 1; m <= rows; m++)
{
for (int n = 1; n < m; n++)
{
System.out.print(" ");
}
for (int p = m; p <= rows; p++)
{
System.out.print("* ");
}
System.out.println();
}
for (int m = rows-1; m >= 1; m--)
{
for (int n = 1; n < m; n++)
{
System.out.print(" ");
}
for (int p = m; p <= rows; p++)
{
System.out.print("* ");
}
System.out.println();
}
}
}

