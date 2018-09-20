package com.demo.store.controller;

 

import java.util.ArrayList;

import java.util.List;

 

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

 

import com.demo.store.domain.Bill;

import com.demo.store.domain.User;

import com.demo.store.enums.ItemType;

import com.demo.store.enums.Role;

 

@RestController

@RequestMapping("/store/*")

public class StoreController {

 

       /**

       * Gets the bill with discount.

       *

        * @param bill

       * @return the consumer profile

       */

       @RequestMapping(value = "/getBill", method = RequestMethod.POST)

       public Bill getFullBill(@RequestBody Bill bill) {

              ItemType itemType = bill.getType();

              double discount = 0;

              if (itemType != null && !ItemType.GROCERY.equals(itemType)) {

                     discount = getDiscount(bill);

              }

              double finalAmount = bill.getBillAmount() - discount;

              bill.setDiscount(discount);

              bill.setFinalAmount(finalAmount);

              return bill;

       }

 

       private double getDiscount(Bill bill) {

              double discount = 0;

              List<User> users = getUsers();

              for (User user : users) {

                     if (user.getId() == bill.getUserId()) {

                           Role role = user.getRole();

                           switch (role) {

                           case EMPLOYEE:

                                  discount = (double)Role.EMPLOYEE.getDiscountPercent()/100 * bill.getBillAmount();

                                  break;

                           case AFFILIATE:

                                  discount = (double)Role.AFFILIATE.getDiscountPercent()/100 * bill.getBillAmount();

                                  break;

                           case OLD_USER:

                                  discount = (double)Role.OLD_USER.getDiscountPercent()/100 * bill.getBillAmount();

                                  break;

                           default:

                                  discount = (double)Role.DEFAULT.getDiscountPercent()/100 * (bill.getBillAmount() - (bill.getBillAmount() % 100));

                           }

                           break;

                     }

              }

              return discount;

       }

 

       private List<User> getUsers() {

              List<User> users = new ArrayList<User>();

              User user = new User();

              user.setId(1001);

              user.setName("Chris");

              user.setPhone(999587);

              user.setRole(Role.EMPLOYEE);

              users.add(user);

 

              user = new User();

              user.setId(1002);

              user.setName("Ben");

              user.setPhone(789546);

              user.setRole(Role.AFFILIATE);

              users.add(user);

 

              user = new User();

              user.setId(1003);

              user.setName("Jenny");

              user.setPhone(774584);

              user.setRole(Role.OLD_USER);

              users.add(user);

              return users;

       }

}
