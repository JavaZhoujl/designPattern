package com.zhoujl.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("多线程", new Leader());
    }
}
