#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_mapping_result_dto.h"



update_offer_mapping_result_dto_t *update_offer_mapping_result_dto_create(
    char *offer_id,
    list_t *errors,
    list_t *warnings
    ) {
    update_offer_mapping_result_dto_t *update_offer_mapping_result_dto_local_var = malloc(sizeof(update_offer_mapping_result_dto_t));
    if (!update_offer_mapping_result_dto_local_var) {
        return NULL;
    }
    update_offer_mapping_result_dto_local_var->offer_id = offer_id;
    update_offer_mapping_result_dto_local_var->errors = errors;
    update_offer_mapping_result_dto_local_var->warnings = warnings;

    return update_offer_mapping_result_dto_local_var;
}


void update_offer_mapping_result_dto_free(update_offer_mapping_result_dto_t *update_offer_mapping_result_dto) {
    if(NULL == update_offer_mapping_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_mapping_result_dto->offer_id) {
        free(update_offer_mapping_result_dto->offer_id);
        update_offer_mapping_result_dto->offer_id = NULL;
    }
    if (update_offer_mapping_result_dto->errors) {
        list_ForEach(listEntry, update_offer_mapping_result_dto->errors) {
            offer_mapping_error_dto_free(listEntry->data);
        }
        list_freeList(update_offer_mapping_result_dto->errors);
        update_offer_mapping_result_dto->errors = NULL;
    }
    if (update_offer_mapping_result_dto->warnings) {
        list_ForEach(listEntry, update_offer_mapping_result_dto->warnings) {
            offer_mapping_error_dto_free(listEntry->data);
        }
        list_freeList(update_offer_mapping_result_dto->warnings);
        update_offer_mapping_result_dto->warnings = NULL;
    }
    free(update_offer_mapping_result_dto);
}

cJSON *update_offer_mapping_result_dto_convertToJSON(update_offer_mapping_result_dto_t *update_offer_mapping_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_mapping_result_dto->offer_id
    if (!update_offer_mapping_result_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", update_offer_mapping_result_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // update_offer_mapping_result_dto->errors
    if(update_offer_mapping_result_dto->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (update_offer_mapping_result_dto->errors) {
    list_ForEach(errorsListEntry, update_offer_mapping_result_dto->errors) {
    cJSON *itemLocal = offer_mapping_error_dto_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // update_offer_mapping_result_dto->warnings
    if(update_offer_mapping_result_dto->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (update_offer_mapping_result_dto->warnings) {
    list_ForEach(warningsListEntry, update_offer_mapping_result_dto->warnings) {
    cJSON *itemLocal = offer_mapping_error_dto_convertToJSON(warningsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warnings, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_offer_mapping_result_dto_t *update_offer_mapping_result_dto_parseFromJSON(cJSON *update_offer_mapping_result_dtoJSON){

    update_offer_mapping_result_dto_t *update_offer_mapping_result_dto_local_var = NULL;

    // define the local list for update_offer_mapping_result_dto->errors
    list_t *errorsList = NULL;

    // define the local list for update_offer_mapping_result_dto->warnings
    list_t *warningsList = NULL;

    // update_offer_mapping_result_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_result_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // update_offer_mapping_result_dto->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_result_dtoJSON, "errors");
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        offer_mapping_error_dto_t *errorsItem = offer_mapping_error_dto_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // update_offer_mapping_result_dto->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_result_dtoJSON, "warnings");
    if (warnings) { 
    cJSON *warnings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(warnings)){
        goto end; //nonprimitive container
    }

    warningsList = list_createList();

    cJSON_ArrayForEach(warnings_local_nonprimitive,warnings )
    {
        if(!cJSON_IsObject(warnings_local_nonprimitive)){
            goto end;
        }
        offer_mapping_error_dto_t *warningsItem = offer_mapping_error_dto_parseFromJSON(warnings_local_nonprimitive);

        list_addElement(warningsList, warningsItem);
    }
    }


    update_offer_mapping_result_dto_local_var = update_offer_mapping_result_dto_create (
        strdup(offer_id->valuestring),
        errors ? errorsList : NULL,
        warnings ? warningsList : NULL
        );

    return update_offer_mapping_result_dto_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            offer_mapping_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            offer_mapping_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    return NULL;

}
