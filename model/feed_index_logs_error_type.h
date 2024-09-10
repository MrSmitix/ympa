/*
 * feed_index_logs_error_type.h
 *
 * Тип ошибки индексации прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;.  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 */

#ifndef _feed_index_logs_error_type_H_
#define _feed_index_logs_error_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_error_type_t feed_index_logs_error_type_t;


// Enum  for feed_index_logs_error_type

typedef enum { _api__feed_index_logs_error_type__NULL = 0, _api__feed_index_logs_error_type__DOWNLOAD_ERROR, _api__feed_index_logs_error_type__DOWNLOAD_HTTP_ERROR, _api__feed_index_logs_error_type__PARSE_ERROR, _api__feed_index_logs_error_type__PARSE_XML_ERROR, _api__feed_index_logs_error_type__TOO_MANY_REJECTED_OFFERS, _api__feed_index_logs_error_type__NOT_INDEXED } _api__feed_index_logs_error_type__e;

char* feed_index_logs_error_type_feed_index_logs_error_type_ToString(_api__feed_index_logs_error_type__e feed_index_logs_error_type);

_api__feed_index_logs_error_type__e feed_index_logs_error_type_feed_index_logs_error_type_FromString(char* feed_index_logs_error_type);

//cJSON *feed_index_logs_error_type_feed_index_logs_error_type_convertToJSON(_api__feed_index_logs_error_type__e feed_index_logs_error_type);

//_api__feed_index_logs_error_type__e feed_index_logs_error_type_feed_index_logs_error_type_parseFromJSON(cJSON *feed_index_logs_error_typeJSON);

#endif /* _feed_index_logs_error_type_H_ */

