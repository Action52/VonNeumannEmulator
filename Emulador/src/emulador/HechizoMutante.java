package emulador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisito
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class HechizoMutante {
    private String codigoEns;
    private String [] arCodigo;
    private int cuantasIns = 0;
    private int terminaPrograma = 0;
    public ArrayList <Integer> valor = new ArrayList<Integer>();
    public ArrayList <Object> queValor = new ArrayList<Object>();
    public ArrayList <Object> direccion = new ArrayList<Object>();
    
    public int dondeTermina() {
        return terminaPrograma;
    }
    
    public Integer getIndexOfValue(Object o) {
        return valor.get(direccion.indexOf(o));
    }
    

    
    public HechizoMutante(String codigoE) {
        codigoEns = codigoE;
        arCodigo = codigoEns.split(" ");
        cuantasIns = arCodigo.length;   
    }
    
    public String [] getArCodigo() {
        return arCodigo;
    }
    
    public String [] genInsRam(int i) {
        String elI = Integer.toString(i);
        String [] insRam = {elI, ""};
        insRam[1] = enDecimal(arCodigo[i]);
        if(insRam[1].equals("63"))
            terminaPrograma = i;
        return insRam;
    }
    
    
    public int getCuantasIns() {
        return cuantasIns;
    }
           
            
    public String aDecimal(int i) {
        String resultado;
        //try{
           // Thread.sleep(1000);
        //}
        //catch(InterruptedException ex) {
            
                resultado = arCodigo[i];
            
        //}
        return resultado;
    }
    
    public String[] creaFetch(int i) {
        String [] elfetch = { "FETCH", "[MAR] <- [PC]", "MMRead", "[PC] <- [PC] + 1", "[IR] <- [MDR]" };
        String [] linea = { elfetch[i] };
        return linea;
    }
    

    
    
    public String[] enMaquinal(String ins, int i, String dir) {
        
        String[] resultado = new String[1];
       
        switch(ins)
        {
            case "60":
               switch(dir) {
                   case "2":
                       String [] stringIN2 = { "IN Absoluto","[MAR] <- [IR] 2-0", "I/ORead", "[AC] <- [MDR]", "", "", "","" };
                       resultado[0] = stringIN2[i];
                       break;
                   case "3":
                       String [] stringIN3 = {"IN Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[MAR] <- [MDR] 2-0", "I/ORead", "[AC] <- [MDR]", "",""};
                       resultado[0] = stringIN3[i];
                       break;
               }
            break;
            case "61":
               switch(dir) {
                   case "2":
                       String [] stringOUT2 = { "OUT Absoluto","[MAR] <- [IR] 2-0", "[MDR] <- [AC]", "I/OWrite", "", "", "","" };
                       resultado[0] = stringOUT2[i];
                       break;
                   case "3":
                       String [] stringOUT3 = {"OUT Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[MAR] <- [MDR] 2-0", "[MDR] <- [AC]", "I/OWrite", "",""};
                       resultado[0] = stringOUT3[i];
                       break;
               }
            break;
            case "01":
               String[] stringCLA = {"CLA", "[AC] <- +00000", "", "", "", "", "", ""};
               resultado[0] = stringCLA[i];
            break;
            case "10":
               switch(dir) {
                   case "0":
                       String [] stringLDA0 = { "LDA Inmediato","[AC]5 <- [IR]2", "[AC]4-2 <- 000", "[AC]1-0 <- [IR]1-0", "", "", "","" };
                       resultado[0] = stringLDA0[i];
                       break;
                   case "1":
                       String [] stringLDA1 = { "LDA Relativo","[MAR] <- [PC] + [IR] 2-0", "MMRead", "[AC] <- [MDR]", "", "", "","" };
                       resultado[0] = stringLDA1[i];
                       break;
                   case "2":
                       String [] stringLDA2 = { "LDA Absoluto","[MAR] <- [IR] 2-0", "MMRead", "[AC] <- [MDR]", "", "", "","" };
                       resultado[0] = stringLDA2[i];
                       break;
                   case "3":
                       String [] stringLDA3 = {"LDA Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[MAR] <- [MDR] 2-0", "MMRead", "[AC] <- [MDR]", "",""};
                       resultado[0] = stringLDA3[i];
                       break;
               }
            break;
            case "11":
               switch(dir) {
                   case "1":
                       String [] stringSTA1 = { "STA Relativo","[MAR] <- [PC] + [IR] 2-0", "[MDR] <- [AC]", "MMWrite", "", "", "","" };
                       resultado[0] = stringSTA1[i];
                       break;
                   case "2":
                       String [] stringSTA2 = { "STA Absoluto","[MAR] <- [IR] 2-0", "[MDR] <- [AC]", "MMWrite", "", "", "","" };
                       resultado[0] = stringSTA2[i];
                       break;
                   case "3":
                       String [] stringSTA3 = {"STA Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[MAR] <- [MDR] 2-0", "[MDR] <- [AC]", "MMWrite", "",""};
                       resultado[0] = stringSTA3[i];
                       break;
               }
            break;
            case "20":
               switch(dir) {
                   case "0":
                       String [] stringADD0 = { "ADD Inmediato","[AC] <- [AC] + [IR]2 000 [IR]1-0", "", "", "", "", "","" };
                       resultado[0] = stringADD0[i];
                       break;
                   case "1":
                       String [] stringADD1 = { "ADD Relativo","[MAR] <- [PC] + [IR] 2-0", "MMRead", "[AC] <- [AC] + [MDR]", "", "", "","" };
                       resultado[0] = stringADD1[i];
                       break;
                   case "2":
                       String [] stringADD2 = { "ADD Absoluto","[MAR] <- [IR] 2-0", "MMRead", "[AC] <- [AC] + [MDR]", "", "", "","" };
                       resultado[0] = stringADD2[i];
                       break;
                   case "3":
                       String [] stringADD3 = {"ADD Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[MAR] <- [MDR] 2-0", "MMRead", "[AC] <- [AC] + [MDR]", "",""};
                       resultado[0] = stringADD3[i];
                       break;
               }
            break;
            case "21":
               switch(dir) {
                   case "0":
                       String [] stringSUB0 = { "SUB Inmediato","[AC] <- [AC] + [IR]2 000 [IR]1-0", "", "", "", "", "","" };
                       resultado[0] = stringSUB0[i];
                       break;
                   case "1":
                       String [] stringSUB1 = { "SUB Relativo","[MAR] <- [PC] + [IR] 2-0", "MMRead", "[AC] <- [AC] - [MDR]", "", "", "","" };
                       resultado[0] = stringSUB1[i];
                       break;
                   case "2":
                       String [] stringSUB2 = { "SUB Absoluto","[MAR] <- [IR] 2-0", "MMRead", "[AC] <- [AC] - [MDR]", "", "", "","" };
                       resultado[0] = stringSUB2[i];
                       break;
                   case "3":
                       String [] stringSUB3 = {"SUB Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[MAR] <- [MDR] 2-0", "MMRead", "[AC] <- [AC] - [MDR]", "",""};
                       resultado[0] = stringSUB3[i];
                       break;
               }
            break;
            case "30":
               switch(dir) {
                   case "1":
                       String [] stringJMP1 = { "JMP Relativo","[PC] <- [PC] + [IR] 2-0", "", "", "", "", "","" };
                       resultado[0] = stringJMP1[i];
                       break;
                   case "2":
                       String [] stringJMP2 = { "JMP Absoluto","[PC] <- [IR] 2-0", "", "", "", "", "","" };
                       resultado[0] = stringJMP2[i];
                       break;
                   case "3":
                       String [] stringJMP3 = {"JMP Indirecto","[MAR] <- [IR] 2-0", "MMRead", "[PC] <- [MDR] 2-0", "", "", "",""};
                       resultado[0] = stringJMP3[i];
                       break;
               }
            break;
            case "31":
               switch(dir) {
                   case "1":
                       String [] stringJMZ1 = { "JMZ Relativo","Si Z = 1, [PC] <- [PC] + [IR]2-0", "", "", "", "", "","" };
                       resultado[0] = stringJMZ1[i];
                       break;
                   case "2":
                       String [] stringJMZ2 = { "JMZ Absoluto","Si Z = 1, [PC] <- [IR] 2-0", "", "", "", "", "","" };
                       resultado[0] = stringJMZ2[i];
                       break;
                   case "3":
                       String [] stringJMZ3 = {"JMZ Indirecto","Si Z = 1, [MAR] <- [IR] 2-0", "MMRead", "[PC] <- [MDR] 2-0", "", "", "",""};
                       resultado[0] = stringJMZ3[i];
                       break;
               }
            break;
            case "32":
               switch(dir) {
                   case "1":
                       String [] stringJMN1 = { "JMN Relativo","Si N = 1, [PC] <- [PC] + [IR]2-0", "", "", "", "", "","" };
                       resultado[0] = stringJMN1[i];
                       break;
                   case "2":
                       String [] stringJMN2 = { "JMN Absoluto","Si N = 1, [PC] <- [IR] 2-0", "", "", "", "", "","" };
                       resultado[0] = stringJMN2[i];
                       break;
                   case "3":
                       String [] stringJMN3 = {"JMN Indirecto","Si N = 1, [MAR] <- [IR] 2-0", "MMRead", "[PC] <- [MDR] 2-0", "", "", "",""};
                       resultado[0] = stringJMN3[i];
                       break;
               }
            break;
        }
        return resultado;
    }
    

    
    public String enDecimal(String x) {
        String resultado = "";
        String [] sinComas = x.split(",");
            for(int j = 0; j < sinComas.length; j++) {
                switch(sinComas[j])
                {
                    case "IN":
                        sinComas[j] = "60";
                        break;
                    case "OUT":
                        sinComas[j] = "61";
                        break;
                    case "LDA":
                        sinComas[j] = "10";
                        break;
                    case "STA":
                        sinComas[j] = "11";
                        break;
                    case "CLA":
                        sinComas[j] = "01000";
                        break;
                    case "JMZ":
                        sinComas[j] = "31";
                        break;
                    case "JMP":
                        sinComas[j] = "30";
                        break;
                    case "JMN":
                        sinComas[j] = "32";
                        break;
                    case "ADD":
                        sinComas[j] = "20";
                        break;
                    case "SUB":
                        sinComas[j] = "21";
                        break;
                    case "HLT":
                        sinComas[j] = "63";
                        break;
                        
                    case "I":
                        sinComas[j] = "0";
                        break;
                    case "R":
                        sinComas[j] = "1";
                        break;
                    case "A":
                        sinComas[j] = "2";
                        break;
                    case "D":
                        sinComas[j] = "3";
                        break; 
                        
                }
                resultado += sinComas[j];
            }
        
        return resultado;
    }
    

    
//    public int getDataRamLength() {
//        return dataRam.size();
//    }
//    
//    public String [] getDataRam(int i) {
//        int j = i;
//        i = (cuantasIns+1) + i;
//        
//        String elI = Integer.toString(i);
//        String [] insRam = {elI, ""};
//        insRam[1] = enDecimal(dataRam.get(j));
//        return insRam;
//    }
            
    
           
}
