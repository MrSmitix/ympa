#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quarantine_offer_dto.h"



quarantine_offer_dto_t *quarantine_offer_dto_create(
    char *offer_id,
    base_price_dto_t *current_price,
    base_price_dto_t *last_valid_price,
    list_t *verdicts
    ) {
    quarantine_offer_dto_t *quarantine_offer_dto_local_var = malloc(sizeof(quarantine_offer_dto_t));
    if (!quarantine_offer_dto_local_var) {
        return NULL;
    }
    quarantine_offer_dto_local_var->offer_id = offer_id;
    quarantine_offer_dto_local_var->current_price = current_price;
    quarantine_offer_dto_local_var->last_valid_price = last_valid_price;
    quarantine_offer_dto_local_var->verdicts = verdicts;

    return quarantine_offer_dto_local_var;
}


void quarantine_offer_dto_free(quarantine_offer_dto_t *quarantine_offer_dto) {
    if(NULL == quarantine_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (quarantine_offer_dto->offer_id) {
        free(quarantine_offer_dto->offer_id);
        quarantine_offer_dto->offer_id = NULL;
    }
    if (quarantine_offer_dto->current_price) {
        base_price_dto_free(quarantine_offer_dto->current_price);
        quarantine_offer_dto->current_price = NULL;
    }
    if (quarantine_offer_dto->last_valid_price) {
        base_price_dto_free(quarantine_offer_dto->last_valid_price);
        quarantine_offer_dto->last_valid_price = NULL;
    }
    if (quarantine_offer_dto->verdicts) {
        list_ForEach(listEntry, quarantine_offer_dto->verdicts) {
            price_quarantine_verdict_dto_free(listEntry->data);
        }
        list_freeList(quarantine_offer_dto->verdicts);
        quarantine_offer_dto->verdicts = NULL;
    }
    free(quarantine_offer_dto);
}

cJSON *quarantine_offer_dto_convertToJSON(quarantine_offer_dto_t *quarantine_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // quarantine_offer_dto->offer_id
    if(quarantine_offer_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", quarantine_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // quarantine_offer_dto->current_price
    if(quarantine_offer_dto->current_price) {
    cJSON *current_price_local_JSON = base_price_dto_convertToJSON(quarantine_offer_dto->current_price);
    if(current_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "currentPrice", current_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // quarantine_offer_dto->last_valid_price
    if(quarantine_offer_dto->last_valid_price) {
    cJSON *last_valid_price_local_JSON = base_price_dto_convertToJSON(quarantine_offer_dto->last_valid_price);
    if(last_valid_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "lastValidPrice", last_valid_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // quarantine_offer_dto->verdicts
    if(quarantine_offer_dto->verdicts) {
    cJSON *verdicts = cJSON_AddArrayToObject(item, "verdicts");
    if(verdicts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *verdictsListEntry;
    if (quarantine_offer_dto->verdicts) {
    list_ForEach(verdictsListEntry, quarantine_offer_dto->verdicts) {
    cJSON *itemLocal = price_quarantine_verdict_dto_convertToJSON(verdictsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(verdicts, itemLocal);
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

quarantine_offer_dto_t *quarantine_offer_dto_parseFromJSON(cJSON *quarantine_offer_dtoJSON){

    quarantine_offer_dto_t *quarantine_offer_dto_local_var = NULL;

    // define the local variable for quarantine_offer_dto->current_price
    base_price_dto_t *current_price_local_nonprim = NULL;

    // define the local variable for quarantine_offer_dto->last_valid_price
    base_price_dto_t *last_valid_price_local_nonprim = NULL;

    // define the local list for quarantine_offer_dto->verdicts
    list_t *verdictsList = NULL;

    // quarantine_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(quarantine_offer_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // quarantine_offer_dto->current_price
    cJSON *current_price = cJSON_GetObjectItemCaseSensitive(quarantine_offer_dtoJSON, "currentPrice");
    if (current_price) { 
    current_price_local_nonprim = base_price_dto_parseFromJSON(current_price); //nonprimitive
    }

    // quarantine_offer_dto->last_valid_price
    cJSON *last_valid_price = cJSON_GetObjectItemCaseSensitive(quarantine_offer_dtoJSON, "lastValidPrice");
    if (last_valid_price) { 
    last_valid_price_local_nonprim = base_price_dto_parseFromJSON(last_valid_price); //nonprimitive
    }

    // quarantine_offer_dto->verdicts
    cJSON *verdicts = cJSON_GetObjectItemCaseSensitive(quarantine_offer_dtoJSON, "verdicts");
    if (verdicts) { 
    cJSON *verdicts_local_nonprimitive = NULL;
    if(!cJSON_IsArray(verdicts)){
        goto end; //nonprimitive container
    }

    verdictsList = list_createList();

    cJSON_ArrayForEach(verdicts_local_nonprimitive,verdicts )
    {
        if(!cJSON_IsObject(verdicts_local_nonprimitive)){
            goto end;
        }
        price_quarantine_verdict_dto_t *verdictsItem = price_quarantine_verdict_dto_parseFromJSON(verdicts_local_nonprimitive);

        list_addElement(verdictsList, verdictsItem);
    }
    }


    quarantine_offer_dto_local_var = quarantine_offer_dto_create (
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        current_price ? current_price_local_nonprim : NULL,
        last_valid_price ? last_valid_price_local_nonprim : NULL,
        verdicts ? verdictsList : NULL
        );

    return quarantine_offer_dto_local_var;
end:
    if (current_price_local_nonprim) {
        base_price_dto_free(current_price_local_nonprim);
        current_price_local_nonprim = NULL;
    }
    if (last_valid_price_local_nonprim) {
        base_price_dto_free(last_valid_price_local_nonprim);
        last_valid_price_local_nonprim = NULL;
    }
    if (verdictsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, verdictsList) {
            price_quarantine_verdict_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(verdictsList);
        verdictsList = NULL;
    }
    return NULL;

}
