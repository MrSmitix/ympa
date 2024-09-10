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
package ympa_kotlin_server.models


/**
* Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
* Values: DBS_CANCELLATION_RATE,DBS_LATE_DELIVERY_RATE,FBS_CANCELLATION_RATE,FBS_LATE_SHIP_RATE
*/
enum class AffectedOrderQualityRatingComponentType(val value: kotlin.String) {

    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),

    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),

    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),

    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE");

}

