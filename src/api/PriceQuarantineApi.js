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
 *
 */



import ApiClient from "../ApiClient";
import ApiClientDataErrorResponse from '../model/ApiClientDataErrorResponse';
import ApiForbiddenErrorResponse from '../model/ApiForbiddenErrorResponse';
import ApiLimitErrorResponse from '../model/ApiLimitErrorResponse';
import ApiLockedErrorResponse from '../model/ApiLockedErrorResponse';
import ApiNotFoundErrorResponse from '../model/ApiNotFoundErrorResponse';
import ApiServerErrorResponse from '../model/ApiServerErrorResponse';
import ApiUnauthorizedErrorResponse from '../model/ApiUnauthorizedErrorResponse';
import ConfirmPricesRequest from '../model/ConfirmPricesRequest';
import EmptyApiResponse from '../model/EmptyApiResponse';
import GetQuarantineOffersRequest from '../model/GetQuarantineOffersRequest';
import GetQuarantineOffersResponse from '../model/GetQuarantineOffersResponse';

/**
* PriceQuarantine service.
* @module api/PriceQuarantineApi
* @version LATEST
*/
export default class PriceQuarantineApi extends ApiClient {

    /**
    * Constructs a new PriceQuarantineApi. 
    * @alias module:api/PriceQuarantineApi
    * @class
    */
    constructor(baseURL = 'https://api.partner.market.yandex.ru') {
      super(baseURL);
    }


    /**
     * Удаление товара из карантина по цене в кабинете
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     * @param {Number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {module:model/ConfirmPricesRequest} confirmPricesRequest 
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<module:model/EmptyApiResponse>}
     */
    async confirmBusinessPrices(businessId, confirmPricesRequest, requestInit) {
      let postBody = confirmPricesRequest;
      // verify the required parameter 'businessId' is set
      if (businessId === undefined || businessId === null) {
        throw new Error("Missing the required parameter 'businessId' when calling confirmBusinessPrices");
      }
      // verify the required parameter 'confirmPricesRequest' is set
      if (confirmPricesRequest === undefined || confirmPricesRequest === null) {
        throw new Error("Missing the required parameter 'confirmPricesRequest' when calling confirmBusinessPrices");
      }

      let pathParams = {
        'businessId': businessId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/LATEST/Javascript',
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = EmptyApiResponse;

      return this.callApi(
        '/businesses/{businessId}/price-quarantine/confirm', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }

    /**
     * Удаление товара из карантина по цене в магазине
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {module:model/ConfirmPricesRequest} confirmPricesRequest 
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<module:model/EmptyApiResponse>}
     */
    async confirmCampaignPrices(campaignId, confirmPricesRequest, requestInit) {
      let postBody = confirmPricesRequest;
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling confirmCampaignPrices");
      }
      // verify the required parameter 'confirmPricesRequest' is set
      if (confirmPricesRequest === undefined || confirmPricesRequest === null) {
        throw new Error("Missing the required parameter 'confirmPricesRequest' when calling confirmCampaignPrices");
      }

      let pathParams = {
        'campaignId': campaignId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/LATEST/Javascript',
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = EmptyApiResponse;

      return this.callApi(
        '/campaigns/{campaignId}/price-quarantine/confirm', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }

    /**
     * Список товаров, находящихся в карантине по цене в кабинете
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     * @param {Number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {module:model/GetQuarantineOffersRequest} getQuarantineOffersRequest 
     * @param {Object} opts Optional parameters
     * @param {String} opts.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
     * @param {Number} opts.limit Количество значений на одной странице. 
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<module:model/GetQuarantineOffersResponse>}
     */
    async getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, opts, requestInit) {
      opts = opts || {};
      let postBody = getQuarantineOffersRequest;
      // verify the required parameter 'businessId' is set
      if (businessId === undefined || businessId === null) {
        throw new Error("Missing the required parameter 'businessId' when calling getBusinessQuarantineOffers");
      }
      // verify the required parameter 'getQuarantineOffersRequest' is set
      if (getQuarantineOffersRequest === undefined || getQuarantineOffersRequest === null) {
        throw new Error("Missing the required parameter 'getQuarantineOffersRequest' when calling getBusinessQuarantineOffers");
      }

      let pathParams = {
        'businessId': businessId
      };
      let queryParams = {
        'page_token': opts['pageToken'],
        'limit': opts['limit']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/LATEST/Javascript',
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = GetQuarantineOffersResponse;

      return this.callApi(
        '/businesses/{businessId}/price-quarantine', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }

    /**
     * Список товаров, находящихся в карантине по цене в магазине
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {module:model/GetQuarantineOffersRequest} getQuarantineOffersRequest 
     * @param {Object} opts Optional parameters
     * @param {String} opts.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
     * @param {Number} opts.limit Количество значений на одной странице. 
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<module:model/GetQuarantineOffersResponse>}
     */
    async getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, opts, requestInit) {
      opts = opts || {};
      let postBody = getQuarantineOffersRequest;
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling getCampaignQuarantineOffers");
      }
      // verify the required parameter 'getQuarantineOffersRequest' is set
      if (getQuarantineOffersRequest === undefined || getQuarantineOffersRequest === null) {
        throw new Error("Missing the required parameter 'getQuarantineOffersRequest' when calling getCampaignQuarantineOffers");
      }

      let pathParams = {
        'campaignId': campaignId
      };
      let queryParams = {
        'page_token': opts['pageToken'],
        'limit': opts['limit']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/LATEST/Javascript',
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = GetQuarantineOffersResponse;

      return this.callApi(
        '/campaigns/{campaignId}/price-quarantine', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }


}
