abstract class Doctor{
    abstract void TreatPatient();
    void HospitalInfo(){
        System.out.println("MAX Hospital");
    }
    String Name;
    Doctor(String Name){
        this.Name=Name;
    }
}
class Dentist extends Doctor{
    Dentist(String Name){
        super(Name);
    }
    void TreatPatient(){
        System.out.println(Name + "is treating dental cases");
    }
}
class cardiologist extends Doctor{
    cardiologist(String Name){
        super(Name);
    }
    void TreatPatient(){
        System.out.println(Name + "is treating heart cases");
    }
}
public class Main {

    public static void main(String[] args) {
        Doctor d = new Dentist("Dr. James");
        Doctor c = new cardiologist("Dr. Rahul");
        d.HospitalInfo();
        d.TreatPatient();
        c.HospitalInfo();
        c.TreatPatient();

    }
}