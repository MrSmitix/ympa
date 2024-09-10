#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_promo_offers_result_dto.h"



delete_promo_offers_result_dto_t *delete_promo_offers_result_dto_create(
    list_t *rejected_offers
    ) {
    delete_promo_offers_result_dto_t *delete_promo_offers_result_dto_local_var = malloc(sizeof(delete_promo_offers_result_dto_t));
    if (!delete_promo_offers_result_dto_local_var) {
        return NULL;
    }
    delete_promo_offers_result_dto_local_var->rejected_offers = rejected_offers;

    return delete_promo_offers_result_dto_local_var;
}


void delete_promo_offers_result_dto_free(delete_promo_offers_result_dto_t *delete_promo_offers_result_dto) {
    if(NULL == delete_promo_offers_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_promo_offers_result_dto->rejected_offers) {
        list_ForEach(listEntry, delete_promo_offers_result_dto->rejected_offers) {
            rejected_promo_offer_delete_dto_free(listEntry->data);
        }
        list_freeList(delete_promo_offers_result_dto->rejected_offers);
        delete_promo_offers_result_dto->rejected_offers = NULL;
    }
    free(delete_promo_offers_result_dto);
}

cJSON *delete_promo_offers_result_dto_convertToJSON(delete_promo_offers_result_dto_t *delete_promo_offers_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // delete_promo_offers_result_dto->rejected_offers
    if(delete_promo_offers_result_dto->rejected_offers) {
    cJSON *rejected_offers = cJSON_AddArrayToObject(item, "rejectedOffers");
    if(rejected_offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *rejected_offersListEntry;
    if (delete_promo_offers_result_dto->rejected_offers) {
    list_ForEach(rejected_offersListEntry, delete_promo_offers_result_dto->rejected_offers) {
    cJSON *itemLocal = rejected_promo_offer_delete_dto_convertToJSON(rejected_offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(rejected_offers, itemLocal);
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

delete_promo_offers_result_dto_t *delete_promo_offers_result_dto_parseFromJSON(cJSON *delete_promo_offers_result_dtoJSON){

    delete_promo_offers_result_dto_t *delete_promo_offers_result_dto_local_var = NULL;

    // define the local list for delete_promo_offers_result_dto->rejected_offers
    list_t *rejected_offersList = NULL;

    // delete_promo_offers_result_dto->rejected_offers
    cJSON *rejected_offers = cJSON_GetObjectItemCaseSensitive(delete_promo_offers_result_dtoJSON, "rejectedOffers");
    if (rejected_offers) { 
    cJSON *rejected_offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(rejected_offers)){
        goto end; //nonprimitive container
    }

    rejected_offersList = list_createList();

    cJSON_ArrayForEach(rejected_offers_local_nonprimitive,rejected_offers )
    {
        if(!cJSON_IsObject(rejected_offers_local_nonprimitive)){
            goto end;
        }
        rejected_promo_offer_delete_dto_t *rejected_offersItem = rejected_promo_offer_delete_dto_parseFromJSON(rejected_offers_local_nonprimitive);

        list_addElement(rejected_offersList, rejected_offersItem);
    }
    }


    delete_promo_offers_result_dto_local_var = delete_promo_offers_result_dto_create (
        rejected_offers ? rejected_offersList : NULL
        );

    return delete_promo_offers_result_dto_local_var;
end:
    if (rejected_offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rejected_offersList) {
            rejected_promo_offer_delete_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rejected_offersList);
        rejected_offersList = NULL;
    }
    return NULL;

}
