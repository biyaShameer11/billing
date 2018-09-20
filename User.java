package com.demo.store.domain;

 

import com.demo.store.enums.Role;

 

public class User {

 

       private int id;

 

       private String name;

 

       private long phone;

 

       private Role role;

      

       public User() {

              this.role = Role.DEFAULT;

       }

 

       /**

       * @return the id

       */

       public int getId() {

              return id;

       }

 

       /**

       * @param id

       *            the id to set

       */

       public void setId(int id) {

              this.id = id;

       }

 

       /**

       * @return the name

       */

       public String getName() {

              return name;

       }

 

       /**

       * @param name

       *            the name to set

       */

       public void setName(String name) {

              this.name = name;

       }

 

       /**

       * @return the phone

       */

       public long getPhone() {

              return phone;

       }

 

       /**

       * @param phone

       *            the phone to set

       */

       public void setPhone(long phone) {

              this.phone = phone;

       }

 

       /**

       * @return the role

       */

       public Role getRole() {

              return role;

       }

 

       /**

       * @param role

       *            the role to set

       */

       public void setRole(Role role) {

              this.role = role;

       }

}

