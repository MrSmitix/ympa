// tslint:disable
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
 * @export
 * @enum {string}
 */
export enum OfferCampaignStatusType {
    Published = 'PUBLISHED',
    Checking = 'CHECKING',
    DisabledByPartner = 'DISABLED_BY_PARTNER',
    DisabledAutomatically = 'DISABLED_AUTOMATICALLY',
    RejectedByMarket = 'REJECTED_BY_MARKET',
    CreatingCard = 'CREATING_CARD',
    NoCard = 'NO_CARD',
    NoStocks = 'NO_STOCKS',
    Archived = 'ARCHIVED'
}

export function OfferCampaignStatusTypeFromJSON(json: any): OfferCampaignStatusType {
    return json as OfferCampaignStatusType;
}

export function OfferCampaignStatusTypeToJSON(value?: OfferCampaignStatusType): any {
    return value as any;
}

