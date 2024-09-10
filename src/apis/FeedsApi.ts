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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    ApiClientDataErrorResponse,
    ApiClientDataErrorResponseFromJSON,
    ApiClientDataErrorResponseToJSON,
    ApiForbiddenErrorResponse,
    ApiForbiddenErrorResponseFromJSON,
    ApiForbiddenErrorResponseToJSON,
    ApiLimitErrorResponse,
    ApiLimitErrorResponseFromJSON,
    ApiLimitErrorResponseToJSON,
    ApiLockedErrorResponse,
    ApiLockedErrorResponseFromJSON,
    ApiLockedErrorResponseToJSON,
    ApiNotFoundErrorResponse,
    ApiNotFoundErrorResponseFromJSON,
    ApiNotFoundErrorResponseToJSON,
    ApiServerErrorResponse,
    ApiServerErrorResponseFromJSON,
    ApiServerErrorResponseToJSON,
    ApiUnauthorizedErrorResponse,
    ApiUnauthorizedErrorResponseFromJSON,
    ApiUnauthorizedErrorResponseToJSON,
    EmptyApiResponse,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    FeedIndexLogsStatusType,
    FeedIndexLogsStatusTypeFromJSON,
    FeedIndexLogsStatusTypeToJSON,
    GetFeedIndexLogsResponse,
    GetFeedIndexLogsResponseFromJSON,
    GetFeedIndexLogsResponseToJSON,
    GetFeedResponse,
    GetFeedResponseFromJSON,
    GetFeedResponseToJSON,
    GetFeedsResponse,
    GetFeedsResponseFromJSON,
    GetFeedsResponseToJSON,
    SetFeedParamsRequest,
    SetFeedParamsRequestFromJSON,
    SetFeedParamsRequestToJSON,
} from '../models';

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

export interface SetFeedParamsRequest {
    campaignId: number;
    feedId: number;
    setFeedParamsRequest: SetFeedParamsRequest;
}


/**
 * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * Информация о прайс-листе
 */
function getFeedRaw<T>(requestParameters: GetFeedRequest, requestConfig: runtime.TypedQueryConfig<T, GetFeedResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getFeed.');
    }

    if (requestParameters.feedId === null || requestParameters.feedId === undefined) {
        throw new runtime.RequiredError('feedId','Required parameter requestParameters.feedId was null or undefined when calling getFeed.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/feeds/{feedId}`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters.feedId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetFeedResponseFromJSON(body), text);
    }

    return config;
}

/**
* {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
* Информация о прайс-листе
*/
export function getFeed<T>(requestParameters: GetFeedRequest, requestConfig?: runtime.TypedQueryConfig<T, GetFeedResponse>): QueryConfig<T> {
    return getFeedRaw(requestParameters, requestConfig);
}

/**
 * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * Отчет по индексации прайс-листа
 */
function getFeedIndexLogsRaw<T>(requestParameters: GetFeedIndexLogsRequest, requestConfig: runtime.TypedQueryConfig<T, GetFeedIndexLogsResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getFeedIndexLogs.');
    }

    if (requestParameters.feedId === null || requestParameters.feedId === undefined) {
        throw new runtime.RequiredError('feedId','Required parameter requestParameters.feedId was null or undefined when calling getFeedIndexLogs.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.limit !== undefined) {
        queryParameters['limit'] = requestParameters.limit;
    }


    if (requestParameters.publishedTimeFrom !== undefined) {
        queryParameters['published_time_from'] = (requestParameters.publishedTimeFrom as any).toISOString();
    }


    if (requestParameters.publishedTimeTo !== undefined) {
        queryParameters['published_time_to'] = (requestParameters.publishedTimeTo as any).toISOString();
    }


    if (requestParameters.status !== undefined) {
        queryParameters['status'] = requestParameters.status;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/feeds/{feedId}/index-logs`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters.feedId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetFeedIndexLogsResponseFromJSON(body), text);
    }

    return config;
}

/**
* {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
* Отчет по индексации прайс-листа
*/
export function getFeedIndexLogs<T>(requestParameters: GetFeedIndexLogsRequest, requestConfig?: runtime.TypedQueryConfig<T, GetFeedIndexLogsResponse>): QueryConfig<T> {
    return getFeedIndexLogsRaw(requestParameters, requestConfig);
}

/**
 * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * Список прайс-листов магазина
 */
function getFeedsRaw<T>(requestParameters: GetFeedsRequest, requestConfig: runtime.TypedQueryConfig<T, GetFeedsResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getFeeds.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/feeds`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetFeedsResponseFromJSON(body), text);
    }

    return config;
}

/**
* {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
* Список прайс-листов магазина
*/
export function getFeeds<T>(requestParameters: GetFeedsRequest, requestConfig?: runtime.TypedQueryConfig<T, GetFeedsResponse>): QueryConfig<T> {
    return getFeedsRaw(requestParameters, requestConfig);
}

/**
 * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
 * Сообщить, что прайс-лист обновился
 */
function refreshFeedRaw<T>(requestParameters: RefreshFeedRequest, requestConfig: runtime.TypedQueryConfig<T, EmptyApiResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling refreshFeed.');
    }

    if (requestParameters.feedId === null || requestParameters.feedId === undefined) {
        throw new runtime.RequiredError('feedId','Required parameter requestParameters.feedId was null or undefined when calling refreshFeed.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/feeds/{feedId}/refresh`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters.feedId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(EmptyApiResponseFromJSON(body), text);
    }

    return config;
}

/**
* {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
* Сообщить, что прайс-лист обновился
*/
export function refreshFeed<T>(requestParameters: RefreshFeedRequest, requestConfig?: runtime.TypedQueryConfig<T, EmptyApiResponse>): QueryConfig<T> {
    return refreshFeedRaw(requestParameters, requestConfig);
}

/**
 * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
 * Изменение параметров прайс-листа
 */
function setFeedParamsRaw<T>(requestParameters: SetFeedParamsRequest, requestConfig: runtime.TypedQueryConfig<T, EmptyApiResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling setFeedParams.');
    }

    if (requestParameters.feedId === null || requestParameters.feedId === undefined) {
        throw new runtime.RequiredError('feedId','Required parameter requestParameters.feedId was null or undefined when calling setFeedParams.');
    }

    if (requestParameters.setFeedParamsRequest === null || requestParameters.setFeedParamsRequest === undefined) {
        throw new runtime.RequiredError('setFeedParamsRequest','Required parameter requestParameters.setFeedParamsRequest was null or undefined when calling setFeedParams.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/feeds/{feedId}/params`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))).replace(`{${"feedId"}}`, encodeURIComponent(String(requestParameters.feedId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || SetFeedParamsRequestToJSON(requestParameters.setFeedParamsRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(EmptyApiResponseFromJSON(body), text);
    }

    return config;
}

/**
* {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
* Изменение параметров прайс-листа
*/
export function setFeedParams<T>(requestParameters: SetFeedParamsRequest, requestConfig?: runtime.TypedQueryConfig<T, EmptyApiResponse>): QueryConfig<T> {
    return setFeedParamsRaw(requestParameters, requestConfig);
}

