import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.Calendar;
class PVRCinemas{
    static int choice1=0;
    static String theatreType[]={"1.Gold         -500","2.Insignia     -850","3.Club         -350"};
    static String movies[]={"Hugo","Spectre","The Avengers:Age of Ultron","The Dark Knight Rises","Malificent","Ice Age 4:Continental Drift","Snow White and the Huntsman","The Amazing Spiderman 2","Iron Man 3","Kung Fu Panda 2"};
    static int tType=0;
    static String movtime[]={"1.10;35","2.12:50","3.14:30","4.17:00","5.21:20"};
    static int seatno=0;
    static int movprice=0;
    static int time=0;
    static boolean c=false;
    static boolean b=false;
    static int movie=0;
    static boolean a=false;
    static Scanner sc=new Scanner(System.in);

    static String fcYesNo="";
    static int fcprice=0;
    static double totalprice=0;
    static double tax=0;
    static String BookingName1="";
    static String BookingName2="";
    static String EmailId="";
    static String BookingID="";
    static Integer bookingno=0;
    static double grandprice=0;
    static String beverageYesNo="";
    static String foodYesNo="";
    static String[] drinks={"Sprite","Coke","Ice Tea","Fanta","Mountain Dew", "Mineral Water","Ice cream Soda"};
    static String[] foods={"Cheese Popcorn","Butter Popcorn","Caramel Popcorn","Nachos and Cheese","Hot Dog","Sweet Corn"};
    static int drink=0;
    static int food=0;
    static String[] dsize={"1.Large-  120","2.Medium- 100","3.Small-  70"};
    static String[] fsize={"1.Large-  180","2.Medium- 130","3.Small-  100"};
    static int drinksize;
    static int foodsize;
    static int ranvar;
    static int exit;
    static int mdate;
    static String PhNo;
    static int drinkno;
    static int foodno;
    static Calendar cal=Calendar.getInstance();
    static char symbel;
    static Random r = new Random();
    static int low;
    static int high;
    static int result;
    public static void getMain()throws IOException{ 
        System.out.println(" ********** Welcome to PVR cinemas, LULU mall, Kochi **********");
        Scanner sc1;
        Scanner sc2;
        Scanner sc3;
        Scanner sc4;
        Scanner sc5;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int k=0;k<movies.length;k++){ 
            System.out.println(movies[k]);
        }
        while(true){
            System.out.println("Select movie. (Enter the option number)");
            sc1 = new Scanner(System.in);
            try{
                movie=sc1.nextInt();
                if (movie>10 || movie<1){
                    System.out.println("Invalid movie selection. Try again.");
                }
                else{
                    break;
                }
            }
            catch(Exception e){
                System.out.println();
                System.out.println("Enter an Integer only." );
            }
            sc1.close();
        }

        System.out.println();
        System.out.println("Class           Price");
        System.out.println("***********************");
        for(int i=0;i<theatreType.length;i++){
            System.out.println(theatreType[i]);

        }
        while(true){
            //sc2=new Scanner(System.in);
            try 
            {
                System.out.println("Select class");
                tType=Integer.parseInt(br.readLine());
                if(tType>3 || tType<1){
                    System.out.println("Invalid class. Try again.");
                }  else{
                    break;
                }

            }
            catch(Exception e){
                System.out.println();
                System.out.println("Only enter an Integer");
            }
            //sc2.close();
        }
        System.out.println();
        while(true){

            sc3=new Scanner(System.in);
            System.out.println("Select movie date");
            System.out.println("     Movie Date   ");
            System.out.println("********************");
            System.out.println("1. "+cal.getTime());
            cal.add(Calendar.DATE, 1);
            System.out.println("2. "+cal.getTime());
            cal.add(Calendar.DATE, 1);
            System.out.println("3. "+cal.getTime());
            cal.add(Calendar.DATE, 1);
            System.out.println("4. "+cal.getTime());
            try{
                mdate=sc3.nextInt();
                if(mdate>4 || mdate<1){
                    System.out.println("Invalid option. Try again.");
                }
                else{
                    break;
                }
            }
            catch(Exception e) {
                System.out.println("Enter an integer only! Try again.");
            }
            sc3.close();
        }
        System.out.println();
        System.out.println("    Showtime");
        System.out.println("******************");
        for(int d=0;d<movtime.length;d++){
            System.out.println(movtime[d]);
        }
        while(true){
            System.out.println("Select time");
            sc3 = new Scanner(System.in);
            try{
                time=sc3.nextInt();
                if (time>5 || time<1){
                    System.out.println("Invalid movie time. Try again.");
                }
                else{
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Enter only an Integer. Try again");
            }
            sc3.close();
        }
        System.out.println("The time you chose is  "+movtime[time-1]);
        System.out.println();
        while(true){
            System.out.println("Enter number of seats to be booked");

            sc4=new Scanner(System.in);
            try{
                //seatno=sc4.nextInt();
                z:while (true){
                    seatno=sc4.nextInt();
                    if(seatno>15 || seatno<0){
                        System.out.println("Max 15 seats can be booked & 1 seat minimum . Try again.");
                    }
                    else{
                        break z;
                    }
                }
                if (tType==2){
                    movprice=850*seatno;
                }
                else if(tType==1){
                    movprice=500*seatno;
                }
                else{
                    movprice=350*seatno;
                }
                break;
            }
            catch(Exception e){
                System.out.println("Enter an Integer only! Try again");
            }
            sc4.close();
        }

        while(true){

            symbel= (char)(r.nextInt(26) + 'a');
            if(symbel>='a' && symbel <= 'z') {
                break;
            }

        }

        low = 1;
        high = 5;
        result = r.nextInt(high-low) + low;

        System.out.println("Your seat numbers/number are/is:");
        for(int p=result;p<seatno+result;p++){
            System.out.println(symbel+" "+p);
        }

        System.out.println("The price for the movie ticket is "+ movprice);
        sc5 = new Scanner(System.in);

        a:while (true){
            System.out.println("Would you like to continue to the food court? Enter yes or no");
            fcYesNo=sc1.next();
            fcYesNo=fcYesNo.toLowerCase();

            if(fcYesNo.equals("yes"))
            {
                getFC();
                break a;
            }
            else if (fcYesNo.equals("no")){
                /* f:while (true){
                sc5=new Scanner(System.in);
                System.out.println("Enter First Name");
                BookingName1=sc5.nextLine();
                b:for (int m=0;m<BookingName1.length();m++){

                if((BookingName1.charAt(m)<122 && BookingName1.charAt(m)>97) || (BookingName1.charAt(m)>=65 && BookingName1.charAt(m)<=90)){
                break f;
                }
                else{
                System.out.println("Do not use SPECIAL CHARACHTERS . Try again" );
                break b;
                }
                }
                sc5.close();
                }

                g:while (true){
                sc5=new Scanner(System.in);
                System.out.println("Enter Last Name");
                BookingName2=sc5.nextLine();

                c:for (int n=0;n<BookingName2.length();n++){

                if((BookingName2.charAt(n)<122 && BookingName2.charAt(n)>97) || (BookingName2.charAt(n)>=65 && BookingName2.charAt(n)<=90)){
                break g ;
                }
                else{
                System.out.println("Do not use SPECIAL CHARACHTERS");
                break c;
                }
                }
                sc5.close();
                }
                while(true){
                sc5=new Scanner(System.in);
                System.out.println("Enter EmailID");
                EmailId=sc5.nextLine();

                if(Pattern.matches("\\w*\\@\\w*\\.\\w*", EmailId) == true){
                break;
                }
                else{
                System.out.println("Invalid E-Mail ID.");
                }
                sc5.close();
                }
                while(true){
                sc5=new Scanner(System.in);
                System.out.println("Enter you phone number");
                PhNo = sc5.nextLine();
                if(Pattern.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", PhNo) == true)
                break;
                else{
                System.out.println("Invalid phone number.");
                }
                sc5.close();
                }

                getBill();
                break a;
                 */
                getDeets();
                getBill();
            }

            else{
                System.out.println("Invalid Option. Try again" );

            }
        }
        sc5.close();
    }

    public static void getBill()throws IOException{
        cal.add(Calendar.DATE, mdate-1);
        bookingno=new Random().nextInt(2000);
        BookingID=BookingName1.substring(0,1)+BookingName2.substring(0,1)+ bookingno.toString();
        totalprice=fcprice+movprice; 
        tax=8.0/100*totalprice;
        grandprice=totalprice+tax;
        System.out.println("*********** PVR CINEMAS ***********");
        System.out.println("Date:           "+cal.getTime());
        System.out.println("Time:           "+movtime[time-1]);
        System.out.println("Movie:          "+movies[movie-1]);
        System.out.println("Class:          "+theatreType[tType-1]);
        System.out.println("Quantity        "+seatno);
        System.out.println("Movie Price:    "+movprice);
        System.out.println("Foodcourt Price "+fcprice);
        System.out.println("Price:          "+ totalprice);
        System.out.println("Tax:            "+tax);
        System.out.println("Grand Total:    "+grandprice);
        System.out.println("Booking ID:     "+BookingID);
        System.out.println();
        System.out.println();
        System.out.println();
        while(true){
            System.out.println("Press 1 for main menu");
            System.out.println("press 2 to exit");
            try{
                exit=sc.nextInt();

                if (exit==1){
                    getMain();
                    break;
                }
                else if(exit==2){
                    System.out.println("Thanks for choosing PVR cinemeas.");
                    System.exit(0);
                    break;
                }
                else{
                    System.out.println("Invalid Option");
                }
            }
            catch(Exception e){
                System.out.println("Enter 1 or 2 only. Try again.");
            }

        }
    }

    public static void getFC()throws IOException{
        System.out.println("Welcome to the PVR Foodcourt");
        Scanner sc10;
        Scanner sc9;
        Scanner sc8;
        Scanner sc7;
        Scanner sc6;
        Scanner sc;
        sc6=new Scanner(System.in);

        System.out.println("Would you like a beverage? Enter yes or no.");
        int t;
        System.out.println();

        t:while(true){
            beverageYesNo=sc6.next();
            if (beverageYesNo.equals("yes")){
                System.out.println();
                System.out.println("    Beverage");
                System.out.println("******************");
                for (t=0;t<drinks.length;t++){
                    System.out.println(drinks[t]);
                }
                d:while(true){
                    sc6=new Scanner(System.in);
                    System.out.println("Please select a beverage.");
                    try{
                        drink=sc6.nextInt();
                        if(drink>7 || drink<1){
                            System.out.println("Invalid Beverage! Try again.");
                        }
                        else{
                            break d;
                        }

                    }
                    catch(Exception e){
                        System.out.println("Enter an integer only! Try again.");
                    }
                    sc6.close();
                }
                System.out.println();
                System.out.println("The Beverage you ordered is  "+drinks[drink-1]);
                System.out.println("    Size");
                System.out.println("*************");
                for(int v=0;v<dsize.length;v++){
                    System.out.println(dsize[v]);
                }

                while(true){
                    sc6=new Scanner(System.in);
                    System.out.println();
                    System.out.println("Enter size");
                    try{
                        drinksize=sc6.nextInt();

                        if(drinksize>3||drinksize<1){
                            System.out.println("Invalid Size");
                        }
                        else{
                            break;
                        }

                    }
                    catch(Exception e){
                        System.out.println("Enter only integer! Try agan.");
                    }
                    sc6.close();
                }
                while(true){
                    sc7=new Scanner(System.in);
                    System.out.println();
                    System.out.println("Enter Quantity");
                    try{
                        aa:while (true){
                            drinkno=sc7.nextInt();
                            if(drinkno>15 || drinkno<0){
                                System.out.println("No more than 15 beverages can be bought at once. Try again.");
                            }
                            else{
                                break aa;
                            }
                        }

                        if(drinksize==1){
                            fcprice=fcprice+drinkno*120;
                        }
                        else if(drinksize==2){
                            fcprice=fcprice+drinkno*100;
                        }
                        else{
                            fcprice=fcprice+drinkno*70;
                        }
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Enter an integer only! Try again.");
                    }
                    sc7.close();
                }

                break t;
            }

            else if (beverageYesNo.equals("no")){

                break t;
            }
            else{
                System.out.println();
                System.out.println("Enter yes or no only! Try again");
            }
        }

        foodYesNo.toLowerCase();
        v:while(true){
            System.out.println();

            sc7=new Scanner(System.in);
            System.out.println("Would you like to proceed to food selection? Enter yes or no");

            foodYesNo=sc7.nextLine();
            if (foodYesNo.equals("yes")){
                int q;
                System.out.println("    Food");
                System.out.println("*************");
                for ( q=0;q<foods.length;q++){
                    System.out.println(foods[q]);
                }
                while(true){
                    System.out.println();
                    sc8=new Scanner(System.in);

                    System.out.println("Please select a food item.");
                    try{
                        drink=sc8.nextInt();
                        if(drink>6 || drink<1){
                            System.out.println();
                            System.out.println("Invalid Food Item");
                        }
                        else{
                            break;
                        }
                    }
                    catch(Exception e){
                        System.out.println("Enter a number only!");
                    }
                    sc8.close();

                }
                System.out.println();
                System.out.println("The Food Item you ordered is  "+foods[drink-1]);
                System.out.println();
                System.out.println("    Size");
                System.out.println("*************");

                for( int v=0;v<fsize.length;v++){
                    System.out.println(fsize[v]);
                }
                System.out.println();

                while(true){
                    sc8=new Scanner(System.in);

                    System.out.println("Enter size");
                    try{
                        foodsize=sc8.nextInt();
                        if(foodsize>3||foodsize<1){
                            System.out.println();
                            System.out.println("Invalid Size");
                        }
                        else{
                            break;
                        }
                    }
                    catch(Exception e){
                        System.out.println("Enter a number only!");
                    }
                    sc8.close();

                }
                ab:while(true){
                    sc8=new Scanner(System.in);

                    System.out.println();

                    System.out.println("Enter Quantity");
                    try{
                        ac:while (true){
                            foodno=sc8.nextInt();
                            if(foodno>15 || foodno<0){
                                System.out.println("No more than 15 food items can be booked at once. Try again.");
                            }
                            else{
                                break ac;
                            }
                        }

                        if(foodsize==1){
                            fcprice=fcprice+foodno*180;
                        }
                        else if(drinksize==2){
                            fcprice=fcprice+foodno*130;
                        }
                        else{
                            fcprice=fcprice+foodno*100;
                        }

                        break ab;
                    }
                    catch(Exception e){
                        System.out.println("Enter an Integer only!. Try again.");
                    }
                    sc8.close();
                }

                break v;
            }
            else if(foodYesNo.equals("no")){
                System.out.println();

                break v;
            }
            else{
                System.out.println("Enter yes or no only!");
            }
        }
        while(true){
            sc9=new Scanner(System.in);
            System.out.println();
            System.out.println("Press 1 to proceed to billing.");
            System.out.println("Press 2 to select more item.");

            try{
                ranvar=sc9.nextInt();
                if(ranvar==1){
                    /*p:while (true){
                    sc10=new Scanner(System.in);
                    System.out.println("Enter First Name");
                    BookingName1=sc10.nextLine();
                    q:for (int m=0;m<BookingName1.length();m++){

                    if((BookingName1.charAt(m)<122 && BookingName1.charAt(m)>97 )||( BookingName1.charAt(m)>=65 && BookingName1.charAt(m)<=90)){
                    break p;
                    } else{
                    System.out.println("Do not use SPECIAL CHARACHTERS . Try again" );
                    break q;
                    }
                    }
                    sc10.close();
                    }

                    r:while (true){
                    sc10=new Scanner(System.in);
                    System.out.println("Enter Last Name");

                    BookingName2=sc10.nextLine();

                    s:for (int n=0;n<BookingName2.length();n++){

                    if((BookingName2.charAt(n)<122 && BookingName2.charAt(n)>97) ||( BookingName2.charAt(n)>=65 && BookingName2.charAt(n)<=90)){
                    break r ;
                    }
                    else{
                    System.out.println("Do not use SPECIAL CHARACHTERS");
                    break s;
                    }
                    }
                    sc10.close();
                    }
                    while(true){
                    sc10=new Scanner(System.in);
                    System.out.println("Enter EmailID");

                    EmailId=sc10.nextLine();

                    if(Pattern.matches("\\w*\\@\\w*\\.\\w*", EmailId) == true){
                    break;
                    }
                    else{
                    System.out.println("Invalid E-Mail ID.");
                    }
                    sc10.close();
                    }
                    while(true){
                    System.out.println("Enter you phone number");
                    sc10=new Scanner(System.in);
                    PhNo = sc10.nextLine();
                    if(Pattern.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", PhNo) == true)
                    break;
                    else{
                    System.out.println("Invalid phone number.");
                    }
                    sc10.close();
                    }
                    getBill();
                     */
                    getDeets();
                    getBill();
                    break;
                }

                else if(ranvar==2){
                    System.out.println();
                    System.out.println();
                    getFC();
                    break;
                }
                else{
                    System.out.println("Invalid option. Try again.");
                }

            }
            catch(Exception e){
                System.out.println("Enter integer only! Try again.");
            }
            sc9.close();
        }

    }

    public static void getDeets(){
        Scanner sc10;
        int count1=0;
        int count2=0;
        p:while (true){
            sc10=new Scanner(System.in);
            System.out.println("Enter First Name");
            BookingName1=sc10.nextLine();
            BookingName1=BookingName1.toLowerCase();

            if(BookingName1.length()!=0 && BookingName1.length()<20){
                q:for (int m=0;m<BookingName1.length();m++){
                    if((BookingName1.charAt(m)<=122 && BookingName1.charAt(m)>=97 )){
                        count1++;
                    }

                    else{
                        System.out.println("Do not use SPECIAL CHARACHTERS . Try again" );
                        count1=0;
                        break q;
                    }
                    if(count1==BookingName1.length()){

                        break p;
                    }

                }
            }

            else if(BookingName1.length()==1){
                System.out.println("The Name is too short!. Try again." );
                
            }
            else{
                System.out.println("The Name is too long!. Try again." );
                

            }

            sc10.close();
        }

        r:while (true){
            sc10=new Scanner(System.in);
            System.out.println("Enter Last Name");

            BookingName2=sc10.nextLine();
            BookingName2=BookingName2.toLowerCase();

            if(BookingName2.length()!=0 && BookingName2.length()<20){
                s:for (int n=0;n<BookingName2.length();n++){
                    if((BookingName2.charAt(n)<=122 && BookingName2.charAt(n)>=97 )){
                        count2++;
                    }
                    else{
                        System.out.println("Do not use SPECIAL CHARACHTERS");
                        count2=0;
                        break s;
                    }
                    if(count2==BookingName2.length()){
                        break r;
                    }

                }
            }
            else  if(BookingName2.length()==0){
                System.out.println("The Name is too short!. Try again." );

            }
            else{
                System.out.println("The Name is too long!. Try again." );

            }

            sc10.close();
        }
        while(true){
            sc10=new Scanner(System.in);
            System.out.println("Enter EmailID");

            EmailId=sc10.nextLine();

            if(Pattern.matches( "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$", EmailId) == true){
                break;
            }
            else{
                System.out.println("Invalid E-Mail ID.");
            }
            sc10.close();
        }
        while(true){
            System.out.println("Enter you phone number");
            sc10=new Scanner(System.in);
            PhNo = sc10.nextLine();
            if(Pattern.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", PhNo) == true)
                break;
            else{
                System.out.println("Invalid phone number.");
            }
            sc10.close();
        }

    }
}
