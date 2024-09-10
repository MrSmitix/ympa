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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    ApiClientDataErrorResponse,
    ApiForbiddenErrorResponse,
    ApiLimitErrorResponse,
    ApiNotFoundErrorResponse,
    ApiServerErrorResponse,
    ApiUnauthorizedErrorResponse,
    DeletePromoOffersRequest,
    DeletePromoOffersResponse,
    GetPromoOffersRequest,
    GetPromoOffersResponse,
    GetPromosRequest,
    GetPromosResponse,
    UpdatePromoOffersRequest,
    UpdatePromoOffersResponse,
} from '../models';

export interface DeletePromoOffersRequest {
    businessId: number;
    deletePromoOffersRequest: DeletePromoOffersRequest;
}

export interface GetPromoOffersRequest {
    businessId: number;
    getPromoOffersRequest: GetPromoOffersRequest;
    pageToken?: string;
    limit?: number;
}

export interface GetPromosRequest {
    businessId: number;
    getPromosRequest?: GetPromosRequest;
}

export interface UpdatePromoOffersRequest {
    businessId: number;
    updatePromoOffersRequest: UpdatePromoOffersRequest;
}

/**
 * no description
 */
export class PromosApi extends BaseAPI {

    /**
     * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Удаление товаров из акции
     */
    deletePromoOffers({ businessId, deletePromoOffersRequest }: DeletePromoOffersRequest): Observable<DeletePromoOffersResponse>
    deletePromoOffers({ businessId, deletePromoOffersRequest }: DeletePromoOffersRequest, opts?: OperationOpts): Observable<AjaxResponse<DeletePromoOffersResponse>>
    deletePromoOffers({ businessId, deletePromoOffersRequest }: DeletePromoOffersRequest, opts?: OperationOpts): Observable<DeletePromoOffersResponse | AjaxResponse<DeletePromoOffersResponse>> {
        throwIfNullOrUndefined(businessId, 'businessId', 'deletePromoOffers');
        throwIfNullOrUndefined(deletePromoOffersRequest, 'deletePromoOffersRequest', 'deletePromoOffers');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<DeletePromoOffersResponse>({
            url: '/businesses/{businessId}/promos/offers/delete'.replace('{businessId}', encodeURI(businessId)),
            method: 'POST',
            headers,
            body: deletePromoOffersRequest,
        }, opts?.responseOpts);
    };

    /**
     * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Получение списка товаров, которые участвуют или могут участвовать в акции
     */
    getPromoOffers({ businessId, getPromoOffersRequest, pageToken, limit }: GetPromoOffersRequest): Observable<GetPromoOffersResponse>
    getPromoOffers({ businessId, getPromoOffersRequest, pageToken, limit }: GetPromoOffersRequest, opts?: OperationOpts): Observable<AjaxResponse<GetPromoOffersResponse>>
    getPromoOffers({ businessId, getPromoOffersRequest, pageToken, limit }: GetPromoOffersRequest, opts?: OperationOpts): Observable<GetPromoOffersResponse | AjaxResponse<GetPromoOffersResponse>> {
        throwIfNullOrUndefined(businessId, 'businessId', 'getPromoOffers');
        throwIfNullOrUndefined(getPromoOffersRequest, 'getPromoOffersRequest', 'getPromoOffers');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (pageToken != null) { query['page_token'] = pageToken; }
        if (limit != null) { query['limit'] = limit; }

        return this.request<GetPromoOffersResponse>({
            url: '/businesses/{businessId}/promos/offers'.replace('{businessId}', encodeURI(businessId)),
            method: 'POST',
            headers,
            query,
            body: getPromoOffersRequest,
        }, opts?.responseOpts);
    };

    /**
     * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Получение списка акций
     */
    getPromos({ businessId, getPromosRequest }: GetPromosRequest): Observable<GetPromosResponse>
    getPromos({ businessId, getPromosRequest }: GetPromosRequest, opts?: OperationOpts): Observable<AjaxResponse<GetPromosResponse>>
    getPromos({ businessId, getPromosRequest }: GetPromosRequest, opts?: OperationOpts): Observable<GetPromosResponse | AjaxResponse<GetPromosResponse>> {
        throwIfNullOrUndefined(businessId, 'businessId', 'getPromos');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<GetPromosResponse>({
            url: '/businesses/{businessId}/promos'.replace('{businessId}', encodeURI(businessId)),
            method: 'POST',
            headers,
            body: getPromosRequest,
        }, opts?.responseOpts);
    };

    /**
     * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Добавление товаров в акцию или изменение их цен
     */
    updatePromoOffers({ businessId, updatePromoOffersRequest }: UpdatePromoOffersRequest): Observable<UpdatePromoOffersResponse>
    updatePromoOffers({ businessId, updatePromoOffersRequest }: UpdatePromoOffersRequest, opts?: OperationOpts): Observable<AjaxResponse<UpdatePromoOffersResponse>>
    updatePromoOffers({ businessId, updatePromoOffersRequest }: UpdatePromoOffersRequest, opts?: OperationOpts): Observable<UpdatePromoOffersResponse | AjaxResponse<UpdatePromoOffersResponse>> {
        throwIfNullOrUndefined(businessId, 'businessId', 'updatePromoOffers');
        throwIfNullOrUndefined(updatePromoOffersRequest, 'updatePromoOffersRequest', 'updatePromoOffers');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<UpdatePromoOffersResponse>({
            url: '/businesses/{businessId}/promos/offers/update'.replace('{businessId}', encodeURI(businessId)),
            method: 'POST',
            headers,
            body: updatePromoOffersRequest,
        }, opts?.responseOpts);
    };

}
