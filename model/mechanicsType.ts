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
 * Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
 */
export type MechanicsType = 'DIRECT_DISCOUNT' | 'BLUE_FLASH' | 'MARKET_PROMOCODE';

export const MechanicsType = {
    DirectDiscount: 'DIRECT_DISCOUNT' as MechanicsType,
    BlueFlash: 'BLUE_FLASH' as MechanicsType,
    MarketPromocode: 'MARKET_PROMOCODE' as MechanicsType
};

