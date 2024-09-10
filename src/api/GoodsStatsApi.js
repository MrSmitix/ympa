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
import ApiNotFoundErrorResponse from '../model/ApiNotFoundErrorResponse';
import ApiServerErrorResponse from '../model/ApiServerErrorResponse';
import ApiUnauthorizedErrorResponse from '../model/ApiUnauthorizedErrorResponse';
import GetGoodsStatsRequest from '../model/GetGoodsStatsRequest';
import GetGoodsStatsResponse from '../model/GetGoodsStatsResponse';

/**
* GoodsStats service.
* @module api/GoodsStatsApi
* @version LATEST
*/
export default class GoodsStatsApi {

    /**
    * Constructs a new GoodsStatsApi. 
    * @alias module:api/GoodsStatsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getGoodsStats operation.
     * @callback module:api/GoodsStatsApi~getGoodsStatsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetGoodsStatsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Отчет по товарам
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {module:model/GetGoodsStatsRequest} getGoodsStatsRequest 
     * @param {module:api/GoodsStatsApi~getGoodsStatsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetGoodsStatsResponse}
     */
    getGoodsStats(campaignId, getGoodsStatsRequest, callback) {
      let postBody = getGoodsStatsRequest;
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling getGoodsStats");
      }
      // verify the required parameter 'getGoodsStatsRequest' is set
      if (getGoodsStatsRequest === undefined || getGoodsStatsRequest === null) {
        throw new Error("Missing the required parameter 'getGoodsStatsRequest' when calling getGoodsStats");
      }

      let pathParams = {
        'campaignId': campaignId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = GetGoodsStatsResponse;
      return this.apiClient.callApi(
        '/campaigns/{campaignId}/stats/skus', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
