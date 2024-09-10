#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_orders_response.h"



get_orders_response_t *get_orders_response_create(
    flipping_pager_dto_t *pager,
    list_t *orders,
    forward_scrolling_pager_dto_t *paging
    ) {
    get_orders_response_t *get_orders_response_local_var = malloc(sizeof(get_orders_response_t));
    if (!get_orders_response_local_var) {
        return NULL;
    }
    get_orders_response_local_var->pager = pager;
    get_orders_response_local_var->orders = orders;
    get_orders_response_local_var->paging = paging;

    return get_orders_response_local_var;
}


void get_orders_response_free(get_orders_response_t *get_orders_response) {
    if(NULL == get_orders_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_orders_response->pager) {
        flipping_pager_dto_free(get_orders_response->pager);
        get_orders_response->pager = NULL;
    }
    if (get_orders_response->orders) {
        list_ForEach(listEntry, get_orders_response->orders) {
            order_dto_free(listEntry->data);
        }
        list_freeList(get_orders_response->orders);
        get_orders_response->orders = NULL;
    }
    if (get_orders_response->paging) {
        forward_scrolling_pager_dto_free(get_orders_response->paging);
        get_orders_response->paging = NULL;
    }
    free(get_orders_response);
}

cJSON *get_orders_response_convertToJSON(get_orders_response_t *get_orders_response) {
    cJSON *item = cJSON_CreateObject();

    // get_orders_response->pager
    if(get_orders_response->pager) {
    cJSON *pager_local_JSON = flipping_pager_dto_convertToJSON(get_orders_response->pager);
    if(pager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pager", pager_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_orders_response->orders
    if (!get_orders_response->orders) {
        goto fail;
    }
    cJSON *orders = cJSON_AddArrayToObject(item, "orders");
    if(orders == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ordersListEntry;
    if (get_orders_response->orders) {
    list_ForEach(ordersListEntry, get_orders_response->orders) {
    cJSON *itemLocal = order_dto_convertToJSON(ordersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(orders, itemLocal);
    }
    }


    // get_orders_response->paging
    if(get_orders_response->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(get_orders_response->paging);
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

get_orders_response_t *get_orders_response_parseFromJSON(cJSON *get_orders_responseJSON){

    get_orders_response_t *get_orders_response_local_var = NULL;

    // define the local variable for get_orders_response->pager
    flipping_pager_dto_t *pager_local_nonprim = NULL;

    // define the local list for get_orders_response->orders
    list_t *ordersList = NULL;

    // define the local variable for get_orders_response->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // get_orders_response->pager
    cJSON *pager = cJSON_GetObjectItemCaseSensitive(get_orders_responseJSON, "pager");
    if (pager) { 
    pager_local_nonprim = flipping_pager_dto_parseFromJSON(pager); //nonprimitive
    }

    // get_orders_response->orders
    cJSON *orders = cJSON_GetObjectItemCaseSensitive(get_orders_responseJSON, "orders");
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
        order_dto_t *ordersItem = order_dto_parseFromJSON(orders_local_nonprimitive);

        list_addElement(ordersList, ordersItem);
    }

    // get_orders_response->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_orders_responseJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    get_orders_response_local_var = get_orders_response_create (
        pager ? pager_local_nonprim : NULL,
        ordersList,
        paging ? paging_local_nonprim : NULL
        );

    return get_orders_response_local_var;
end:
    if (pager_local_nonprim) {
        flipping_pager_dto_free(pager_local_nonprim);
        pager_local_nonprim = NULL;
    }
    if (ordersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ordersList) {
            order_dto_free(listEntry->data);
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
