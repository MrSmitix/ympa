/*
 * get_suggested_offer_mappings_request.h
 *
 * 
 */

#ifndef _get_suggested_offer_mappings_request_H_
#define _get_suggested_offer_mappings_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_suggested_offer_mappings_request_t get_suggested_offer_mappings_request_t;

#include "suggested_offer_dto.h"



typedef struct get_suggested_offer_mappings_request_t {
    list_t *offers; //nonprimitive container

} get_suggested_offer_mappings_request_t;

get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request_create(
    list_t *offers
);

void get_suggested_offer_mappings_request_free(get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request);

get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request_parseFromJSON(cJSON *get_suggested_offer_mappings_requestJSON);

cJSON *get_suggested_offer_mappings_request_convertToJSON(get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request);

#endif /* _get_suggested_offer_mappings_request_H_ */

