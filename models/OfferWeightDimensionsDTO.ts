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
/**
 * Габариты упаковки и вес товара.
 * 
 * Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.
 * 
 * ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png)
 * 
 * @export
 * @interface OfferWeightDimensionsDTO
 */
export interface OfferWeightDimensionsDTO {
    /**
     * Длина упаковки в см.
     * 
     * @type {number}
     * @memberof OfferWeightDimensionsDTO
     */
    length: number;
    /**
     * Ширина упаковки в см.
     * 
     * @type {number}
     * @memberof OfferWeightDimensionsDTO
     */
    width: number;
    /**
     * Высота упаковки в см.
     * 
     * @type {number}
     * @memberof OfferWeightDimensionsDTO
     */
    height: number;
    /**
     * Вес товара в кг с учетом упаковки (брутто).
     * 
     * @type {number}
     * @memberof OfferWeightDimensionsDTO
     */
    weight: number;
}

/**
 * Check if a given object implements the OfferWeightDimensionsDTO interface.
 */
export function instanceOfOfferWeightDimensionsDTO(value: object): value is OfferWeightDimensionsDTO {
    if (!('length' in value) || value['length'] === undefined) return false;
    if (!('width' in value) || value['width'] === undefined) return false;
    if (!('height' in value) || value['height'] === undefined) return false;
    if (!('weight' in value) || value['weight'] === undefined) return false;
    return true;
}

export function OfferWeightDimensionsDTOFromJSON(json: any): OfferWeightDimensionsDTO {
    return OfferWeightDimensionsDTOFromJSONTyped(json, false);
}

export function OfferWeightDimensionsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferWeightDimensionsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'length': json['length'],
        'width': json['width'],
        'height': json['height'],
        'weight': json['weight'],
    };
}

export function OfferWeightDimensionsDTOToJSON(value?: OfferWeightDimensionsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'length': value['length'],
        'width': value['width'],
        'height': value['height'],
        'weight': value['weight'],
    };
}

