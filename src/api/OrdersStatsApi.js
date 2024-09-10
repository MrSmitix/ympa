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
import GetOrdersStatsRequest from '../model/GetOrdersStatsRequest';
import GetOrdersStatsResponse from '../model/GetOrdersStatsResponse';

/**
* OrdersStats service.
* @module api/OrdersStatsApi
* @version LATEST
*/
export default class OrdersStatsApi {

    /**
    * Constructs a new OrdersStatsApi. 
    * @alias module:api/OrdersStatsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getOrdersStats operation.
     * @callback module:api/OrdersStatsApi~getOrdersStatsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetOrdersStatsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Детальная информация по заказам
     * Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {Object} opts Optional parameters
     * @param {String} [pageToken] Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
     * @param {Number} [limit] Количество значений на одной странице. 
     * @param {module:model/GetOrdersStatsRequest} [getOrdersStatsRequest] 
     * @param {module:api/OrdersStatsApi~getOrdersStatsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetOrdersStatsResponse}
     */
    getOrdersStats(campaignId, opts, callback) {
      opts = opts || {};
      let postBody = opts['getOrdersStatsRequest'];
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling getOrdersStats");
      }

      let pathParams = {
        'campaignId': campaignId
      };
      let queryParams = {
        'page_token': opts['pageToken'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = GetOrdersStatsResponse;
      return this.apiClient.callApi(
        '/campaigns/{campaignId}/stats/orders', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
