package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GpsDTO;

@Canonical
class OrderDeliveryAddressDTO {
    /* Страна.  Обязательный параметр.  */
    String country
    /* Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  */
    String postcode
    /* Город или населенный пункт.  Обязательный параметр.  */
    String city
    /* Район. */
    String district
    /* Станция метро. */
    String subway
    /* Улица.  Обязательный параметр.  */
    String street
    /* Дом или владение.  Обязательный параметр.  */
    String house
    /* Корпус или строение. */
    String block
    /* Подъезд. */
    String entrance
    /* Код домофона. */
    String entryphone
    /* Этаж. */
    String floor
    /* Квартира или офис. */
    String apartment
    /* Телефон получателя заказа.  Обязательный параметр.  */
    String phone
    /* Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  */
    String recipient
    
    GpsDTO gps
}
