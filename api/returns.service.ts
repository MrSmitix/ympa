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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { ApiClientDataErrorResponse } from '../model/apiClientDataErrorResponse';
import { ApiForbiddenErrorResponse } from '../model/apiForbiddenErrorResponse';
import { ApiLimitErrorResponse } from '../model/apiLimitErrorResponse';
import { ApiNotFoundErrorResponse } from '../model/apiNotFoundErrorResponse';
import { ApiServerErrorResponse } from '../model/apiServerErrorResponse';
import { ApiUnauthorizedErrorResponse } from '../model/apiUnauthorizedErrorResponse';
import { EmptyApiResponse } from '../model/emptyApiResponse';
import { GetReturnResponse } from '../model/getReturnResponse';
import { GetReturnsResponse } from '../model/getReturnsResponse';
import { RefundStatusType } from '../model/refundStatusType';
import { ReturnType } from '../model/returnType';
import { SetReturnDecisionRequest } from '../model/setReturnDecisionRequest';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class ReturnsService {
    private basePath: string = 'https://api.partner.market.yandex.ru';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Информация о невыкупе или возврате
     * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param returnId Идентификатор возврата.
     
     */
    public getReturn(campaignId: number, orderId: number, returnId: number, observe?: 'body', headers?: Headers): Observable<GetReturnResponse>;
    public getReturn(campaignId: number, orderId: number, returnId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetReturnResponse>>;
    public getReturn(campaignId: number, orderId: number, returnId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getReturn.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling getReturn.');
        }

        if (returnId === null || returnId === undefined){
            throw new Error('Required parameter returnId was null or undefined when calling getReturn.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<GetReturnResponse>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/returns/${encodeURIComponent(String(returnId))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetReturnResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Получение заявления на возврат
     * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param returnId Идентификатор возврата.
     
     */
    public getReturnApplication(campaignId: number, orderId: number, returnId: number, observe?: 'body', headers?: Headers): Observable<File>;
    public getReturnApplication(campaignId: number, orderId: number, returnId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<File>>;
    public getReturnApplication(campaignId: number, orderId: number, returnId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getReturnApplication.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling getReturnApplication.');
        }

        if (returnId === null || returnId === undefined){
            throw new Error('Required parameter returnId was null or undefined when calling getReturnApplication.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/octet-stream, application/json';

        const response: Observable<HttpResponse<File>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/returns/${encodeURIComponent(String(returnId))}/application`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <File>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Получение фотографии возврата
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param returnId Идентификатор возврата.
     * @param itemId Идентификатор товара в возврате.
     * @param imageHash Хеш ссылки изображения для загрузки.
     
     */
    public getReturnPhoto(campaignId: number, orderId: number, returnId: number, itemId: number, imageHash: string, observe?: 'body', headers?: Headers): Observable<File>;
    public getReturnPhoto(campaignId: number, orderId: number, returnId: number, itemId: number, imageHash: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<File>>;
    public getReturnPhoto(campaignId: number, orderId: number, returnId: number, itemId: number, imageHash: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getReturnPhoto.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling getReturnPhoto.');
        }

        if (returnId === null || returnId === undefined){
            throw new Error('Required parameter returnId was null or undefined when calling getReturnPhoto.');
        }

        if (itemId === null || itemId === undefined){
            throw new Error('Required parameter itemId was null or undefined when calling getReturnPhoto.');
        }

        if (imageHash === null || imageHash === undefined){
            throw new Error('Required parameter imageHash was null or undefined when calling getReturnPhoto.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/octet-stream, application/json';

        const response: Observable<HttpResponse<File>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/returns/${encodeURIComponent(String(returnId))}/decision/${encodeURIComponent(String(itemId))}/image/${encodeURIComponent(String(imageHash))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <File>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Список невыкупов и возвратов
     * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
     * @param limit Количество значений на одной странице. 
     * @param orderIds Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
     * @param statuses Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
     * @param type Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
     * @param fromDate Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @param toDate Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @param fromDate2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
     * @param toDate2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
     
     */
    public getReturns(campaignId: number, pageToken?: string, limit?: number, orderIds?: Array<number>, statuses?: Array<RefundStatusType>, type?: ReturnType, fromDate?: string, toDate?: string, fromDate2?: string, toDate2?: string, observe?: 'body', headers?: Headers): Observable<GetReturnsResponse>;
    public getReturns(campaignId: number, pageToken?: string, limit?: number, orderIds?: Array<number>, statuses?: Array<RefundStatusType>, type?: ReturnType, fromDate?: string, toDate?: string, fromDate2?: string, toDate2?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetReturnsResponse>>;
    public getReturns(campaignId: number, pageToken?: string, limit?: number, orderIds?: Array<number>, statuses?: Array<RefundStatusType>, type?: ReturnType, fromDate?: string, toDate?: string, fromDate2?: string, toDate2?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getReturns.');
        }

        let queryParameters: string[] = [];
        if (pageToken !== undefined) {
            queryParameters.push('pageToken='+encodeURIComponent(String(pageToken)));
        }
        if (limit !== undefined) {
            queryParameters.push('limit='+encodeURIComponent(String(limit)));
        }
        if (orderIds) {
            queryParameters.push('orderIds='+encodeURIComponent(orderIds.join(COLLECTION_FORMATS['csv'])));
        }
        if (statuses) {
            queryParameters.push('statuses='+encodeURIComponent(statuses.join(COLLECTION_FORMATS['csv'])));
        }
        if (type !== undefined) {
            queryParameters.push('type='+encodeURIComponent(String(type)));
        }
        if (fromDate !== undefined) {
            queryParameters.push('fromDate='+encodeURIComponent(String(fromDate)));
        }
        if (toDate !== undefined) {
            queryParameters.push('toDate='+encodeURIComponent(String(toDate)));
        }
        if (fromDate2 !== undefined) {
            queryParameters.push('fromDate2='+encodeURIComponent(String(fromDate2)));
        }
        if (toDate2 !== undefined) {
            queryParameters.push('toDate2='+encodeURIComponent(String(toDate2)));
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<GetReturnsResponse>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/returns?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetReturnsResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Принятие или изменение решения по возврату
     * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param returnId Идентификатор возврата.
     * @param setReturnDecisionRequest 
     
     */
    public setReturnDecision(campaignId: number, orderId: number, returnId: number, setReturnDecisionRequest: SetReturnDecisionRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public setReturnDecision(campaignId: number, orderId: number, returnId: number, setReturnDecisionRequest: SetReturnDecisionRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public setReturnDecision(campaignId: number, orderId: number, returnId: number, setReturnDecisionRequest: SetReturnDecisionRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling setReturnDecision.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling setReturnDecision.');
        }

        if (returnId === null || returnId === undefined){
            throw new Error('Required parameter returnId was null or undefined when calling setReturnDecision.');
        }

        if (setReturnDecisionRequest === null || setReturnDecisionRequest === undefined){
            throw new Error('Required parameter setReturnDecisionRequest was null or undefined when calling setReturnDecision.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.post(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/returns/${encodeURIComponent(String(returnId))}/decision`, setReturnDecisionRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Подтверждение решения по возврату
     * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param returnId Идентификатор возврата.
     
     */
    public submitReturnDecision(campaignId: number, orderId: number, returnId: number, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public submitReturnDecision(campaignId: number, orderId: number, returnId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public submitReturnDecision(campaignId: number, orderId: number, returnId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling submitReturnDecision.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling submitReturnDecision.');
        }

        if (returnId === null || returnId === undefined){
            throw new Error('Required parameter returnId was null or undefined when calling submitReturnDecision.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.post(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/returns/${encodeURIComponent(String(returnId))}/decision/submit`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }

}
