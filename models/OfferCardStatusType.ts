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
 * Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 * @export
 * @enum {string}
 */
export enum OfferCardStatusType {
    HasCardCanNotUpdate = 'HAS_CARD_CAN_NOT_UPDATE',
    HasCardCanUpdate = 'HAS_CARD_CAN_UPDATE',
    HasCardCanUpdateErrors = 'HAS_CARD_CAN_UPDATE_ERRORS',
    HasCardCanUpdateProcessing = 'HAS_CARD_CAN_UPDATE_PROCESSING',
    NoCardNeedContent = 'NO_CARD_NEED_CONTENT',
    NoCardMarketWillCreate = 'NO_CARD_MARKET_WILL_CREATE',
    NoCardErrors = 'NO_CARD_ERRORS',
    NoCardProcessing = 'NO_CARD_PROCESSING',
    NoCardAddToCampaign = 'NO_CARD_ADD_TO_CAMPAIGN'
}

