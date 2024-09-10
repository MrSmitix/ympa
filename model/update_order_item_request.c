#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_item_request.h"


char* update_order_item_request_reason_ToString(_api__update_order_item_request__e reason) {
    char* reasonArray[] =  { "NULL", "PARTNER_REQUESTED_REMOVE", "USER_REQUESTED_REMOVE" };
    return reasonArray[reason];
}

_api__update_order_item_request__e update_order_item_request_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "PARTNER_REQUESTED_REMOVE", "USER_REQUESTED_REMOVE" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

update_order_item_request_t *update_order_item_request_create(
    list_t *items,
    order_items_modification_request_reason_type_t *reason
    ) {
    update_order_item_request_t *update_order_item_request_local_var = malloc(sizeof(update_order_item_request_t));
    if (!update_order_item_request_local_var) {
        return NULL;
    }
    update_order_item_request_local_var->items = items;
    update_order_item_request_local_var->reason = reason;

    return update_order_item_request_local_var;
}


void update_order_item_request_free(update_order_item_request_t *update_order_item_request) {
    if(NULL == update_order_item_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_item_request->items) {
        list_ForEach(listEntry, update_order_item_request->items) {
            order_item_modification_dto_free(listEntry->data);
        }
        list_freeList(update_order_item_request->items);
        update_order_item_request->items = NULL;
    }
    if (update_order_item_request->reason) {
        order_items_modification_request_reason_type_free(update_order_item_request->reason);
        update_order_item_request->reason = NULL;
    }
    free(update_order_item_request);
}

cJSON *update_order_item_request_convertToJSON(update_order_item_request_t *update_order_item_request) {
    cJSON *item = cJSON_CreateObject();

    // update_order_item_request->items
    if (!update_order_item_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (update_order_item_request->items) {
    list_ForEach(itemsListEntry, update_order_item_request->items) {
    cJSON *itemLocal = order_item_modification_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // update_order_item_request->reason
    if(update_order_item_request->reason != _api__update_order_item_request__NULL) {
    cJSON *reason_local_JSON = order_items_modification_request_reason_type_convertToJSON(update_order_item_request->reason);
    if(reason_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reason", reason_local_JSON);
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

update_order_item_request_t *update_order_item_request_parseFromJSON(cJSON *update_order_item_requestJSON){

    update_order_item_request_t *update_order_item_request_local_var = NULL;

    // define the local list for update_order_item_request->items
    list_t *itemsList = NULL;

    // define the local variable for update_order_item_request->reason
    order_items_modification_request_reason_type_t *reason_local_nonprim = NULL;

    // update_order_item_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(update_order_item_requestJSON, "items");
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        order_item_modification_dto_t *itemsItem = order_item_modification_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // update_order_item_request->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(update_order_item_requestJSON, "reason");
    if (reason) { 
    reason_local_nonprim = order_items_modification_request_reason_type_parseFromJSON(reason); //custom
    }


    update_order_item_request_local_var = update_order_item_request_create (
        itemsList,
        reason ? reason_local_nonprim : NULL
        );

    return update_order_item_request_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            order_item_modification_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (reason_local_nonprim) {
        order_items_modification_request_reason_type_free(reason_local_nonprim);
        reason_local_nonprim = NULL;
    }
    return NULL;

}
