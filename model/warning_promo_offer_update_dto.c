#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warning_promo_offer_update_dto.h"



warning_promo_offer_update_dto_t *warning_promo_offer_update_dto_create(
    char *offer_id,
    list_t *warnings
    ) {
    warning_promo_offer_update_dto_t *warning_promo_offer_update_dto_local_var = malloc(sizeof(warning_promo_offer_update_dto_t));
    if (!warning_promo_offer_update_dto_local_var) {
        return NULL;
    }
    warning_promo_offer_update_dto_local_var->offer_id = offer_id;
    warning_promo_offer_update_dto_local_var->warnings = warnings;

    return warning_promo_offer_update_dto_local_var;
}


void warning_promo_offer_update_dto_free(warning_promo_offer_update_dto_t *warning_promo_offer_update_dto) {
    if(NULL == warning_promo_offer_update_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warning_promo_offer_update_dto->offer_id) {
        free(warning_promo_offer_update_dto->offer_id);
        warning_promo_offer_update_dto->offer_id = NULL;
    }
    if (warning_promo_offer_update_dto->warnings) {
        list_ForEach(listEntry, warning_promo_offer_update_dto->warnings) {
            promo_offer_update_warning_dto_free(listEntry->data);
        }
        list_freeList(warning_promo_offer_update_dto->warnings);
        warning_promo_offer_update_dto->warnings = NULL;
    }
    free(warning_promo_offer_update_dto);
}

cJSON *warning_promo_offer_update_dto_convertToJSON(warning_promo_offer_update_dto_t *warning_promo_offer_update_dto) {
    cJSON *item = cJSON_CreateObject();

    // warning_promo_offer_update_dto->offer_id
    if (!warning_promo_offer_update_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", warning_promo_offer_update_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // warning_promo_offer_update_dto->warnings
    if (!warning_promo_offer_update_dto->warnings) {
        goto fail;
    }
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (warning_promo_offer_update_dto->warnings) {
    list_ForEach(warningsListEntry, warning_promo_offer_update_dto->warnings) {
    cJSON *itemLocal = promo_offer_update_warning_dto_convertToJSON(warningsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warnings, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warning_promo_offer_update_dto_t *warning_promo_offer_update_dto_parseFromJSON(cJSON *warning_promo_offer_update_dtoJSON){

    warning_promo_offer_update_dto_t *warning_promo_offer_update_dto_local_var = NULL;

    // define the local list for warning_promo_offer_update_dto->warnings
    list_t *warningsList = NULL;

    // warning_promo_offer_update_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(warning_promo_offer_update_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // warning_promo_offer_update_dto->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(warning_promo_offer_update_dtoJSON, "warnings");
    if (!warnings) {
        goto end;
    }

    
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
        promo_offer_update_warning_dto_t *warningsItem = promo_offer_update_warning_dto_parseFromJSON(warnings_local_nonprimitive);

        list_addElement(warningsList, warningsItem);
    }


    warning_promo_offer_update_dto_local_var = warning_promo_offer_update_dto_create (
        strdup(offer_id->valuestring),
        warningsList
        );

    return warning_promo_offer_update_dto_local_var;
end:
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            promo_offer_update_warning_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    return NULL;

}
