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

case class ModelPriceDTO(
  /* Средняя цена предложения для модели в регионе. */
  avg: Option[Double],

  /* Максимальная цена предложения для модели в регионе. */
  max: Option[Double],

  /* Минимальная цена предложения для модели в регионе. */
  min: Option[Double]

 )