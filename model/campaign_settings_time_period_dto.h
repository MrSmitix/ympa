/*
 * campaign_settings_time_period_dto.h
 *
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */

#ifndef _campaign_settings_time_period_dto_H_
#define _campaign_settings_time_period_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_settings_time_period_dto_t campaign_settings_time_period_dto_t;




typedef struct campaign_settings_time_period_dto_t {
    char *from_date; // string
    char *to_date; // string

} campaign_settings_time_period_dto_t;

campaign_settings_time_period_dto_t *campaign_settings_time_period_dto_create(
    char *from_date,
    char *to_date
);

void campaign_settings_time_period_dto_free(campaign_settings_time_period_dto_t *campaign_settings_time_period_dto);

campaign_settings_time_period_dto_t *campaign_settings_time_period_dto_parseFromJSON(cJSON *campaign_settings_time_period_dtoJSON);

cJSON *campaign_settings_time_period_dto_convertToJSON(campaign_settings_time_period_dto_t *campaign_settings_time_period_dto);

#endif /* _campaign_settings_time_period_dto_H_ */

