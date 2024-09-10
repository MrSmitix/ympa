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
    AffectedOrderQualityRatingComponentType,
    AffectedOrderQualityRatingComponentTypeFromJSON,
    AffectedOrderQualityRatingComponentTypeToJSON,
} from './';

/**
 * Информация о заказе, который повлиял на индекс качества.
 * @export
 * @interface QualityRatingAffectedOrderDTO
 */
export interface QualityRatingAffectedOrderDTO  {
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

export function QualityRatingAffectedOrderDTOFromJSON(json: any): QualityRatingAffectedOrderDTO {
    return {
        'orderId': json['orderId'],
        'description': json['description'],
        'componentType': AffectedOrderQualityRatingComponentTypeFromJSON(json['componentType']),
    };
}

export function QualityRatingAffectedOrderDTOToJSON(value?: QualityRatingAffectedOrderDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'orderId': value.orderId,
        'description': value.description,
        'componentType': AffectedOrderQualityRatingComponentTypeToJSON(value.componentType),
    };
}



