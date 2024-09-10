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


/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
export interface GenerateReportDTO { 
    /**
     * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
     */
    reportId: string;
    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     */
    estimatedGenerationTime: number;
}

