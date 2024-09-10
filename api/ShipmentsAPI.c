#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ShipmentsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for ShipmentsAPI_downloadShipmentPalletLabels

static char* downloadShipmentPalletLabels__ToString(_api__downloadShipmentPalletLabels_format_e ){
    char *Array[] =  { "NULL", "A4", "A8" };
    return Array[];
}

static _api__downloadShipmentPalletLabels_format_e downloadShipmentPalletLabels__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "A4", "A8" };
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
// Function downloadShipmentPalletLabels__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *downloadShipmentPalletLabels__convertToJSON(_api__downloadShipmentPalletLabels_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function downloadShipmentPalletLabels__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__downloadShipmentPalletLabels_format_e downloadShipmentPalletLabels__parseFromJSON(cJSON* JSON) {
    _api__downloadShipmentPalletLabels_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Подтверждение отгрузки
//
// Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
empty_api_response_t*
ShipmentsAPI_confirmShipment(apiClient_t *apiClient, long campaignId, long shipmentId, confirm_shipment_request_t *confirm_shipment_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // Body Param
    cJSON *localVarSingleItemJSON_confirm_shipment_request = NULL;
    if (confirm_shipment_request != NULL)
    {
        //string
        localVarSingleItemJSON_confirm_shipment_request = confirm_shipment_request_convertToJSON(confirm_shipment_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_confirm_shipment_request);
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
    cJSON *ShipmentsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ShipmentsAPIlocalVarJSON);
    cJSON_Delete(ShipmentsAPIlocalVarJSON);
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
    free(localVarToReplace_shipmentId);
    if (localVarSingleItemJSON_confirm_shipment_request) {
        cJSON_Delete(localVarSingleItemJSON_confirm_shipment_request);
        localVarSingleItemJSON_confirm_shipment_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение акта приема-передачи
//
// {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentAct(apiClient_t *apiClient, long campaignId, long shipmentId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);



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
    //    printf("%s\n","Акт приема-передачи для отгрузки в формате PDF.");
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
    free(localVarToReplace_shipmentId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение акта расхождений
//
// Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentDiscrepancyAct(apiClient_t *apiClient, long campaignId, long shipmentId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);



    list_addElement(localVarHeaderType,"application/vnd.ms-excel"); //produces
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
    //    printf("%s\n","Акт расхождений в формате XLSX.");
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
    free(localVarToReplace_shipmentId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение фактического акта приема-передачи
//
// Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentInboundAct(apiClient_t *apiClient, long campaignId, long shipmentId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);



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
    //    printf("%s\n","Акт в формате PDF.");
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
    free(localVarToReplace_shipmentId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Ярлыки для доверительной приемки (FBS)
//
// PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentPalletLabels(apiClient_t *apiClient, long campaignId, long shipmentId, shipment_pallet_label_page_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // query parameters
    char *keyQuery_format = NULL;
    shipment_pallet_label_page_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(downloadShipmentPalletLabels__ToString(
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
    //    printf("%s\n","PDF‑файл с ярлыками на все упаковки в отгрузке.");
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
    free(localVarToReplace_shipmentId);
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

// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
//
// Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentReceptionTransferAct(apiClient_t *apiClient, long campaignId, int *warehouse_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/shipments/reception-transfer-act")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/shipments/reception-transfer-act");


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
    char *keyQuery_warehouse_id = NULL;
    char * valueQuery_warehouse_id = NULL;
    keyValuePair_t *keyPairQuery_warehouse_id = 0;
    if (warehouse_id)
    {
        keyQuery_warehouse_id = strdup("warehouse_id");
        valueQuery_warehouse_id = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_warehouse_id, MAX_NUMBER_LENGTH, "%d", *warehouse_id);
        keyPairQuery_warehouse_id = keyValuePair_create(keyQuery_warehouse_id, valueQuery_warehouse_id);
        list_addElement(localVarQueryParameters,keyPairQuery_warehouse_id);
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
    //    printf("%s\n","Акт приема-передачи в формате PDF.");
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
    if(keyQuery_warehouse_id){
        free(keyQuery_warehouse_id);
        keyQuery_warehouse_id = NULL;
    }
    if(valueQuery_warehouse_id){
        free(valueQuery_warehouse_id);
        valueQuery_warehouse_id = NULL;
    }
    if(keyPairQuery_warehouse_id){
        keyValuePair_free(keyPairQuery_warehouse_id);
        keyPairQuery_warehouse_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение транспортной накладной
//
// Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentTransportationWaybill(apiClient_t *apiClient, long campaignId, long shipmentId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);



    list_addElement(localVarHeaderType,"application/vnd.ms-excel"); //produces
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
    //    printf("%s\n","Транспортная накладная в формате XLSX.");
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
    free(localVarToReplace_shipmentId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение информации об одной отгрузке
//
// Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_shipment_response_t*
ShipmentsAPI_getShipment(apiClient_t *apiClient, long campaignId, long shipmentId, int *cancelledOrders)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // query parameters
    char *keyQuery_cancelledOrders = NULL;
    char * valueQuery_cancelledOrders = NULL;
    keyValuePair_t *keyPairQuery_cancelledOrders = 0;
    if (cancelledOrders)
    {
        keyQuery_cancelledOrders = strdup("cancelledOrders");
        valueQuery_cancelledOrders = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_cancelledOrders, MAX_NUMBER_LENGTH, "%d", *cancelledOrders);
        keyPairQuery_cancelledOrders = keyValuePair_create(keyQuery_cancelledOrders, valueQuery_cancelledOrders);
        list_addElement(localVarQueryParameters,keyPairQuery_cancelledOrders);
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
    //    printf("%s\n","Найденная отгрузка.");
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
    cJSON *ShipmentsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_shipment_response_t *elementToReturn = get_shipment_response_parseFromJSON(ShipmentsAPIlocalVarJSON);
    cJSON_Delete(ShipmentsAPIlocalVarJSON);
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
    free(localVarToReplace_shipmentId);
    if(keyQuery_cancelledOrders){
        free(keyQuery_cancelledOrders);
        keyQuery_cancelledOrders = NULL;
    }
    if(valueQuery_cancelledOrders){
        free(valueQuery_cancelledOrders);
        valueQuery_cancelledOrders = NULL;
    }
    if(keyPairQuery_cancelledOrders){
        keyValuePair_free(keyPairQuery_cancelledOrders);
        keyPairQuery_cancelledOrders = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение информации о возможности печати ярлыков (FBS)
//
// Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_shipment_orders_info_response_t*
ShipmentsAPI_getShipmentOrdersInfo(apiClient_t *apiClient, long campaignId, long shipmentId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);



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
    //    printf("%s\n","Информация по годным/негодным для печати ярлыков заказам в отгрузке.");
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
    cJSON *ShipmentsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_shipment_orders_info_response_t *elementToReturn = get_shipment_orders_info_response_parseFromJSON(ShipmentsAPIlocalVarJSON);
    cJSON_Delete(ShipmentsAPIlocalVarJSON);
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
    free(localVarToReplace_shipmentId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение информации о нескольких отгрузках
//
// Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
search_shipments_response_t*
ShipmentsAPI_searchShipments(apiClient_t *apiClient, long campaignId, search_shipments_request_t *search_shipments_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments");


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
    cJSON *localVarSingleItemJSON_search_shipments_request = NULL;
    if (search_shipments_request != NULL)
    {
        //string
        localVarSingleItemJSON_search_shipments_request = search_shipments_request_convertToJSON(search_shipments_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_search_shipments_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Найденные отгрузки.");
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
    cJSON *ShipmentsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    search_shipments_response_t *elementToReturn = search_shipments_response_parseFromJSON(ShipmentsAPIlocalVarJSON);
    cJSON_Delete(ShipmentsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_search_shipments_request) {
        cJSON_Delete(localVarSingleItemJSON_search_shipments_request);
        localVarSingleItemJSON_search_shipments_request = NULL;
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

// Передача количества упаковок в отгрузке
//
// Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
//
empty_api_response_t*
ShipmentsAPI_setShipmentPalletsCount(apiClient_t *apiClient, long campaignId, long shipmentId, set_shipment_pallets_count_request_t *set_shipment_pallets_count_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_shipment_pallets_count_request = NULL;
    if (set_shipment_pallets_count_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_shipment_pallets_count_request = set_shipment_pallets_count_request_convertToJSON(set_shipment_pallets_count_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_shipment_pallets_count_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество упаковок записано.");
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
    cJSON *ShipmentsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ShipmentsAPIlocalVarJSON);
    cJSON_Delete(ShipmentsAPIlocalVarJSON);
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
    free(localVarToReplace_shipmentId);
    if (localVarSingleItemJSON_set_shipment_pallets_count_request) {
        cJSON_Delete(localVarSingleItemJSON_set_shipment_pallets_count_request);
        localVarSingleItemJSON_set_shipment_pallets_count_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Перенос заказов в следующую отгрузку
//
// Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \"Такие переносы снижают индекс качества магазина\" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
//
empty_api_response_t*
ShipmentsAPI_transferOrdersFromShipment(apiClient_t *apiClient, long campaignId, long shipmentId, transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // Body Param
    cJSON *localVarSingleItemJSON_transfer_orders_from_shipment_request = NULL;
    if (transfer_orders_from_shipment_request != NULL)
    {
        //string
        localVarSingleItemJSON_transfer_orders_from_shipment_request = transfer_orders_from_shipment_request_convertToJSON(transfer_orders_from_shipment_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_transfer_orders_from_shipment_request);
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
    //    printf("%s\n","Запрос на перенос заказов проверен и принят, и они будут перенесены спустя несколько минут.");
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
    cJSON *ShipmentsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(ShipmentsAPIlocalVarJSON);
    cJSON_Delete(ShipmentsAPIlocalVarJSON);
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
    free(localVarToReplace_shipmentId);
    if (localVarSingleItemJSON_transfer_orders_from_shipment_request) {
        cJSON_Delete(localVarSingleItemJSON_transfer_orders_from_shipment_request);
        localVarSingleItemJSON_transfer_orders_from_shipment_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

