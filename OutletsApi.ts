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
  CreateOutletResponse,
  GetOutletResponse,
  GetOutletsResponse,
  ChangeOutletRequest,
  EmptyApiResponse,
} from './models';

/**
 * createOutlet - parameters interface
 */
export interface ICreateOutletParams {
  campaignId: number;
  changeOutletRequest: ChangeOutletRequest;
}

/**
 * deleteOutlet - parameters interface
 */
export interface IDeleteOutletParams {
  campaignId: number;
  outletId: number;
}

/**
 * getOutlet - parameters interface
 */
export interface IGetOutletParams {
  campaignId: number;
  outletId: number;
}

/**
 * getOutlets - parameters interface
 */
export interface IGetOutletsParams {
  campaignId: number;
  pageToken?: string;
  regionId?: number;
  shopOutletCode?: string;
  regionId2?: number;
}

/**
 * updateOutlet - parameters interface
 */
export interface IUpdateOutletParams {
  campaignId: number;
  outletId: number;
  changeOutletRequest: ChangeOutletRequest;
}

/**
 * OutletsApi - API class
 */
@autoinject()
export class OutletsApi extends Api {

  /**
   * Creates a new OutletsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Создание точки продаж
   * Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.changeOutletRequest 
   */
  async createOutlet(params: ICreateOutletParams): Promise<CreateOutletResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('createOutlet', params, 'campaignId');
    this.ensureParamIsSet('createOutlet', params, 'changeOutletRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/outlets`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['changeOutletRequest'] || {}))

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
   * Удаление точки продаж
   * Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.outletId Идентификатор точки продаж.
   */
  async deleteOutlet(params: IDeleteOutletParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteOutlet', params, 'campaignId');
    this.ensureParamIsSet('deleteOutlet', params, 'outletId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/outlets/{outletId}`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'outletId'}}`, encodeURIComponent(`${params['outletId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()

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
   * Информация об одной точке продаж
   * Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.outletId Идентификатор точки продаж.
   */
  async getOutlet(params: IGetOutletParams): Promise<GetOutletResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getOutlet', params, 'campaignId');
    this.ensureParamIsSet('getOutlet', params, 'outletId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/outlets/{outletId}`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'outletId'}}`, encodeURIComponent(`${params['outletId']}`));

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
   * Информация о нескольких точках продаж
   * Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param params.regionId Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
   * @param params.shopOutletCode Идентификатор точки продаж, присвоенный магазином.
   * @param params.regionId2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %} 
   */
  async getOutlets(params: IGetOutletsParams): Promise<GetOutletsResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getOutlets', params, 'campaignId');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/outlets`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'page_token': params['pageToken'],
        'region_id': params['regionId'],
        'shop_outlet_code': params['shopOutletCode'],
        'regionId': params['regionId2'],
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
   * Изменение информации о точке продаж
   * Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
   * @param params.campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param params.outletId Идентификатор точки продаж.
   * @param params.changeOutletRequest 
   */
  async updateOutlet(params: IUpdateOutletParams): Promise<EmptyApiResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateOutlet', params, 'campaignId');
    this.ensureParamIsSet('updateOutlet', params, 'outletId');
    this.ensureParamIsSet('updateOutlet', params, 'changeOutletRequest');

    // Create URL to call
    const url = `${this.basePath}/campaigns/{campaignId}/outlets/{outletId}`
      .replace(`{${'campaignId'}}`, encodeURIComponent(`${params['campaignId']}`))
      .replace(`{${'outletId'}}`, encodeURIComponent(`${params['outletId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['changeOutletRequest'] || {}))

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
