package com.rocway.springcloud_feignclient_demo.feign.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DemoDTO implements Serializable {

    private static final long serialVersionUID = -7921359367139943621L;

    private String cookie;

    private String header;

    private Integer value;

    private Integer[] array;

    private List<Integer> list;

    private Map<String, Object> map;

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "DemoDTO{" +
                "cookie='" + cookie + '\'' +
                ", header='" + header + '\'' +
                ", value=" + value +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
