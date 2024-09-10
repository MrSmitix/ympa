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

import java.math.BigDecimal
import org.openapitools.client.core.ApiModel

case class OfferWeightDimensionsDTO (
  /* Длина упаковки в см.  */
  length: BigDecimal,
  /* Ширина упаковки в см.  */
  width: BigDecimal,
  /* Высота упаковки в см.  */
  height: BigDecimal,
  /* Вес товара в кг с учетом упаковки (брутто).  */
  weight: BigDecimal
) extends ApiModel
