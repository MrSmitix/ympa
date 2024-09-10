#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_mapping_dto.h"



update_offer_mapping_dto_t *update_offer_mapping_dto_create(
    update_offer_dto_t *offer,
    update_mapping_dto_t *mapping
    ) {
    update_offer_mapping_dto_t *update_offer_mapping_dto_local_var = malloc(sizeof(update_offer_mapping_dto_t));
    if (!update_offer_mapping_dto_local_var) {
        return NULL;
    }
    update_offer_mapping_dto_local_var->offer = offer;
    update_offer_mapping_dto_local_var->mapping = mapping;

    return update_offer_mapping_dto_local_var;
}


void update_offer_mapping_dto_free(update_offer_mapping_dto_t *update_offer_mapping_dto) {
    if(NULL == update_offer_mapping_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_mapping_dto->offer) {
        update_offer_dto_free(update_offer_mapping_dto->offer);
        update_offer_mapping_dto->offer = NULL;
    }
    if (update_offer_mapping_dto->mapping) {
        update_mapping_dto_free(update_offer_mapping_dto->mapping);
        update_offer_mapping_dto->mapping = NULL;
    }
    free(update_offer_mapping_dto);
}

cJSON *update_offer_mapping_dto_convertToJSON(update_offer_mapping_dto_t *update_offer_mapping_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_mapping_dto->offer
    if (!update_offer_mapping_dto->offer) {
        goto fail;
    }
    cJSON *offer_local_JSON = update_offer_dto_convertToJSON(update_offer_mapping_dto->offer);
    if(offer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offer", offer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // update_offer_mapping_dto->mapping
    if(update_offer_mapping_dto->mapping) {
    cJSON *mapping_local_JSON = update_mapping_dto_convertToJSON(update_offer_mapping_dto->mapping);
    if(mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mapping", mapping_local_JSON);
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

update_offer_mapping_dto_t *update_offer_mapping_dto_parseFromJSON(cJSON *update_offer_mapping_dtoJSON){

    update_offer_mapping_dto_t *update_offer_mapping_dto_local_var = NULL;

    // define the local variable for update_offer_mapping_dto->offer
    update_offer_dto_t *offer_local_nonprim = NULL;

    // define the local variable for update_offer_mapping_dto->mapping
    update_mapping_dto_t *mapping_local_nonprim = NULL;

    // update_offer_mapping_dto->offer
    cJSON *offer = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_dtoJSON, "offer");
    if (!offer) {
        goto end;
    }

    
    offer_local_nonprim = update_offer_dto_parseFromJSON(offer); //nonprimitive

    // update_offer_mapping_dto->mapping
    cJSON *mapping = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_dtoJSON, "mapping");
    if (mapping) { 
    mapping_local_nonprim = update_mapping_dto_parseFromJSON(mapping); //nonprimitive
    }


    update_offer_mapping_dto_local_var = update_offer_mapping_dto_create (
        offer_local_nonprim,
        mapping ? mapping_local_nonprim : NULL
        );

    return update_offer_mapping_dto_local_var;
end:
    if (offer_local_nonprim) {
        update_offer_dto_free(offer_local_nonprim);
        offer_local_nonprim = NULL;
    }
    if (mapping_local_nonprim) {
        update_mapping_dto_free(mapping_local_nonprim);
        mapping_local_nonprim = NULL;
    }
    return NULL;

}
