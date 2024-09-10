/*
 * feed_publication_dto.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */

#ifndef _feed_publication_dto_H_
#define _feed_publication_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_publication_dto_t feed_publication_dto_t;

#include "feed_publication_full_dto.h"
#include "feed_publication_price_and_stock_update_dto.h"
#include "feed_status_type.h"

// Enum  for feed_publication_dto

typedef enum  { _api__feed_publication_dto__NULL = 0, _api__feed_publication_dto__ERROR, _api__feed_publication_dto__NA, _api__feed_publication_dto__OK } _api__feed_publication_dto__e;

char* feed_publication_dto_status_ToString(_api__feed_publication_dto__e status);

_api__feed_publication_dto__e feed_publication_dto_status_FromString(char* status);



typedef struct feed_publication_dto_t {
    feed_status_type_t *status; // custom
    struct feed_publication_full_dto_t *full; //model
    struct feed_publication_price_and_stock_update_dto_t *price_and_stock_update; //model

} feed_publication_dto_t;

feed_publication_dto_t *feed_publication_dto_create(
    feed_status_type_t *status,
    feed_publication_full_dto_t *full,
    feed_publication_price_and_stock_update_dto_t *price_and_stock_update
);

void feed_publication_dto_free(feed_publication_dto_t *feed_publication_dto);

feed_publication_dto_t *feed_publication_dto_parseFromJSON(cJSON *feed_publication_dtoJSON);

cJSON *feed_publication_dto_convertToJSON(feed_publication_dto_t *feed_publication_dto);

#endif /* _feed_publication_dto_H_ */

