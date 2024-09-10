/*
 * feed_download_error_dto.h
 *
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */

#ifndef _feed_download_error_dto_H_
#define _feed_download_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_download_error_dto_t feed_download_error_dto_t;

#include "feed_download_error_type.h"

// Enum  for feed_download_error_dto

typedef enum  { _api__feed_download_error_dto__NULL = 0, _api__feed_download_error_dto__DOWNLOAD_ERROR, _api__feed_download_error_dto__DOWNLOAD_HTTP_ERROR } _api__feed_download_error_dto__e;

char* feed_download_error_dto_type_ToString(_api__feed_download_error_dto__e type);

_api__feed_download_error_dto__e feed_download_error_dto_type_FromString(char* type);



typedef struct feed_download_error_dto_t {
    int http_status_code; //numeric
    feed_download_error_type_t *type; // custom
    char *description; // string

} feed_download_error_dto_t;

feed_download_error_dto_t *feed_download_error_dto_create(
    int http_status_code,
    feed_download_error_type_t *type,
    char *description
);

void feed_download_error_dto_free(feed_download_error_dto_t *feed_download_error_dto);

feed_download_error_dto_t *feed_download_error_dto_parseFromJSON(cJSON *feed_download_error_dtoJSON);

cJSON *feed_download_error_dto_convertToJSON(feed_download_error_dto_t *feed_download_error_dto);

#endif /* _feed_download_error_dto_H_ */

