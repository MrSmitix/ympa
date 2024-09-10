/*
 * campaign_settings_schedule_source_type.h
 *
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 */

#ifndef _campaign_settings_schedule_source_type_H_
#define _campaign_settings_schedule_source_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_settings_schedule_source_type_t campaign_settings_schedule_source_type_t;


// Enum  for campaign_settings_schedule_source_type

typedef enum { _api__campaign_settings_schedule_source_type__NULL = 0, _api__campaign_settings_schedule_source_type__WEB, _api__campaign_settings_schedule_source_type__YML } _api__campaign_settings_schedule_source_type__e;

char* campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_ToString(_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type);

_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_FromString(char* campaign_settings_schedule_source_type);

//cJSON *campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_convertToJSON(_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type);

//_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_parseFromJSON(cJSON *campaign_settings_schedule_source_typeJSON);

#endif /* _campaign_settings_schedule_source_type_H_ */

