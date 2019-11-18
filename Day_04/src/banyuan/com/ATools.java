package banyuan.com;

public class ATools {

    //修改对象数组里面的指定对象的属性值   name="沾上干2" --->  name="李四"
    public  static void  updatePerson(String  name,String  name2){ //name2  要修改的内容
        for (int i = 0; i < Tools.per.length; i++) {
            if (Tools.per[i]!=null) {
                if (name.equals(Tools.per[i].getName())) {
                    Tools.per[i].setName(name2);
                    System.out.println("-----++++++");
                }
            }
        }

    }


}
