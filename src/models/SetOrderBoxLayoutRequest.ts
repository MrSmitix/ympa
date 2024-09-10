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
    OrderBoxLayoutDTO,
    OrderBoxLayoutDTOFromJSON,
    OrderBoxLayoutDTOToJSON,
} from './';

/**
 * 
 * @export
 * @interface SetOrderBoxLayoutRequest
 */
export interface SetOrderBoxLayoutRequest  {
    /**
     * Список коробок.
     * @type {Array<OrderBoxLayoutDTO>}
     * @memberof SetOrderBoxLayoutRequest
     */
    boxes: Array<OrderBoxLayoutDTO>;
    /**
     * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
     * @type {boolean}
     * @memberof SetOrderBoxLayoutRequest
     */
    allowRemove?: boolean;
}

export function SetOrderBoxLayoutRequestFromJSON(json: any): SetOrderBoxLayoutRequest {
    return {
        'boxes': (json['boxes'] as Array<any>).map(OrderBoxLayoutDTOFromJSON),
        'allowRemove': !exists(json, 'allowRemove') ? undefined : json['allowRemove'],
    };
}

export function SetOrderBoxLayoutRequestToJSON(value?: SetOrderBoxLayoutRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'boxes': (value.boxes as Array<any>).map(OrderBoxLayoutDTOToJSON),
        'allowRemove': value.allowRemove,
    };
}


