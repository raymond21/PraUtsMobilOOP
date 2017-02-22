public class mobil25 {
    int kecMax;
    int percepatan;
    int kecActual;
    boolean started;
    int Gigi; 

    public mobil25() {
     
    }

   
    
    public mobil25(int kecMax, int percepatan, int kecActual) {
        this.kecMax = kecMax;
        this.percepatan = percepatan;
        this.kecActual = kecActual;
        this.started = false;
        this.Gigi = 0;
    }
//get
    public int getKecMax() {
        return kecMax;
    }

    public int getPercepatan() {
        return percepatan;
    }

    public int getKecActual() {
        return kecActual;
    }

    public boolean isStarted() {
        return started;
    }
    
    //set
    public void setKecMax(int kecMax) {
        this.kecMax = kecMax;
    }
    public void setPercepatan(int percepatan) {
        this.percepatan = percepatan;
    }

    public void setKecActual(int kecActual) {
        this.kecActual = kecActual;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
    
    
public void start(){
   if(!started) {
       this.setKecActual(0);
      
   }
}
public void stop(){
    this.setKecActual(0);
    this.started = false;
    
}
public void rem(){
    this.setKecActual(getKecActual()/2);
}
public void gantiGigi(int Gigi){

    switch (Gigi) {
        case 0 :
                this.setPercepatan(0);
                break;
        case 1 :
                this.setPercepatan(15);
                break;
        case 2 :
                this.setPercepatan(20);
                break;
        case 3 :
                this.setPercepatan(30);
                break;
        case 4 :
                this.setPercepatan(50);
                break;
        case 5:
                this.setPercepatan(35);
                break;
    }
}
public void gas(){
    if (this.getKecActual()+this.getPercepatan() < this.getKecMax())
    this.setKecActual(this.getKecActual()+this.getPercepatan());
    else this.setKecActual(this.getKecMax());
    }
}

