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
  GetPricesByOfferIdsRequest,
  GetPricesResponse,
  SuggestPricesResponse,
  UpdateBusinessPricesRequest,
  UpdatePricesRequest,
  GetPricesByOfferIdsResponse,
  SuggestPricesRequest,
  EmptyApiResponse,
} from './models';

/**
 * getPrices - parameters interface
 */
export interface IGetPricesParams {
  campaignId: number;
  pageToken?: string;
  limit?: number;
  archived?: boolean;
}

/**
 * getPricesByOfferIds - parameters interface
 */
export interface IGetPricesByOfferIdsParams {
  campaignId: number;
  pageToken?: string;
  limit?: number;
  getPricesByOfferIdsRequest?: GetPricesByOfferIdsRequest;
}

/**
 * getSuggestedPrices - parameters interface
 */
export interface IGetSuggestedPricesParams {
  campaignId: number;
  suggestPricesRequest: SuggestPricesRequest;
}

/**
 * updateBusinessPrices - parameters interface
 */
export interface IUpdateBusinessPricesParams {
  businessId: number;
  updateBusinessPricesRequest: UpdateBusinessPricesRequest;
}

/**
 * updatePrices - parameters interface
 */
export interface IUpdatePricesParams {
  campaignId: number;
  updatePricesRequest: UpdatePricesRequest;
}

/**
 * PricesApi - API class
 */
@autoinject()
export class PricesApi extends Api {

  /**
   * Creates a new PricesApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Список цен
   * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param params.limit Количество значений на одной странице. 
   * @param params.archived Фильтр по нахождению в архиве.
   */
  async getPrices(params: IGetPricesParams): Promise<GetPricesResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getPrices', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/offer-prices`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'page_token': params['pageToken'],
        'limit': params['limit'],
        'archived': params['archived'],
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

  /**
   * Просмотр цен на указанные товары в магазине
   * Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param params.limit Количество значений на одной странице. 
   * @param params.getPricesByOfferIdsRequest 
   */
  async getPricesByOfferIds(params: IGetPricesByOfferIdsParams): Promise<GetPricesByOfferIdsResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getPricesByOfferIds', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/offer-prices`
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
      .withContent(JSON.stringify(params['getPricesByOfferIdsRequest'] || {}))

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
   * Цены для продвижения товаров
   * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.suggestPricesRequest 
   */
  async getSuggestedPrices(params: IGetSuggestedPricesParams): Promise<SuggestPricesResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSuggestedPrices', params, 'campaignId');
    this.ensureParamIsSet('getSuggestedPrices', params, 'suggestPricesRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/offer-prices/suggestions`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['suggestPricesRequest'] || {}))

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
   * Установка цен на товары во всех магазинах
   * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * @param params.businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.updateBusinessPricesRequest 
   */
  async updateBusinessPrices(params: IUpdateBusinessPricesParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateBusinessPrices', params, 'businessId');
    this.ensureParamIsSet('updateBusinessPrices', params, 'updateBusinessPricesRequest');

    // Create URL to call
    const url = `${this.basePath}/businesses/{businessId}/offer-prices/updates`
      .replace(`{${'businessId'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['updateBusinessPricesRequest'] || {}))

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
   * Установка цен на товары в конкретном магазине
   * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.updatePricesRequest 
   */
  async updatePrices(params: IUpdatePricesParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('updatePrices', params, 'campaignId');
    this.ensureParamIsSet('updatePrices', params, 'updatePricesRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/offer-prices/updates`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['updatePricesRequest'] || {}))

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

