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
* Тип ошибки индексации прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре `httpStatusCode`.  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
* Values: DOWNLOAD_ERROR,DOWNLOAD_HTTP_ERROR,PARSE_ERROR,PARSE_XML_ERROR,TOO_MANY_REJECTED_OFFERS,NOT_INDEXED
*/
enum class FeedIndexLogsErrorType(val value: kotlin.String) {

    DOWNLOAD_ERROR("DOWNLOAD_ERROR"),

    DOWNLOAD_HTTP_ERROR("DOWNLOAD_HTTP_ERROR"),

    PARSE_ERROR("PARSE_ERROR"),

    PARSE_XML_ERROR("PARSE_XML_ERROR"),

    TOO_MANY_REJECTED_OFFERS("TOO_MANY_REJECTED_OFFERS"),

    NOT_INDEXED("NOT_INDEXED");

}

