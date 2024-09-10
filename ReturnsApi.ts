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
  GetReturnResponse,
  SetReturnDecisionRequest,
  ReturnType,
  GetReturnsResponse,
  EmptyApiResponse,
} from './models';

/**
 * getReturn - parameters interface
 */
export interface IGetReturnParams {
  campaignId: number;
  orderId: number;
  returnId: number;
}

/**
 * getReturnApplication - parameters interface
 */
export interface IGetReturnApplicationParams {
  campaignId: number;
  orderId: number;
  returnId: number;
}

/**
 * getReturnPhoto - parameters interface
 */
export interface IGetReturnPhotoParams {
  campaignId: number;
  orderId: number;
  returnId: number;
  itemId: number;
  imageHash: string;
}

/**
 * getReturns - parameters interface
 */
export interface IGetReturnsParams {
  campaignId: number;
  pageToken?: string;
  limit?: number;
  orderIds?: Array<number>;
  statuses?: Array<RefundStatusType>;
  type?: ReturnType;
  fromDate?: string;
  toDate?: string;
  fromDate2?: string;
  toDate2?: string;
}

/**
 * setReturnDecision - parameters interface
 */
export interface ISetReturnDecisionParams {
  campaignId: number;
  orderId: number;
  returnId: number;
  setReturnDecisionRequest: SetReturnDecisionRequest;
}

/**
 * submitReturnDecision - parameters interface
 */
export interface ISubmitReturnDecisionParams {
  campaignId: number;
  orderId: number;
  returnId: number;
}

/**
 * ReturnsApi - API class
 */
@autoinject()
export class ReturnsApi extends Api {

  /**
   * Creates a new ReturnsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Информация о невыкупе или возврате
   * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.orderId Идентификатор заказа.
   * @param params.returnId Идентификатор возврата.
   */
  async getReturn(params: IGetReturnParams): Promise<GetReturnResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getReturn', params, 'campaignId');
    this.ensureParamIsSet('getReturn', params, 'orderId');
    this.ensureParamIsSet('getReturn', params, 'returnId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'orderId'}}`, encodeURIComponent(`${params['orderId']}`))
      .replace(`{${'returnId'}}`, encodeURIComponent(`${params['returnId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

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
   * Получение заявления на возврат
   * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.orderId Идентификатор заказа.
   * @param params.returnId Идентификатор возврата.
   */
  async getReturnApplication(params: IGetReturnApplicationParams): Promise<File> {
    // Verify required parameters are set
    this.ensureParamIsSet('getReturnApplication', params, 'campaignId');
    this.ensureParamIsSet('getReturnApplication', params, 'orderId');
    this.ensureParamIsSet('getReturnApplication', params, 'returnId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'orderId'}}`, encodeURIComponent(`${params['orderId']}`))
      .replace(`{${'returnId'}}`, encodeURIComponent(`${params['returnId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

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
   * Получение фотографии возврата
   * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.orderId Идентификатор заказа.
   * @param params.returnId Идентификатор возврата.
   * @param params.itemId Идентификатор товара в возврате.
   * @param params.imageHash Хеш ссылки изображения для загрузки.
   */
  async getReturnPhoto(params: IGetReturnPhotoParams): Promise<File> {
    // Verify required parameters are set
    this.ensureParamIsSet('getReturnPhoto', params, 'campaignId');
    this.ensureParamIsSet('getReturnPhoto', params, 'orderId');
    this.ensureParamIsSet('getReturnPhoto', params, 'returnId');
    this.ensureParamIsSet('getReturnPhoto', params, 'itemId');
    this.ensureParamIsSet('getReturnPhoto', params, 'imageHash');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'orderId'}}`, encodeURIComponent(`${params['orderId']}`))
      .replace(`{${'returnId'}}`, encodeURIComponent(`${params['returnId']}`))
      .replace(`{${'itemId'}}`, encodeURIComponent(`${params['itemId']}`))
      .replace(`{${'imageHash'}}`, encodeURIComponent(`${params['imageHash']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

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
   * Список невыкупов и возвратов
   * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param params.limit Количество значений на одной странице. 
   * @param params.orderIds Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
   * @param params.statuses Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
   * @param params.type Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
   * @param params.fromDate Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @param params.toDate Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @param params.fromDate2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
   * @param params.toDate2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
   */
  async getReturns(params: IGetReturnsParams): Promise<GetReturnsResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getReturns', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/returns`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'page_token': params['pageToken'],
        'limit': params['limit'],
        'orderIds': params['orderIds'],
        'statuses': params['statuses'],
        'type': params['type'],
        'fromDate': params['fromDate'],
        'toDate': params['toDate'],
        'from_date': params['fromDate2'],
        'to_date': params['toDate2'],
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
   * Принятие или изменение решения по возврату
   * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.orderId Идентификатор заказа.
   * @param params.returnId Идентификатор возврата.
   * @param params.setReturnDecisionRequest 
   */
  async setReturnDecision(params: ISetReturnDecisionParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('setReturnDecision', params, 'campaignId');
    this.ensureParamIsSet('setReturnDecision', params, 'orderId');
    this.ensureParamIsSet('setReturnDecision', params, 'returnId');
    this.ensureParamIsSet('setReturnDecision', params, 'setReturnDecisionRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'orderId'}}`, encodeURIComponent(`${params['orderId']}`))
      .replace(`{${'returnId'}}`, encodeURIComponent(`${params['returnId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['setReturnDecisionRequest'] || {}))

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
   * Подтверждение решения по возврату
   * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.orderId Идентификатор заказа.
   * @param params.returnId Идентификатор возврата.
   */
  async submitReturnDecision(params: ISubmitReturnDecisionParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('submitReturnDecision', params, 'campaignId');
    this.ensureParamIsSet('submitReturnDecision', params, 'orderId');
    this.ensureParamIsSet('submitReturnDecision', params, 'returnId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'orderId'}}`, encodeURIComponent(`${params['orderId']}`))
      .replace(`{${'returnId'}}`, encodeURIComponent(`${params['returnId']}`));

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

}

