#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_info_dto.h"



offer_mapping_info_dto_t *offer_mapping_info_dto_create(
    offer_mapping_dto_t *mapping,
    offer_mapping_dto_t *awaiting_moderation_mapping,
    offer_mapping_dto_t *rejected_mapping
    ) {
    offer_mapping_info_dto_t *offer_mapping_info_dto_local_var = malloc(sizeof(offer_mapping_info_dto_t));
    if (!offer_mapping_info_dto_local_var) {
        return NULL;
    }
    offer_mapping_info_dto_local_var->mapping = mapping;
    offer_mapping_info_dto_local_var->awaiting_moderation_mapping = awaiting_moderation_mapping;
    offer_mapping_info_dto_local_var->rejected_mapping = rejected_mapping;

    return offer_mapping_info_dto_local_var;
}


void offer_mapping_info_dto_free(offer_mapping_info_dto_t *offer_mapping_info_dto) {
    if(NULL == offer_mapping_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_mapping_info_dto->mapping) {
        offer_mapping_dto_free(offer_mapping_info_dto->mapping);
        offer_mapping_info_dto->mapping = NULL;
    }
    if (offer_mapping_info_dto->awaiting_moderation_mapping) {
        offer_mapping_dto_free(offer_mapping_info_dto->awaiting_moderation_mapping);
        offer_mapping_info_dto->awaiting_moderation_mapping = NULL;
    }
    if (offer_mapping_info_dto->rejected_mapping) {
        offer_mapping_dto_free(offer_mapping_info_dto->rejected_mapping);
        offer_mapping_info_dto->rejected_mapping = NULL;
    }
    free(offer_mapping_info_dto);
}

cJSON *offer_mapping_info_dto_convertToJSON(offer_mapping_info_dto_t *offer_mapping_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_mapping_info_dto->mapping
    if(offer_mapping_info_dto->mapping) {
    cJSON *mapping_local_JSON = offer_mapping_dto_convertToJSON(offer_mapping_info_dto->mapping);
    if(mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mapping", mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_mapping_info_dto->awaiting_moderation_mapping
    if(offer_mapping_info_dto->awaiting_moderation_mapping) {
    cJSON *awaiting_moderation_mapping_local_JSON = offer_mapping_dto_convertToJSON(offer_mapping_info_dto->awaiting_moderation_mapping);
    if(awaiting_moderation_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "awaitingModerationMapping", awaiting_moderation_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_mapping_info_dto->rejected_mapping
    if(offer_mapping_info_dto->rejected_mapping) {
    cJSON *rejected_mapping_local_JSON = offer_mapping_dto_convertToJSON(offer_mapping_info_dto->rejected_mapping);
    if(rejected_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rejectedMapping", rejected_mapping_local_JSON);
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

offer_mapping_info_dto_t *offer_mapping_info_dto_parseFromJSON(cJSON *offer_mapping_info_dtoJSON){

    offer_mapping_info_dto_t *offer_mapping_info_dto_local_var = NULL;

    // define the local variable for offer_mapping_info_dto->mapping
    offer_mapping_dto_t *mapping_local_nonprim = NULL;

    // define the local variable for offer_mapping_info_dto->awaiting_moderation_mapping
    offer_mapping_dto_t *awaiting_moderation_mapping_local_nonprim = NULL;

    // define the local variable for offer_mapping_info_dto->rejected_mapping
    offer_mapping_dto_t *rejected_mapping_local_nonprim = NULL;

    // offer_mapping_info_dto->mapping
    cJSON *mapping = cJSON_GetObjectItemCaseSensitive(offer_mapping_info_dtoJSON, "mapping");
    if (mapping) { 
    mapping_local_nonprim = offer_mapping_dto_parseFromJSON(mapping); //nonprimitive
    }

    // offer_mapping_info_dto->awaiting_moderation_mapping
    cJSON *awaiting_moderation_mapping = cJSON_GetObjectItemCaseSensitive(offer_mapping_info_dtoJSON, "awaitingModerationMapping");
    if (awaiting_moderation_mapping) { 
    awaiting_moderation_mapping_local_nonprim = offer_mapping_dto_parseFromJSON(awaiting_moderation_mapping); //nonprimitive
    }

    // offer_mapping_info_dto->rejected_mapping
    cJSON *rejected_mapping = cJSON_GetObjectItemCaseSensitive(offer_mapping_info_dtoJSON, "rejectedMapping");
    if (rejected_mapping) { 
    rejected_mapping_local_nonprim = offer_mapping_dto_parseFromJSON(rejected_mapping); //nonprimitive
    }


    offer_mapping_info_dto_local_var = offer_mapping_info_dto_create (
        mapping ? mapping_local_nonprim : NULL,
        awaiting_moderation_mapping ? awaiting_moderation_mapping_local_nonprim : NULL,
        rejected_mapping ? rejected_mapping_local_nonprim : NULL
        );

    return offer_mapping_info_dto_local_var;
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
    return NULL;

}
