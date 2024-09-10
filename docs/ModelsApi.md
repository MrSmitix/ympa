# Api.ModelsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getModel**](ModelsApi.md#getModel) | **GET** /models/{modelId} | Информация об одной модели
[**getModelOffers**](ModelsApi.md#getModelOffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
[**getModels**](ModelsApi.md#getModels) | **POST** /models | Информация о нескольких моделях
[**getModelsOffers**](ModelsApi.md#getModelsOffers) | **POST** /models/offers | Список предложений для нескольких моделей
[**searchModels**](ModelsApi.md#searchModels) | **GET** /models | Поиск модели товара



## getModel

> GetModelsResponse getModel(modelId, regionId, opts)

Информация об одной модели

Возвращает информацию о модели товара.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ModelsApi();
let modelId = 789; // Number | Идентификатор модели товара.
let regionId = 789; // Number | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
let opts = {
  'currency': new Api.CurrencyType() // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
};
apiInstance.getModel(modelId, regionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Number**| Идентификатор модели товара. | 
 **regionId** | **Number**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **currency** | [**CurrencyType**](.md)| Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] 

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getModelOffers

> GetModelsOffersResponse getModelOffers(modelId, regionId, opts)

Список предложений для одной модели

Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ModelsApi();
let modelId = 789; // Number | Идентификатор модели товара.
let regionId = 789; // Number | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
let opts = {
  'currency': new Api.CurrencyType(), // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  'orderByPrice': new Api.SortOrderType(), // SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. 
  'count': 10, // Number | Количество предложений на странице ответа.
  'page': 1 // Number | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
};
apiInstance.getModelOffers(modelId, regionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Number**| Идентификатор модели товара. | 
 **regionId** | **Number**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **currency** | [**CurrencyType**](.md)| Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] 
 **orderByPrice** | [**SortOrderType**](.md)| Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | [optional] 
 **count** | **Number**| Количество предложений на странице ответа. | [optional] [default to 10]
 **page** | **Number**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getModels

> GetModelsResponse getModels(regionId, getModelsRequest, opts)

Информация о нескольких моделях

Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ModelsApi();
let regionId = 789; // Number | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
let getModelsRequest = new Api.GetModelsRequest(); // GetModelsRequest | 
let opts = {
  'currency': new Api.CurrencyType() // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
};
apiInstance.getModels(regionId, getModelsRequest, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **Number**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **getModelsRequest** | [**GetModelsRequest**](GetModelsRequest.md)|  | 
 **currency** | [**CurrencyType**](.md)| Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] 

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getModelsOffers

> GetModelsOffersResponse getModelsOffers(regionId, getModelsRequest, opts)

Список предложений для нескольких моделей

Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ModelsApi();
let regionId = 789; // Number | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
let getModelsRequest = new Api.GetModelsRequest(); // GetModelsRequest | 
let opts = {
  'currency': new Api.CurrencyType(), // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  'orderByPrice': new Api.SortOrderType() // SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. 
};
apiInstance.getModelsOffers(regionId, getModelsRequest, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **Number**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **getModelsRequest** | [**GetModelsRequest**](GetModelsRequest.md)|  | 
 **currency** | [**CurrencyType**](.md)| Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] 
 **orderByPrice** | [**SortOrderType**](.md)| Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | [optional] 

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## searchModels

> SearchModelsResponse searchModels(query, regionId, opts)

Поиск модели товара

Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ModelsApi();
let query = "query_example"; // String | Поисковый запрос по названию модели товара.
let regionId = 789; // Number | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
let opts = {
  'currency': new Api.CurrencyType(), // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  'page': 1, // Number | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  'pageSize': 56 // Number | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
};
apiInstance.searchModels(query, regionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Поисковый запрос по названию модели товара. | 
 **regionId** | **Number**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **currency** | [**CurrencyType**](.md)| Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] 
 **page** | **Number**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
 **pageSize** | **Number**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 

### Return type

[**SearchModelsResponse**](SearchModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

