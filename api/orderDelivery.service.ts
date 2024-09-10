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
import { GetOrderBuyerInfoResponse } from '../model/getOrderBuyerInfoResponse';
import { SetOrderDeliveryDateRequest } from '../model/setOrderDeliveryDateRequest';
import { SetOrderDeliveryTrackCodeRequest } from '../model/setOrderDeliveryTrackCodeRequest';
import { UpdateOrderStorageLimitRequest } from '../model/updateOrderStorageLimitRequest';
import { VerifyOrderEacRequest } from '../model/verifyOrderEacRequest';
import { VerifyOrderEacResponse } from '../model/verifyOrderEacResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class OrderDeliveryService {
    private basePath: string = 'https://api.partner.market.yandex.ru';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Информация о покупателе — физическом лице
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     
     */
    public getOrderBuyerInfo(campaignId: number, orderId: number, observe?: 'body', headers?: Headers): Observable<GetOrderBuyerInfoResponse>;
    public getOrderBuyerInfo(campaignId: number, orderId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetOrderBuyerInfoResponse>>;
    public getOrderBuyerInfo(campaignId: number, orderId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getOrderBuyerInfo.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling getOrderBuyerInfo.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<GetOrderBuyerInfoResponse>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/buyer`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetOrderBuyerInfoResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Изменение даты доставки заказа
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryDateRequest 
     
     */
    public setOrderDeliveryDate(campaignId: number, orderId: number, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public setOrderDeliveryDate(campaignId: number, orderId: number, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public setOrderDeliveryDate(campaignId: number, orderId: number, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling setOrderDeliveryDate.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling setOrderDeliveryDate.');
        }

        if (setOrderDeliveryDateRequest === null || setOrderDeliveryDateRequest === undefined){
            throw new Error('Required parameter setOrderDeliveryDateRequest was null or undefined when calling setOrderDeliveryDate.');
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

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.put(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/delivery/date`, setOrderDeliveryDateRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Передача трек‑номера посылки
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryTrackCodeRequest 
     
     */
    public setOrderDeliveryTrackCode(campaignId: number, orderId: number, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public setOrderDeliveryTrackCode(campaignId: number, orderId: number, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public setOrderDeliveryTrackCode(campaignId: number, orderId: number, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling setOrderDeliveryTrackCode.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling setOrderDeliveryTrackCode.');
        }

        if (setOrderDeliveryTrackCodeRequest === null || setOrderDeliveryTrackCodeRequest === undefined){
            throw new Error('Required parameter setOrderDeliveryTrackCodeRequest was null or undefined when calling setOrderDeliveryTrackCode.');
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

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.post(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/delivery/track`, setOrderDeliveryTrackCodeRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Продление срока хранения заказа
     * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param updateOrderStorageLimitRequest 
     
     */
    public updateOrderStorageLimit(campaignId: number, orderId: number, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public updateOrderStorageLimit(campaignId: number, orderId: number, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public updateOrderStorageLimit(campaignId: number, orderId: number, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling updateOrderStorageLimit.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling updateOrderStorageLimit.');
        }

        if (updateOrderStorageLimitRequest === null || updateOrderStorageLimitRequest === undefined){
            throw new Error('Required parameter updateOrderStorageLimitRequest was null or undefined when calling updateOrderStorageLimit.');
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

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.put(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/delivery/storage-limit`, updateOrderStorageLimitRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Передача кода подтверждения
     * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param verifyOrderEacRequest 
     
     */
    public verifyOrderEac(campaignId: number, orderId: number, verifyOrderEacRequest: VerifyOrderEacRequest, observe?: 'body', headers?: Headers): Observable<VerifyOrderEacResponse>;
    public verifyOrderEac(campaignId: number, orderId: number, verifyOrderEacRequest: VerifyOrderEacRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<VerifyOrderEacResponse>>;
    public verifyOrderEac(campaignId: number, orderId: number, verifyOrderEacRequest: VerifyOrderEacRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling verifyOrderEac.');
        }

        if (orderId === null || orderId === undefined){
            throw new Error('Required parameter orderId was null or undefined when calling verifyOrderEac.');
        }

        if (verifyOrderEacRequest === null || verifyOrderEacRequest === undefined){
            throw new Error('Required parameter verifyOrderEacRequest was null or undefined when calling verifyOrderEac.');
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

        const response: Observable<HttpResponse<VerifyOrderEacResponse>> = this.httpClient.put(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/orders/${encodeURIComponent(String(orderId))}/verifyEac`, verifyOrderEacRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <VerifyOrderEacResponse>(httpResponse.response))
               );
        }
        return response;
    }

}
