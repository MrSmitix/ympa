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
    GetOrderLabelsDataResponse,
    PageFormatType,
} from '../models';

export interface GenerateOrderLabelRequest {
    campaignId: number;
    orderId: number;
    shipmentId: number;
    boxId: number;
    format?: PageFormatType;
}

export interface GenerateOrderLabelsRequest {
    campaignId: number;
    orderId: number;
    format?: PageFormatType;
}

export interface GetOrderLabelsDataRequest {
    campaignId: number;
    orderId: number;
}

/**
 * no description
 */
export class OrderLabelsApi extends BaseAPI {

    /**
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * Готовый ярлык‑наклейка для коробки в заказе
     */
    generateOrderLabel({ campaignId, orderId, shipmentId, boxId, format }: GenerateOrderLabelRequest): Observable<Blob>
    generateOrderLabel({ campaignId, orderId, shipmentId, boxId, format }: GenerateOrderLabelRequest, opts?: OperationOpts): Observable<AjaxResponse<Blob>>
    generateOrderLabel({ campaignId, orderId, shipmentId, boxId, format }: GenerateOrderLabelRequest, opts?: OperationOpts): Observable<Blob | AjaxResponse<Blob>> {
        throwIfNullOrUndefined(campaignId, 'campaignId', 'generateOrderLabel');
        throwIfNullOrUndefined(orderId, 'orderId', 'generateOrderLabel');
        throwIfNullOrUndefined(shipmentId, 'shipmentId', 'generateOrderLabel');
        throwIfNullOrUndefined(boxId, 'boxId', 'generateOrderLabel');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (format != null) { query['format'] = format; }

        return this.request<Blob>({
            url: '/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label'.replace('{campaignId}', encodeURI(campaignId)).replace('{orderId}', encodeURI(orderId)).replace('{shipmentId}', encodeURI(shipmentId)).replace('{boxId}', encodeURI(boxId)),
            method: 'GET',
            headers,
            query,
            responseType: 'blob',
        }, opts?.responseOpts);
    };

    /**
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     */
    generateOrderLabels({ campaignId, orderId, format }: GenerateOrderLabelsRequest): Observable<Blob>
    generateOrderLabels({ campaignId, orderId, format }: GenerateOrderLabelsRequest, opts?: OperationOpts): Observable<AjaxResponse<Blob>>
    generateOrderLabels({ campaignId, orderId, format }: GenerateOrderLabelsRequest, opts?: OperationOpts): Observable<Blob | AjaxResponse<Blob>> {
        throwIfNullOrUndefined(campaignId, 'campaignId', 'generateOrderLabels');
        throwIfNullOrUndefined(orderId, 'orderId', 'generateOrderLabels');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (format != null) { query['format'] = format; }

        return this.request<Blob>({
            url: '/campaigns/{campaignId}/orders/{orderId}/delivery/labels'.replace('{campaignId}', encodeURI(campaignId)).replace('{orderId}', encodeURI(orderId)),
            method: 'GET',
            headers,
            query,
            responseType: 'blob',
        }, opts?.responseOpts);
    };

    /**
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * Данные для самостоятельного изготовления ярлыков
     */
    getOrderLabelsData({ campaignId, orderId }: GetOrderLabelsDataRequest): Observable<GetOrderLabelsDataResponse>
    getOrderLabelsData({ campaignId, orderId }: GetOrderLabelsDataRequest, opts?: OperationOpts): Observable<AjaxResponse<GetOrderLabelsDataResponse>>
    getOrderLabelsData({ campaignId, orderId }: GetOrderLabelsDataRequest, opts?: OperationOpts): Observable<GetOrderLabelsDataResponse | AjaxResponse<GetOrderLabelsDataResponse>> {
        throwIfNullOrUndefined(campaignId, 'campaignId', 'getOrderLabelsData');
        throwIfNullOrUndefined(orderId, 'orderId', 'getOrderLabelsData');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('OAuth', ['market:partner-api'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<GetOrderLabelsDataResponse>({
            url: '/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data'.replace('{campaignId}', encodeURI(campaignId)).replace('{orderId}', encodeURI(orderId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

}
