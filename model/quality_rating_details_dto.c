#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_rating_details_dto.h"



quality_rating_details_dto_t *quality_rating_details_dto_create(
    list_t *affected_orders
    ) {
    quality_rating_details_dto_t *quality_rating_details_dto_local_var = malloc(sizeof(quality_rating_details_dto_t));
    if (!quality_rating_details_dto_local_var) {
        return NULL;
    }
    quality_rating_details_dto_local_var->affected_orders = affected_orders;

    return quality_rating_details_dto_local_var;
}


void quality_rating_details_dto_free(quality_rating_details_dto_t *quality_rating_details_dto) {
    if(NULL == quality_rating_details_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (quality_rating_details_dto->affected_orders) {
        list_ForEach(listEntry, quality_rating_details_dto->affected_orders) {
            quality_rating_affected_order_dto_free(listEntry->data);
        }
        list_freeList(quality_rating_details_dto->affected_orders);
        quality_rating_details_dto->affected_orders = NULL;
    }
    free(quality_rating_details_dto);
}

cJSON *quality_rating_details_dto_convertToJSON(quality_rating_details_dto_t *quality_rating_details_dto) {
    cJSON *item = cJSON_CreateObject();

    // quality_rating_details_dto->affected_orders
    if (!quality_rating_details_dto->affected_orders) {
        goto fail;
    }
    cJSON *affected_orders = cJSON_AddArrayToObject(item, "affectedOrders");
    if(affected_orders == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *affected_ordersListEntry;
    if (quality_rating_details_dto->affected_orders) {
    list_ForEach(affected_ordersListEntry, quality_rating_details_dto->affected_orders) {
    cJSON *itemLocal = quality_rating_affected_order_dto_convertToJSON(affected_ordersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(affected_orders, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

quality_rating_details_dto_t *quality_rating_details_dto_parseFromJSON(cJSON *quality_rating_details_dtoJSON){

    quality_rating_details_dto_t *quality_rating_details_dto_local_var = NULL;

    // define the local list for quality_rating_details_dto->affected_orders
    list_t *affected_ordersList = NULL;

    // quality_rating_details_dto->affected_orders
    cJSON *affected_orders = cJSON_GetObjectItemCaseSensitive(quality_rating_details_dtoJSON, "affectedOrders");
    if (!affected_orders) {
        goto end;
    }

    
    cJSON *affected_orders_local_nonprimitive = NULL;
    if(!cJSON_IsArray(affected_orders)){
        goto end; //nonprimitive container
    }

    affected_ordersList = list_createList();

    cJSON_ArrayForEach(affected_orders_local_nonprimitive,affected_orders )
    {
        if(!cJSON_IsObject(affected_orders_local_nonprimitive)){
            goto end;
        }
        quality_rating_affected_order_dto_t *affected_ordersItem = quality_rating_affected_order_dto_parseFromJSON(affected_orders_local_nonprimitive);

        list_addElement(affected_ordersList, affected_ordersItem);
    }


    quality_rating_details_dto_local_var = quality_rating_details_dto_create (
        affected_ordersList
        );

    return quality_rating_details_dto_local_var;
end:
    if (affected_ordersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, affected_ordersList) {
            quality_rating_affected_order_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(affected_ordersList);
        affected_ordersList = NULL;
    }
    return NULL;

}
