# ympa_python_client.OrderBusinessInformationApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_order_business_buyer_info**](OrderBusinessInformationApi.md#get_order_business_buyer_info) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**get_order_business_documents_info**](OrderBusinessInformationApi.md#get_order_business_documents_info) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах


# **get_order_business_buyer_info**
> GetBusinessBuyerInfoResponse get_order_business_buyer_info(campaign_id, order_id)

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse
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
    api_instance = ympa_python_client.OrderBusinessInformationApi(api_client)
    campaign_id = 56 # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    order_id = 56 # int | Идентификатор заказа.

    try:
        # Информация о покупателе — юридическом лице
        api_response = api_instance.get_order_business_buyer_info(campaign_id, order_id)
        print("The response of OrderBusinessInformationApi->get_order_business_buyer_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrderBusinessInformationApi->get_order_business_buyer_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 

### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Информация о покупателе. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_business_documents_info**
> GetBusinessDocumentsInfoResponse get_order_business_documents_info(campaign_id, order_id)

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse
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
    api_instance = ympa_python_client.OrderBusinessInformationApi(api_client)
    campaign_id = 56 # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    order_id = 56 # int | Идентификатор заказа.

    try:
        # Информация о документах
        api_response = api_instance.get_order_business_documents_info(campaign_id, order_id)
        print("The response of OrderBusinessInformationApi->get_order_business_documents_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrderBusinessInformationApi->get_order_business_documents_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 

### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Информация о документах. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

