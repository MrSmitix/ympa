/*
 * get_feeds_response.h
 *
 * Ответ на запрос списка прайс-листов.
 */

#ifndef _get_feeds_response_H_
#define _get_feeds_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_feeds_response_t get_feeds_response_t;

#include "feed_dto.h"



typedef struct get_feeds_response_t {
    list_t *feeds; //nonprimitive container

} get_feeds_response_t;

get_feeds_response_t *get_feeds_response_create(
    list_t *feeds
);

void get_feeds_response_free(get_feeds_response_t *get_feeds_response);

get_feeds_response_t *get_feeds_response_parseFromJSON(cJSON *get_feeds_responseJSON);

cJSON *get_feeds_response_convertToJSON(get_feeds_response_t *get_feeds_response);

#endif /* _get_feeds_response_H_ */

