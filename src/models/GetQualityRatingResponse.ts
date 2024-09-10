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
    CampaignsQualityRatingDTO,
    CampaignsQualityRatingDTOFromJSON,
    CampaignsQualityRatingDTOToJSON,
} from './';

/**
 * @type GetQualityRatingResponse
 * Информация об индексе качества магазинов.
 * @export
 */
export interface GetQualityRatingResponse extends ModelApiResponse {
}

export function GetQualityRatingResponseFromJSON(json: any): GetQualityRatingResponse {
    return {
        ...ModelApiResponseFromJSON(json),
    };
}

export function GetQualityRatingResponseToJSON(value?: GetQualityRatingResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...ModelApiResponseToJSON(value),
    };
}
