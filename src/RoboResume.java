import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {
    private static Scanner scan = new Scanner(System.in);
    private static String input;
    private static Resume first = new Resume();
    private static Resume second = new Resume();
    private static Resume third = new Resume();

    private static boolean[] education = {false, false, false, false, false, false, false, false, false, false};
    private static boolean[] resume = {false, false, false};
    private static boolean[] info = {false, false, false};
    private static boolean[] exp = {false, false, false, false, false, false};
    private static boolean[] skills = {false, false, false, false, false, false};

    public static void main(String[] args) {


        System.out.println("welcome to RoboResume!\n\nLet's collect your personal information...\n");


        boolean infoTest = false;
        while(!infoTest) {
            while (!info[1]) {
                Info one = new Info();
                System.out.println("Please enter your Full Name:");
                one.setName(scan.nextLine());

                System.out.println("Please enter you E-Mail Address:");
                one.seteMail(scan.nextLine());

                System.out.println("Please enter your Phone Number");
                one.setPhone(scan.nextLine());

                first.setDetails(one);
                info[1] = true;
                infoTest=true;
            }

            while (info[1] && !info[2]) {
                Info two = new Info();
                System.out.println("Please enter your Full Name:");
                two.setName(scan.nextLine());

                System.out.println("Please enter you E-Mail Address:");
                two.seteMail(scan.nextLine());

                System.out.println("Please enter your Phone Number");
                two.setPhone(scan.nextLine());

                second.setDetails(two);
                info[2] = true;
                infoTest=true;

            }
        }


        System.out.println("Next lets add Education...\n");
        boolean edTest = true;
        while (edTest) {
            while (!education[1]) {
                Education uno = new Education();
                System.out.println("Please Enter the school you attended(or None):");
                uno.setSchool(scan.nextLine());

                System.out.println("Please enter the Year you graduated:");
                uno.setYear(scan.nextInt());
                scan.nextLine();

                System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                uno.setDegree(scan.nextLine());

                System.out.println("please enter the Major you got your degree in:");
                uno.setMajor(scan.nextLine());


                if (!resume[1]) {
                    first.setEdList(uno);
                } else if (!resume[2]) {
                    second.setEdList(uno);
                } else if (!resume[3]) {
                    third.setEdList(uno);
                }
                education[1] = true;
            }
            while (education[1] && !education[2]) {
                Education dos = new Education();
                System.out.println("Please Enter the school you attended:");
                dos.setSchool(scan.nextLine());

                System.out.println("Please enter the Year you graduated:");
                dos.setYear(scan.nextInt());
                scan.nextLine();

                System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                dos.setDegree(scan.nextLine());

                System.out.println("please enter the Major you got your degree in:");
                dos.setMajor(scan.nextLine());

                if (!resume[1]) {
                    first.setEdList(dos);
                } else if (!resume[2]) {
                    second.setEdList(dos);
                } else if (!resume[3]) {
                    third.setEdList(dos);
                }
                education[2] = true;

            }
            while (!education[1] && education[2] && !education[3]) {
                Education tres = new Education();
                System.out.println("Please Enter the school you attended:");
                tres.setSchool(scan.nextLine());

                System.out.println("Please enter the Year you graduated:");
                tres.setYear(scan.nextInt());
                scan.nextLine();

                System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                tres.setDegree(scan.nextLine());

                System.out.println("please enter the Major you got your degree in:");
                tres.setMajor(scan.nextLine());


                if (!resume[1]) {
                    first.setEdList(tres);
                } else if (!resume[2]) {
                    second.setEdList(tres);
                } else if (!resume[3]) {
                    third.setEdList(tres);
                }
                education[3] = true;
            }
            while (!education[1] && education[2] && education[3] && !education[4]) {
                Education cuatro = new Education();
                System.out.println("Please Enter the school you attended:");
                cuatro.setSchool(scan.nextLine());

                System.out.println("Please enter the Year you graduated:");
                cuatro.setYear(scan.nextInt());
                scan.nextLine();

                System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                cuatro.setDegree(scan.nextLine());

                System.out.println("please enter the Major you got your degree in:");
                cuatro.setMajor(scan.nextLine());


                if (!resume[1]) {
                    first.setEdList(cuatro);
                } else if (!resume[2]) {
                    second.setEdList(cuatro);
                } else if (!resume[3]) {
                    third.setEdList(cuatro);
                }
                education[4] = true;
            }
            while (!education[1] && education[2] && education[3] && education[4] && !education[5]) {
                Education cinco = new Education();
                System.out.println("Please Enter the school you attended:");
                cinco.setSchool(scan.nextLine());

                System.out.println("Please enter the Year you graduated:");
                cinco.setYear(scan.nextInt());
                scan.nextLine();

                System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                cinco.setDegree(scan.nextLine());

                System.out.println("please enter the Major you got your degree in:");
                cinco.setMajor(scan.nextLine());


                if (!resume[1]) {
                    first.setEdList(cinco);
                } else if (!resume[2]) {
                    second.setEdList(cinco);
                } else if (!resume[3]) {
                    third.setEdList(cinco);
                }

                education[5] = true;
            }

            while (!education[1] && education[2] && education[3] && education[4] && education[5] && !education[6]) {
                Education seis = new Education();
                System.out.println("Please Enter the school you attended:");
                seis.setSchool(scan.nextLine());

                System.out.println("Please enter the Year you graduated:");
                seis.setYear(scan.nextInt());
                scan.nextLine();

                System.out.println("Please enter the type of degree you earned (Bachelors, Masters, etc.):");
                seis.setDegree(scan.nextLine());

                System.out.println("please enter the Major you got your degree in:");
                seis.setMajor(scan.nextLine());


                if (!resume[1]) {
                    first.setEdList(seis);
                } else if (!resume[2]) {
                    second.setEdList(seis);
                } else if (!resume[3]) {
                    third.setEdList(seis);
                }

                education[6] = true;
            }


            System.out.println("Would you like to add more education? (Y/N");
            input = scan.nextLine().toLowerCase();
            if (input.equals("no")) {
                edTest = false;


            }
        }


        System.out.println("Great!  Now we can add work experience.");
        boolean exTest = true;
        while (exTest) {
            while (!exp[1]) {
                Experience ichi = new Experience();
                System.out.println("Please Enter the company you worked for:");
                ichi.setCompany(scan.nextLine());

                System.out.println("Please enter your Title at the company:");
                ichi.setTitle(scan.nextLine());

                System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                ichi.setDate(scan.nextLine());

                System.out.println("please enter a description of your position:");
                ichi.setDescription(scan.nextLine());

                if (!resume[1]) {
                    first.setExList(ichi);
                } else if (!resume[2]) {
                    second.setExList(ichi);
                } else {
                    third.setExList(ichi);
                }
                exp[1] = true;
            }
            while (exp[1] && !exp[2]) {
                Experience ni = new Experience();
                System.out.println("Please Enter the company you worked for:");
                ni.setCompany(scan.nextLine());

                System.out.println("Please enter your Title at the company:");
                ni.setTitle(scan.nextLine());

                System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                ni.setDate(scan.nextLine());

                System.out.println("please enter a description of your position:");
                ni.setDescription(scan.nextLine());

                if (!resume[1]) {
                    first.setExList(ni);
                } else if (!resume[2]) {
                    second.setExList(ni);
                } else {
                    third.setExList(ni);
                }
                exp[2] = true;
            }
            while (exp[1] && exp[2] && !exp[3]) {
                Experience san = new Experience();
                System.out.println("Please Enter the company you worked for:");
                san.setCompany(scan.nextLine());

                System.out.println("Please enter your Title at the company:");
                san.setTitle(scan.nextLine());

                System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                san.setDate(scan.nextLine());

                System.out.println("please enter a description of your position:");
                san.setDescription(scan.nextLine());

                if (!resume[1]) {
                    first.setExList(san);
                } else if (!resume[2]) {
                    second.setExList(san);
                } else {
                    third.setExList(san);
                }
                exp[3] = true;
            }
            while (exp[1] && exp[2] && exp[3] && !exp[4]) {
                Experience shi = new Experience();
                System.out.println("Please Enter the company you worked for:");
                shi.setCompany(scan.nextLine());

                System.out.println("Please enter your Title at the company:");
                shi.setTitle(scan.nextLine());

                System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                shi.setDate(scan.nextLine());

                System.out.println("please enter a description of your position:");
                shi.setDescription(scan.nextLine());

                if (!resume[1]) {
                    first.setExList(shi);
                } else if (!resume[2]) {
                    second.setExList(shi);
                } else {
                    third.setExList(shi);
                }
                exp[4] = true;
            }

            while (exp[1] && exp[2] && exp[3] && exp[4] && exp[4] && !exp[5]) {
                Experience go = new Experience();
                System.out.println("Please Enter the company you worked for:");
                go.setCompany(scan.nextLine());

                System.out.println("Please enter your Title at the company:");
                go.setTitle(scan.nextLine());

                System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                go.setDate(scan.nextLine());

                System.out.println("please enter a description of your position:");
                go.setDescription(scan.nextLine());

                if (!resume[1]) {
                    first.setExList(go);
                } else if (!resume[2]) {
                    second.setExList(go);
                } else {
                    third.setExList(go);
                }
                exp[5] = true;
            }
            while (exp[1] && exp[2] && exp[3] && exp[4] && exp[5] && !exp[6]) {
                Experience roku = new Experience();
                System.out.println("Please Enter the company you worked for:");
                roku.setCompany(scan.nextLine());

                System.out.println("Please enter your Title at the company:");
                roku.setTitle(scan.nextLine());

                System.out.println("Please enter your time at the company (mm/yy to mm/yy)");
                roku.setDate(scan.nextLine());

                System.out.println("please enter a description of your position:");
                roku.setDescription(scan.nextLine());

                if (!resume[1]) {
                    first.setExList(roku);
                } else if (!resume[2]) {
                    second.setExList(roku);
                } else {
                    third.setExList(roku);
                }
                exp[6] = true;
            }

            System.out.println("Would you like to add another work experience? (Y/N)");
            input = scan.nextLine();
            if (input.equals("n")) {
                exTest = false;
            }
        }

        System.out.println("All that's left is to add your marketable Skills...");
        boolean skillTest = false;
        while (!skillTest) {

            while (!skills[1]) {
                Skill eins = new Skill();
                System.out.println("Please enter a skill you possess:");
                eins.setSkill(scan.nextLine());

                System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                eins.setLevel(scan.nextLine());

                if (!resume[1]) {
                    first.setSkList(eins);
                } else if (!resume[2]) {
                    second.setSkList(eins);
                } else {
                    third.setSkList(eins);
                }
                skills[1] = true;
            }
            while (skills[1] && !skills[2]) {
                Skill zwei = new Skill();
                System.out.println("Please enter a skill you possess:");
                zwei.setSkill(scan.nextLine());

                System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                zwei.setLevel(scan.nextLine());

                if (!resume[1]) {
                    first.setSkList(zwei);
                } else if (!resume[2]) {
                    second.setSkList(zwei);
                } else {
                    third.setSkList(zwei);
                }
                skills[2] = true;
            }
            while (skills[1] && skills[2] && !skills[3]) {
                Skill drei = new Skill();
                System.out.println("Please enter a skill you possess:");
                drei.setSkill(scan.nextLine());

                System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                drei.setLevel(scan.nextLine());

                if (!resume[1]) {
                    first.setSkList(drei);
                } else if (!resume[2]) {
                    second.setSkList(drei);
                } else {
                    third.setSkList(drei);
                }
                skills[3] = true;
            }
            while (skills[1] && skills[2] && skills[3] && !skills[4]) {
                Skill vier = new Skill();
                System.out.println("Please enter a skill you possess:");
                vier.setSkill(scan.nextLine());

                System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                vier.setLevel(scan.nextLine());

                if (!resume[1]) {
                    first.setSkList(vier);
                } else if (!resume[2]) {
                    second.setSkList(vier);
                } else {
                    third.setSkList(vier);
                }
                skills[4] = true;
            }
            while (skills[1] && skills[2] && skills[3] && skills[4] && !skills[5]) {
                Skill funf = new Skill();
                System.out.println("Please enter a skill you possess:");
                funf.setSkill(scan.nextLine());

                System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                funf.setLevel(scan.nextLine());

                if (!resume[1]) {
                    first.setSkList(funf);
                } else if (!resume[2]) {
                    second.setSkList(funf);
                } else {
                    third.setSkList(funf);
                }
                skills[5] = true;
            }
            while (skills[1] && skills[2] && skills[3] && skills[4] && skills[5] && skills[6]) {
                Skill sechs = new Skill();
                System.out.println("Please enter a skill you possess:");
                sechs.setSkill(scan.nextLine());

                System.out.println("How would you rank your proficiency in that skill?\nFundamental, Novice, Intermediate, Advanced, or Expert");
                sechs.setLevel(scan.nextLine());

                if (!resume[1]) {
                    first.setSkList(sechs);
                } else if (!resume[2]) {
                    second.setSkList(sechs);
                } else {
                    third.setSkList(sechs);
                }
                skills[6] = true;
            }
            System.out.println("Would you like to add another Skill? (Y/N)");
            input = scan.nextLine();
            if(input.equals("n")){
                skillTest=true;
            }

        }

        while (true) {
            if (resume[1]) {
                resume[2] = true;
                break;
            }
            if (resume[2]) {
                resume[3] = true;
                break;
            } else {
                resume[1] = true;
                break;
            }


        }
    }
}
