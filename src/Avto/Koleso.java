package Avto;


import java.util.Scanner;

public class Koleso {
    
    private double shirina;
    private double visota;
    private double diametr;
    private String tip_diska;
    private int id;
    
    private static int id_kolesa = 0;
    private static int kolvo_koles = 0;
    
    public Koleso()
    {
        this.diametr = 17;
        this.shirina = 225;
        this.visota = 55;
        this.tip_diska = "Литье";
        this.id = 050120 + kolvo_koles;
        kolvo_koles = kolvo_koles + 1;
    }
    
    public Koleso(int diametr)
    {
        this.diametr = diametr;
        this.shirina = 225;
        this.visota = 55;
        this.tip_diska = "Литье";
        this.id = 050120 + kolvo_koles;
        kolvo_koles = kolvo_koles + 1;
    }
    
    public void new_koleso_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        
        System.out.println("Введите ширину: ");
        do
        {
            if (in.hasNextDouble()){
                this.shirina = in.nextDouble();
            }
            else
            {
                System.out.println("Ширина введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.shirina < 0);
        
        System.out.println("Введите высоту: ");
        do
        {
            if (in.hasNextDouble()){
                this.visota = in.nextDouble();
            }
            else
            {
                System.out.println("Высота введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.visota < 0);
        
        System.out.println("Введите диаметр: ");
        do
        {
            if (in.hasNextDouble()){
                this.diametr = in.nextDouble();
            }
            else
            {
                System.out.println("Диаметр введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.diametr < 0);
        
        System.out.println("Введите тип диска: ");
        do
        {
            if (in.hasNextLine()){
                this.tip_diska = in.nextLine();
            }
            else
            {
                System.out.println("Тип диска введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.tip_diska == "");
        id = id_new();
        kolvo_koles = kolvo_koles + 1;
    }
    
    public static int id_new()
    {
        id_kolesa = id_kolesa + 1;
        return id_kolesa;
    }
    
    public static int id_return()
    {
        return id_kolesa;
    }
    
    public static int kolvo_return()
    {
        return kolvo_koles;
    }
    
    public static void koleso_del()
    {
        kolvo_koles = kolvo_koles - 1;
    }
    
    public void new_koleso(double shirina, double diametr, double visota, String tip_diska)     //конструктор с параметрами
    {
        this.shirina = shirina;
        this.diametr = diametr;
        this.tip_diska = tip_diska;
        this.visota = visota;
        id = id_new();
        kolvo_koles = kolvo_koles + 1;
        
    }
    
    public void prosmotr_koleso()       //функция просмотра информации о колесе
    {
        System.out.println("ID: " + this.id);
        System.out.println("Ширина: " + this.shirina);
        System.out.println("Высота: " + this.visota);
        System.out.println("Диаметр: " + this.diametr);      
        System.out.println("Тип диска: " + this.tip_diska);
    }

}
