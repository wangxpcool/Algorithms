package cn.me.test.threadTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class sing extends Thread{

    private Map resultMap;

    private CountDownLatch countDownLatch;

    sing(Map<String,Object> result, CountDownLatch countDownLatch){
        this.resultMap =result;
        this.countDownLatch =countDownLatch;
    }

    @Override
    public void run() {
        List<Map<String,Object>> data = new ArrayList<>();
        for (int i=0;i<26;i++){
            Map<String,Object> m = new HashMap<>();
            m.put("key","ss");
            data.add(m);
        }
        synchronized (resultMap){
            List<Map<String,Object>> dataOld = (List<Map<String,Object>>)resultMap.get("data");
            dataOld.addAll(data);
            resultMap.put("data",dataOld);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("剩余线程数---" + countDownLatch.getCount());


    }
}
