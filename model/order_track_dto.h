/*
 * order_track_dto.h
 *
 * Информация о трек-номере посылки (DBS).
 */

#ifndef _order_track_dto_H_
#define _order_track_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_track_dto_t order_track_dto_t;




typedef struct order_track_dto_t {
    char *track_code; // string
    long delivery_service_id; //numeric

} order_track_dto_t;

order_track_dto_t *order_track_dto_create(
    char *track_code,
    long delivery_service_id
);

void order_track_dto_free(order_track_dto_t *order_track_dto);

order_track_dto_t *order_track_dto_parseFromJSON(cJSON *order_track_dtoJSON);

cJSON *order_track_dto_convertToJSON(order_track_dto_t *order_track_dto);

#endif /* _order_track_dto_H_ */

