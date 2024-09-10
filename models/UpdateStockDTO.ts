/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { UpdateStockItemDTO } from './UpdateStockItemDTO';
import {
    UpdateStockItemDTOFromJSON,
    UpdateStockItemDTOFromJSONTyped,
    UpdateStockItemDTOToJSON,
} from './UpdateStockItemDTO';

/**
 * Информация об остатках одного товара на одном из складов.
 * @export
 * @interface UpdateStockDTO
 */
export interface UpdateStockDTO {
    /**
     * Ваш SKU — идентификатор товара в вашей системе.
     * 
     * Разрешена любая последовательность длиной до 255 знаков.
     * 
     * Правила использования SKU:
     * 
     * * У каждого товара SKU должен быть свой.
     * 
     * * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.
     * 
     * * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.
     * 
     * [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * 
     * @type {string}
     * @memberof UpdateStockDTO
     */
    sku: string;
    /**
     * Информация об остатках товара.
     * 
     * @type {Array<UpdateStockItemDTO>}
     * @memberof UpdateStockDTO
     */
    items: Array<UpdateStockItemDTO>;
}

/**
 * Check if a given object implements the UpdateStockDTO interface.
 */
export function instanceOfUpdateStockDTO(value: object): value is UpdateStockDTO {
    if (!('sku' in value) || value['sku'] === undefined) return false;
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function UpdateStockDTOFromJSON(json: any): UpdateStockDTO {
    return UpdateStockDTOFromJSONTyped(json, false);
}

export function UpdateStockDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateStockDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'sku': json['sku'],
        'items': ((json['items'] as Array<any>).map(UpdateStockItemDTOFromJSON)),
    };
}

export function UpdateStockDTOToJSON(value?: UpdateStockDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'sku': value['sku'],
        'items': ((value['items'] as Array<any>).map(UpdateStockItemDTOToJSON)),
    };
}

