/*
 * get_promos_request.h
 *
 * Фильтры для получения списка акций.
 */

#ifndef _get_promos_request_H_
#define _get_promos_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promos_request_t get_promos_request_t;

#include "mechanics_type.h"
#include "promo_participation_type.h"

// Enum  for get_promos_request

typedef enum  { _api__get_promos_request__NULL = 0, _api__get_promos_request__PARTICIPATING_NOW, _api__get_promos_request__PARTICIPATED } _api__get_promos_request__e;

char* get_promos_request_participation_ToString(_api__get_promos_request__e participation);

_api__get_promos_request__e get_promos_request_participation_FromString(char* participation);

// Enum  for get_promos_request

typedef enum  { _api__get_promos_request__NULL = 0, _api__get_promos_request__DIRECT_DISCOUNT, _api__get_promos_request__BLUE_FLASH, _api__get_promos_request__MARKET_PROMOCODE } _api__get_promos_request__e;

char* get_promos_request_mechanics_ToString(_api__get_promos_request__e mechanics);

_api__get_promos_request__e get_promos_request_mechanics_FromString(char* mechanics);



typedef struct get_promos_request_t {
    promo_participation_type_t *participation; // custom
    mechanics_type_t *mechanics; // custom

} get_promos_request_t;

get_promos_request_t *get_promos_request_create(
    promo_participation_type_t *participation,
    mechanics_type_t *mechanics
);

void get_promos_request_free(get_promos_request_t *get_promos_request);

get_promos_request_t *get_promos_request_parseFromJSON(cJSON *get_promos_requestJSON);

cJSON *get_promos_request_convertToJSON(get_promos_request_t *get_promos_request);

#endif /* _get_promos_request_H_ */

