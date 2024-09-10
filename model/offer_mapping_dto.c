#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_dto.h"



offer_mapping_dto_t *offer_mapping_dto_create(
    long market_sku,
    long model_id,
    long category_id
    ) {
    offer_mapping_dto_t *offer_mapping_dto_local_var = malloc(sizeof(offer_mapping_dto_t));
    if (!offer_mapping_dto_local_var) {
        return NULL;
    }
    offer_mapping_dto_local_var->market_sku = market_sku;
    offer_mapping_dto_local_var->model_id = model_id;
    offer_mapping_dto_local_var->category_id = category_id;

    return offer_mapping_dto_local_var;
}


void offer_mapping_dto_free(offer_mapping_dto_t *offer_mapping_dto) {
    if(NULL == offer_mapping_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(offer_mapping_dto);
}

cJSON *offer_mapping_dto_convertToJSON(offer_mapping_dto_t *offer_mapping_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_mapping_dto->market_sku
    if(offer_mapping_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", offer_mapping_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_mapping_dto->model_id
    if(offer_mapping_dto->model_id) {
    if(cJSON_AddNumberToObject(item, "modelId", offer_mapping_dto->model_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_mapping_dto->category_id
    if(offer_mapping_dto->category_id) {
    if(cJSON_AddNumberToObject(item, "categoryId", offer_mapping_dto->category_id) == NULL) {
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

offer_mapping_dto_t *offer_mapping_dto_parseFromJSON(cJSON *offer_mapping_dtoJSON){

    offer_mapping_dto_t *offer_mapping_dto_local_var = NULL;

    // offer_mapping_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(offer_mapping_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // offer_mapping_dto->model_id
    cJSON *model_id = cJSON_GetObjectItemCaseSensitive(offer_mapping_dtoJSON, "modelId");
    if (model_id) { 
    if(!cJSON_IsNumber(model_id))
    {
    goto end; //Numeric
    }
    }

    // offer_mapping_dto->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(offer_mapping_dtoJSON, "categoryId");
    if (category_id) { 
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }
    }


    offer_mapping_dto_local_var = offer_mapping_dto_create (
        market_sku ? market_sku->valuedouble : 0,
        model_id ? model_id->valuedouble : 0,
        category_id ? category_id->valuedouble : 0
        );

    return offer_mapping_dto_local_var;
end:
    return NULL;

}
