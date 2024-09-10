#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_suggested_offer_mapping_entries_request.h"



get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request_create(
    list_t *offers
    ) {
    get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request_local_var = malloc(sizeof(get_suggested_offer_mapping_entries_request_t));
    if (!get_suggested_offer_mapping_entries_request_local_var) {
        return NULL;
    }
    get_suggested_offer_mapping_entries_request_local_var->offers = offers;

    return get_suggested_offer_mapping_entries_request_local_var;
}


void get_suggested_offer_mapping_entries_request_free(get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request) {
    if(NULL == get_suggested_offer_mapping_entries_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_suggested_offer_mapping_entries_request->offers) {
        list_ForEach(listEntry, get_suggested_offer_mapping_entries_request->offers) {
            mappings_offer_dto_free(listEntry->data);
        }
        list_freeList(get_suggested_offer_mapping_entries_request->offers);
        get_suggested_offer_mapping_entries_request->offers = NULL;
    }
    free(get_suggested_offer_mapping_entries_request);
}

cJSON *get_suggested_offer_mapping_entries_request_convertToJSON(get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request) {
    cJSON *item = cJSON_CreateObject();

    // get_suggested_offer_mapping_entries_request->offers
    if (!get_suggested_offer_mapping_entries_request->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (get_suggested_offer_mapping_entries_request->offers) {
    list_ForEach(offersListEntry, get_suggested_offer_mapping_entries_request->offers) {
    cJSON *itemLocal = mappings_offer_dto_convertToJSON(offersListEntry->data);
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

get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request_parseFromJSON(cJSON *get_suggested_offer_mapping_entries_requestJSON){

    get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request_local_var = NULL;

    // define the local list for get_suggested_offer_mapping_entries_request->offers
    list_t *offersList = NULL;

    // get_suggested_offer_mapping_entries_request->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(get_suggested_offer_mapping_entries_requestJSON, "offers");
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
        mappings_offer_dto_t *offersItem = mappings_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    get_suggested_offer_mapping_entries_request_local_var = get_suggested_offer_mapping_entries_request_create (
        offersList
        );

    return get_suggested_offer_mapping_entries_request_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            mappings_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
