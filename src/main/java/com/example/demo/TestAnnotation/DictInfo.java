package com.example.demo.TestAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;

/**
 * @author maple
 * @project ad_platform1
 * @date 2019-06-29 11:18
 */

@Data
@AllArgsConstructor
public class DictInfo {

    private Dict dict;

    private Field field;

    private Field srcField;
}
