# Api.ReturnsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReturn**](ReturnsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**getReturnApplication**](ReturnsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**getReturnPhoto**](ReturnsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**getReturns**](ReturnsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**setReturnDecision**](ReturnsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
[**submitReturnDecision**](ReturnsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату



## getReturn

> GetReturnResponse getReturn(campaignId, orderId, returnId)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ReturnsApi();
let campaignId = 789; // Number | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let orderId = 789; // Number | Идентификатор заказа.
let returnId = 789; // Number | Идентификатор возврата.
apiInstance.getReturn(campaignId, orderId, returnId, (error, data, response) => {
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
 **campaignId** | **Number**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **orderId** | **Number**| Идентификатор заказа. | 
 **returnId** | **Number**| Идентификатор возврата. | 

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getReturnApplication

> File getReturnApplication(campaignId, orderId, returnId)

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ReturnsApi();
let campaignId = 789; // Number | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let orderId = 789; // Number | Идентификатор заказа.
let returnId = 789; // Number | Идентификатор возврата.
apiInstance.getReturnApplication(campaignId, orderId, returnId, (error, data, response) => {
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
 **campaignId** | **Number**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **orderId** | **Number**| Идентификатор заказа. | 
 **returnId** | **Number**| Идентификатор возврата. | 

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## getReturnPhoto

> File getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ReturnsApi();
let campaignId = 789; // Number | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let orderId = 789; // Number | Идентификатор заказа.
let returnId = 789; // Number | Идентификатор возврата.
let itemId = 789; // Number | Идентификатор товара в возврате.
let imageHash = "imageHash_example"; // String | Хеш ссылки изображения для загрузки.
apiInstance.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash, (error, data, response) => {
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
 **campaignId** | **Number**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **orderId** | **Number**| Идентификатор заказа. | 
 **returnId** | **Number**| Идентификатор возврата. | 
 **itemId** | **Number**| Идентификатор товара в возврате. | 
 **imageHash** | **String**| Хеш ссылки изображения для загрузки. | 

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## getReturns

> GetReturnsResponse getReturns(campaignId, opts)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ReturnsApi();
let campaignId = 789; // Number | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let opts = {
  'pageToken': "eyBuZXh0SWQ6IDIzNDIgfQ==", // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  'limit': 20, // Number | Количество значений на одной странице. 
  'orderIds': [123543], // [Number] | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
  'statuses': [new Api.RefundStatusType()], // [RefundStatusType] | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
  'type': new Api.ReturnType(), // ReturnType | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
  'fromDate': new Date("2022-10-31"), // Date | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  'toDate': new Date("2022-11-30"), // Date | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  'fromDate2': new Date("2022-10-31"), // Date | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
  'toDate2': new Date("2022-11-30") // Date | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
};
apiInstance.getReturns(campaignId, opts, (error, data, response) => {
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
 **campaignId** | **Number**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **Number**| Количество значений на одной странице.  | [optional] 
 **orderIds** | [**[Number]**](Number.md)| Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] 
 **statuses** | [**[RefundStatusType]**](RefundStatusType.md)| Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] 
 **type** | [**ReturnType**](.md)| Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] 
 **fromDate** | **Date**| Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
 **toDate** | **Date**| Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
 **fromDate2** | **Date**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] 
 **toDate2** | **Date**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] 

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## setReturnDecision

> EmptyApiResponse setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ReturnsApi();
let campaignId = 789; // Number | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let orderId = 789; // Number | Идентификатор заказа.
let returnId = 789; // Number | Идентификатор возврата.
let setReturnDecisionRequest = new Api.SetReturnDecisionRequest(); // SetReturnDecisionRequest | 
apiInstance.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest, (error, data, response) => {
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
 **campaignId** | **Number**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **orderId** | **Number**| Идентификатор заказа. | 
 **returnId** | **Number**| Идентификатор возврата. | 
 **setReturnDecisionRequest** | [**SetReturnDecisionRequest**](SetReturnDecisionRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## submitReturnDecision

> EmptyApiResponse submitReturnDecision(campaignId, orderId, returnId)

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example

```javascript
import Api from '_api_';
let defaultClient = Api.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth
let OAuth = defaultClient.authentications['OAuth'];
OAuth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new Api.ReturnsApi();
let campaignId = 789; // Number | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let orderId = 789; // Number | Идентификатор заказа.
let returnId = 789; // Number | Идентификатор возврата.
apiInstance.submitReturnDecision(campaignId, orderId, returnId, (error, data, response) => {
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
 **campaignId** | **Number**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **orderId** | **Number**| Идентификатор заказа. | 
 **returnId** | **Number**| Идентификатор возврата. | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

