#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculate_tariffs_response_dto.h"



calculate_tariffs_response_dto_t *calculate_tariffs_response_dto_create(
    list_t *offers
    ) {
    calculate_tariffs_response_dto_t *calculate_tariffs_response_dto_local_var = malloc(sizeof(calculate_tariffs_response_dto_t));
    if (!calculate_tariffs_response_dto_local_var) {
        return NULL;
    }
    calculate_tariffs_response_dto_local_var->offers = offers;

    return calculate_tariffs_response_dto_local_var;
}


void calculate_tariffs_response_dto_free(calculate_tariffs_response_dto_t *calculate_tariffs_response_dto) {
    if(NULL == calculate_tariffs_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (calculate_tariffs_response_dto->offers) {
        list_ForEach(listEntry, calculate_tariffs_response_dto->offers) {
            calculate_tariffs_offer_info_dto_free(listEntry->data);
        }
        list_freeList(calculate_tariffs_response_dto->offers);
        calculate_tariffs_response_dto->offers = NULL;
    }
    free(calculate_tariffs_response_dto);
}

cJSON *calculate_tariffs_response_dto_convertToJSON(calculate_tariffs_response_dto_t *calculate_tariffs_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // calculate_tariffs_response_dto->offers
    if (!calculate_tariffs_response_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (calculate_tariffs_response_dto->offers) {
    list_ForEach(offersListEntry, calculate_tariffs_response_dto->offers) {
    cJSON *itemLocal = calculate_tariffs_offer_info_dto_convertToJSON(offersListEntry->data);
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

calculate_tariffs_response_dto_t *calculate_tariffs_response_dto_parseFromJSON(cJSON *calculate_tariffs_response_dtoJSON){

    calculate_tariffs_response_dto_t *calculate_tariffs_response_dto_local_var = NULL;

    // define the local list for calculate_tariffs_response_dto->offers
    list_t *offersList = NULL;

    // calculate_tariffs_response_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_response_dtoJSON, "offers");
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
        calculate_tariffs_offer_info_dto_t *offersItem = calculate_tariffs_offer_info_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    calculate_tariffs_response_dto_local_var = calculate_tariffs_response_dto_create (
        offersList
        );

    return calculate_tariffs_response_dto_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            calculate_tariffs_offer_info_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
