#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ReturnsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum STATUSES for ReturnsAPI_getReturns

static char* getReturns_STATUSES_ToString(_api__getReturns_statuses_e STATUSES){
    char *STATUSESArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    return STATUSESArray[STATUSES];
}

static _api__getReturns_statuses_e getReturns_STATUSES_FromString(char* STATUSES){
    int stringToReturn = 0;
    char *STATUSESArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    size_t sizeofArray = sizeof(STATUSESArray) / sizeof(STATUSESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(STATUSES, STATUSESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getReturns_STATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getReturns_STATUSES_convertToJSON(_api__getReturns_statuses_e STATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getReturns_STATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getReturns_statuses_e getReturns_STATUSES_parseFromJSON(cJSON* STATUSESJSON) {
    _api__getReturns_statuses_e STATUSESVariable = 0;
    return STATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum  for ReturnsAPI_getReturns

static char* getReturns__ToString(_api__getReturns_type_e ){
    char *Array[] =  { "NULL", "UNREDEEMED", "RETURN" };
    return Array[];
}

static _api__getReturns_type_e getReturns__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "UNREDEEMED", "RETURN" };
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
// Function getReturns__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getReturns__convertToJSON(_api__getReturns_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getReturns__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getReturns_type_e getReturns__parseFromJSON(cJSON* JSON) {
    _api__getReturns_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Информация о невыкупе или возврате
//
// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_return_response_t*
ReturnsAPI_getReturn(apiClient_t *apiClient, long campaignId, long orderId, long returnId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);



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
    //    printf("%s\n","Детали возврата.");
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
    cJSON *ReturnsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_return_response_t *elementToReturn = get_return_response_parseFromJSON(ReturnsAPIlocalVarJSON);
    cJSON_Delete(ReturnsAPIlocalVarJSON);
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
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение заявления на возврат
//
// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
ReturnsAPI_getReturnApplication(apiClient_t *apiClient, long campaignId, long orderId, long returnId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);



    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //    printf("%s\n","Заявление на возврат.");
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение фотографии возврата
//
// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
ReturnsAPI_getReturnPhoto(apiClient_t *apiClient, long campaignId, long orderId, long returnId, long itemId, char *imageHash)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);


    // Path Params
    long sizeOfPathParams_itemId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ itemId }");
    if(itemId == 0){
        goto end;
    }
    char* localVarToReplace_itemId = malloc(sizeOfPathParams_itemId);
    snprintf(localVarToReplace_itemId, sizeOfPathParams_itemId, "{%s}", "itemId");

    char localVarBuff_itemId[256];
    intToStr(localVarBuff_itemId, itemId);

    localVarPath = strReplace(localVarPath, localVarToReplace_itemId, localVarBuff_itemId);


    // Path Params
    long sizeOfPathParams_imageHash = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ imageHash }");
    if(imageHash == NULL) {
        goto end;
    }
    char* localVarToReplace_imageHash = malloc(sizeOfPathParams_imageHash);
    sprintf(localVarToReplace_imageHash, "{%s}", "imageHash");

    localVarPath = strReplace(localVarPath, localVarToReplace_imageHash, imageHash);


    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //    printf("%s\n","Фотография возврата.");
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    free(localVarToReplace_itemId);
    free(localVarToReplace_imageHash);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список невыкупов и возвратов
//
// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_returns_response_t*
ReturnsAPI_getReturns(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, list_t *orderIds, list_t *statuses, return_type_e type, char fromDate, char toDate, char from_date, char to_date)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/returns")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/returns");


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

    // query parameters
    if (orderIds)
    {
        list_addElement(localVarQueryParameters,orderIds);
    }

    // query parameters
    if (statuses)
    {
        list_addElement(localVarQueryParameters,statuses);
    }

    // query parameters
    char *keyQuery_type = NULL;
    return_type_e valueQuery_type ;
    keyValuePair_t *keyPairQuery_type = 0;
    if (type)
    {
        keyQuery_type = strdup("type");
        valueQuery_type = (type);
        keyPairQuery_type = keyValuePair_create(keyQuery_type, (void *)strdup(getReturns__ToString(
        &valueQuery_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_type);
    }

    // query parameters
    char *keyQuery_fromDate = NULL;
    char valueQuery_fromDate ;
    keyValuePair_t *keyPairQuery_fromDate = 0;
    if (fromDate)
    {
        keyQuery_fromDate = strdup("fromDate");
        valueQuery_fromDate = (fromDate);
        keyPairQuery_fromDate = keyValuePair_create(keyQuery_fromDate, &valueQuery_fromDate);
        list_addElement(localVarQueryParameters,keyPairQuery_fromDate);
    }

    // query parameters
    char *keyQuery_toDate = NULL;
    char valueQuery_toDate ;
    keyValuePair_t *keyPairQuery_toDate = 0;
    if (toDate)
    {
        keyQuery_toDate = strdup("toDate");
        valueQuery_toDate = (toDate);
        keyPairQuery_toDate = keyValuePair_create(keyQuery_toDate, &valueQuery_toDate);
        list_addElement(localVarQueryParameters,keyPairQuery_toDate);
    }

    // query parameters
    char *keyQuery_from_date = NULL;
    char valueQuery_from_date ;
    keyValuePair_t *keyPairQuery_from_date = 0;
    if (from_date)
    {
        keyQuery_from_date = strdup("from_date");
        valueQuery_from_date = (from_date);
        keyPairQuery_from_date = keyValuePair_create(keyQuery_from_date, &valueQuery_from_date);
        list_addElement(localVarQueryParameters,keyPairQuery_from_date);
    }

    // query parameters
    char *keyQuery_to_date = NULL;
    char valueQuery_to_date ;
    keyValuePair_t *keyPairQuery_to_date = 0;
    if (to_date)
    {
        keyQuery_to_date = strdup("to_date");
        valueQuery_to_date = (to_date);
        keyPairQuery_to_date = keyValuePair_create(keyQuery_to_date, &valueQuery_to_date);
        list_addElement(localVarQueryParameters,keyPairQuery_to_date);
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
    //    printf("%s\n","Постраничные возвраты партнера.");
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
    cJSON *ReturnsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_returns_response_t *elementToReturn = get_returns_response_parseFromJSON(ReturnsAPIlocalVarJSON);
    cJSON_Delete(ReturnsAPIlocalVarJSON);
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
    if(keyQuery_type){
        free(keyQuery_type);
        keyQuery_type = NULL;
    }
    if(keyPairQuery_type){
        keyValuePair_free(keyPairQuery_type);
        keyPairQuery_type = NULL;
    }
    if(keyQuery_fromDate){
        free(keyQuery_fromDate);
        keyQuery_fromDate = NULL;
    }
    if(keyPairQuery_fromDate){
        keyValuePair_free(keyPairQuery_fromDate);
        keyPairQuery_fromDate = NULL;
    }
    if(keyQuery_toDate){
        free(keyQuery_toDate);
        keyQuery_toDate = NULL;
    }
    if(keyPairQuery_toDate){
        keyValuePair_free(keyPairQuery_toDate);
        keyPairQuery_toDate = NULL;
    }
    if(keyQuery_from_date){
        free(keyQuery_from_date);
        keyQuery_from_date = NULL;
    }
    if(keyPairQuery_from_date){
        keyValuePair_free(keyPairQuery_from_date);
        keyPairQuery_from_date = NULL;
    }
    if(keyQuery_to_date){
        free(keyQuery_to_date);
        keyQuery_to_date = NULL;
    }
    if(keyPairQuery_to_date){
        keyValuePair_free(keyPairQuery_to_date);
        keyPairQuery_to_date = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Принятие или изменение решения по возврату
//
// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
ReturnsAPI_setReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId, set_return_decision_request_t *set_return_decision_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_return_decision_request = NULL;
    if (set_return_decision_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_return_decision_request = set_return_decision_request_convertToJSON(set_return_decision_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_return_decision_request);
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
    //    printf("%s\n","Детали возврата.");
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
    cJSON *ReturnsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ReturnsAPIlocalVarJSON);
    cJSON_Delete(ReturnsAPIlocalVarJSON);
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
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    if (localVarSingleItemJSON_set_return_decision_request) {
        cJSON_Delete(localVarSingleItemJSON_set_return_decision_request);
        localVarSingleItemJSON_set_return_decision_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Подтверждение решения по возврату
//
// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
ReturnsAPI_submitReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);



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
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ReturnsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ReturnsAPIlocalVarJSON);
    cJSON_Delete(ReturnsAPIlocalVarJSON);
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
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

