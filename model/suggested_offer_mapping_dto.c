#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "suggested_offer_mapping_dto.h"



suggested_offer_mapping_dto_t *suggested_offer_mapping_dto_create(
    suggested_offer_dto_t *offer,
    get_mapping_dto_t *mapping
    ) {
    suggested_offer_mapping_dto_t *suggested_offer_mapping_dto_local_var = malloc(sizeof(suggested_offer_mapping_dto_t));
    if (!suggested_offer_mapping_dto_local_var) {
        return NULL;
    }
    suggested_offer_mapping_dto_local_var->offer = offer;
    suggested_offer_mapping_dto_local_var->mapping = mapping;

    return suggested_offer_mapping_dto_local_var;
}


void suggested_offer_mapping_dto_free(suggested_offer_mapping_dto_t *suggested_offer_mapping_dto) {
    if(NULL == suggested_offer_mapping_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (suggested_offer_mapping_dto->offer) {
        suggested_offer_dto_free(suggested_offer_mapping_dto->offer);
        suggested_offer_mapping_dto->offer = NULL;
    }
    if (suggested_offer_mapping_dto->mapping) {
        get_mapping_dto_free(suggested_offer_mapping_dto->mapping);
        suggested_offer_mapping_dto->mapping = NULL;
    }
    free(suggested_offer_mapping_dto);
}

cJSON *suggested_offer_mapping_dto_convertToJSON(suggested_offer_mapping_dto_t *suggested_offer_mapping_dto) {
    cJSON *item = cJSON_CreateObject();

    // suggested_offer_mapping_dto->offer
    if(suggested_offer_mapping_dto->offer) {
    cJSON *offer_local_JSON = suggested_offer_dto_convertToJSON(suggested_offer_mapping_dto->offer);
    if(offer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offer", offer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // suggested_offer_mapping_dto->mapping
    if(suggested_offer_mapping_dto->mapping) {
    cJSON *mapping_local_JSON = get_mapping_dto_convertToJSON(suggested_offer_mapping_dto->mapping);
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

suggested_offer_mapping_dto_t *suggested_offer_mapping_dto_parseFromJSON(cJSON *suggested_offer_mapping_dtoJSON){

    suggested_offer_mapping_dto_t *suggested_offer_mapping_dto_local_var = NULL;

    // define the local variable for suggested_offer_mapping_dto->offer
    suggested_offer_dto_t *offer_local_nonprim = NULL;

    // define the local variable for suggested_offer_mapping_dto->mapping
    get_mapping_dto_t *mapping_local_nonprim = NULL;

    // suggested_offer_mapping_dto->offer
    cJSON *offer = cJSON_GetObjectItemCaseSensitive(suggested_offer_mapping_dtoJSON, "offer");
    if (offer) { 
    offer_local_nonprim = suggested_offer_dto_parseFromJSON(offer); //nonprimitive
    }

    // suggested_offer_mapping_dto->mapping
    cJSON *mapping = cJSON_GetObjectItemCaseSensitive(suggested_offer_mapping_dtoJSON, "mapping");
    if (mapping) { 
    mapping_local_nonprim = get_mapping_dto_parseFromJSON(mapping); //nonprimitive
    }


    suggested_offer_mapping_dto_local_var = suggested_offer_mapping_dto_create (
        offer ? offer_local_nonprim : NULL,
        mapping ? mapping_local_nonprim : NULL
        );

    return suggested_offer_mapping_dto_local_var;
end:
    if (offer_local_nonprim) {
        suggested_offer_dto_free(offer_local_nonprim);
        offer_local_nonprim = NULL;
    }
    if (mapping_local_nonprim) {
        get_mapping_dto_free(mapping_local_nonprim);
        mapping_local_nonprim = NULL;
    }
    return NULL;

}
