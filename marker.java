//marker interface ques1.

interface loggable {}

class fun1 implements loggable {
    String name;
    fun1(String name) {
        this.name = name;
    }
}

class fun2 implements loggable {
   int id;
    fun2(int id) {
        this.id = id;
    }
}

class fun3 {
    double salary;
    fun3(double salary) {
        this.salary =salary;
    }
}

class LogUtility {
        void printLog(Object obj) {
        if (obj instanceof loggable) {
            System.out.println("Log for " + obj.getClass()+ ((obj instanceof fun1) ? " Name: " + ((fun1)obj).name : (obj instanceof fun2) ? " ID: " + ((fun2)obj).id : ""));
        }
        else {
            System.out.println("Object is not loggable.");
        }
    }
}

class marker {
    public static void main(String[] args) {
        fun1 f1 = new fun1("Ashish");
        fun2 f2 = new fun2(2415);
        fun3 f3 = new fun3(10000);
        LogUtility logUtil = new LogUtility();
        logUtil.printLog(f1); 
        logUtil.printLog(f2);
        logUtil.printLog(f3);
    }
}