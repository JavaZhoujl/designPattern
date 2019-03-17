package com.zhoujl.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    // 委派者必须掌握所有干活的明细。
    private Map<String, Object> register = new HashMap<>();

    public Leader() {
        register.put("数据库", new EmployeeA());
        register.put("多线程", new EmployeeB());
    }

    public void doing(String command) {
        ((IEmployee)register.get(command)).doing();
    }
}
