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
    UpdateOfferContentResultDTO,
    UpdateOfferContentResultDTOFromJSON,
    UpdateOfferContentResultDTOToJSON,
} from './';

/**
 * @type UpdateOfferContentResponse
 * Описывает проблемы, которые появились при сохранении товара.
 * @export
 */
export interface UpdateOfferContentResponse extends ModelApiResponse {
}

export function UpdateOfferContentResponseFromJSON(json: any): UpdateOfferContentResponse {
    return {
        ...ModelApiResponseFromJSON(json),
    };
}

export function UpdateOfferContentResponseToJSON(value?: UpdateOfferContentResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...ModelApiResponseToJSON(value),
    };
}
