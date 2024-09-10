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
 * Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. 
 */
export type ReturnDecisionSubreasonType = 'USER_DID_NOT_LIKE' | 'USER_CHANGED_MIND' | 'DELIVERED_TOO_LONG' | 'BAD_PACKAGE' | 'DAMAGED' | 'NOT_WORKING' | 'INCOMPLETENESS' | 'WRONG_ITEM' | 'WRONG_COLOR' | 'DID_NOT_MATCH_DESCRIPTION' | 'UNKNOWN';

export const ReturnDecisionSubreasonType = {
    UserDidNotLike: 'USER_DID_NOT_LIKE' as ReturnDecisionSubreasonType,
    UserChangedMind: 'USER_CHANGED_MIND' as ReturnDecisionSubreasonType,
    DeliveredTooLong: 'DELIVERED_TOO_LONG' as ReturnDecisionSubreasonType,
    BadPackage: 'BAD_PACKAGE' as ReturnDecisionSubreasonType,
    Damaged: 'DAMAGED' as ReturnDecisionSubreasonType,
    NotWorking: 'NOT_WORKING' as ReturnDecisionSubreasonType,
    Incompleteness: 'INCOMPLETENESS' as ReturnDecisionSubreasonType,
    WrongItem: 'WRONG_ITEM' as ReturnDecisionSubreasonType,
    WrongColor: 'WRONG_COLOR' as ReturnDecisionSubreasonType,
    DidNotMatchDescription: 'DID_NOT_MATCH_DESCRIPTION' as ReturnDecisionSubreasonType,
    Unknown: 'UNKNOWN' as ReturnDecisionSubreasonType
}
