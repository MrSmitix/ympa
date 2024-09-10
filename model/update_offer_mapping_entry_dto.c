#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_mapping_entry_dto.h"



update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto_create(
    offer_mapping_dto_t *mapping,
    offer_mapping_dto_t *awaiting_moderation_mapping,
    offer_mapping_dto_t *rejected_mapping,
    update_mappings_offer_dto_t *offer
    ) {
    update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto_local_var = malloc(sizeof(update_offer_mapping_entry_dto_t));
    if (!update_offer_mapping_entry_dto_local_var) {
        return NULL;
    }
    update_offer_mapping_entry_dto_local_var->mapping = mapping;
    update_offer_mapping_entry_dto_local_var->awaiting_moderation_mapping = awaiting_moderation_mapping;
    update_offer_mapping_entry_dto_local_var->rejected_mapping = rejected_mapping;
    update_offer_mapping_entry_dto_local_var->offer = offer;

    return update_offer_mapping_entry_dto_local_var;
}


void update_offer_mapping_entry_dto_free(update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto) {
    if(NULL == update_offer_mapping_entry_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_mapping_entry_dto->mapping) {
        offer_mapping_dto_free(update_offer_mapping_entry_dto->mapping);
        update_offer_mapping_entry_dto->mapping = NULL;
    }
    if (update_offer_mapping_entry_dto->awaiting_moderation_mapping) {
        offer_mapping_dto_free(update_offer_mapping_entry_dto->awaiting_moderation_mapping);
        update_offer_mapping_entry_dto->awaiting_moderation_mapping = NULL;
    }
    if (update_offer_mapping_entry_dto->rejected_mapping) {
        offer_mapping_dto_free(update_offer_mapping_entry_dto->rejected_mapping);
        update_offer_mapping_entry_dto->rejected_mapping = NULL;
    }
    if (update_offer_mapping_entry_dto->offer) {
        update_mappings_offer_dto_free(update_offer_mapping_entry_dto->offer);
        update_offer_mapping_entry_dto->offer = NULL;
    }
    free(update_offer_mapping_entry_dto);
}

cJSON *update_offer_mapping_entry_dto_convertToJSON(update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_mapping_entry_dto->mapping
    if(update_offer_mapping_entry_dto->mapping) {
    cJSON *mapping_local_JSON = offer_mapping_dto_convertToJSON(update_offer_mapping_entry_dto->mapping);
    if(mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mapping", mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_mapping_entry_dto->awaiting_moderation_mapping
    if(update_offer_mapping_entry_dto->awaiting_moderation_mapping) {
    cJSON *awaiting_moderation_mapping_local_JSON = offer_mapping_dto_convertToJSON(update_offer_mapping_entry_dto->awaiting_moderation_mapping);
    if(awaiting_moderation_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "awaitingModerationMapping", awaiting_moderation_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_mapping_entry_dto->rejected_mapping
    if(update_offer_mapping_entry_dto->rejected_mapping) {
    cJSON *rejected_mapping_local_JSON = offer_mapping_dto_convertToJSON(update_offer_mapping_entry_dto->rejected_mapping);
    if(rejected_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rejectedMapping", rejected_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_mapping_entry_dto->offer
    if(update_offer_mapping_entry_dto->offer) {
    cJSON *offer_local_JSON = update_mappings_offer_dto_convertToJSON(update_offer_mapping_entry_dto->offer);
    if(offer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offer", offer_local_JSON);
    if(item->child == NULL) {
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

update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto_parseFromJSON(cJSON *update_offer_mapping_entry_dtoJSON){

    update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto_local_var = NULL;

    // define the local variable for update_offer_mapping_entry_dto->mapping
    offer_mapping_dto_t *mapping_local_nonprim = NULL;

    // define the local variable for update_offer_mapping_entry_dto->awaiting_moderation_mapping
    offer_mapping_dto_t *awaiting_moderation_mapping_local_nonprim = NULL;

    // define the local variable for update_offer_mapping_entry_dto->rejected_mapping
    offer_mapping_dto_t *rejected_mapping_local_nonprim = NULL;

    // define the local variable for update_offer_mapping_entry_dto->offer
    update_mappings_offer_dto_t *offer_local_nonprim = NULL;

    // update_offer_mapping_entry_dto->mapping
    cJSON *mapping = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_entry_dtoJSON, "mapping");
    if (mapping) { 
    mapping_local_nonprim = offer_mapping_dto_parseFromJSON(mapping); //nonprimitive
    }

    // update_offer_mapping_entry_dto->awaiting_moderation_mapping
    cJSON *awaiting_moderation_mapping = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_entry_dtoJSON, "awaitingModerationMapping");
    if (awaiting_moderation_mapping) { 
    awaiting_moderation_mapping_local_nonprim = offer_mapping_dto_parseFromJSON(awaiting_moderation_mapping); //nonprimitive
    }

    // update_offer_mapping_entry_dto->rejected_mapping
    cJSON *rejected_mapping = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_entry_dtoJSON, "rejectedMapping");
    if (rejected_mapping) { 
    rejected_mapping_local_nonprim = offer_mapping_dto_parseFromJSON(rejected_mapping); //nonprimitive
    }

    // update_offer_mapping_entry_dto->offer
    cJSON *offer = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_entry_dtoJSON, "offer");
    if (offer) { 
    offer_local_nonprim = update_mappings_offer_dto_parseFromJSON(offer); //nonprimitive
    }


    update_offer_mapping_entry_dto_local_var = update_offer_mapping_entry_dto_create (
        mapping ? mapping_local_nonprim : NULL,
        awaiting_moderation_mapping ? awaiting_moderation_mapping_local_nonprim : NULL,
        rejected_mapping ? rejected_mapping_local_nonprim : NULL,
        offer ? offer_local_nonprim : NULL
        );

    return update_offer_mapping_entry_dto_local_var;
end:
    if (mapping_local_nonprim) {
        offer_mapping_dto_free(mapping_local_nonprim);
        mapping_local_nonprim = NULL;
    }
    if (awaiting_moderation_mapping_local_nonprim) {
        offer_mapping_dto_free(awaiting_moderation_mapping_local_nonprim);
        awaiting_moderation_mapping_local_nonprim = NULL;
    }
    if (rejected_mapping_local_nonprim) {
        offer_mapping_dto_free(rejected_mapping_local_nonprim);
        rejected_mapping_local_nonprim = NULL;
    }
    if (offer_local_nonprim) {
        update_mappings_offer_dto_free(offer_local_nonprim);
        offer_local_nonprim = NULL;
    }
    return NULL;

}
