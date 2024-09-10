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
 * Диапазон дат доставки.
 */
export interface OrderDeliveryDatesDTO { 
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    fromDate?: string;
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    toDate?: string;
    /**
     * Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
     */
    fromTime?: string;
    /**
     * Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
     */
    toTime?: string;
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    realDeliveryDate?: string;
}

