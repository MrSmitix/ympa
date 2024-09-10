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
 * Информация о ценах на модель товара.
 * @export
 * @interface ModelPriceDTO
 */
export interface ModelPriceDTO {
    /**
     * Средняя цена предложения для модели в регионе.
     * @type {number}
     * @memberof ModelPriceDTO
     */
    avg?: number;
    /**
     * Максимальная цена предложения для модели в регионе.
     * @type {number}
     * @memberof ModelPriceDTO
     */
    max?: number;
    /**
     * Минимальная цена предложения для модели в регионе.
     * @type {number}
     * @memberof ModelPriceDTO
     */
    min?: number;
}

/**
 * Check if a given object implements the ModelPriceDTO interface.
 */
export function instanceOfModelPriceDTO(value: object): value is ModelPriceDTO {
    return true;
}

export function ModelPriceDTOFromJSON(json: any): ModelPriceDTO {
    return ModelPriceDTOFromJSONTyped(json, false);
}

export function ModelPriceDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModelPriceDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'avg': json['avg'] == null ? undefined : json['avg'],
        'max': json['max'] == null ? undefined : json['max'],
        'min': json['min'] == null ? undefined : json['min'],
    };
}

export function ModelPriceDTOToJSON(value?: ModelPriceDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'avg': value['avg'],
        'max': value['max'],
        'min': value['min'],
    };
}
