package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrderCourierDTO {
    /* Полное имя курьера. */
    String fullName
    /* Номер телефона курьера. */
    String phone
    /* Добавочный номер телефона. */
    String phoneExtension
    /* Номер транспортного средства. */
    String vehicleNumber
    /* Описание машины. Например, модель и цвет. */
    String vehicleDescription
}
