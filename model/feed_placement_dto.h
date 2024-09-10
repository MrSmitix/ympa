/*
 * feed_placement_dto.h
 *
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */

#ifndef _feed_placement_dto_H_
#define _feed_placement_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_placement_dto_t feed_placement_dto_t;

#include "feed_status_type.h"

// Enum  for feed_placement_dto

typedef enum  { _api__feed_placement_dto__NULL = 0, _api__feed_placement_dto__ERROR, _api__feed_placement_dto__NA, _api__feed_placement_dto__OK } _api__feed_placement_dto__e;

char* feed_placement_dto_status_ToString(_api__feed_placement_dto__e status);

_api__feed_placement_dto__e feed_placement_dto_status_FromString(char* status);



typedef struct feed_placement_dto_t {
    feed_status_type_t *status; // custom
    int total_offers_count; //numeric

} feed_placement_dto_t;

feed_placement_dto_t *feed_placement_dto_create(
    feed_status_type_t *status,
    int total_offers_count
);

void feed_placement_dto_free(feed_placement_dto_t *feed_placement_dto);

feed_placement_dto_t *feed_placement_dto_parseFromJSON(cJSON *feed_placement_dtoJSON);

cJSON *feed_placement_dto_convertToJSON(feed_placement_dto_t *feed_placement_dto);

#endif /* _feed_placement_dto_H_ */

