package cn.me.test.threadTest.fu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

class Sing implements Callable<String> {

    private Map resultMap;

    Sing(Map<String,Object> result){
        this.resultMap =result;
    }

    @Override
    public String call() {
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
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return "111";
    }
}
