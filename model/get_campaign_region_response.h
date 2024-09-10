/*
 * get_campaign_region_response.h
 *
 * Ответ на запрос региона магазина.
 */

#ifndef _get_campaign_region_response_H_
#define _get_campaign_region_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_region_response_t get_campaign_region_response_t;

#include "region_dto.h"



typedef struct get_campaign_region_response_t {
    struct region_dto_t *region; //model

} get_campaign_region_response_t;

get_campaign_region_response_t *get_campaign_region_response_create(
    region_dto_t *region
);

void get_campaign_region_response_free(get_campaign_region_response_t *get_campaign_region_response);

get_campaign_region_response_t *get_campaign_region_response_parseFromJSON(cJSON *get_campaign_region_responseJSON);

cJSON *get_campaign_region_response_convertToJSON(get_campaign_region_response_t *get_campaign_region_response);

#endif /* _get_campaign_region_response_H_ */

