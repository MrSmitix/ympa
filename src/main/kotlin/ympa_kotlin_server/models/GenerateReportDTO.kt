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
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
 */
data class GenerateReportDTO(
    /* Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. */
    val reportId: kotlin.String,
    /* Ожидаемая продолжительность генерации в миллисекундах. */
    val estimatedGenerationTime: kotlin.Long
) 

