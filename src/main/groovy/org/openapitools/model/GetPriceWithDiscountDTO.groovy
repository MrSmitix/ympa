package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;

@Canonical
class GetPriceWithDiscountDTO {
    /* Значение. */
    BigDecimal value
    
    CurrencyType currencyId
    /* Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
    BigDecimal discountBase
    /* Время последнего обновления. */
    Date updatedAt
}
