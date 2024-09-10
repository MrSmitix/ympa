/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class OrderCourierDTO(
  /* Полное имя курьера. */
  fullName: Option[String],

  /* Номер телефона курьера. */
  phone: Option[String],

  /* Добавочный номер телефона. */
  phoneExtension: Option[String],

  /* Номер транспортного средства. */
  vehicleNumber: Option[String],

  /* Описание машины. Например, модель и цвет. */
  vehicleDescription: Option[String]

 )