import java.io.*;
class Hotel2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvft,tnvfd=0,fd,tfd=0,amt=0,tamt=0,totalamt=0,totalmt=0,d,totald=0,damt=0;
        double vat=0,amount1=0,amount2=0,amount3=0,amount,at;
        String str="",ans,choice="Y";int i,j,ch;
        String a="\n\n================================**** -----WELCOME TO THE COYA RESTAURANT---- ****================================\n\n\t\t\t\t\t\t\tABOUT THE RESTAURANT:\n\t\t\t\t\tCOYA is an award- winning Latin American venue,\n\t\t\t\t\twhich is home to a contemporary Peruvian restaurant,\n\t\t\t\t\tcolourful Pisco Lounge and an exclusive Members’ Club worldwide.\n\n\t\t\t\t\tCOYA takes you to an unforgettable journey from the\n\t\t\t\t\tmoment you step into the venue and it can be felt\n\t\t\t\t\tthrough sight, smell, taste, hearing and touch.";
        String b="\n\n\t\t\t\t\tThe menu at COYA keeps traditional elements of Peruvian\n\t\t\t\t\tcooking and the restaurant welcomes a diverse clientele\n\t\t\t\t\ttofeast on a variety of palate teasing dishes as\n\t\t\t\t\tthey are transported to the essence of Peru.";
        String c=a.concat(b);
        char chr[]=c.toCharArray();
        for(i=0;i<chr.length;i++)
        {
            for(j=0;j<=100000000;j++){}
            if(chr[i]=='.')
            System.out.print("\n==================================================================================================================================");
            else
            System.out.print(chr[i]);
        }
        System.out.println();
        System.out.println("\n\t\t\t\t\t  *\"LETS' HAVE A LOOK AT THE MENU\"*");
        method(1000);
        System.out.println("\t\t\t\t\t**\"WHICH ONE WOULD YOU LIKE TO HAVE FIRST\"**");
        method(1000);
        System.out.println("STARTER CORNER: 1");
        method(1000);
        System.out.println("MAIN COURSE: 2");
        method(1000);
        System.out.println("DESSERTS: 3");
        System.out.println();
        method(1500);
        System.out.println("PRESS 1 FOR STARTERS");
        method(1000);
        System.out.println("PRESS 2 FOR MAIN COURSE");
        method(1000);
        System.out.println("PRESS 3 FOR DESSERTS");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:     
            System.out.println("\t\t\t\t\t**\"WELCOME TO STARTER MENU\"**");
            method(1000);
            System.out.println("\t\t\t\tENTER 'VS' FOR VEG STARTER AND 'NVS' FOR NON VEG STARTER ");
            str=br.readLine();
            if(str.equalsIgnoreCase("VS"))
            {
                System.out.println("STARTERS:\t\t\t\tRs.");
                method(1000);
                System.out.println("1.PANEER TIKKA\t\t\t\t 130");
                method(500);
                System.out.println("2.VEG SEEKH KEBAB\t\t\t 120…");
class restaurantManagement
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvft,tnvfd=0,fd,tfd=0,amt=0,tamt=0,totalamt=0,totalmt=0,d,totald=0,damt=0;
        double vat=0,amount1=0,amount2=0,amount3=0,amount,at;
        String str="",ans,choice="Y";int i,j,ch;
        String a="\n\n================================**** -----WELCOME TO THE COYA RESTAURANT---- ****================================\n\n\t\t\t\t\t\t\tABOUT THE RESTAURANT:\n\t\t\t\t\tCOYA is an award- winning Latin American venue,\n\t\t\t\t\twhich is home to a contemporary Peruvian restaurant,\n\t\t\t\t\tcolourful Pisco Lounge and an exclusive Members’ Club worldwide.\n\n\t\t\t\t\tCOYA takes you to an unforgettable journey from the\n\t\t\t\t\tmoment you step into the venue and it can be felt\n\t\t\t\t\tthrough sight, smell, taste, hearing and touch.";
        String b="\n\n\t\t\t\t\tThe menu at COYA keeps traditional elements of Peruvian\n\t\t\t\t\tcooking and the restaurant welcomes a diverse clientele\n\t\t\t\t\ttofeast on a variety of palate teasing dishes as\n\t\t\t\t\tthey are transported to the essence of Peru.";
        String c=a.concat(b);
        char chr[]=c.toCharArray();
        for(i=0;i<chr.length;i++)
        {
            for(j=0;j<=100000000;j++){}
            if(chr[i]=='.')
            System.out.print("\n==================================================================================================================================");
            else
            System.out.print(chr[i]);
        }
        System.out.println();
        System.out.println("\n\t\t\t\t\t  *\"LETS' HAVE A LOOK AT THE MENU\"*");
        method(1000);
        System.out.println("\t\t\t\t\t**\"WHICH ONE WOULD YOU LIKE TO HAVE FIRST\"**");
        method(1000);
        System.out.println("STARTER CORNER: 1");
        method(1000);
        System.out.println("MAIN COURSE: 2");
        method(1000);
        System.out.println("DESSERTS: 3");
        System.out.println();
        method(1500);
        System.out.println("PRESS 1 FOR STARTERS");
        method(1000);
        System.out.println("PRESS 2 FOR MAIN COURSE");
        method(1000);
        System.out.println("PRESS 3 FOR DESSERTS");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:     
            System.out.println("\t\t\t\t\t**\"WELCOME TO STARTER MENU\"**");
            method(1000);
            System.out.println("\t\t\t\tENTER 'VS' FOR VEG STARTER AND 'NVS' FOR NON VEG STARTER ");
            str=br.readLine();
            if(str.equalsIgnoreCase("VS"))
            {
                System.out.println("STARTERS:\t\t\t\tRs.");
                method(1000);
                System.out.println("1.PANEER TIKKA\t\t\t\t 130");
                method(500);
                System.out.println("2.VEG SEEKH KEBAB\t\t\t 120");
                method(500);
                System.out.println("3.HARA BHARA KEBAB\t\t\t 110");
                method(500);
                System.out.println("4.SHANGHAI SPRING ROLL\t\t\t 150");
                method(500);
                System.out.println("5.AMERICAN CORN BALL\t\t\t 150");
                method(500);
                System.out.println("6.CRISPY AMERICAN CORN\t\t\t 140");
                method(500);
                System.out.println("7.CRISPY BABY CORN\t\t\t 140");
                method(500);
                System.out.println("8.CRISPY MUSHROOM\t\t\t 125");
                method(500);
                System.out.println("9.CRISPY CHILLY POTATO\t\t\t 120");
                method(500);
                System.out.println("10.CRISPY CHILLY CHANA\t\t\t 150");
                method(500);
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("\nCHOOSE YOUR STARTER FROM THE ABOVE LIST BY ENTERING NO.");
                    vstr=Integer.parseInt(br.readLine());
                    System.out.println("ENTER THE NUMBER OF STARTERS YOU WANT:");
                    tvstr=Integer.parseInt(br.readLine());
                    if(vstr==1)
                    amt=tvstr*130;
                    if(vstr==2||vstr==9)
                    amt=tvstr*120;
                    if(vstr==3)
                    amt=tvstr*110;
                    if(vstr==4||vstr==5||vstr==10)
                    amt=tvstr*150;
                    if(vstr==6||vstr==7)
                    amt=tvstr*140;
                    if(vstr==8)
                    amt=tvstr*125;
                    tamt=tamt+amt;
                    System.out.println("DO YOU WANT TO PLACE MORE ORDERS??ENTER Y/N");
                    choice=br.readLine();
                }
            }
            if(str.equalsIgnoreCase("NVS"))
            {
                System.out.println("\t\tNON VEGETARIAN STARTERS:");
                System.out.println("\nNON VEG STARTERS:\t\t\tRs.");
                method(1000);
                System.out.println("1.CHICKEN TIKKA\t\t\t\t 170");
                method(500);
                System.out.println("2.MURG RESHMI KEBAB\t\t\t 170");
                method(500);
                System.out.println("3.MURG CHILLI KEBAB\t\t\t 160");
                method(500);
                System.out.println("4.CHICKEN SEEKH KEBAB\t\t\t 180");
                method(500);
                System.out.println("5.TANGDI KEBAB\t\t\t\t 180");
                method(500);
                System.out.println("6.MURG TANDOORI\t\t\t\t 190");
                method(500);
                System.out.println("7.FISH AJWANI TIKKA\t\t\t 190");
                method(500);
                System.out.println("8.CHILLI CHICKEN\t\t\t 160");
                method(500);
                System.out.println("9.DRUMS OF HEAVEN\t\t\t 180");
                method(500);
                System.out.println("10.SHANGHI CHICKEN\t\t\t 180");
                method(500);
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("\nCHOOSE YOUR STARTER FROM THE ABOVE LIST BY ENTERING NO.");
                    nvstr=Integer.parseInt(br.readLine());
                    System.out.println("ENTER NUMBER OF STARTERS YOU WANT:");
                    tnvstr=Integer.parseInt(br.readLine());
                    if(nvstr==1||nvstr==2)
                    amt=tnvstr*170;
                    if(nvstr==3)
                    amt=tnvstr*160;
                    if(nvstr==4 || nvstr==5)
                    amt=tnvstr*180;
                    if(nvstr==6 || nvstr==7)
                    amt=tnvstr*190;
                    if(nvstr==8)
                    amt=tnvstr*160;
                    if(nvstr==9||nvstr==10)
                    amt=tnvstr*180;
                    tamt=tamt+amt;
                    System.out.println("DO YOU WANT TO PLACE MORE ORDERS??ENTER Y/N");
                    choice=br.readLine();
                }
            }   
            choice="Y";
            System.out.println("DO YOU WANT TO HAVE THE MAIN COURSE AND DESSERTS NOW ?");
            System.out.println("IF YES THEN ENTER 'YES' AND IF NO ENTER 'NO'");
            String yesorno=br.readLine();
            if(yesorno.equalsIgnoreCase("no"))
            {
                method(3000);
                System.out.println("\f");
                break;
            }        
            else
            {
                method(3000);
                System.out.println("\f");
            }
            
            case 2:
            System.out.println("\t\t\t\t\t**\"WELCOME TO MAIN COURSE: INDIAN & CHINESE DISHES\"**");
            System.out.println("\t\t\tENTER 'V' FOR INDIAN VEG DISHES, 'NV' FOR INDIAN NON VEG DISHES AND 'C' FOR CHINESE DISHES");
            str=br.readLine();
            if(str.equalsIgnoreCase("V"))
            {
                System.out.println("\t\tWELCOME TO INDIAN VEG DISHES");
                System.out.println("\nINDIAN VEG DISHES:\t\t\t\t\tRs.");
                method(1000);
                System.out.println("1. SHAHI PANEER\t\t\t\t\t\t200");
                method(500);
                System.out.println("2. NAVRATAN KORMA\t\t\t\t\t180");
                method(500);
                System.out.println("3. KADAHI PANEER\t\t\t\t\t190");
                method(500);
                System.out.println("4. MALAI KOFTA\t\t\t\t\t\t170");
                method(500);
                System.out.println("5. KADAHI VEGETABLES\t\t\t\t\t165");
                method(500);
                System.out.println("6. VEGETABLE PAKEEZA\t\t\t\t\t160");
                method(500);
                System.out.println("7. SHABNAM CURRY\t\t\t\t\t170");
                method(500);
                System.out.println("8. MAKAI CORN PALAK\t\t\t\t\t165");
                method(500);
                System.out.println("9. VEG PULAO\t\t\t\t\t\t175");
                method(500);
                System.out.println("10.KASHMIRI PULAO\t\t\t\t\t190");
                method(500);
                System.out.println("11.BUTTER NAAN\t\t\t\t\t\t60");
                method(500);
                System.out.println("12.STUFFED KULCHA\t\t\t\t\t165");
                method(500);
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("\nCHOOSE YOUR MAIN VEG COURSE FROM THE LIST BY ENTERING NO. ");
                    vfd=Integer.parseInt(br.readLine());
                    System.out.println("HOW MANY PLATES DO YOU WANT TO PLACE FROM THE ABOVE LIST?");
                    tvfd=Integer.parseInt(br.readLine());
                    if(vfd==1)
                    amt=tvfd*200;
                    if(vfd==2)
                    amt=tvfd*180;
                    if(vfd==3||vfd==10)
                    amt=tvfd*190;
                    if(vfd==4||vfd==7)
                    amt=tvfd*170;
                    if(vfd==5||vfd==8||vfd==12)
                    amt=tvfd*165;
                    if(vfd==6)
                    amt=tvfd*160;
                    if(vfd==9)
                    amt=tvfd*175;
                    if(vfd==11)
                    amt=tvfd*160;
                    totalamt+=amt;
                    System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                    choice=br.readLine();
                }
            }
            if(str.equalsIgnoreCase("NV"))
            {
                System.out.println("\t\tWELCOME TO INDIAN NON VEG DISHES");
                method(500);
                System.out.println("\nINDIAN NON VEG DISHES:\t\t\t\t\tRs.");
                method(500);
                System.out.println("1.CHICKEN TIKKA MASALA\t\t\t\t\t210");
                method(500);
                System.out.println("2.CHICKEN TIKKA LABADAR\t\t\t\t\t230");
                method(500);
                System.out.println("3.CHICKEN BHARTA\t\t\t\t\t200");                
                method(500);
                System.out.println("4.KADAHI CHICKEN\t\t\t\t\t235");
                method(500);
                System.out.println("5.MUGHLAI CHICKEN\t\t\t\t\t250");
                method(500);
                System.out.println("6.MURG NAVRATAN KURMA\t\t\t\t\t250");
                method(500);
                System.out.println("7.CHICKEN DO PYAZA\t\t\t\t\t240");
                method(500);
                System.out.println("8.MURG MASALLAM\t\t\t\t\t\t215");
                method(500);
                System.out.println("9.MUTTON ROGAN JOSH\t\t\t\t\t200");
                method(500);
                System.out.println("10.PRON MALAI CURRY\t\t\t\t\t260");
                method(500);
                System.out.println("11.FISH SARSOWALA\t\t\t\t\t220");
                method(500);
                System.out.println("12.FISH DHANIAWALA\t\t\t\t\t210");
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("\nCHOOSE YOUR MAIN NON VEG COURSE FROM THE LIST BY ENTERING NO.");
                    vfd=Integer.parseInt(br.readLine());
                    System.out.println("HOW MANY PLATES DO YOU PLACE FROM THE ABOVE LIST ?");
                    tvfd=Integer.parseInt(br.readLine());
                    if(vfd==1||vfd==12)
                    amt=tvfd*210;
                    if(vfd==2)
                    amt=tvfd*230;
                    if(vfd==3||vfd==9)
                    amt=tvfd*200;
                    if(vfd==4)
                    amt=tvfd*235;
                    if(vfd==5||vfd==6)
                    amt=tvfd*250;
                    if(vfd==7)
                    amt=tvfd*240;
                    if(vfd==8)
                    amt=tvfd*215;
                    if(vfd==10)
                    amt=tvfd*260;
                    if(vfd==11)
                    amt=tvfd*220;
                    totalamt+=amt;
                    System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                    choice=br.readLine();
                }
            }
            if(str.equalsIgnoreCase("C"))
            {
                System.out.println("\t\tWELCOME TO CHINESE DISHES");
                System.out.println("\nCHINESE DISHES:\t\t\t\t\t\tRs.");
                method(1000);
                System.out.println("1.SCHEZWAN FRIED RICE\t\t\t\t\t260");
                method(500);
                System.out.println("2.SCHEZWAN CHICKEN\t\t\t\t\t310");
                method(500);
                System.out.println("3.CHILLY CHICKEN\t\t\t\t\t280");
                method(500);
                System.out.println("4.CHICKEN NOODELS\t\t\t\t\t270");
                method(500);
                System.out.println("5.VEG HAKA NOODELSt\t\t\t\t\t250");
                method(500);
                System.out.println("6.CHICKEN MANCHURIAN\t\t\t\t\t265");
                method(500);
                System.out.println("7.PANEER MANCHURIAN\t\t\t\t\t240");
                method(500);
                System.out.println("8.CHILLY PANEER\t\t\t\t\t\t235");
                method(500);
                System.out.println("9.SHANGHAI FRIED RICE\t\t\t\t\t320");
                method(500);
                System.out.println("10.VEG FRIED RICE\t\t\t\t\t240");
                method(500);
                System.out.println("11.CHICKEN FRIED RICE\t\t\t\t\t280");
                method(500);
                System.out.println("12.KIMCHA RICE VEG\t\t\t\t\t235");
                method(500);
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("\nCHOOSE YOUR MAIN CHINESE COURSE FROM THE LIST BY ENTERING NO.");
                    fd=Integer.parseInt(br.readLine());
                    System.out.println("HOW MANY PLATES DO YOU PLACE FROM THE ABOVE LIST ?");
                    tfd=Integer.parseInt(br.readLine());
                    if(fd==1)
                    amt=tfd*260;
                    if(fd==2)
                    amt=tfd*310;
                    if(fd==3||fd==11)
                    amt=tfd*280;
                    if(fd==4)
                    amt=tfd*270;
                    if(fd==5)
                    amt=tfd*250;
                    if(fd==6)
                    amt=tfd*265;
                    if(fd==7||fd==10)
                    amt=tfd*240;
                    if(fd==9)
                    amt=tfd*320;
                    if(fd==8||fd==12)
                    amt=tfd*235;
                    totalamt+=amt;
                    System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                    choice=br.readLine();
                }
            }   
            choice="Y";
            System.out.println("DO YOU WANT TO HAVE THE DESSERTS NOW ?");
            System.out.println("IF YES THEN ENTER 'YES' AND IF NO ENTER 'NO'");
            yesorno=br.readLine();
            if(yesorno.equalsIgnoreCase("no"))
            {
                method(3000);
                System.out.println("\f");
                break;
            }  
            else
            {
                method(3000);
                System.out.println("\f");
            }
            
            case 3:
            System.out.println("\t\t\t\t\t**\"WELCOME TO OUR DESSERTS SECTION\"**");
            System.out.println("\nDESSERTS:\t\t\t\t\tRs.");
            method(1000);
            System.out.println("1.SOFTY PINEAPPLE\t\t\t\t110");
            method(500);
            System.out.println("2.SOFTY CRUNCHY CHOCOLATE\t\t\t115");
            method(500);
            System.out.println("3.CHOCOLATE WALNUT BROWNIE\t\t\t150");
            method(500);
            System.out.println("4.CHOCOLATE DOUGHNUT\t\t\t\t135");
            method(500);
            System.out.println("5.MARBLE CAKE\t\t\t\t\t140");
            method(500);
            System.out.println("6.MOCHA MAGIC\t\t\t\t\t110");
            method(500);
            System.out.println("7.BLACK FOREST GATEAUX\t\t\t\t125");
            method(500);
            System.out.println("8.MANGO SHAKE\t\t\t\t\t100");
            method(500);
            System.out.println("9.PINEAPPLE SHAKE\t\t\t\t120");
            method(500);
            System.out.println("10.TOOTY FRUITY\t\t\t\t\t150");
            method(500);
            System.out.println("11.VANILA SHAKE\t\t\t\t\t160");
            method(500);
            while(choice.equalsIgnoreCase("Y"))
            {
                System.out.println("\nCHOOSE YOUR DESSERT FROM THE LIST BY ENTERING NO.");
                d=Integer.parseInt(br.readLine());
                System.out.println("ENTER THE TOTAL NO. OF ITEMS YOU WANT TO BUY FROM THE ABOVE LIST ?");
                totald=Integer.parseInt(br.readLine());
                if(d==1||d==6)
                damt=totald*110;
                if(d==2)
                damt=totald*115;
                if(d==3||d==10)
                damt=totald*150;
                if(d==4)
                damt=totald*135;
                if(d==5)
                damt=totald*140;
                if(d==7)
                damt=totald*125;
                if(d==8)
                damt=totald*100;
                if(d==9)
                damt=totald*120;
                if(d==10)
                damt=totald*150;
                if(d==11)
                damt=totald*160;
                totalamt+=damt;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=br.readLine();
            }
            choice="Y";
            method(3000);
            System.out.println("\f");
            break;
           
            default:
            System.out.println("YOU HAVE ENTERED A WRONG CHOICE!!!");
            System.out.println("YOU CAN ENTER IN THE MULTI CUISINE COYA RESTAURANT BY EXECUTING THE PROGRAM AGAIN WITH THE CORRECT CHOICE");
            System.exit(0);
        }
        System.out.print("REDIRECTING YOU TO THE BILL PAGE");
        method(1000);
        System.out.print(".");
        method(500);
        System.out.print(".");
        method(500);
        System.out.println(".");
        method(1000);
        System.out.println("\f");
        System.out.println("\n\n\t\t\t\t\t***\"MULTI CUSINE COYA RESTAURANT\"***");
        method(1000);
        System.out.println("\t\t\t\t\t\t\t****BILL**");
        method(1000);
        System.out.println("\t\t\t\t\t\t\t ORIGINAL SUM= "+(tamt+totalamt+totalmt));
        method(1000);
        System.out.println("\t\t\t\t\t\t\t    VAT= 14.5%");
        amount=(tamt+totalamt+totalmt)*1145/1000.0;
        amount=Math.round(amount);
        System.out.println("\t\t\t\t\t\t\tTOTAL AMOUNT TO BE PAID= "+amount);
        String w="\n==================================================================================================================================";
        for(i=0;i<w.length();i++)
        {
            for(j=0;j<=100000000;j++){}
            System.out.print(w.charAt(i));
        }
        method(800);
        System.out.println("\nDO YOU WANT TO PAY THE AMOUNT THROUGH CASH/CARD/NET BANKING");
        String st=br.readLine();
        if(st.equalsIgnoreCase("cash"))
        {
            System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
            at=Float.parseFloat(br.readLine());
            if(at!=amount)
            {
                System.out.println("YOU HAVE PAID THE WRONG SUM");
                method(1000);
                System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
                br.readLine();
                System.out.println("AMOUNT PAID!!!");
                method(500);
                System.out.println(" THANK YOU!!!");
            }
            else
            {
                System.out.println("AMOUNT PAID!!!");
                method(500);
                System.out.println(" THANK YOU!!!");
            }
        }
        if(st.equalsIgnoreCase("Net banking"))
        {
            System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
            at=Float.parseFloat(br.readLine());
             if(at!=amount)
                {
                   System.out.println("YOU HAVE ENTERED THE WRONG SUM");
                   method(1000);
                   System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
                   br.readLine();
                }
            System.out.println("PLEASE ENTER YOUR PHONE NO.");
            br.readLine();
            System.out.println("AN OTP WILL BE SENT TO THIS NO.");
            System.out.println("PLEASE WAIT FOR THE OTP TO BE GENRATED");
            method(1000);
            System.out.print("PROCESSING");
            method(1000);
            System.out.print(".");
            method(500);
            System.out.print(".");
            method(500);
            System.out.println(".");
            method(2000);
            double n=Math.random();
            while(n<=1000)
	    {
		n=n*10;
            }
	    int otp=(int)n;
            System.out.println("THE OTP IS "+otp);
	    method(1000);
	    System.out.println("PLEASE ENTER THE OTP");
	    int in=Integer.parseInt(br.readLine());
	    method(1000);
            if(in!=otp)
	    {
	        System.out.println("WRONG OTP ENTERED!");
	        System.out.println("PLEASE ENTER IT AGAIN");
	        br.readLine();
       	        System.out.println("TRANSCATION SUCCESSFULL!!!");
	        method(500);
	        System.out.println("     THANK YOU!!!");
            }
	    else
	    {
	        System.out.println("TRANSACTION SUCCESSFULL!!!");
	        method(500);
                System.out.println("     THANK YOU!!!");
	    }
        }
        if(st.equalsIgnoreCase("Card"))
        {
            System.out.println("FROM WHICH CARD DO YOU WANT TO PAY:-");
            method(1000);
            System.out.println("(VISA/RUPAY/MASTER CARD/MAESTRO)");
            br.readLine();
            method(1000);
            System.out.println("ENTER PIN");
            int pin=Integer.parseInt(br.readLine());
            String pin1=""+pin;
            if(pin1.length()==4)
            {
                System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
                at=Float.parseFloat(br.readLine());
                if(at!=amount)
                {
                   System.out.println("YOU HAVE ENTERED THE WRONG SUM");
                   method(1000);
                   System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
                   br.readLine();
                   System.out.println("AMOUNT PAID!!!");
                   method(1000);
                   System.out.println(" THANK YOU!!!");
                }
                else
                {
                    System.out.println("TRANSACTION SUCCESSFUL!!!");
                    System.out.println("      THANK YOU!!!");
               }
            }
            else
            {
                System.out.println("PLEASE ENTER 4 DIGIT PTN");
                br.readLine();
                System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
                at=Float.parseFloat(br.readLine());
                if(at!=amount)
                {
                   System.out.println("YOU HAVE ENTERED THE WRONG SUM");
                   method(1000);
                   System.out.println("PLEASE ENTER THE AMOUNT YOU HAVE TO PAY");
                   br.readLine();
                   System.out.println("AMOUNT PAID!!!");
                   method(1000);
                   System.out.println(" THANK YOU!!!");
                }
                else
                {
                    System.out.println("TRANSACTION SUCCESSFUL!!!");
                    System.out.println("      THANK YOU!!!");
                }
	    }   
        }
        method(2000);
        System.out.println("\f");
        method(500);
        System.out.println("\n\t\t\t\tIT WILL BE GREATFUL IF YOU LEAVE US A FEEDBACK FOR OUR IMPROVEMENT");
        System.out.println("\nYOUR NAME:");
        String name=br.readLine();
        System.out.println("\nADDRESS:");
        String add=br.readLine();
        System.out.println("\nCONTACT NO.1:");
        long con1=Long.parseLong(br.readLine());
        System.out.println("\nCONTACT NO.2:");
        long con2=Long.parseLong(br.readLine());
        System.out.println("\nEMAIL ID:");
        String email=br.readLine();
        System.out.println("HOW WAS OUR FOOD:-");
        String food=br.readLine();
        System.out.println("\nWHAT DO YOU FEEL ABOUT OUR SERVICE:-");
        String serve=br.readLine();
        System.out.println("\nIF ANY COMPLAIN:-");
        String comp=br.readLine();
        System.out.println("\n\t\t\t\t\t\t***THANK YOU***");
        System.out.println("\t\t\tTO EXIT THE MULTI CUISINE RESTAURANT, ENTER THE WORD 'QUIT' OR JUST PRESS 'Q'");
        ans= br.readLine();
        if(ans.equalsIgnoreCase("quit")||ans.equalsIgnoreCase(" quit")||ans.equalsIgnoreCase("quit ")||ans.equalsIgnoreCase("q"))
        {
            System.out.println("\t\t\t\t"+name+" THANKS FOR VISITING MULTI CUISINE COYA RESTAURANT!!!");
            method(1000);
            System.out.println("\t\t\t\t\tYOUR PLEASURE OUR COMFORT!!!");
            method(1000);
            System.out.println("\t\t\t\t\tPLEASE VISIT AGAIN!!!");
            System.exit(0);
        }
        else 
        {
            System.out.println("WRONG INPUT!");
            method(1000);
            System.out.println("TO EXIT THE MULTI CUISINE RESTAURANT, ENTER THE WORD 'QUIT' OR JUST PRESS 'Q'");
            ans= br.readLine();
            System.out.println("\t\t\t\t"+name+" THANKS FOR VISITING MULTI CUISINE COYA RESTAURANT!!!");
            System.out.println("\t\t\t\t\tYOUR PLEASURE OUR COMFORT!!!");
            method(1000);
            System.out.println("\t\t\t\t\tPLEASE VISIT AGAIN!!!");
            System.exit(0);
        }
            
        
    }
    public static void method(int number)
    {
         try
        {
            Thread.sleep(number);
        }
        catch(Exception e){}
    }   