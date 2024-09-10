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
import type { ParameterValueDTO } from './ParameterValueDTO';
import {
    ParameterValueDTOFromJSON,
    ParameterValueDTOFromJSONTyped,
    ParameterValueDTOToJSON,
} from './ParameterValueDTO';

/**
 * Товар с указанными характеристиками.
 * @export
 * @interface OfferContentDTO
 */
export interface OfferContentDTO {
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
     * @memberof OfferContentDTO
     */
    offerId: string;
    /**
     * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * @type {number}
     * @memberof OfferContentDTO
     */
    categoryId: number;
    /**
     * Список характеристик с их значениями.
     * 
     * С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.
     * 
     * При **изменении** характеристик передавайте только те, значение которых нужно обновить.
     * 
     * Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.
     * 
     * Максимальное количество характеристик — 300.
     * 
     * @type {Array<ParameterValueDTO>}
     * @memberof OfferContentDTO
     */
    parameterValues: Array<ParameterValueDTO>;
}

/**
 * Check if a given object implements the OfferContentDTO interface.
 */
export function instanceOfOfferContentDTO(value: object): value is OfferContentDTO {
    if (!('offerId' in value) || value['offerId'] === undefined) return false;
    if (!('categoryId' in value) || value['categoryId'] === undefined) return false;
    if (!('parameterValues' in value) || value['parameterValues'] === undefined) return false;
    return true;
}

export function OfferContentDTOFromJSON(json: any): OfferContentDTO {
    return OfferContentDTOFromJSONTyped(json, false);
}

export function OfferContentDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferContentDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'offerId': json['offerId'],
        'categoryId': json['categoryId'],
        'parameterValues': ((json['parameterValues'] as Array<any>).map(ParameterValueDTOFromJSON)),
    };
}

export function OfferContentDTOToJSON(value?: OfferContentDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerId': value['offerId'],
        'categoryId': value['categoryId'],
        'parameterValues': ((value['parameterValues'] as Array<any>).map(ParameterValueDTOToJSON)),
    };
}

