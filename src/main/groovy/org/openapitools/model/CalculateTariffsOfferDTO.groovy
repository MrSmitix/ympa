package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CalculateTariffsOfferDTO {
    /* Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  */
    Long categoryId
    /* Цена на товар в рублях. */
    BigDecimal price
    /* Длина товара в сантиметрах. */
    BigDecimal length
    /* Ширина товара в сантиметрах. */
    BigDecimal width
    /* Высота товара в сантиметрах. */
    BigDecimal height
    /* Вес товара в килограммах. */
    BigDecimal weight
    /* Квант продажи — количество единиц товара в одном товарном предложении. */
    Integer quantity = 1
}
