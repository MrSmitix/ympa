#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_mapping_dto.h"



get_mapping_dto_t *get_mapping_dto_create(
    long market_sku,
    char *market_sku_name,
    long market_model_id,
    char *market_model_name,
    long market_category_id,
    char *market_category_name
    ) {
    get_mapping_dto_t *get_mapping_dto_local_var = malloc(sizeof(get_mapping_dto_t));
    if (!get_mapping_dto_local_var) {
        return NULL;
    }
    get_mapping_dto_local_var->market_sku = market_sku;
    get_mapping_dto_local_var->market_sku_name = market_sku_name;
    get_mapping_dto_local_var->market_model_id = market_model_id;
    get_mapping_dto_local_var->market_model_name = market_model_name;
    get_mapping_dto_local_var->market_category_id = market_category_id;
    get_mapping_dto_local_var->market_category_name = market_category_name;

    return get_mapping_dto_local_var;
}


void get_mapping_dto_free(get_mapping_dto_t *get_mapping_dto) {
    if(NULL == get_mapping_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_mapping_dto->market_sku_name) {
        free(get_mapping_dto->market_sku_name);
        get_mapping_dto->market_sku_name = NULL;
    }
    if (get_mapping_dto->market_model_name) {
        free(get_mapping_dto->market_model_name);
        get_mapping_dto->market_model_name = NULL;
    }
    if (get_mapping_dto->market_category_name) {
        free(get_mapping_dto->market_category_name);
        get_mapping_dto->market_category_name = NULL;
    }
    free(get_mapping_dto);
}

cJSON *get_mapping_dto_convertToJSON(get_mapping_dto_t *get_mapping_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_mapping_dto->market_sku
    if(get_mapping_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", get_mapping_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // get_mapping_dto->market_sku_name
    if(get_mapping_dto->market_sku_name) {
    if(cJSON_AddStringToObject(item, "marketSkuName", get_mapping_dto->market_sku_name) == NULL) {
    goto fail; //String
    }
    }


    // get_mapping_dto->market_model_id
    if(get_mapping_dto->market_model_id) {
    if(cJSON_AddNumberToObject(item, "marketModelId", get_mapping_dto->market_model_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // get_mapping_dto->market_model_name
    if(get_mapping_dto->market_model_name) {
    if(cJSON_AddStringToObject(item, "marketModelName", get_mapping_dto->market_model_name) == NULL) {
    goto fail; //String
    }
    }


    // get_mapping_dto->market_category_id
    if(get_mapping_dto->market_category_id) {
    if(cJSON_AddNumberToObject(item, "marketCategoryId", get_mapping_dto->market_category_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // get_mapping_dto->market_category_name
    if(get_mapping_dto->market_category_name) {
    if(cJSON_AddStringToObject(item, "marketCategoryName", get_mapping_dto->market_category_name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_mapping_dto_t *get_mapping_dto_parseFromJSON(cJSON *get_mapping_dtoJSON){

    get_mapping_dto_t *get_mapping_dto_local_var = NULL;

    // get_mapping_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(get_mapping_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // get_mapping_dto->market_sku_name
    cJSON *market_sku_name = cJSON_GetObjectItemCaseSensitive(get_mapping_dtoJSON, "marketSkuName");
    if (market_sku_name) { 
    if(!cJSON_IsString(market_sku_name) && !cJSON_IsNull(market_sku_name))
    {
    goto end; //String
    }
    }

    // get_mapping_dto->market_model_id
    cJSON *market_model_id = cJSON_GetObjectItemCaseSensitive(get_mapping_dtoJSON, "marketModelId");
    if (market_model_id) { 
    if(!cJSON_IsNumber(market_model_id))
    {
    goto end; //Numeric
    }
    }

    // get_mapping_dto->market_model_name
    cJSON *market_model_name = cJSON_GetObjectItemCaseSensitive(get_mapping_dtoJSON, "marketModelName");
    if (market_model_name) { 
    if(!cJSON_IsString(market_model_name) && !cJSON_IsNull(market_model_name))
    {
    goto end; //String
    }
    }

    // get_mapping_dto->market_category_id
    cJSON *market_category_id = cJSON_GetObjectItemCaseSensitive(get_mapping_dtoJSON, "marketCategoryId");
    if (market_category_id) { 
    if(!cJSON_IsNumber(market_category_id))
    {
    goto end; //Numeric
    }
    }

    // get_mapping_dto->market_category_name
    cJSON *market_category_name = cJSON_GetObjectItemCaseSensitive(get_mapping_dtoJSON, "marketCategoryName");
    if (market_category_name) { 
    if(!cJSON_IsString(market_category_name) && !cJSON_IsNull(market_category_name))
    {
    goto end; //String
    }
    }


    get_mapping_dto_local_var = get_mapping_dto_create (
        market_sku ? market_sku->valuedouble : 0,
        market_sku_name && !cJSON_IsNull(market_sku_name) ? strdup(market_sku_name->valuestring) : NULL,
        market_model_id ? market_model_id->valuedouble : 0,
        market_model_name && !cJSON_IsNull(market_model_name) ? strdup(market_model_name->valuestring) : NULL,
        market_category_id ? market_category_id->valuedouble : 0,
        market_category_name && !cJSON_IsNull(market_category_name) ? strdup(market_category_name->valuestring) : NULL
        );

    return get_mapping_dto_local_var;
end:
    return NULL;

}
