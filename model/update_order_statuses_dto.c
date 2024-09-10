#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_statuses_dto.h"



update_order_statuses_dto_t *update_order_statuses_dto_create(
    list_t *orders
    ) {
    update_order_statuses_dto_t *update_order_statuses_dto_local_var = malloc(sizeof(update_order_statuses_dto_t));
    if (!update_order_statuses_dto_local_var) {
        return NULL;
    }
    update_order_statuses_dto_local_var->orders = orders;

    return update_order_statuses_dto_local_var;
}


void update_order_statuses_dto_free(update_order_statuses_dto_t *update_order_statuses_dto) {
    if(NULL == update_order_statuses_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_statuses_dto->orders) {
        list_ForEach(listEntry, update_order_statuses_dto->orders) {
            update_order_status_dto_free(listEntry->data);
        }
        list_freeList(update_order_statuses_dto->orders);
        update_order_statuses_dto->orders = NULL;
    }
    free(update_order_statuses_dto);
}

cJSON *update_order_statuses_dto_convertToJSON(update_order_statuses_dto_t *update_order_statuses_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_order_statuses_dto->orders
    if (!update_order_statuses_dto->orders) {
        goto fail;
    }
    cJSON *orders = cJSON_AddArrayToObject(item, "orders");
    if(orders == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ordersListEntry;
    if (update_order_statuses_dto->orders) {
    list_ForEach(ordersListEntry, update_order_statuses_dto->orders) {
    cJSON *itemLocal = update_order_status_dto_convertToJSON(ordersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(orders, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_order_statuses_dto_t *update_order_statuses_dto_parseFromJSON(cJSON *update_order_statuses_dtoJSON){

    update_order_statuses_dto_t *update_order_statuses_dto_local_var = NULL;

    // define the local list for update_order_statuses_dto->orders
    list_t *ordersList = NULL;

    // update_order_statuses_dto->orders
    cJSON *orders = cJSON_GetObjectItemCaseSensitive(update_order_statuses_dtoJSON, "orders");
    if (!orders) {
        goto end;
    }

    
    cJSON *orders_local_nonprimitive = NULL;
    if(!cJSON_IsArray(orders)){
        goto end; //nonprimitive container
    }

    ordersList = list_createList();

    cJSON_ArrayForEach(orders_local_nonprimitive,orders )
    {
        if(!cJSON_IsObject(orders_local_nonprimitive)){
            goto end;
        }
        update_order_status_dto_t *ordersItem = update_order_status_dto_parseFromJSON(orders_local_nonprimitive);

        list_addElement(ordersList, ordersItem);
    }


    update_order_statuses_dto_local_var = update_order_statuses_dto_create (
        ordersList
        );

    return update_order_statuses_dto_local_var;
end:
    if (ordersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ordersList) {
            update_order_status_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ordersList);
        ordersList = NULL;
    }
    return NULL;

}
