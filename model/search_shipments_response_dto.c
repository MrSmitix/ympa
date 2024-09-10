#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "search_shipments_response_dto.h"



search_shipments_response_dto_t *search_shipments_response_dto_create(
    list_t *shipments,
    forward_scrolling_pager_dto_t *paging
    ) {
    search_shipments_response_dto_t *search_shipments_response_dto_local_var = malloc(sizeof(search_shipments_response_dto_t));
    if (!search_shipments_response_dto_local_var) {
        return NULL;
    }
    search_shipments_response_dto_local_var->shipments = shipments;
    search_shipments_response_dto_local_var->paging = paging;

    return search_shipments_response_dto_local_var;
}


void search_shipments_response_dto_free(search_shipments_response_dto_t *search_shipments_response_dto) {
    if(NULL == search_shipments_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (search_shipments_response_dto->shipments) {
        list_ForEach(listEntry, search_shipments_response_dto->shipments) {
            shipment_info_dto_free(listEntry->data);
        }
        list_freeList(search_shipments_response_dto->shipments);
        search_shipments_response_dto->shipments = NULL;
    }
    if (search_shipments_response_dto->paging) {
        forward_scrolling_pager_dto_free(search_shipments_response_dto->paging);
        search_shipments_response_dto->paging = NULL;
    }
    free(search_shipments_response_dto);
}

cJSON *search_shipments_response_dto_convertToJSON(search_shipments_response_dto_t *search_shipments_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // search_shipments_response_dto->shipments
    if (!search_shipments_response_dto->shipments) {
        goto fail;
    }
    cJSON *shipments = cJSON_AddArrayToObject(item, "shipments");
    if(shipments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *shipmentsListEntry;
    if (search_shipments_response_dto->shipments) {
    list_ForEach(shipmentsListEntry, search_shipments_response_dto->shipments) {
    cJSON *itemLocal = shipment_info_dto_convertToJSON(shipmentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(shipments, itemLocal);
    }
    }


    // search_shipments_response_dto->paging
    if(search_shipments_response_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(search_shipments_response_dto->paging);
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

search_shipments_response_dto_t *search_shipments_response_dto_parseFromJSON(cJSON *search_shipments_response_dtoJSON){

    search_shipments_response_dto_t *search_shipments_response_dto_local_var = NULL;

    // define the local list for search_shipments_response_dto->shipments
    list_t *shipmentsList = NULL;

    // define the local variable for search_shipments_response_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // search_shipments_response_dto->shipments
    cJSON *shipments = cJSON_GetObjectItemCaseSensitive(search_shipments_response_dtoJSON, "shipments");
    if (!shipments) {
        goto end;
    }

    
    cJSON *shipments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(shipments)){
        goto end; //nonprimitive container
    }

    shipmentsList = list_createList();

    cJSON_ArrayForEach(shipments_local_nonprimitive,shipments )
    {
        if(!cJSON_IsObject(shipments_local_nonprimitive)){
            goto end;
        }
        shipment_info_dto_t *shipmentsItem = shipment_info_dto_parseFromJSON(shipments_local_nonprimitive);

        list_addElement(shipmentsList, shipmentsItem);
    }

    // search_shipments_response_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(search_shipments_response_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    search_shipments_response_dto_local_var = search_shipments_response_dto_create (
        shipmentsList,
        paging ? paging_local_nonprim : NULL
        );

    return search_shipments_response_dto_local_var;
end:
    if (shipmentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, shipmentsList) {
            shipment_info_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(shipmentsList);
        shipmentsList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
