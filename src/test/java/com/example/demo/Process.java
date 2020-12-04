package com.example.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Mr.Y z
 * @Date 2020/12/3 14:59
 * @ClassName Process
 */
@Data
@XStreamAlias("process")
public class Process implements Serializable {

    @XStreamAlias("processStatus")
    private String processStatus;

    @XStreamAlias("operatorName")
    private String operatorName;

    @XStreamAlias("operateTime")
    private String operateTime;

}
