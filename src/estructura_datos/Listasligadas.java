/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import java.util.Scanner;

/**
 *
 * @author Esneidy
 */
public class Listasligadas<T> {
    Scanner Teclado=new Scanner(System.in);
    private Nodo<T> p=null;
    
    public  void mostrarLista(){
       Nodo <T> q=p;
       while(q!=null){
           System.out.println(q.getValor());
           q=q.getLiga();
       }
   }
    public void CreaInicio(T valor){
       int num=0;
       Nodo <T>p=new Nodo<>();
       p.setValor(valor);
       p.setLiga(null);
       
       System.out.println("Desea ingresar otro nodo? SI:1 NO:2"+num);
       num=Teclado.nextInt();
       while(num==1){
       Nodo <T>q=new Nodo<>();
       q.setValor(valor);
       p=q.getLiga();
       q=p;
       System.out.println("Desea ingresar otro nodo? SI:1 NO:2"+num);
       num=Teclado.nextInt();
       }
 }
     public void CreaFinal(T valor){
           int num=0;
           Nodo <T>t=new Nodo<>();
           Nodo <T>p=new Nodo<>();
           p.setValor(valor);
           p.setLiga(null);
           p=t;
           System.out.println("Desea ingresar otro nodo? SI:1 NO:2"+num);
           num=Teclado.nextInt();
           while(num==1){
               Nodo <T>q=new Nodo<>();
               q.setValor(valor);
               q.setLiga(null);
               q=t.getLiga();
               t=q;
               System.out.println("Desea ingresar otro nodo? SI:1 NO:2"+num);
               num=Teclado.nextInt();
           }
       }
    public void RecorrerIterativo(T valor){
        Nodo <T>p=new Nodo<>();
        Nodo <T>q=new Nodo<>();
        p=q;
        while(q.getLiga()!=null){
            q.setValor(valor);
            q=q.getLiga();
            
        }
    }
    public void RecorrerRecursivo(T valor){
        Listasligadas<T> listaRetorno=new Listasligadas<>();
        Nodo <T>p=new Nodo<>();
        if(p!=null){
            p.setValor(valor);
            RecorrerRecursivo(p.getValor()); 
        }
    }
    public void InsertaInicio(T valor){
        Nodo <T>q=new Nodo<>();
        Nodo <T>p=new Nodo<>();
        q.setValor(valor);
        q.setLiga(p);
        q=p;
    }
    public void InsertarFinal(T valor){
        Nodo <T>t=new Nodo<>();
        Nodo <T>p=new Nodo<>();
        p=t;
        while(t.getLiga()!=null){
            t=t.getLiga();
        }
        Nodo <T>q=new Nodo<>();
        q.setValor(valor);
        q.setLiga(null);
        t.setLiga(q);
    }
    public void InsertarAntesDe(T valor, T x){
       Nodo <T>t=new Nodo<>();
        Nodo <T>p=new Nodo<>();
        Nodo <T>q=new Nodo<>();
        boolean bandera=false;
        q=p;
        while(!q.getValor().equals(x)&& bandera){
            if(q.getLiga()!=null){
                t=q;
                q=q.getLiga();
            }else{
                bandera=false;
            }
        }
        if(bandera){
            Nodo<T> nodo = new Nodo<>();
             if(p==q){
                 p=nodo.getLiga();
                 p=nodo;
             }else{
                 nodo=t.getLiga();
                 q=nodo.getLiga();
             }
            
        }else{
            System.out.println("El nodo dado mo se encuentra");
        }
    }
    public void InsertarDespuesDe(T valor, T x){
        Nodo <T>p=new Nodo<>();
        Nodo <T>q=new Nodo<>();
        boolean bandera=false;
        q=p;
        while(!q.getValor().equals(x)&& bandera){
            if(q.getLiga()!=null){
                q=q.getLiga();
            }else{
                bandera=false;
            }
        }
        if(bandera){
            Nodo <T>t=new Nodo<>();
            t.setValor(valor);
            
            q.setLiga(t.getLiga());
            q.setLiga(t);
        }else
            System.out.println("El nodo dado no se encuentra en la lista");
    }
    public void insertaDespuesDeX(T valor, T x ){
        Nodo<T> t = new Nodo<>();
        Nodo<T> s=new Nodo<>();
        Nodo<T> q=new Nodo<>();
        q = p;
        boolean bandera = false;
        
        while ((!q.getValor().equals(x)&& bandera)){
            if (q.getValor().equals(x)){
                bandera = true;
            }else{
                q = q.getLiga();
            }
        } 
        if (bandera){
            if (q.getLiga() != null){
                s = q.getLiga();
                q.setLiga(t);
                t.setLiga(s);
            }else{
                q.setLiga(t);
                t.setLiga(null);
            }
        } 
    }

    
}

