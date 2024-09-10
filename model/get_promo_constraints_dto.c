#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_constraints_dto.h"



get_promo_constraints_dto_t *get_promo_constraints_dto_create(
    list_t *warehouse_ids
    ) {
    get_promo_constraints_dto_t *get_promo_constraints_dto_local_var = malloc(sizeof(get_promo_constraints_dto_t));
    if (!get_promo_constraints_dto_local_var) {
        return NULL;
    }
    get_promo_constraints_dto_local_var->warehouse_ids = warehouse_ids;

    return get_promo_constraints_dto_local_var;
}


void get_promo_constraints_dto_free(get_promo_constraints_dto_t *get_promo_constraints_dto) {
    if(NULL == get_promo_constraints_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_constraints_dto->warehouse_ids) {
        list_ForEach(listEntry, get_promo_constraints_dto->warehouse_ids) {
            free(listEntry->data);
        }
        list_freeList(get_promo_constraints_dto->warehouse_ids);
        get_promo_constraints_dto->warehouse_ids = NULL;
    }
    free(get_promo_constraints_dto);
}

cJSON *get_promo_constraints_dto_convertToJSON(get_promo_constraints_dto_t *get_promo_constraints_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_constraints_dto->warehouse_ids
    if(get_promo_constraints_dto->warehouse_ids) {
    cJSON *warehouse_ids = cJSON_AddArrayToObject(item, "warehouseIds");
    if(warehouse_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *warehouse_idsListEntry;
    list_ForEach(warehouse_idsListEntry, get_promo_constraints_dto->warehouse_ids) {
    if(cJSON_AddNumberToObject(warehouse_ids, "", *(double *)warehouse_idsListEntry->data) == NULL)
    {
        goto fail;
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

get_promo_constraints_dto_t *get_promo_constraints_dto_parseFromJSON(cJSON *get_promo_constraints_dtoJSON){

    get_promo_constraints_dto_t *get_promo_constraints_dto_local_var = NULL;

    // define the local list for get_promo_constraints_dto->warehouse_ids
    list_t *warehouse_idsList = NULL;

    // get_promo_constraints_dto->warehouse_ids
    cJSON *warehouse_ids = cJSON_GetObjectItemCaseSensitive(get_promo_constraints_dtoJSON, "warehouseIds");
    if (warehouse_ids) { 
    cJSON *warehouse_ids_local = NULL;
    if(!cJSON_IsArray(warehouse_ids)) {
        goto end;//primitive container
    }
    warehouse_idsList = list_createList();

    cJSON_ArrayForEach(warehouse_ids_local, warehouse_ids)
    {
        if(!cJSON_IsNumber(warehouse_ids_local))
        {
            goto end;
        }
        double *warehouse_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!warehouse_ids_local_value)
        {
            goto end;
        }
        *warehouse_ids_local_value = warehouse_ids_local->valuedouble;
        list_addElement(warehouse_idsList , warehouse_ids_local_value);
    }
    }


    get_promo_constraints_dto_local_var = get_promo_constraints_dto_create (
        warehouse_ids ? warehouse_idsList : NULL
        );

    return get_promo_constraints_dto_local_var;
end:
    if (warehouse_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehouse_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehouse_idsList);
        warehouse_idsList = NULL;
    }
    return NULL;

}
