/*
 * update_order_statuses_response.h
 *
 * 
 */

#ifndef _update_order_statuses_response_H_
#define _update_order_statuses_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_statuses_response_t update_order_statuses_response_t;

#include "api_response_status_type.h"
#include "update_order_statuses_dto.h"

// Enum  for update_order_statuses_response

typedef enum  { _api__update_order_statuses_response__NULL = 0, _api__update_order_statuses_response__OK, _api__update_order_statuses_response__ERROR } _api__update_order_statuses_response__e;

char* update_order_statuses_response_status_ToString(_api__update_order_statuses_response__e status);

_api__update_order_statuses_response__e update_order_statuses_response_status_FromString(char* status);



typedef struct update_order_statuses_response_t {
    api_response_status_type_t *status; // custom
    struct update_order_statuses_dto_t *result; //model

} update_order_statuses_response_t;

update_order_statuses_response_t *update_order_statuses_response_create(
    api_response_status_type_t *status,
    update_order_statuses_dto_t *result
);

void update_order_statuses_response_free(update_order_statuses_response_t *update_order_statuses_response);

update_order_statuses_response_t *update_order_statuses_response_parseFromJSON(cJSON *update_order_statuses_responseJSON);

cJSON *update_order_statuses_response_convertToJSON(update_order_statuses_response_t *update_order_statuses_response);

#endif /* _update_order_statuses_response_H_ */

