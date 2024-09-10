/*
 * feed_content_dto.h
 *
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */

#ifndef _feed_content_dto_H_
#define _feed_content_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_content_dto_t feed_content_dto_t;

#include "feed_content_error_dto.h"
#include "feed_status_type.h"

// Enum  for feed_content_dto

typedef enum  { _api__feed_content_dto__NULL = 0, _api__feed_content_dto__ERROR, _api__feed_content_dto__NA, _api__feed_content_dto__OK } _api__feed_content_dto__e;

char* feed_content_dto_status_ToString(_api__feed_content_dto__e status);

_api__feed_content_dto__e feed_content_dto_status_FromString(char* status);



typedef struct feed_content_dto_t {
    long rejected_offers_count; //numeric
    feed_status_type_t *status; // custom
    long total_offers_count; //numeric
    struct feed_content_error_dto_t *error; //model

} feed_content_dto_t;

feed_content_dto_t *feed_content_dto_create(
    long rejected_offers_count,
    feed_status_type_t *status,
    long total_offers_count,
    feed_content_error_dto_t *error
);

void feed_content_dto_free(feed_content_dto_t *feed_content_dto);

feed_content_dto_t *feed_content_dto_parseFromJSON(cJSON *feed_content_dtoJSON);

cJSON *feed_content_dto_convertToJSON(feed_content_dto_t *feed_content_dto);

#endif /* _feed_content_dto_H_ */

