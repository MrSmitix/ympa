#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "model_dto.h"



model_dto_t *model_dto_create(
    long id,
    char *name,
    model_price_dto_t *prices
    ) {
    model_dto_t *model_dto_local_var = malloc(sizeof(model_dto_t));
    if (!model_dto_local_var) {
        return NULL;
    }
    model_dto_local_var->id = id;
    model_dto_local_var->name = name;
    model_dto_local_var->prices = prices;

    return model_dto_local_var;
}


void model_dto_free(model_dto_t *model_dto) {
    if(NULL == model_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (model_dto->name) {
        free(model_dto->name);
        model_dto->name = NULL;
    }
    if (model_dto->prices) {
        model_price_dto_free(model_dto->prices);
        model_dto->prices = NULL;
    }
    free(model_dto);
}

cJSON *model_dto_convertToJSON(model_dto_t *model_dto) {
    cJSON *item = cJSON_CreateObject();

    // model_dto->id
    if(model_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", model_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_dto->name
    if(model_dto->name) {
    if(cJSON_AddStringToObject(item, "name", model_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // model_dto->prices
    if(model_dto->prices) {
    cJSON *prices_local_JSON = model_price_dto_convertToJSON(model_dto->prices);
    if(prices_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prices", prices_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

model_dto_t *model_dto_parseFromJSON(cJSON *model_dtoJSON){

    model_dto_t *model_dto_local_var = NULL;

    // define the local variable for model_dto->prices
    model_price_dto_t *prices_local_nonprim = NULL;

    // model_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(model_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // model_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(model_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // model_dto->prices
    cJSON *prices = cJSON_GetObjectItemCaseSensitive(model_dtoJSON, "prices");
    if (prices) { 
    prices_local_nonprim = model_price_dto_parseFromJSON(prices); //nonprimitive
    }


    model_dto_local_var = model_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        prices ? prices_local_nonprim : NULL
        );

    return model_dto_local_var;
end:
    if (prices_local_nonprim) {
        model_price_dto_free(prices_local_nonprim);
        prices_local_nonprim = NULL;
    }
    return NULL;

}
