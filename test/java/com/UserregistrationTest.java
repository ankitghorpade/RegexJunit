package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserregistrationTest {
     //Test for firstname validation
        @Test
        void CheckFirstNameWhileCorrectReturnTrue() {
            Userregistration fName = new Userregistration();
            String ch = fName.firstName("Mounir");
            Assertions.assertEquals("HAPPY",ch);
            System.out.println(ch);
        }

        @Test
        void CheckLastnameWhileCorrectReturnTrue() {

            Userregistration lName = new Userregistration();
            String ch = lName.lastName("Roy");
            Assertions.assertEquals("HAPPY", ch);
            System.out.println(ch);
        }

        @Test
        void CheckEmailWhileCorrectReturnTrue() {

            Userregistration eMail = new Userregistration();
            String ch = eMail.email("mouniroy123@gmail.com");
            Assertions.assertEquals("HAPPY", ch);
            System.out.println(ch);
        }



        @Test
        void CheckNumberWhileCorrectReturnTrue() {

            Userregistration number = new Userregistration();
            String ch = number.phoneNumber("91 7880437890");
            Assertions.assertEquals("HAPPY", ch);
            System.out.println(ch);
        }

        @Test
        void CheckPasswordWhileCorrectReturnTrue() {
            Userregistration pwd = new Userregistration();
            String ch = pwd.password("Mouni@123");
            Assertions.assertEquals("HAPPY", ch);
            System.out.println(ch);
        }
    }
