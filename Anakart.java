
public class Anakart {
    
    
    private String model;
    private String uretici;
    private int yuvasayisi;
    private String isletimsistemi;
    
    public Anakart(String model,String uretici,int yuvasayisi,String isletimsistemi)
    {
        this.model=model;
        this.uretici=uretici;
        this.yuvasayisi=yuvasayisi;
        this.isletimsistemi=isletimsistemi;
    }
    
    public void isletimsistemiyukle(String isletimsistemi)
    {
        
        System.out.println("İşletim sistemi yüklendi... Yeni işletim sistemi: "+isletimsistemi);
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the yuvasayisi
     */
    public int getYuvasayisi() {
        return yuvasayisi;
    }

    /**
     * @param yuvasayisi the yuvasayisi to set
     */
    public void setYuvasayisi(int yuvasayisi) {
        this.yuvasayisi = yuvasayisi;
    }

    /**
     * @return the isletimsistemi
     */
    public String getIsletimsistemi() {
        return isletimsistemi;
    }

    /**
     * @param isletimsistemi the isletimsistemi to set
     */
    public void setIsletimsistemi(String isletimsistemi) {
        this.isletimsistemi = isletimsistemi;
    }
    
}
