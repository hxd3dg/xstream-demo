package com.example.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Mr.Y z
 * @Date 2020/12/3 14:35
 * @ClassName response
 */
@Data
@XStreamAlias("response")
public class Response implements Serializable {

    @XStreamAlias("flag")
    private String flag;

    @XStreamAlias("code")
    private String code;

    @XStreamAlias("message")
    private String message;

    //@XStreamImplicit(itemFieldName="orderProcess")
    @XStreamAlias("orderProcess")
    private OrderProcess orderProcess;
}
