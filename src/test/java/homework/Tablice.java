package homework;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tablice {

    String[] peoples = new String[]{"Piotr", "Kewin", "Gracjan", "Cezary", "Gracjan", "Gniewomir", "Edward", "Alfred", "Jerzy", "Rafał", "Oktawian",
            "Roksana", "Maja", "Mirosława", "Joanna", "Ida", "Bogusława", "Izabela", "Dorota", "Anna", "Anita"};
    List<String> names = Arrays.asList(peoples);
    int index = new Random().nextInt(names.size());
    String name = names.get(index);

    public String[] getPeoples() {
        return peoples;
    }
    public void setPeoples(String[] peoples) {
        this.peoples = peoples;
    }
    public List<String> getNames() {
        return names;
    }
    public void setNames(List<String> names) {
        this.names = names;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    String surname[] = new String[] {"Wasilewska", "Pawlak", "Głowacka", "Kamiński", "Stachowiak", "Mazur", "Andrzejewski", "Makowski", "Andrzejewski", "Kucharski",
                "Kucharski", "Włodarczyk", "Mazur", "Michalak", "Szulc", "Wojciechowski", "Zawadzki", "Zakrzewska", "Andrzejewski", "Kaźmierczak"};
    List<String> surnames= Arrays.asList(surname);
    int j = new Random().nextInt(names.size());
    String randomSurname = surnames.get(j);
    public String[] getSurname() {
        return surname;
    }

    public void setSurname(String[] surname) {
        this.surname = surname;
    }

    public List<String> getSurnames() {
        return surnames;
    }

    public void setSurnames(List<String> surnames) {
        this.surnames = surnames;
    }

    public String getRandomSurname() {
        return randomSurname;
    }

    public void setRandomSurname(String randomSurname) {
        this.randomSurname = randomSurname;
    }

     String email[] = {"reroboc447@eyeremind.com", "fezefrausagre-5589@yopmail.com", "rezeubrafrebu-2891@yopmail.com", "reroboc4478@eyeremind.com",
               "fezefrausagre-55890@yopmail.com", "rezeubrafrebu-28910@yopmail.com", "reroboc4477@eyeremind.com", "fezefrausagre-558990@yopmail.com",
                "rezeubrafrebu-289501@yopmail.com", "neuttoffuddoiwe-2577@yopmail.com", "vafreudokecu-8901@yopmail.com", "aga1234@o2.pl", "wojtek768686@onet.pl",
               "tomek898989@gmail.com", "aga1234789@o2.pl", "wojtek768686789@onet.pl", "tomek898989789@gmail.com", "aga1234234@o2.pl", "wojtek768686234@onet.pl",
                "tomek898982349@gmail.com"};

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getRandomEmail() {
        return randomEmail;
    }

    public void setRandomEmail(String randomEmail) {
        this.randomEmail = randomEmail;
    }

    public String[] getPassword() {
        return password;
    }

    public void setPassword(String[] password) {
        this.password = password;
    }

    public void setPasswords(List<String> passwords) {
        this.passwords = passwords;
    }

    public String getRandomPasswords() {
        return randomPasswords;
    }

    public void setRandomPasswords(String randomPasswords) {
        this.randomPasswords = randomPasswords;
    }

    List<String> emails= Arrays.asList(email);
    int k = new Random().nextInt(emails.size());
    String randomEmail = emails.get(k);
    public String[] getEmails() {
        return email;
    }



//        int [] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//    List<String> numbers= Arrays.asList(number);
//    int l = new Random().nextInt(emails.size());
//    String randomNumber = emails.get(k);
//    String[] getEmails() {
//        return number;



         String password[] = {"hjghjg44", "sjsdjkhs676", "jsfdjksdf8", "jshsh4545", "hbasdhja356231", "jhkedjhkasdjkh7878", "jhusdahsah78", "jhfdejnhdsf7667", "sfdjksjfdk87", "hjksdfjhkdajkh376376",
               "hjghjg447", "sjsdjkhs6767", "jsfdjksdf87", "jshsh45457", "hbasdhja3562317", "jhkedjhkasdjkh78787", "jhusdahsah787", "jhfdejnhdsf76677", "sfdjksjfdk877",
                "hjksdfjhkdajkh3763776"};

    List<String> passwords = Arrays.asList(password);
    int l = new Random().nextInt(emails.size());
    String randomPasswords = passwords.get(l);
    Object getPasswords() {
        return password;


//        String birthday[] = {"04/22/2010", "06/22/1987", "07/13/2010", "05/17/1990", "07/30/2010", "10/10/2010", "07/07/2007", "04/22/1986", "02/02/2013", "04/22/2013",
//                "03/22/2010", "06/13/1987", "04/04/2010", "05/18/1990", "07/31/2010", "10/07/2010", "07/12/2007", "04/27/1986", "02/07/2013", "04/29/2013"};
//        List<String> birthdays = Arrays.asList(birthday);
//        int m = new Random().nextInt(birthdays.size());
//        String randomBirthdays = birthdays.get(m);
//        String[] getBirthdays;
//        return birthdays;


//        private String addresses[] = {"Jarzębinowa 7", "Jesionowa 10", "Młynkowska4", "Wyczółkowskiego 13", "Wiosny Ludów 23", "osiedle Zwycięstwa 14", "osiedle Wichrowe Wzgórze 19",
//                "Omańkowskiej77", "Obornicka 90", "Szewska13", "Jarzębinowa 9", "Jesionowa 17", "Młynkowska40", "Wyczółkowskiego 19", "Wiosny Ludów 212", "osiedle Zwycięstwa 4",
//                "osiedle Wichrowe Wzgórze 9", "Omańkowskiej100", "Obornicka 290", "Szewska29"};
//        private String postcodes [] = {"76-000", "67-788", "78-333", "67-900", "34-000", "34-777", "56-434", "45-777", "23-979", "67-677",
//                "76-070", "67-768", "78-323", "67-900", "34-090", "34-797", "56-444", "45-797", "23-999", "67-647"};
//        private String cities[] = {"Wodzinek", "Bielskie", "Lubochawo", "Kanina", "Widminnen", "Murów", "Krosnowice", "Poznań", "Boruja", "Bozyń",
//                "Duszniki", "Bydgoszcz", "Warszawa", "Konin", "Kielce", "Sedlinen", "Bystrzyca Górna", "Bieżuń", "Jamund", "Zbrudzewo"};}}


//
//    private void randomName() {
//        for (int i = 0; i < name.length - 1; i++) {
//            i = name.length;
//            {
//                final String rName = this.rName;
//            }
////            return rName;
//        }}}
//
//
//
////        public String[] getName() {
////        for (int i = 0; i < name.length - 1; i++) {
////            i = name.length;
////
////        }
//////        return name;
////
////        return new String[0];
////    }
//
////    public void setName(String[] name) {
////        this.name = name;
//
//
////    public String[] getSurname() {
////        return surname;
////    }
////
////    public void setSurname(String[] surname) {
////        this.surname = surname;
////    }
////
////    public String[] getEmails() {
////        return emails;
////    }
////
////    public void setEmails(String[] emails) {
////        this.emails = emails;
////    }
////
////    public int[] getNumber() {
////        return number;
////    }
////
////    public void setNumber(int[] number) {
////        this.number = number;
////    }
////
////    public String[] getPasswords() {
////        return passwords;
////    }
////
////    public void setPasswords(String[] passwords) {
////        this.passwords = passwords;
////    }
////
////    public String[] getBirthdays() {
////        return birthdays;
////    }
////
////    public void setBirthdays(String[] birthdays) {
////        this.birthdays = birthdays;
////    }
////
////    public String[] getAddresses() {
////        return addresses;
////    }
////
////    public void setAddresses(String[] addresses) {
////        this.addresses = addresses;
////    }
////
////    public String[] getPostcodes() {
////        return postcodes;
////    }
////
////    public void setPostcodes(String[] postcodes) {
////        this.postcodes = postcodes;
////    }
////
////    public String[] getCities() {
////        return cities;
////    }
////
////    @Override
////    public String toString() {
////        return "Tablice{" +
////                "name=" + Arrays.toString(name) +
////                ", surname=" + Arrays.toString(surname) +
////                ", emails=" + Arrays.toString(emails) +
////                ", number=" + Arrays.toString(number) +
////                ", passwords=" + Arrays.toString(passwords) +
////                ", birthdays=" + Arrays.toString(birthdays) +
////                ", addresses=" + Arrays.toString(addresses) +
////                ", postcodes=" + Arrays.toString(postcodes) +
////                ", cities=" + Arrays.toString(cities) +
////                '}';
////    }
////
////    public void setCities(String[] cities) {
////        this.cities = cities;
////    }
////
////    }
////}}}}
    }}