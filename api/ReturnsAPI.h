#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/empty_api_response.h"
#include "../model/get_return_response.h"
#include "../model/get_returns_response.h"
#include "../model/refund_status_type.h"
#include "../model/return_type.h"
#include "../model/set_return_decision_request.h"

// Enum STATUSES for ReturnsAPI_getReturns
typedef enum  { _api__getReturns_STATUSES_NULL = 0, _api__getReturns_STATUSES_STARTED_BY_USER, _api__getReturns_STATUSES_REFUND_IN_PROGRESS, _api__getReturns_STATUSES_REFUNDED, _api__getReturns_STATUSES_FAILED, _api__getReturns_STATUSES_WAITING_FOR_DECISION, _api__getReturns_STATUSES_DECISION_MADE, _api__getReturns_STATUSES_REFUNDED_WITH_BONUSES, _api__getReturns_STATUSES_REFUNDED_BY_SHOP, _api__getReturns_STATUSES_CANCELLED, _api__getReturns_STATUSES_COMPLETE_WITHOUT_REFUND, _api__getReturns_STATUSES_UNKNOWN } _api__getReturns_statuses_e;

// Enum  for ReturnsAPI_getReturns
typedef enum  { _api__getReturns__NULL = 0, _api__getReturns__UNREDEEMED, _api__getReturns___RETURN } _api__getReturns_type_e;


// Информация о невыкупе или возврате
//
// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_return_response_t*
ReturnsAPI_getReturn(apiClient_t *apiClient, long campaignId, long orderId, long returnId);


// Получение заявления на возврат
//
// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
ReturnsAPI_getReturnApplication(apiClient_t *apiClient, long campaignId, long orderId, long returnId);


// Получение фотографии возврата
//
// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
ReturnsAPI_getReturnPhoto(apiClient_t *apiClient, long campaignId, long orderId, long returnId, long itemId, char *imageHash);


// Список невыкупов и возвратов
//
// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_returns_response_t*
ReturnsAPI_getReturns(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, list_t *orderIds, list_t *statuses, return_type_e type, char fromDate, char toDate, char from_date, char to_date);


// Принятие или изменение решения по возврату
//
// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
ReturnsAPI_setReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId, set_return_decision_request_t *set_return_decision_request);


// Подтверждение решения по возврату
//
// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
ReturnsAPI_submitReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId);


