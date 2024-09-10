/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Данные, необходимые для генерации документа. 
 */
export interface GenerateShipmentListDocumentReportRequest { 
    /**
     * Идентификатор кампании.
     */
    campaignId: number;
    /**
     * Идентификатор отгрузки.
     */
    shipmentId?: number;
    /**
     * Фильтр по идентификаторам заказа в отгрузке.
     */
    orderIds?: Array<number> | null;
}

