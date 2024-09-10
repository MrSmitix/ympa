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


  /**
   * Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
   */

object OrdersStatsStockType extends Enumeration {
    type OrdersStatsStockType = OrdersStatsStockType.Value
    val FIT = Value("FIT")
    val FREEZE = Value("FREEZE")
    val AVAILABLE = Value("AVAILABLE")
    val QUARANTINE = Value("QUARANTINE")
    val UTILIZATION = Value("UTILIZATION")
    val DEFECT = Value("DEFECT")
    val EXPIRED = Value("EXPIRED")
}