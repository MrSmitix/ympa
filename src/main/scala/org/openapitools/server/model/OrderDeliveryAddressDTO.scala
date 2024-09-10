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

case class OrderDeliveryAddressDTO(
  /* Страна.  Обязательный параметр.  */
  country: Option[String],

  /* Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  */
  postcode: Option[String],

  /* Город или населенный пункт.  Обязательный параметр.  */
  city: Option[String],

  /* Район. */
  district: Option[String],

  /* Станция метро. */
  subway: Option[String],

  /* Улица.  Обязательный параметр.  */
  street: Option[String],

  /* Дом или владение.  Обязательный параметр.  */
  house: Option[String],

  /* Корпус или строение. */
  block: Option[String],

  /* Подъезд. */
  entrance: Option[String],

  /* Код домофона. */
  entryphone: Option[String],

  /* Этаж. */
  floor: Option[String],

  /* Квартира или офис. */
  apartment: Option[String],

  /* Телефон получателя заказа.  Обязательный параметр.  */
  phone: Option[String],

  /* Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  */
  recipient: Option[String],

  gps: Option[GpsDTO]

 )