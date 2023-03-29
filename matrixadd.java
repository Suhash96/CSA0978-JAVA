import java.util.Scanner;
class MatrixAddition
{
public static void main(String[] args) {
int[][] firstMatrix = {{1, 2, 3}, {1, 5, 6}, {1, 8, 9}};
int[][] secondMatrix = {{1, 8, 7}, {1, 5, 4}, {1, 2, 1}};
int[][] sumMatrix = new int[3][3];
 for (int i = 0; i < 3; i++) 
{
 for (int j = 0; j < 3; j++)
{
 sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
 }
 }
System.out.println("The sum of the matrices is:");
for (int i = 0; i < 3; i++)
{
 for (int j = 0; j < 3; j++) {
 System.out.print(sumMatrix[i][j] + " ");
 }
 System.out.println();
 }}}
