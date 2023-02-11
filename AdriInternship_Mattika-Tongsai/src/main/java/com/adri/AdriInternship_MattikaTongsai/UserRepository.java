package com.adri.AdriInternship_MattikaTongsai;

import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, String> 
{
       // User findByUser (String title);
       User findByUserName(String user_name);
}

