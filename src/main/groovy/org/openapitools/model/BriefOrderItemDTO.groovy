package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderVatType;

@Canonical
class BriefOrderItemDTO {
    /* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  */
    Long id
    
    OrderVatType vat
    /* Количество единиц товара. */
    Integer count
    /* Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  */
    BigDecimal price
    /* Название товара. */
    String offerName
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    String offerId
    /* Переданные вами коды маркировки. */
    List<OrderItemInstanceDTO> instances
}
