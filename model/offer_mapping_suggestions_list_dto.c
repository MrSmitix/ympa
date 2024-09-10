#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_suggestions_list_dto.h"



offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto_create(
    list_t *offers
    ) {
    offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto_local_var = malloc(sizeof(offer_mapping_suggestions_list_dto_t));
    if (!offer_mapping_suggestions_list_dto_local_var) {
        return NULL;
    }
    offer_mapping_suggestions_list_dto_local_var->offers = offers;

    return offer_mapping_suggestions_list_dto_local_var;
}


void offer_mapping_suggestions_list_dto_free(offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto) {
    if(NULL == offer_mapping_suggestions_list_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_mapping_suggestions_list_dto->offers) {
        list_ForEach(listEntry, offer_mapping_suggestions_list_dto->offers) {
            enriched_mappings_offer_dto_free(listEntry->data);
        }
        list_freeList(offer_mapping_suggestions_list_dto->offers);
        offer_mapping_suggestions_list_dto->offers = NULL;
    }
    free(offer_mapping_suggestions_list_dto);
}

cJSON *offer_mapping_suggestions_list_dto_convertToJSON(offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_mapping_suggestions_list_dto->offers
    if (!offer_mapping_suggestions_list_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (offer_mapping_suggestions_list_dto->offers) {
    list_ForEach(offersListEntry, offer_mapping_suggestions_list_dto->offers) {
    cJSON *itemLocal = enriched_mappings_offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto_parseFromJSON(cJSON *offer_mapping_suggestions_list_dtoJSON){

    offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto_local_var = NULL;

    // define the local list for offer_mapping_suggestions_list_dto->offers
    list_t *offersList = NULL;

    // offer_mapping_suggestions_list_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(offer_mapping_suggestions_list_dtoJSON, "offers");
    if (!offers) {
        goto end;
    }

    
    cJSON *offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offers)){
        goto end; //nonprimitive container
    }

    offersList = list_createList();

    cJSON_ArrayForEach(offers_local_nonprimitive,offers )
    {
        if(!cJSON_IsObject(offers_local_nonprimitive)){
            goto end;
        }
        enriched_mappings_offer_dto_t *offersItem = enriched_mappings_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    offer_mapping_suggestions_list_dto_local_var = offer_mapping_suggestions_list_dto_create (
        offersList
        );

    return offer_mapping_suggestions_list_dto_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            enriched_mappings_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
