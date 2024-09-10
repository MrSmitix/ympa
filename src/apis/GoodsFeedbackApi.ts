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
    DeleteGoodsFeedbackCommentRequest,
    DeleteGoodsFeedbackCommentRequestFromJSON,
    DeleteGoodsFeedbackCommentRequestToJSON,
    EmptyApiResponse,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    GetGoodsFeedbackCommentsRequest,
    GetGoodsFeedbackCommentsRequestFromJSON,
    GetGoodsFeedbackCommentsRequestToJSON,
    GetGoodsFeedbackCommentsResponse,
    GetGoodsFeedbackCommentsResponseFromJSON,
    GetGoodsFeedbackCommentsResponseToJSON,
    GetGoodsFeedbackRequest,
    GetGoodsFeedbackRequestFromJSON,
    GetGoodsFeedbackRequestToJSON,
    GetGoodsFeedbackResponse,
    GetGoodsFeedbackResponseFromJSON,
    GetGoodsFeedbackResponseToJSON,
    SkipGoodsFeedbackReactionRequest,
    SkipGoodsFeedbackReactionRequestFromJSON,
    SkipGoodsFeedbackReactionRequestToJSON,
    UpdateGoodsFeedbackCommentRequest,
    UpdateGoodsFeedbackCommentRequestFromJSON,
    UpdateGoodsFeedbackCommentRequestToJSON,
    UpdateGoodsFeedbackCommentResponse,
    UpdateGoodsFeedbackCommentResponseFromJSON,
    UpdateGoodsFeedbackCommentResponseToJSON,
} from '../models';

export interface DeleteGoodsFeedbackCommentRequest {
    businessId: number;
    deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest;
}

export interface GetGoodsFeedbackCommentsRequest {
    businessId: number;
    getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest;
    pageToken?: string;
    limit?: number;
}

export interface GetGoodsFeedbacksRequest {
    businessId: number;
    pageToken?: string;
    limit?: number;
    getGoodsFeedbackRequest?: GetGoodsFeedbackRequest;
}

export interface SkipGoodsFeedbacksReactionRequest {
    businessId: number;
    skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest;
}

export interface UpdateGoodsFeedbackCommentRequest {
    businessId: number;
    updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest;
}


/**
 * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * Удаление комментария к отзыву
 */
function deleteGoodsFeedbackCommentRaw<T>(requestParameters: DeleteGoodsFeedbackCommentRequest, requestConfig: runtime.TypedQueryConfig<T, EmptyApiResponse> = {}): QueryConfig<T> {
    if (requestParameters.businessId === null || requestParameters.businessId === undefined) {
        throw new runtime.RequiredError('businessId','Required parameter requestParameters.businessId was null or undefined when calling deleteGoodsFeedbackComment.');
    }

    if (requestParameters.deleteGoodsFeedbackCommentRequest === null || requestParameters.deleteGoodsFeedbackCommentRequest === undefined) {
        throw new runtime.RequiredError('deleteGoodsFeedbackCommentRequest','Required parameter requestParameters.deleteGoodsFeedbackCommentRequest was null or undefined when calling deleteGoodsFeedbackComment.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/businesses/{businessId}/goods-feedback/comments/delete`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters.businessId))),
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
        body: queryParameters || DeleteGoodsFeedbackCommentRequestToJSON(requestParameters.deleteGoodsFeedbackCommentRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(EmptyApiResponseFromJSON(body), text);
    }

    return config;
}

/**
* Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
* Удаление комментария к отзыву
*/
export function deleteGoodsFeedbackComment<T>(requestParameters: DeleteGoodsFeedbackCommentRequest, requestConfig?: runtime.TypedQueryConfig<T, EmptyApiResponse>): QueryConfig<T> {
    return deleteGoodsFeedbackCommentRaw(requestParameters, requestConfig);
}

/**
 * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * Получение комментариев к отзыву
 */
function getGoodsFeedbackCommentsRaw<T>(requestParameters: GetGoodsFeedbackCommentsRequest, requestConfig: runtime.TypedQueryConfig<T, GetGoodsFeedbackCommentsResponse> = {}): QueryConfig<T> {
    if (requestParameters.businessId === null || requestParameters.businessId === undefined) {
        throw new runtime.RequiredError('businessId','Required parameter requestParameters.businessId was null or undefined when calling getGoodsFeedbackComments.');
    }

    if (requestParameters.getGoodsFeedbackCommentsRequest === null || requestParameters.getGoodsFeedbackCommentsRequest === undefined) {
        throw new runtime.RequiredError('getGoodsFeedbackCommentsRequest','Required parameter requestParameters.getGoodsFeedbackCommentsRequest was null or undefined when calling getGoodsFeedbackComments.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.pageToken !== undefined) {
        queryParameters['page_token'] = requestParameters.pageToken;
    }


    if (requestParameters.limit !== undefined) {
        queryParameters['limit'] = requestParameters.limit;
    }

    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/businesses/{businessId}/goods-feedback/comments`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters.businessId))),
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
        body: queryParameters || GetGoodsFeedbackCommentsRequestToJSON(requestParameters.getGoodsFeedbackCommentsRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetGoodsFeedbackCommentsResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
* Получение комментариев к отзыву
*/
export function getGoodsFeedbackComments<T>(requestParameters: GetGoodsFeedbackCommentsRequest, requestConfig?: runtime.TypedQueryConfig<T, GetGoodsFeedbackCommentsResponse>): QueryConfig<T> {
    return getGoodsFeedbackCommentsRaw(requestParameters, requestConfig);
}

/**
 * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * Получение отзывов о товарах продавца
 */
function getGoodsFeedbacksRaw<T>(requestParameters: GetGoodsFeedbacksRequest, requestConfig: runtime.TypedQueryConfig<T, GetGoodsFeedbackResponse> = {}): QueryConfig<T> {
    if (requestParameters.businessId === null || requestParameters.businessId === undefined) {
        throw new runtime.RequiredError('businessId','Required parameter requestParameters.businessId was null or undefined when calling getGoodsFeedbacks.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.pageToken !== undefined) {
        queryParameters['page_token'] = requestParameters.pageToken;
    }


    if (requestParameters.limit !== undefined) {
        queryParameters['limit'] = requestParameters.limit;
    }

    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/businesses/{businessId}/goods-feedback`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters.businessId))),
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
        body: queryParameters || GetGoodsFeedbackRequestToJSON(requestParameters.getGoodsFeedbackRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GetGoodsFeedbackResponseFromJSON(body), text);
    }

    return config;
}

/**
* Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
* Получение отзывов о товарах продавца
*/
export function getGoodsFeedbacks<T>(requestParameters: GetGoodsFeedbacksRequest, requestConfig?: runtime.TypedQueryConfig<T, GetGoodsFeedbackResponse>): QueryConfig<T> {
    return getGoodsFeedbacksRaw(requestParameters, requestConfig);
}

/**
 * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * Отказ от ответа на отзывы
 */
function skipGoodsFeedbacksReactionRaw<T>(requestParameters: SkipGoodsFeedbacksReactionRequest, requestConfig: runtime.TypedQueryConfig<T, EmptyApiResponse> = {}): QueryConfig<T> {
    if (requestParameters.businessId === null || requestParameters.businessId === undefined) {
        throw new runtime.RequiredError('businessId','Required parameter requestParameters.businessId was null or undefined when calling skipGoodsFeedbacksReaction.');
    }

    if (requestParameters.skipGoodsFeedbackReactionRequest === null || requestParameters.skipGoodsFeedbackReactionRequest === undefined) {
        throw new runtime.RequiredError('skipGoodsFeedbackReactionRequest','Required parameter requestParameters.skipGoodsFeedbackReactionRequest was null or undefined when calling skipGoodsFeedbacksReaction.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/businesses/{businessId}/goods-feedback/skip-reaction`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters.businessId))),
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
        body: queryParameters || SkipGoodsFeedbackReactionRequestToJSON(requestParameters.skipGoodsFeedbackReactionRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(EmptyApiResponseFromJSON(body), text);
    }

    return config;
}

/**
* Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
* Отказ от ответа на отзывы
*/
export function skipGoodsFeedbacksReaction<T>(requestParameters: SkipGoodsFeedbacksReactionRequest, requestConfig?: runtime.TypedQueryConfig<T, EmptyApiResponse>): QueryConfig<T> {
    return skipGoodsFeedbacksReactionRaw(requestParameters, requestConfig);
}

/**
 * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * Добавление нового или изменение созданного комментария
 */
function updateGoodsFeedbackCommentRaw<T>(requestParameters: UpdateGoodsFeedbackCommentRequest, requestConfig: runtime.TypedQueryConfig<T, UpdateGoodsFeedbackCommentResponse> = {}): QueryConfig<T> {
    if (requestParameters.businessId === null || requestParameters.businessId === undefined) {
        throw new runtime.RequiredError('businessId','Required parameter requestParameters.businessId was null or undefined when calling updateGoodsFeedbackComment.');
    }

    if (requestParameters.updateGoodsFeedbackCommentRequest === null || requestParameters.updateGoodsFeedbackCommentRequest === undefined) {
        throw new runtime.RequiredError('updateGoodsFeedbackCommentRequest','Required parameter requestParameters.updateGoodsFeedbackCommentRequest was null or undefined when calling updateGoodsFeedbackComment.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["market:partner-api"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/businesses/{businessId}/goods-feedback/comments/update`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters.businessId))),
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
        body: queryParameters || UpdateGoodsFeedbackCommentRequestToJSON(requestParameters.updateGoodsFeedbackCommentRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(UpdateGoodsFeedbackCommentResponseFromJSON(body), text);
    }

    return config;
}

/**
* Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
* Добавление нового или изменение созданного комментария
*/
export function updateGoodsFeedbackComment<T>(requestParameters: UpdateGoodsFeedbackCommentRequest, requestConfig?: runtime.TypedQueryConfig<T, UpdateGoodsFeedbackCommentResponse>): QueryConfig<T> {
    return updateGoodsFeedbackCommentRaw(requestParameters, requestConfig);
}

