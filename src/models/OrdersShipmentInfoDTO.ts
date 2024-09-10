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
 * Годные/негодные ярлыки по заказам в отгрузке.
 * @export
 * @interface OrdersShipmentInfoDTO
 */
export interface OrdersShipmentInfoDTO  {
    /**
     * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
     * @type {Set<number>}
     * @memberof OrdersShipmentInfoDTO
     */
    orderIdsWithLabels: Set<number>;
    /**
     * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
     * @type {Set<number>}
     * @memberof OrdersShipmentInfoDTO
     */
    orderIdsWithoutLabels: Set<number>;
}

export function OrdersShipmentInfoDTOFromJSON(json: any): OrdersShipmentInfoDTO {
    return {
        'orderIdsWithLabels': json['orderIdsWithLabels'],
        'orderIdsWithoutLabels': json['orderIdsWithoutLabels'],
    };
}

export function OrdersShipmentInfoDTOToJSON(value?: OrdersShipmentInfoDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'orderIdsWithLabels': value.orderIdsWithLabels,
        'orderIdsWithoutLabels': value.orderIdsWithoutLabels,
    };
}


