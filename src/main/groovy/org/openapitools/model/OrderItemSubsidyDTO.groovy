package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrderItemSubsidyType;

@Canonical
class OrderItemSubsidyDTO {
    
    OrderItemSubsidyType type
    /* Сумма субсидии. */
    BigDecimal amount
}
