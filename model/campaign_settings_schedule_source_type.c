#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_settings_schedule_source_type.h"


char* campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_ToString(_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type) {
    char *campaign_settings_schedule_source_typeArray[] =  { "NULL", "WEB", "YML" };
    return campaign_settings_schedule_source_typeArray[campaign_settings_schedule_source_type];
}

_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_FromString(char* campaign_settings_schedule_source_type) {
    int stringToReturn = 0;
    char *campaign_settings_schedule_source_typeArray[] =  { "NULL", "WEB", "YML" };
    size_t sizeofArray = sizeof(campaign_settings_schedule_source_typeArray) / sizeof(campaign_settings_schedule_source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_settings_schedule_source_type, campaign_settings_schedule_source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_convertToJSON(_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_settings_schedule_source_type", campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_ToString(campaign_settings_schedule_source_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_parseFromJSON(cJSON *campaign_settings_schedule_source_typeJSON) {
    _api__campaign_settings_schedule_source_type__e *campaign_settings_schedule_source_type = NULL;
    _api__campaign_settings_schedule_source_type__e campaign_settings_schedule_source_typeVariable;
    cJSON *campaign_settings_schedule_source_typeVar = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_source_typeJSON, "campaign_settings_schedule_source_type");
    if(!cJSON_IsString(campaign_settings_schedule_source_typeVar) || (campaign_settings_schedule_source_typeVar->valuestring == NULL)){
        goto end;
    }
    campaign_settings_schedule_source_typeVariable = campaign_settings_schedule_source_type_campaign_settings_schedule_source_type_FromString(campaign_settings_schedule_source_typeVar->valuestring);
    return campaign_settings_schedule_source_typeVariable;
end:
    return 0;
}
