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
    AddHiddenOffersRequest,
    AddHiddenOffersRequestFromJSON,
    AddHiddenOffersRequestToJSON,
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
    DeleteHiddenOffersRequest,
    DeleteHiddenOffersRequestFromJSON,
    DeleteHiddenOffersRequestToJSON,
    EmptyApiResponse,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    GetHiddenOffersResponse,
    GetHiddenOffersResponseFromJSON,
    GetHiddenOffersResponseToJSON,
} from '../models';

export interface AddHiddenOffersRequest {
    campaignId: number;
    addHiddenOffersRequest: AddHiddenOffersRequest;
}

export interface DeleteHiddenOffersRequest {
    campaignId: number;
    deleteHiddenOffersRequest: DeleteHiddenOffersRequest;
}

export interface GetHiddenOffersRequest {
    campaignId: number;
    offerId?: Array<string>;
    pageToken?: string;
    limit?: number;
    offset?: number;
    page?: number;
    pageSize?: number;
}


/**
 * Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
 * Скрытие товаров и настройки скрытия
 */
function addHiddenOffersRaw<T>(requestParameters: AddHiddenOffersRequest, requestConfig: runtime.TypedQueryConfig<T, EmptyApiResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling addHiddenOffers.');
    }

    if (requestParameters.addHiddenOffersRequest === null || requestParameters.addHiddenOffersRequest === undefined) {
        throw new runtime.RequiredError('addHiddenOffersRequest','Required parameter requestParameters.addHiddenOffersRequest was null or undefined when calling addHiddenOffers.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/hidden-offers`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        body: queryParameters || AddHiddenOffersRequestToJSON(requestParameters.addHiddenOffersRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(EmptyApiResponseFromJSON(body), text);
    }

    return config;
}

/**
* Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
* Скрытие товаров и настройки скрытия
*/
export function addHiddenOffers<T>(requestParameters: AddHiddenOffersRequest, requestConfig?: runtime.TypedQueryConfig<T, EmptyApiResponse>): QueryConfig<T> {
    return addHiddenOffersRaw(requestParameters, requestConfig);
}

/**
 * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
 * Возобновление показа товаров
 */
function deleteHiddenOffersRaw<T>(requestParameters: DeleteHiddenOffersRequest, requestConfig: runtime.TypedQueryConfig<T, EmptyApiResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling deleteHiddenOffers.');
    }

    if (requestParameters.deleteHiddenOffersRequest === null || requestParameters.deleteHiddenOffersRequest === undefined) {
        throw new runtime.RequiredError('deleteHiddenOffersRequest','Required parameter requestParameters.deleteHiddenOffersRequest was null or undefined when calling deleteHiddenOffers.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/hidden-offers/delete`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        body: queryParameters || DeleteHiddenOffersRequestToJSON(requestParameters.deleteHiddenOffersRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(EmptyApiResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
* Возобновление показа товаров
*/
export function deleteHiddenOffers<T>(requestParameters: DeleteHiddenOffersRequest, requestConfig?: runtime.TypedQueryConfig<T, EmptyApiResponse>): QueryConfig<T> {
    return deleteHiddenOffersRaw(requestParameters, requestConfig);
}

/**
 * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
 * Информация о скрытых вами товарах
 */
function getHiddenOffersRaw<T>(requestParameters: GetHiddenOffersRequest, requestConfig: runtime.TypedQueryConfig<T, GetHiddenOffersResponse> = {}): QueryConfig<T> {
    if (requestParameters.campaignId === null || requestParameters.campaignId === undefined) {
        throw new runtime.RequiredError('campaignId','Required parameter requestParameters.campaignId was null or undefined when calling getHiddenOffers.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.offerId) {
        queryParameters['offer_id'] = requestParameters.offerId?.join(runtime.COLLECTION_FORMATS["csv"]);
    }


    if (requestParameters.pageToken !== undefined) {
        queryParameters['page_token'] = requestParameters.pageToken;
    }


    if (requestParameters.limit !== undefined) {
        queryParameters['limit'] = requestParameters.limit;
    }


    if (requestParameters.offset !== undefined) {
        queryParameters['offset'] = requestParameters.offset;
    }


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
        url: `${runtime.Configuration.basePath}/campaigns/{campaignId}/hidden-offers`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters.campaignId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetHiddenOffersResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
* Информация о скрытых вами товарах
*/
export function getHiddenOffers<T>(requestParameters: GetHiddenOffersRequest, requestConfig?: runtime.TypedQueryConfig<T, GetHiddenOffersResponse>): QueryConfig<T> {
    return getHiddenOffersRaw(requestParameters, requestConfig);
}

