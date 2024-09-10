#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_stock_item_dto.h"



update_stock_item_dto_t *update_stock_item_dto_create(
    long count,
    char *updated_at
    ) {
    update_stock_item_dto_t *update_stock_item_dto_local_var = malloc(sizeof(update_stock_item_dto_t));
    if (!update_stock_item_dto_local_var) {
        return NULL;
    }
    update_stock_item_dto_local_var->count = count;
    update_stock_item_dto_local_var->updated_at = updated_at;

    return update_stock_item_dto_local_var;
}


void update_stock_item_dto_free(update_stock_item_dto_t *update_stock_item_dto) {
    if(NULL == update_stock_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_stock_item_dto->updated_at) {
        free(update_stock_item_dto->updated_at);
        update_stock_item_dto->updated_at = NULL;
    }
    free(update_stock_item_dto);
}

cJSON *update_stock_item_dto_convertToJSON(update_stock_item_dto_t *update_stock_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_stock_item_dto->count
    if (!update_stock_item_dto->count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "count", update_stock_item_dto->count) == NULL) {
    goto fail; //Numeric
    }


    // update_stock_item_dto->updated_at
    if(update_stock_item_dto->updated_at) {
    if(cJSON_AddStringToObject(item, "updatedAt", update_stock_item_dto->updated_at) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_stock_item_dto_t *update_stock_item_dto_parseFromJSON(cJSON *update_stock_item_dtoJSON){

    update_stock_item_dto_t *update_stock_item_dto_local_var = NULL;

    // update_stock_item_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(update_stock_item_dtoJSON, "count");
    if (!count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }

    // update_stock_item_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(update_stock_item_dtoJSON, "updatedAt");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }


    update_stock_item_dto_local_var = update_stock_item_dto_create (
        count->valuedouble,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL
        );

    return update_stock_item_dto_local_var;
end:
    return NULL;

}
