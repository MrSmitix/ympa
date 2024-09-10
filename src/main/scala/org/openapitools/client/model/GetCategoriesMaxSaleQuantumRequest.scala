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

import scala.collection.immutable.Set

  /**
   * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
   */
case class GetCategoriesMaxSaleQuantumRequest(
  /* Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. */
  marketCategoryIds: Set[Long]
)

