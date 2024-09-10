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
 * Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */
export type OfferCampaignStatusType = 'PUBLISHED' | 'CHECKING' | 'DISABLED_BY_PARTNER' | 'DISABLED_AUTOMATICALLY' | 'REJECTED_BY_MARKET' | 'CREATING_CARD' | 'NO_CARD' | 'NO_STOCKS' | 'ARCHIVED';

export const OfferCampaignStatusType = {
    Published: 'PUBLISHED' as OfferCampaignStatusType,
    Checking: 'CHECKING' as OfferCampaignStatusType,
    DisabledByPartner: 'DISABLED_BY_PARTNER' as OfferCampaignStatusType,
    DisabledAutomatically: 'DISABLED_AUTOMATICALLY' as OfferCampaignStatusType,
    RejectedByMarket: 'REJECTED_BY_MARKET' as OfferCampaignStatusType,
    CreatingCard: 'CREATING_CARD' as OfferCampaignStatusType,
    NoCard: 'NO_CARD' as OfferCampaignStatusType,
    NoStocks: 'NO_STOCKS' as OfferCampaignStatusType,
    Archived: 'ARCHIVED' as OfferCampaignStatusType
}
