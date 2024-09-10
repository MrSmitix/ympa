#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_mappings_request.h"



update_offer_mappings_request_t *update_offer_mappings_request_create(
    list_t *offer_mappings,
    int only_partner_media_content
    ) {
    update_offer_mappings_request_t *update_offer_mappings_request_local_var = malloc(sizeof(update_offer_mappings_request_t));
    if (!update_offer_mappings_request_local_var) {
        return NULL;
    }
    update_offer_mappings_request_local_var->offer_mappings = offer_mappings;
    update_offer_mappings_request_local_var->only_partner_media_content = only_partner_media_content;

    return update_offer_mappings_request_local_var;
}


void update_offer_mappings_request_free(update_offer_mappings_request_t *update_offer_mappings_request) {
    if(NULL == update_offer_mappings_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_mappings_request->offer_mappings) {
        list_ForEach(listEntry, update_offer_mappings_request->offer_mappings) {
            update_offer_mapping_dto_free(listEntry->data);
        }
        list_freeList(update_offer_mappings_request->offer_mappings);
        update_offer_mappings_request->offer_mappings = NULL;
    }
    free(update_offer_mappings_request);
}

cJSON *update_offer_mappings_request_convertToJSON(update_offer_mappings_request_t *update_offer_mappings_request) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_mappings_request->offer_mappings
    if (!update_offer_mappings_request->offer_mappings) {
        goto fail;
    }
    cJSON *offer_mappings = cJSON_AddArrayToObject(item, "offerMappings");
    if(offer_mappings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offer_mappingsListEntry;
    if (update_offer_mappings_request->offer_mappings) {
    list_ForEach(offer_mappingsListEntry, update_offer_mappings_request->offer_mappings) {
    cJSON *itemLocal = update_offer_mapping_dto_convertToJSON(offer_mappingsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offer_mappings, itemLocal);
    }
    }


    // update_offer_mappings_request->only_partner_media_content
    if(update_offer_mappings_request->only_partner_media_content) {
    if(cJSON_AddBoolToObject(item, "onlyPartnerMediaContent", update_offer_mappings_request->only_partner_media_content) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_offer_mappings_request_t *update_offer_mappings_request_parseFromJSON(cJSON *update_offer_mappings_requestJSON){

    update_offer_mappings_request_t *update_offer_mappings_request_local_var = NULL;

    // define the local list for update_offer_mappings_request->offer_mappings
    list_t *offer_mappingsList = NULL;

    // update_offer_mappings_request->offer_mappings
    cJSON *offer_mappings = cJSON_GetObjectItemCaseSensitive(update_offer_mappings_requestJSON, "offerMappings");
    if (!offer_mappings) {
        goto end;
    }

    
    cJSON *offer_mappings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offer_mappings)){
        goto end; //nonprimitive container
    }

    offer_mappingsList = list_createList();

    cJSON_ArrayForEach(offer_mappings_local_nonprimitive,offer_mappings )
    {
        if(!cJSON_IsObject(offer_mappings_local_nonprimitive)){
            goto end;
        }
        update_offer_mapping_dto_t *offer_mappingsItem = update_offer_mapping_dto_parseFromJSON(offer_mappings_local_nonprimitive);

        list_addElement(offer_mappingsList, offer_mappingsItem);
    }

    // update_offer_mappings_request->only_partner_media_content
    cJSON *only_partner_media_content = cJSON_GetObjectItemCaseSensitive(update_offer_mappings_requestJSON, "onlyPartnerMediaContent");
    if (only_partner_media_content) { 
    if(!cJSON_IsBool(only_partner_media_content))
    {
    goto end; //Bool
    }
    }


    update_offer_mappings_request_local_var = update_offer_mappings_request_create (
        offer_mappingsList,
        only_partner_media_content ? only_partner_media_content->valueint : 0
        );

    return update_offer_mappings_request_local_var;
end:
    if (offer_mappingsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_mappingsList) {
            update_offer_mapping_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_mappingsList);
        offer_mappingsList = NULL;
    }
    return NULL;

}
