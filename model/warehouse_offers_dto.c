#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_offers_dto.h"



warehouse_offers_dto_t *warehouse_offers_dto_create(
    long warehouse_id,
    list_t *offers
    ) {
    warehouse_offers_dto_t *warehouse_offers_dto_local_var = malloc(sizeof(warehouse_offers_dto_t));
    if (!warehouse_offers_dto_local_var) {
        return NULL;
    }
    warehouse_offers_dto_local_var->warehouse_id = warehouse_id;
    warehouse_offers_dto_local_var->offers = offers;

    return warehouse_offers_dto_local_var;
}


void warehouse_offers_dto_free(warehouse_offers_dto_t *warehouse_offers_dto) {
    if(NULL == warehouse_offers_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouse_offers_dto->offers) {
        list_ForEach(listEntry, warehouse_offers_dto->offers) {
            warehouse_offer_dto_free(listEntry->data);
        }
        list_freeList(warehouse_offers_dto->offers);
        warehouse_offers_dto->offers = NULL;
    }
    free(warehouse_offers_dto);
}

cJSON *warehouse_offers_dto_convertToJSON(warehouse_offers_dto_t *warehouse_offers_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouse_offers_dto->warehouse_id
    if (!warehouse_offers_dto->warehouse_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "warehouseId", warehouse_offers_dto->warehouse_id) == NULL) {
    goto fail; //Numeric
    }


    // warehouse_offers_dto->offers
    if (!warehouse_offers_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (warehouse_offers_dto->offers) {
    list_ForEach(offersListEntry, warehouse_offers_dto->offers) {
    cJSON *itemLocal = warehouse_offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warehouse_offers_dto_t *warehouse_offers_dto_parseFromJSON(cJSON *warehouse_offers_dtoJSON){

    warehouse_offers_dto_t *warehouse_offers_dto_local_var = NULL;

    // define the local list for warehouse_offers_dto->offers
    list_t *offersList = NULL;

    // warehouse_offers_dto->warehouse_id
    cJSON *warehouse_id = cJSON_GetObjectItemCaseSensitive(warehouse_offers_dtoJSON, "warehouseId");
    if (!warehouse_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(warehouse_id))
    {
    goto end; //Numeric
    }

    // warehouse_offers_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(warehouse_offers_dtoJSON, "offers");
    if (!offers) {
        goto end;
    }

    
    cJSON *offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offers)){
        goto end; //nonprimitive container
    }

    offersList = list_createList();

    cJSON_ArrayForEach(offers_local_nonprimitive,offers )
    {
        if(!cJSON_IsObject(offers_local_nonprimitive)){
            goto end;
        }
        warehouse_offer_dto_t *offersItem = warehouse_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    warehouse_offers_dto_local_var = warehouse_offers_dto_create (
        warehouse_id->valuedouble,
        offersList
        );

    return warehouse_offers_dto_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            warehouse_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
