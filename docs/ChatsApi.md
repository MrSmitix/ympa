# \ChatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat**](ChatsApi.md#create_chat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**get_chat_history**](ChatsApi.md#get_chat_history) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**get_chats**](ChatsApi.md#get_chats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**send_file_to_chat**](ChatsApi.md#send_file_to_chat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**send_message_to_chat**](ChatsApi.md#send_message_to_chat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат



## create_chat

> models::CreateChatResponse create_chat(business_id, create_chat_request)
Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [required] |
**create_chat_request** | [**CreateChatRequest**](CreateChatRequest.md) | description | [required] |

### Return type

[**models::CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_chat_history

> models::GetChatHistoryResponse get_chat_history(business_id, chat_id, get_chat_history_request, page_token, limit)
Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [required] |
**chat_id** | **i64** | Идентификатор чата. | [required] |
**get_chat_history_request** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md) | description | [required] |
**page_token** | Option<**String**> | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  |  |
**limit** | Option<**i32**> | Количество значений на одной странице.  |  |

### Return type

[**models::GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_chats

> models::GetChatsResponse get_chats(business_id, get_chats_request, page_token, limit)
Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [required] |
**get_chats_request** | [**GetChatsRequest**](GetChatsRequest.md) | description | [required] |
**page_token** | Option<**String**> | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  |  |
**limit** | Option<**i32**> | Количество значений на одной странице.  |  |

### Return type

[**models::GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## send_file_to_chat

> models::EmptyApiResponse send_file_to_chat(business_id, chat_id, file)
Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [required] |
**chat_id** | **i64** | Идентификатор чата. | [required] |
**file** | **std::path::PathBuf** | Содержимое файла. Максимальный размер файла — 5 Мбайт. | [required] |

### Return type

[**models::EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## send_message_to_chat

> models::EmptyApiResponse send_message_to_chat(business_id, chat_id, send_message_to_chat_request)
Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [required] |
**chat_id** | **i64** | Идентификатор чата. | [required] |
**send_message_to_chat_request** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md) | description | [required] |

### Return type

[**models::EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

