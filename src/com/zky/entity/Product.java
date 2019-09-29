package com.zky.entity;

/**
 * 产品信息类
 *
 * @author: Xin
 * @Date: 2019/9/25 0025 下午 5:59
 */
public class Product {
    /**
     * 产品编号
     */
    private int proid;
    /**
     * 产品名称
     */
    private String proname;
    /**
     * 产品价格
     */
    private String proprice;
    /**
     * 产品产地
     */
    private String proaddress;
    /**
     * 产品样图
     */
    private String proimage;

    /**
     * 构造器
     */
    public Product() {
    }

    public Product(int proid, String proname, String proprice, String proaddress, String proimage) {
        this.proid = proid;
        this.proname = proname;
        this.proprice = proprice;
        this.proaddress = proaddress;
        this.proimage = proimage;
    }

    /**
     * Setter、Getter
     */
    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProprice() {
        return proprice;
    }

    public void setProprice(String proprice) {
        this.proprice = proprice;
    }

    public String getProaddress() {
        return proaddress;
    }

    public void setProaddress(String proaddress) {
        this.proaddress = proaddress;
    }

    public String getProimage() {
        return proimage;
    }

    public void setProimage(String proimage) {
        this.proimage = proimage;
    }

    /**
     * 重写toString
     */
    @Override
    public String toString() {
        return "Product{" +
                "proid=" + proid +
                ", proname='" + proname + '\'' +
                ", proprice='" + proprice + '\'' +
                ", proaddress='" + proaddress + '\'' +
                ", proimage='" + proimage + '\'' +
                '}';
    }
}
