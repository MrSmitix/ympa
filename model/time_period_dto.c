#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "time_period_dto.h"


char* time_period_dto_time_unit_ToString(_api__time_period_dto__e time_unit) {
    char* time_unitArray[] =  { "NULL", "HOUR", "DAY", "WEEK", "MONTH", "YEAR" };
    return time_unitArray[time_unit];
}

_api__time_period_dto__e time_period_dto_time_unit_FromString(char* time_unit){
    int stringToReturn = 0;
    char *time_unitArray[] =  { "NULL", "HOUR", "DAY", "WEEK", "MONTH", "YEAR" };
    size_t sizeofArray = sizeof(time_unitArray) / sizeof(time_unitArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(time_unit, time_unitArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

time_period_dto_t *time_period_dto_create(
    int time_period,
    time_unit_type_t *time_unit,
    char *comment
    ) {
    time_period_dto_t *time_period_dto_local_var = malloc(sizeof(time_period_dto_t));
    if (!time_period_dto_local_var) {
        return NULL;
    }
    time_period_dto_local_var->time_period = time_period;
    time_period_dto_local_var->time_unit = time_unit;
    time_period_dto_local_var->comment = comment;

    return time_period_dto_local_var;
}


void time_period_dto_free(time_period_dto_t *time_period_dto) {
    if(NULL == time_period_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (time_period_dto->time_unit) {
        time_unit_type_free(time_period_dto->time_unit);
        time_period_dto->time_unit = NULL;
    }
    if (time_period_dto->comment) {
        free(time_period_dto->comment);
        time_period_dto->comment = NULL;
    }
    free(time_period_dto);
}

cJSON *time_period_dto_convertToJSON(time_period_dto_t *time_period_dto) {
    cJSON *item = cJSON_CreateObject();

    // time_period_dto->time_period
    if (!time_period_dto->time_period) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "timePeriod", time_period_dto->time_period) == NULL) {
    goto fail; //Numeric
    }


    // time_period_dto->time_unit
    if (_api__time_period_dto__NULL == time_period_dto->time_unit) {
        goto fail;
    }
    cJSON *time_unit_local_JSON = time_unit_type_convertToJSON(time_period_dto->time_unit);
    if(time_unit_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "timeUnit", time_unit_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // time_period_dto->comment
    if(time_period_dto->comment) {
    if(cJSON_AddStringToObject(item, "comment", time_period_dto->comment) == NULL) {
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

time_period_dto_t *time_period_dto_parseFromJSON(cJSON *time_period_dtoJSON){

    time_period_dto_t *time_period_dto_local_var = NULL;

    // define the local variable for time_period_dto->time_unit
    time_unit_type_t *time_unit_local_nonprim = NULL;

    // time_period_dto->time_period
    cJSON *time_period = cJSON_GetObjectItemCaseSensitive(time_period_dtoJSON, "timePeriod");
    if (!time_period) {
        goto end;
    }

    
    if(!cJSON_IsNumber(time_period))
    {
    goto end; //Numeric
    }

    // time_period_dto->time_unit
    cJSON *time_unit = cJSON_GetObjectItemCaseSensitive(time_period_dtoJSON, "timeUnit");
    if (!time_unit) {
        goto end;
    }

    
    time_unit_local_nonprim = time_unit_type_parseFromJSON(time_unit); //custom

    // time_period_dto->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(time_period_dtoJSON, "comment");
    if (comment) { 
    if(!cJSON_IsString(comment) && !cJSON_IsNull(comment))
    {
    goto end; //String
    }
    }


    time_period_dto_local_var = time_period_dto_create (
        time_period->valuedouble,
        time_unit_local_nonprim,
        comment && !cJSON_IsNull(comment) ? strdup(comment->valuestring) : NULL
        );

    return time_period_dto_local_var;
end:
    if (time_unit_local_nonprim) {
        time_unit_type_free(time_unit_local_nonprim);
        time_unit_local_nonprim = NULL;
    }
    return NULL;

}
