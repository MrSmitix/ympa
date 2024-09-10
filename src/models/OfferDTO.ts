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

import { exists, mapValues } from '../runtime';
import {
    CurrencyType,
    CurrencyTypeFromJSON,
    CurrencyTypeToJSON,
} from './';

/**
 * Предложение.
 * @export
 * @interface OfferDTO
 */
export interface OfferDTO  {
    /**
     * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
     * @type {number}
     * @memberof OfferDTO
     */
    price?: number;
    /**
     * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @type {number}
     * @memberof OfferDTO
     */
    feedId?: number;
    /**
     * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @type {string}
     * @memberof OfferDTO
     */
    id?: string;
    /**
     * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @type {string}
     * @memberof OfferDTO
     */
    shopCategoryId?: string;
    /**
     * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
     * @type {number}
     * @memberof OfferDTO
     */
    marketCategoryId?: number;
    /**
     * Цена предложения без скидки.
     * @type {number}
     * @memberof OfferDTO
     */
    preDiscountPrice?: number;
    /**
     * Скидка на предложение в процентах.
     * @type {number}
     * @memberof OfferDTO
     */
    discount?: number;
    /**
     * Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
     * @type {boolean}
     * @memberof OfferDTO
     */
    cutPrice?: boolean;
    /**
     * URL-адрес предложения на сайте магазина.
     * @type {string}
     * @memberof OfferDTO
     */
    url?: string;
    /**
     * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
     * @type {number}
     * @memberof OfferDTO
     */
    modelId: number;
    /**
     * Наименование предложения.
     * @type {string}
     * @memberof OfferDTO
     */
    name?: string;
    /**
     * 
     * @type {CurrencyType}
     * @memberof OfferDTO
     */
    currency?: CurrencyType;
    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
     * @type {number}
     * @memberof OfferDTO
     */
    bid?: number;
    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
     * @type {number}
     * @memberof OfferDTO
     */
    cbid?: number;
    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
     * @type {number}
     * @memberof OfferDTO
     */
    fee?: number;
    /**
     * Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
     * @type {boolean}
     * @memberof OfferDTO
     */
    blocked?: boolean;
}

export function OfferDTOFromJSON(json: any): OfferDTO {
    return {
        'price': !exists(json, 'price') ? undefined : json['price'],
        'feedId': !exists(json, 'feedId') ? undefined : json['feedId'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'shopCategoryId': !exists(json, 'shopCategoryId') ? undefined : json['shopCategoryId'],
        'marketCategoryId': !exists(json, 'marketCategoryId') ? undefined : json['marketCategoryId'],
        'preDiscountPrice': !exists(json, 'preDiscountPrice') ? undefined : json['preDiscountPrice'],
        'discount': !exists(json, 'discount') ? undefined : json['discount'],
        'cutPrice': !exists(json, 'cutPrice') ? undefined : json['cutPrice'],
        'url': !exists(json, 'url') ? undefined : json['url'],
        'modelId': json['modelId'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'currency': !exists(json, 'currency') ? undefined : CurrencyTypeFromJSON(json['currency']),
        'bid': !exists(json, 'bid') ? undefined : json['bid'],
        'cbid': !exists(json, 'cbid') ? undefined : json['cbid'],
        'fee': !exists(json, 'fee') ? undefined : json['fee'],
        'blocked': !exists(json, 'blocked') ? undefined : json['blocked'],
    };
}

export function OfferDTOToJSON(value?: OfferDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'price': value.price,
        'feedId': value.feedId,
        'id': value.id,
        'shopCategoryId': value.shopCategoryId,
        'marketCategoryId': value.marketCategoryId,
        'preDiscountPrice': value.preDiscountPrice,
        'discount': value.discount,
        'cutPrice': value.cutPrice,
        'url': value.url,
        'modelId': value.modelId,
        'name': value.name,
        'currency': CurrencyTypeToJSON(value.currency),
        'bid': value.bid,
        'cbid': value.cbid,
        'fee': value.fee,
        'blocked': value.blocked,
    };
}



