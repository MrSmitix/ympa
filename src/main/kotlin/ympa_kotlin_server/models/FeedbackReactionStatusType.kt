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
* Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
* Values: ALL,NEED_REACTION
*/
enum class FeedbackReactionStatusType(val value: kotlin.String) {

    ALL("ALL"),

    NEED_REACTION("NEED_REACTION");

}

