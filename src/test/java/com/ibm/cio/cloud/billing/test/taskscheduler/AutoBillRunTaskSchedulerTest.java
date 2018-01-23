package com.ibm.cio.cloud.billing.test.taskscheduler;

import java.util.Calendar;
import java.util.Date;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.ibm.cio.cloud.billing.job.BillChecklistItem;
import com.ibm.cio.cloud.billing.taskscheduler.PreBillingChecklistTaskScheduler;

public class AutoBillRunTaskSchedulerTest
{
  public static void main(String args[])
  {
    PreBillingChecklistTaskScheduler taskSchedulerObj = new PreBillingChecklistTaskScheduler();
    ThreadPoolTaskScheduler scheduler = taskSchedulerObj.threadPoolTaskScheduler();
    scheduler.scheduleWithFixedDelay(
        new BillChecklistItem("Fixed 1 second Delay"), 1000);
  }
}
