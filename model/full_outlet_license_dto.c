#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "full_outlet_license_dto.h"


char* full_outlet_license_dto_license_type_ToString(_api__full_outlet_license_dto__e license_type) {
    char* license_typeArray[] =  { "NULL", "ALCOHOL", "UNKNOWN" };
    return license_typeArray[license_type];
}

_api__full_outlet_license_dto__e full_outlet_license_dto_license_type_FromString(char* license_type){
    int stringToReturn = 0;
    char *license_typeArray[] =  { "NULL", "ALCOHOL", "UNKNOWN" };
    size_t sizeofArray = sizeof(license_typeArray) / sizeof(license_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(license_type, license_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* full_outlet_license_dto_check_status_ToString(_api__full_outlet_license_dto__e check_status) {
    char* check_statusArray[] =  { "NULL", "NEW", "SUCCESS", "FAIL", "REVOKE", "DONT_WANT", "FAIL_MANUAL" };
    return check_statusArray[check_status];
}

_api__full_outlet_license_dto__e full_outlet_license_dto_check_status_FromString(char* check_status){
    int stringToReturn = 0;
    char *check_statusArray[] =  { "NULL", "NEW", "SUCCESS", "FAIL", "REVOKE", "DONT_WANT", "FAIL_MANUAL" };
    size_t sizeofArray = sizeof(check_statusArray) / sizeof(check_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(check_status, check_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

full_outlet_license_dto_t *full_outlet_license_dto_create(
    long id,
    long outlet_id,
    license_type_t *license_type,
    char *number,
    char *date_of_issue,
    char *date_of_expiry,
    license_check_status_type_t *check_status,
    char *check_comment
    ) {
    full_outlet_license_dto_t *full_outlet_license_dto_local_var = malloc(sizeof(full_outlet_license_dto_t));
    if (!full_outlet_license_dto_local_var) {
        return NULL;
    }
    full_outlet_license_dto_local_var->id = id;
    full_outlet_license_dto_local_var->outlet_id = outlet_id;
    full_outlet_license_dto_local_var->license_type = license_type;
    full_outlet_license_dto_local_var->number = number;
    full_outlet_license_dto_local_var->date_of_issue = date_of_issue;
    full_outlet_license_dto_local_var->date_of_expiry = date_of_expiry;
    full_outlet_license_dto_local_var->check_status = check_status;
    full_outlet_license_dto_local_var->check_comment = check_comment;

    return full_outlet_license_dto_local_var;
}


void full_outlet_license_dto_free(full_outlet_license_dto_t *full_outlet_license_dto) {
    if(NULL == full_outlet_license_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (full_outlet_license_dto->license_type) {
        license_type_free(full_outlet_license_dto->license_type);
        full_outlet_license_dto->license_type = NULL;
    }
    if (full_outlet_license_dto->number) {
        free(full_outlet_license_dto->number);
        full_outlet_license_dto->number = NULL;
    }
    if (full_outlet_license_dto->date_of_issue) {
        free(full_outlet_license_dto->date_of_issue);
        full_outlet_license_dto->date_of_issue = NULL;
    }
    if (full_outlet_license_dto->date_of_expiry) {
        free(full_outlet_license_dto->date_of_expiry);
        full_outlet_license_dto->date_of_expiry = NULL;
    }
    if (full_outlet_license_dto->check_status) {
        license_check_status_type_free(full_outlet_license_dto->check_status);
        full_outlet_license_dto->check_status = NULL;
    }
    if (full_outlet_license_dto->check_comment) {
        free(full_outlet_license_dto->check_comment);
        full_outlet_license_dto->check_comment = NULL;
    }
    free(full_outlet_license_dto);
}

cJSON *full_outlet_license_dto_convertToJSON(full_outlet_license_dto_t *full_outlet_license_dto) {
    cJSON *item = cJSON_CreateObject();

    // full_outlet_license_dto->id
    if(full_outlet_license_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", full_outlet_license_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // full_outlet_license_dto->outlet_id
    if(full_outlet_license_dto->outlet_id) {
    if(cJSON_AddNumberToObject(item, "outletId", full_outlet_license_dto->outlet_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // full_outlet_license_dto->license_type
    if(full_outlet_license_dto->license_type != _api__full_outlet_license_dto__NULL) {
    cJSON *license_type_local_JSON = license_type_convertToJSON(full_outlet_license_dto->license_type);
    if(license_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "licenseType", license_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // full_outlet_license_dto->number
    if(full_outlet_license_dto->number) {
    if(cJSON_AddStringToObject(item, "number", full_outlet_license_dto->number) == NULL) {
    goto fail; //String
    }
    }


    // full_outlet_license_dto->date_of_issue
    if(full_outlet_license_dto->date_of_issue) {
    if(cJSON_AddStringToObject(item, "dateOfIssue", full_outlet_license_dto->date_of_issue) == NULL) {
    goto fail; //Date-Time
    }
    }


    // full_outlet_license_dto->date_of_expiry
    if(full_outlet_license_dto->date_of_expiry) {
    if(cJSON_AddStringToObject(item, "dateOfExpiry", full_outlet_license_dto->date_of_expiry) == NULL) {
    goto fail; //Date-Time
    }
    }


    // full_outlet_license_dto->check_status
    if(full_outlet_license_dto->check_status != _api__full_outlet_license_dto__NULL) {
    cJSON *check_status_local_JSON = license_check_status_type_convertToJSON(full_outlet_license_dto->check_status);
    if(check_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "checkStatus", check_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // full_outlet_license_dto->check_comment
    if(full_outlet_license_dto->check_comment) {
    if(cJSON_AddStringToObject(item, "checkComment", full_outlet_license_dto->check_comment) == NULL) {
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

full_outlet_license_dto_t *full_outlet_license_dto_parseFromJSON(cJSON *full_outlet_license_dtoJSON){

    full_outlet_license_dto_t *full_outlet_license_dto_local_var = NULL;

    // define the local variable for full_outlet_license_dto->license_type
    license_type_t *license_type_local_nonprim = NULL;

    // define the local variable for full_outlet_license_dto->check_status
    license_check_status_type_t *check_status_local_nonprim = NULL;

    // full_outlet_license_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // full_outlet_license_dto->outlet_id
    cJSON *outlet_id = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "outletId");
    if (outlet_id) { 
    if(!cJSON_IsNumber(outlet_id))
    {
    goto end; //Numeric
    }
    }

    // full_outlet_license_dto->license_type
    cJSON *license_type = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "licenseType");
    if (license_type) { 
    license_type_local_nonprim = license_type_parseFromJSON(license_type); //custom
    }

    // full_outlet_license_dto->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "number");
    if (number) { 
    if(!cJSON_IsString(number) && !cJSON_IsNull(number))
    {
    goto end; //String
    }
    }

    // full_outlet_license_dto->date_of_issue
    cJSON *date_of_issue = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "dateOfIssue");
    if (date_of_issue) { 
    if(!cJSON_IsString(date_of_issue) && !cJSON_IsNull(date_of_issue))
    {
    goto end; //DateTime
    }
    }

    // full_outlet_license_dto->date_of_expiry
    cJSON *date_of_expiry = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "dateOfExpiry");
    if (date_of_expiry) { 
    if(!cJSON_IsString(date_of_expiry) && !cJSON_IsNull(date_of_expiry))
    {
    goto end; //DateTime
    }
    }

    // full_outlet_license_dto->check_status
    cJSON *check_status = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "checkStatus");
    if (check_status) { 
    check_status_local_nonprim = license_check_status_type_parseFromJSON(check_status); //custom
    }

    // full_outlet_license_dto->check_comment
    cJSON *check_comment = cJSON_GetObjectItemCaseSensitive(full_outlet_license_dtoJSON, "checkComment");
    if (check_comment) { 
    if(!cJSON_IsString(check_comment) && !cJSON_IsNull(check_comment))
    {
    goto end; //String
    }
    }


    full_outlet_license_dto_local_var = full_outlet_license_dto_create (
        id ? id->valuedouble : 0,
        outlet_id ? outlet_id->valuedouble : 0,
        license_type ? license_type_local_nonprim : NULL,
        number && !cJSON_IsNull(number) ? strdup(number->valuestring) : NULL,
        date_of_issue && !cJSON_IsNull(date_of_issue) ? strdup(date_of_issue->valuestring) : NULL,
        date_of_expiry && !cJSON_IsNull(date_of_expiry) ? strdup(date_of_expiry->valuestring) : NULL,
        check_status ? check_status_local_nonprim : NULL,
        check_comment && !cJSON_IsNull(check_comment) ? strdup(check_comment->valuestring) : NULL
        );

    return full_outlet_license_dto_local_var;
end:
    if (license_type_local_nonprim) {
        license_type_free(license_type_local_nonprim);
        license_type_local_nonprim = NULL;
    }
    if (check_status_local_nonprim) {
        license_check_status_type_free(check_status_local_nonprim);
        check_status_local_nonprim = NULL;
    }
    return NULL;

}
