/*
 * get_campaigns_response.h
 *
 * Результаты поиска магазинов.
 */

#ifndef _get_campaigns_response_H_
#define _get_campaigns_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaigns_response_t get_campaigns_response_t;

#include "campaign_dto.h"
#include "flipping_pager_dto.h"



typedef struct get_campaigns_response_t {
    list_t *campaigns; //nonprimitive container
    struct flipping_pager_dto_t *pager; //model

} get_campaigns_response_t;

get_campaigns_response_t *get_campaigns_response_create(
    list_t *campaigns,
    flipping_pager_dto_t *pager
);

void get_campaigns_response_free(get_campaigns_response_t *get_campaigns_response);

get_campaigns_response_t *get_campaigns_response_parseFromJSON(cJSON *get_campaigns_responseJSON);

cJSON *get_campaigns_response_convertToJSON(get_campaigns_response_t *get_campaigns_response);

#endif /* _get_campaigns_response_H_ */

