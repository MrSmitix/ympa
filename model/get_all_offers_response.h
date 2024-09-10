/*
 * get_all_offers_response.h
 *
 * Список предложений.
 */

#ifndef _get_all_offers_response_H_
#define _get_all_offers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_all_offers_response_t get_all_offers_response_t;

#include "offer_dto.h"



typedef struct get_all_offers_response_t {
    list_t *offers; //nonprimitive container

} get_all_offers_response_t;

get_all_offers_response_t *get_all_offers_response_create(
    list_t *offers
);

void get_all_offers_response_free(get_all_offers_response_t *get_all_offers_response);

get_all_offers_response_t *get_all_offers_response_parseFromJSON(cJSON *get_all_offers_responseJSON);

cJSON *get_all_offers_response_convertToJSON(get_all_offers_response_t *get_all_offers_response);

#endif /* _get_all_offers_response_H_ */

