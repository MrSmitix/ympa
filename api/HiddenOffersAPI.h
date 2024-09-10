#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/add_hidden_offers_request.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_locked_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/delete_hidden_offers_request.h"
#include "../model/empty_api_response.h"
#include "../model/get_hidden_offers_response.h"


// Скрытие товаров и настройки скрытия
//
// Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
HiddenOffersAPI_addHiddenOffers(apiClient_t *apiClient, long campaignId, add_hidden_offers_request_t *add_hidden_offers_request);


// Возобновление показа товаров
//
// Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
HiddenOffersAPI_deleteHiddenOffers(apiClient_t *apiClient, long campaignId, delete_hidden_offers_request_t *delete_hidden_offers_request);


// Информация о скрытых вами товарах
//
// Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_hidden_offers_response_t*
HiddenOffersAPI_getHiddenOffers(apiClient_t *apiClient, long campaignId, list_t *offer_id, char *page_token, int *limit, int *offset, int *page, int *pageSize);


