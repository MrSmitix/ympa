/*
 * feed_download_dto.h
 *
 * Информация о последней загрузке прайс-листа.
 */

#ifndef _feed_download_dto_H_
#define _feed_download_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_download_dto_t feed_download_dto_t;

#include "feed_download_error_dto.h"
#include "feed_status_type.h"

// Enum  for feed_download_dto

typedef enum  { _api__feed_download_dto__NULL = 0, _api__feed_download_dto__ERROR, _api__feed_download_dto__NA, _api__feed_download_dto__OK } _api__feed_download_dto__e;

char* feed_download_dto_status_ToString(_api__feed_download_dto__e status);

_api__feed_download_dto__e feed_download_dto_status_FromString(char* status);



typedef struct feed_download_dto_t {
    feed_status_type_t *status; // custom
    struct feed_download_error_dto_t *error; //model

} feed_download_dto_t;

feed_download_dto_t *feed_download_dto_create(
    feed_status_type_t *status,
    feed_download_error_dto_t *error
);

void feed_download_dto_free(feed_download_dto_t *feed_download_dto);

feed_download_dto_t *feed_download_dto_parseFromJSON(cJSON *feed_download_dtoJSON);

cJSON *feed_download_dto_convertToJSON(feed_download_dto_t *feed_download_dto);

#endif /* _feed_download_dto_H_ */

