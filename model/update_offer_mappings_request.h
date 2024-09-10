/*
 * update_offer_mappings_request.h
 *
 * 
 */

#ifndef _update_offer_mappings_request_H_
#define _update_offer_mappings_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_mappings_request_t update_offer_mappings_request_t;

#include "update_offer_mapping_dto.h"



typedef struct update_offer_mappings_request_t {
    list_t *offer_mappings; //nonprimitive container
    int only_partner_media_content; //boolean

} update_offer_mappings_request_t;

update_offer_mappings_request_t *update_offer_mappings_request_create(
    list_t *offer_mappings,
    int only_partner_media_content
);

void update_offer_mappings_request_free(update_offer_mappings_request_t *update_offer_mappings_request);

update_offer_mappings_request_t *update_offer_mappings_request_parseFromJSON(cJSON *update_offer_mappings_requestJSON);

cJSON *update_offer_mappings_request_convertToJSON(update_offer_mappings_request_t *update_offer_mappings_request);

#endif /* _update_offer_mappings_request_H_ */

