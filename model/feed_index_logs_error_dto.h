/*
 * feed_index_logs_error_dto.h
 *
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
 */

#ifndef _feed_index_logs_error_dto_H_
#define _feed_index_logs_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_error_dto_t feed_index_logs_error_dto_t;

#include "feed_index_logs_error_type.h"

// Enum  for feed_index_logs_error_dto

typedef enum  { _api__feed_index_logs_error_dto__NULL = 0, _api__feed_index_logs_error_dto__DOWNLOAD_ERROR, _api__feed_index_logs_error_dto__DOWNLOAD_HTTP_ERROR, _api__feed_index_logs_error_dto__PARSE_ERROR, _api__feed_index_logs_error_dto__PARSE_XML_ERROR, _api__feed_index_logs_error_dto__TOO_MANY_REJECTED_OFFERS, _api__feed_index_logs_error_dto__NOT_INDEXED } _api__feed_index_logs_error_dto__e;

char* feed_index_logs_error_dto_type_ToString(_api__feed_index_logs_error_dto__e type);

_api__feed_index_logs_error_dto__e feed_index_logs_error_dto_type_FromString(char* type);



typedef struct feed_index_logs_error_dto_t {
    int http_status_code; //numeric
    feed_index_logs_error_type_t *type; // custom
    char *description; // string

} feed_index_logs_error_dto_t;

feed_index_logs_error_dto_t *feed_index_logs_error_dto_create(
    int http_status_code,
    feed_index_logs_error_type_t *type,
    char *description
);

void feed_index_logs_error_dto_free(feed_index_logs_error_dto_t *feed_index_logs_error_dto);

feed_index_logs_error_dto_t *feed_index_logs_error_dto_parseFromJSON(cJSON *feed_index_logs_error_dtoJSON);

cJSON *feed_index_logs_error_dto_convertToJSON(feed_index_logs_error_dto_t *feed_index_logs_error_dto);

#endif /* _feed_index_logs_error_dto_H_ */

