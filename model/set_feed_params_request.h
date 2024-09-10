/*
 * set_feed_params_request.h
 *
 * Запрос на обновление изменение параметров прайс-листа.
 */

#ifndef _set_feed_params_request_H_
#define _set_feed_params_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_feed_params_request_t set_feed_params_request_t;

#include "feed_parameter_dto.h"



typedef struct set_feed_params_request_t {
    list_t *parameters; //nonprimitive container

} set_feed_params_request_t;

set_feed_params_request_t *set_feed_params_request_create(
    list_t *parameters
);

void set_feed_params_request_free(set_feed_params_request_t *set_feed_params_request);

set_feed_params_request_t *set_feed_params_request_parseFromJSON(cJSON *set_feed_params_requestJSON);

cJSON *set_feed_params_request_convertToJSON(set_feed_params_request_t *set_feed_params_request);

#endif /* _set_feed_params_request_H_ */

