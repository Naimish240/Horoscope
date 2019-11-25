import java.util.*;
public class horoscope
{
    public static int Datecheck(int d,int m,int y)//to check for validity of date
    {
       int n;
       if ((m==1&&d<32)||(m==3&&d<32)||(m==5&&d<32)||(m==7&&d<32)||(m==8&&d<32)||(m==10&&d<32)||(m==12&&d<32)||(m==2&&y%400==0&&d<30)||(m==2&&y%400!=0&&d<29)||(m==2&&y%400!=0&&y%4==0&&d<30)||(m==4&&d<31)||(m==6&&d<31)||(m==9&&d<31)||(m==11&&d<31)) //to check day for all months including feb    
       n=1;
       else//if date is invalid
        n=0;
       return n;//returns int n to main method
    }
    public static String Stone(int month)//to find the birth stone for each month
    {
        String s="";
        if (month==1)
        s="Garnet";
        if (month==2)
        s="Amethyst";
        if (month==3)
        s="Aquamarine";
        if (month==4)
        s="Diamond";
        if (month==5)
        s="Emerald";
        if (month==6)
        s="Pearl";
        if (month==7)
        s="Ruby";
        if (month==8)
        s="Peridot";
        if (month==9)
        s="Sapphire";
        if (month==10)
        s="Opal";
        if (month==11)
        s="Topaz";
        if (month==12)
        s="Turquoise";
        return s;
    }
    public static String Forecast(String z)//to find characteristics for each zodiac
    {
        String s="";
        String newLine=System.getProperty("line.separator");
        if (z=="Aries")//behaviour of Aries
        s="Courageous, energetic, willful, commanding, leading. "+newLine+"Often leads when following would be best course of action.They are warm, vital, and bright."
        +newLine+"They can sometimes be impulsive and have hot tempters. They live hard, love hard, and play hard.";
        if (z=="Taurus")//behaviour of Taurus
        s="Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature."
        +newLine+"They are slow to anger, but once disturbed it can be volatile. Taurus people almost always finish what they start."
        +newLine+"They are deliberate thinkers and when making decisions. Taurus generally adjust easily to new circumstances.";
        if (z=="Gemini")//behaviour of gemini
        s="Cerebral, chatty, loves learning and education, charming, and adventurous."
        +newLine+"This sign craves intellectual stimulation and often will push the envelope physically, mentally, and spiritually. "
        +newLine+"This sign is also incredibly creative and are given to giant leaps of intuition";
        if (z=="Cancer")//behaviour of cancer
        s="Emotional, group oriented, seeks security, family."
        +newLine+"Cancer have an offbeat sense of humor, often finding something humorous that others don’t. "
        +newLine+"They are extremely good listeners and have a heart for the problems of others. Cancer tend to be dependable and reliable.";
        if (z=="Leo")//behaviour of leo
        s="Generous, organized, protective, beautiful."
        +newLine+"Leo tend to be honest and decent people, opting to do the right thing regardless of the situation."
        +newLine+"They are natural leaders and don’t often do well in situations where they have to take orders from others.";
        if (z=="Virgo")//behaviour of virgo
        s="Particular, logical, practical, sense of duty, critical."
        +newLine+"Virgo people are mild mannered on the surface, but underneath there is a flurry of activity."+
        newLine+"Their minds are never quiet; always thinking, calculating, assessing. They are kind, patient and love to laugh.";
        if (z=="Libra")//behaviour of libra
        s="Balanced, seeks beauty, sense of justice."+
        newLine+"This sign does not like to see people unhappy. They are prone to talking for long periods of time about their favorite subjects."
        +newLine+"Generally the decisions that a Libra makes are the ones that will benefit the most people. All Libra have a sense of fair play";
        if (z=="Scorpio")//behaviour of scorpio
        s="Passionate, exacting, loves extremes, combative, reflective."+
        newLine+"Scorpio signs are not fearful individuals, often trying things that others would not attempt. They are disciplined, protective and are very interested in others."+
        newLine+"They give of themselves but do expect the same in return.";
        if (z=="Sagittarius")//behaviour of sagittarius
        s="Happy, absent minded, creative, adventurous."
        +newLine+"Sagittarians are highly intelligent and love to be around intelligent people. They enjoy learning new things, traveling to new places, and experiencing unique adventures."
        +newLine+"Creativity is at the core of who they are.";
        if (z=="Capricon")//behaviour of capricon
        s="Timeless, driven, calculating, ambitious."+
        newLine+"Capricorns are the superheroes when It comes to making realistic, logical decisions."
        +newLine+"Their ability to cut through the red tape and see the bottom line is what makes them a real asset to any relationship or occupation where teamwork is valued. ";
        if (z=="Aquarius")//behaviour of aquarius
        s="Forward thinking, communicative, people oriented, stubborn, generous, and dedicated."+
        newLine+"Aquarians are among the friendliest of the signs, making friends everywhere."+
        newLine+"Fascinated by all things gadget, many Aquarians enjoy tinkering with inventions and processes. ";
        if (z=="Pisces")//behaviour of pisces
        s="Likeable, energetic, passionate, sensitive."+
        newLine+"Pisces are empathetic people, often feeling badly for someone whose life is not going well. They feel the need to reach out to those who are less fortunate."+
        newLine+"Pisces signs tend to be highly and deeply religious, and sometimes will go overboard with their devotion to their particular faith.";
        return s;
    }
    public static String Planet(String z)//to find governing planet for zodiacs.
    {
        String s="";
        if (z=="Aries")//Zodiac for Mars
        s="Mars";
        if (z=="Taurus"||z=="Libra")//Zodiacs for venus
        s="Venus";
        if (z=="Gemini"||z=="Virgo")//Zodiacs for mercury
        s="Mercury";
        if (z=="Cancer")//Zodiac for moon
        s="Moon";
        if (z=="Leo")//Zodiac for sun
        s="Sun";
        if (z=="Scorpio")//Zodiac for pluto
        s="Pluto";
        if (z=="Sagittarius")//Zodiac for jupiter
        s="Jupiter";
        if (z=="Capricon")//Zodiac for saturn
        s="Saturn";
        if (z=="Aquarius")//Zodiac for uranus
        s="Uranus";
        if (z=="Pisces")//Zodiac for pisces
        s="Neptune";
        return s;
    }
    public static String Element(String z)//to find zodiac's element
    {
        String s="";
        if (z=="Aries"||z=="Leo"||z=="Sagittarius")//Fire
        s="Fire";
        if (z=="Taurus"||z=="Virgo"||z=="Capricon")//Earth
        s="Earth";
        if (z=="Gemini"||z=="Libra"||z=="Aquarius")//Air
        s="Air";
        if (z=="Cancer"||z=="Scorpio"||z=="Pisces")//Water
        s="Water";
        return s;
    }
    public static String Time(int time)//to find if time is am or pm
    {
        String t="";
        int s=0;
        if (time>1200)//pm
        {
          s=time-1200;
          t=(s+" pm");
        }
        else//am
        {
          s=time;
          t=(s+" am");
        }
        return t;
    }
    public static String Day(int date,int month,int year)//to calculate day of birth. Calculating method taken from Aurtur T Benjamin's book:"The Secrets to Mental Math"
    {
        int dcode=0,ycode=0,sum=0,mcode=0;//month code, day code, and year code
        String d="";
        if (month==1&&year%400==0)
        mcode=5;
        if (month==1||month==10)
        mcode=6;
        if (month==2&&year%400==0)
        mcode=1;
        if (month==2||month==3||month==11)
        mcode=2;
        if (month==4||month==7)
        mcode=5;
        if (month==5)
        mcode=0;
        if (month==6)
        mcode=3;
        if (month==8)
        mcode=1;
        if (month==9||month==12)
        mcode=4;
        ycode=(year%100)/4+(year%100);
        if ((year>=1900&&year<2000)||(year>=25&&year<100))
        sum=ycode+mcode+1+date;
        if ((year>=1800&&year<1900))
        sum=ycode+mcode+3+date;
        if ((year>=1700&&year<1800))
        sum=ycode+mcode-2+date;
        if ((year>=2000&&year<2100)||(year>=00&&year<24))
        sum=ycode+mcode+date;
        dcode=sum%7;
        if (dcode==1)
            d="You were born on a monday";
        if (dcode==2)
            d="You were born on a tuesday";
        if (dcode==3)
            d="You were born on a wednesday";
        if (dcode==4)  
            d="You were born on a thursday";
        if (dcode==5)
            d="You were born on a friday";
        if (dcode==6)
            d="You were born on a saturday";
        if (dcode==0||dcode==7)
            d="You were born on a sunday";
        return d;
    }
    public static void main (String args[])//main method
    {
        Scanner in= new Scanner (System.in);
        horoscope obj=new horoscope();
        String newLine=System.getProperty("line.separator");//assigns property of line sepaerator to the string "newLine"
        int date,month,year,time,ch=1,choice=0;//initialization of integers
        String d,t,place,s,day,p,z="",zod,e,name;//initialization of strings
        while(ch==1)//while loop to rerun the program or terminate it
         {       
           System.out.println("Enter your birth date"+newLine+"For example, if you were born on the 6th of any month, write 6");
           date=in.nextInt();//date
           while(date>31)
           {
             System.out.println("Invalid date. please re-enter the day");
             date=in.nextInt();
           }
           System.out.println("Enter:"+newLine+"1 for jan"+newLine+"2 for feb"+newLine+"3 for march"+newLine+"4 for april"+newLine+"5 for may"+newLine+"6 for june"+newLine+"7 for july"+newLine+"8 for aug"+newLine+"9 for sept"+newLine+"10 for oct"+newLine+"11 for nov"+newLine+"12 for dec ");
           month=in.nextInt();//month
           while(month>12)
           {
             System.out.println("Invalid month. please re-enter the month");
             month=in.nextInt();
           }
           s=Stone(month);//goes to method Stone and brings the month stone
           System.out.println("Enter your year of birth in a four digit form, like 1974 instead of 74");
           year=in.nextInt();//year
           choice=Datecheck(date,month,year);//goes to method Datecheck to check validity of date
           while(choice==0)
           {
              System.out.println("Invalid date of birth. please re-enter the date, month and year of birth as done above");
              date=in.nextInt();
              month=in.nextInt();
              year=in.nextInt();
              choice=Datecheck(date,month,year);
            }
           day=Day(date,month,year);//goes to method Day to find the day of birth from date of birth
           System.out.println("Enter your time of birth in army standard time. Write the time as a 4 digit number."+newLine+"If you were born at 1:45 pm, write time as 1345");
           time=in.nextInt();
           while(time>2400)
           {
             System.out.println("Invalid time. Please re-enter the time of birth");
             time=in.nextInt();
           }
           t=Time(time);//goes to method Time to return the am/pm of birth
           {   
               if (((month==12)&&date>22)||((month==1)&&(date<20)))//checks condition for zodiac Capricon
                 z="Capricon";
               if (((month==1)&&(date>20))||((month==2)&&(date<20)))//checks condition for zodiac Aquarius
                 z="Aquarius";
               if (((month==2)&&(date>20))||((month==3)&&(date<21)))//checks condition for zodiac Pisces
                 z="Pisces";
               if (((month==3)&&(date>21))||((month==4)&&(date<21)))//checks condition for zodiac Aries
                 z="Aries";
               if (((month==4)&&(date>21))||((month==5)&&(date<21)))//checks condition for zodiac Taurus
                 z="Taurus";
               if (((month==5)&&(date>21))||((month==6)&&(date<21)))//checks condition for zodiac Gemini
                 z="Gemini";
               if (((month==6)&&(date>21))||((month==7)&&(date<23)))//checks condition for zodiac Cancer
                 z="Cancer";
               if (((month==7)&&(date>23))||((month==8)&&(date<23)))//checks condition for zodiac Leo
                 z="Leo";
               if (((month==8)&&(date>23))||((month==9)&&(date<23)))//checks condition for zodiac Virgo
                 z="Virgo";
               if (((month==9)&&(date>23))||((month==10)&&(date<23)))//checks condition for zodiac Libra
                 z="Libra";
               if (((month==10)&&(date>23))||((month==11)&&(date<23)))//checks condition for zodiac Scorpio
                 z="Scorpio";
               if (((month==11)&&(date>23))||((month==12)&&(date<22)))//checks condition for zodiac Sagittarius
                 z="Sagittarius";
               zod=Forecast(z);//goes to method Forecast to generate the forecast for zodiac
               p=Planet(z);//goes to method Planet to find the planet for zodiac
               e=Element(z);//goes to method Element to find the element for zodiac
               System.out.println("DISCLAIMER: THIS MAY NOT BE 100% ACCURATE");
               System.out.println("From your date of birth and time of birth, the forecast generated for you is :");
               System.out.println("You were born on "+date+"/"+month+"/"+year+" at "+t);
               System.out.println(day);
               System.out.println("Your Zodiac is "+z);
               System.out.println("Your Lucky Stone is "+s);
               System.out.println("Your governing planet is "+p);
               System.out.println("Your Zodiac's element is "+e);
               System.out.println("You are :"+newLine+zod);
            }
           System.out.println("Enter 1 to rerun the program, 0 to terminate");//to check if user wants to rerun the program or terminate it
           ch=in.nextInt();
         }
        System.out.println("Program is terminated");
      }
   }
