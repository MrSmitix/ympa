#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_content_request.h"



update_offer_content_request_t *update_offer_content_request_create(
    list_t *offers_content
    ) {
    update_offer_content_request_t *update_offer_content_request_local_var = malloc(sizeof(update_offer_content_request_t));
    if (!update_offer_content_request_local_var) {
        return NULL;
    }
    update_offer_content_request_local_var->offers_content = offers_content;

    return update_offer_content_request_local_var;
}


void update_offer_content_request_free(update_offer_content_request_t *update_offer_content_request) {
    if(NULL == update_offer_content_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_content_request->offers_content) {
        list_ForEach(listEntry, update_offer_content_request->offers_content) {
            offer_content_dto_free(listEntry->data);
        }
        list_freeList(update_offer_content_request->offers_content);
        update_offer_content_request->offers_content = NULL;
    }
    free(update_offer_content_request);
}

cJSON *update_offer_content_request_convertToJSON(update_offer_content_request_t *update_offer_content_request) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_content_request->offers_content
    if (!update_offer_content_request->offers_content) {
        goto fail;
    }
    cJSON *offers_content = cJSON_AddArrayToObject(item, "offersContent");
    if(offers_content == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offers_contentListEntry;
    if (update_offer_content_request->offers_content) {
    list_ForEach(offers_contentListEntry, update_offer_content_request->offers_content) {
    cJSON *itemLocal = offer_content_dto_convertToJSON(offers_contentListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers_content, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_offer_content_request_t *update_offer_content_request_parseFromJSON(cJSON *update_offer_content_requestJSON){

    update_offer_content_request_t *update_offer_content_request_local_var = NULL;

    // define the local list for update_offer_content_request->offers_content
    list_t *offers_contentList = NULL;

    // update_offer_content_request->offers_content
    cJSON *offers_content = cJSON_GetObjectItemCaseSensitive(update_offer_content_requestJSON, "offersContent");
    if (!offers_content) {
        goto end;
    }

    
    cJSON *offers_content_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offers_content)){
        goto end; //nonprimitive container
    }

    offers_contentList = list_createList();

    cJSON_ArrayForEach(offers_content_local_nonprimitive,offers_content )
    {
        if(!cJSON_IsObject(offers_content_local_nonprimitive)){
            goto end;
        }
        offer_content_dto_t *offers_contentItem = offer_content_dto_parseFromJSON(offers_content_local_nonprimitive);

        list_addElement(offers_contentList, offers_contentItem);
    }


    update_offer_content_request_local_var = update_offer_content_request_create (
        offers_contentList
        );

    return update_offer_content_request_local_var;
end:
    if (offers_contentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offers_contentList) {
            offer_content_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offers_contentList);
        offers_contentList = NULL;
    }
    return NULL;

}
