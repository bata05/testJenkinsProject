package com.ibm.cio.cloud.billing.job;

import java.util.Date;

public class BillChecklistItem implements Runnable
{
  private String message;
  
  public BillChecklistItem(String message){
      this.message = message;
  }
  
  public void run()
  {
    System.out.println(new Date()+" Runnable Task with "+message
        +" on thread "+Thread.currentThread().getName());
  }
}
