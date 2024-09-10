#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "provide_order_item_identifiers_request.h"



provide_order_item_identifiers_request_t *provide_order_item_identifiers_request_create(
    list_t *items
    ) {
    provide_order_item_identifiers_request_t *provide_order_item_identifiers_request_local_var = malloc(sizeof(provide_order_item_identifiers_request_t));
    if (!provide_order_item_identifiers_request_local_var) {
        return NULL;
    }
    provide_order_item_identifiers_request_local_var->items = items;

    return provide_order_item_identifiers_request_local_var;
}


void provide_order_item_identifiers_request_free(provide_order_item_identifiers_request_t *provide_order_item_identifiers_request) {
    if(NULL == provide_order_item_identifiers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (provide_order_item_identifiers_request->items) {
        list_ForEach(listEntry, provide_order_item_identifiers_request->items) {
            order_item_instance_modification_dto_free(listEntry->data);
        }
        list_freeList(provide_order_item_identifiers_request->items);
        provide_order_item_identifiers_request->items = NULL;
    }
    free(provide_order_item_identifiers_request);
}

cJSON *provide_order_item_identifiers_request_convertToJSON(provide_order_item_identifiers_request_t *provide_order_item_identifiers_request) {
    cJSON *item = cJSON_CreateObject();

    // provide_order_item_identifiers_request->items
    if (!provide_order_item_identifiers_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (provide_order_item_identifiers_request->items) {
    list_ForEach(itemsListEntry, provide_order_item_identifiers_request->items) {
    cJSON *itemLocal = order_item_instance_modification_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

provide_order_item_identifiers_request_t *provide_order_item_identifiers_request_parseFromJSON(cJSON *provide_order_item_identifiers_requestJSON){

    provide_order_item_identifiers_request_t *provide_order_item_identifiers_request_local_var = NULL;

    // define the local list for provide_order_item_identifiers_request->items
    list_t *itemsList = NULL;

    // provide_order_item_identifiers_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(provide_order_item_identifiers_requestJSON, "items");
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
        order_item_instance_modification_dto_t *itemsItem = order_item_instance_modification_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    provide_order_item_identifiers_request_local_var = provide_order_item_identifiers_request_create (
        itemsList
        );

    return provide_order_item_identifiers_request_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            order_item_instance_modification_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
