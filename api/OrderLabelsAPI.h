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
#include "../model/get_order_labels_data_response.h"
#include "../model/page_format_type.h"

// Enum  for OrderLabelsAPI_generateOrderLabel
typedef enum  { _api__generateOrderLabel__NULL = 0, _api__generateOrderLabel__A7, _api__generateOrderLabel__A4 } _api__generateOrderLabel_format_e;

// Enum  for OrderLabelsAPI_generateOrderLabels
typedef enum  { _api__generateOrderLabels__NULL = 0, _api__generateOrderLabels__A7, _api__generateOrderLabels__A4 } _api__generateOrderLabels_format_e;


// Готовый ярлык‑наклейка для коробки в заказе
//
// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
OrderLabelsAPI_generateOrderLabel(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, long boxId, page_format_type_e format);


// Готовые ярлыки‑наклейки на все коробки в одном заказе
//
// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
OrderLabelsAPI_generateOrderLabels(apiClient_t *apiClient, long campaignId, long orderId, page_format_type_e format);


// Данные для самостоятельного изготовления ярлыков
//
// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_labels_data_response_t*
OrderLabelsAPI_getOrderLabelsData(apiClient_t *apiClient, long campaignId, long orderId);


