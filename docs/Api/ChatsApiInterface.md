# OpenAPI\Server\Api\ChatsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChat**](ChatsApiInterface.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**getChatHistory**](ChatsApiInterface.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**getChats**](ChatsApiInterface.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**sendFileToChat**](ChatsApiInterface.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**sendMessageToChat**](ChatsApiInterface.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ChatsApi:
        tags:
            - { name: "open_api_server.api", api: "chats" }
    # ...
```

## **createChat**
> OpenAPI\Server\Model\CreateChatResponse createChat($businessId, $createChatRequest)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ChatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ChatsApiInterface;

class ChatsApi implements ChatsApiInterface
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
     * Implementation of ChatsApiInterface#createChat
     */
    public function createChat(int $businessId, CreateChatRequest $createChatRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **createChatRequest** | [**OpenAPI\Server\Model\CreateChatRequest**](../Model/CreateChatRequest.md)| description |

### Return type

[**OpenAPI\Server\Model\CreateChatResponse**](../Model/CreateChatResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getChatHistory**
> OpenAPI\Server\Model\GetChatHistoryResponse getChatHistory($businessId, $chatId, $getChatHistoryRequest, $pageToken, $limit)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ChatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ChatsApiInterface;

class ChatsApi implements ChatsApiInterface
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
     * Implementation of ChatsApiInterface#getChatHistory
     */
    public function getChatHistory(int $businessId, int $chatId, GetChatHistoryRequest $getChatHistoryRequest, ?string $pageToken, ?int $limit, int &$responseCode, array &$responseHeaders): array|object|null
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
 **chatId** | **int**| Идентификатор чата. |
 **getChatHistoryRequest** | [**OpenAPI\Server\Model\GetChatHistoryRequest**](../Model/GetChatHistoryRequest.md)| description |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]

### Return type

[**OpenAPI\Server\Model\GetChatHistoryResponse**](../Model/GetChatHistoryResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getChats**
> OpenAPI\Server\Model\GetChatsResponse getChats($businessId, $getChatsRequest, $pageToken, $limit)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ChatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ChatsApiInterface;

class ChatsApi implements ChatsApiInterface
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
     * Implementation of ChatsApiInterface#getChats
     */
    public function getChats(int $businessId, GetChatsRequest $getChatsRequest, ?string $pageToken, ?int $limit, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getChatsRequest** | [**OpenAPI\Server\Model\GetChatsRequest**](../Model/GetChatsRequest.md)| description |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]

### Return type

[**OpenAPI\Server\Model\GetChatsResponse**](../Model/GetChatsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **sendFileToChat**
> OpenAPI\Server\Model\EmptyApiResponse sendFileToChat($businessId, $chatId, $file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ChatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ChatsApiInterface;

class ChatsApi implements ChatsApiInterface
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
     * Implementation of ChatsApiInterface#sendFileToChat
     */
    public function sendFileToChat(int $businessId, int $chatId, UploadedFile $file, int &$responseCode, array &$responseHeaders): array|object|null
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
 **chatId** | **int**| Идентификатор чата. |
 **file** | **UploadedFile****UploadedFile**| Содержимое файла. Максимальный размер файла — 5 Мбайт. |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **sendMessageToChat**
> OpenAPI\Server\Model\EmptyApiResponse sendMessageToChat($businessId, $chatId, $sendMessageToChatRequest)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ChatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ChatsApiInterface;

class ChatsApi implements ChatsApiInterface
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
     * Implementation of ChatsApiInterface#sendMessageToChat
     */
    public function sendMessageToChat(int $businessId, int $chatId, SendMessageToChatRequest $sendMessageToChatRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **chatId** | **int**| Идентификатор чата. |
 **sendMessageToChatRequest** | [**OpenAPI\Server\Model\SendMessageToChatRequest**](../Model/SendMessageToChatRequest.md)| description |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

