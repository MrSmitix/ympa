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
import type { QualityRatingAffectedOrderDTO } from './QualityRatingAffectedOrderDTO';
import {
    QualityRatingAffectedOrderDTOFromJSON,
    QualityRatingAffectedOrderDTOFromJSONTyped,
    QualityRatingAffectedOrderDTOToJSON,
} from './QualityRatingAffectedOrderDTO';

/**
 * Информация о заказах, которые повлияли на индекс качества.
 * @export
 * @interface QualityRatingDetailsDTO
 */
export interface QualityRatingDetailsDTO {
    /**
     * Список заказов, которые повлияли на индекс качества.
     * @type {Array<QualityRatingAffectedOrderDTO>}
     * @memberof QualityRatingDetailsDTO
     */
    affectedOrders: Array<QualityRatingAffectedOrderDTO>;
}

/**
 * Check if a given object implements the QualityRatingDetailsDTO interface.
 */
export function instanceOfQualityRatingDetailsDTO(value: object): value is QualityRatingDetailsDTO {
    if (!('affectedOrders' in value) || value['affectedOrders'] === undefined) return false;
    return true;
}

export function QualityRatingDetailsDTOFromJSON(json: any): QualityRatingDetailsDTO {
    return QualityRatingDetailsDTOFromJSONTyped(json, false);
}

export function QualityRatingDetailsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): QualityRatingDetailsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'affectedOrders': ((json['affectedOrders'] as Array<any>).map(QualityRatingAffectedOrderDTOFromJSON)),
    };
}

export function QualityRatingDetailsDTOToJSON(value?: QualityRatingDetailsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'affectedOrders': ((value['affectedOrders'] as Array<any>).map(QualityRatingAffectedOrderDTOToJSON)),
    };
}
