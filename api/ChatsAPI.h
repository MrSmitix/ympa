#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/create_chat_request.h"
#include "../model/create_chat_response.h"
#include "../model/empty_api_response.h"
#include "../model/get_chat_history_request.h"
#include "../model/get_chat_history_response.h"
#include "../model/get_chats_request.h"
#include "../model/get_chats_response.h"
#include "../model/send_message_to_chat_request.h"


// Создание нового чата с покупателем
//
// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
create_chat_response_t*
ChatsAPI_createChat(apiClient_t *apiClient, long businessId, create_chat_request_t *create_chat_request);


// Получение истории сообщений в чате
//
// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chat_history_response_t*
ChatsAPI_getChatHistory(apiClient_t *apiClient, long businessId, long chatId, get_chat_history_request_t *get_chat_history_request, char *page_token, int *limit);


// Получение доступных чатов
//
// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chats_response_t*
ChatsAPI_getChats(apiClient_t *apiClient, long businessId, get_chats_request_t *get_chats_request, char *page_token, int *limit);


// Отправка файла в чат
//
// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
ChatsAPI_sendFileToChat(apiClient_t *apiClient, long businessId, long chatId, binary_t* file);


// Отправка сообщения в чат
//
// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
ChatsAPI_sendMessageToChat(apiClient_t *apiClient, long businessId, long chatId, send_message_to_chat_request_t *send_message_to_chat_request);


