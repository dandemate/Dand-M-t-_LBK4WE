package Feladat_4;

public class Test {
    public static void main(String[] args) {
        Autó[] a = {
            new Autó("ABC-123", 80),
            new Autó("ABC-521", 1000),
            new Autó("DFG-123", 50),
            new Autó("XXX-123", 600),
            new Autó("ABC-001", 200),
            new Teherautó(1000, "FGH-100", 500),
            new Teherautó(1000, "TTT-222", 100),
            new Teherautó(2000, "YYY-001", 200),
            new Teherautó(500, "HGF-003", 200),
            new Teherautó(4000, "ABC-100", 6000)
        };
        Teherautó[] b = {
            new Teherautó(1000, "AAA-001", 510),
            new Teherautó(5000, "AAA-010", 320),
            new Teherautó(4000, "AAA-011", 720),
            new Teherautó(3000, "AAA-100", 530),
            new Teherautó(6000, "AAA-101", 540),
            new Teherautó(10000, "AAA-110", 400),
            new Teherautó(500, "AAA-111", 500),
            new Teherautó(3000, "AAB-001", 300),
            new Teherautó(200, "AAB-010", 600),
            new Teherautó(2500, "AAB-011", 400),
            
        };
        
        rendezMaxSzállíthatóTeherCsökkenőleg(b);
        System.out.println("Legnagyobb teljesítményű autó: ");
        keresMaxMotorTeljesítmény(a);
    }
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        Teherautó tmp;
        for(int i=0; i<teher.length; i++){
            for(int j=0; j<teher.length; j++){
                if(teher[i].getMaxSzállíthatóTeher()>teher[j].getMaxSzállíthatóTeher()){
                    tmp = teher[i];
                    teher[i] = teher[j];
                    teher[j] = tmp;
                }  
            }
        }
        System.out.println("Max. Teherbírás Csökkenő Sorrendben:");
        for (Teherautó t : teher) {
            System.out.println("Teherbírás: "+t.getMaxSzállíthatóTeher()+" Rendszám: "+t.getRendszám()+
                    " Teljesítmény: "+t.getMotorTeljesítmény()+" Gyártási Dátum: "+t.getGyártásDátuma());
        }
    }
    
    public static Autó keresMaxMotorTeljesítmény(Autó[] auto){
        Autó max = auto[0];
        for(int i=1; i<auto.length; i++){
            if(max.getMotorTeljesítmény()<auto[i].getMotorTeljesítmény())
                max = auto[i];
        }
        System.out.println("Teljesítmény: "+max.getMotorTeljesítmény()+" Rendszám: "+max.getRendszám()+
                " Gyártási Dátum: "+max.getGyártásDátuma());
        return max;
    }
}
