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
  ApiLockedErrorResponse,
  ApiNotFoundErrorResponse,
  ApiServerErrorResponse,
  ApiUnauthorizedErrorResponse,
  EmptyApiResponse,
  FeedIndexLogsStatusType,
  GetFeedIndexLogsResponse,
  GetFeedResponse,
  GetFeedsResponse,
  SetFeedParamsRequest,
} from '../models/index';
import {
    ApiClientDataErrorResponseFromJSON,
    ApiClientDataErrorResponseToJSON,
    ApiForbiddenErrorResponseFromJSON,
    ApiForbiddenErrorResponseToJSON,
    ApiLimitErrorResponseFromJSON,
    ApiLimitErrorResponseToJSON,
    ApiLockedErrorResponseFromJSON,
    ApiLockedErrorResponseToJSON,
    ApiNotFoundErrorResponseFromJSON,
    ApiNotFoundErrorResponseToJSON,
    ApiServerErrorResponseFromJSON,
    ApiServerErrorResponseToJSON,
    ApiUnauthorizedErrorResponseFromJSON,
    ApiUnauthorizedErrorResponseToJSON,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    FeedIndexLogsStatusTypeFromJSON,
    FeedIndexLogsStatusTypeToJSON,
    GetFeedIndexLogsResponseFromJSON,
    GetFeedIndexLogsResponseToJSON,
    GetFeedResponseFromJSON,
    GetFeedResponseToJSON,
    GetFeedsResponseFromJSON,
    GetFeedsResponseToJSON,
    SetFeedParamsRequestFromJSON,
    SetFeedParamsRequestToJSON,
} from '../models/index';

export interface GetFeedRequest {
    campaignId: number;
    feedId: number;
}

export interface GetFeedIndexLogsRequest {
    campaignId: number;
    feedId: number;
    limit?: number;
    publishedTimeFrom?: Date;
    publishedTimeTo?: Date;
    status?: FeedIndexLogsStatusType;
}

export interface GetFeedsRequest {
    campaignId: number;
}

export interface RefreshFeedRequest {
    campaignId: number;
    feedId: number;
}

export interface SetFeedParamsOperationRequest {
    campaignId: number;
    feedId: number;
    setFeedParamsRequest: SetFeedParamsRequest;
}

/**
 * 
 */
export class FeedsApi extends runtime.BaseAPI {

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Информация о прайс-листе
     * @deprecated
     */
    async getFeedRaw(requestParameters: GetFeedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetFeedResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getFeed().'
            );
        }

        if (requestParameters['feedId'] == null) {
            throw new runtime.RequiredError(
                'feedId',
                'Required parameter "feedId" was null or undefined when calling getFeed().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/feeds/{feedId}`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters['feedId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetFeedResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Информация о прайс-листе
     * @deprecated
     */
    async getFeed(requestParameters: GetFeedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetFeedResponse> {
        const response = await this.getFeedRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * Отчет по индексации прайс-листа
     * @deprecated
     */
    async getFeedIndexLogsRaw(requestParameters: GetFeedIndexLogsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetFeedIndexLogsResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getFeedIndexLogs().'
            );
        }

        if (requestParameters['feedId'] == null) {
            throw new runtime.RequiredError(
                'feedId',
                'Required parameter "feedId" was null or undefined when calling getFeedIndexLogs().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        if (requestParameters['publishedTimeFrom'] != null) {
            queryParameters['published_time_from'] = (requestParameters['publishedTimeFrom'] as any).toISOString();
        }

        if (requestParameters['publishedTimeTo'] != null) {
            queryParameters['published_time_to'] = (requestParameters['publishedTimeTo'] as any).toISOString();
        }

        if (requestParameters['status'] != null) {
            queryParameters['status'] = requestParameters['status'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/feeds/{feedId}/index-logs`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters['feedId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetFeedIndexLogsResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * Отчет по индексации прайс-листа
     * @deprecated
     */
    async getFeedIndexLogs(requestParameters: GetFeedIndexLogsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetFeedIndexLogsResponse> {
        const response = await this.getFeedIndexLogsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Список прайс-листов магазина
     * @deprecated
     */
    async getFeedsRaw(requestParameters: GetFeedsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetFeedsResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getFeeds().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/feeds`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetFeedsResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Список прайс-листов магазина
     * @deprecated
     */
    async getFeeds(requestParameters: GetFeedsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetFeedsResponse> {
        const response = await this.getFeedsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     * Сообщить, что прайс-лист обновился
     * @deprecated
     */
    async refreshFeedRaw(requestParameters: RefreshFeedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling refreshFeed().'
            );
        }

        if (requestParameters['feedId'] == null) {
            throw new runtime.RequiredError(
                'feedId',
                'Required parameter "feedId" was null or undefined when calling refreshFeed().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/feeds/{feedId}/refresh`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters['feedId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     * Сообщить, что прайс-лист обновился
     * @deprecated
     */
    async refreshFeed(requestParameters: RefreshFeedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.refreshFeedRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     * Изменение параметров прайс-листа
     * @deprecated
     */
    async setFeedParamsRaw(requestParameters: SetFeedParamsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling setFeedParams().'
            );
        }

        if (requestParameters['feedId'] == null) {
            throw new runtime.RequiredError(
                'feedId',
                'Required parameter "feedId" was null or undefined when calling setFeedParams().'
            );
        }

        if (requestParameters['setFeedParamsRequest'] == null) {
            throw new runtime.RequiredError(
                'setFeedParamsRequest',
                'Required parameter "setFeedParamsRequest" was null or undefined when calling setFeedParams().'
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
            path: `/campaigns/{campaignId}/feeds/{feedId}/params`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters['feedId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SetFeedParamsRequestToJSON(requestParameters['setFeedParamsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     * Изменение параметров прайс-листа
     * @deprecated
     */
    async setFeedParams(requestParameters: SetFeedParamsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.setFeedParamsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
