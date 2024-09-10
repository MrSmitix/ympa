package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderBuyerType;

@Canonical
class OrderBuyerInfoDTO {
    /* Идентификатор покупателя. */
    String id
    /* Фамилия покупателя. */
    String lastName
    /* Имя покупателя. */
    String firstName
    /* Отчество покупателя. */
    String middleName
    
    OrderBuyerType type
    /* Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  */
    String phone
}
