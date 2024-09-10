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
  CurrencyType,
  DeleteCampaignOffersRequest,
  DeleteCampaignOffersResponse,
  EmptyApiResponse,
  GetAllOffersResponse,
  GetCampaignOffersRequest,
  GetCampaignOffersResponse,
  GetOfferRecommendationsRequest,
  GetOfferRecommendationsResponse,
  GetOffersResponse,
  UpdateCampaignOffersRequest,
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
    CurrencyTypeFromJSON,
    CurrencyTypeToJSON,
    DeleteCampaignOffersRequestFromJSON,
    DeleteCampaignOffersRequestToJSON,
    DeleteCampaignOffersResponseFromJSON,
    DeleteCampaignOffersResponseToJSON,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    GetAllOffersResponseFromJSON,
    GetAllOffersResponseToJSON,
    GetCampaignOffersRequestFromJSON,
    GetCampaignOffersRequestToJSON,
    GetCampaignOffersResponseFromJSON,
    GetCampaignOffersResponseToJSON,
    GetOfferRecommendationsRequestFromJSON,
    GetOfferRecommendationsRequestToJSON,
    GetOfferRecommendationsResponseFromJSON,
    GetOfferRecommendationsResponseToJSON,
    GetOffersResponseFromJSON,
    GetOffersResponseToJSON,
    UpdateCampaignOffersRequestFromJSON,
    UpdateCampaignOffersRequestToJSON,
} from '../models/index';

export interface DeleteCampaignOffersOperationRequest {
    campaignId: number;
    deleteCampaignOffersRequest: DeleteCampaignOffersRequest;
}

export interface GetAllOffersRequest {
    campaignId: number;
    feedId?: number;
    chunk?: number;
}

export interface GetCampaignOffersOperationRequest {
    campaignId: number;
    getCampaignOffersRequest: GetCampaignOffersRequest;
    pageToken?: string;
    limit?: number;
}

export interface GetOfferRecommendationsOperationRequest {
    businessId: number;
    getOfferRecommendationsRequest: GetOfferRecommendationsRequest;
    pageToken?: string;
    limit?: number;
}

export interface GetOffersRequest {
    campaignId: number;
    query?: string;
    feedId?: number;
    shopCategoryId?: string;
    currency?: CurrencyType;
    matched?: boolean;
    page?: number;
    pageSize?: number;
}

export interface UpdateCampaignOffersOperationRequest {
    campaignId: number;
    updateCampaignOffersRequest: UpdateCampaignOffersRequest;
}

/**
 * 
 */
export class OffersApi extends runtime.BaseAPI {

    /**
     * Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Удаление товаров из ассортимента магазина
     */
    async deleteCampaignOffersRaw(requestParameters: DeleteCampaignOffersOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<DeleteCampaignOffersResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling deleteCampaignOffers().'
            );
        }

        if (requestParameters['deleteCampaignOffersRequest'] == null) {
            throw new runtime.RequiredError(
                'deleteCampaignOffersRequest',
                'Required parameter "deleteCampaignOffersRequest" was null or undefined when calling deleteCampaignOffers().'
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
            path: `/campaigns/{campaignId}/offers/delete`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DeleteCampaignOffersRequestToJSON(requestParameters['deleteCampaignOffersRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => DeleteCampaignOffersResponseFromJSON(jsonValue));
    }

    /**
     * Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Удаление товаров из ассортимента магазина
     */
    async deleteCampaignOffers(requestParameters: DeleteCampaignOffersOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<DeleteCampaignOffersResponse> {
        const response = await this.deleteCampaignOffersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
     * Все предложения магазина
     * @deprecated
     */
    async getAllOffersRaw(requestParameters: GetAllOffersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetAllOffersResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getAllOffers().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['feedId'] != null) {
            queryParameters['feedId'] = requestParameters['feedId'];
        }

        if (requestParameters['chunk'] != null) {
            queryParameters['chunk'] = requestParameters['chunk'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/offers/all`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetAllOffersResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
     * Все предложения магазина
     * @deprecated
     */
    async getAllOffers(requestParameters: GetAllOffersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetAllOffersResponse> {
        const response = await this.getAllOffersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Информация о товарах, которые размещены в заданном магазине
     */
    async getCampaignOffersRaw(requestParameters: GetCampaignOffersOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetCampaignOffersResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getCampaignOffers().'
            );
        }

        if (requestParameters['getCampaignOffersRequest'] == null) {
            throw new runtime.RequiredError(
                'getCampaignOffersRequest',
                'Required parameter "getCampaignOffersRequest" was null or undefined when calling getCampaignOffers().'
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
            path: `/campaigns/{campaignId}/offers`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: GetCampaignOffersRequestToJSON(requestParameters['getCampaignOffersRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetCampaignOffersResponseFromJSON(jsonValue));
    }

    /**
     * Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Информация о товарах, которые размещены в заданном магазине
     */
    async getCampaignOffers(requestParameters: GetCampaignOffersOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetCampaignOffersResponse> {
        const response = await this.getCampaignOffersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     * Рекомендации Маркета, касающиеся цен
     */
    async getOfferRecommendationsRaw(requestParameters: GetOfferRecommendationsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetOfferRecommendationsResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling getOfferRecommendations().'
            );
        }

        if (requestParameters['getOfferRecommendationsRequest'] == null) {
            throw new runtime.RequiredError(
                'getOfferRecommendationsRequest',
                'Required parameter "getOfferRecommendationsRequest" was null or undefined when calling getOfferRecommendations().'
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
            path: `/businesses/{businessId}/offers/recommendations`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: GetOfferRecommendationsRequestToJSON(requestParameters['getOfferRecommendationsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetOfferRecommendationsResponseFromJSON(jsonValue));
    }

    /**
     * Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     * Рекомендации Маркета, касающиеся цен
     */
    async getOfferRecommendations(requestParameters: GetOfferRecommendationsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetOfferRecommendationsResponse> {
        const response = await this.getOfferRecommendationsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
     * Предложения магазина
     * @deprecated
     */
    async getOffersRaw(requestParameters: GetOffersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetOffersResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling getOffers().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['query'] != null) {
            queryParameters['query'] = requestParameters['query'];
        }

        if (requestParameters['feedId'] != null) {
            queryParameters['feedId'] = requestParameters['feedId'];
        }

        if (requestParameters['shopCategoryId'] != null) {
            queryParameters['shopCategoryId'] = requestParameters['shopCategoryId'];
        }

        if (requestParameters['currency'] != null) {
            queryParameters['currency'] = requestParameters['currency'];
        }

        if (requestParameters['matched'] != null) {
            queryParameters['matched'] = requestParameters['matched'];
        }

        if (requestParameters['page'] != null) {
            queryParameters['page'] = requestParameters['page'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['pageSize'] = requestParameters['pageSize'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/campaigns/{campaignId}/offers`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetOffersResponseFromJSON(jsonValue));
    }

    /**
     * {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
     * Предложения магазина
     * @deprecated
     */
    async getOffers(requestParameters: GetOffersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetOffersResponse> {
        const response = await this.getOffersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Изменение условий продажи товаров в магазине
     */
    async updateCampaignOffersRaw(requestParameters: UpdateCampaignOffersOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['campaignId'] == null) {
            throw new runtime.RequiredError(
                'campaignId',
                'Required parameter "campaignId" was null or undefined when calling updateCampaignOffers().'
            );
        }

        if (requestParameters['updateCampaignOffersRequest'] == null) {
            throw new runtime.RequiredError(
                'updateCampaignOffersRequest',
                'Required parameter "updateCampaignOffersRequest" was null or undefined when calling updateCampaignOffers().'
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
            path: `/campaigns/{campaignId}/offers/update`.replace(`{${"campaignId"}}`, encodeURIComponent(String(requestParameters['campaignId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: UpdateCampaignOffersRequestToJSON(requestParameters['updateCampaignOffersRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * Изменение условий продажи товаров в магазине
     */
    async updateCampaignOffers(requestParameters: UpdateCampaignOffersOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.updateCampaignOffersRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
