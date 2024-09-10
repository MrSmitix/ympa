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
  GetFeedbackListResponse,
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
    GetFeedbackListResponseFromJSON,
    GetFeedbackListResponseToJSON,
} from '../models/index';

export interface GetFeedbackAndCommentUpdatesRequest {
    campaignId: number;
    pageToken?: string;
    limit?: number;
    fromDate?: Date;
}

/**
 * 
 */
export class FeedbacksApi extends runtime.BaseAPI {

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     * Новые и обновленные отзывы о магазине
     * @deprecated
     */
    async getFeedbackAndCommentUpdatesRaw(requestParameters: GetFeedbackAndCommentUpdatesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetFeedbackListResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getFeedbackAndCommentUpdates().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        if (requestParameters['fromDate'] != null) {
            queryParameters['from_date'] = (requestParameters['fromDate'] as any).toISOString().substring(0,10);
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/feedback/updates`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetFeedbackListResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     * Новые и обновленные отзывы о магазине
     * @deprecated
     */
    async getFeedbackAndCommentUpdates(requestParameters: GetFeedbackAndCommentUpdatesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetFeedbackListResponse> {
        const response = await this.getFeedbackAndCommentUpdatesRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
