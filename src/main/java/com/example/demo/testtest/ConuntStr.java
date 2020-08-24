package com.example.demo.testtest;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2020/4/27 15:36
 */
public class ConuntStr {

    public static void main(String[] args) {

String str ="供应商已签订三方协议,实际收款单位:江苏爱特福84股份有限公司,收款银行:金湖县农行营业部,收款帐号:10366201040002802";
ConuntStr countCharacter = new ConuntStr();
    countCharacter.count(str);
}

/**中文字符 */
private int chCharacter = 0;

/**英文字符 */
private int enCharacter = 0;

/**空格 */
private int spaceCharacter = 0;

/**数字 */
private int numberCharacter = 0;

/**其他字符 */
private int otherCharacter = 0;

//记录中文字符
private StringBuilder sb1=new StringBuilder();

//记录英文字符
private StringBuilder sb2=new StringBuilder();

//记录数字
private StringBuilder sb3=new StringBuilder();
//记录特殊字符
private StringBuilder sb4=new StringBuilder();

/***
　　* 统计字符串中中文，英文，数字，空格等字符个数
　　* @param str 需要统计的字符串
　　*/
public void count(String str) {
if(str.equals("") || str==null){
System.out.println("字符串为空");
return;
}
for (int i = 0; i < str.length(); i++) {
char tmp = str.charAt(i);
if ((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z')) {
enCharacter ++;
sb2.append(tmp+" ");
} else if ((tmp >= '0') && (tmp <= '9')) {
numberCharacter ++;
sb3.append(tmp +" ");
} else if (tmp ==' ') {
spaceCharacter ++;
} else if (isChinese(tmp)) {
chCharacter ++;
sb1.append(tmp+" ");
} else {
otherCharacter ++;
sb4.append(tmp +" ");
}
}
System.out.println("字符串:" + str + " \r\n");
System.out.println("中文字符有:" + chCharacter +"个 ("+sb1.toString()+")");
System.out.println("英文字符有:" + enCharacter +"个 ("+sb2.toString()+")");
System.out.println("数字有:" + numberCharacter+"个 ("+sb3.toString()+")");
System.out.println("空格有:" + spaceCharacter+"个");
System.out.println("其他字符有:" + otherCharacter+"个 ("+sb4.toString()+")");
}

/***
　　　　* 判断字符是否为中文
　　　　* @param ch 需要判断的字符
　　　　* @return 中文返回true，非中文返回false
　　　　*/
private boolean isChinese(char ch) {
//获取此字符的UniCodeBlock
Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
//  GENERAL_PUNCTUATION 判断中文的“号
//  CJK_SYMBOLS_AND_PUNCTUATION 判断中文的。号
if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
System.out.println(ch + " 是中文");
//sb1.append(ch+" ");
return true;
}
return false;

}
}
