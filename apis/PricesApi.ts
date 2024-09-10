/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';
import type {
  ApiClientDataErrorResponse,
  ApiForbiddenErrorResponse,
  ApiLimitErrorResponse,
  ApiLockedErrorResponse,
  ApiNotFoundErrorResponse,
  ApiServerErrorResponse,
  ApiUnauthorizedErrorResponse,
  EmptyApiResponse,
  GetPricesByOfferIdsRequest,
  GetPricesByOfferIdsResponse,
  GetPricesResponse,
  SuggestPricesRequest,
  SuggestPricesResponse,
  UpdateBusinessPricesRequest,
  UpdatePricesRequest,
} from '../models/index';
import {
    ApiClientDataErrorResponseFromJSON,
    ApiClientDataErrorResponseToJSON,
    ApiForbiddenErrorResponseFromJSON,
    ApiForbiddenErrorResponseToJSON,
    ApiLimitErrorResponseFromJSON,
    ApiLimitErrorResponseToJSON,
    ApiLockedErrorResponseFromJSON,
    ApiLockedErrorResponseToJSON,
    ApiNotFoundErrorResponseFromJSON,
    ApiNotFoundErrorResponseToJSON,
    ApiServerErrorResponseFromJSON,
    ApiServerErrorResponseToJSON,
    ApiUnauthorizedErrorResponseFromJSON,
    ApiUnauthorizedErrorResponseToJSON,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    GetPricesByOfferIdsRequestFromJSON,
    GetPricesByOfferIdsRequestToJSON,
    GetPricesByOfferIdsResponseFromJSON,
    GetPricesByOfferIdsResponseToJSON,
    GetPricesResponseFromJSON,
    GetPricesResponseToJSON,
    SuggestPricesRequestFromJSON,
    SuggestPricesRequestToJSON,
    SuggestPricesResponseFromJSON,
    SuggestPricesResponseToJSON,
    UpdateBusinessPricesRequestFromJSON,
    UpdateBusinessPricesRequestToJSON,
    UpdatePricesRequestFromJSON,
    UpdatePricesRequestToJSON,
} from '../models/index';

export interface GetPricesRequest {
    campaignId: number;
    pageToken?: string;
    limit?: number;
    archived?: boolean;
}

export interface GetPricesByOfferIdsOperationRequest {
    campaignId: number;
    pageToken?: string;
    limit?: number;
    getPricesByOfferIdsRequest?: GetPricesByOfferIdsRequest;
}

export interface GetSuggestedPricesRequest {
    campaignId: number;
    suggestPricesRequest: SuggestPricesRequest;
}

export interface UpdateBusinessPricesOperationRequest {
    businessId: number;
    updateBusinessPricesRequest: UpdateBusinessPricesRequest;
}

export interface UpdatePricesOperationRequest {
    campaignId: number;
    updatePricesRequest: UpdatePricesRequest;
}

/**
 * 
 */
export class PricesApi extends runtime.BaseAPI {

    /**
     * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
     * Список цен
     * @deprecated
     */
    async getPricesRaw(requestParameters: GetPricesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetPricesResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getPrices().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        if (requestParameters['archived'] != null) {
            queryParameters['archived'] = requestParameters['archived'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/offer-prices`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetPricesResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
     * Список цен
     * @deprecated
     */
    async getPrices(requestParameters: GetPricesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetPricesResponse> {
        const response = await this.getPricesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
     * Просмотр цен на указанные товары в магазине
     */
    async getPricesByOfferIdsRaw(requestParameters: GetPricesByOfferIdsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetPricesByOfferIdsResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getPricesByOfferIds().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/offer-prices`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: GetPricesByOfferIdsRequestToJSON(requestParameters['getPricesByOfferIdsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetPricesByOfferIdsResponseFromJSON(jsonValue));
    }

    /**
     * Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
     * Просмотр цен на указанные товары в магазине
     */
    async getPricesByOfferIds(requestParameters: GetPricesByOfferIdsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetPricesByOfferIdsResponse> {
        const response = await this.getPricesByOfferIdsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     * Цены для продвижения товаров
     * @deprecated
     */
    async getSuggestedPricesRaw(requestParameters: GetSuggestedPricesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SuggestPricesResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getSuggestedPrices().'
            );
        }

        if (requestParameters['suggestPricesRequest'] == null) {
            throw new runtime.RequiredError(
                'suggestPricesRequest',
                'Required parameter "suggestPricesRequest" was null or undefined when calling getSuggestedPrices().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/offer-prices/suggestions`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SuggestPricesRequestToJSON(requestParameters['suggestPricesRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SuggestPricesResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     * Цены для продвижения товаров
     * @deprecated
     */
    async getSuggestedPrices(requestParameters: GetSuggestedPricesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SuggestPricesResponse> {
        const response = await this.getSuggestedPricesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     * Установка цен на товары во всех магазинах
     */
    async updateBusinessPricesRaw(requestParameters: UpdateBusinessPricesOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling updateBusinessPrices().'
            );
        }

        if (requestParameters['updateBusinessPricesRequest'] == null) {
            throw new runtime.RequiredError(
                'updateBusinessPricesRequest',
                'Required parameter "updateBusinessPricesRequest" was null or undefined when calling updateBusinessPrices().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/businesses/{businessId}/offer-prices/updates`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: UpdateBusinessPricesRequestToJSON(requestParameters['updateBusinessPricesRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     * Установка цен на товары во всех магазинах
     */
    async updateBusinessPrices(requestParameters: UpdateBusinessPricesOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.updateBusinessPricesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Установка цен на товары в конкретном магазине
     */
    async updatePricesRaw(requestParameters: UpdatePricesOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling updatePrices().'
            );
        }

        if (requestParameters['updatePricesRequest'] == null) {
            throw new runtime.RequiredError(
                'updatePricesRequest',
                'Required parameter "updatePricesRequest" was null or undefined when calling updatePrices().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/offer-prices/updates`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: UpdatePricesRequestToJSON(requestParameters['updatePricesRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Установка цен на товары в конкретном магазине
     */
    async updatePrices(requestParameters: UpdatePricesOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.updatePricesRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
