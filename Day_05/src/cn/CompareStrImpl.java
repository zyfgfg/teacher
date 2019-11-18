package cn;

public class CompareStrImpl implements ComperaStr {
    @Override
    public boolean equalsStr(String name,String  name2) {

        boolean  flag=true;
        char [] ch=name.toCharArray(); //转换成字符数组
        char [] ch2=name2.toCharArray();
        if(name.length()!=name2.length()){
            flag=false;
            return  flag;
        }

        for (int i = 0; i < name.length(); i++) {
            if (ch[i] == ch2[i]) {
                flag=true;
                continue;
            } else {
                flag=false;
                return flag;
            }}

        return flag;
    }
}
