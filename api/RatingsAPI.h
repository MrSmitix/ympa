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
#include "../model/get_quality_rating_details_response.h"
#include "../model/get_quality_rating_request.h"
#include "../model/get_quality_rating_response.h"


// Заказы, которые повлияли на индекс качества
//
// Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
//
get_quality_rating_details_response_t*
RatingsAPI_getQualityRatingDetails(apiClient_t *apiClient, long campaignId);


// Индекс качества магазинов
//
// Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_quality_rating_response_t*
RatingsAPI_getQualityRatings(apiClient_t *apiClient, long businessId, get_quality_rating_request_t *get_quality_rating_request);


