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
    ApiNotFoundErrorResponse,
    ApiNotFoundErrorResponseFromJSON,
    ApiNotFoundErrorResponseToJSON,
    ApiServerErrorResponse,
    ApiServerErrorResponseFromJSON,
    ApiServerErrorResponseToJSON,
    ApiUnauthorizedErrorResponse,
    ApiUnauthorizedErrorResponseFromJSON,
    ApiUnauthorizedErrorResponseToJSON,
    GetCampaignLoginsResponse,
    GetCampaignLoginsResponseFromJSON,
    GetCampaignLoginsResponseToJSON,
    GetCampaignRegionResponse,
    GetCampaignRegionResponseFromJSON,
    GetCampaignRegionResponseToJSON,
    GetCampaignResponse,
    GetCampaignResponseFromJSON,
    GetCampaignResponseToJSON,
    GetCampaignSettingsResponse,
    GetCampaignSettingsResponseFromJSON,
    GetCampaignSettingsResponseToJSON,
    GetCampaignsResponse,
    GetCampaignsResponseFromJSON,
    GetCampaignsResponseToJSON,
} from '../models';

export interface GetCampaignRequest {
    campaignId: number;
}

export interface GetCampaignLoginsRequest {
    campaignId: number;
}

export interface GetCampaignRegionRequest {
    campaignId: number;
}

export interface GetCampaignSettingsRequest {
    campaignId: number;
}

export interface GetCampaignsRequest {
    page?: number;
    pageSize?: number;
}

export interface GetCampaignsByLoginRequest {
    login: string;
    page?: number;
    pageSize?: number;
}


/**
 * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * Информация о магазине
 */
function getCampaignRaw<T>(requestParameters: GetCampaignRequest, requestConfig: runtime.TypedQueryConfig<T, GetCampaignResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getCampaign.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetCampaignResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
* Информация о магазине
*/
export function getCampaign<T>(requestParameters: GetCampaignRequest, requestConfig?: runtime.TypedQueryConfig<T, GetCampaignResponse>): QueryConfig<T> {
    return getCampaignRaw(requestParameters, requestConfig);
}

/**
 * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * Логины, связанные с магазином
 */
function getCampaignLoginsRaw<T>(requestParameters: GetCampaignLoginsRequest, requestConfig: runtime.TypedQueryConfig<T, GetCampaignLoginsResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getCampaignLogins.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/logins`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetCampaignLoginsResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
* Логины, связанные с магазином
*/
export function getCampaignLogins<T>(requestParameters: GetCampaignLoginsRequest, requestConfig?: runtime.TypedQueryConfig<T, GetCampaignLoginsResponse>): QueryConfig<T> {
    return getCampaignLoginsRaw(requestParameters, requestConfig);
}

/**
 * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
 * Регион магазина
 */
function getCampaignRegionRaw<T>(requestParameters: GetCampaignRegionRequest, requestConfig: runtime.TypedQueryConfig<T, GetCampaignRegionResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getCampaignRegion.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/region`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetCampaignRegionResponseFromJSON(body), text);
    }

    return config;
}

/**
* {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
* Регион магазина
*/
export function getCampaignRegion<T>(requestParameters: GetCampaignRegionRequest, requestConfig?: runtime.TypedQueryConfig<T, GetCampaignRegionResponse>): QueryConfig<T> {
    return getCampaignRegionRaw(requestParameters, requestConfig);
}

/**
 * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * Настройки магазина
 */
function getCampaignSettingsRaw<T>(requestParameters: GetCampaignSettingsRequest, requestConfig: runtime.TypedQueryConfig<T, GetCampaignSettingsResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getCampaignSettings.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/settings`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetCampaignSettingsResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
* Настройки магазина
*/
export function getCampaignSettings<T>(requestParameters: GetCampaignSettingsRequest, requestConfig?: runtime.TypedQueryConfig<T, GetCampaignSettingsResponse>): QueryConfig<T> {
    return getCampaignSettingsRaw(requestParameters, requestConfig);
}

/**
 * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * Список магазинов пользователя
 */
function getCampaignsRaw<T>(requestParameters: GetCampaignsRequest, requestConfig: runtime.TypedQueryConfig<T, GetCampaignsResponse> = {}): QueryConfig<T> {
    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.page !== undefined) {
        queryParameters['page'] = requestParameters.page;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['pageSize'] = requestParameters.pageSize;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetCampaignsResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
* Список магазинов пользователя
*/
export function getCampaigns<T>(requestParameters: GetCampaignsRequest, requestConfig?: runtime.TypedQueryConfig<T, GetCampaignsResponse>): QueryConfig<T> {
    return getCampaignsRaw(requestParameters, requestConfig);
}

/**
 * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
 * Магазины, доступные логину
 */
function getCampaignsByLoginRaw<T>(requestParameters: GetCampaignsByLoginRequest, requestConfig: runtime.TypedQueryConfig<T, GetCampaignsResponse> = {}): QueryConfig<T> {
    if (requestParameters.login === null || requestParameters.login === undefined) {
        throw new runtime.RequiredError('login','Required parameter requestParameters.login was null or undefined when calling getCampaignsByLogin.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.page !== undefined) {
        queryParameters['page'] = requestParameters.page;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['pageSize'] = requestParameters.pageSize;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/by_login/{login}`.replace(`{${"login"}}`, encodeURIComponent(String(requestParameters.login))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetCampaignsResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
* Магазины, доступные логину
*/
export function getCampaignsByLogin<T>(requestParameters: GetCampaignsByLoginRequest, requestConfig?: runtime.TypedQueryConfig<T, GetCampaignsResponse>): QueryConfig<T> {
    return getCampaignsByLoginRaw(requestParameters, requestConfig);
}

