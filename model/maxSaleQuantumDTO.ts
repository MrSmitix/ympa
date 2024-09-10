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
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */
export interface MaxSaleQuantumDTO { 
    /**
     * Идентификатор категории.
     */
    id: number;
    /**
     * Название категории.
     */
    name?: string;
    /**
     * Лимит на установку кванта и минимального количества товаров.
     */
    maxSaleQuantum?: number;
}

