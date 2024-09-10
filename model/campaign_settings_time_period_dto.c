#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_settings_time_period_dto.h"



campaign_settings_time_period_dto_t *campaign_settings_time_period_dto_create(
    char *from_date,
    char *to_date
    ) {
    campaign_settings_time_period_dto_t *campaign_settings_time_period_dto_local_var = malloc(sizeof(campaign_settings_time_period_dto_t));
    if (!campaign_settings_time_period_dto_local_var) {
        return NULL;
    }
    campaign_settings_time_period_dto_local_var->from_date = from_date;
    campaign_settings_time_period_dto_local_var->to_date = to_date;

    return campaign_settings_time_period_dto_local_var;
}


void campaign_settings_time_period_dto_free(campaign_settings_time_period_dto_t *campaign_settings_time_period_dto) {
    if(NULL == campaign_settings_time_period_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_settings_time_period_dto->from_date) {
        free(campaign_settings_time_period_dto->from_date);
        campaign_settings_time_period_dto->from_date = NULL;
    }
    if (campaign_settings_time_period_dto->to_date) {
        free(campaign_settings_time_period_dto->to_date);
        campaign_settings_time_period_dto->to_date = NULL;
    }
    free(campaign_settings_time_period_dto);
}

cJSON *campaign_settings_time_period_dto_convertToJSON(campaign_settings_time_period_dto_t *campaign_settings_time_period_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_settings_time_period_dto->from_date
    if(campaign_settings_time_period_dto->from_date) {
    if(cJSON_AddStringToObject(item, "fromDate", campaign_settings_time_period_dto->from_date) == NULL) {
    goto fail; //String
    }
    }


    // campaign_settings_time_period_dto->to_date
    if(campaign_settings_time_period_dto->to_date) {
    if(cJSON_AddStringToObject(item, "toDate", campaign_settings_time_period_dto->to_date) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_settings_time_period_dto_t *campaign_settings_time_period_dto_parseFromJSON(cJSON *campaign_settings_time_period_dtoJSON){

    campaign_settings_time_period_dto_t *campaign_settings_time_period_dto_local_var = NULL;

    // campaign_settings_time_period_dto->from_date
    cJSON *from_date = cJSON_GetObjectItemCaseSensitive(campaign_settings_time_period_dtoJSON, "fromDate");
    if (from_date) { 
    if(!cJSON_IsString(from_date) && !cJSON_IsNull(from_date))
    {
    goto end; //String
    }
    }

    // campaign_settings_time_period_dto->to_date
    cJSON *to_date = cJSON_GetObjectItemCaseSensitive(campaign_settings_time_period_dtoJSON, "toDate");
    if (to_date) { 
    if(!cJSON_IsString(to_date) && !cJSON_IsNull(to_date))
    {
    goto end; //String
    }
    }


    campaign_settings_time_period_dto_local_var = campaign_settings_time_period_dto_create (
        from_date && !cJSON_IsNull(from_date) ? strdup(from_date->valuestring) : NULL,
        to_date && !cJSON_IsNull(to_date) ? strdup(to_date->valuestring) : NULL
        );

    return campaign_settings_time_period_dto_local_var;
end:
    return NULL;

}
