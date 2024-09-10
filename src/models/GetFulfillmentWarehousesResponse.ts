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

import {
    ApiResponseStatusType,
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeToJSON,
    FulfillmentWarehousesDTO,
    FulfillmentWarehousesDTOFromJSON,
    FulfillmentWarehousesDTOToJSON,
} from './';

/**
 * @type GetFulfillmentWarehousesResponse
 * @export
 */
export interface GetFulfillmentWarehousesResponse extends ModelApiResponse {
}

export function GetFulfillmentWarehousesResponseFromJSON(json: any): GetFulfillmentWarehousesResponse {
    return {
        ...ModelApiResponseFromJSON(json),
    };
}

export function GetFulfillmentWarehousesResponseToJSON(value?: GetFulfillmentWarehousesResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...ModelApiResponseToJSON(value),
    };
}
