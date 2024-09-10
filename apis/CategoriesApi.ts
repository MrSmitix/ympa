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
import { BaseAPI, throwIfNullOrUndefined } from '../runtime';
import type { OperationOpts, HttpHeaders } from '../runtime';
import type {
    ApiClientDataErrorResponse,
    ApiForbiddenErrorResponse,
    ApiLimitErrorResponse,
    ApiNotFoundErrorResponse,
    ApiServerErrorResponse,
    ApiUnauthorizedErrorResponse,
    GetCategoriesMaxSaleQuantumRequest,
    GetCategoriesMaxSaleQuantumResponse,
    GetCategoriesRequest,
    GetCategoriesResponse,
} from '../models';

export interface GetCategoriesMaxSaleQuantumRequest {
    getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest;
}

export interface GetCategoriesTreeRequest {
    getCategoriesRequest?: GetCategoriesRequest;
}

/**
 * no description
 */
export class CategoriesApi extends BaseAPI {

    /**
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     */
    getCategoriesMaxSaleQuantum({ getCategoriesMaxSaleQuantumRequest }: GetCategoriesMaxSaleQuantumRequest): Observable<GetCategoriesMaxSaleQuantumResponse>
    getCategoriesMaxSaleQuantum({ getCategoriesMaxSaleQuantumRequest }: GetCategoriesMaxSaleQuantumRequest, opts?: OperationOpts): Observable<AjaxResponse<GetCategoriesMaxSaleQuantumResponse>>
    getCategoriesMaxSaleQuantum({ getCategoriesMaxSaleQuantumRequest }: GetCategoriesMaxSaleQuantumRequest, opts?: OperationOpts): Observable<GetCategoriesMaxSaleQuantumResponse | AjaxResponse<GetCategoriesMaxSaleQuantumResponse>> {
        throwIfNullOrUndefined(getCategoriesMaxSaleQuantumRequest, 'getCategoriesMaxSaleQuantumRequest', 'getCategoriesMaxSaleQuantum');

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

        return this.request<GetCategoriesMaxSaleQuantumResponse>({
            url: '/categories/max-sale-quantum',
            method: 'POST',
            headers,
            body: getCategoriesMaxSaleQuantumRequest,
        }, opts?.responseOpts);
    };

    /**
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * Дерево категорий
     */
    getCategoriesTree({ getCategoriesRequest }: GetCategoriesTreeRequest): Observable<GetCategoriesResponse>
    getCategoriesTree({ getCategoriesRequest }: GetCategoriesTreeRequest, opts?: OperationOpts): Observable<AjaxResponse<GetCategoriesResponse>>
    getCategoriesTree({ getCategoriesRequest }: GetCategoriesTreeRequest, opts?: OperationOpts): Observable<GetCategoriesResponse | AjaxResponse<GetCategoriesResponse>> {

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

        return this.request<GetCategoriesResponse>({
            url: '/categories/tree',
            method: 'POST',
            headers,
            body: getCategoriesRequest,
        }, opts?.responseOpts);
    };

}
