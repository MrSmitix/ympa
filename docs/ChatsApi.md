# WWW::OpenAPIClient::ChatsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ChatsApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat**](ChatsApi.md#create_chat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**get_chat_history**](ChatsApi.md#get_chat_history) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**get_chats**](ChatsApi.md#get_chats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**send_file_to_chat**](ChatsApi.md#send_file_to_chat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**send_message_to_chat**](ChatsApi.md#send_message_to_chat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат


# **create_chat**
> CreateChatResponse create_chat(business_id => $business_id, create_chat_request => $create_chat_request)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ChatsApi;
my $api_instance = WWW::OpenAPIClient::ChatsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $create_chat_request = WWW::OpenAPIClient::Object::CreateChatRequest->new(); # CreateChatRequest | description

eval {
    my $result = $api_instance->create_chat(business_id => $business_id, create_chat_request => $create_chat_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ChatsApi->create_chat: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **create_chat_request** | [**CreateChatRequest**](CreateChatRequest.md)| description | 

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chat_history**
> GetChatHistoryResponse get_chat_history(business_id => $business_id, chat_id => $chat_id, get_chat_history_request => $get_chat_history_request, page_token => $page_token, limit => $limit)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ChatsApi;
my $api_instance = WWW::OpenAPIClient::ChatsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $chat_id = 789; # int | Идентификатор чата.
my $get_chat_history_request = WWW::OpenAPIClient::Object::GetChatHistoryRequest->new(); # GetChatHistoryRequest | description
my $page_token = eyBuZXh0SWQ6IDIzNDIgfQ==; # string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
my $limit = 20; # int | Количество значений на одной странице. 

eval {
    my $result = $api_instance->get_chat_history(business_id => $business_id, chat_id => $chat_id, get_chat_history_request => $get_chat_history_request, page_token => $page_token, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ChatsApi->get_chat_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **chat_id** | **int**| Идентификатор чата. | 
 **get_chat_history_request** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md)| description | 
 **page_token** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chats**
> GetChatsResponse get_chats(business_id => $business_id, get_chats_request => $get_chats_request, page_token => $page_token, limit => $limit)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ChatsApi;
my $api_instance = WWW::OpenAPIClient::ChatsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $get_chats_request = WWW::OpenAPIClient::Object::GetChatsRequest->new(); # GetChatsRequest | description
my $page_token = eyBuZXh0SWQ6IDIzNDIgfQ==; # string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
my $limit = 20; # int | Количество значений на одной странице. 

eval {
    my $result = $api_instance->get_chats(business_id => $business_id, get_chats_request => $get_chats_request, page_token => $page_token, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ChatsApi->get_chats: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_chats_request** | [**GetChatsRequest**](GetChatsRequest.md)| description | 
 **page_token** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_file_to_chat**
> EmptyApiResponse send_file_to_chat(business_id => $business_id, chat_id => $chat_id, file => $file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ChatsApi;
my $api_instance = WWW::OpenAPIClient::ChatsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $chat_id = 789; # int | Идентификатор чата.
my $file = "/path/to/file"; # string | Содержимое файла. Максимальный размер файла — 5 Мбайт.

eval {
    my $result = $api_instance->send_file_to_chat(business_id => $business_id, chat_id => $chat_id, file => $file);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ChatsApi->send_file_to_chat: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **chat_id** | **int**| Идентификатор чата. | 
 **file** | **string****string**| Содержимое файла. Максимальный размер файла — 5 Мбайт. | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_message_to_chat**
> EmptyApiResponse send_message_to_chat(business_id => $business_id, chat_id => $chat_id, send_message_to_chat_request => $send_message_to_chat_request)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ChatsApi;
my $api_instance = WWW::OpenAPIClient::ChatsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $chat_id = 789; # int | Идентификатор чата.
my $send_message_to_chat_request = WWW::OpenAPIClient::Object::SendMessageToChatRequest->new(); # SendMessageToChatRequest | description

eval {
    my $result = $api_instance->send_message_to_chat(business_id => $business_id, chat_id => $chat_id, send_message_to_chat_request => $send_message_to_chat_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ChatsApi->send_message_to_chat: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **chat_id** | **int**| Идентификатор чата. | 
 **send_message_to_chat_request** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md)| description | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

