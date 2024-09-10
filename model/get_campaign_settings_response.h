/*
 * get_campaign_settings_response.h
 *
 * Ответ на запрос настроек магазина.
 */

#ifndef _get_campaign_settings_response_H_
#define _get_campaign_settings_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_settings_response_t get_campaign_settings_response_t;

#include "campaign_settings_dto.h"



typedef struct get_campaign_settings_response_t {
    struct campaign_settings_dto_t *settings; //model

} get_campaign_settings_response_t;

get_campaign_settings_response_t *get_campaign_settings_response_create(
    campaign_settings_dto_t *settings
);

void get_campaign_settings_response_free(get_campaign_settings_response_t *get_campaign_settings_response);

get_campaign_settings_response_t *get_campaign_settings_response_parseFromJSON(cJSON *get_campaign_settings_responseJSON);

cJSON *get_campaign_settings_response_convertToJSON(get_campaign_settings_response_t *get_campaign_settings_response);

#endif /* _get_campaign_settings_response_H_ */

