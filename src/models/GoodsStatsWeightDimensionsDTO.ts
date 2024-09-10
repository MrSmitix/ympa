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
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 * @export
 * @interface GoodsStatsWeightDimensionsDTO
 */
export interface GoodsStatsWeightDimensionsDTO  {
    /**
     * Длина товара в сантиметрах.
     * @type {number}
     * @memberof GoodsStatsWeightDimensionsDTO
     */
    length?: number;
    /**
     * Ширина товара в сантиметрах.
     * @type {number}
     * @memberof GoodsStatsWeightDimensionsDTO
     */
    width?: number;
    /**
     * Высота товара в сантиметрах.
     * @type {number}
     * @memberof GoodsStatsWeightDimensionsDTO
     */
    height?: number;
    /**
     * Вес товара в килограммах.
     * @type {number}
     * @memberof GoodsStatsWeightDimensionsDTO
     */
    weight?: number;
}

export function GoodsStatsWeightDimensionsDTOFromJSON(json: any): GoodsStatsWeightDimensionsDTO {
    return {
        'length': !exists(json, 'length') ? undefined : json['length'],
        'width': !exists(json, 'width') ? undefined : json['width'],
        'height': !exists(json, 'height') ? undefined : json['height'],
        'weight': !exists(json, 'weight') ? undefined : json['weight'],
    };
}

export function GoodsStatsWeightDimensionsDTOToJSON(value?: GoodsStatsWeightDimensionsDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'length': value.length,
        'width': value.width,
        'height': value.height,
        'weight': value.weight,
    };
}


