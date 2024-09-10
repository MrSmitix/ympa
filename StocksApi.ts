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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  GetWarehouseStocksResponse,
  GetWarehouseStocksRequest,
  UpdateStocksRequest,
  EmptyApiResponse,
} from './models';

/**
 * getStocks - parameters interface
 */
export interface IGetStocksParams {
  campaignId: number;
  pageToken?: string;
  limit?: number;
  getWarehouseStocksRequest?: GetWarehouseStocksRequest;
}

/**
 * updateStocks - parameters interface
 */
export interface IUpdateStocksParams {
  campaignId: number;
  updateStocksRequest: UpdateStocksRequest;
}

/**
 * StocksApi - API class
 */
@autoinject()
export class StocksApi extends Api {

  /**
   * Creates a new StocksApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Информация об остатках и оборачиваемости
   * Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param params.limit Количество значений на одной странице. 
   * @param params.getWarehouseStocksRequest 
   */
  async getStocks(params: IGetStocksParams): Promise<GetWarehouseStocksResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getStocks', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/offers/stocks`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'page_token': params['pageToken'],
        'limit': params['limit'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['getWarehouseStocksRequest'] || {}))

      // Authentication 'OAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Передача информации об остатках
   * Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.updateStocksRequest 
   */
  async updateStocks(params: IUpdateStocksParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateStocks', params, 'campaignId');
    this.ensureParamIsSet('updateStocks', params, 'updateStocksRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/offers/stocks`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['updateStocksRequest'] || {}))

      // Authentication 'OAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}
