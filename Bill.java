package com.demo.store.domain;

 

import com.demo.store.enums.ItemType;

 

public class Bill {

 

       private int id;

 

       private int userId;

 

       private ItemType type;

 

       private double discount;

 

       private double billAmount;

 

       private double finalAmount;

 

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

       * @return the userId

       */

       public int getUserId() {

              return userId;

       }

 

       /**

       * @param userId

       *            the userId to set

       */

       public void setUserId(int userId) {

              this.userId = userId;

       }

 

       /**

       * @return the type

       */

       public ItemType getType() {

              return type;

       }

 

       /**

       * @param type

       *            the type to set

       */

       public void setType(ItemType type) {

              this.type = type;

       }

 

       /**

       * @return the discount

       */

       public double getDiscount() {

              return discount;

       }

 

       /**

       * @param discount

       *            the discount to set

       */

       public void setDiscount(double discount) {

              this.discount = discount;

       }

 

       /**

       * @return the billAmount

       */

       public double getBillAmount() {

              return billAmount;

       }

 

       /**

       * @param billAmount

       *            the billAmount to set

       */

       public void setBillAmount(double billAmount) {

              this.billAmount = billAmount;

       }

 

       /**

       * @return the finalAmount

       */

       public double getFinalAmount() {

              return finalAmount;

       }

 

       /**

       * @param finalAmount

       *            the finalAmount to set

       */

       public void setFinalAmount(double finalAmount) {

              this.finalAmount = finalAmount;

       }

 

}
