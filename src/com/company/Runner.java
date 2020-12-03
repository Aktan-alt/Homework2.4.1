package com.company;

public class Runner extends Thread {
    private Runner runner;
    public Runner(String name, Runner runner){
        super(name);
        this.runner = runner;
    }
    public Runner(String name){
        super(name);
    }

    @Override
    public void run() {
        if (runner != null) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            runner.start();
        }if (this.getName().equals("Runner5")) {

            System.out.println(this.getName() + "берет палочку");
            System.out.println(this.getName() + "Бежит к финишу!!!");
            System.out.println(this.getName() + "бежит к " + runner.getName());

        }else {
            System.out.println(this.getName() + "берет палочку");
            System.out.println(this.getName() + "бежит к " + runner.getName());
        }
        if (this.getName().equals("Runner1")) {
            System.out.println(this.getName() + "берет палочку");
            System.out.println(runner.getName() + "Бежит к финишу!!!");
        }


    }


}
