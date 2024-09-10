/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class OrderCourierDTO (
  /* Полное имя курьера. */
  fullName: Option[String] = None,
  /* Номер телефона курьера. */
  phone: Option[String] = None,
  /* Добавочный номер телефона. */
  phoneExtension: Option[String] = None,
  /* Номер транспортного средства. */
  vehicleNumber: Option[String] = None,
  /* Описание машины. Например, модель и цвет. */
  vehicleDescription: Option[String] = None
) extends ApiModel
