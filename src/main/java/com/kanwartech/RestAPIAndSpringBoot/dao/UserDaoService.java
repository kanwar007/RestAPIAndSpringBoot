package com.kanwartech.RestAPIAndSpringBoot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.kanwartech.RestAPIAndSpringBoot.model.User;

@Component
public class UserDaoService {
    static int count =0;
    static List<User> listUser= new  ArrayList<>();
    private static Predicate<? super User> user;
   
   static {
    listUser.add(new User(count++, "vijay", "kanwar", "Bilasput","kanwar@test.com", 221532));
    listUser.add(new User(count++, "Ajay", "kanwar", "Bilasput","ajay@test.com", 24380));

    listUser.add(new User(count++, "Sonam", "Bala", "Australia","Bala@test.com", 243987));

    listUser.add(new User(count++, "Avyukt", "kanwar", "Perth","Avyukt@test.com", 89766));

   }

   public  List<User> getUserList(){
    return listUser;
   }

   public  User getUserId(int id){
    Predicate<? super User> predicate = user -> user.getId().equals(id);
    return listUser.stream().filter(predicate).findFirst().orElse(null);
   }
   public User addUser(User user){
        user.setId(count++);
        listUser.add(user);
        return user;
     }
   public void deleteUser(int id ){
      Predicate<? super User> predicate = user -> user.getId().equals(id);
       listUser.removeIf(predicate);
   }

    

}
