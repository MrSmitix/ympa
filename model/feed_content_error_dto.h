/*
 * feed_content_error_dto.h
 *
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
 */

#ifndef _feed_content_error_dto_H_
#define _feed_content_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_content_error_dto_t feed_content_error_dto_t;

#include "feed_content_error_type.h"

// Enum  for feed_content_error_dto

typedef enum  { _api__feed_content_error_dto__NULL = 0, _api__feed_content_error_dto__PARSE_ERROR, _api__feed_content_error_dto__PARSE_XML_ERROR, _api__feed_content_error_dto__TOO_MANY_REJECTED_OFFERS } _api__feed_content_error_dto__e;

char* feed_content_error_dto_type_ToString(_api__feed_content_error_dto__e type);

_api__feed_content_error_dto__e feed_content_error_dto_type_FromString(char* type);



typedef struct feed_content_error_dto_t {
    feed_content_error_type_t *type; // custom

} feed_content_error_dto_t;

feed_content_error_dto_t *feed_content_error_dto_create(
    feed_content_error_type_t *type
);

void feed_content_error_dto_free(feed_content_error_dto_t *feed_content_error_dto);

feed_content_error_dto_t *feed_content_error_dto_parseFromJSON(cJSON *feed_content_error_dtoJSON);

cJSON *feed_content_error_dto_convertToJSON(feed_content_error_dto_t *feed_content_error_dto);

#endif /* _feed_content_error_dto_H_ */

