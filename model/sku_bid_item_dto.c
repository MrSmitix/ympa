#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "sku_bid_item_dto.h"



sku_bid_item_dto_t *sku_bid_item_dto_create(
    char *sku,
    int bid
    ) {
    sku_bid_item_dto_t *sku_bid_item_dto_local_var = malloc(sizeof(sku_bid_item_dto_t));
    if (!sku_bid_item_dto_local_var) {
        return NULL;
    }
    sku_bid_item_dto_local_var->sku = sku;
    sku_bid_item_dto_local_var->bid = bid;

    return sku_bid_item_dto_local_var;
}


void sku_bid_item_dto_free(sku_bid_item_dto_t *sku_bid_item_dto) {
    if(NULL == sku_bid_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (sku_bid_item_dto->sku) {
        free(sku_bid_item_dto->sku);
        sku_bid_item_dto->sku = NULL;
    }
    free(sku_bid_item_dto);
}

cJSON *sku_bid_item_dto_convertToJSON(sku_bid_item_dto_t *sku_bid_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // sku_bid_item_dto->sku
    if (!sku_bid_item_dto->sku) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "sku", sku_bid_item_dto->sku) == NULL) {
    goto fail; //String
    }


    // sku_bid_item_dto->bid
    if (!sku_bid_item_dto->bid) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "bid", sku_bid_item_dto->bid) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

sku_bid_item_dto_t *sku_bid_item_dto_parseFromJSON(cJSON *sku_bid_item_dtoJSON){

    sku_bid_item_dto_t *sku_bid_item_dto_local_var = NULL;

    // sku_bid_item_dto->sku
    cJSON *sku = cJSON_GetObjectItemCaseSensitive(sku_bid_item_dtoJSON, "sku");
    if (!sku) {
        goto end;
    }

    
    if(!cJSON_IsString(sku))
    {
    goto end; //String
    }

    // sku_bid_item_dto->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(sku_bid_item_dtoJSON, "bid");
    if (!bid) {
        goto end;
    }

    
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }


    sku_bid_item_dto_local_var = sku_bid_item_dto_create (
        strdup(sku->valuestring),
        bid->valuedouble
        );

    return sku_bid_item_dto_local_var;
end:
    return NULL;

}
