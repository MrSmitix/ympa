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
import EmptyApiResponse from '../model/EmptyApiResponse';
import GetOutletLicensesResponse from '../model/GetOutletLicensesResponse';
import UpdateOutletLicenseRequest from '../model/UpdateOutletLicenseRequest';

/**
* OutletLicenses service.
* @module api/OutletLicensesApi
* @version LATEST
*/
export default class OutletLicensesApi {

    /**
    * Constructs a new OutletLicensesApi. 
    * @alias module:api/OutletLicensesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the deleteOutletLicenses operation.
     * @callback module:api/OutletLicensesApi~deleteOutletLicensesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmptyApiResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Удаление лицензий для точек продаж
     * Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} [ids] Список идентификаторов лицензий.
     * @param {module:api/OutletLicensesApi~deleteOutletLicensesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmptyApiResponse}
     */
    deleteOutletLicenses(campaignId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling deleteOutletLicenses");
      }

      let pathParams = {
        'campaignId': campaignId
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(opts['ids'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = EmptyApiResponse;
      return this.apiClient.callApi(
        '/campaigns/{campaignId}/outlets/licenses', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getOutletLicenses operation.
     * @callback module:api/OutletLicensesApi~getOutletLicensesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetOutletLicensesResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Информация о лицензиях для точек продаж
     * Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} [outletIds] Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке. 
     * @param {Array.<Number>} [ids] Список идентификаторов лицензий.
     * @param {module:api/OutletLicensesApi~getOutletLicensesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetOutletLicensesResponse}
     */
    getOutletLicenses(campaignId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling getOutletLicenses");
      }

      let pathParams = {
        'campaignId': campaignId
      };
      let queryParams = {
        'outletIds': this.apiClient.buildCollectionParam(opts['outletIds'], 'csv'),
        'ids': this.apiClient.buildCollectionParam(opts['ids'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['OAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GetOutletLicensesResponse;
      return this.apiClient.callApi(
        '/campaigns/{campaignId}/outlets/licenses', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the updateOutletLicenses operation.
     * @callback module:api/OutletLicensesApi~updateOutletLicensesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmptyApiResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Создание и изменение лицензий для точек продаж
     * Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     * @param {Number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param {module:model/UpdateOutletLicenseRequest} updateOutletLicenseRequest 
     * @param {module:api/OutletLicensesApi~updateOutletLicensesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmptyApiResponse}
     */
    updateOutletLicenses(campaignId, updateOutletLicenseRequest, callback) {
      let postBody = updateOutletLicenseRequest;
      // verify the required parameter 'campaignId' is set
      if (campaignId === undefined || campaignId === null) {
        throw new Error("Missing the required parameter 'campaignId' when calling updateOutletLicenses");
      }
      // verify the required parameter 'updateOutletLicenseRequest' is set
      if (updateOutletLicenseRequest === undefined || updateOutletLicenseRequest === null) {
        throw new Error("Missing the required parameter 'updateOutletLicenseRequest' when calling updateOutletLicenses");
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
      let returnType = EmptyApiResponse;
      return this.apiClient.callApi(
        '/campaigns/{campaignId}/outlets/licenses', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
