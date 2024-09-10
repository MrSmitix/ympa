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

import ympa_kotlin_server.models.QualityRatingComponentDTO

/**
 * Информация об индексе качества.
 * @param rating Значение индекса качества.
 * @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @param components Составляющие индекса качества.
 */
data class QualityRatingDTO(
    /* Значение индекса качества. */
    val rating: kotlin.Long,
    /* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
    val calculationDate: java.time.LocalDate,
    /* Составляющие индекса качества. */
    val components: kotlin.collections.List<QualityRatingComponentDTO>
) 

