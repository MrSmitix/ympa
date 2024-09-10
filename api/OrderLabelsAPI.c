#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "OrderLabelsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for OrderLabelsAPI_generateOrderLabel

static char* generateOrderLabel__ToString(_api__generateOrderLabel_format_e ){
    char *Array[] =  { "NULL", "A7", "A4" };
    return Array[];
}

static _api__generateOrderLabel_format_e generateOrderLabel__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "A7", "A4" };
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
// Function generateOrderLabel__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateOrderLabel__convertToJSON(_api__generateOrderLabel_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateOrderLabel__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateOrderLabel_format_e generateOrderLabel__parseFromJSON(cJSON* JSON) {
    _api__generateOrderLabel_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for OrderLabelsAPI_generateOrderLabels

static char* generateOrderLabels__ToString(_api__generateOrderLabels_format_e ){
    char *Array[] =  { "NULL", "A7", "A4" };
    return Array[];
}

static _api__generateOrderLabels_format_e generateOrderLabels__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "A7", "A4" };
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
// Function generateOrderLabels__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateOrderLabels__convertToJSON(_api__generateOrderLabels_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateOrderLabels__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateOrderLabels_format_e generateOrderLabels__parseFromJSON(cJSON* JSON) {
    _api__generateOrderLabels_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Готовый ярлык‑наклейка для коробки в заказе
//
// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
OrderLabelsAPI_generateOrderLabel(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, long boxId, page_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);


    // Path Params
    long sizeOfPathParams_boxId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ boxId }");
    if(boxId == 0){
        goto end;
    }
    char* localVarToReplace_boxId = malloc(sizeOfPathParams_boxId);
    snprintf(localVarToReplace_boxId, sizeOfPathParams_boxId, "{%s}", "boxId");

    char localVarBuff_boxId[256];
    intToStr(localVarBuff_boxId, boxId);

    localVarPath = strReplace(localVarPath, localVarToReplace_boxId, localVarBuff_boxId);




    // query parameters
    char *keyQuery_format = NULL;
    page_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateOrderLabel__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }
    list_addElement(localVarHeaderType,"application/pdf"); //produces
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
    //    printf("%s\n","PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.");
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
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_shipmentId);
    free(localVarToReplace_boxId);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Готовые ярлыки‑наклейки на все коробки в одном заказе
//
// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
OrderLabelsAPI_generateOrderLabels(apiClient_t *apiClient, long campaignId, long orderId, page_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/labels")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/labels");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // query parameters
    char *keyQuery_format = NULL;
    page_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateOrderLabels__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }
    list_addElement(localVarHeaderType,"application/pdf"); //produces
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
    //    printf("%s\n","PDF‑файл с ярлыками на все коробки.");
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
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Данные для самостоятельного изготовления ярлыков
//
// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_labels_data_response_t*
OrderLabelsAPI_getOrderLabelsData(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);



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
    //    printf("%s\n","Информация для печати ярлыков.");
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
    cJSON *OrderLabelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_order_labels_data_response_t *elementToReturn = get_order_labels_data_response_parseFromJSON(OrderLabelsAPIlocalVarJSON);
    cJSON_Delete(OrderLabelsAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

