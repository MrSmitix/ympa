# OpenAPI\Server\Api\ContentApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryContentParameters**](ContentApiInterface.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**getOfferCardsContentStatus**](ContentApiInterface.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**updateOfferContent**](ContentApiInterface.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ContentApi:
        tags:
            - { name: "open_api_server.api", api: "content" }
    # ...
```

## **getCategoryContentParameters**
> OpenAPI\Server\Model\GetCategoryContentParametersResponse getCategoryContentParameters($categoryId)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContentApiInterface;

class ContentApi implements ContentApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ContentApiInterface#getCategoryContentParameters
     */
    public function getCategoryContentParameters(int $categoryId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **int**| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). |

### Return type

[**OpenAPI\Server\Model\GetCategoryContentParametersResponse**](../Model/GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOfferCardsContentStatus**
> OpenAPI\Server\Model\GetOfferCardsContentStatusResponse getOfferCardsContentStatus($businessId, $pageToken, $limit, $getOfferCardsContentStatusRequest)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContentApiInterface;

class ContentApi implements ContentApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ContentApiInterface#getOfferCardsContentStatus
     */
    public function getOfferCardsContentStatus(int $businessId, ?string $pageToken, ?int $limit, ?GetOfferCardsContentStatusRequest $getOfferCardsContentStatusRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]
 **getOfferCardsContentStatusRequest** | [**OpenAPI\Server\Model\GetOfferCardsContentStatusRequest**](../Model/GetOfferCardsContentStatusRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetOfferCardsContentStatusResponse**](../Model/GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateOfferContent**
> OpenAPI\Server\Model\UpdateOfferContentResponse updateOfferContent($businessId, $updateOfferContentRequest)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ContentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ContentApiInterface;

class ContentApi implements ContentApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ContentApiInterface#updateOfferContent
     */
    public function updateOfferContent(int $businessId, UpdateOfferContentRequest $updateOfferContentRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **updateOfferContentRequest** | [**OpenAPI\Server\Model\UpdateOfferContentRequest**](../Model/UpdateOfferContentRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\UpdateOfferContentResponse**](../Model/UpdateOfferContentResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

