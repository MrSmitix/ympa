#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BusinessOfferMappingsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Добавление товаров в архив
//
// Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
add_offers_to_archive_response_t*
BusinessOfferMappingsAPI_addOffersToArchive(apiClient_t *apiClient, long businessId, add_offers_to_archive_request_t *add_offers_to_archive_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/archive")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/archive");


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
    cJSON *localVarSingleItemJSON_add_offers_to_archive_request = NULL;
    if (add_offers_to_archive_request != NULL)
    {
        //string
        localVarSingleItemJSON_add_offers_to_archive_request = add_offers_to_archive_request_convertToJSON(add_offers_to_archive_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_add_offers_to_archive_request);
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
    //    printf("%s\n","Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ");
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
    cJSON *BusinessOfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    add_offers_to_archive_response_t *elementToReturn = add_offers_to_archive_response_parseFromJSON(BusinessOfferMappingsAPIlocalVarJSON);
    cJSON_Delete(BusinessOfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_add_offers_to_archive_request) {
        cJSON_Delete(localVarSingleItemJSON_add_offers_to_archive_request);
        localVarSingleItemJSON_add_offers_to_archive_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товаров из каталога
//
// Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_response_t*
BusinessOfferMappingsAPI_deleteOffers(apiClient_t *apiClient, long businessId, delete_offers_request_t *delete_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/delete")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/delete");


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
    cJSON *localVarSingleItemJSON_delete_offers_request = NULL;
    if (delete_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_offers_request = delete_offers_request_convertToJSON(delete_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_offers_request);
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
    //    printf("%s\n","Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.");
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
    cJSON *BusinessOfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_offers_response_t *elementToReturn = delete_offers_response_parseFromJSON(BusinessOfferMappingsAPIlocalVarJSON);
    cJSON_Delete(BusinessOfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_delete_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_offers_request);
        localVarSingleItemJSON_delete_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товаров из архива
//
// Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_from_archive_response_t*
BusinessOfferMappingsAPI_deleteOffersFromArchive(apiClient_t *apiClient, long businessId, delete_offers_from_archive_request_t *delete_offers_from_archive_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/unarchive")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/unarchive");


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
    cJSON *localVarSingleItemJSON_delete_offers_from_archive_request = NULL;
    if (delete_offers_from_archive_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_offers_from_archive_request = delete_offers_from_archive_request_convertToJSON(delete_offers_from_archive_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_offers_from_archive_request);
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
    //    printf("%s\n","Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ");
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
    cJSON *BusinessOfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_offers_from_archive_response_t *elementToReturn = delete_offers_from_archive_response_parseFromJSON(BusinessOfferMappingsAPIlocalVarJSON);
    cJSON_Delete(BusinessOfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_delete_offers_from_archive_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_offers_from_archive_request);
        localVarSingleItemJSON_delete_offers_from_archive_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о товарах в каталоге
//
// Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
//
get_offer_mappings_response_t*
BusinessOfferMappingsAPI_getOfferMappings(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_mappings_request_t *get_offer_mappings_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings");


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
    cJSON *localVarSingleItemJSON_get_offer_mappings_request = NULL;
    if (get_offer_mappings_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_offer_mappings_request = get_offer_mappings_request_convertToJSON(get_offer_mappings_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_offer_mappings_request);
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
    cJSON *BusinessOfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offer_mappings_response_t *elementToReturn = get_offer_mappings_response_parseFromJSON(BusinessOfferMappingsAPIlocalVarJSON);
    cJSON_Delete(BusinessOfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_get_offer_mappings_request) {
        cJSON_Delete(localVarSingleItemJSON_get_offer_mappings_request);
        localVarSingleItemJSON_get_offer_mappings_request = NULL;
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

// Просмотр карточек на Маркете, которые подходят вашим товарам
//
// Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
get_suggested_offer_mappings_response_t*
BusinessOfferMappingsAPI_getSuggestedOfferMappings(apiClient_t *apiClient, long businessId, get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/suggestions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/suggestions");


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
    cJSON *localVarSingleItemJSON_get_suggested_offer_mappings_request = NULL;
    if (get_suggested_offer_mappings_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_suggested_offer_mappings_request = get_suggested_offer_mappings_request_convertToJSON(get_suggested_offer_mappings_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_suggested_offer_mappings_request);
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
    //    printf("%s\n","Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ");
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
    cJSON *BusinessOfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_suggested_offer_mappings_response_t *elementToReturn = get_suggested_offer_mappings_response_parseFromJSON(BusinessOfferMappingsAPIlocalVarJSON);
    cJSON_Delete(BusinessOfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_get_suggested_offer_mappings_request) {
        cJSON_Delete(localVarSingleItemJSON_get_suggested_offer_mappings_request);
        localVarSingleItemJSON_get_suggested_offer_mappings_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление товаров в каталог и изменение информации о них
//
// Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
update_offer_mappings_response_t*
BusinessOfferMappingsAPI_updateOfferMappings(apiClient_t *apiClient, long businessId, update_offer_mappings_request_t *update_offer_mappings_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/update");


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
    cJSON *localVarSingleItemJSON_update_offer_mappings_request = NULL;
    if (update_offer_mappings_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_offer_mappings_request = update_offer_mappings_request_convertToJSON(update_offer_mappings_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_offer_mappings_request);
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
    //    printf("%s\n","Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ");
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
    cJSON *BusinessOfferMappingsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_offer_mappings_response_t *elementToReturn = update_offer_mappings_response_parseFromJSON(BusinessOfferMappingsAPIlocalVarJSON);
    cJSON_Delete(BusinessOfferMappingsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_offer_mappings_request) {
        cJSON_Delete(localVarSingleItemJSON_update_offer_mappings_request);
        localVarSingleItemJSON_update_offer_mappings_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

