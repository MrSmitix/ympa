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
import { ChangeOutletRequest } from '../model/changeOutletRequest';
import { CreateOutletResponse } from '../model/createOutletResponse';
import { EmptyApiResponse } from '../model/emptyApiResponse';
import { GetOutletResponse } from '../model/getOutletResponse';
import { GetOutletsResponse } from '../model/getOutletsResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class OutletsService {
    private basePath: string = 'https://api.partner.market.yandex.ru';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Создание точки продаж
     * Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param changeOutletRequest 
     
     */
    public createOutlet(campaignId: number, changeOutletRequest: ChangeOutletRequest, observe?: 'body', headers?: Headers): Observable<CreateOutletResponse>;
    public createOutlet(campaignId: number, changeOutletRequest: ChangeOutletRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<CreateOutletResponse>>;
    public createOutlet(campaignId: number, changeOutletRequest: ChangeOutletRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling createOutlet.');
        }

        if (changeOutletRequest === null || changeOutletRequest === undefined){
            throw new Error('Required parameter changeOutletRequest was null or undefined when calling createOutlet.');
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

        const response: Observable<HttpResponse<CreateOutletResponse>> = this.httpClient.post(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/outlets`, changeOutletRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <CreateOutletResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Удаление точки продаж
     * Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param outletId Идентификатор точки продаж.
     
     */
    public deleteOutlet(campaignId: number, outletId: number, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public deleteOutlet(campaignId: number, outletId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public deleteOutlet(campaignId: number, outletId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling deleteOutlet.');
        }

        if (outletId === null || outletId === undefined){
            throw new Error('Required parameter outletId was null or undefined when calling deleteOutlet.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.delete(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/outlets/${encodeURIComponent(String(outletId))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Информация об одной точке продаж
     * Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param outletId Идентификатор точки продаж.
     
     */
    public getOutlet(campaignId: number, outletId: number, observe?: 'body', headers?: Headers): Observable<GetOutletResponse>;
    public getOutlet(campaignId: number, outletId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetOutletResponse>>;
    public getOutlet(campaignId: number, outletId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getOutlet.');
        }

        if (outletId === null || outletId === undefined){
            throw new Error('Required parameter outletId was null or undefined when calling getOutlet.');
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<GetOutletResponse>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/outlets/${encodeURIComponent(String(outletId))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetOutletResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Информация о нескольких точках продаж
     * Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
     * @param regionId Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
     * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
     * @param regionId2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %} 
     
     */
    public getOutlets(campaignId: number, pageToken?: string, regionId?: number, shopOutletCode?: string, regionId2?: number, observe?: 'body', headers?: Headers): Observable<GetOutletsResponse>;
    public getOutlets(campaignId: number, pageToken?: string, regionId?: number, shopOutletCode?: string, regionId2?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetOutletsResponse>>;
    public getOutlets(campaignId: number, pageToken?: string, regionId?: number, shopOutletCode?: string, regionId2?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getOutlets.');
        }

        let queryParameters: string[] = [];
        if (pageToken !== undefined) {
            queryParameters.push('pageToken='+encodeURIComponent(String(pageToken)));
        }
        if (regionId !== undefined) {
            queryParameters.push('regionId='+encodeURIComponent(String(regionId)));
        }
        if (shopOutletCode !== undefined) {
            queryParameters.push('shopOutletCode='+encodeURIComponent(String(shopOutletCode)));
        }
        if (regionId2 !== undefined) {
            queryParameters.push('regionId2='+encodeURIComponent(String(regionId2)));
        }

        // authentication (OAuth) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<GetOutletsResponse>> = this.httpClient.get(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/outlets?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetOutletsResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Изменение информации о точке продаж
     * Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param outletId Идентификатор точки продаж.
     * @param changeOutletRequest 
     
     */
    public updateOutlet(campaignId: number, outletId: number, changeOutletRequest: ChangeOutletRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public updateOutlet(campaignId: number, outletId: number, changeOutletRequest: ChangeOutletRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public updateOutlet(campaignId: number, outletId: number, changeOutletRequest: ChangeOutletRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling updateOutlet.');
        }

        if (outletId === null || outletId === undefined){
            throw new Error('Required parameter outletId was null or undefined when calling updateOutlet.');
        }

        if (changeOutletRequest === null || changeOutletRequest === undefined){
            throw new Error('Required parameter changeOutletRequest was null or undefined when calling updateOutlet.');
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

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.put(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/outlets/${encodeURIComponent(String(outletId))}`, changeOutletRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }

}
