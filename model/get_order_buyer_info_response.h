/*
 * get_order_buyer_info_response.h
 *
 * 
 */

#ifndef _get_order_buyer_info_response_H_
#define _get_order_buyer_info_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_order_buyer_info_response_t get_order_buyer_info_response_t;

#include "api_response_status_type.h"
#include "order_buyer_info_dto.h"

// Enum  for get_order_buyer_info_response

typedef enum  { _api__get_order_buyer_info_response__NULL = 0, _api__get_order_buyer_info_response__OK, _api__get_order_buyer_info_response__ERROR } _api__get_order_buyer_info_response__e;

char* get_order_buyer_info_response_status_ToString(_api__get_order_buyer_info_response__e status);

_api__get_order_buyer_info_response__e get_order_buyer_info_response_status_FromString(char* status);



typedef struct get_order_buyer_info_response_t {
    api_response_status_type_t *status; // custom
    struct order_buyer_info_dto_t *result; //model

} get_order_buyer_info_response_t;

get_order_buyer_info_response_t *get_order_buyer_info_response_create(
    api_response_status_type_t *status,
    order_buyer_info_dto_t *result
);

void get_order_buyer_info_response_free(get_order_buyer_info_response_t *get_order_buyer_info_response);

get_order_buyer_info_response_t *get_order_buyer_info_response_parseFromJSON(cJSON *get_order_buyer_info_responseJSON);

cJSON *get_order_buyer_info_response_convertToJSON(get_order_buyer_info_response_t *get_order_buyer_info_response);

#endif /* _get_order_buyer_info_response_H_ */

