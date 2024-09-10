# OpenAPI\Server\Api\GoodsFeedbackApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGoodsFeedbackComment**](GoodsFeedbackApiInterface.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**getGoodsFeedbackComments**](GoodsFeedbackApiInterface.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**getGoodsFeedbacks**](GoodsFeedbackApiInterface.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**skipGoodsFeedbacksReaction**](GoodsFeedbackApiInterface.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**updateGoodsFeedbackComment**](GoodsFeedbackApiInterface.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\GoodsFeedbackApi:
        tags:
            - { name: "open_api_server.api", api: "goodsFeedback" }
    # ...
```

## **deleteGoodsFeedbackComment**
> OpenAPI\Server\Model\EmptyApiResponse deleteGoodsFeedbackComment($businessId, $deleteGoodsFeedbackCommentRequest)

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GoodsFeedbackApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GoodsFeedbackApiInterface;

class GoodsFeedbackApi implements GoodsFeedbackApiInterface
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
     * Implementation of GoodsFeedbackApiInterface#deleteGoodsFeedbackComment
     */
    public function deleteGoodsFeedbackComment(int $businessId, DeleteGoodsFeedbackCommentRequest $deleteGoodsFeedbackCommentRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **deleteGoodsFeedbackCommentRequest** | [**OpenAPI\Server\Model\DeleteGoodsFeedbackCommentRequest**](../Model/DeleteGoodsFeedbackCommentRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getGoodsFeedbackComments**
> OpenAPI\Server\Model\GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments($businessId, $getGoodsFeedbackCommentsRequest, $pageToken, $limit)

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GoodsFeedbackApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GoodsFeedbackApiInterface;

class GoodsFeedbackApi implements GoodsFeedbackApiInterface
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
     * Implementation of GoodsFeedbackApiInterface#getGoodsFeedbackComments
     */
    public function getGoodsFeedbackComments(int $businessId, GetGoodsFeedbackCommentsRequest $getGoodsFeedbackCommentsRequest, ?string $pageToken, ?int $limit, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getGoodsFeedbackCommentsRequest** | [**OpenAPI\Server\Model\GetGoodsFeedbackCommentsRequest**](../Model/GetGoodsFeedbackCommentsRequest.md)|  |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]

### Return type

[**OpenAPI\Server\Model\GetGoodsFeedbackCommentsResponse**](../Model/GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getGoodsFeedbacks**
> OpenAPI\Server\Model\GetGoodsFeedbackResponse getGoodsFeedbacks($businessId, $pageToken, $limit, $getGoodsFeedbackRequest)

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GoodsFeedbackApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GoodsFeedbackApiInterface;

class GoodsFeedbackApi implements GoodsFeedbackApiInterface
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
     * Implementation of GoodsFeedbackApiInterface#getGoodsFeedbacks
     */
    public function getGoodsFeedbacks(int $businessId, ?string $pageToken, ?int $limit, ?GetGoodsFeedbackRequest $getGoodsFeedbackRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getGoodsFeedbackRequest** | [**OpenAPI\Server\Model\GetGoodsFeedbackRequest**](../Model/GetGoodsFeedbackRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetGoodsFeedbackResponse**](../Model/GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **skipGoodsFeedbacksReaction**
> OpenAPI\Server\Model\EmptyApiResponse skipGoodsFeedbacksReaction($businessId, $skipGoodsFeedbackReactionRequest)

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GoodsFeedbackApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GoodsFeedbackApiInterface;

class GoodsFeedbackApi implements GoodsFeedbackApiInterface
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
     * Implementation of GoodsFeedbackApiInterface#skipGoodsFeedbacksReaction
     */
    public function skipGoodsFeedbacksReaction(int $businessId, SkipGoodsFeedbackReactionRequest $skipGoodsFeedbackReactionRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **skipGoodsFeedbackReactionRequest** | [**OpenAPI\Server\Model\SkipGoodsFeedbackReactionRequest**](../Model/SkipGoodsFeedbackReactionRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateGoodsFeedbackComment**
> OpenAPI\Server\Model\UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment($businessId, $updateGoodsFeedbackCommentRequest)

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GoodsFeedbackApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GoodsFeedbackApiInterface;

class GoodsFeedbackApi implements GoodsFeedbackApiInterface
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
     * Implementation of GoodsFeedbackApiInterface#updateGoodsFeedbackComment
     */
    public function updateGoodsFeedbackComment(int $businessId, UpdateGoodsFeedbackCommentRequest $updateGoodsFeedbackCommentRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateGoodsFeedbackCommentRequest** | [**OpenAPI\Server\Model\UpdateGoodsFeedbackCommentRequest**](../Model/UpdateGoodsFeedbackCommentRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\UpdateGoodsFeedbackCommentResponse**](../Model/UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

