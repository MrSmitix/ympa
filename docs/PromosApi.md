# ympa_python_pydantic_v1_client.PromosApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_promo_offers**](PromosApi.md#delete_promo_offers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**get_promo_offers**](PromosApi.md#get_promo_offers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**get_promos**](PromosApi.md#get_promos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**update_promo_offers**](PromosApi.md#update_promo_offers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен


# **delete_promo_offers**
> DeletePromoOffersResponse delete_promo_offers(business_id, delete_promo_offers_request)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):
```python
import time
import os
import ympa_python_pydantic_v1_client
from ympa_python_pydantic_v1_client.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_pydantic_v1_client.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_pydantic_v1_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_pydantic_v1_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_pydantic_v1_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_pydantic_v1_client.PromosApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    delete_promo_offers_request = ympa_python_pydantic_v1_client.DeletePromoOffersRequest() # DeletePromoOffersRequest | 

    try:
        # Удаление товаров из акции
        api_response = api_instance.delete_promo_offers(business_id, delete_promo_offers_request)
        print("The response of PromosApi->delete_promo_offers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PromosApi->delete_promo_offers: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **delete_promo_offers_request** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md)|  | 

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Результат удаления товаров из акции. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_promo_offers**
> GetPromoOffersResponse get_promo_offers(business_id, get_promo_offers_request, page_token=page_token, limit=limit)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):
```python
import time
import os
import ympa_python_pydantic_v1_client
from ympa_python_pydantic_v1_client.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_pydantic_v1_client.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_pydantic_v1_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_pydantic_v1_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_pydantic_v1_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_pydantic_v1_client.PromosApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    get_promo_offers_request = ympa_python_pydantic_v1_client.GetPromoOffersRequest() # GetPromoOffersRequest | 
    page_token = 'eyBuZXh0SWQ6IDIzNDIgfQ==' # str | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
    limit = 20 # int | Количество значений на одной странице.  (optional)

    try:
        # Получение списка товаров, которые участвуют или могут участвовать в акции
        api_response = api_instance.get_promo_offers(business_id, get_promo_offers_request, page_token=page_token, limit=limit)
        print("The response of PromosApi->get_promo_offers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PromosApi->get_promo_offers: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_promo_offers_request** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md)|  | 
 **page_token** | **str**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список товаров, которые участвуют или могут участвовать в акции. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_promos**
> GetPromosResponse get_promos(business_id, get_promos_request=get_promos_request)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):
```python
import time
import os
import ympa_python_pydantic_v1_client
from ympa_python_pydantic_v1_client.models.get_promos_request import GetPromosRequest
from ympa_python_pydantic_v1_client.models.get_promos_response import GetPromosResponse
from ympa_python_pydantic_v1_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_pydantic_v1_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_pydantic_v1_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_pydantic_v1_client.PromosApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    get_promos_request = ympa_python_pydantic_v1_client.GetPromosRequest() # GetPromosRequest |  (optional)

    try:
        # Получение списка акций
        api_response = api_instance.get_promos(business_id, get_promos_request=get_promos_request)
        print("The response of PromosApi->get_promos:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PromosApi->get_promos: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_promos_request** | [**GetPromosRequest**](GetPromosRequest.md)|  | [optional] 

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список акций Маркета. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_promo_offers**
> UpdatePromoOffersResponse update_promo_offers(business_id, update_promo_offers_request)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):
```python
import time
import os
import ympa_python_pydantic_v1_client
from ympa_python_pydantic_v1_client.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_pydantic_v1_client.models.update_promo_offers_response import UpdatePromoOffersResponse
from ympa_python_pydantic_v1_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_pydantic_v1_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_pydantic_v1_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_pydantic_v1_client.PromosApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    update_promo_offers_request = ympa_python_pydantic_v1_client.UpdatePromoOffersRequest() # UpdatePromoOffersRequest | 

    try:
        # Добавление товаров в акцию или изменение их цен
        api_response = api_instance.update_promo_offers(business_id, update_promo_offers_request)
        print("The response of PromosApi->update_promo_offers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PromosApi->update_promo_offers: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_promo_offers_request** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md)|  | 

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Результат добавления товаров в акцию или обновления их цен. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

