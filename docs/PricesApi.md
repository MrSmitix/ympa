# ympa_python_client.PricesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_prices**](PricesApi.md#get_prices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
[**get_prices_by_offer_ids**](PricesApi.md#get_prices_by_offer_ids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
[**get_suggested_prices**](PricesApi.md#get_suggested_prices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
[**update_business_prices**](PricesApi.md#update_business_prices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
[**update_prices**](PricesApi.md#update_prices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине


# **get_prices**
> GetPricesResponse get_prices(campaign_id, page_token=page_token, limit=limit, archived=archived)

Список цен

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_prices_response import GetPricesResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.PricesApi(api_client)
    campaign_id = 56 # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    page_token = 'eyBuZXh0SWQ6IDIzNDIgfQ==' # str | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
    limit = 20 # int | Количество значений на одной странице.  (optional)
    archived = False # bool | Фильтр по нахождению в архиве. (optional) (default to False)

    try:
        # Список цен
        api_response = api_instance.get_prices(campaign_id, page_token=page_token, limit=limit, archived=archived)
        print("The response of PricesApi->get_prices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PricesApi->get_prices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **str**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 
 **archived** | **bool**| Фильтр по нахождению в архиве. | [optional] [default to False]

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список всех товаров с установленными ценами. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prices_by_offer_ids**
> GetPricesByOfferIdsResponse get_prices_by_offer_ids(campaign_id, page_token=page_token, limit=limit, get_prices_by_offer_ids_request=get_prices_by_offer_ids_request)

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest
from ympa_python_client.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.PricesApi(api_client)
    campaign_id = 56 # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    page_token = 'eyBuZXh0SWQ6IDIzNDIgfQ==' # str | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
    limit = 20 # int | Количество значений на одной странице.  (optional)
    get_prices_by_offer_ids_request = ympa_python_client.GetPricesByOfferIdsRequest() # GetPricesByOfferIdsRequest |  (optional)

    try:
        # Просмотр цен на указанные товары в магазине
        api_response = api_instance.get_prices_by_offer_ids(campaign_id, page_token=page_token, limit=limit, get_prices_by_offer_ids_request=get_prices_by_offer_ids_request)
        print("The response of PricesApi->get_prices_by_offer_ids:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PricesApi->get_prices_by_offer_ids: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **str**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 
 **get_prices_by_offer_ids_request** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md)|  | [optional] 

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список товаров с установленными для заданного магазина ценами. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_suggested_prices**
> SuggestPricesResponse get_suggested_prices(campaign_id, suggest_prices_request)

Цены для продвижения товаров

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.suggest_prices_request import SuggestPricesRequest
from ympa_python_client.models.suggest_prices_response import SuggestPricesResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.PricesApi(api_client)
    campaign_id = 56 # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    suggest_prices_request = ympa_python_client.SuggestPricesRequest() # SuggestPricesRequest | 

    try:
        # Цены для продвижения товаров
        api_response = api_instance.get_suggested_prices(campaign_id, suggest_prices_request)
        print("The response of PricesApi->get_suggested_prices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PricesApi->get_suggested_prices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **suggest_prices_request** | [**SuggestPricesRequest**](SuggestPricesRequest.md)|  | 

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список цен для продвижения на Маркете. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_prices**
> EmptyApiResponse update_business_prices(business_id, update_business_prices_request)

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.empty_api_response import EmptyApiResponse
from ympa_python_client.models.update_business_prices_request import UpdateBusinessPricesRequest
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.PricesApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    update_business_prices_request = ympa_python_client.UpdateBusinessPricesRequest() # UpdateBusinessPricesRequest | 

    try:
        # Установка цен на товары во всех магазинах
        api_response = api_instance.update_business_prices(business_id, update_business_prices_request)
        print("The response of PricesApi->update_business_prices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PricesApi->update_business_prices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_business_prices_request** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Маркет принял информацию о новых ценах. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**423** | К ресурсу нельзя применить указанный метод. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_prices**
> EmptyApiResponse update_prices(campaign_id, update_prices_request)

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.empty_api_response import EmptyApiResponse
from ympa_python_client.models.update_prices_request import UpdatePricesRequest
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.PricesApi(api_client)
    campaign_id = 56 # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    update_prices_request = ympa_python_client.UpdatePricesRequest() # UpdatePricesRequest | 

    try:
        # Установка цен на товары в конкретном магазине
        api_response = api_instance.update_prices(campaign_id, update_prices_request)
        print("The response of PricesApi->update_prices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PricesApi->update_prices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_prices_request** | [**UpdatePricesRequest**](UpdatePricesRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Маркет принял информацию о новых ценах. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**423** | К ресурсу нельзя применить указанный метод. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

