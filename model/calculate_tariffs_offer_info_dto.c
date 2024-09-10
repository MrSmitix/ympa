#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculate_tariffs_offer_info_dto.h"



calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto_create(
    calculate_tariffs_offer_dto_t *offer,
    list_t *tariffs
    ) {
    calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto_local_var = malloc(sizeof(calculate_tariffs_offer_info_dto_t));
    if (!calculate_tariffs_offer_info_dto_local_var) {
        return NULL;
    }
    calculate_tariffs_offer_info_dto_local_var->offer = offer;
    calculate_tariffs_offer_info_dto_local_var->tariffs = tariffs;

    return calculate_tariffs_offer_info_dto_local_var;
}


void calculate_tariffs_offer_info_dto_free(calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto) {
    if(NULL == calculate_tariffs_offer_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (calculate_tariffs_offer_info_dto->offer) {
        calculate_tariffs_offer_dto_free(calculate_tariffs_offer_info_dto->offer);
        calculate_tariffs_offer_info_dto->offer = NULL;
    }
    if (calculate_tariffs_offer_info_dto->tariffs) {
        list_ForEach(listEntry, calculate_tariffs_offer_info_dto->tariffs) {
            calculated_tariff_dto_free(listEntry->data);
        }
        list_freeList(calculate_tariffs_offer_info_dto->tariffs);
        calculate_tariffs_offer_info_dto->tariffs = NULL;
    }
    free(calculate_tariffs_offer_info_dto);
}

cJSON *calculate_tariffs_offer_info_dto_convertToJSON(calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // calculate_tariffs_offer_info_dto->offer
    if (!calculate_tariffs_offer_info_dto->offer) {
        goto fail;
    }
    cJSON *offer_local_JSON = calculate_tariffs_offer_dto_convertToJSON(calculate_tariffs_offer_info_dto->offer);
    if(offer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offer", offer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // calculate_tariffs_offer_info_dto->tariffs
    if (!calculate_tariffs_offer_info_dto->tariffs) {
        goto fail;
    }
    cJSON *tariffs = cJSON_AddArrayToObject(item, "tariffs");
    if(tariffs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tariffsListEntry;
    if (calculate_tariffs_offer_info_dto->tariffs) {
    list_ForEach(tariffsListEntry, calculate_tariffs_offer_info_dto->tariffs) {
    cJSON *itemLocal = calculated_tariff_dto_convertToJSON(tariffsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tariffs, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto_parseFromJSON(cJSON *calculate_tariffs_offer_info_dtoJSON){

    calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto_local_var = NULL;

    // define the local variable for calculate_tariffs_offer_info_dto->offer
    calculate_tariffs_offer_dto_t *offer_local_nonprim = NULL;

    // define the local list for calculate_tariffs_offer_info_dto->tariffs
    list_t *tariffsList = NULL;

    // calculate_tariffs_offer_info_dto->offer
    cJSON *offer = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_info_dtoJSON, "offer");
    if (!offer) {
        goto end;
    }

    
    offer_local_nonprim = calculate_tariffs_offer_dto_parseFromJSON(offer); //nonprimitive

    // calculate_tariffs_offer_info_dto->tariffs
    cJSON *tariffs = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_info_dtoJSON, "tariffs");
    if (!tariffs) {
        goto end;
    }

    
    cJSON *tariffs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tariffs)){
        goto end; //nonprimitive container
    }

    tariffsList = list_createList();

    cJSON_ArrayForEach(tariffs_local_nonprimitive,tariffs )
    {
        if(!cJSON_IsObject(tariffs_local_nonprimitive)){
            goto end;
        }
        calculated_tariff_dto_t *tariffsItem = calculated_tariff_dto_parseFromJSON(tariffs_local_nonprimitive);

        list_addElement(tariffsList, tariffsItem);
    }


    calculate_tariffs_offer_info_dto_local_var = calculate_tariffs_offer_info_dto_create (
        offer_local_nonprim,
        tariffsList
        );

    return calculate_tariffs_offer_info_dto_local_var;
end:
    if (offer_local_nonprim) {
        calculate_tariffs_offer_dto_free(offer_local_nonprim);
        offer_local_nonprim = NULL;
    }
    if (tariffsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tariffsList) {
            calculated_tariff_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tariffsList);
        tariffsList = NULL;
    }
    return NULL;

}
