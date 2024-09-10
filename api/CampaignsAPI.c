#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "CampaignsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Информация о магазине
//
// Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_response_t*
CampaignsAPI_getCampaign(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}");


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
    //    printf("%s\n","Информация о магазине.");
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
    cJSON *CampaignsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_response_t *elementToReturn = get_campaign_response_parseFromJSON(CampaignsAPIlocalVarJSON);
    cJSON_Delete(CampaignsAPIlocalVarJSON);
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

// Логины, связанные с магазином
//
// Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_logins_response_t*
CampaignsAPI_getCampaignLogins(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/logins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/logins");


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
    //    printf("%s\n","Список логинов, связанных с магазином.");
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
    cJSON *CampaignsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_logins_response_t *elementToReturn = get_campaign_logins_response_parseFromJSON(CampaignsAPIlocalVarJSON);
    cJSON_Delete(CampaignsAPIlocalVarJSON);
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

// Регион магазина
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_campaign_region_response_t*
CampaignsAPI_getCampaignRegion(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/region")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/region");


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
    //    printf("%s\n","Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| ");
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
    cJSON *CampaignsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_region_response_t *elementToReturn = get_campaign_region_response_parseFromJSON(CampaignsAPIlocalVarJSON);
    cJSON_Delete(CampaignsAPIlocalVarJSON);
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

// Настройки магазина
//
// Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_settings_response_t*
CampaignsAPI_getCampaignSettings(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/settings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/settings");


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
    //    printf("%s\n","Настройки магазина.");
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
    cJSON *CampaignsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_settings_response_t *elementToReturn = get_campaign_settings_response_parseFromJSON(CampaignsAPIlocalVarJSON);
    cJSON_Delete(CampaignsAPIlocalVarJSON);
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

// Список магазинов пользователя
//
// Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaigns_response_t*
CampaignsAPI_getCampaigns(apiClient_t *apiClient, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns");




    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page, MAX_NUMBER_LENGTH, "%d", *page);
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }

    // query parameters
    char *keyQuery_pageSize = NULL;
    char * valueQuery_pageSize = NULL;
    keyValuePair_t *keyPairQuery_pageSize = 0;
    if (pageSize)
    {
        keyQuery_pageSize = strdup("pageSize");
        valueQuery_pageSize = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pageSize, MAX_NUMBER_LENGTH, "%d", *pageSize);
        keyPairQuery_pageSize = keyValuePair_create(keyQuery_pageSize, valueQuery_pageSize);
        list_addElement(localVarQueryParameters,keyPairQuery_pageSize);
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
    //    printf("%s\n","Магазины пользователя.");
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
    cJSON *CampaignsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaigns_response_t *elementToReturn = get_campaigns_response_parseFromJSON(CampaignsAPIlocalVarJSON);
    cJSON_Delete(CampaignsAPIlocalVarJSON);
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
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    if(keyQuery_pageSize){
        free(keyQuery_pageSize);
        keyQuery_pageSize = NULL;
    }
    if(valueQuery_pageSize){
        free(valueQuery_pageSize);
        valueQuery_pageSize = NULL;
    }
    if(keyPairQuery_pageSize){
        keyValuePair_free(keyPairQuery_pageSize);
        keyPairQuery_pageSize = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Магазины, доступные логину
//
// Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_campaigns_response_t*
CampaignsAPI_getCampaignsByLogin(apiClient_t *apiClient, char *login, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/by_login/{login}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/by_login/{login}");


    // Path Params
    long sizeOfPathParams_login = strlen(login)+3 + strlen("{ login }");
    if(login == NULL) {
        goto end;
    }
    char* localVarToReplace_login = malloc(sizeOfPathParams_login);
    sprintf(localVarToReplace_login, "{%s}", "login");

    localVarPath = strReplace(localVarPath, localVarToReplace_login, login);



    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page, MAX_NUMBER_LENGTH, "%d", *page);
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }

    // query parameters
    char *keyQuery_pageSize = NULL;
    char * valueQuery_pageSize = NULL;
    keyValuePair_t *keyPairQuery_pageSize = 0;
    if (pageSize)
    {
        keyQuery_pageSize = strdup("pageSize");
        valueQuery_pageSize = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pageSize, MAX_NUMBER_LENGTH, "%d", *pageSize);
        keyPairQuery_pageSize = keyValuePair_create(keyQuery_pageSize, valueQuery_pageSize);
        list_addElement(localVarQueryParameters,keyPairQuery_pageSize);
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
    //    printf("%s\n","Информация о магазинах.");
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
    cJSON *CampaignsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaigns_response_t *elementToReturn = get_campaigns_response_parseFromJSON(CampaignsAPIlocalVarJSON);
    cJSON_Delete(CampaignsAPIlocalVarJSON);
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
    free(localVarToReplace_login);
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    if(keyQuery_pageSize){
        free(keyQuery_pageSize);
        keyQuery_pageSize = NULL;
    }
    if(valueQuery_pageSize){
        free(valueQuery_pageSize);
        valueQuery_pageSize = NULL;
    }
    if(keyPairQuery_pageSize){
        keyValuePair_free(keyPairQuery_pageSize);
        keyPairQuery_pageSize = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

