#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_modification_dto.h"



order_item_modification_dto_t *order_item_modification_dto_create(
    long id,
    int count,
    list_t *instances
    ) {
    order_item_modification_dto_t *order_item_modification_dto_local_var = malloc(sizeof(order_item_modification_dto_t));
    if (!order_item_modification_dto_local_var) {
        return NULL;
    }
    order_item_modification_dto_local_var->id = id;
    order_item_modification_dto_local_var->count = count;
    order_item_modification_dto_local_var->instances = instances;

    return order_item_modification_dto_local_var;
}


void order_item_modification_dto_free(order_item_modification_dto_t *order_item_modification_dto) {
    if(NULL == order_item_modification_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_item_modification_dto->instances) {
        list_ForEach(listEntry, order_item_modification_dto->instances) {
            brief_order_item_instance_dto_free(listEntry->data);
        }
        list_freeList(order_item_modification_dto->instances);
        order_item_modification_dto->instances = NULL;
    }
    free(order_item_modification_dto);
}

cJSON *order_item_modification_dto_convertToJSON(order_item_modification_dto_t *order_item_modification_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_item_modification_dto->id
    if (!order_item_modification_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", order_item_modification_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // order_item_modification_dto->count
    if (!order_item_modification_dto->count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "count", order_item_modification_dto->count) == NULL) {
    goto fail; //Numeric
    }


    // order_item_modification_dto->instances
    if(order_item_modification_dto->instances) {
    cJSON *instances = cJSON_AddArrayToObject(item, "instances");
    if(instances == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *instancesListEntry;
    if (order_item_modification_dto->instances) {
    list_ForEach(instancesListEntry, order_item_modification_dto->instances) {
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

order_item_modification_dto_t *order_item_modification_dto_parseFromJSON(cJSON *order_item_modification_dtoJSON){

    order_item_modification_dto_t *order_item_modification_dto_local_var = NULL;

    // define the local list for order_item_modification_dto->instances
    list_t *instancesList = NULL;

    // order_item_modification_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_item_modification_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // order_item_modification_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(order_item_modification_dtoJSON, "count");
    if (!count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }

    // order_item_modification_dto->instances
    cJSON *instances = cJSON_GetObjectItemCaseSensitive(order_item_modification_dtoJSON, "instances");
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


    order_item_modification_dto_local_var = order_item_modification_dto_create (
        id->valuedouble,
        count->valuedouble,
        instances ? instancesList : NULL
        );

    return order_item_modification_dto_local_var;
end:
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
