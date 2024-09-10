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


import * as runtime from '../runtime';
import type {
  ApiClientDataErrorResponse,
  ApiForbiddenErrorResponse,
  ApiLimitErrorResponse,
  ApiNotFoundErrorResponse,
  ApiServerErrorResponse,
  ApiUnauthorizedErrorResponse,
  GetGoodsStatsRequest,
  GetGoodsStatsResponse,
} from '../models/index';
import {
    ApiClientDataErrorResponseFromJSON,
    ApiClientDataErrorResponseToJSON,
    ApiForbiddenErrorResponseFromJSON,
    ApiForbiddenErrorResponseToJSON,
    ApiLimitErrorResponseFromJSON,
    ApiLimitErrorResponseToJSON,
    ApiNotFoundErrorResponseFromJSON,
    ApiNotFoundErrorResponseToJSON,
    ApiServerErrorResponseFromJSON,
    ApiServerErrorResponseToJSON,
    ApiUnauthorizedErrorResponseFromJSON,
    ApiUnauthorizedErrorResponseToJSON,
    GetGoodsStatsRequestFromJSON,
    GetGoodsStatsRequestToJSON,
    GetGoodsStatsResponseFromJSON,
    GetGoodsStatsResponseToJSON,
} from '../models/index';

export interface GetGoodsStatsOperationRequest {
    campaignId: number;
    getGoodsStatsRequest: GetGoodsStatsRequest;
}

/**
 * 
 */
export class GoodsStatsApi extends runtime.BaseAPI {

    /**
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Отчет по товарам
     */
    async getGoodsStatsRaw(requestParameters: GetGoodsStatsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetGoodsStatsResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getGoodsStats().'
            );
        }

        if (requestParameters['getGoodsStatsRequest'] == null) {
            throw new runtime.RequiredError(
                'getGoodsStatsRequest',
                'Required parameter "getGoodsStatsRequest" was null or undefined when calling getGoodsStats().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/stats/skus`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: GetGoodsStatsRequestToJSON(requestParameters['getGoodsStatsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetGoodsStatsResponseFromJSON(jsonValue));
    }

    /**
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Отчет по товарам
     */
    async getGoodsStats(requestParameters: GetGoodsStatsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetGoodsStatsResponse> {
        const response = await this.getGoodsStatsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
