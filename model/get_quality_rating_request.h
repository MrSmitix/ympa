/*
 * get_quality_rating_request.h
 *
 * Запрос информации по индексу качества.
 */

#ifndef _get_quality_rating_request_H_
#define _get_quality_rating_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_quality_rating_request_t get_quality_rating_request_t;




typedef struct get_quality_rating_request_t {
    char *date_from; //date
    char *date_to; //date
    list_t *campaign_ids; //primitive container

} get_quality_rating_request_t;

get_quality_rating_request_t *get_quality_rating_request_create(
    char *date_from,
    char *date_to,
    list_t *campaign_ids
);

void get_quality_rating_request_free(get_quality_rating_request_t *get_quality_rating_request);

get_quality_rating_request_t *get_quality_rating_request_parseFromJSON(cJSON *get_quality_rating_requestJSON);

cJSON *get_quality_rating_request_convertToJSON(get_quality_rating_request_t *get_quality_rating_request);

#endif /* _get_quality_rating_request_H_ */

