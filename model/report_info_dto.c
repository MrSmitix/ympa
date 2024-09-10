#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "report_info_dto.h"


char* report_info_dto_status_ToString(_api__report_info_dto__e status) {
    char* statusArray[] =  { "NULL", "PENDING", "PROCESSING", "FAILED", "DONE" };
    return statusArray[status];
}

_api__report_info_dto__e report_info_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PENDING", "PROCESSING", "FAILED", "DONE" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* report_info_dto_sub_status_ToString(_api__report_info_dto__e sub_status) {
    char* sub_statusArray[] =  { "NULL", "NO_DATA", "TOO_LARGE", "RESOURCE_NOT_FOUND" };
    return sub_statusArray[sub_status];
}

_api__report_info_dto__e report_info_dto_sub_status_FromString(char* sub_status){
    int stringToReturn = 0;
    char *sub_statusArray[] =  { "NULL", "NO_DATA", "TOO_LARGE", "RESOURCE_NOT_FOUND" };
    size_t sizeofArray = sizeof(sub_statusArray) / sizeof(sub_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sub_status, sub_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

report_info_dto_t *report_info_dto_create(
    report_status_type_t *status,
    report_sub_status_type_t *sub_status,
    char *generation_requested_at,
    char *generation_finished_at,
    char *file,
    long estimated_generation_time
    ) {
    report_info_dto_t *report_info_dto_local_var = malloc(sizeof(report_info_dto_t));
    if (!report_info_dto_local_var) {
        return NULL;
    }
    report_info_dto_local_var->status = status;
    report_info_dto_local_var->sub_status = sub_status;
    report_info_dto_local_var->generation_requested_at = generation_requested_at;
    report_info_dto_local_var->generation_finished_at = generation_finished_at;
    report_info_dto_local_var->file = file;
    report_info_dto_local_var->estimated_generation_time = estimated_generation_time;

    return report_info_dto_local_var;
}


void report_info_dto_free(report_info_dto_t *report_info_dto) {
    if(NULL == report_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (report_info_dto->status) {
        report_status_type_free(report_info_dto->status);
        report_info_dto->status = NULL;
    }
    if (report_info_dto->sub_status) {
        report_sub_status_type_free(report_info_dto->sub_status);
        report_info_dto->sub_status = NULL;
    }
    if (report_info_dto->generation_requested_at) {
        free(report_info_dto->generation_requested_at);
        report_info_dto->generation_requested_at = NULL;
    }
    if (report_info_dto->generation_finished_at) {
        free(report_info_dto->generation_finished_at);
        report_info_dto->generation_finished_at = NULL;
    }
    if (report_info_dto->file) {
        free(report_info_dto->file);
        report_info_dto->file = NULL;
    }
    free(report_info_dto);
}

cJSON *report_info_dto_convertToJSON(report_info_dto_t *report_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // report_info_dto->status
    if (_api__report_info_dto__NULL == report_info_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = report_status_type_convertToJSON(report_info_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // report_info_dto->sub_status
    if(report_info_dto->sub_status != _api__report_info_dto__NULL) {
    cJSON *sub_status_local_JSON = report_sub_status_type_convertToJSON(report_info_dto->sub_status);
    if(sub_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "subStatus", sub_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // report_info_dto->generation_requested_at
    if (!report_info_dto->generation_requested_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "generationRequestedAt", report_info_dto->generation_requested_at) == NULL) {
    goto fail; //Date-Time
    }


    // report_info_dto->generation_finished_at
    if(report_info_dto->generation_finished_at) {
    if(cJSON_AddStringToObject(item, "generationFinishedAt", report_info_dto->generation_finished_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // report_info_dto->file
    if(report_info_dto->file) {
    if(cJSON_AddStringToObject(item, "file", report_info_dto->file) == NULL) {
    goto fail; //String
    }
    }


    // report_info_dto->estimated_generation_time
    if(report_info_dto->estimated_generation_time) {
    if(cJSON_AddNumberToObject(item, "estimatedGenerationTime", report_info_dto->estimated_generation_time) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

report_info_dto_t *report_info_dto_parseFromJSON(cJSON *report_info_dtoJSON){

    report_info_dto_t *report_info_dto_local_var = NULL;

    // define the local variable for report_info_dto->status
    report_status_type_t *status_local_nonprim = NULL;

    // define the local variable for report_info_dto->sub_status
    report_sub_status_type_t *sub_status_local_nonprim = NULL;

    // report_info_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(report_info_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = report_status_type_parseFromJSON(status); //custom

    // report_info_dto->sub_status
    cJSON *sub_status = cJSON_GetObjectItemCaseSensitive(report_info_dtoJSON, "subStatus");
    if (sub_status) { 
    sub_status_local_nonprim = report_sub_status_type_parseFromJSON(sub_status); //custom
    }

    // report_info_dto->generation_requested_at
    cJSON *generation_requested_at = cJSON_GetObjectItemCaseSensitive(report_info_dtoJSON, "generationRequestedAt");
    if (!generation_requested_at) {
        goto end;
    }

    
    if(!cJSON_IsString(generation_requested_at) && !cJSON_IsNull(generation_requested_at))
    {
    goto end; //DateTime
    }

    // report_info_dto->generation_finished_at
    cJSON *generation_finished_at = cJSON_GetObjectItemCaseSensitive(report_info_dtoJSON, "generationFinishedAt");
    if (generation_finished_at) { 
    if(!cJSON_IsString(generation_finished_at) && !cJSON_IsNull(generation_finished_at))
    {
    goto end; //DateTime
    }
    }

    // report_info_dto->file
    cJSON *file = cJSON_GetObjectItemCaseSensitive(report_info_dtoJSON, "file");
    if (file) { 
    if(!cJSON_IsString(file) && !cJSON_IsNull(file))
    {
    goto end; //String
    }
    }

    // report_info_dto->estimated_generation_time
    cJSON *estimated_generation_time = cJSON_GetObjectItemCaseSensitive(report_info_dtoJSON, "estimatedGenerationTime");
    if (estimated_generation_time) { 
    if(!cJSON_IsNumber(estimated_generation_time))
    {
    goto end; //Numeric
    }
    }


    report_info_dto_local_var = report_info_dto_create (
        status_local_nonprim,
        sub_status ? sub_status_local_nonprim : NULL,
        strdup(generation_requested_at->valuestring),
        generation_finished_at && !cJSON_IsNull(generation_finished_at) ? strdup(generation_finished_at->valuestring) : NULL,
        file && !cJSON_IsNull(file) ? strdup(file->valuestring) : NULL,
        estimated_generation_time ? estimated_generation_time->valuedouble : 0
        );

    return report_info_dto_local_var;
end:
    if (status_local_nonprim) {
        report_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (sub_status_local_nonprim) {
        report_sub_status_type_free(sub_status_local_nonprim);
        sub_status_local_nonprim = NULL;
    }
    return NULL;

}
