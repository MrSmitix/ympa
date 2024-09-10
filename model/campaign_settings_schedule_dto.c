#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_settings_schedule_dto.h"



campaign_settings_schedule_dto_t *campaign_settings_schedule_dto_create(
    int available_on_holidays,
    list_t *custom_holidays,
    list_t *custom_working_days,
    campaign_settings_time_period_dto_t *period,
    list_t *total_holidays,
    list_t *weekly_holidays
    ) {
    campaign_settings_schedule_dto_t *campaign_settings_schedule_dto_local_var = malloc(sizeof(campaign_settings_schedule_dto_t));
    if (!campaign_settings_schedule_dto_local_var) {
        return NULL;
    }
    campaign_settings_schedule_dto_local_var->available_on_holidays = available_on_holidays;
    campaign_settings_schedule_dto_local_var->custom_holidays = custom_holidays;
    campaign_settings_schedule_dto_local_var->custom_working_days = custom_working_days;
    campaign_settings_schedule_dto_local_var->period = period;
    campaign_settings_schedule_dto_local_var->total_holidays = total_holidays;
    campaign_settings_schedule_dto_local_var->weekly_holidays = weekly_holidays;

    return campaign_settings_schedule_dto_local_var;
}


void campaign_settings_schedule_dto_free(campaign_settings_schedule_dto_t *campaign_settings_schedule_dto) {
    if(NULL == campaign_settings_schedule_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_settings_schedule_dto->custom_holidays) {
        list_ForEach(listEntry, campaign_settings_schedule_dto->custom_holidays) {
            free(listEntry->data);
        }
        list_freeList(campaign_settings_schedule_dto->custom_holidays);
        campaign_settings_schedule_dto->custom_holidays = NULL;
    }
    if (campaign_settings_schedule_dto->custom_working_days) {
        list_ForEach(listEntry, campaign_settings_schedule_dto->custom_working_days) {
            free(listEntry->data);
        }
        list_freeList(campaign_settings_schedule_dto->custom_working_days);
        campaign_settings_schedule_dto->custom_working_days = NULL;
    }
    if (campaign_settings_schedule_dto->period) {
        campaign_settings_time_period_dto_free(campaign_settings_schedule_dto->period);
        campaign_settings_schedule_dto->period = NULL;
    }
    if (campaign_settings_schedule_dto->total_holidays) {
        list_ForEach(listEntry, campaign_settings_schedule_dto->total_holidays) {
            free(listEntry->data);
        }
        list_freeList(campaign_settings_schedule_dto->total_holidays);
        campaign_settings_schedule_dto->total_holidays = NULL;
    }
    if (campaign_settings_schedule_dto->weekly_holidays) {
        list_ForEach(listEntry, campaign_settings_schedule_dto->weekly_holidays) {
            free(listEntry->data);
        }
        list_freeList(campaign_settings_schedule_dto->weekly_holidays);
        campaign_settings_schedule_dto->weekly_holidays = NULL;
    }
    free(campaign_settings_schedule_dto);
}

cJSON *campaign_settings_schedule_dto_convertToJSON(campaign_settings_schedule_dto_t *campaign_settings_schedule_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_settings_schedule_dto->available_on_holidays
    if(campaign_settings_schedule_dto->available_on_holidays) {
    if(cJSON_AddBoolToObject(item, "availableOnHolidays", campaign_settings_schedule_dto->available_on_holidays) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_settings_schedule_dto->custom_holidays
    if (!campaign_settings_schedule_dto->custom_holidays) {
        goto fail;
    }
    cJSON *custom_holidays = cJSON_AddArrayToObject(item, "customHolidays");
    if(custom_holidays == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_holidaysListEntry;
    list_ForEach(custom_holidaysListEntry, campaign_settings_schedule_dto->custom_holidays) {
    if(cJSON_AddStringToObject(custom_holidays, "", (char*)custom_holidaysListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // campaign_settings_schedule_dto->custom_working_days
    if (!campaign_settings_schedule_dto->custom_working_days) {
        goto fail;
    }
    cJSON *custom_working_days = cJSON_AddArrayToObject(item, "customWorkingDays");
    if(custom_working_days == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_working_daysListEntry;
    list_ForEach(custom_working_daysListEntry, campaign_settings_schedule_dto->custom_working_days) {
    if(cJSON_AddStringToObject(custom_working_days, "", (char*)custom_working_daysListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // campaign_settings_schedule_dto->period
    if(campaign_settings_schedule_dto->period) {
    cJSON *period_local_JSON = campaign_settings_time_period_dto_convertToJSON(campaign_settings_schedule_dto->period);
    if(period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "period", period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_settings_schedule_dto->total_holidays
    if (!campaign_settings_schedule_dto->total_holidays) {
        goto fail;
    }
    cJSON *total_holidays = cJSON_AddArrayToObject(item, "totalHolidays");
    if(total_holidays == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *total_holidaysListEntry;
    list_ForEach(total_holidaysListEntry, campaign_settings_schedule_dto->total_holidays) {
    if(cJSON_AddStringToObject(total_holidays, "", (char*)total_holidaysListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // campaign_settings_schedule_dto->weekly_holidays
    if (!campaign_settings_schedule_dto->weekly_holidays) {
        goto fail;
    }
    cJSON *weekly_holidays = cJSON_AddArrayToObject(item, "weeklyHolidays");
    if(weekly_holidays == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *weekly_holidaysListEntry;
    list_ForEach(weekly_holidaysListEntry, campaign_settings_schedule_dto->weekly_holidays) {
    if(cJSON_AddNumberToObject(weekly_holidays, "", *(double *)weekly_holidaysListEntry->data) == NULL)
    {
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

campaign_settings_schedule_dto_t *campaign_settings_schedule_dto_parseFromJSON(cJSON *campaign_settings_schedule_dtoJSON){

    campaign_settings_schedule_dto_t *campaign_settings_schedule_dto_local_var = NULL;

    // define the local list for campaign_settings_schedule_dto->custom_holidays
    list_t *custom_holidaysList = NULL;

    // define the local list for campaign_settings_schedule_dto->custom_working_days
    list_t *custom_working_daysList = NULL;

    // define the local variable for campaign_settings_schedule_dto->period
    campaign_settings_time_period_dto_t *period_local_nonprim = NULL;

    // define the local list for campaign_settings_schedule_dto->total_holidays
    list_t *total_holidaysList = NULL;

    // define the local list for campaign_settings_schedule_dto->weekly_holidays
    list_t *weekly_holidaysList = NULL;

    // campaign_settings_schedule_dto->available_on_holidays
    cJSON *available_on_holidays = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_dtoJSON, "availableOnHolidays");
    if (available_on_holidays) { 
    if(!cJSON_IsBool(available_on_holidays))
    {
    goto end; //Bool
    }
    }

    // campaign_settings_schedule_dto->custom_holidays
    cJSON *custom_holidays = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_dtoJSON, "customHolidays");
    if (!custom_holidays) {
        goto end;
    }

    
    cJSON *custom_holidays_local = NULL;
    if(!cJSON_IsArray(custom_holidays)) {
        goto end;//primitive container
    }
    custom_holidaysList = list_createList();

    cJSON_ArrayForEach(custom_holidays_local, custom_holidays)
    {
        if(!cJSON_IsString(custom_holidays_local))
        {
            goto end;
        }
        list_addElement(custom_holidaysList , strdup(custom_holidays_local->valuestring));
    }

    // campaign_settings_schedule_dto->custom_working_days
    cJSON *custom_working_days = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_dtoJSON, "customWorkingDays");
    if (!custom_working_days) {
        goto end;
    }

    
    cJSON *custom_working_days_local = NULL;
    if(!cJSON_IsArray(custom_working_days)) {
        goto end;//primitive container
    }
    custom_working_daysList = list_createList();

    cJSON_ArrayForEach(custom_working_days_local, custom_working_days)
    {
        if(!cJSON_IsString(custom_working_days_local))
        {
            goto end;
        }
        list_addElement(custom_working_daysList , strdup(custom_working_days_local->valuestring));
    }

    // campaign_settings_schedule_dto->period
    cJSON *period = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_dtoJSON, "period");
    if (period) { 
    period_local_nonprim = campaign_settings_time_period_dto_parseFromJSON(period); //nonprimitive
    }

    // campaign_settings_schedule_dto->total_holidays
    cJSON *total_holidays = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_dtoJSON, "totalHolidays");
    if (!total_holidays) {
        goto end;
    }

    
    cJSON *total_holidays_local = NULL;
    if(!cJSON_IsArray(total_holidays)) {
        goto end;//primitive container
    }
    total_holidaysList = list_createList();

    cJSON_ArrayForEach(total_holidays_local, total_holidays)
    {
        if(!cJSON_IsString(total_holidays_local))
        {
            goto end;
        }
        list_addElement(total_holidaysList , strdup(total_holidays_local->valuestring));
    }

    // campaign_settings_schedule_dto->weekly_holidays
    cJSON *weekly_holidays = cJSON_GetObjectItemCaseSensitive(campaign_settings_schedule_dtoJSON, "weeklyHolidays");
    if (!weekly_holidays) {
        goto end;
    }

    
    cJSON *weekly_holidays_local = NULL;
    if(!cJSON_IsArray(weekly_holidays)) {
        goto end;//primitive container
    }
    weekly_holidaysList = list_createList();

    cJSON_ArrayForEach(weekly_holidays_local, weekly_holidays)
    {
        if(!cJSON_IsNumber(weekly_holidays_local))
        {
            goto end;
        }
        double *weekly_holidays_local_value = (double *)calloc(1, sizeof(double));
        if(!weekly_holidays_local_value)
        {
            goto end;
        }
        *weekly_holidays_local_value = weekly_holidays_local->valuedouble;
        list_addElement(weekly_holidaysList , weekly_holidays_local_value);
    }


    campaign_settings_schedule_dto_local_var = campaign_settings_schedule_dto_create (
        available_on_holidays ? available_on_holidays->valueint : 0,
        custom_holidaysList,
        custom_working_daysList,
        period ? period_local_nonprim : NULL,
        total_holidaysList,
        weekly_holidaysList
        );

    return campaign_settings_schedule_dto_local_var;
end:
    if (custom_holidaysList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_holidaysList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_holidaysList);
        custom_holidaysList = NULL;
    }
    if (custom_working_daysList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_working_daysList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_working_daysList);
        custom_working_daysList = NULL;
    }
    if (period_local_nonprim) {
        campaign_settings_time_period_dto_free(period_local_nonprim);
        period_local_nonprim = NULL;
    }
    if (total_holidaysList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, total_holidaysList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(total_holidaysList);
        total_holidaysList = NULL;
    }
    if (weekly_holidaysList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, weekly_holidaysList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(weekly_holidaysList);
        weekly_holidaysList = NULL;
    }
    return NULL;

}
