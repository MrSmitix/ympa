#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "FeedsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for FeedsAPI_getFeedIndexLogs

static char* getFeedIndexLogs__ToString(_api__getFeedIndexLogs_status_e ){
    char *Array[] =  { "NULL", "ERROR", "OK", "WARNING" };
    return Array[];
}

static _api__getFeedIndexLogs_status_e getFeedIndexLogs__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ERROR", "OK", "WARNING" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getFeedIndexLogs__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getFeedIndexLogs__convertToJSON(_api__getFeedIndexLogs_status_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getFeedIndexLogs__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getFeedIndexLogs_status_e getFeedIndexLogs__parseFromJSON(cJSON* JSON) {
    _api__getFeedIndexLogs_status_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Информация о прайс-листе
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feed_response_t*
FeedsAPI_getFeed(apiClient_t *apiClient, long campaignId, long feedId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Информация о прайс-листе.");
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
    cJSON *FeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feed_response_t *elementToReturn = get_feed_response_parseFromJSON(FeedsAPIlocalVarJSON);
    cJSON_Delete(FeedsAPIlocalVarJSON);
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
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по индексации прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_feed_index_logs_response_t*
FeedsAPI_getFeedIndexLogs(apiClient_t *apiClient, long campaignId, long feedId, int *limit, char published_time_from, char published_time_to, feed_index_logs_status_type_e status)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}/index-logs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}/index-logs");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);




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

    // query parameters
    char *keyQuery_published_time_from = NULL;
    char valueQuery_published_time_from ;
    keyValuePair_t *keyPairQuery_published_time_from = 0;
    if (published_time_from)
    {
        keyQuery_published_time_from = strdup("published_time_from");
        valueQuery_published_time_from = (published_time_from);
        keyPairQuery_published_time_from = keyValuePair_create(keyQuery_published_time_from, &valueQuery_published_time_from);
        list_addElement(localVarQueryParameters,keyPairQuery_published_time_from);
    }

    // query parameters
    char *keyQuery_published_time_to = NULL;
    char valueQuery_published_time_to ;
    keyValuePair_t *keyPairQuery_published_time_to = 0;
    if (published_time_to)
    {
        keyQuery_published_time_to = strdup("published_time_to");
        valueQuery_published_time_to = (published_time_to);
        keyPairQuery_published_time_to = keyValuePair_create(keyQuery_published_time_to, &valueQuery_published_time_to);
        list_addElement(localVarQueryParameters,keyPairQuery_published_time_to);
    }

    // query parameters
    char *keyQuery_status = NULL;
    feed_index_logs_status_type_e valueQuery_status ;
    keyValuePair_t *keyPairQuery_status = 0;
    if (status)
    {
        keyQuery_status = strdup("status");
        valueQuery_status = (status);
        keyPairQuery_status = keyValuePair_create(keyQuery_status, (void *)strdup(getFeedIndexLogs__ToString(
        &valueQuery_status)));
        list_addElement(localVarQueryParameters,keyPairQuery_status);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Отчет по индексации прайс-листа.");
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
    cJSON *FeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feed_index_logs_response_t *elementToReturn = get_feed_index_logs_response_parseFromJSON(FeedsAPIlocalVarJSON);
    cJSON_Delete(FeedsAPIlocalVarJSON);
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
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
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
    if(keyQuery_published_time_from){
        free(keyQuery_published_time_from);
        keyQuery_published_time_from = NULL;
    }
    if(keyPairQuery_published_time_from){
        keyValuePair_free(keyPairQuery_published_time_from);
        keyPairQuery_published_time_from = NULL;
    }
    if(keyQuery_published_time_to){
        free(keyQuery_published_time_to);
        keyQuery_published_time_to = NULL;
    }
    if(keyPairQuery_published_time_to){
        keyValuePair_free(keyPairQuery_published_time_to);
        keyPairQuery_published_time_to = NULL;
    }
    if(keyQuery_status){
        free(keyQuery_status);
        keyQuery_status = NULL;
    }
    if(keyPairQuery_status){
        keyValuePair_free(keyPairQuery_status);
        keyPairQuery_status = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список прайс-листов магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feeds_response_t*
FeedsAPI_getFeeds(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Список прайс-листов.");
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
    cJSON *FeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feeds_response_t *elementToReturn = get_feeds_response_parseFromJSON(FeedsAPIlocalVarJSON);
    cJSON_Delete(FeedsAPIlocalVarJSON);
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
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Сообщить, что прайс-лист обновился
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
FeedsAPI_refreshFeed(apiClient_t *apiClient, long campaignId, long feedId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}/refresh")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}/refresh");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *FeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(FeedsAPIlocalVarJSON);
    cJSON_Delete(FeedsAPIlocalVarJSON);
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
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение параметров прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
FeedsAPI_setFeedParams(apiClient_t *apiClient, long campaignId, long feedId, set_feed_params_request_t *set_feed_params_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}/params")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}/params");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_feed_params_request = NULL;
    if (set_feed_params_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_feed_params_request = set_feed_params_request_convertToJSON(set_feed_params_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_feed_params_request);
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
    //    printf("%s\n","Статус выполнения операции.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *FeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(FeedsAPIlocalVarJSON);
    cJSON_Delete(FeedsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
    if (localVarSingleItemJSON_set_feed_params_request) {
        cJSON_Delete(localVarSingleItemJSON_set_feed_params_request);
        localVarSingleItemJSON_set_feed_params_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

