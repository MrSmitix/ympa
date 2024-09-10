package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;

@Canonical
class GetPriceDTO {
    /* Значение. */
    BigDecimal value
    
    CurrencyType currencyId
    /* Время последнего обновления. */
    Date updatedAt
}
