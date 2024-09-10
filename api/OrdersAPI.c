#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "OrdersAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum STATUS for OrdersAPI_getOrders

static char* getOrders_STATUS_ToString(_api__getOrders_status_e STATUS){
    char *STATUSArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    return STATUSArray[STATUS];
}

static _api__getOrders_status_e getOrders_STATUS_FromString(char* STATUS){
    int stringToReturn = 0;
    char *STATUSArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
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
// Function getOrders_STATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders_STATUS_convertToJSON(_api__getOrders_status_e STATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders_STATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_status_e getOrders_STATUS_parseFromJSON(cJSON* STATUSJSON) {
    _api__getOrders_status_e STATUSVariable = 0;
    return STATUSVariable;
end:
    return 0;
}
*/

// Functions for enum SUBSTATUS for OrdersAPI_getOrders

static char* getOrders_SUBSTATUS_ToString(_api__getOrders_substatus_e SUBSTATUS){
    char *SUBSTATUSArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    return SUBSTATUSArray[SUBSTATUS];
}

static _api__getOrders_substatus_e getOrders_SUBSTATUS_FromString(char* SUBSTATUS){
    int stringToReturn = 0;
    char *SUBSTATUSArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    size_t sizeofArray = sizeof(SUBSTATUSArray) / sizeof(SUBSTATUSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SUBSTATUS, SUBSTATUSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOrders_SUBSTATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders_SUBSTATUS_convertToJSON(_api__getOrders_substatus_e SUBSTATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders_SUBSTATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_substatus_e getOrders_SUBSTATUS_parseFromJSON(cJSON* SUBSTATUSJSON) {
    _api__getOrders_substatus_e SUBSTATUSVariable = 0;
    return SUBSTATUSVariable;
end:
    return 0;
}
*/

// Functions for enum  for OrdersAPI_getOrders

static char* getOrders__ToString(_api__getOrders_dispatchType_e ){
    char *Array[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
    return Array[];
}

static _api__getOrders_dispatchType_e getOrders__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
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
// Function getOrders__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders__convertToJSON(_api__getOrders_dispatchType_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_dispatchType_e getOrders__parseFromJSON(cJSON* JSON) {
    _api__getOrders_dispatchType_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for OrdersAPI_getOrders

static char* getOrders__ToString(_api__getOrders_buyerType_e ){
    char *Array[] =  { "NULL", "PERSON", "BUSINESS" };
    return Array[];
}

static _api__getOrders_buyerType_e getOrders__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "PERSON", "BUSINESS" };
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
// Function getOrders__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders__convertToJSON(_api__getOrders_buyerType_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_buyerType_e getOrders__parseFromJSON(cJSON* JSON) {
    _api__getOrders_buyerType_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Отмена заказа покупателем
//
// Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.  Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.  Если заказ уже передан службе доставки (принимает статус `DELIVERY` или `PICKUP`) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.  Чтобы узнать, какие заказы были отменены в статусе `DELIVERY` или `PICKUP`, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр `onlyWaitingForCancellationApprove=true`. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.  Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.  |**⚙️ Лимит:** 500 запросов в час| |-| 
//
empty_api_response_t*
OrdersAPI_acceptOrderCancellation(apiClient_t *apiClient, long campaignId, long orderId, accept_order_cancellation_request_t *accept_order_cancellation_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept");


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




    // Body Param
    cJSON *localVarSingleItemJSON_accept_order_cancellation_request = NULL;
    if (accept_order_cancellation_request != NULL)
    {
        //string
        localVarSingleItemJSON_accept_order_cancellation_request = accept_order_cancellation_request_convertToJSON(accept_order_cancellation_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_accept_order_cancellation_request);
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
    //    printf("%s\n","Ответ на отмену заказа был успешно передан.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_accept_order_cancellation_request) {
        cJSON_Delete(localVarSingleItemJSON_accept_order_cancellation_request);
        localVarSingleItemJSON_accept_order_cancellation_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация об одном заказе
//
// Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_response_t*
OrdersAPI_getOrder(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}");


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
    //    printf("%s\n","Информация о заказе.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_order_response_t *elementToReturn = get_order_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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

// Информация о нескольких заказах
//
// Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_response_t*
OrdersAPI_getOrders(apiClient_t *apiClient, long campaignId, list_t *orderIds, list_t *status, list_t *substatus, char fromDate, char toDate, char supplierShipmentDateFrom, char supplierShipmentDateTo, char updatedAtFrom, char updatedAtTo, order_delivery_dispatch_type_e dispatchType, int *fake, int *hasCis, int *onlyWaitingForCancellationApprove, int *onlyEstimatedDelivery, order_buyer_type_e buyerType, int *page, int *pageSize, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders");


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
    if (orderIds)
    {
        list_addElement(localVarQueryParameters,orderIds);
    }

    // query parameters
    if (status)
    {
        list_addElement(localVarQueryParameters,status);
    }

    // query parameters
    if (substatus)
    {
        list_addElement(localVarQueryParameters,substatus);
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
    char *keyQuery_supplierShipmentDateFrom = NULL;
    char valueQuery_supplierShipmentDateFrom ;
    keyValuePair_t *keyPairQuery_supplierShipmentDateFrom = 0;
    if (supplierShipmentDateFrom)
    {
        keyQuery_supplierShipmentDateFrom = strdup("supplierShipmentDateFrom");
        valueQuery_supplierShipmentDateFrom = (supplierShipmentDateFrom);
        keyPairQuery_supplierShipmentDateFrom = keyValuePair_create(keyQuery_supplierShipmentDateFrom, &valueQuery_supplierShipmentDateFrom);
        list_addElement(localVarQueryParameters,keyPairQuery_supplierShipmentDateFrom);
    }

    // query parameters
    char *keyQuery_supplierShipmentDateTo = NULL;
    char valueQuery_supplierShipmentDateTo ;
    keyValuePair_t *keyPairQuery_supplierShipmentDateTo = 0;
    if (supplierShipmentDateTo)
    {
        keyQuery_supplierShipmentDateTo = strdup("supplierShipmentDateTo");
        valueQuery_supplierShipmentDateTo = (supplierShipmentDateTo);
        keyPairQuery_supplierShipmentDateTo = keyValuePair_create(keyQuery_supplierShipmentDateTo, &valueQuery_supplierShipmentDateTo);
        list_addElement(localVarQueryParameters,keyPairQuery_supplierShipmentDateTo);
    }

    // query parameters
    char *keyQuery_updatedAtFrom = NULL;
    char valueQuery_updatedAtFrom ;
    keyValuePair_t *keyPairQuery_updatedAtFrom = 0;
    if (updatedAtFrom)
    {
        keyQuery_updatedAtFrom = strdup("updatedAtFrom");
        valueQuery_updatedAtFrom = (updatedAtFrom);
        keyPairQuery_updatedAtFrom = keyValuePair_create(keyQuery_updatedAtFrom, &valueQuery_updatedAtFrom);
        list_addElement(localVarQueryParameters,keyPairQuery_updatedAtFrom);
    }

    // query parameters
    char *keyQuery_updatedAtTo = NULL;
    char valueQuery_updatedAtTo ;
    keyValuePair_t *keyPairQuery_updatedAtTo = 0;
    if (updatedAtTo)
    {
        keyQuery_updatedAtTo = strdup("updatedAtTo");
        valueQuery_updatedAtTo = (updatedAtTo);
        keyPairQuery_updatedAtTo = keyValuePair_create(keyQuery_updatedAtTo, &valueQuery_updatedAtTo);
        list_addElement(localVarQueryParameters,keyPairQuery_updatedAtTo);
    }

    // query parameters
    char *keyQuery_dispatchType = NULL;
    order_delivery_dispatch_type_e valueQuery_dispatchType ;
    keyValuePair_t *keyPairQuery_dispatchType = 0;
    if (dispatchType)
    {
        keyQuery_dispatchType = strdup("dispatchType");
        valueQuery_dispatchType = (dispatchType);
        keyPairQuery_dispatchType = keyValuePair_create(keyQuery_dispatchType, (void *)strdup(getOrders__ToString(
        &valueQuery_dispatchType)));
        list_addElement(localVarQueryParameters,keyPairQuery_dispatchType);
    }

    // query parameters
    char *keyQuery_fake = NULL;
    char * valueQuery_fake = NULL;
    keyValuePair_t *keyPairQuery_fake = 0;
    if (fake)
    {
        keyQuery_fake = strdup("fake");
        valueQuery_fake = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_fake, MAX_NUMBER_LENGTH, "%d", *fake);
        keyPairQuery_fake = keyValuePair_create(keyQuery_fake, valueQuery_fake);
        list_addElement(localVarQueryParameters,keyPairQuery_fake);
    }

    // query parameters
    char *keyQuery_hasCis = NULL;
    char * valueQuery_hasCis = NULL;
    keyValuePair_t *keyPairQuery_hasCis = 0;
    if (hasCis)
    {
        keyQuery_hasCis = strdup("hasCis");
        valueQuery_hasCis = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_hasCis, MAX_NUMBER_LENGTH, "%d", *hasCis);
        keyPairQuery_hasCis = keyValuePair_create(keyQuery_hasCis, valueQuery_hasCis);
        list_addElement(localVarQueryParameters,keyPairQuery_hasCis);
    }

    // query parameters
    char *keyQuery_onlyWaitingForCancellationApprove = NULL;
    char * valueQuery_onlyWaitingForCancellationApprove = NULL;
    keyValuePair_t *keyPairQuery_onlyWaitingForCancellationApprove = 0;
    if (onlyWaitingForCancellationApprove)
    {
        keyQuery_onlyWaitingForCancellationApprove = strdup("onlyWaitingForCancellationApprove");
        valueQuery_onlyWaitingForCancellationApprove = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_onlyWaitingForCancellationApprove, MAX_NUMBER_LENGTH, "%d", *onlyWaitingForCancellationApprove);
        keyPairQuery_onlyWaitingForCancellationApprove = keyValuePair_create(keyQuery_onlyWaitingForCancellationApprove, valueQuery_onlyWaitingForCancellationApprove);
        list_addElement(localVarQueryParameters,keyPairQuery_onlyWaitingForCancellationApprove);
    }

    // query parameters
    char *keyQuery_onlyEstimatedDelivery = NULL;
    char * valueQuery_onlyEstimatedDelivery = NULL;
    keyValuePair_t *keyPairQuery_onlyEstimatedDelivery = 0;
    if (onlyEstimatedDelivery)
    {
        keyQuery_onlyEstimatedDelivery = strdup("onlyEstimatedDelivery");
        valueQuery_onlyEstimatedDelivery = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_onlyEstimatedDelivery, MAX_NUMBER_LENGTH, "%d", *onlyEstimatedDelivery);
        keyPairQuery_onlyEstimatedDelivery = keyValuePair_create(keyQuery_onlyEstimatedDelivery, valueQuery_onlyEstimatedDelivery);
        list_addElement(localVarQueryParameters,keyPairQuery_onlyEstimatedDelivery);
    }

    // query parameters
    char *keyQuery_buyerType = NULL;
    order_buyer_type_e valueQuery_buyerType ;
    keyValuePair_t *keyPairQuery_buyerType = 0;
    if (buyerType)
    {
        keyQuery_buyerType = strdup("buyerType");
        valueQuery_buyerType = (buyerType);
        keyPairQuery_buyerType = keyValuePair_create(keyQuery_buyerType, (void *)strdup(getOrders__ToString(
        &valueQuery_buyerType)));
        list_addElement(localVarQueryParameters,keyPairQuery_buyerType);
    }

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
    //    printf("%s\n","Информация о заказах.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_orders_response_t *elementToReturn = get_orders_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if(keyQuery_supplierShipmentDateFrom){
        free(keyQuery_supplierShipmentDateFrom);
        keyQuery_supplierShipmentDateFrom = NULL;
    }
    if(keyPairQuery_supplierShipmentDateFrom){
        keyValuePair_free(keyPairQuery_supplierShipmentDateFrom);
        keyPairQuery_supplierShipmentDateFrom = NULL;
    }
    if(keyQuery_supplierShipmentDateTo){
        free(keyQuery_supplierShipmentDateTo);
        keyQuery_supplierShipmentDateTo = NULL;
    }
    if(keyPairQuery_supplierShipmentDateTo){
        keyValuePair_free(keyPairQuery_supplierShipmentDateTo);
        keyPairQuery_supplierShipmentDateTo = NULL;
    }
    if(keyQuery_updatedAtFrom){
        free(keyQuery_updatedAtFrom);
        keyQuery_updatedAtFrom = NULL;
    }
    if(keyPairQuery_updatedAtFrom){
        keyValuePair_free(keyPairQuery_updatedAtFrom);
        keyPairQuery_updatedAtFrom = NULL;
    }
    if(keyQuery_updatedAtTo){
        free(keyQuery_updatedAtTo);
        keyQuery_updatedAtTo = NULL;
    }
    if(keyPairQuery_updatedAtTo){
        keyValuePair_free(keyPairQuery_updatedAtTo);
        keyPairQuery_updatedAtTo = NULL;
    }
    if(keyQuery_dispatchType){
        free(keyQuery_dispatchType);
        keyQuery_dispatchType = NULL;
    }
    if(keyPairQuery_dispatchType){
        keyValuePair_free(keyPairQuery_dispatchType);
        keyPairQuery_dispatchType = NULL;
    }
    if(keyQuery_fake){
        free(keyQuery_fake);
        keyQuery_fake = NULL;
    }
    if(valueQuery_fake){
        free(valueQuery_fake);
        valueQuery_fake = NULL;
    }
    if(keyPairQuery_fake){
        keyValuePair_free(keyPairQuery_fake);
        keyPairQuery_fake = NULL;
    }
    if(keyQuery_hasCis){
        free(keyQuery_hasCis);
        keyQuery_hasCis = NULL;
    }
    if(valueQuery_hasCis){
        free(valueQuery_hasCis);
        valueQuery_hasCis = NULL;
    }
    if(keyPairQuery_hasCis){
        keyValuePair_free(keyPairQuery_hasCis);
        keyPairQuery_hasCis = NULL;
    }
    if(keyQuery_onlyWaitingForCancellationApprove){
        free(keyQuery_onlyWaitingForCancellationApprove);
        keyQuery_onlyWaitingForCancellationApprove = NULL;
    }
    if(valueQuery_onlyWaitingForCancellationApprove){
        free(valueQuery_onlyWaitingForCancellationApprove);
        valueQuery_onlyWaitingForCancellationApprove = NULL;
    }
    if(keyPairQuery_onlyWaitingForCancellationApprove){
        keyValuePair_free(keyPairQuery_onlyWaitingForCancellationApprove);
        keyPairQuery_onlyWaitingForCancellationApprove = NULL;
    }
    if(keyQuery_onlyEstimatedDelivery){
        free(keyQuery_onlyEstimatedDelivery);
        keyQuery_onlyEstimatedDelivery = NULL;
    }
    if(valueQuery_onlyEstimatedDelivery){
        free(valueQuery_onlyEstimatedDelivery);
        valueQuery_onlyEstimatedDelivery = NULL;
    }
    if(keyPairQuery_onlyEstimatedDelivery){
        keyValuePair_free(keyPairQuery_onlyEstimatedDelivery);
        keyPairQuery_onlyEstimatedDelivery = NULL;
    }
    if(keyQuery_buyerType){
        free(keyQuery_buyerType);
        keyQuery_buyerType = NULL;
    }
    if(keyPairQuery_buyerType){
        keyValuePair_free(keyPairQuery_buyerType);
        keyPairQuery_buyerType = NULL;
    }
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

// Передача ключей цифровых товаров
//
// Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус `DELIVERED`.  Ключ нужно передать в течение 30 минут после перехода заказа в статус `PROCESSING`.  Если в один заказ входят несколько ключей, передавайте их все в одном запросе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
OrdersAPI_provideOrderDigitalCodes(apiClient_t *apiClient, long campaignId, long orderId, provide_order_digital_codes_request_t *provide_order_digital_codes_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods");


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




    // Body Param
    cJSON *localVarSingleItemJSON_provide_order_digital_codes_request = NULL;
    if (provide_order_digital_codes_request != NULL)
    {
        //string
        localVarSingleItemJSON_provide_order_digital_codes_request = provide_order_digital_codes_request_convertToJSON(provide_order_digital_codes_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_provide_order_digital_codes_request);
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_provide_order_digital_codes_request) {
        cJSON_Delete(localVarSingleItemJSON_provide_order_digital_codes_request);
        localVarSingleItemJSON_provide_order_digital_codes_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача кодов маркировки единиц товара
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
provide_order_item_identifiers_response_t*
OrdersAPI_provideOrderItemIdentifiers(apiClient_t *apiClient, long campaignId, long orderId, provide_order_item_identifiers_request_t *provide_order_item_identifiers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/identifiers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/identifiers");


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




    // Body Param
    cJSON *localVarSingleItemJSON_provide_order_item_identifiers_request = NULL;
    if (provide_order_item_identifiers_request != NULL)
    {
        //string
        localVarSingleItemJSON_provide_order_item_identifiers_request = provide_order_item_identifiers_request_convertToJSON(provide_order_item_identifiers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_provide_order_item_identifiers_request);
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
    //    printf("%s\n","Ответ 200 обозначает, что коды успешно записались. Ответ содержит краткие сведения о промаркированных товарах.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    provide_order_item_identifiers_response_t *elementToReturn = provide_order_item_identifiers_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_provide_order_item_identifiers_request) {
        cJSON_Delete(localVarSingleItemJSON_provide_order_item_identifiers_request);
        localVarSingleItemJSON_provide_order_item_identifiers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Подготовка заказа
//
// {% note tip \"Подходит и для DBS\" %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос `allowRemove: true`. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \"Удаление нельзя отменить\" %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \"Товар умещается в коробку\" %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"fullCount\": 3,                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           },                           {                               \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"                           },                           {                               \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"                           }                       ]                   },                   {                       \"id\": 654321,                       \"fullCount\": 1                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Товар едет в разных коробках\" %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_box_layout_response_t*
OrdersAPI_setOrderBoxLayout(apiClient_t *apiClient, long campaignId, long orderId, set_order_box_layout_request_t *set_order_box_layout_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/boxes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/boxes");


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




    // Body Param
    cJSON *localVarSingleItemJSON_set_order_box_layout_request = NULL;
    if (set_order_box_layout_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_order_box_layout_request = set_order_box_layout_request_convertToJSON(set_order_box_layout_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_order_box_layout_request);
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
    //    printf("%s\n","В ответ придет переданная раскладка с идентификаторами коробок — они понадобятся для запроса ярлыков. ");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    set_order_box_layout_response_t *elementToReturn = set_order_box_layout_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_set_order_box_layout_request) {
        cJSON_Delete(localVarSingleItemJSON_set_order_box_layout_request);
        localVarSingleItemJSON_set_order_box_layout_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача количества грузовых мест в заказе
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \"Как было раньше\" %}  Структура тела PUT-запроса:  ``` {   \"boxes\":   [     {       \"fulfilmentId\": \"{string}\",       \"weight\": {int64},       \"width\": {int64},       \"height\": {int64},       \"depth\": {int64},       \"items\":       [         {           \"id\": {int64},           \"count\": {int32}         },         ...       ]     },     ...   ] } ``` | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `boxes`       |           | Список грузовых мест.       |  **Параметры, вложенные в `boxes`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. | | `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | `width`       | Int64   | Ширина грузового места в сантиметрах.       | | `height`       | Int64   | Высота грузового места в сантиметрах.       | | `depth`       | Int64   | Глубина грузового места в сантиметрах.        | | `items`       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в `items`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `id`       | Int64     | Идентификатор товара в рамках заказа.   | | `count`    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_shipment_boxes_response_t*
OrdersAPI_setOrderShipmentBoxes(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, set_order_shipment_boxes_request_t *set_order_shipment_boxes_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_order_shipment_boxes_request = NULL;
    if (set_order_shipment_boxes_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_order_shipment_boxes_request = set_order_shipment_boxes_request_convertToJSON(set_order_shipment_boxes_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_order_shipment_boxes_request);
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
    //    printf("%s\n","Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество грузомест записано.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    set_order_shipment_boxes_response_t *elementToReturn = set_order_shipment_boxes_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    free(localVarToReplace_shipmentId);
    if (localVarSingleItemJSON_set_order_shipment_boxes_request) {
        cJSON_Delete(localVarSingleItemJSON_set_order_shipment_boxes_request);
        localVarSingleItemJSON_set_order_shipment_boxes_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товара из заказа или уменьшение числа единиц
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.  Чтобы полностью удалить товар из заказа:  * передайте значение `0`; или * не передавайте параметр `item`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
void
OrdersAPI_updateOrderItems(apiClient_t *apiClient, long campaignId, long orderId, update_order_item_request_t *update_order_item_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/items")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/items");


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




    // Body Param
    cJSON *localVarSingleItemJSON_update_order_item_request = NULL;
    if (update_order_item_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_item_request = update_order_item_request_convertToJSON(update_order_item_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_item_request);
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
    //    printf("%s\n","Маркет успешно обработал ваш запрос. Выходные данные не ожидаются.");
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
    //No return type
end:
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
    if (localVarSingleItemJSON_update_order_item_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_item_request);
        localVarSingleItemJSON_update_order_item_request = NULL;
    }
    free(localVarBodyParameters);

}

// Изменение статуса одного заказа
//
// Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_status_response_t*
OrdersAPI_updateOrderStatus(apiClient_t *apiClient, long campaignId, long orderId, update_order_status_request_t *update_order_status_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/status")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/status");


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




    // Body Param
    cJSON *localVarSingleItemJSON_update_order_status_request = NULL;
    if (update_order_status_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_status_request = update_order_status_request_convertToJSON(update_order_status_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_status_request);
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
    //    printf("%s\n","В случае успешного изменения статуса заказа возвращается обновленная информация о заказе.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_order_status_response_t *elementToReturn = update_order_status_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_order_status_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_status_request);
        localVarSingleItemJSON_update_order_status_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение статусов нескольких заказов
//
// Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_statuses_response_t*
OrdersAPI_updateOrderStatuses(apiClient_t *apiClient, long campaignId, update_order_statuses_request_t *update_order_statuses_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/status-update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/status-update");


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
    cJSON *localVarSingleItemJSON_update_order_statuses_request = NULL;
    if (update_order_statuses_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_statuses_request = update_order_statuses_request_convertToJSON(update_order_statuses_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_statuses_request);
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
    //    printf("%s\n","Возвращается информация об обновленных статусах заказов.");
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
    cJSON *OrdersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_order_statuses_response_t *elementToReturn = update_order_statuses_response_parseFromJSON(OrdersAPIlocalVarJSON);
    cJSON_Delete(OrdersAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_order_statuses_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_statuses_request);
        localVarSingleItemJSON_update_order_statuses_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

