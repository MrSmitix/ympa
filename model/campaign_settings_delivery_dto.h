/*
 * campaign_settings_delivery_dto.h
 *
 * Информация о доставке в своем регионе магазина.
 */

#ifndef _campaign_settings_delivery_dto_H_
#define _campaign_settings_delivery_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_settings_delivery_dto_t campaign_settings_delivery_dto_t;

#include "campaign_settings_schedule_dto.h"



typedef struct campaign_settings_delivery_dto_t {
    struct campaign_settings_schedule_dto_t *schedule; //model

} campaign_settings_delivery_dto_t;

campaign_settings_delivery_dto_t *campaign_settings_delivery_dto_create(
    campaign_settings_schedule_dto_t *schedule
);

void campaign_settings_delivery_dto_free(campaign_settings_delivery_dto_t *campaign_settings_delivery_dto);

campaign_settings_delivery_dto_t *campaign_settings_delivery_dto_parseFromJSON(cJSON *campaign_settings_delivery_dtoJSON);

cJSON *campaign_settings_delivery_dto_convertToJSON(campaign_settings_delivery_dto_t *campaign_settings_delivery_dto);

#endif /* _campaign_settings_delivery_dto_H_ */

