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
  AddHiddenOffersRequest,
  DeleteHiddenOffersRequest,
  GetHiddenOffersResponse,
  EmptyApiResponse,
} from './models';

/**
 * addHiddenOffers - parameters interface
 */
export interface IAddHiddenOffersParams {
  campaignId: number;
  addHiddenOffersRequest: AddHiddenOffersRequest;
}

/**
 * deleteHiddenOffers - parameters interface
 */
export interface IDeleteHiddenOffersParams {
  campaignId: number;
  deleteHiddenOffersRequest: DeleteHiddenOffersRequest;
}

/**
 * getHiddenOffers - parameters interface
 */
export interface IGetHiddenOffersParams {
  campaignId: number;
  offerId?: Array<string>;
  pageToken?: string;
  limit?: number;
  offset?: number;
  page?: number;
  pageSize?: number;
}

/**
 * HiddenOffersApi - API class
 */
@autoinject()
export class HiddenOffersApi extends Api {

  /**
   * Creates a new HiddenOffersApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Скрытие товаров и настройки скрытия
   * Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.addHiddenOffersRequest Запрос на скрытие оферов.
   */
  async addHiddenOffers(params: IAddHiddenOffersParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('addHiddenOffers', params, 'campaignId');
    this.ensureParamIsSet('addHiddenOffers', params, 'addHiddenOffersRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/hidden-offers`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['addHiddenOffersRequest'] || {}))

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
   * Возобновление показа товаров
   * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.deleteHiddenOffersRequest Запрос на возобновление показа оферов.
   */
  async deleteHiddenOffers(params: IDeleteHiddenOffersParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteHiddenOffers', params, 'campaignId');
    this.ensureParamIsSet('deleteHiddenOffers', params, 'deleteHiddenOffersRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/hidden-offers/delete`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['deleteHiddenOffersRequest'] || {}))

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
   * Информация о скрытых вами товарах
   * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.offerId Идентификатор скрытого предложения. 
   * @param params.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param params.limit Количество значений на одной странице. 
   * @param params.offset Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;. 
   * @param params.page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
   * @param params.pageSize Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
   */
  async getHiddenOffers(params: IGetHiddenOffersParams): Promise<GetHiddenOffersResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getHiddenOffers', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/hidden-offers`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'offer_id': params['offerId'],
        'page_token': params['pageToken'],
        'limit': params['limit'],
        'offset': params['offset'],
        'page': params['page'],
        'pageSize': params['pageSize'],
      })

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

