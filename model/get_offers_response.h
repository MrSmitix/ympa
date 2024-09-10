/*
 * get_offers_response.h
 *
 * Список предложений с пагинатором.
 */

#ifndef _get_offers_response_H_
#define _get_offers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_offers_response_t get_offers_response_t;

#include "flipping_pager_dto.h"
#include "offer_dto.h"



typedef struct get_offers_response_t {
    list_t *offers; //nonprimitive container
    struct flipping_pager_dto_t *pager; //model

} get_offers_response_t;

get_offers_response_t *get_offers_response_create(
    list_t *offers,
    flipping_pager_dto_t *pager
);

void get_offers_response_free(get_offers_response_t *get_offers_response);

get_offers_response_t *get_offers_response_parseFromJSON(cJSON *get_offers_responseJSON);

cJSON *get_offers_response_convertToJSON(get_offers_response_t *get_offers_response);

#endif /* _get_offers_response_H_ */

