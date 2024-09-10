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
    ApiLockedErrorResponse,
    ApiNotFoundErrorResponse,
    ApiServerErrorResponse,
    ApiUnauthorizedErrorResponse,
    GetCategoryContentParametersResponse,
    GetOfferCardsContentStatusRequest,
    GetOfferCardsContentStatusResponse,
    UpdateOfferContentRequest,
    UpdateOfferContentResponse,
} from '../models';

export interface GetCategoryContentParametersRequest {
    categoryId: number;
}

export interface GetOfferCardsContentStatusRequest {
    businessId: number;
    pageToken?: string;
    limit?: number;
    getOfferCardsContentStatusRequest?: GetOfferCardsContentStatusRequest;
}

export interface UpdateOfferContentRequest {
    businessId: number;
    updateOfferContentRequest: UpdateOfferContentRequest;
}

/**
 * no description
 */
export class ContentApi extends BaseAPI {

    /**
     * Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
     * Списки характеристик товаров по категориям
     */
    getCategoryContentParameters({ categoryId }: GetCategoryContentParametersRequest): Observable<GetCategoryContentParametersResponse>
    getCategoryContentParameters({ categoryId }: GetCategoryContentParametersRequest, opts?: OperationOpts): Observable<AjaxResponse<GetCategoryContentParametersResponse>>
    getCategoryContentParameters({ categoryId }: GetCategoryContentParametersRequest, opts?: OperationOpts): Observable<GetCategoryContentParametersResponse | AjaxResponse<GetCategoryContentParametersResponse>> {
        throwIfNullOrUndefined(categoryId, 'categoryId', 'getCategoryContentParameters');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<GetCategoryContentParametersResponse>({
            url: '/category/{categoryId}/parameters'.replace('{categoryId}', encodeURI(categoryId)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
     * Получение информации о заполненности карточек магазина
     */
    getOfferCardsContentStatus({ businessId, pageToken, limit, getOfferCardsContentStatusRequest }: GetOfferCardsContentStatusRequest): Observable<GetOfferCardsContentStatusResponse>
    getOfferCardsContentStatus({ businessId, pageToken, limit, getOfferCardsContentStatusRequest }: GetOfferCardsContentStatusRequest, opts?: OperationOpts): Observable<AjaxResponse<GetOfferCardsContentStatusResponse>>
    getOfferCardsContentStatus({ businessId, pageToken, limit, getOfferCardsContentStatusRequest }: GetOfferCardsContentStatusRequest, opts?: OperationOpts): Observable<GetOfferCardsContentStatusResponse | AjaxResponse<GetOfferCardsContentStatusResponse>> {
        throwIfNullOrUndefined(businessId, 'businessId', 'getOfferCardsContentStatus');

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

        return this.request<GetOfferCardsContentStatusResponse>({
            url: '/businesses/{businessId}/offer-cards'.replace('{businessId}', encodeURI(businessId)),
            method: 'POST',
            headers,
            query,
            body: getOfferCardsContentStatusRequest,
        }, opts?.responseOpts);
    };

    /**
     * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Редактирование категорийных характеристик товара
     */
    updateOfferContent({ businessId, updateOfferContentRequest }: UpdateOfferContentRequest): Observable<UpdateOfferContentResponse>
    updateOfferContent({ businessId, updateOfferContentRequest }: UpdateOfferContentRequest, opts?: OperationOpts): Observable<AjaxResponse<UpdateOfferContentResponse>>
    updateOfferContent({ businessId, updateOfferContentRequest }: UpdateOfferContentRequest, opts?: OperationOpts): Observable<UpdateOfferContentResponse | AjaxResponse<UpdateOfferContentResponse>> {
        throwIfNullOrUndefined(businessId, 'businessId', 'updateOfferContent');
        throwIfNullOrUndefined(updateOfferContentRequest, 'updateOfferContentRequest', 'updateOfferContent');

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

        return this.request<UpdateOfferContentResponse>({
            url: '/businesses/{businessId}/offer-cards/update'.replace('{businessId}', encodeURI(businessId)),
            method: 'POST',
            headers,
            body: updateOfferContentRequest,
        }, opts?.responseOpts);
    };

}
