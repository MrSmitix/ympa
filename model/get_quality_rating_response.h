/*
 * get_quality_rating_response.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef _get_quality_rating_response_H_
#define _get_quality_rating_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_quality_rating_response_t get_quality_rating_response_t;

#include "api_response_status_type.h"
#include "campaigns_quality_rating_dto.h"

// Enum  for get_quality_rating_response

typedef enum  { _api__get_quality_rating_response__NULL = 0, _api__get_quality_rating_response__OK, _api__get_quality_rating_response__ERROR } _api__get_quality_rating_response__e;

char* get_quality_rating_response_status_ToString(_api__get_quality_rating_response__e status);

_api__get_quality_rating_response__e get_quality_rating_response_status_FromString(char* status);



typedef struct get_quality_rating_response_t {
    api_response_status_type_t *status; // custom
    struct campaigns_quality_rating_dto_t *result; //model

} get_quality_rating_response_t;

get_quality_rating_response_t *get_quality_rating_response_create(
    api_response_status_type_t *status,
    campaigns_quality_rating_dto_t *result
);

void get_quality_rating_response_free(get_quality_rating_response_t *get_quality_rating_response);

get_quality_rating_response_t *get_quality_rating_response_parseFromJSON(cJSON *get_quality_rating_responseJSON);

cJSON *get_quality_rating_response_convertToJSON(get_quality_rating_response_t *get_quality_rating_response);

#endif /* _get_quality_rating_response_H_ */

