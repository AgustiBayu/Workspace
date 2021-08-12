package programer.java.now.data;

/*
class ini hanya implementasi final saja
*/
class SosialMedia {
    
    String name;
}

/*
dalam class facebook ini merupakan turunan dari sosialmedia
dan class facebook ini di set keyword final, dengan menggunakan 
keyword final maka class facebook tidak dapat diturunkan lagi dalam 
class lain
*/
final class Facebook extends SosialMedia{
    
}

class Telegram extends SosialMedia{
    
    final void login(String userName, String passWord){
        System.out.println(userName+ " " +passWord);
    }
    
}

/*
class telegramku ini akan merupakan turunan dari Telegram
yang mana terdapat sebuah method login yang mana dalam method itu 
terdapat sebuah keyword final sehingga method login tidak dapat 
di overried
*/

//class Telegramku extends Telegram{
    
   // void login(String userName2, String passWord2){
      //  System.out.println(userName2+ " " +passWord2);
 //   }
//}

