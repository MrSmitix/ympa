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
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */
export interface CampaignSettingsTimePeriodDTO { 
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    fromDate?: string;
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    toDate?: string;
}

