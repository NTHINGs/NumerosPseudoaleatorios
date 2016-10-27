
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MauricioNTHINGs
 */
public class NewClass {
    public static void main(String args[]){
        int []a=new int[20];
        for(int i=0; i<a.length; i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA A"+(i+1)));
        }
        int a1=a[0];
        int a2=a[1];
        int a3=a[2];
        int a4=a[3];
        int a5=a[4];
        int a6=a[5];
        int a7=a[6];
        int a8=a[7];
        int a9=a[8];
        int a10=a[9];
        int a11=a[10];
        int a12=a[11];
        int a13=a[12];
        int a14=a[13];
        int a15=a[14];
        int a16=a[15];
        int a17=a[16];
        int a18=a[17];
        int a19=a[18];
        int a20=a[19];
        
        int n1=a3;
        int n2=a2;
        String n3=Integer.toString(a1)+";"+Integer.toString(a2+a6);
        String n4=Integer.toString(a2+a5)+";"+Integer.toString(a3+a4);
        String n5=Integer.toString(a2+a6+a8)+";"+Integer.toString(a1+a8);
        String n6=Integer.toString(a3+a12);
        String n7=Integer.toString(a1+a7)+";"+Integer.toString(a2+a5+a9)+";"+Integer.toString(a3+a4+a9)+";"+Integer.toString(a2+a6+a7);
        String n8=Integer.toString(a3+a12+a14)+";"+Integer.toString(a2+a5+a11+a20)+";"+Integer.toString(a2+a5+a9+a16);
        String n9=Integer.toString(a3+a12)+";"+Integer.toString(a2+a6+a8+a10);
        String n10=Integer.toString(a2+a5+a9+a15)+";"+Integer.toString(a2+a6+a8+a10);
        String nf=Integer.toString(a2+a5+a11+a10+a17)+";"+Integer.toString(a2+a5+a11+a18)+";"+Integer.toString(a2+a5+a9+a15+a19);
        
        System.out.println("N1="+n1);
        System.out.println("N2="+n2);
        System.out.println("N3="+n3);
        System.out.println("N4="+n4);
        System.out.println("N5="+n5);
        System.out.println("N6="+n6);
        System.out.println("N7="+n7);
        System.out.println("N8="+n8);
        System.out.println("N9="+n9);
        System.out.println("N10="+n10);
        System.out.println("NF="+nf);
    }
}
