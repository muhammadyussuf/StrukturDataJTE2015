import java.math.BigInteger;
import java.util.Stack;
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tumpukan
{
    private Node atas;
    private Node bawah;
    Stack <BigInteger> tumpukan = new Stack<BigInteger>();
    
    public Tumpukan(){
        atas=null;
        bawah=null;
    }
    
    public void tumpuk(BigInteger data){
        Node baru=new Node (data);
        baru.berikut=null;
        
        if(atas==null){
            atas =baru;
            bawah =baru;
        } else{
            atas.berikut=baru;
            atas=baru;
        }
    }

    
    public BigInteger ambil(){
        
        return null;
        }
    
    public BigInteger atas(){
        if(atas==null)
            return null;
        else {
            return atas.data;
        }
    }
    
    public BigInteger bawah(){
        if(bawah!=null)
            return bawah.data;
        else{
            return null;
        }
    }
   
}