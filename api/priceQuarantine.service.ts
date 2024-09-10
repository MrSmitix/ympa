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
import { ApiLockedErrorResponse } from '../model/apiLockedErrorResponse';
import { ApiNotFoundErrorResponse } from '../model/apiNotFoundErrorResponse';
import { ApiServerErrorResponse } from '../model/apiServerErrorResponse';
import { ApiUnauthorizedErrorResponse } from '../model/apiUnauthorizedErrorResponse';
import { ConfirmPricesRequest } from '../model/confirmPricesRequest';
import { EmptyApiResponse } from '../model/emptyApiResponse';
import { GetQuarantineOffersRequest } from '../model/getQuarantineOffersRequest';
import { GetQuarantineOffersResponse } from '../model/getQuarantineOffersResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class PriceQuarantineService {
    private basePath: string = 'https://api.partner.market.yandex.ru';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Удаление товара из карантина по цене в кабинете
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param confirmPricesRequest 
     
     */
    public confirmBusinessPrices(businessId: number, confirmPricesRequest: ConfirmPricesRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public confirmBusinessPrices(businessId: number, confirmPricesRequest: ConfirmPricesRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public confirmBusinessPrices(businessId: number, confirmPricesRequest: ConfirmPricesRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (businessId === null || businessId === undefined){
            throw new Error('Required parameter businessId was null or undefined when calling confirmBusinessPrices.');
        }

        if (confirmPricesRequest === null || confirmPricesRequest === undefined){
            throw new Error('Required parameter confirmPricesRequest was null or undefined when calling confirmBusinessPrices.');
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

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.post(`${this.basePath}/businesses/${encodeURIComponent(String(businessId))}/price-quarantine/confirm`, confirmPricesRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Удаление товара из карантина по цене в магазине
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param confirmPricesRequest 
     
     */
    public confirmCampaignPrices(campaignId: number, confirmPricesRequest: ConfirmPricesRequest, observe?: 'body', headers?: Headers): Observable<EmptyApiResponse>;
    public confirmCampaignPrices(campaignId: number, confirmPricesRequest: ConfirmPricesRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<EmptyApiResponse>>;
    public confirmCampaignPrices(campaignId: number, confirmPricesRequest: ConfirmPricesRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling confirmCampaignPrices.');
        }

        if (confirmPricesRequest === null || confirmPricesRequest === undefined){
            throw new Error('Required parameter confirmPricesRequest was null or undefined when calling confirmCampaignPrices.');
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

        const response: Observable<HttpResponse<EmptyApiResponse>> = this.httpClient.post(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/price-quarantine/confirm`, confirmPricesRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <EmptyApiResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Список товаров, находящихся в карантине по цене в кабинете
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param getQuarantineOffersRequest 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
     * @param limit Количество значений на одной странице. 
     
     */
    public getBusinessQuarantineOffers(businessId: number, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken?: string, limit?: number, observe?: 'body', headers?: Headers): Observable<GetQuarantineOffersResponse>;
    public getBusinessQuarantineOffers(businessId: number, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken?: string, limit?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetQuarantineOffersResponse>>;
    public getBusinessQuarantineOffers(businessId: number, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken?: string, limit?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (businessId === null || businessId === undefined){
            throw new Error('Required parameter businessId was null or undefined when calling getBusinessQuarantineOffers.');
        }

        if (getQuarantineOffersRequest === null || getQuarantineOffersRequest === undefined){
            throw new Error('Required parameter getQuarantineOffersRequest was null or undefined when calling getBusinessQuarantineOffers.');
        }

        let queryParameters: string[] = [];
        if (pageToken !== undefined) {
            queryParameters.push('pageToken='+encodeURIComponent(String(pageToken)));
        }
        if (limit !== undefined) {
            queryParameters.push('limit='+encodeURIComponent(String(limit)));
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

        const response: Observable<HttpResponse<GetQuarantineOffersResponse>> = this.httpClient.post(`${this.basePath}/businesses/${encodeURIComponent(String(businessId))}/price-quarantine?${queryParameters.join('&')}`, getQuarantineOffersRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetQuarantineOffersResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Список товаров, находящихся в карантине по цене в магазине
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param getQuarantineOffersRequest 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
     * @param limit Количество значений на одной странице. 
     
     */
    public getCampaignQuarantineOffers(campaignId: number, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken?: string, limit?: number, observe?: 'body', headers?: Headers): Observable<GetQuarantineOffersResponse>;
    public getCampaignQuarantineOffers(campaignId: number, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken?: string, limit?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<GetQuarantineOffersResponse>>;
    public getCampaignQuarantineOffers(campaignId: number, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken?: string, limit?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (campaignId === null || campaignId === undefined){
            throw new Error('Required parameter campaignId was null or undefined when calling getCampaignQuarantineOffers.');
        }

        if (getQuarantineOffersRequest === null || getQuarantineOffersRequest === undefined){
            throw new Error('Required parameter getQuarantineOffersRequest was null or undefined when calling getCampaignQuarantineOffers.');
        }

        let queryParameters: string[] = [];
        if (pageToken !== undefined) {
            queryParameters.push('pageToken='+encodeURIComponent(String(pageToken)));
        }
        if (limit !== undefined) {
            queryParameters.push('limit='+encodeURIComponent(String(limit)));
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

        const response: Observable<HttpResponse<GetQuarantineOffersResponse>> = this.httpClient.post(`${this.basePath}/campaigns/${encodeURIComponent(String(campaignId))}/price-quarantine?${queryParameters.join('&')}`, getQuarantineOffersRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <GetQuarantineOffersResponse>(httpResponse.response))
               );
        }
        return response;
    }

}
