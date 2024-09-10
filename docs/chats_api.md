# chats_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateChat**](chats_api.md#CreateChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**GetChatHistory**](chats_api.md#GetChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**GetChats**](chats_api.md#GetChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**SendFileToChat**](chats_api.md#SendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**SendMessageToChat**](chats_api.md#SendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат


<a name="CreateChat"></a>
# **CreateChat**
> CreateChatResponse CreateChat(businessId, createChatRequest)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="GetChatHistory"></a>
# **GetChatHistory**
> GetChatHistoryResponse GetChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
<a name="GetChats"></a>
# **GetChats**
> GetChatsResponse GetChats(businessId, getChatsRequest, pageToken, limit)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
<a name="SendFileToChat"></a>
# **SendFileToChat**
> EmptyApiResponse SendFileToChat(businessId, chatId, file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="SendMessageToChat"></a>
# **SendMessageToChat**
> EmptyApiResponse SendMessageToChat(businessId, chatId, sendMessageToChatRequest)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
