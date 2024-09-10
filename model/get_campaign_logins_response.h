/*
 * get_campaign_logins_response.h
 *
 * Ответ на запрос списка логинов, связанных с магазином.
 */

#ifndef _get_campaign_logins_response_H_
#define _get_campaign_logins_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_logins_response_t get_campaign_logins_response_t;




typedef struct get_campaign_logins_response_t {
    list_t *logins; //primitive container

} get_campaign_logins_response_t;

get_campaign_logins_response_t *get_campaign_logins_response_create(
    list_t *logins
);

void get_campaign_logins_response_free(get_campaign_logins_response_t *get_campaign_logins_response);

get_campaign_logins_response_t *get_campaign_logins_response_parseFromJSON(cJSON *get_campaign_logins_responseJSON);

cJSON *get_campaign_logins_response_convertToJSON(get_campaign_logins_response_t *get_campaign_logins_response);

#endif /* _get_campaign_logins_response_H_ */

