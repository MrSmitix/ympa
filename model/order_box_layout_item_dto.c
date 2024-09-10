#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_box_layout_item_dto.h"



order_box_layout_item_dto_t *order_box_layout_item_dto_create(
    long id,
    int full_count,
    order_box_layout_partial_count_dto_t *partial_count,
    list_t *instances
    ) {
    order_box_layout_item_dto_t *order_box_layout_item_dto_local_var = malloc(sizeof(order_box_layout_item_dto_t));
    if (!order_box_layout_item_dto_local_var) {
        return NULL;
    }
    order_box_layout_item_dto_local_var->id = id;
    order_box_layout_item_dto_local_var->full_count = full_count;
    order_box_layout_item_dto_local_var->partial_count = partial_count;
    order_box_layout_item_dto_local_var->instances = instances;

    return order_box_layout_item_dto_local_var;
}


void order_box_layout_item_dto_free(order_box_layout_item_dto_t *order_box_layout_item_dto) {
    if(NULL == order_box_layout_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_box_layout_item_dto->partial_count) {
        order_box_layout_partial_count_dto_free(order_box_layout_item_dto->partial_count);
        order_box_layout_item_dto->partial_count = NULL;
    }
    if (order_box_layout_item_dto->instances) {
        list_ForEach(listEntry, order_box_layout_item_dto->instances) {
            brief_order_item_instance_dto_free(listEntry->data);
        }
        list_freeList(order_box_layout_item_dto->instances);
        order_box_layout_item_dto->instances = NULL;
    }
    free(order_box_layout_item_dto);
}

cJSON *order_box_layout_item_dto_convertToJSON(order_box_layout_item_dto_t *order_box_layout_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_box_layout_item_dto->id
    if (!order_box_layout_item_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", order_box_layout_item_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // order_box_layout_item_dto->full_count
    if(order_box_layout_item_dto->full_count) {
    if(cJSON_AddNumberToObject(item, "fullCount", order_box_layout_item_dto->full_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_box_layout_item_dto->partial_count
    if(order_box_layout_item_dto->partial_count) {
    cJSON *partial_count_local_JSON = order_box_layout_partial_count_dto_convertToJSON(order_box_layout_item_dto->partial_count);
    if(partial_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "partialCount", partial_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_box_layout_item_dto->instances
    if(order_box_layout_item_dto->instances) {
    cJSON *instances = cJSON_AddArrayToObject(item, "instances");
    if(instances == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *instancesListEntry;
    if (order_box_layout_item_dto->instances) {
    list_ForEach(instancesListEntry, order_box_layout_item_dto->instances) {
    cJSON *itemLocal = brief_order_item_instance_dto_convertToJSON(instancesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(instances, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_box_layout_item_dto_t *order_box_layout_item_dto_parseFromJSON(cJSON *order_box_layout_item_dtoJSON){

    order_box_layout_item_dto_t *order_box_layout_item_dto_local_var = NULL;

    // define the local variable for order_box_layout_item_dto->partial_count
    order_box_layout_partial_count_dto_t *partial_count_local_nonprim = NULL;

    // define the local list for order_box_layout_item_dto->instances
    list_t *instancesList = NULL;

    // order_box_layout_item_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_box_layout_item_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // order_box_layout_item_dto->full_count
    cJSON *full_count = cJSON_GetObjectItemCaseSensitive(order_box_layout_item_dtoJSON, "fullCount");
    if (full_count) { 
    if(!cJSON_IsNumber(full_count))
    {
    goto end; //Numeric
    }
    }

    // order_box_layout_item_dto->partial_count
    cJSON *partial_count = cJSON_GetObjectItemCaseSensitive(order_box_layout_item_dtoJSON, "partialCount");
    if (partial_count) { 
    partial_count_local_nonprim = order_box_layout_partial_count_dto_parseFromJSON(partial_count); //nonprimitive
    }

    // order_box_layout_item_dto->instances
    cJSON *instances = cJSON_GetObjectItemCaseSensitive(order_box_layout_item_dtoJSON, "instances");
    if (instances) { 
    cJSON *instances_local_nonprimitive = NULL;
    if(!cJSON_IsArray(instances)){
        goto end; //nonprimitive container
    }

    instancesList = list_createList();

    cJSON_ArrayForEach(instances_local_nonprimitive,instances )
    {
        if(!cJSON_IsObject(instances_local_nonprimitive)){
            goto end;
        }
        brief_order_item_instance_dto_t *instancesItem = brief_order_item_instance_dto_parseFromJSON(instances_local_nonprimitive);

        list_addElement(instancesList, instancesItem);
    }
    }


    order_box_layout_item_dto_local_var = order_box_layout_item_dto_create (
        id->valuedouble,
        full_count ? full_count->valuedouble : 0,
        partial_count ? partial_count_local_nonprim : NULL,
        instances ? instancesList : NULL
        );

    return order_box_layout_item_dto_local_var;
end:
    if (partial_count_local_nonprim) {
        order_box_layout_partial_count_dto_free(partial_count_local_nonprim);
        partial_count_local_nonprim = NULL;
    }
    if (instancesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, instancesList) {
            brief_order_item_instance_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(instancesList);
        instancesList = NULL;
    }
    return NULL;

}
