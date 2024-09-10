#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offers_dto.h"



offers_dto_t *offers_dto_create(
    list_t *offers
    ) {
    offers_dto_t *offers_dto_local_var = malloc(sizeof(offers_dto_t));
    if (!offers_dto_local_var) {
        return NULL;
    }
    offers_dto_local_var->offers = offers;

    return offers_dto_local_var;
}


void offers_dto_free(offers_dto_t *offers_dto) {
    if(NULL == offers_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offers_dto->offers) {
        list_ForEach(listEntry, offers_dto->offers) {
            offer_dto_free(listEntry->data);
        }
        list_freeList(offers_dto->offers);
        offers_dto->offers = NULL;
    }
    free(offers_dto);
}

cJSON *offers_dto_convertToJSON(offers_dto_t *offers_dto) {
    cJSON *item = cJSON_CreateObject();

    // offers_dto->offers
    if (!offers_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (offers_dto->offers) {
    list_ForEach(offersListEntry, offers_dto->offers) {
    cJSON *itemLocal = offer_dto_convertToJSON(offersListEntry->data);
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

offers_dto_t *offers_dto_parseFromJSON(cJSON *offers_dtoJSON){

    offers_dto_t *offers_dto_local_var = NULL;

    // define the local list for offers_dto->offers
    list_t *offersList = NULL;

    // offers_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(offers_dtoJSON, "offers");
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
        offer_dto_t *offersItem = offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    offers_dto_local_var = offers_dto_create (
        offersList
        );

    return offers_dto_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
