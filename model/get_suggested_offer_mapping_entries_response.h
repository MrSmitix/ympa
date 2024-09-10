/*
 * get_suggested_offer_mapping_entries_response.h
 *
 * Ответ со списком рекомендованных карточек товара.
 */

#ifndef _get_suggested_offer_mapping_entries_response_H_
#define _get_suggested_offer_mapping_entries_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_suggested_offer_mapping_entries_response_t get_suggested_offer_mapping_entries_response_t;

#include "api_response_status_type.h"
#include "offer_mapping_suggestions_list_dto.h"

// Enum  for get_suggested_offer_mapping_entries_response

typedef enum  { _api__get_suggested_offer_mapping_entries_response__NULL = 0, _api__get_suggested_offer_mapping_entries_response__OK, _api__get_suggested_offer_mapping_entries_response__ERROR } _api__get_suggested_offer_mapping_entries_response__e;

char* get_suggested_offer_mapping_entries_response_status_ToString(_api__get_suggested_offer_mapping_entries_response__e status);

_api__get_suggested_offer_mapping_entries_response__e get_suggested_offer_mapping_entries_response_status_FromString(char* status);



typedef struct get_suggested_offer_mapping_entries_response_t {
    api_response_status_type_t *status; // custom
    struct offer_mapping_suggestions_list_dto_t *result; //model

} get_suggested_offer_mapping_entries_response_t;

get_suggested_offer_mapping_entries_response_t *get_suggested_offer_mapping_entries_response_create(
    api_response_status_type_t *status,
    offer_mapping_suggestions_list_dto_t *result
);

void get_suggested_offer_mapping_entries_response_free(get_suggested_offer_mapping_entries_response_t *get_suggested_offer_mapping_entries_response);

get_suggested_offer_mapping_entries_response_t *get_suggested_offer_mapping_entries_response_parseFromJSON(cJSON *get_suggested_offer_mapping_entries_responseJSON);

cJSON *get_suggested_offer_mapping_entries_response_convertToJSON(get_suggested_offer_mapping_entries_response_t *get_suggested_offer_mapping_entries_response);

#endif /* _get_suggested_offer_mapping_entries_response_H_ */

