#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ChatsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Создание нового чата с покупателем
//
// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
create_chat_response_t*
ChatsAPI_createChat(apiClient_t *apiClient, long businessId, create_chat_request_t *create_chat_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/new")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/new");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_create_chat_request = NULL;
    if (create_chat_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_chat_request = create_chat_request_convertToJSON(create_chat_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_chat_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Все получилось: чат создан. ");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ChatsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_chat_response_t *elementToReturn = create_chat_response_parseFromJSON(ChatsAPIlocalVarJSON);
    cJSON_Delete(ChatsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_create_chat_request) {
        cJSON_Delete(localVarSingleItemJSON_create_chat_request);
        localVarSingleItemJSON_create_chat_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение истории сообщений в чате
//
// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chat_history_response_t*
ChatsAPI_getChatHistory(apiClient_t *apiClient, long businessId, long chatId, get_chat_history_request_t *get_chat_history_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/history")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/history");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_chatId = NULL;
    long valueQuery_chatId ;
    keyValuePair_t *keyPairQuery_chatId = 0;
    if (chatId)
    {
        keyQuery_chatId = strdup("chatId");
        valueQuery_chatId = (chatId);
        keyPairQuery_chatId = keyValuePair_create(keyQuery_chatId, &valueQuery_chatId);
        list_addElement(localVarQueryParameters,keyPairQuery_chatId);
    }

    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_chat_history_request = NULL;
    if (get_chat_history_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_chat_history_request = get_chat_history_request_convertToJSON(get_chat_history_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_chat_history_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","История сообщений успешно получена. ");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ChatsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_chat_history_response_t *elementToReturn = get_chat_history_response_parseFromJSON(ChatsAPIlocalVarJSON);
    cJSON_Delete(ChatsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_chat_history_request) {
        cJSON_Delete(localVarSingleItemJSON_get_chat_history_request);
        localVarSingleItemJSON_get_chat_history_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_chatId){
        free(keyQuery_chatId);
        keyQuery_chatId = NULL;
    }
    if(keyPairQuery_chatId){
        keyValuePair_free(keyPairQuery_chatId);
        keyPairQuery_chatId = NULL;
    }
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение доступных чатов
//
// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chats_response_t*
ChatsAPI_getChats(apiClient_t *apiClient, long businessId, get_chats_request_t *get_chats_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_chats_request = NULL;
    if (get_chats_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_chats_request = get_chats_request_convertToJSON(get_chats_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_chats_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Список чатов. ");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ChatsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_chats_response_t *elementToReturn = get_chats_response_parseFromJSON(ChatsAPIlocalVarJSON);
    cJSON_Delete(ChatsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_chats_request) {
        cJSON_Delete(localVarSingleItemJSON_get_chats_request);
        localVarSingleItemJSON_get_chats_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отправка файла в чат
//
// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
ChatsAPI_sendFileToChat(apiClient_t *apiClient, long businessId, long chatId, binary_t* file)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/file/send")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/file/send");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_chatId = NULL;
    long valueQuery_chatId ;
    keyValuePair_t *keyPairQuery_chatId = 0;
    if (chatId)
    {
        keyQuery_chatId = strdup("chatId");
        valueQuery_chatId = (chatId);
        keyPairQuery_chatId = keyValuePair_create(keyQuery_chatId, &valueQuery_chatId);
        list_addElement(localVarQueryParameters,keyPairQuery_chatId);
    }

    // form parameters
    char *keyForm_file = NULL;
    binary_t* valueForm_file = 0;
    keyValuePair_t *keyPairForm_file = 0;
    if (file != NULL)
    {
        keyForm_file = strdup("file");
        valueForm_file = file;
        keyPairForm_file = keyValuePair_create(keyForm_file, &valueForm_file);
        list_addElement(localVarFormParameters,keyPairForm_file); //file adding
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ. Означает, что файл отправлен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ChatsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ChatsAPIlocalVarJSON);
    cJSON_Delete(ChatsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if(keyQuery_chatId){
        free(keyQuery_chatId);
        keyQuery_chatId = NULL;
    }
    if(keyPairQuery_chatId){
        keyValuePair_free(keyPairQuery_chatId);
        keyPairQuery_chatId = NULL;
    }
    if (keyForm_file) {
        free(keyForm_file);
        keyForm_file = NULL;
    }
//    free(fileVar_file->data);
//    free(fileVar_file);
    free(keyPairForm_file);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отправка сообщения в чат
//
// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
ChatsAPI_sendMessageToChat(apiClient_t *apiClient, long businessId, long chatId, send_message_to_chat_request_t *send_message_to_chat_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/message")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/message");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_chatId = NULL;
    long valueQuery_chatId ;
    keyValuePair_t *keyPairQuery_chatId = 0;
    if (chatId)
    {
        keyQuery_chatId = strdup("chatId");
        valueQuery_chatId = (chatId);
        keyPairQuery_chatId = keyValuePair_create(keyQuery_chatId, &valueQuery_chatId);
        list_addElement(localVarQueryParameters,keyPairQuery_chatId);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_send_message_to_chat_request = NULL;
    if (send_message_to_chat_request != NULL)
    {
        //string
        localVarSingleItemJSON_send_message_to_chat_request = send_message_to_chat_request_convertToJSON(send_message_to_chat_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_send_message_to_chat_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ. Означает, что сообщение отправлено.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ChatsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ChatsAPIlocalVarJSON);
    cJSON_Delete(ChatsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_send_message_to_chat_request) {
        cJSON_Delete(localVarSingleItemJSON_send_message_to_chat_request);
        localVarSingleItemJSON_send_message_to_chat_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_chatId){
        free(keyQuery_chatId);
        keyQuery_chatId = NULL;
    }
    if(keyPairQuery_chatId){
        keyValuePair_free(keyPairQuery_chatId);
        keyPairQuery_chatId = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

