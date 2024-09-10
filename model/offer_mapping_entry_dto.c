#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_entry_dto.h"



offer_mapping_entry_dto_t *offer_mapping_entry_dto_create(
    offer_mapping_dto_t *mapping,
    offer_mapping_dto_t *awaiting_moderation_mapping,
    offer_mapping_dto_t *rejected_mapping,
    mappings_offer_dto_t *offer
    ) {
    offer_mapping_entry_dto_t *offer_mapping_entry_dto_local_var = malloc(sizeof(offer_mapping_entry_dto_t));
    if (!offer_mapping_entry_dto_local_var) {
        return NULL;
    }
    offer_mapping_entry_dto_local_var->mapping = mapping;
    offer_mapping_entry_dto_local_var->awaiting_moderation_mapping = awaiting_moderation_mapping;
    offer_mapping_entry_dto_local_var->rejected_mapping = rejected_mapping;
    offer_mapping_entry_dto_local_var->offer = offer;

    return offer_mapping_entry_dto_local_var;
}


void offer_mapping_entry_dto_free(offer_mapping_entry_dto_t *offer_mapping_entry_dto) {
    if(NULL == offer_mapping_entry_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_mapping_entry_dto->mapping) {
        offer_mapping_dto_free(offer_mapping_entry_dto->mapping);
        offer_mapping_entry_dto->mapping = NULL;
    }
    if (offer_mapping_entry_dto->awaiting_moderation_mapping) {
        offer_mapping_dto_free(offer_mapping_entry_dto->awaiting_moderation_mapping);
        offer_mapping_entry_dto->awaiting_moderation_mapping = NULL;
    }
    if (offer_mapping_entry_dto->rejected_mapping) {
        offer_mapping_dto_free(offer_mapping_entry_dto->rejected_mapping);
        offer_mapping_entry_dto->rejected_mapping = NULL;
    }
    if (offer_mapping_entry_dto->offer) {
        mappings_offer_dto_free(offer_mapping_entry_dto->offer);
        offer_mapping_entry_dto->offer = NULL;
    }
    free(offer_mapping_entry_dto);
}

cJSON *offer_mapping_entry_dto_convertToJSON(offer_mapping_entry_dto_t *offer_mapping_entry_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_mapping_entry_dto->mapping
    if(offer_mapping_entry_dto->mapping) {
    cJSON *mapping_local_JSON = offer_mapping_dto_convertToJSON(offer_mapping_entry_dto->mapping);
    if(mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mapping", mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_mapping_entry_dto->awaiting_moderation_mapping
    if(offer_mapping_entry_dto->awaiting_moderation_mapping) {
    cJSON *awaiting_moderation_mapping_local_JSON = offer_mapping_dto_convertToJSON(offer_mapping_entry_dto->awaiting_moderation_mapping);
    if(awaiting_moderation_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "awaitingModerationMapping", awaiting_moderation_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_mapping_entry_dto->rejected_mapping
    if(offer_mapping_entry_dto->rejected_mapping) {
    cJSON *rejected_mapping_local_JSON = offer_mapping_dto_convertToJSON(offer_mapping_entry_dto->rejected_mapping);
    if(rejected_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rejectedMapping", rejected_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_mapping_entry_dto->offer
    if(offer_mapping_entry_dto->offer) {
    cJSON *offer_local_JSON = mappings_offer_dto_convertToJSON(offer_mapping_entry_dto->offer);
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

offer_mapping_entry_dto_t *offer_mapping_entry_dto_parseFromJSON(cJSON *offer_mapping_entry_dtoJSON){

    offer_mapping_entry_dto_t *offer_mapping_entry_dto_local_var = NULL;

    // define the local variable for offer_mapping_entry_dto->mapping
    offer_mapping_dto_t *mapping_local_nonprim = NULL;

    // define the local variable for offer_mapping_entry_dto->awaiting_moderation_mapping
    offer_mapping_dto_t *awaiting_moderation_mapping_local_nonprim = NULL;

    // define the local variable for offer_mapping_entry_dto->rejected_mapping
    offer_mapping_dto_t *rejected_mapping_local_nonprim = NULL;

    // define the local variable for offer_mapping_entry_dto->offer
    mappings_offer_dto_t *offer_local_nonprim = NULL;

    // offer_mapping_entry_dto->mapping
    cJSON *mapping = cJSON_GetObjectItemCaseSensitive(offer_mapping_entry_dtoJSON, "mapping");
    if (mapping) { 
    mapping_local_nonprim = offer_mapping_dto_parseFromJSON(mapping); //nonprimitive
    }

    // offer_mapping_entry_dto->awaiting_moderation_mapping
    cJSON *awaiting_moderation_mapping = cJSON_GetObjectItemCaseSensitive(offer_mapping_entry_dtoJSON, "awaitingModerationMapping");
    if (awaiting_moderation_mapping) { 
    awaiting_moderation_mapping_local_nonprim = offer_mapping_dto_parseFromJSON(awaiting_moderation_mapping); //nonprimitive
    }

    // offer_mapping_entry_dto->rejected_mapping
    cJSON *rejected_mapping = cJSON_GetObjectItemCaseSensitive(offer_mapping_entry_dtoJSON, "rejectedMapping");
    if (rejected_mapping) { 
    rejected_mapping_local_nonprim = offer_mapping_dto_parseFromJSON(rejected_mapping); //nonprimitive
    }

    // offer_mapping_entry_dto->offer
    cJSON *offer = cJSON_GetObjectItemCaseSensitive(offer_mapping_entry_dtoJSON, "offer");
    if (offer) { 
    offer_local_nonprim = mappings_offer_dto_parseFromJSON(offer); //nonprimitive
    }


    offer_mapping_entry_dto_local_var = offer_mapping_entry_dto_create (
        mapping ? mapping_local_nonprim : NULL,
        awaiting_moderation_mapping ? awaiting_moderation_mapping_local_nonprim : NULL,
        rejected_mapping ? rejected_mapping_local_nonprim : NULL,
        offer ? offer_local_nonprim : NULL
        );

    return offer_mapping_entry_dto_local_var;
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
        mappings_offer_dto_free(offer_local_nonprim);
        offer_local_nonprim = NULL;
    }
    return NULL;

}
