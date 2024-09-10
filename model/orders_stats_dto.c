#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_dto.h"



orders_stats_dto_t *orders_stats_dto_create(
    list_t *orders,
    forward_scrolling_pager_dto_t *paging
    ) {
    orders_stats_dto_t *orders_stats_dto_local_var = malloc(sizeof(orders_stats_dto_t));
    if (!orders_stats_dto_local_var) {
        return NULL;
    }
    orders_stats_dto_local_var->orders = orders;
    orders_stats_dto_local_var->paging = paging;

    return orders_stats_dto_local_var;
}


void orders_stats_dto_free(orders_stats_dto_t *orders_stats_dto) {
    if(NULL == orders_stats_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_dto->orders) {
        list_ForEach(listEntry, orders_stats_dto->orders) {
            orders_stats_order_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_dto->orders);
        orders_stats_dto->orders = NULL;
    }
    if (orders_stats_dto->paging) {
        forward_scrolling_pager_dto_free(orders_stats_dto->paging);
        orders_stats_dto->paging = NULL;
    }
    free(orders_stats_dto);
}

cJSON *orders_stats_dto_convertToJSON(orders_stats_dto_t *orders_stats_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_dto->orders
    if (!orders_stats_dto->orders) {
        goto fail;
    }
    cJSON *orders = cJSON_AddArrayToObject(item, "orders");
    if(orders == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ordersListEntry;
    if (orders_stats_dto->orders) {
    list_ForEach(ordersListEntry, orders_stats_dto->orders) {
    cJSON *itemLocal = orders_stats_order_dto_convertToJSON(ordersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(orders, itemLocal);
    }
    }


    // orders_stats_dto->paging
    if(orders_stats_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(orders_stats_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
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

orders_stats_dto_t *orders_stats_dto_parseFromJSON(cJSON *orders_stats_dtoJSON){

    orders_stats_dto_t *orders_stats_dto_local_var = NULL;

    // define the local list for orders_stats_dto->orders
    list_t *ordersList = NULL;

    // define the local variable for orders_stats_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // orders_stats_dto->orders
    cJSON *orders = cJSON_GetObjectItemCaseSensitive(orders_stats_dtoJSON, "orders");
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
        orders_stats_order_dto_t *ordersItem = orders_stats_order_dto_parseFromJSON(orders_local_nonprimitive);

        list_addElement(ordersList, ordersItem);
    }

    // orders_stats_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(orders_stats_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    orders_stats_dto_local_var = orders_stats_dto_create (
        ordersList,
        paging ? paging_local_nonprim : NULL
        );

    return orders_stats_dto_local_var;
end:
    if (ordersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ordersList) {
            orders_stats_order_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ordersList);
        ordersList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
