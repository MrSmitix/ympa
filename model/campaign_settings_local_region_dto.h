/*
 * campaign_settings_local_region_dto.h
 *
 * Информация о своем регионе магазина.
 */

#ifndef _campaign_settings_local_region_dto_H_
#define _campaign_settings_local_region_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_settings_local_region_dto_t campaign_settings_local_region_dto_t;

#include "campaign_settings_delivery_dto.h"
#include "campaign_settings_schedule_source_type.h"
#include "region_type.h"

// Enum  for campaign_settings_local_region_dto

typedef enum  { _api__campaign_settings_local_region_dto__NULL = 0, _api__campaign_settings_local_region_dto__OTHER, _api__campaign_settings_local_region_dto__CONTINENT, _api__campaign_settings_local_region_dto__REGION, _api__campaign_settings_local_region_dto__COUNTRY, _api__campaign_settings_local_region_dto__COUNTRY_DISTRICT, _api__campaign_settings_local_region_dto__REPUBLIC, _api__campaign_settings_local_region_dto__CITY, _api__campaign_settings_local_region_dto__VILLAGE, _api__campaign_settings_local_region_dto__CITY_DISTRICT, _api__campaign_settings_local_region_dto__SUBWAY_STATION, _api__campaign_settings_local_region_dto__REPUBLIC_AREA } _api__campaign_settings_local_region_dto__e;

char* campaign_settings_local_region_dto_type_ToString(_api__campaign_settings_local_region_dto__e type);

_api__campaign_settings_local_region_dto__e campaign_settings_local_region_dto_type_FromString(char* type);

// Enum  for campaign_settings_local_region_dto

typedef enum  { _api__campaign_settings_local_region_dto__NULL = 0, _api__campaign_settings_local_region_dto__WEB, _api__campaign_settings_local_region_dto__YML } _api__campaign_settings_local_region_dto__e;

char* campaign_settings_local_region_dto_delivery_options_source_ToString(_api__campaign_settings_local_region_dto__e delivery_options_source);

_api__campaign_settings_local_region_dto__e campaign_settings_local_region_dto_delivery_options_source_FromString(char* delivery_options_source);



typedef struct campaign_settings_local_region_dto_t {
    long id; //numeric
    char *name; // string
    region_type_t *type; // custom
    campaign_settings_schedule_source_type_t *delivery_options_source; // custom
    struct campaign_settings_delivery_dto_t *delivery; //model

} campaign_settings_local_region_dto_t;

campaign_settings_local_region_dto_t *campaign_settings_local_region_dto_create(
    long id,
    char *name,
    region_type_t *type,
    campaign_settings_schedule_source_type_t *delivery_options_source,
    campaign_settings_delivery_dto_t *delivery
);

void campaign_settings_local_region_dto_free(campaign_settings_local_region_dto_t *campaign_settings_local_region_dto);

campaign_settings_local_region_dto_t *campaign_settings_local_region_dto_parseFromJSON(cJSON *campaign_settings_local_region_dtoJSON);

cJSON *campaign_settings_local_region_dto_convertToJSON(campaign_settings_local_region_dto_t *campaign_settings_local_region_dto);

#endif /* _campaign_settings_local_region_dto_H_ */

