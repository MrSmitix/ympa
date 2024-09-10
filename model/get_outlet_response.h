/*
 * get_outlet_response.h
 *
 * Ответ на запрос информации о точке продаж.
 */

#ifndef _get_outlet_response_H_
#define _get_outlet_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_outlet_response_t get_outlet_response_t;

#include "full_outlet_dto.h"



typedef struct get_outlet_response_t {
    struct full_outlet_dto_t *outlet; //model

} get_outlet_response_t;

get_outlet_response_t *get_outlet_response_create(
    full_outlet_dto_t *outlet
);

void get_outlet_response_free(get_outlet_response_t *get_outlet_response);

get_outlet_response_t *get_outlet_response_parseFromJSON(cJSON *get_outlet_responseJSON);

cJSON *get_outlet_response_convertToJSON(get_outlet_response_t *get_outlet_response);

#endif /* _get_outlet_response_H_ */

