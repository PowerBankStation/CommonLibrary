package com.powerstation.commonlibrary;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderMessage implements Serializable {

    private long orderId;

    private long subscriptionId;

    private String billingState;

    private String provisionState;

}
