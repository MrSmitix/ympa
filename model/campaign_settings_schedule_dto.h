/*
 * campaign_settings_schedule_dto.h
 *
 * Расписание работы службы доставки в своем регионе.
 */

#ifndef _campaign_settings_schedule_dto_H_
#define _campaign_settings_schedule_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_settings_schedule_dto_t campaign_settings_schedule_dto_t;

#include "campaign_settings_time_period_dto.h"



typedef struct campaign_settings_schedule_dto_t {
    int available_on_holidays; //boolean
    list_t *custom_holidays; //primitive container
    list_t *custom_working_days; //primitive container
    struct campaign_settings_time_period_dto_t *period; //model
    list_t *total_holidays; //primitive container
    list_t *weekly_holidays; //primitive container

} campaign_settings_schedule_dto_t;

campaign_settings_schedule_dto_t *campaign_settings_schedule_dto_create(
    int available_on_holidays,
    list_t *custom_holidays,
    list_t *custom_working_days,
    campaign_settings_time_period_dto_t *period,
    list_t *total_holidays,
    list_t *weekly_holidays
);

void campaign_settings_schedule_dto_free(campaign_settings_schedule_dto_t *campaign_settings_schedule_dto);

campaign_settings_schedule_dto_t *campaign_settings_schedule_dto_parseFromJSON(cJSON *campaign_settings_schedule_dtoJSON);

cJSON *campaign_settings_schedule_dto_convertToJSON(campaign_settings_schedule_dto_t *campaign_settings_schedule_dto);

#endif /* _campaign_settings_schedule_dto_H_ */

