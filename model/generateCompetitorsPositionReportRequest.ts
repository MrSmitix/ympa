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
 * Данные, необходимые для генерации отчета.
 */
export interface GenerateCompetitorsPositionReportRequest { 
    /**
     * Идентификатор бизнеса.
     */
    businessId: number;
    /**
     * Идентификатор категории.
     */
    categoryId: number;
    /**
     * Начало периода, включительно.
     */
    dateFrom: string;
    /**
     * Конец периода, включительно.
     */
    dateTo: string;
}
