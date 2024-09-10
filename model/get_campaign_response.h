/*
 * get_campaign_response.h
 *
 * Информация о магазине к данным идентификатора кампании.
 */

#ifndef _get_campaign_response_H_
#define _get_campaign_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_response_t get_campaign_response_t;

#include "campaign_dto.h"



typedef struct get_campaign_response_t {
    struct campaign_dto_t *campaign; //model

} get_campaign_response_t;

get_campaign_response_t *get_campaign_response_create(
    campaign_dto_t *campaign
);

void get_campaign_response_free(get_campaign_response_t *get_campaign_response);

get_campaign_response_t *get_campaign_response_parseFromJSON(cJSON *get_campaign_responseJSON);

cJSON *get_campaign_response_convertToJSON(get_campaign_response_t *get_campaign_response);

#endif /* _get_campaign_response_H_ */

