package com.example.demo.TestTreeSet;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/6/10 23:35
 */
public class testTreeSet {



    @Test
    public void testtreeset(){

        OrgTreeVo orgTreeVo1 = new OrgTreeVo("1", "国家电网", "1000030", "国网国网服务有限公司", "1000030000", "国网国网服务有限公司（本部）", "1000030000006", "西单银座营业厅");
        OrgTreeVo orgTreeVo = new OrgTreeVo("1", "国家电网", "1000002", "国网北京市电力公司", "1000002000", "国网城区供电公司", "1000002000002", "西单营业厅");
        ArrayList<OrgTreeVo> orgTreeVos = new ArrayList<>();
        orgTreeVos.add(orgTreeVo);
        orgTreeVos.add(orgTreeVo1);
//        Comparator<OrgVo> comparator=  (o1, o2)->{
//            String value = o1.getValue();
//            String value1 = o2.getValue();
//            return value.equals(value1)?0:-1;
//        };

        TreeSet<OrgVo> orgVos = new TreeSet<>();
        orgTreeVos.forEach(e->{
            String onename = e.getLvOneOuName();
            String oneCode = e.getLvOneOuCode();
            String twoCode = e.getLvTwoOuCode();
            String twoName = e.getLvTwoOuName();
            String thrCode = e.getLvThrOuCode();
            String thrName = e.getLvThrOuName();
            String fourCode = e.getLvFourOuCode();
            String fourName = e.getLvFourOuName();

            if(onename!=null&&oneCode!=null){
                OrgVo orgVo = new OrgVo(oneCode, onename, null);
                TreeSet<OrgVo> lv2=getlvnext(orgVos,orgVo);

                if(twoName!=null&&twoCode!=null){
                    OrgVo orgVo2 = new OrgVo(twoCode, twoName, null);
                    TreeSet<OrgVo> lv3=getlvnext(lv2,orgVo2);

                    if(thrName!=null&&thrCode!=null){
                        OrgVo orgVo3 = new OrgVo(thrCode, thrName, null);
                        TreeSet<OrgVo> lv4=getlvnext(lv3,orgVo3);

                        if(fourName!=null&&fourCode!=null){
                            OrgVo orgVo4 = new OrgVo(fourCode, fourName, null);
                            TreeSet<OrgVo> lv5=getlvnext(lv4,orgVo4);
                            orgVo4.setChildren(null);
                        }

                    }

                }
            }
        });
        String s = JSON.toJSONString(orgVos);
        System.out.println(s);
    }

    private TreeSet<OrgVo> getlvnext(TreeSet<OrgVo> orgVos,OrgVo orgVo){
        TreeSet<OrgVo> nextlv=null;
        if(orgVos.contains(orgVo)) {
            nextlv = orgVos.ceiling(orgVo).getChildren();

        }else {
            nextlv = new TreeSet<>();
            orgVo.setChildren(nextlv);
            orgVos.add(orgVo);
        }
        return nextlv;
    }

    @Test
    public void test(){
        Integer s=null;
        switch (s){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
    }


}
