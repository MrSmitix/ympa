#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "model_price_dto.h"



model_price_dto_t *model_price_dto_create(
    double avg,
    double max,
    double min
    ) {
    model_price_dto_t *model_price_dto_local_var = malloc(sizeof(model_price_dto_t));
    if (!model_price_dto_local_var) {
        return NULL;
    }
    model_price_dto_local_var->avg = avg;
    model_price_dto_local_var->max = max;
    model_price_dto_local_var->min = min;

    return model_price_dto_local_var;
}


void model_price_dto_free(model_price_dto_t *model_price_dto) {
    if(NULL == model_price_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(model_price_dto);
}

cJSON *model_price_dto_convertToJSON(model_price_dto_t *model_price_dto) {
    cJSON *item = cJSON_CreateObject();

    // model_price_dto->avg
    if(model_price_dto->avg) {
    if(cJSON_AddNumberToObject(item, "avg", model_price_dto->avg) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_price_dto->max
    if(model_price_dto->max) {
    if(cJSON_AddNumberToObject(item, "max", model_price_dto->max) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_price_dto->min
    if(model_price_dto->min) {
    if(cJSON_AddNumberToObject(item, "min", model_price_dto->min) == NULL) {
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

model_price_dto_t *model_price_dto_parseFromJSON(cJSON *model_price_dtoJSON){

    model_price_dto_t *model_price_dto_local_var = NULL;

    // model_price_dto->avg
    cJSON *avg = cJSON_GetObjectItemCaseSensitive(model_price_dtoJSON, "avg");
    if (avg) { 
    if(!cJSON_IsNumber(avg))
    {
    goto end; //Numeric
    }
    }

    // model_price_dto->max
    cJSON *max = cJSON_GetObjectItemCaseSensitive(model_price_dtoJSON, "max");
    if (max) { 
    if(!cJSON_IsNumber(max))
    {
    goto end; //Numeric
    }
    }

    // model_price_dto->min
    cJSON *min = cJSON_GetObjectItemCaseSensitive(model_price_dtoJSON, "min");
    if (min) { 
    if(!cJSON_IsNumber(min))
    {
    goto end; //Numeric
    }
    }


    model_price_dto_local_var = model_price_dto_create (
        avg ? avg->valuedouble : 0,
        max ? max->valuedouble : 0,
        min ? min->valuedouble : 0
        );

    return model_price_dto_local_var;
end:
    return NULL;

}
