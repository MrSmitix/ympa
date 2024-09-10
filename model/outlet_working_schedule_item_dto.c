#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_working_schedule_item_dto.h"


char* outlet_working_schedule_item_dto_start_day_ToString(_api__outlet_working_schedule_item_dto__e start_day) {
    char* start_dayArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    return start_dayArray[start_day];
}

_api__outlet_working_schedule_item_dto__e outlet_working_schedule_item_dto_start_day_FromString(char* start_day){
    int stringToReturn = 0;
    char *start_dayArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    size_t sizeofArray = sizeof(start_dayArray) / sizeof(start_dayArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(start_day, start_dayArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* outlet_working_schedule_item_dto_end_day_ToString(_api__outlet_working_schedule_item_dto__e end_day) {
    char* end_dayArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    return end_dayArray[end_day];
}

_api__outlet_working_schedule_item_dto__e outlet_working_schedule_item_dto_end_day_FromString(char* end_day){
    int stringToReturn = 0;
    char *end_dayArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    size_t sizeofArray = sizeof(end_dayArray) / sizeof(end_dayArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(end_day, end_dayArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto_create(
    day_of_week_type_t *start_day,
    day_of_week_type_t *end_day,
    char *start_time,
    char *end_time
    ) {
    outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto_local_var = malloc(sizeof(outlet_working_schedule_item_dto_t));
    if (!outlet_working_schedule_item_dto_local_var) {
        return NULL;
    }
    outlet_working_schedule_item_dto_local_var->start_day = start_day;
    outlet_working_schedule_item_dto_local_var->end_day = end_day;
    outlet_working_schedule_item_dto_local_var->start_time = start_time;
    outlet_working_schedule_item_dto_local_var->end_time = end_time;

    return outlet_working_schedule_item_dto_local_var;
}


void outlet_working_schedule_item_dto_free(outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto) {
    if(NULL == outlet_working_schedule_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (outlet_working_schedule_item_dto->start_day) {
        day_of_week_type_free(outlet_working_schedule_item_dto->start_day);
        outlet_working_schedule_item_dto->start_day = NULL;
    }
    if (outlet_working_schedule_item_dto->end_day) {
        day_of_week_type_free(outlet_working_schedule_item_dto->end_day);
        outlet_working_schedule_item_dto->end_day = NULL;
    }
    if (outlet_working_schedule_item_dto->start_time) {
        free(outlet_working_schedule_item_dto->start_time);
        outlet_working_schedule_item_dto->start_time = NULL;
    }
    if (outlet_working_schedule_item_dto->end_time) {
        free(outlet_working_schedule_item_dto->end_time);
        outlet_working_schedule_item_dto->end_time = NULL;
    }
    free(outlet_working_schedule_item_dto);
}

cJSON *outlet_working_schedule_item_dto_convertToJSON(outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_working_schedule_item_dto->start_day
    if (_api__outlet_working_schedule_item_dto__NULL == outlet_working_schedule_item_dto->start_day) {
        goto fail;
    }
    cJSON *start_day_local_JSON = day_of_week_type_convertToJSON(outlet_working_schedule_item_dto->start_day);
    if(start_day_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "startDay", start_day_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // outlet_working_schedule_item_dto->end_day
    if (_api__outlet_working_schedule_item_dto__NULL == outlet_working_schedule_item_dto->end_day) {
        goto fail;
    }
    cJSON *end_day_local_JSON = day_of_week_type_convertToJSON(outlet_working_schedule_item_dto->end_day);
    if(end_day_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "endDay", end_day_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // outlet_working_schedule_item_dto->start_time
    if (!outlet_working_schedule_item_dto->start_time) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "startTime", outlet_working_schedule_item_dto->start_time) == NULL) {
    goto fail; //String
    }


    // outlet_working_schedule_item_dto->end_time
    if (!outlet_working_schedule_item_dto->end_time) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "endTime", outlet_working_schedule_item_dto->end_time) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto_parseFromJSON(cJSON *outlet_working_schedule_item_dtoJSON){

    outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto_local_var = NULL;

    // define the local variable for outlet_working_schedule_item_dto->start_day
    day_of_week_type_t *start_day_local_nonprim = NULL;

    // define the local variable for outlet_working_schedule_item_dto->end_day
    day_of_week_type_t *end_day_local_nonprim = NULL;

    // outlet_working_schedule_item_dto->start_day
    cJSON *start_day = cJSON_GetObjectItemCaseSensitive(outlet_working_schedule_item_dtoJSON, "startDay");
    if (!start_day) {
        goto end;
    }

    
    start_day_local_nonprim = day_of_week_type_parseFromJSON(start_day); //custom

    // outlet_working_schedule_item_dto->end_day
    cJSON *end_day = cJSON_GetObjectItemCaseSensitive(outlet_working_schedule_item_dtoJSON, "endDay");
    if (!end_day) {
        goto end;
    }

    
    end_day_local_nonprim = day_of_week_type_parseFromJSON(end_day); //custom

    // outlet_working_schedule_item_dto->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(outlet_working_schedule_item_dtoJSON, "startTime");
    if (!start_time) {
        goto end;
    }

    
    if(!cJSON_IsString(start_time))
    {
    goto end; //String
    }

    // outlet_working_schedule_item_dto->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(outlet_working_schedule_item_dtoJSON, "endTime");
    if (!end_time) {
        goto end;
    }

    
    if(!cJSON_IsString(end_time))
    {
    goto end; //String
    }


    outlet_working_schedule_item_dto_local_var = outlet_working_schedule_item_dto_create (
        start_day_local_nonprim,
        end_day_local_nonprim,
        strdup(start_time->valuestring),
        strdup(end_time->valuestring)
        );

    return outlet_working_schedule_item_dto_local_var;
end:
    if (start_day_local_nonprim) {
        day_of_week_type_free(start_day_local_nonprim);
        start_day_local_nonprim = NULL;
    }
    if (end_day_local_nonprim) {
        day_of_week_type_free(end_day_local_nonprim);
        end_day_local_nonprim = NULL;
    }
    return NULL;

}
