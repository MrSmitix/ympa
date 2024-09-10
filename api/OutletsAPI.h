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
#include "../model/change_outlet_request.h"
#include "../model/create_outlet_response.h"
#include "../model/empty_api_response.h"
#include "../model/get_outlet_response.h"
#include "../model/get_outlets_response.h"


// Создание точки продаж
//
// Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
create_outlet_response_t*
OutletsAPI_createOutlet(apiClient_t *apiClient, long campaignId, change_outlet_request_t *change_outlet_request);


// Удаление точки продаж
//
// Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
OutletsAPI_deleteOutlet(apiClient_t *apiClient, long campaignId, long outletId);


// Информация об одной точке продаж
//
// Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlet_response_t*
OutletsAPI_getOutlet(apiClient_t *apiClient, long campaignId, long outletId);


// Информация о нескольких точках продаж
//
// Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlets_response_t*
OutletsAPI_getOutlets(apiClient_t *apiClient, long campaignId, char *page_token, long region_id, char *shop_outlet_code, long regionId);


// Изменение информации о точке продаж
//
// Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
OutletsAPI_updateOutlet(apiClient_t *apiClient, long campaignId, long outletId, change_outlet_request_t *change_outlet_request);


