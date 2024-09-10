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
  GetQualityRatingRequest,
  GetQualityRatingResponse,
  GetQualityRatingDetailsResponse,
} from './models';

/**
 * getQualityRatingDetails - parameters interface
 */
export interface IGetQualityRatingDetailsParams {
  campaignId: number;
}

/**
 * getQualityRatings - parameters interface
 */
export interface IGetQualityRatingsParams {
  businessId: number;
  getQualityRatingRequest: GetQualityRatingRequest;
}

/**
 * RatingsApi - API class
 */
@autoinject()
export class RatingsApi extends Api {

  /**
   * Creates a new RatingsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Заказы, которые повлияли на индекс качества
   * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   */
  async getQualityRatingDetails(params: IGetQualityRatingDetailsParams): Promise<GetQualityRatingDetailsResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getQualityRatingDetails', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/ratings/quality/details`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()

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
   * Индекс качества магазинов
   * Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
   * @param params.businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.getQualityRatingRequest 
   */
  async getQualityRatings(params: IGetQualityRatingsParams): Promise<GetQualityRatingResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getQualityRatings', params, 'businessId');
    this.ensureParamIsSet('getQualityRatings', params, 'getQualityRatingRequest');

    // Create URL to call
    const url = `${this.basePath}/businesses/{businessId}/ratings/quality`
      .replace(`{${'businessId'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['getQualityRatingRequest'] || {}))

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

