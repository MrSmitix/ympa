#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_promo_offers_result_dto.h"



update_promo_offers_result_dto_t *update_promo_offers_result_dto_create(
    list_t *rejected_offers,
    list_t *warning_offers
    ) {
    update_promo_offers_result_dto_t *update_promo_offers_result_dto_local_var = malloc(sizeof(update_promo_offers_result_dto_t));
    if (!update_promo_offers_result_dto_local_var) {
        return NULL;
    }
    update_promo_offers_result_dto_local_var->rejected_offers = rejected_offers;
    update_promo_offers_result_dto_local_var->warning_offers = warning_offers;

    return update_promo_offers_result_dto_local_var;
}


void update_promo_offers_result_dto_free(update_promo_offers_result_dto_t *update_promo_offers_result_dto) {
    if(NULL == update_promo_offers_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_promo_offers_result_dto->rejected_offers) {
        list_ForEach(listEntry, update_promo_offers_result_dto->rejected_offers) {
            rejected_promo_offer_update_dto_free(listEntry->data);
        }
        list_freeList(update_promo_offers_result_dto->rejected_offers);
        update_promo_offers_result_dto->rejected_offers = NULL;
    }
    if (update_promo_offers_result_dto->warning_offers) {
        list_ForEach(listEntry, update_promo_offers_result_dto->warning_offers) {
            warning_promo_offer_update_dto_free(listEntry->data);
        }
        list_freeList(update_promo_offers_result_dto->warning_offers);
        update_promo_offers_result_dto->warning_offers = NULL;
    }
    free(update_promo_offers_result_dto);
}

cJSON *update_promo_offers_result_dto_convertToJSON(update_promo_offers_result_dto_t *update_promo_offers_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_promo_offers_result_dto->rejected_offers
    if(update_promo_offers_result_dto->rejected_offers) {
    cJSON *rejected_offers = cJSON_AddArrayToObject(item, "rejectedOffers");
    if(rejected_offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *rejected_offersListEntry;
    if (update_promo_offers_result_dto->rejected_offers) {
    list_ForEach(rejected_offersListEntry, update_promo_offers_result_dto->rejected_offers) {
    cJSON *itemLocal = rejected_promo_offer_update_dto_convertToJSON(rejected_offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(rejected_offers, itemLocal);
    }
    }
    }


    // update_promo_offers_result_dto->warning_offers
    if(update_promo_offers_result_dto->warning_offers) {
    cJSON *warning_offers = cJSON_AddArrayToObject(item, "warningOffers");
    if(warning_offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warning_offersListEntry;
    if (update_promo_offers_result_dto->warning_offers) {
    list_ForEach(warning_offersListEntry, update_promo_offers_result_dto->warning_offers) {
    cJSON *itemLocal = warning_promo_offer_update_dto_convertToJSON(warning_offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warning_offers, itemLocal);
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

update_promo_offers_result_dto_t *update_promo_offers_result_dto_parseFromJSON(cJSON *update_promo_offers_result_dtoJSON){

    update_promo_offers_result_dto_t *update_promo_offers_result_dto_local_var = NULL;

    // define the local list for update_promo_offers_result_dto->rejected_offers
    list_t *rejected_offersList = NULL;

    // define the local list for update_promo_offers_result_dto->warning_offers
    list_t *warning_offersList = NULL;

    // update_promo_offers_result_dto->rejected_offers
    cJSON *rejected_offers = cJSON_GetObjectItemCaseSensitive(update_promo_offers_result_dtoJSON, "rejectedOffers");
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
        rejected_promo_offer_update_dto_t *rejected_offersItem = rejected_promo_offer_update_dto_parseFromJSON(rejected_offers_local_nonprimitive);

        list_addElement(rejected_offersList, rejected_offersItem);
    }
    }

    // update_promo_offers_result_dto->warning_offers
    cJSON *warning_offers = cJSON_GetObjectItemCaseSensitive(update_promo_offers_result_dtoJSON, "warningOffers");
    if (warning_offers) { 
    cJSON *warning_offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(warning_offers)){
        goto end; //nonprimitive container
    }

    warning_offersList = list_createList();

    cJSON_ArrayForEach(warning_offers_local_nonprimitive,warning_offers )
    {
        if(!cJSON_IsObject(warning_offers_local_nonprimitive)){
            goto end;
        }
        warning_promo_offer_update_dto_t *warning_offersItem = warning_promo_offer_update_dto_parseFromJSON(warning_offers_local_nonprimitive);

        list_addElement(warning_offersList, warning_offersItem);
    }
    }


    update_promo_offers_result_dto_local_var = update_promo_offers_result_dto_create (
        rejected_offers ? rejected_offersList : NULL,
        warning_offers ? warning_offersList : NULL
        );

    return update_promo_offers_result_dto_local_var;
end:
    if (rejected_offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rejected_offersList) {
            rejected_promo_offer_update_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rejected_offersList);
        rejected_offersList = NULL;
    }
    if (warning_offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warning_offersList) {
            warning_promo_offer_update_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warning_offersList);
        warning_offersList = NULL;
    }
    return NULL;

}
