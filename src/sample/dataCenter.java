package sample;

public class  dataCenter
{
    static int firstgrade;
    static int secondgrade;

    public static int getFirstgrade() {
        return firstgrade;
    }

    public static void setFirstgrade(int firstgrade) {
        dataCenter.firstgrade = firstgrade;
    }

    public static int getSecondgrade() {
        return secondgrade;
    }

    public static void setSecondgrade(int secondgrade) {
        dataCenter.secondgrade = secondgrade;
    }

    public Quiz CS(){
        
        Quiz cs = new Quiz();
        
        cs.msq[0] = new msqQuestion("What is the full form of CPU?" , "Central Process Unit" , "Central Processing Unit" 
            , "Central Programming Unit" , "Central Progressive Unit" , "Central Processing Unit");
            
        cs.msq[1] = new msqQuestion("What is the full form of ALU ?" , "Arithmetic Logic Unit" , "Arithmetic Local Unit" 
            , "Advance Logical Unit" , "None of these" , "Arithmetic Logic Unit");

        cs.msq[2] = new msqQuestion(" What is the full form of MU?" , "Management Unit" , "Masked Unit" 
            , "Main Unit" , "Memory Unit" , "Memory Unit");

        cs.msq[3] = new msqQuestion("Which is not a correct type of a computer?" , "Mini Frame Computer" , "Super Computer" 
            , "Workstations" , "Personal Computer" , "Mini Frame Computer");



        cs.tF[0] = new msqQuestion("The maximun number of dimensions an array in C is two" , "True" , "False" , "False");
        cs.tF[1] = new msqQuestion("Is C support structural programing?" , "True" , "False" , "True");
        cs.tF[2] = new msqQuestion("CPU is considered as Brain of the Computer?" , "True" , "False" , "True");
        cs.tF[3] = new msqQuestion("Communication Unit is the full form of CU?" , "True" , "False" , "False");



        cs.ShortA[0] = new msqQuestion("To take an input in C we use " , "" , "scanf()");
        cs.ShortA[1] = new msqQuestion("The parameter passing mechanism for an array is" , "" , "call by reference");


        return cs;

    }


    public Quiz IT(){  
        Quiz it = new Quiz();
        
        it.msq[0] = new msqQuestion("What is the output of 'John' + ' ' + 'Doe' ?" , "John Doe" , "John +  + Doe "
        	, "Error" , "somthing else" , "John Doe");
            
        it.msq[1] = new msqQuestion("HTML stands for?" , "Hyper Text Markup Language" , "High Text Markup Language" 
            , " Hyper Tabular Markup Language" , "None of these" , "Hyper Text Markup Language");

        it.msq[2] = new msqQuestion("which of the following tag is used to mark a begining of paragraph ?" , "<TD>" , "<br>" 
            , "<P>" , "<TR>" , "<P>");

        it.msq[3] = new msqQuestion("Correct HTML tag for the largest heading is" , "<head>" , "<h6>" 
            , "<heading>" , "<h1>" , "<h1>");



        it.tF[0] = new msqQuestion(" www is based on Client-server?" , "True" , "False" , "True");
        it.tF[1] = new msqQuestion("Web pages starts with <Body>?" , "True" , "False" , "False");
        it.tF[2] = new msqQuestion("<Base> tag is designed to appear only between <HEAD>" , "True" , "False" , "True");
        it.tF[3] = new msqQuestion("can you open a link in a new browser window with <a href = 'url'.new>?" , "True" , "False" , "False");



        it.ShortA[0] = new msqQuestion("Any part of the graphic that is not included in another hot zone is considered to be part of. ...." , "" , "default");
        it.ShortA[1] = new msqQuestion("he tag is used to creates a number list" , "" , "<LI>");

        return it;
    }



    public Quiz PL2(){
        
        Quiz pl2 = new Quiz();
        
        pl2.msq[0] = new msqQuestion("Who is known as father of Java Programming Language?" , "James Gosling" , "M. P Java" 
            , "Blais Pascal" , "Charel Babbage" , "James Gosling");
            
        pl2.msq[1] = new msqQuestion("java control statements break, continue, return, try-catch-finally and assert belongs to?" , "Selection statements" , "Loop Statements" 
            , "Transfer statements" , "None of these" , "Transfer statements");

        pl2.msq[2] = new msqQuestion("What is byte code in Java?" , "Code generated by a Java compiler" , "Code generated by a Java Virtual Machine" 
            , "Name of Java source code file" , "Block of code written inside a class" , "Code generated by a Java compiler");

        pl2.msq[3] = new msqQuestion("Which of the following are not Java keywords ?" , "double" , "then" 
            , "this" , "instanceof" , "then");



        pl2.tF[0] = new msqQuestion("Is Java support OOP?" , "True" , "False" , "True");
        pl2.tF[1] = new msqQuestion("Is Java support structural programing?" , "True" , "False" , "False");
        pl2.tF[2] = new msqQuestion("Method is a template for creating different objects" , "True" , "False" , "False");
        pl2.tF[3] = new msqQuestion("Java language was initially called as Oak" , "True" , "False" , "True");



        pl2.ShortA[0] = new msqQuestion("To take an input we use java. ...." , "" , "util.Scanner");
        pl2.ShortA[1] = new msqQuestion("To print string in java we use ...." , "" , "System.out.println()");


        return pl2;

    }
   
}







