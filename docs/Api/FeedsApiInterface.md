# OpenAPI\Server\Api\FeedsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeed**](FeedsApiInterface.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
[**getFeedIndexLogs**](FeedsApiInterface.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
[**getFeeds**](FeedsApiInterface.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
[**refreshFeed**](FeedsApiInterface.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
[**setFeedParams**](FeedsApiInterface.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\FeedsApi:
        tags:
            - { name: "open_api_server.api", api: "feeds" }
    # ...
```

## **getFeed**
> OpenAPI\Server\Model\GetFeedResponse getFeed($campaignId, $feedId)

Информация о прайс-листе

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FeedsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FeedsApiInterface;

class FeedsApi implements FeedsApiInterface
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
     * Implementation of FeedsApiInterface#getFeed
     */
    public function getFeed(int $campaignId, int $feedId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **feedId** | **int**| Идентификатор прайс-листа. |

### Return type

[**OpenAPI\Server\Model\GetFeedResponse**](../Model/GetFeedResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFeedIndexLogs**
> OpenAPI\Server\Model\GetFeedIndexLogsResponse getFeedIndexLogs($campaignId, $feedId, $limit, $publishedTimeFrom, $publishedTimeTo, $status)

Отчет по индексации прайс-листа

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FeedsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FeedsApiInterface;

class FeedsApi implements FeedsApiInterface
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
     * Implementation of FeedsApiInterface#getFeedIndexLogs
     */
    public function getFeedIndexLogs(int $campaignId, int $feedId, ?int $limit, ?\DateTime $publishedTimeFrom, ?\DateTime $publishedTimeTo, ?$status, int &$responseCode, array &$responseHeaders): array|object|null
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
 **feedId** | **int**| Идентификатор прайс-листа. |
 **limit** | **int**| Количество значений на одной странице. | [optional]
 **publishedTimeFrom** | **\DateTime**| Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. | [optional]
 **publishedTimeTo** | **\DateTime**| Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} | [optional]
 **status** | [**FeedIndexLogsStatusType**](../Model/.md)| Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. | [optional]

### Return type

[**OpenAPI\Server\Model\GetFeedIndexLogsResponse**](../Model/GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFeeds**
> OpenAPI\Server\Model\GetFeedsResponse getFeeds($campaignId)

Список прайс-листов магазина

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FeedsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FeedsApiInterface;

class FeedsApi implements FeedsApiInterface
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
     * Implementation of FeedsApiInterface#getFeeds
     */
    public function getFeeds(int $campaignId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetFeedsResponse**](../Model/GetFeedsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **refreshFeed**
> OpenAPI\Server\Model\EmptyApiResponse refreshFeed($campaignId, $feedId)

Сообщить, что прайс-лист обновился

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FeedsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FeedsApiInterface;

class FeedsApi implements FeedsApiInterface
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
     * Implementation of FeedsApiInterface#refreshFeed
     */
    public function refreshFeed(int $campaignId, int $feedId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **feedId** | **int**| Идентификатор прайс-листа. |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **setFeedParams**
> OpenAPI\Server\Model\EmptyApiResponse setFeedParams($campaignId, $feedId, $setFeedParamsRequest)

Изменение параметров прайс-листа

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FeedsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FeedsApiInterface;

class FeedsApi implements FeedsApiInterface
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
     * Implementation of FeedsApiInterface#setFeedParams
     */
    public function setFeedParams(int $campaignId, int $feedId, SetFeedParamsRequest $setFeedParamsRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **feedId** | **int**| Идентификатор прайс-листа. |
 **setFeedParamsRequest** | [**OpenAPI\Server\Model\SetFeedParamsRequest**](../Model/SetFeedParamsRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

