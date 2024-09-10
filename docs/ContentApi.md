# ympa_python_client.ContentApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_category_content_parameters**](ContentApi.md#get_category_content_parameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**get_offer_cards_content_status**](ContentApi.md#get_offer_cards_content_status) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**update_offer_content**](ContentApi.md#update_offer_content) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара


# **get_category_content_parameters**
> GetCategoryContentParametersResponse get_category_content_parameters(category_id)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_category_content_parameters_response import GetCategoryContentParametersResponse
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
    api_instance = ympa_python_client.ContentApi(api_client)
    category_id = 56 # int | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 

    try:
        # Списки характеристик товаров по категориям
        api_response = api_instance.get_category_content_parameters(category_id)
        print("The response of ContentApi->get_category_content_parameters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContentApi->get_category_content_parameters: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **int**| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список характеристик товаров из заданной категории. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_offer_cards_content_status**
> GetOfferCardsContentStatusResponse get_offer_cards_content_status(business_id, page_token=page_token, limit=limit, get_offer_cards_content_status_request=get_offer_cards_content_status_request)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest
from ympa_python_client.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse
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
    api_instance = ympa_python_client.ContentApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    page_token = 'eyBuZXh0SWQ6IDIzNDIgfQ==' # str | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
    limit = 20 # int | Количество значений на одной странице.  (optional)
    get_offer_cards_content_status_request = ympa_python_client.GetOfferCardsContentStatusRequest() # GetOfferCardsContentStatusRequest |  (optional)

    try:
        # Получение информации о заполненности карточек магазина
        api_response = api_instance.get_offer_cards_content_status(business_id, page_token=page_token, limit=limit, get_offer_cards_content_status_request=get_offer_cards_content_status_request)
        print("The response of ContentApi->get_offer_cards_content_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContentApi->get_offer_cards_content_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **str**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 
 **get_offer_cards_content_status_request** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md)|  | [optional] 

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Информация о карточках указанных товаров. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_offer_content**
> UpdateOfferContentResponse update_offer_content(business_id, update_offer_content_request)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.update_offer_content_request import UpdateOfferContentRequest
from ympa_python_client.models.update_offer_content_response import UpdateOfferContentResponse
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
    api_instance = ympa_python_client.ContentApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    update_offer_content_request = ympa_python_client.UpdateOfferContentRequest() # UpdateOfferContentRequest | 

    try:
        # Редактирование категорийных характеристик товара
        api_response = api_instance.update_offer_content(business_id, update_offer_content_request)
        print("The response of ContentApi->update_offer_content:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContentApi->update_offer_content: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_offer_content_request** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md)|  | 

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;.  |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**423** | К ресурсу нельзя применить указанный метод. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

