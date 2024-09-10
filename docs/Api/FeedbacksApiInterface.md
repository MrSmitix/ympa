# OpenAPI\Server\Api\FeedbacksApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeedbackAndCommentUpdates**](FeedbacksApiInterface.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\FeedbacksApi:
        tags:
            - { name: "open_api_server.api", api: "feedbacks" }
    # ...
```

## **getFeedbackAndCommentUpdates**
> OpenAPI\Server\Model\GetFeedbackListResponse getFeedbackAndCommentUpdates($campaignId, $pageToken, $limit, $fromDate)

Новые и обновленные отзывы о магазине

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FeedbacksApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FeedbacksApiInterface;

class FeedbacksApi implements FeedbacksApiInterface
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
     * Implementation of FeedbacksApiInterface#getFeedbackAndCommentUpdates
     */
    public function getFeedbackAndCommentUpdates(int $campaignId, ?string $pageToken, ?int $limit, ?\DateTime $fromDate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]
 **fromDate** | **\DateTime**| Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. | [optional]

### Return type

[**OpenAPI\Server\Model\GetFeedbackListResponse**](../Model/GetFeedbackListResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

