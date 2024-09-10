#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_mapping_dto.h"



update_mapping_dto_t *update_mapping_dto_create(
    long market_sku
    ) {
    update_mapping_dto_t *update_mapping_dto_local_var = malloc(sizeof(update_mapping_dto_t));
    if (!update_mapping_dto_local_var) {
        return NULL;
    }
    update_mapping_dto_local_var->market_sku = market_sku;

    return update_mapping_dto_local_var;
}


void update_mapping_dto_free(update_mapping_dto_t *update_mapping_dto) {
    if(NULL == update_mapping_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(update_mapping_dto);
}

cJSON *update_mapping_dto_convertToJSON(update_mapping_dto_t *update_mapping_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_mapping_dto->market_sku
    if(update_mapping_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", update_mapping_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_mapping_dto_t *update_mapping_dto_parseFromJSON(cJSON *update_mapping_dtoJSON){

    update_mapping_dto_t *update_mapping_dto_local_var = NULL;

    // update_mapping_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(update_mapping_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }


    update_mapping_dto_local_var = update_mapping_dto_create (
        market_sku ? market_sku->valuedouble : 0
        );

    return update_mapping_dto_local_var;
end:
    return NULL;

}
