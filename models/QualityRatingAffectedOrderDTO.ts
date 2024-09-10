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
import type { AffectedOrderQualityRatingComponentType } from './AffectedOrderQualityRatingComponentType';
import {
    AffectedOrderQualityRatingComponentTypeFromJSON,
    AffectedOrderQualityRatingComponentTypeFromJSONTyped,
    AffectedOrderQualityRatingComponentTypeToJSON,
} from './AffectedOrderQualityRatingComponentType';

/**
 * Информация о заказе, который повлиял на индекс качества.
 * @export
 * @interface QualityRatingAffectedOrderDTO
 */
export interface QualityRatingAffectedOrderDTO {
    /**
     * Идентификатор заказа.
     * @type {number}
     * @memberof QualityRatingAffectedOrderDTO
     */
    orderId: number;
    /**
     * Описание проблемы.
     * @type {string}
     * @memberof QualityRatingAffectedOrderDTO
     */
    description: string;
    /**
     * 
     * @type {AffectedOrderQualityRatingComponentType}
     * @memberof QualityRatingAffectedOrderDTO
     */
    componentType: AffectedOrderQualityRatingComponentType;
}



/**
 * Check if a given object implements the QualityRatingAffectedOrderDTO interface.
 */
export function instanceOfQualityRatingAffectedOrderDTO(value: object): value is QualityRatingAffectedOrderDTO {
    if (!('orderId' in value) || value['orderId'] === undefined) return false;
    if (!('description' in value) || value['description'] === undefined) return false;
    if (!('componentType' in value) || value['componentType'] === undefined) return false;
    return true;
}

export function QualityRatingAffectedOrderDTOFromJSON(json: any): QualityRatingAffectedOrderDTO {
    return QualityRatingAffectedOrderDTOFromJSONTyped(json, false);
}

export function QualityRatingAffectedOrderDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): QualityRatingAffectedOrderDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'orderId': json['orderId'],
        'description': json['description'],
        'componentType': AffectedOrderQualityRatingComponentTypeFromJSON(json['componentType']),
    };
}

export function QualityRatingAffectedOrderDTOToJSON(value?: QualityRatingAffectedOrderDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'orderId': value['orderId'],
        'description': value['description'],
        'componentType': AffectedOrderQualityRatingComponentTypeToJSON(value['componentType']),
    };
}

