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
export interface GenerateUnitedOrdersRequest { 
    /**
     * Идентификатор бизнеса.
     */
    businessId: number;
    /**
     * Начало периода, включительно.
     */
    dateFrom: string;
    /**
     * Конец периода, включительно. Максимальный период — 1 год.
     */
    dateTo: string;
    /**
     * Список магазинов, которые нужны в отчете.
     */
    campaignIds?: Array<number> | null;
    /**
     * Идентификатор акции, товары из которой нужны в отчете.
     */
    promoId?: string;
}

