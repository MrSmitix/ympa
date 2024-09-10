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
#include "../model/get_goods_stats_request.h"
#include "../model/get_goods_stats_response.h"


// Отчет по товарам
//
// Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_goods_stats_response_t*
GoodsStatsAPI_getGoodsStats(apiClient_t *apiClient, long campaignId, get_goods_stats_request_t *get_goods_stats_request);


