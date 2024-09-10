/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.PricesApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 * Version: LATEST
* Generator version: 7.8.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license BSD 3-Clause
 * https://opensource.org/license/bsd-3-clause/
 */

goog.provide('API.Client.PricesApi');

goog.require('API.Client.ApiClientDataErrorResponse');
goog.require('API.Client.ApiForbiddenErrorResponse');
goog.require('API.Client.ApiLimitErrorResponse');
goog.require('API.Client.ApiLockedErrorResponse');
goog.require('API.Client.ApiNotFoundErrorResponse');
goog.require('API.Client.ApiServerErrorResponse');
goog.require('API.Client.ApiUnauthorizedErrorResponse');
goog.require('API.Client.EmptyApiResponse');
goog.require('API.Client.GetPricesByOfferIdsRequest');
goog.require('API.Client.GetPricesByOfferIdsResponse');
goog.require('API.Client.GetPricesResponse');
goog.require('API.Client.SuggestPricesRequest');
goog.require('API.Client.SuggestPricesResponse');
goog.require('API.Client.UpdateBusinessPricesRequest');
goog.require('API.Client.UpdatePricesRequest');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.PricesApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('PricesApiBasePath') ?
                   /** @type {!string} */ ($injector.get('PricesApiBasePath')) :
                   'https://api.partner.market.yandex.ru';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('PricesApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('PricesApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.PricesApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Список цен
 * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 
 * @param {!number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!string=} opt_pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
 * @param {!number=} opt_limit Количество значений на одной странице. 
 * @param {!boolean=} opt_archived Фильтр по нахождению в архиве.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.GetPricesResponse>}
 */
API.Client.PricesApi.prototype.getPrices = function(campaignId, opt_pageToken, opt_limit, opt_archived, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/campaigns/{campaignId}/offer-prices'
      .replace('{' + 'campaignId' + '}', String(campaignId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'campaignId' is set
  if (!campaignId) {
    throw new Error('Missing required parameter campaignId when calling getPrices');
  }
  if (opt_pageToken !== undefined) {
    queryParameters['page_token'] = opt_pageToken;
  }

  if (opt_limit !== undefined) {
    queryParameters['limit'] = opt_limit;
  }

  if (opt_archived !== undefined) {
    queryParameters['archived'] = opt_archived;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Просмотр цен на указанные товары в магазине
 * Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 
 * @param {!number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!string=} opt_pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
 * @param {!number=} opt_limit Количество значений на одной странице. 
 * @param {!GetPricesByOfferIdsRequest=} opt_getPricesByOfferIdsRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.GetPricesByOfferIdsResponse>}
 */
API.Client.PricesApi.prototype.getPricesByOfferIds = function(campaignId, opt_pageToken, opt_limit, opt_getPricesByOfferIdsRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/campaigns/{campaignId}/offer-prices'
      .replace('{' + 'campaignId' + '}', String(campaignId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'campaignId' is set
  if (!campaignId) {
    throw new Error('Missing required parameter campaignId when calling getPricesByOfferIds');
  }
  if (opt_pageToken !== undefined) {
    queryParameters['page_token'] = opt_pageToken;
  }

  if (opt_limit !== undefined) {
    queryParameters['limit'] = opt_limit;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: opt_getPricesByOfferIdsRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Цены для продвижения товаров
 * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
 * @param {!number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!SuggestPricesRequest} suggestPricesRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SuggestPricesResponse>}
 */
API.Client.PricesApi.prototype.getSuggestedPrices = function(campaignId, suggestPricesRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/campaigns/{campaignId}/offer-prices/suggestions'
      .replace('{' + 'campaignId' + '}', String(campaignId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'campaignId' is set
  if (!campaignId) {
    throw new Error('Missing required parameter campaignId when calling getSuggestedPrices');
  }
  // verify required parameter 'suggestPricesRequest' is set
  if (!suggestPricesRequest) {
    throw new Error('Missing required parameter suggestPricesRequest when calling getSuggestedPrices');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: suggestPricesRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Установка цен на товары во всех магазинах
 * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!UpdateBusinessPricesRequest} updateBusinessPricesRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.EmptyApiResponse>}
 */
API.Client.PricesApi.prototype.updateBusinessPrices = function(businessId, updateBusinessPricesRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-prices/updates'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling updateBusinessPrices');
  }
  // verify required parameter 'updateBusinessPricesRequest' is set
  if (!updateBusinessPricesRequest) {
    throw new Error('Missing required parameter updateBusinessPricesRequest when calling updateBusinessPrices');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: updateBusinessPricesRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Установка цен на товары в конкретном магазине
 * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
 * @param {!number} campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!UpdatePricesRequest} updatePricesRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.EmptyApiResponse>}
 */
API.Client.PricesApi.prototype.updatePrices = function(campaignId, updatePricesRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/campaigns/{campaignId}/offer-prices/updates'
      .replace('{' + 'campaignId' + '}', String(campaignId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'campaignId' is set
  if (!campaignId) {
    throw new Error('Missing required parameter campaignId when calling updatePrices');
  }
  // verify required parameter 'updatePricesRequest' is set
  if (!updatePricesRequest) {
    throw new Error('Missing required parameter updatePricesRequest when calling updatePrices');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: updatePricesRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
