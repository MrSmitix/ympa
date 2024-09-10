# OpenAPI\Server\Api\ReturnsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReturn**](ReturnsApiInterface.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**getReturnApplication**](ReturnsApiInterface.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**getReturnPhoto**](ReturnsApiInterface.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**getReturns**](ReturnsApiInterface.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**setReturnDecision**](ReturnsApiInterface.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
[**submitReturnDecision**](ReturnsApiInterface.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ReturnsApi:
        tags:
            - { name: "open_api_server.api", api: "returns" }
    # ...
```

## **getReturn**
> OpenAPI\Server\Model\GetReturnResponse getReturn($campaignId, $orderId, $returnId)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReturnsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReturnsApiInterface;

class ReturnsApi implements ReturnsApiInterface
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
     * Implementation of ReturnsApiInterface#getReturn
     */
    public function getReturn(int $campaignId, int $orderId, int $returnId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderId** | **int**| Идентификатор заказа. |
 **returnId** | **int**| Идентификатор возврата. |

### Return type

[**OpenAPI\Server\Model\GetReturnResponse**](../Model/GetReturnResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getReturnApplication**
> UploadedFile getReturnApplication($campaignId, $orderId, $returnId)

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReturnsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReturnsApiInterface;

class ReturnsApi implements ReturnsApiInterface
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
     * Implementation of ReturnsApiInterface#getReturnApplication
     */
    public function getReturnApplication(int $campaignId, int $orderId, int $returnId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderId** | **int**| Идентификатор заказа. |
 **returnId** | **int**| Идентификатор возврата. |

### Return type

**UploadedFile**

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getReturnPhoto**
> UploadedFile getReturnPhoto($campaignId, $orderId, $returnId, $itemId, $imageHash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReturnsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReturnsApiInterface;

class ReturnsApi implements ReturnsApiInterface
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
     * Implementation of ReturnsApiInterface#getReturnPhoto
     */
    public function getReturnPhoto(int $campaignId, int $orderId, int $returnId, int $itemId, string $imageHash, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderId** | **int**| Идентификатор заказа. |
 **returnId** | **int**| Идентификатор возврата. |
 **itemId** | **int**| Идентификатор товара в возврате. |
 **imageHash** | **string**| Хеш ссылки изображения для загрузки. |

### Return type

**UploadedFile**

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getReturns**
> OpenAPI\Server\Model\GetReturnsResponse getReturns($campaignId, $pageToken, $limit, $orderIds, $statuses, $type, $fromDate, $toDate, $fromDate2, $toDate2)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReturnsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReturnsApiInterface;

class ReturnsApi implements ReturnsApiInterface
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
     * Implementation of ReturnsApiInterface#getReturns
     */
    public function getReturns(int $campaignId, ?string $pageToken, ?int $limit, ?array $orderIds, ?array $statuses, ?$type, ?\DateTime $fromDate, ?\DateTime $toDate, ?\DateTime $fromDate2, ?\DateTime $toDate2, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderIds** | [**int**](../Model/int.md)| Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. | [optional]
 **statuses** | [**OpenAPI\Server\Model\RefundStatusType**](../Model/OpenAPI\Server\Model\RefundStatusType.md)| Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. | [optional]
 **type** | [**ReturnType**](../Model/.md)| Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. | [optional]
 **fromDate** | **\DateTime**| Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. | [optional]
 **toDate** | **\DateTime**| Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. | [optional]
 **fromDate2** | **\DateTime**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. | [optional]
 **toDate2** | **\DateTime**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. | [optional]

### Return type

[**OpenAPI\Server\Model\GetReturnsResponse**](../Model/GetReturnsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **setReturnDecision**
> OpenAPI\Server\Model\EmptyApiResponse setReturnDecision($campaignId, $orderId, $returnId, $setReturnDecisionRequest)

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReturnsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReturnsApiInterface;

class ReturnsApi implements ReturnsApiInterface
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
     * Implementation of ReturnsApiInterface#setReturnDecision
     */
    public function setReturnDecision(int $campaignId, int $orderId, int $returnId, SetReturnDecisionRequest $setReturnDecisionRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderId** | **int**| Идентификатор заказа. |
 **returnId** | **int**| Идентификатор возврата. |
 **setReturnDecisionRequest** | [**OpenAPI\Server\Model\SetReturnDecisionRequest**](../Model/SetReturnDecisionRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **submitReturnDecision**
> OpenAPI\Server\Model\EmptyApiResponse submitReturnDecision($campaignId, $orderId, $returnId)

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReturnsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReturnsApiInterface;

class ReturnsApi implements ReturnsApiInterface
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
     * Implementation of ReturnsApiInterface#submitReturnDecision
     */
    public function submitReturnDecision(int $campaignId, int $orderId, int $returnId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderId** | **int**| Идентификатор заказа. |
 **returnId** | **int**| Идентификатор возврата. |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

