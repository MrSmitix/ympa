#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "OfferMappingsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for OfferMappingsAPI_getOfferMappingEntries

static char* getOfferMappingEntries__ToString(_api__getOfferMappingEntries_mapping_kind_e ){
    char *Array[] =  { "NULL", "ACTIVE", "ALL" };
    return Array[];
}

static _api__getOfferMappingEntries_mapping_kind_e getOfferMappingEntries__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ACTIVE", "ALL" };
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
// Function getOfferMappingEntries__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOfferMappingEntries__convertToJSON(_api__getOfferMappingEntries_mapping_kind_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOfferMappingEntries__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOfferMappingEntries_mapping_kind_e getOfferMappingEntries__parseFromJSON(cJSON* JSON) {
    _api__getOfferMappingEntries_mapping_kind_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum STATUS for OfferMappingsAPI_getOfferMappingEntries

static char* getOfferMappingEntries_STATUS_ToString(_api__getOfferMappingEntries_status_e STATUS){
    char *STATUSArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    return STATUSArray[STATUS];
}

static _api__getOfferMappingEntries_status_e getOfferMappingEntries_STATUS_FromString(char* STATUS){
    int stringToReturn = 0;
    char *STATUSArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    size_t sizeofArray = sizeof(STATUSArray) / sizeof(STATUSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(STATUS, STATUSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOfferMappingEntries_STATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOfferMappingEntries_STATUS_convertToJSON(_api__getOfferMappingEntries_status_e STATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOfferMappingEntries_STATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOfferMappingEntries_status_e getOfferMappingEntries_STATUS_parseFromJSON(cJSON* STATUSJSON) {
    _api__getOfferMappingEntries_status_e STATUSVariable = 0;
    return STATUSVariable;
end:
    return 0;
}
*/

// Functions for enum AVAILABILITY for OfferMappingsAPI_getOfferMappingEntries

static char* getOfferMappingEntries_AVAILABILITY_ToString(_api__getOfferMappingEntries_availability_e AVAILABILITY){
    char *AVAILABILITYArray[] =  { "NULL", "ACTIVE", "INACTIVE", "DELISTED" };
    return AVAILABILITYArray[AVAILABILITY];
}

static _api__getOfferMappingEntries_availability_e getOfferMappingEntries_AVAILABILITY_FromString(char* AVAILABILITY){
    int stringToReturn = 0;
    char *AVAILABILITYArray[] =  { "NULL", "ACTIVE", "INACTIVE", "DELISTED" };
    size_t sizeofArray = sizeof(AVAILABILITYArray) / sizeof(AVAILABILITYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(AVAILABILITY, AVAILABILITYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOfferMappingEntries_AVAILABILITY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOfferMappingEntries_AVAILABILITY_convertToJSON(_api__getOfferMappingEntries_availability_e AVAILABILITY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOfferMappingEntries_AVAILABILITY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOfferMappingEntries_availability_e getOfferMappingEntries_AVAILABILITY_parseFromJSON(cJSON* AVAILABILITYJSON) {
    _api__getOfferMappingEntries_availability_e AVAILABILITYVariable = 0;
    return AVAILABILITYVariable;
end:
    return 0;
}
*/


// Список товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
//
get_offer_mapping_entries_response_t*
OfferMappingsAPI_getOfferMappingEntries(apiClient_t *apiClient, long campaignId, list_t *offer_id, list_t *shop_sku, offer_mapping_kind_type_e mapping_kind, list_t *status, list_t *availability, list_t *category_id, list_t *vendor, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-mapping-entries")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-mapping-entries");


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
    if (offer_id)
    {
        list_addElement(localVarQueryParameters,offer_id);
    }

    // query parameters
    if (shop_sku)
    {
        list_addElement(localVarQueryParameters,shop_sku);
    }

    // query parameters
    char *keyQuery_mapping_kind = NULL;
    offer_mapping_kind_type_e valueQuery_mapping_kind ;
    keyValuePair_t *keyPairQuery_mapping_kind = 0;
    if (mapping_kind)
    {
        keyQuery_mapping_kind = strdup("mapping_kind");
        valueQuery_mapping_kind = (mapping_kind);
        keyPairQuery_mapping_kind = keyValuePair_create(keyQuery_mapping_kind, (void *)strdup(getOfferMappingEntries__ToString(
        &valueQuery_mapping_kind)));
        list_addElement(localVarQueryParameters,keyPairQuery_mapping_kind);
    }

    // query parameters
    if (status)
    {
        list_addElement(localVarQueryParameters,status);
    }

    // query parameters
    if (availability)
    {
        list_addElement(localVarQueryParameters,availability);
    }

    // query parameters
    if (category_id)
    {
        list_addElement(localVarQueryParameters,category_id);
    }

    // query parameters
    if (vendor)
    {
        list_addElement(localVarQueryParameters,vendor);
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
    //    printf("%s\n","Информация о товарах в каталоге.");
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
    cJSON *OfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offer_mapping_entries_response_t *elementToReturn = get_offer_mapping_entries_response_parseFromJSON(OfferMappingsAPIlocalVarJSON);
    cJSON_Delete(OfferMappingsAPIlocalVarJSON);
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
    if(keyQuery_mapping_kind){
        free(keyQuery_mapping_kind);
        keyQuery_mapping_kind = NULL;
    }
    if(keyPairQuery_mapping_kind){
        keyValuePair_free(keyPairQuery_mapping_kind);
        keyPairQuery_mapping_kind = NULL;
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

// Рекомендованные карточки для товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
//
get_suggested_offer_mapping_entries_response_t*
OfferMappingsAPI_getSuggestedOfferMappingEntries(apiClient_t *apiClient, long campaignId, get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-mapping-entries/suggestions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-mapping-entries/suggestions");


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




    // Body Param
    cJSON *localVarSingleItemJSON_get_suggested_offer_mapping_entries_request = NULL;
    if (get_suggested_offer_mapping_entries_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_suggested_offer_mapping_entries_request = get_suggested_offer_mapping_entries_request_convertToJSON(get_suggested_offer_mapping_entries_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_suggested_offer_mapping_entries_request);
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
    //    printf("%s\n","Информация о товарах в каталоге.");
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
    cJSON *OfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_suggested_offer_mapping_entries_response_t *elementToReturn = get_suggested_offer_mapping_entries_response_parseFromJSON(OfferMappingsAPIlocalVarJSON);
    cJSON_Delete(OfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_get_suggested_offer_mapping_entries_request) {
        cJSON_Delete(localVarSingleItemJSON_get_suggested_offer_mapping_entries_request);
        localVarSingleItemJSON_get_suggested_offer_mapping_entries_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление и редактирование товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
//
empty_api_response_t*
OfferMappingsAPI_updateOfferMappingEntries(apiClient_t *apiClient, long campaignId, update_offer_mapping_entry_request_t *update_offer_mapping_entry_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-mapping-entries/updates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-mapping-entries/updates");


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




    // Body Param
    cJSON *localVarSingleItemJSON_update_offer_mapping_entry_request = NULL;
    if (update_offer_mapping_entry_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_offer_mapping_entry_request = update_offer_mapping_entry_request_convertToJSON(update_offer_mapping_entry_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_offer_mapping_entry_request);
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
    cJSON *OfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(OfferMappingsAPIlocalVarJSON);
    cJSON_Delete(OfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_offer_mapping_entry_request) {
        cJSON_Delete(localVarSingleItemJSON_update_offer_mapping_entry_request);
        localVarSingleItemJSON_update_offer_mapping_entry_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

