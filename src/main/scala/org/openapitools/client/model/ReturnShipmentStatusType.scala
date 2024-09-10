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
   * Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
   */

object ReturnShipmentStatusType extends Enumeration {
    type ReturnShipmentStatusType = ReturnShipmentStatusType.Value
    val CREATED = Value("CREATED")
    val RECEIVED = Value("RECEIVED")
    val INTRANSIT = Value("IN_TRANSIT")
    val READYFORPICKUP = Value("READY_FOR_PICKUP")
    val PICKED = Value("PICKED")
    val LOST = Value("LOST")
    val EXPIRED = Value("EXPIRED")
    val CANCELLED = Value("CANCELLED")
    val FULFILMENTRECEIVED = Value("FULFILMENT_RECEIVED")
    val PREPAREDFORUTILIZATION = Value("PREPARED_FOR_UTILIZATION")
    val NOTINDEMAND = Value("NOT_IN_DEMAND")
    val UTILIZED = Value("UTILIZED")
    val READYFOREXPROPRIATION = Value("READY_FOR_EXPROPRIATION")
    val RECEIVEDFOREXPROPRIATION = Value("RECEIVED_FOR_EXPROPRIATION")
}