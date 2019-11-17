package com.example.demo.TestTreeSet;

import lombok.Data;

import java.util.List;
import java.util.TreeSet;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/6/3 11:32
 */
@Data
public class OrgVo implements Comparable<OrgVo>{

    private String value;
    private String label;
    private TreeSet<OrgVo> children;

    public OrgVo(String value, String label, TreeSet<OrgVo> children) {
        this.value = value;
        this.label = label;
        this.children = children;
    }

    public OrgVo() {
    }

    @Override
    public int compareTo(OrgVo o) {
        String value = this.value;
        String value1 = o.getValue();
        return value.equals(value1)?0:-1;
    }
}
