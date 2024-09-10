#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promos_result_dto.h"



get_promos_result_dto_t *get_promos_result_dto_create(
    list_t *promos
    ) {
    get_promos_result_dto_t *get_promos_result_dto_local_var = malloc(sizeof(get_promos_result_dto_t));
    if (!get_promos_result_dto_local_var) {
        return NULL;
    }
    get_promos_result_dto_local_var->promos = promos;

    return get_promos_result_dto_local_var;
}


void get_promos_result_dto_free(get_promos_result_dto_t *get_promos_result_dto) {
    if(NULL == get_promos_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promos_result_dto->promos) {
        list_ForEach(listEntry, get_promos_result_dto->promos) {
            get_promo_dto_free(listEntry->data);
        }
        list_freeList(get_promos_result_dto->promos);
        get_promos_result_dto->promos = NULL;
    }
    free(get_promos_result_dto);
}

cJSON *get_promos_result_dto_convertToJSON(get_promos_result_dto_t *get_promos_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promos_result_dto->promos
    if (!get_promos_result_dto->promos) {
        goto fail;
    }
    cJSON *promos = cJSON_AddArrayToObject(item, "promos");
    if(promos == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *promosListEntry;
    if (get_promos_result_dto->promos) {
    list_ForEach(promosListEntry, get_promos_result_dto->promos) {
    cJSON *itemLocal = get_promo_dto_convertToJSON(promosListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(promos, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_promos_result_dto_t *get_promos_result_dto_parseFromJSON(cJSON *get_promos_result_dtoJSON){

    get_promos_result_dto_t *get_promos_result_dto_local_var = NULL;

    // define the local list for get_promos_result_dto->promos
    list_t *promosList = NULL;

    // get_promos_result_dto->promos
    cJSON *promos = cJSON_GetObjectItemCaseSensitive(get_promos_result_dtoJSON, "promos");
    if (!promos) {
        goto end;
    }

    
    cJSON *promos_local_nonprimitive = NULL;
    if(!cJSON_IsArray(promos)){
        goto end; //nonprimitive container
    }

    promosList = list_createList();

    cJSON_ArrayForEach(promos_local_nonprimitive,promos )
    {
        if(!cJSON_IsObject(promos_local_nonprimitive)){
            goto end;
        }
        get_promo_dto_t *promosItem = get_promo_dto_parseFromJSON(promos_local_nonprimitive);

        list_addElement(promosList, promosItem);
    }


    get_promos_result_dto_local_var = get_promos_result_dto_create (
        promosList
        );

    return get_promos_result_dto_local_var;
end:
    if (promosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, promosList) {
            get_promo_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(promosList);
        promosList = NULL;
    }
    return NULL;

}
