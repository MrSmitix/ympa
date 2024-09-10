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
/**
 * Фильтры для запроса остатков. 
 * @export
 * @interface GetWarehouseStocksRequest
 */
export interface GetWarehouseStocksRequest  {
    /**
     * **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
     * @type {boolean}
     * @memberof GetWarehouseStocksRequest
     */
    withTurnover?: boolean;
    /**
     * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
     * @type {boolean}
     * @memberof GetWarehouseStocksRequest
     */
    archived?: boolean;
    /**
     * Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
     * @type {Set<string>}
     * @memberof GetWarehouseStocksRequest
     */
    offerIds?: Set<string>;
}

export function GetWarehouseStocksRequestFromJSON(json: any): GetWarehouseStocksRequest {
    return {
        'withTurnover': !exists(json, 'withTurnover') ? undefined : json['withTurnover'],
        'archived': !exists(json, 'archived') ? undefined : json['archived'],
        'offerIds': !exists(json, 'offerIds') ? undefined : json['offerIds'],
    };
}

export function GetWarehouseStocksRequestToJSON(value?: GetWarehouseStocksRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'withTurnover': value.withTurnover,
        'archived': value.archived,
        'offerIds': value.offerIds,
    };
}


