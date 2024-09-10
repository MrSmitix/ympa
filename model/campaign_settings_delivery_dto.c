#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_settings_delivery_dto.h"



campaign_settings_delivery_dto_t *campaign_settings_delivery_dto_create(
    campaign_settings_schedule_dto_t *schedule
    ) {
    campaign_settings_delivery_dto_t *campaign_settings_delivery_dto_local_var = malloc(sizeof(campaign_settings_delivery_dto_t));
    if (!campaign_settings_delivery_dto_local_var) {
        return NULL;
    }
    campaign_settings_delivery_dto_local_var->schedule = schedule;

    return campaign_settings_delivery_dto_local_var;
}


void campaign_settings_delivery_dto_free(campaign_settings_delivery_dto_t *campaign_settings_delivery_dto) {
    if(NULL == campaign_settings_delivery_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_settings_delivery_dto->schedule) {
        campaign_settings_schedule_dto_free(campaign_settings_delivery_dto->schedule);
        campaign_settings_delivery_dto->schedule = NULL;
    }
    free(campaign_settings_delivery_dto);
}

cJSON *campaign_settings_delivery_dto_convertToJSON(campaign_settings_delivery_dto_t *campaign_settings_delivery_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_settings_delivery_dto->schedule
    if(campaign_settings_delivery_dto->schedule) {
    cJSON *schedule_local_JSON = campaign_settings_schedule_dto_convertToJSON(campaign_settings_delivery_dto->schedule);
    if(schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "schedule", schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_settings_delivery_dto_t *campaign_settings_delivery_dto_parseFromJSON(cJSON *campaign_settings_delivery_dtoJSON){

    campaign_settings_delivery_dto_t *campaign_settings_delivery_dto_local_var = NULL;

    // define the local variable for campaign_settings_delivery_dto->schedule
    campaign_settings_schedule_dto_t *schedule_local_nonprim = NULL;

    // campaign_settings_delivery_dto->schedule
    cJSON *schedule = cJSON_GetObjectItemCaseSensitive(campaign_settings_delivery_dtoJSON, "schedule");
    if (schedule) { 
    schedule_local_nonprim = campaign_settings_schedule_dto_parseFromJSON(schedule); //nonprimitive
    }


    campaign_settings_delivery_dto_local_var = campaign_settings_delivery_dto_create (
        schedule ? schedule_local_nonprim : NULL
        );

    return campaign_settings_delivery_dto_local_var;
end:
    if (schedule_local_nonprim) {
        campaign_settings_schedule_dto_free(schedule_local_nonprim);
        schedule_local_nonprim = NULL;
    }
    return NULL;

}
