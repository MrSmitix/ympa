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
import type { OrderBuyerType } from './OrderBuyerType';
import {
    OrderBuyerTypeFromJSON,
    OrderBuyerTypeFromJSONTyped,
    OrderBuyerTypeToJSON,
} from './OrderBuyerType';

/**
 * Информация о покупателе.
 * 
 * Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS.
 * 
 * @export
 * @interface OrderBuyerDTO
 */
export interface OrderBuyerDTO {
    /**
     * Идентификатор покупателя.
     * @type {string}
     * @memberof OrderBuyerDTO
     */
    id?: string;
    /**
     * Фамилия покупателя.
     * @type {string}
     * @memberof OrderBuyerDTO
     */
    lastName?: string;
    /**
     * Имя покупателя.
     * @type {string}
     * @memberof OrderBuyerDTO
     */
    firstName?: string;
    /**
     * Отчество покупателя.
     * @type {string}
     * @memberof OrderBuyerDTO
     */
    middleName?: string;
    /**
     * 
     * @type {OrderBuyerType}
     * @memberof OrderBuyerDTO
     */
    type?: OrderBuyerType;
}



/**
 * Check if a given object implements the OrderBuyerDTO interface.
 */
export function instanceOfOrderBuyerDTO(value: object): value is OrderBuyerDTO {
    return true;
}

export function OrderBuyerDTOFromJSON(json: any): OrderBuyerDTO {
    return OrderBuyerDTOFromJSONTyped(json, false);
}

export function OrderBuyerDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderBuyerDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'lastName': json['lastName'] == null ? undefined : json['lastName'],
        'firstName': json['firstName'] == null ? undefined : json['firstName'],
        'middleName': json['middleName'] == null ? undefined : json['middleName'],
        'type': json['type'] == null ? undefined : OrderBuyerTypeFromJSON(json['type']),
    };
}

export function OrderBuyerDTOToJSON(value?: OrderBuyerDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'lastName': value['lastName'],
        'firstName': value['firstName'],
        'middleName': value['middleName'],
        'type': OrderBuyerTypeToJSON(value['type']),
    };
}
