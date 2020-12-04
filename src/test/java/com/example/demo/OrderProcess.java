package com.example.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Mr.Y z
 * @Date 2020/12/3 14:37
 * @ClassName OrderProcess
 */
@Data
@XStreamAlias("orderProcess")
public class OrderProcess implements Serializable {

    @XStreamAlias("orderCode")
    private String orderCode;

    @XStreamAlias("orderType")
    private String orderType;

    @XStreamAlias("warehouseCode")
    private String warehouseCode;

    @XStreamAlias("processes")
    private Processes processes;
}
