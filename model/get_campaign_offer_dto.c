#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_offer_dto.h"


char* get_campaign_offer_dto_status_ToString(_api__get_campaign_offer_dto__e status) {
    char* statusArray[] =  { "NULL", "PUBLISHED", "CHECKING", "DISABLED_BY_PARTNER", "DISABLED_AUTOMATICALLY", "REJECTED_BY_MARKET", "CREATING_CARD", "NO_CARD", "NO_STOCKS", "ARCHIVED" };
    return statusArray[status];
}

_api__get_campaign_offer_dto__e get_campaign_offer_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PUBLISHED", "CHECKING", "DISABLED_BY_PARTNER", "DISABLED_AUTOMATICALLY", "REJECTED_BY_MARKET", "CREATING_CARD", "NO_CARD", "NO_STOCKS", "ARCHIVED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_campaign_offer_dto_t *get_campaign_offer_dto_create(
    char *offer_id,
    quantum_dto_t *quantum,
    int available,
    get_price_with_discount_dto_t *basic_price,
    get_price_with_vat_dto_t *campaign_price,
    offer_campaign_status_type_t *status,
    list_t *errors,
    list_t *warnings
    ) {
    get_campaign_offer_dto_t *get_campaign_offer_dto_local_var = malloc(sizeof(get_campaign_offer_dto_t));
    if (!get_campaign_offer_dto_local_var) {
        return NULL;
    }
    get_campaign_offer_dto_local_var->offer_id = offer_id;
    get_campaign_offer_dto_local_var->quantum = quantum;
    get_campaign_offer_dto_local_var->available = available;
    get_campaign_offer_dto_local_var->basic_price = basic_price;
    get_campaign_offer_dto_local_var->campaign_price = campaign_price;
    get_campaign_offer_dto_local_var->status = status;
    get_campaign_offer_dto_local_var->errors = errors;
    get_campaign_offer_dto_local_var->warnings = warnings;

    return get_campaign_offer_dto_local_var;
}


void get_campaign_offer_dto_free(get_campaign_offer_dto_t *get_campaign_offer_dto) {
    if(NULL == get_campaign_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_offer_dto->offer_id) {
        free(get_campaign_offer_dto->offer_id);
        get_campaign_offer_dto->offer_id = NULL;
    }
    if (get_campaign_offer_dto->quantum) {
        quantum_dto_free(get_campaign_offer_dto->quantum);
        get_campaign_offer_dto->quantum = NULL;
    }
    if (get_campaign_offer_dto->basic_price) {
        get_price_with_discount_dto_free(get_campaign_offer_dto->basic_price);
        get_campaign_offer_dto->basic_price = NULL;
    }
    if (get_campaign_offer_dto->campaign_price) {
        get_price_with_vat_dto_free(get_campaign_offer_dto->campaign_price);
        get_campaign_offer_dto->campaign_price = NULL;
    }
    if (get_campaign_offer_dto->status) {
        offer_campaign_status_type_free(get_campaign_offer_dto->status);
        get_campaign_offer_dto->status = NULL;
    }
    if (get_campaign_offer_dto->errors) {
        list_ForEach(listEntry, get_campaign_offer_dto->errors) {
            offer_error_dto_free(listEntry->data);
        }
        list_freeList(get_campaign_offer_dto->errors);
        get_campaign_offer_dto->errors = NULL;
    }
    if (get_campaign_offer_dto->warnings) {
        list_ForEach(listEntry, get_campaign_offer_dto->warnings) {
            offer_error_dto_free(listEntry->data);
        }
        list_freeList(get_campaign_offer_dto->warnings);
        get_campaign_offer_dto->warnings = NULL;
    }
    free(get_campaign_offer_dto);
}

cJSON *get_campaign_offer_dto_convertToJSON(get_campaign_offer_dto_t *get_campaign_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_offer_dto->offer_id
    if (!get_campaign_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", get_campaign_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // get_campaign_offer_dto->quantum
    if(get_campaign_offer_dto->quantum) {
    cJSON *quantum_local_JSON = quantum_dto_convertToJSON(get_campaign_offer_dto->quantum);
    if(quantum_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quantum", quantum_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_campaign_offer_dto->available
    if(get_campaign_offer_dto->available) {
    if(cJSON_AddBoolToObject(item, "available", get_campaign_offer_dto->available) == NULL) {
    goto fail; //Bool
    }
    }


    // get_campaign_offer_dto->basic_price
    if(get_campaign_offer_dto->basic_price) {
    cJSON *basic_price_local_JSON = get_price_with_discount_dto_convertToJSON(get_campaign_offer_dto->basic_price);
    if(basic_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "basicPrice", basic_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_campaign_offer_dto->campaign_price
    if(get_campaign_offer_dto->campaign_price) {
    cJSON *campaign_price_local_JSON = get_price_with_vat_dto_convertToJSON(get_campaign_offer_dto->campaign_price);
    if(campaign_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "campaignPrice", campaign_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_campaign_offer_dto->status
    if(get_campaign_offer_dto->status != _api__get_campaign_offer_dto__NULL) {
    cJSON *status_local_JSON = offer_campaign_status_type_convertToJSON(get_campaign_offer_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_campaign_offer_dto->errors
    if(get_campaign_offer_dto->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (get_campaign_offer_dto->errors) {
    list_ForEach(errorsListEntry, get_campaign_offer_dto->errors) {
    cJSON *itemLocal = offer_error_dto_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // get_campaign_offer_dto->warnings
    if(get_campaign_offer_dto->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (get_campaign_offer_dto->warnings) {
    list_ForEach(warningsListEntry, get_campaign_offer_dto->warnings) {
    cJSON *itemLocal = offer_error_dto_convertToJSON(warningsListEntry->data);
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

get_campaign_offer_dto_t *get_campaign_offer_dto_parseFromJSON(cJSON *get_campaign_offer_dtoJSON){

    get_campaign_offer_dto_t *get_campaign_offer_dto_local_var = NULL;

    // define the local variable for get_campaign_offer_dto->quantum
    quantum_dto_t *quantum_local_nonprim = NULL;

    // define the local variable for get_campaign_offer_dto->basic_price
    get_price_with_discount_dto_t *basic_price_local_nonprim = NULL;

    // define the local variable for get_campaign_offer_dto->campaign_price
    get_price_with_vat_dto_t *campaign_price_local_nonprim = NULL;

    // define the local variable for get_campaign_offer_dto->status
    offer_campaign_status_type_t *status_local_nonprim = NULL;

    // define the local list for get_campaign_offer_dto->errors
    list_t *errorsList = NULL;

    // define the local list for get_campaign_offer_dto->warnings
    list_t *warningsList = NULL;

    // get_campaign_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // get_campaign_offer_dto->quantum
    cJSON *quantum = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "quantum");
    if (quantum) { 
    quantum_local_nonprim = quantum_dto_parseFromJSON(quantum); //nonprimitive
    }

    // get_campaign_offer_dto->available
    cJSON *available = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "available");
    if (available) { 
    if(!cJSON_IsBool(available))
    {
    goto end; //Bool
    }
    }

    // get_campaign_offer_dto->basic_price
    cJSON *basic_price = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "basicPrice");
    if (basic_price) { 
    basic_price_local_nonprim = get_price_with_discount_dto_parseFromJSON(basic_price); //nonprimitive
    }

    // get_campaign_offer_dto->campaign_price
    cJSON *campaign_price = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "campaignPrice");
    if (campaign_price) { 
    campaign_price_local_nonprim = get_price_with_vat_dto_parseFromJSON(campaign_price); //nonprimitive
    }

    // get_campaign_offer_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = offer_campaign_status_type_parseFromJSON(status); //custom
    }

    // get_campaign_offer_dto->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "errors");
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
        offer_error_dto_t *errorsItem = offer_error_dto_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // get_campaign_offer_dto->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(get_campaign_offer_dtoJSON, "warnings");
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
        offer_error_dto_t *warningsItem = offer_error_dto_parseFromJSON(warnings_local_nonprimitive);

        list_addElement(warningsList, warningsItem);
    }
    }


    get_campaign_offer_dto_local_var = get_campaign_offer_dto_create (
        strdup(offer_id->valuestring),
        quantum ? quantum_local_nonprim : NULL,
        available ? available->valueint : 0,
        basic_price ? basic_price_local_nonprim : NULL,
        campaign_price ? campaign_price_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        errors ? errorsList : NULL,
        warnings ? warningsList : NULL
        );

    return get_campaign_offer_dto_local_var;
end:
    if (quantum_local_nonprim) {
        quantum_dto_free(quantum_local_nonprim);
        quantum_local_nonprim = NULL;
    }
    if (basic_price_local_nonprim) {
        get_price_with_discount_dto_free(basic_price_local_nonprim);
        basic_price_local_nonprim = NULL;
    }
    if (campaign_price_local_nonprim) {
        get_price_with_vat_dto_free(campaign_price_local_nonprim);
        campaign_price_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        offer_campaign_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            offer_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            offer_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    return NULL;

}
