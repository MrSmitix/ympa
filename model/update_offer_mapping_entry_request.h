/*
 * update_offer_mapping_entry_request.h
 *
 * Запрос на обновление товаров.
 */

#ifndef _update_offer_mapping_entry_request_H_
#define _update_offer_mapping_entry_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_mapping_entry_request_t update_offer_mapping_entry_request_t;

#include "update_offer_mapping_entry_dto.h"



typedef struct update_offer_mapping_entry_request_t {
    list_t *offer_mapping_entries; //nonprimitive container

} update_offer_mapping_entry_request_t;

update_offer_mapping_entry_request_t *update_offer_mapping_entry_request_create(
    list_t *offer_mapping_entries
);

void update_offer_mapping_entry_request_free(update_offer_mapping_entry_request_t *update_offer_mapping_entry_request);

update_offer_mapping_entry_request_t *update_offer_mapping_entry_request_parseFromJSON(cJSON *update_offer_mapping_entry_requestJSON);

cJSON *update_offer_mapping_entry_request_convertToJSON(update_offer_mapping_entry_request_t *update_offer_mapping_entry_request);

#endif /* _update_offer_mapping_entry_request_H_ */

