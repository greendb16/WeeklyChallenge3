import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {
    private static Scanner scan = new Scanner(System.in);
    private static String input;

    private static Resume first = new Resume();
    private static Resume second = new Resume();
    private static Resume third = new Resume();
    private static Resume fourth = new Resume();
    private static Resume fifth = new Resume();
    private static Resume e = new Resume();
    private static ArrayList<Resume> resList = new ArrayList<>();
    private static boolean redo;

    private static boolean[] education = {false, false, false, false, false, false, false, false, false, false};
    private static boolean[] resume = {false, false, false, false,false};
    private static boolean[] info = {false, false, false,false, false};
    private static boolean[] exp = {false, false, false, false, false, false, false,false,false,false,false};
    private static boolean[] skills = {false, false, false, false, false, false, false,false,false,false};

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to RoboResume!  Would you like to Create, Edit, or Browse resumes?");
            input = scan.nextLine().toLowerCase();


            if (input.equals("create")) {
                redo = true;
                while (true) {
                    System.out.println("\n\nLet's collect your personal information...\n");


                    boolean infoTest = false;
                    while (!infoTest) {

                        while (!info[0]) {
                            Info one = new Info();
                            System.out.println("Please enter your Full Name:");
                            one.setName(scan.nextLine());

                            System.out.println("Please enter you E-Mail Address:");
                            one.seteMail(scan.nextLine());

                            System.out.println("Please enter your Phone Number");
                            one.setPhone(scan.nextLine());

                            first.setDetails(one);
                            info[0] = true;
                            infoTest = true;
                        }

                        while (info[0] && !info[1] && resume[0]) {
                            Info two = new Info();
                            System.out.println("Please enter your Full Name:");
                            two.setName(scan.nextLine());

                            System.out.println("Please enter you E-Mail Address:");
                            two.seteMail(scan.nextLine());

                            System.out.println("Please enter your Phone Number");
                            two.setPhone(scan.nextLine());

                            second.setDetails(two);
                            info[1] = true;
                            infoTest = true;

                        }

                        while (info[0] && info[1] && !info[2] && resume[0] && resume[1]) {
                            Info three = new Info();
                            System.out.println("Please enter your Full Name:");
                            three.setName(scan.nextLine());

                            System.out.println("Please enter you E-Mail Address:");
                            three.seteMail(scan.nextLine());

                            System.out.println("Please enter your Phone Number");
                            three.setPhone(scan.nextLine());

                            third.setDetails(three);
                            info[2] = true;
                            infoTest = true;

                        }
                        while (info[0] && info[1] && info[2] && !info[3] && resume[0] && resume[1] && resume[2]) {
                            Info four = new Info();
                            System.out.println("Please enter your Full Name:");
                            four.setName(scan.nextLine());

                            System.out.println("Please enter you E-Mail Address:");
                            four.seteMail(scan.nextLine());

                            System.out.println("Please enter your Phone Number");
                            four.setPhone(scan.nextLine());

                            fourth.setDetails(four);
                            info[3] = true;
                            infoTest = true;

                        }
                        while (info[0] && info[1] && info[2] && info[3] && !info[4] && resume[0] && resume[1] && resume[2] && resume[3]) {
                            Info five = new Info();
                            System.out.println("Please enter your Full Name:");
                            five.setName(scan.nextLine());

                            System.out.println("Please enter you E-Mail Address:");
                            five.seteMail(scan.nextLine());

                            System.out.println("Please enter your Phone Number");
                            five.setPhone(scan.nextLine());

                            fifth.setDetails(five);
                            info[4] = true;
                            infoTest = true;

                        }

                    }


                    System.out.println("\n\nNext lets add Education...\n");

                    boolean edTest = true;
                    while (edTest) {
                        if(redo){
                        System.out.println("Would you like to add any Education?(Y/N)");
                        input = scan.nextLine().toLowerCase();
                        if(input.equals("n")){
                            break;
                        }}
                        redo = true;
                        while (!education[0] && redo) {
                            Education uno = new Education();
                            System.out.println("Please Enter the school you attended:");
                            uno.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            uno.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            uno.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            uno.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(uno);
                            } else if (!resume[1]) {
                                second.setEdList(uno);
                            } else if (!resume[2]) {
                                third.setEdList(uno);
                            } else if(!resume[3]){
                                fourth.setEdList(uno);
                            } else if(!resume[4]){
                                fifth.setEdList(uno);
                            }
                            education[0] = true;
                            redo = false;
                        }
                        while (education[0] && !education[1] && redo) {
                            Education dos = new Education();
                            System.out.println("Please Enter the school you attended:");
                            dos.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            dos.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            dos.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            dos.setMajor(scan.nextLine());

                            if (!resume[0]) {
                                first.setEdList(dos);
                            } else if (!resume[1]) {
                                second.setEdList(dos);
                            } else if (!resume[2]) {
                                third.setEdList(dos);
                            } else if(!resume[3]){
                                fourth.setEdList(dos);
                            } else if(!resume[4]){
                                fifth.setEdList(dos);
                            }
                            education[1] = true;
                            redo = false;

                        }
                        while (education[0] && education[1] && !education[2] && redo) {
                            Education tres = new Education();
                            System.out.println("Please Enter the school you attended:");
                            tres.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            tres.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            tres.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            tres.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(tres);
                            } else if (!resume[1]) {
                                second.setEdList(tres);
                            } else if (!resume[2]) {
                                third.setEdList(tres);
                            } else if(!resume[3]){
                                fourth.setEdList(tres);
                            } else if(!resume[4]){
                                fifth.setEdList(tres);
                            }
                            education[2] = true;
                            redo = false;
                        }
                        while (education[0] && education[1] && education[2] && !education[3] && redo) {
                            Education cuatro = new Education();
                            System.out.println("Please Enter the school you attended:");
                            cuatro.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            cuatro.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            cuatro.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            cuatro.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(cuatro);
                            } else if (!resume[1]) {
                                second.setEdList(cuatro);
                            } else if (!resume[2]) {
                                third.setEdList(cuatro);
                            } else if(!resume[3]){
                                fourth.setEdList(cuatro);
                            } else if(!resume[4]){
                                fifth.setEdList(cuatro);
                            }
                            education[3] = true;
                            redo = false;
                        }
                        while (education[0] && education[1] && education[2] && education[3] && !education[4] && redo) {
                            Education cinco = new Education();
                            System.out.println("Please Enter the school you attended:");
                            cinco.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            cinco.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            cinco.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            cinco.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(cinco);
                            } else if (!resume[1]) {
                                second.setEdList(cinco);
                            } else if (!resume[2]) {
                                third.setEdList(cinco);
                            } else if(!resume[3]){
                                fourth.setEdList(cinco);
                            } else if(!resume[4]){
                                fifth.setEdList(cinco);
                            }

                            education[4] = true;
                            redo = false;
                        }

                        while (education[0] && education[1] && education[2] && education[3] && education[4] && !education[5] && redo) {
                            Education seis = new Education();
                            System.out.println("Please Enter the school you attended:");
                            seis.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            seis.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            seis.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            seis.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(seis);
                            } else if (!resume[1]) {
                                second.setEdList(seis);
                            } else if (!resume[2]) {
                                third.setEdList(seis);
                            } else if(!resume[3]){
                                fourth.setEdList(seis);
                            } else if(!resume[4]){
                                fifth.setEdList(seis);
                            }

                            education[5] = true;
                            redo = false;
                        }
                        while (education[0] && education[1] && education[2] && education[3] && education[4] && education[5] && !education[6] && redo) {
                            Education siete = new Education();
                            System.out.println("Please Enter the school you attended:");
                            siete.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            siete.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            siete.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            siete.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(siete);
                            } else if (!resume[1]) {
                                second.setEdList(siete);
                            } else if (!resume[2]) {
                                third.setEdList(siete);
                            } else if(!resume[3]){
                                fourth.setEdList(siete);
                            } else if(!resume[4]){
                                fifth.setEdList(siete);
                            }

                            education[6] = true;
                            redo = false;
                        }
                        while (education[0] && education[1] && education[2] && education[3] && education[4] && education[5] && education[6] && !education[7] && redo) {
                            Education ocho = new Education();
                            System.out.println("Please Enter the school you attended:");
                            ocho.setSchool(scan.nextLine());

                            System.out.println("Please enter the Year you graduated:");
                            ocho.setYear(scan.nextInt());
                            scan.nextLine();

                            System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                            ocho.setDegree(scan.nextLine());

                            System.out.println("Please enter the Major you got your degree in:");
                            ocho.setMajor(scan.nextLine());


                            if (!resume[0]) {
                                first.setEdList(ocho);
                            } else if (!resume[1]) {
                                second.setEdList(ocho);
                            } else if (!resume[2]) {
                                third.setEdList(ocho);
                            } else if(!resume[3]){
                                fourth.setEdList(ocho);
                            } else if(!resume[4]){
                                fifth.setEdList(ocho);
                            }

                            education[7] = true;
                            redo = false;
                        }


                        System.out.println("Would you like to add more education? (Y/N)");
                        input = scan.nextLine().toLowerCase();
                        if (input.equals("n")) {
                            edTest = false;


                        }
                    }


                    System.out.println("\n\nGreat!  Now we can add work experience.");

                    boolean exTest = true;
                    redo = true;
                    while (exTest) {
                        if(redo){
                        System.out.println("Would you like to add any work experience? (Y/N)");
                        input = scan.nextLine().toLowerCase();
                        if(input.equals("n")){
                            break;
                        }
                        }
                        redo = true;
                        while (!exp[0] && redo) {
                            Experience ichi = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            ichi.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            ichi.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            ichi.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            ichi.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(ichi);
                            } else if (!resume[1]) {
                                second.setExList(ichi);
                            } else if(!resume[2]){
                                third.setExList(ichi);
                            }else if (!resume[3]){
                                fourth.setExList(ichi);
                            }else if (!resume[4]){
                                fifth.setExList(ichi);
                            }
                            exp[0] = true;
                            redo = false;
                        }
                        while (exp[0] && !exp[1] && redo) {
                            Experience ni = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            ni.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            ni.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            ni.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            ni.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(ni);
                            } else if (!resume[1]) {
                                second.setExList(ni);
                            } else if(!resume[2]){
                                third.setExList(ni);
                            }else if (!resume[3]){
                                fourth.setExList(ni);
                            }else if (!resume[4]){
                                fifth.setExList(ni);
                            }
                            exp[1] = true;
                            redo = false;
                        }
                        while (exp[0] && exp[1] && !exp[2] && redo) {
                            Experience san = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            san.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            san.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            san.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            san.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(san);
                            } else if (!resume[1]) {
                                second.setExList(san);
                            } else if(!resume[2]){
                                third.setExList(san);
                            }else if (!resume[3]){
                                fourth.setExList(san);
                            }else if (!resume[4]){
                                fifth.setExList(san);
                            }
                            exp[2] = true;
                            redo = false;
                        }
                        while (exp[0] && exp[1] && exp[2] && !exp[3] && redo) {
                            Experience shi = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            shi.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            shi.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            shi.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            shi.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(shi);
                            } else if (!resume[1]) {
                                second.setExList(shi);
                            } else if(!resume[2]){
                                third.setExList(shi);
                            }else if (!resume[3]){
                                fourth.setExList(shi);
                            }else if (!resume[4]){
                                fifth.setExList(shi);
                            }
                            exp[3] = true;
                            redo = false;
                        }

                        while (exp[0] && exp[1] && exp[2] && exp[3] && !exp[4]  && redo) {
                            Experience go = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            go.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            go.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            go.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            go.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(go);
                            } else if (!resume[1]) {
                                second.setExList(go);
                            } else if(!resume[2]){
                                third.setExList(go);
                            }else if (!resume[3]){
                                fourth.setExList(go);
                            }else if (!resume[4]){
                                fifth.setExList(go);
                            }
                            exp[4] = true;
                            redo = false;
                        }
                        while (exp[0] && exp[1] && exp[2] && exp[3] && exp[4] && !exp[5] && redo) {
                            Experience roku = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            roku.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            roku.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            roku.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            roku.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(roku);
                            } else if (!resume[1]) {
                                second.setExList(roku);
                            } else if(!resume[2]){
                                third.setExList(roku);
                            }else if (!resume[3]){
                                fourth.setExList(roku);
                            }else if (!resume[4]){
                                fifth.setExList(roku);
                            }
                            exp[5] = true;
                            redo = false;
                        }
                        while (exp[0] && exp[1] && exp[2] && exp[3] && exp[4] && exp[5] && !exp[6] && redo) {
                            Experience nana = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            nana.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            nana.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                            nana.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            nana.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(nana);
                            } else if (!resume[1]) {
                                second.setExList(nana);
                            } else if(!resume[2]){
                                third.setExList(nana);
                            }else if (!resume[3]){
                                fourth.setExList(nana);
                            }else if (!resume[4]){
                                fifth.setExList(nana);
                            }
                            exp[6] = true;
                            redo = false;
                        }
                        while (exp[0] && exp[1] && exp[2] && exp[3] && exp[4] && exp[5] && exp[6] && !exp[7] && redo) {
                            Experience hachi = new Experience();
                            System.out.println("Please Enter the company you worked for:");
                            hachi.setCompany(scan.nextLine());

                            System.out.println("Please enter your Title at the company:");
                            hachi.setTitle(scan.nextLine());

                            System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                           hachi.setDate(scan.nextLine());

                            System.out.println("Please enter a description of your position:");
                            hachi.setDescription(scan.nextLine());

                            if (!resume[0]) {
                                first.setExList(hachi);
                            } else if (!resume[1]) {
                                second.setExList(hachi);
                            } else if(!resume[2]){
                                third.setExList(hachi);
                            }else if (!resume[3]){
                                fourth.setExList(hachi);
                            }else if (!resume[4]){
                                fifth.setExList(hachi);
                            }
                            exp[7] = true;
                            redo = false;
                        }

                        System.out.println("Would you like to add another work experience? (Y/N)");
                        input = scan.nextLine().toLowerCase();
                        if (input.equals("n")) {
                            exTest = false;
                        }

                    }

                    System.out.println("\n\nAll that's left is to add your marketable Skills...");
                    boolean skillTest = false;
                    redo = true;
                    while (!skillTest) {
                        if(redo){
                        System.out.println("Would you like to add any Skills?(Y/N)");
                        input = scan.nextLine().toLowerCase();
                        if(input.equals("n")){
                            break;
                        }}
                        redo = true;
                        while (!skills[0] && redo) {
                            Skill eins = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            eins.setSkill(scan.nextLine());
                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            eins.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(eins);
                            } else if (!resume[1]) {
                                second.setSkList(eins);
                            } else if (!resume[2]){
                                third.setSkList(eins);
                            } else if (!resume[3]){
                                fourth.setSkList(eins);
                            } else if (!resume[4]){
                                fifth.setSkList(eins);
                            }
                            skills[0] = true;
                            redo = false;
                        }
                        while (skills[0] && !skills[1] && redo) {
                            Skill zwei = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            zwei.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            zwei.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(zwei);
                            } else if (!resume[1]) {
                                second.setSkList(zwei);
                            } else if (!resume[2]){
                                third.setSkList(zwei);
                            } else if (!resume[3]){
                                fourth.setSkList(zwei);
                            } else if (!resume[4]){
                                fifth.setSkList(zwei);
                            }
                            skills[1] = true;
                            redo = false;
                        }
                        while (skills[0] && skills[1] && !skills[2] && redo) {
                            Skill drei = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            drei.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            drei.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(drei);
                            } else if (!resume[1]) {
                                second.setSkList(drei);
                            } else if (!resume[2]){
                                third.setSkList(drei);
                            } else if (!resume[3]){
                                fourth.setSkList(drei);
                            } else if (!resume[4]){
                                fifth.setSkList(drei);
                            }
                            skills[2] = true;
                            redo = false;
                        }
                        while (skills[0] && skills[1] && skills[2] && !skills[3] && redo) {
                            Skill vier = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            vier.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            vier.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(vier);
                            } else if (!resume[1]) {
                                second.setSkList(vier);
                            } else {
                                third.setSkList(vier);
                            }
                            skills[3] = true;
                            redo = false;
                        }
                        while (skills[0] && skills[1] && skills[2] && skills[3] && !skills[4] && redo) {
                            Skill funf = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            funf.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            funf.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(funf);
                            } else if (!resume[1]) {
                                second.setSkList(funf);
                            } else if (!resume[2]){
                                third.setSkList(funf);
                            } else if (!resume[3]){
                                fourth.setSkList(funf);
                            } else if (!resume[4]){
                                fifth.setSkList(funf);
                            }
                            skills[4] = true;
                            redo = false;
                        }
                        while (skills[0] && skills[1] && skills[2] && skills[3] && skills[4] && !skills[5] && redo) {
                            Skill sechs = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            sechs.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            sechs.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(sechs);
                            } else if (!resume[1]) {
                                second.setSkList(sechs);
                            } else if (!resume[2]){
                                third.setSkList(sechs);
                            } else if (!resume[3]){
                                fourth.setSkList(sechs);
                            } else if (!resume[4]){
                                fifth.setSkList(sechs);
                            }
                            skills[5] = true;
                            redo = false;
                        }
                        while (skills[0] && skills[1] && skills[2] && skills[3] && skills[4] && skills[5] && !skills[6] && redo) {
                            Skill sieben = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            sieben.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            sieben.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(sieben);
                            } else if (!resume[1]) {
                                second.setSkList(sieben);
                            } else if (!resume[2]){
                                third.setSkList(sieben);
                            } else if (!resume[3]){
                                fourth.setSkList(sieben);
                            } else if (!resume[4]){
                                fifth.setSkList(sieben);
                            }
                            skills[6] = true;
                            redo = false;
                        }
                        while (skills[0] && skills[1] && skills[2] && skills[3] && skills[4] && skills[5] && skills[6] && !skills[7] && redo) {
                            Skill acht = new Skill();
                            System.out.println("Please enter a skill you possess:");
                            acht.setSkill(scan.nextLine());

                            System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                            acht.setLevel(scan.nextLine());

                            if (!resume[0]) {
                                first.setSkList(acht);
                            } else if (!resume[1]) {
                                second.setSkList(acht);
                            } else if (!resume[2]){
                                third.setSkList(acht);
                            } else if (!resume[3]){
                                fourth.setSkList(acht);
                            } else if (!resume[4]){
                                fifth.setSkList(acht);
                            }
                            skills[6] = true;
                            redo = false;
                        }
                        System.out.println("Would you like to add another Skill? (Y/N)");
                        input = scan.nextLine();
                        if (input.equals("n")) {
                            skillTest = true;
                        }

                    }


                    if (resume[3]) {
                        resume[4] = true;
                        resList.add(fifth);
                        System.out.println(fifth.toString());
                    }
                    else if (resume[2]) {
                        resume[3] = true;
                        resList.add(fourth);
                        System.out.println(fourth.toString());
                    }
                    else if (resume[1]) {
                        resume[2] = true;
                        resList.add(third);
                        System.out.println(third.toString());
                    }
                    else if (resume[0]) {
                        resume[1] = true;
                        resList.add(second);
                        System.out.println(second.toString());
                    }
                    else {
                        resume[0] = true;
                        resList.add(first);
                        System.out.println(first.toString());
                    }

                    System.out.println("Would you like to return to the main menu?");
                    input = scan.nextLine().toLowerCase();
                    if (!input.equals("n")) {
                        break;
                    }
                }
            }


            if (input.equals("edit")) {
                while (true) {

                    for (Resume r : resList) {
                        System.out.println(r.getDetails().getName() + "\n");
                    }
                    System.out.println("Which resume would you like to edit?");
                    String resEdit = scan.nextLine();
                    for (Resume r : resList) {
                        if (resEdit.equalsIgnoreCase(r.getDetails().getName())) {
                            e = r;
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("Which part of the resume would you like to edit: Name, Email, or Phone Number?");
                        input = scan.nextLine().toLowerCase();
                        switch (input) {
                            case "name":
                                System.out.println("please enter a new name:");
                                input = scan.nextLine();
                                e.getDetails().setName(input);
                                break;
                            case "email":
                                System.out.println("Please enter a new email:");
                                input = scan.nextLine();
                                e.getDetails().seteMail(input);
                                break;
                            case "phone number":
                                System.out.println("Please enter a new Phone number:");
                                input = scan.nextLine();
                                e.getDetails().setPhone(input);
                                break;
                        }
                        System.out.println("Would you like to edit anything else in this resume? (Y/N)");
                        input = scan.nextLine().toLowerCase();
                        if (input.equals("n")) {
                            break;
                        }
                    }
                    System.out.println("Would you like to edit another resume? (Y/N)");
                    input = scan.nextLine().toLowerCase();
                    if (input.equals("n")) {
                        break;
                    }
                }
            }


            if (input.equals("browse")) {
                while (true){
                    System.out.println("Would you like to search for a specific skill, or print all resumes? (Skill/All)");
                    input = scan.nextLine().toLowerCase();
                    if(input.equals("all")){
                        for(Resume r:resList){
                            System.out.println(r.toString());
                        }

                    }
                    if(input.equals("skill")){
                        int m=0;
                        System.out.println("what skill are you looking for?");
                        input = scan.nextLine();
                        for(Resume r:resList){
                            for(Skill s: r.getSkList()){
                                if(input.equals(s.getSkill())){

                                    m++;
                                    System.out.println(r.toString());
                                }
                            }
                        }
                        if(m==0){
                            System.out.println("There are no matches for that skill.  Please try again.");
                        }
                    }
                    else {
                        System.out.println("That is not an option please try again.");
                    }

                    System.out.println("\n\n\nWould you like to browse something else? (Y/N)");
                    input = scan.nextLine().toLowerCase();
                    if(input.equals("n")){
                        break;
                    }

                }
            }
        }
    }
}
