#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "OrdersStatsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Детальная информация по заказам
//
// Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_stats_response_t*
OrdersStatsAPI_getOrdersStats(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_orders_stats_request_t *get_orders_stats_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/stats/orders")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/stats/orders");


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

    // Body Param
    cJSON *localVarSingleItemJSON_get_orders_stats_request = NULL;
    if (get_orders_stats_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_orders_stats_request = get_orders_stats_request_convertToJSON(get_orders_stats_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_orders_stats_request);
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
    //    printf("%s\n","Информация по заказам.");
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
    cJSON *OrdersStatsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_orders_stats_response_t *elementToReturn = get_orders_stats_response_parseFromJSON(OrdersStatsAPIlocalVarJSON);
    cJSON_Delete(OrdersStatsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_orders_stats_request) {
        cJSON_Delete(localVarSingleItemJSON_get_orders_stats_request);
        localVarSingleItemJSON_get_orders_stats_request = NULL;
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

