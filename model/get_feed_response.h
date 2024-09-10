/*
 * get_feed_response.h
 *
 * Ответ на запрос информации о прайс-листе.
 */

#ifndef _get_feed_response_H_
#define _get_feed_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_feed_response_t get_feed_response_t;

#include "feed_dto.h"



typedef struct get_feed_response_t {
    struct feed_dto_t *feed; //model

} get_feed_response_t;

get_feed_response_t *get_feed_response_create(
    feed_dto_t *feed
);

void get_feed_response_free(get_feed_response_t *get_feed_response);

get_feed_response_t *get_feed_response_parseFromJSON(cJSON *get_feed_responseJSON);

cJSON *get_feed_response_convertToJSON(get_feed_response_t *get_feed_response);

#endif /* _get_feed_response_H_ */

