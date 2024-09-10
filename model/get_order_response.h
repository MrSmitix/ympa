/*
 * get_order_response.h
 *
 * 
 */

#ifndef _get_order_response_H_
#define _get_order_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_order_response_t get_order_response_t;

#include "order_dto.h"



typedef struct get_order_response_t {
    struct order_dto_t *order; //model

} get_order_response_t;

get_order_response_t *get_order_response_create(
    order_dto_t *order
);

void get_order_response_free(get_order_response_t *get_order_response);

get_order_response_t *get_order_response_parseFromJSON(cJSON *get_order_responseJSON);

cJSON *get_order_response_convertToJSON(get_order_response_t *get_order_response);

#endif /* _get_order_response_H_ */

