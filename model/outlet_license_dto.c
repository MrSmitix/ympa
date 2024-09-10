#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_license_dto.h"


char* outlet_license_dto_license_type_ToString(_api__outlet_license_dto__e license_type) {
    char* license_typeArray[] =  { "NULL", "ALCOHOL", "UNKNOWN" };
    return license_typeArray[license_type];
}

_api__outlet_license_dto__e outlet_license_dto_license_type_FromString(char* license_type){
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

outlet_license_dto_t *outlet_license_dto_create(
    long id,
    long outlet_id,
    license_type_t *license_type,
    char *number,
    char *date_of_issue,
    char *date_of_expiry
    ) {
    outlet_license_dto_t *outlet_license_dto_local_var = malloc(sizeof(outlet_license_dto_t));
    if (!outlet_license_dto_local_var) {
        return NULL;
    }
    outlet_license_dto_local_var->id = id;
    outlet_license_dto_local_var->outlet_id = outlet_id;
    outlet_license_dto_local_var->license_type = license_type;
    outlet_license_dto_local_var->number = number;
    outlet_license_dto_local_var->date_of_issue = date_of_issue;
    outlet_license_dto_local_var->date_of_expiry = date_of_expiry;

    return outlet_license_dto_local_var;
}


void outlet_license_dto_free(outlet_license_dto_t *outlet_license_dto) {
    if(NULL == outlet_license_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (outlet_license_dto->license_type) {
        license_type_free(outlet_license_dto->license_type);
        outlet_license_dto->license_type = NULL;
    }
    if (outlet_license_dto->number) {
        free(outlet_license_dto->number);
        outlet_license_dto->number = NULL;
    }
    if (outlet_license_dto->date_of_issue) {
        free(outlet_license_dto->date_of_issue);
        outlet_license_dto->date_of_issue = NULL;
    }
    if (outlet_license_dto->date_of_expiry) {
        free(outlet_license_dto->date_of_expiry);
        outlet_license_dto->date_of_expiry = NULL;
    }
    free(outlet_license_dto);
}

cJSON *outlet_license_dto_convertToJSON(outlet_license_dto_t *outlet_license_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_license_dto->id
    if(outlet_license_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", outlet_license_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_license_dto->outlet_id
    if(outlet_license_dto->outlet_id) {
    if(cJSON_AddNumberToObject(item, "outletId", outlet_license_dto->outlet_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_license_dto->license_type
    if(outlet_license_dto->license_type != _api__outlet_license_dto__NULL) {
    cJSON *license_type_local_JSON = license_type_convertToJSON(outlet_license_dto->license_type);
    if(license_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "licenseType", license_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // outlet_license_dto->number
    if(outlet_license_dto->number) {
    if(cJSON_AddStringToObject(item, "number", outlet_license_dto->number) == NULL) {
    goto fail; //String
    }
    }


    // outlet_license_dto->date_of_issue
    if(outlet_license_dto->date_of_issue) {
    if(cJSON_AddStringToObject(item, "dateOfIssue", outlet_license_dto->date_of_issue) == NULL) {
    goto fail; //Date-Time
    }
    }


    // outlet_license_dto->date_of_expiry
    if(outlet_license_dto->date_of_expiry) {
    if(cJSON_AddStringToObject(item, "dateOfExpiry", outlet_license_dto->date_of_expiry) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

outlet_license_dto_t *outlet_license_dto_parseFromJSON(cJSON *outlet_license_dtoJSON){

    outlet_license_dto_t *outlet_license_dto_local_var = NULL;

    // define the local variable for outlet_license_dto->license_type
    license_type_t *license_type_local_nonprim = NULL;

    // outlet_license_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(outlet_license_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // outlet_license_dto->outlet_id
    cJSON *outlet_id = cJSON_GetObjectItemCaseSensitive(outlet_license_dtoJSON, "outletId");
    if (outlet_id) { 
    if(!cJSON_IsNumber(outlet_id))
    {
    goto end; //Numeric
    }
    }

    // outlet_license_dto->license_type
    cJSON *license_type = cJSON_GetObjectItemCaseSensitive(outlet_license_dtoJSON, "licenseType");
    if (license_type) { 
    license_type_local_nonprim = license_type_parseFromJSON(license_type); //custom
    }

    // outlet_license_dto->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(outlet_license_dtoJSON, "number");
    if (number) { 
    if(!cJSON_IsString(number) && !cJSON_IsNull(number))
    {
    goto end; //String
    }
    }

    // outlet_license_dto->date_of_issue
    cJSON *date_of_issue = cJSON_GetObjectItemCaseSensitive(outlet_license_dtoJSON, "dateOfIssue");
    if (date_of_issue) { 
    if(!cJSON_IsString(date_of_issue) && !cJSON_IsNull(date_of_issue))
    {
    goto end; //DateTime
    }
    }

    // outlet_license_dto->date_of_expiry
    cJSON *date_of_expiry = cJSON_GetObjectItemCaseSensitive(outlet_license_dtoJSON, "dateOfExpiry");
    if (date_of_expiry) { 
    if(!cJSON_IsString(date_of_expiry) && !cJSON_IsNull(date_of_expiry))
    {
    goto end; //DateTime
    }
    }


    outlet_license_dto_local_var = outlet_license_dto_create (
        id ? id->valuedouble : 0,
        outlet_id ? outlet_id->valuedouble : 0,
        license_type ? license_type_local_nonprim : NULL,
        number && !cJSON_IsNull(number) ? strdup(number->valuestring) : NULL,
        date_of_issue && !cJSON_IsNull(date_of_issue) ? strdup(date_of_issue->valuestring) : NULL,
        date_of_expiry && !cJSON_IsNull(date_of_expiry) ? strdup(date_of_expiry->valuestring) : NULL
        );

    return outlet_license_dto_local_var;
end:
    if (license_type_local_nonprim) {
        license_type_free(license_type_local_nonprim);
        license_type_local_nonprim = NULL;
    }
    return NULL;

}
