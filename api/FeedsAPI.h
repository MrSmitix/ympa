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
#include "../model/api_locked_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/empty_api_response.h"
#include "../model/feed_index_logs_status_type.h"
#include "../model/get_feed_index_logs_response.h"
#include "../model/get_feed_response.h"
#include "../model/get_feeds_response.h"
#include "../model/set_feed_params_request.h"

// Enum  for FeedsAPI_getFeedIndexLogs
typedef enum  { _api__getFeedIndexLogs__NULL = 0, _api__getFeedIndexLogs__ERROR, _api__getFeedIndexLogs__OK, _api__getFeedIndexLogs__WARNING } _api__getFeedIndexLogs_status_e;


// Информация о прайс-листе
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feed_response_t*
FeedsAPI_getFeed(apiClient_t *apiClient, long campaignId, long feedId);


// Отчет по индексации прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_feed_index_logs_response_t*
FeedsAPI_getFeedIndexLogs(apiClient_t *apiClient, long campaignId, long feedId, int *limit, char published_time_from, char published_time_to, feed_index_logs_status_type_e status);


// Список прайс-листов магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feeds_response_t*
FeedsAPI_getFeeds(apiClient_t *apiClient, long campaignId);


// Сообщить, что прайс-лист обновился
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
FeedsAPI_refreshFeed(apiClient_t *apiClient, long campaignId, long feedId);


// Изменение параметров прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
FeedsAPI_setFeedParams(apiClient_t *apiClient, long campaignId, long feedId, set_feed_params_request_t *set_feed_params_request);


