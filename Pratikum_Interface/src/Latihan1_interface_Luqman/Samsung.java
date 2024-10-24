/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1_interface_Luqman;

/**
 *
 * @author luqma
 */
public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;
    
    public Samsung (){
        this.volume = 50;
    }
    
    @Override
    public void powerOn (){
        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat Datang di Samsung");
        System.out.println("Android versi 29");
        
    }
    
    @Override
    public void powerOff (){
        isPowerOn = false;
        System.out.println("Handphone mati");
    }
    
    @Override 
    public void volumeUp (){
        if (isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume sudah maksimal");
                System.out.println("sudah "+ this.getVolume() + "%");
            }
            else {
                this.volume += 10;
                System.out.println("Volume sekarang: "+this.getVolume());
            }
        } else{
            System.out.println("Nyalakan dulu HP nya");
        }
    }
    @Override 
    public void volumeDown (){
        if(isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang :"+this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu hp nya");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
}
