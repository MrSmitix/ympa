/*
 * campaign_settings_dto.h
 *
 * Настройки магазина.
 */

#ifndef _campaign_settings_dto_H_
#define _campaign_settings_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_settings_dto_t campaign_settings_dto_t;

#include "campaign_settings_local_region_dto.h"



typedef struct campaign_settings_dto_t {
    long country_region; //numeric
    char *shop_name; // string
    int show_in_context; //boolean
    int show_in_premium; //boolean
    int use_open_stat; //boolean
    struct campaign_settings_local_region_dto_t *local_region; //model

} campaign_settings_dto_t;

campaign_settings_dto_t *campaign_settings_dto_create(
    long country_region,
    char *shop_name,
    int show_in_context,
    int show_in_premium,
    int use_open_stat,
    campaign_settings_local_region_dto_t *local_region
);

void campaign_settings_dto_free(campaign_settings_dto_t *campaign_settings_dto);

campaign_settings_dto_t *campaign_settings_dto_parseFromJSON(cJSON *campaign_settings_dtoJSON);

cJSON *campaign_settings_dto_convertToJSON(campaign_settings_dto_t *campaign_settings_dto);

#endif /* _campaign_settings_dto_H_ */

