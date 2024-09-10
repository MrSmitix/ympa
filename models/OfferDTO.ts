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

import type {
    CurrencyType,
} from './';

/**
 * Предложение.
 * @export
 * @interface OfferDTO
 */
export interface OfferDTO {
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


