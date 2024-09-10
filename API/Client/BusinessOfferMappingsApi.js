/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.BusinessOfferMappingsApi.
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

goog.provide('API.Client.BusinessOfferMappingsApi');

goog.require('API.Client.AddOffersToArchiveRequest');
goog.require('API.Client.AddOffersToArchiveResponse');
goog.require('API.Client.ApiClientDataErrorResponse');
goog.require('API.Client.ApiForbiddenErrorResponse');
goog.require('API.Client.ApiLimitErrorResponse');
goog.require('API.Client.ApiLockedErrorResponse');
goog.require('API.Client.ApiNotFoundErrorResponse');
goog.require('API.Client.ApiServerErrorResponse');
goog.require('API.Client.ApiUnauthorizedErrorResponse');
goog.require('API.Client.DeleteOffersFromArchiveRequest');
goog.require('API.Client.DeleteOffersFromArchiveResponse');
goog.require('API.Client.DeleteOffersRequest');
goog.require('API.Client.DeleteOffersResponse');
goog.require('API.Client.GetOfferMappingsRequest');
goog.require('API.Client.GetOfferMappingsResponse');
goog.require('API.Client.GetSuggestedOfferMappingsRequest');
goog.require('API.Client.GetSuggestedOfferMappingsResponse');
goog.require('API.Client.UpdateOfferMappingsRequest');
goog.require('API.Client.UpdateOfferMappingsResponse');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.BusinessOfferMappingsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('BusinessOfferMappingsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('BusinessOfferMappingsApiBasePath')) :
                   'https://api.partner.market.yandex.ru';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('BusinessOfferMappingsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('BusinessOfferMappingsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.BusinessOfferMappingsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Добавление товаров в архив
 * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!AddOffersToArchiveRequest} addOffersToArchiveRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.AddOffersToArchiveResponse>}
 */
API.Client.BusinessOfferMappingsApi.prototype.addOffersToArchive = function(businessId, addOffersToArchiveRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-mappings/archive'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling addOffersToArchive');
  }
  // verify required parameter 'addOffersToArchiveRequest' is set
  if (!addOffersToArchiveRequest) {
    throw new Error('Missing required parameter addOffersToArchiveRequest when calling addOffersToArchive');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: addOffersToArchiveRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Удаление товаров из каталога
 * Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!DeleteOffersRequest} deleteOffersRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DeleteOffersResponse>}
 */
API.Client.BusinessOfferMappingsApi.prototype.deleteOffers = function(businessId, deleteOffersRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-mappings/delete'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling deleteOffers');
  }
  // verify required parameter 'deleteOffersRequest' is set
  if (!deleteOffersRequest) {
    throw new Error('Missing required parameter deleteOffersRequest when calling deleteOffers');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: deleteOffersRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Удаление товаров из архива
 * Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!DeleteOffersFromArchiveRequest} deleteOffersFromArchiveRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DeleteOffersFromArchiveResponse>}
 */
API.Client.BusinessOfferMappingsApi.prototype.deleteOffersFromArchive = function(businessId, deleteOffersFromArchiveRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-mappings/unarchive'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling deleteOffersFromArchive');
  }
  // verify required parameter 'deleteOffersFromArchiveRequest' is set
  if (!deleteOffersFromArchiveRequest) {
    throw new Error('Missing required parameter deleteOffersFromArchiveRequest when calling deleteOffersFromArchive');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: deleteOffersFromArchiveRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Информация о товарах в каталоге
 * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!string=} opt_pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
 * @param {!number=} opt_limit Количество значений на одной странице. 
 * @param {!GetOfferMappingsRequest=} opt_getOfferMappingsRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.GetOfferMappingsResponse>}
 */
API.Client.BusinessOfferMappingsApi.prototype.getOfferMappings = function(businessId, opt_pageToken, opt_limit, opt_getOfferMappingsRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-mappings'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling getOfferMappings');
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
    data: opt_getOfferMappingsRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Просмотр карточек на Маркете, которые подходят вашим товарам
 * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!GetSuggestedOfferMappingsRequest=} opt_getSuggestedOfferMappingsRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.GetSuggestedOfferMappingsResponse>}
 */
API.Client.BusinessOfferMappingsApi.prototype.getSuggestedOfferMappings = function(businessId, opt_getSuggestedOfferMappingsRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-mappings/suggestions'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling getSuggestedOfferMappings');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: opt_getSuggestedOfferMappingsRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Добавление товаров в каталог и изменение информации о них
 * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
 * @param {!number} businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
 * @param {!UpdateOfferMappingsRequest} updateOfferMappingsRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.UpdateOfferMappingsResponse>}
 */
API.Client.BusinessOfferMappingsApi.prototype.updateOfferMappings = function(businessId, updateOfferMappingsRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/businesses/{businessId}/offer-mappings/update'
      .replace('{' + 'businessId' + '}', String(businessId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'businessId' is set
  if (!businessId) {
    throw new Error('Missing required parameter businessId when calling updateOfferMappings');
  }
  // verify required parameter 'updateOfferMappingsRequest' is set
  if (!updateOfferMappingsRequest) {
    throw new Error('Missing required parameter updateOfferMappingsRequest when calling updateOfferMappings');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: updateOfferMappingsRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
