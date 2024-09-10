#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_competitiveness_thresholds_dto.h"



price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto_create(
    base_price_dto_t *optimal_price,
    base_price_dto_t *average_price
    ) {
    price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto_local_var = malloc(sizeof(price_competitiveness_thresholds_dto_t));
    if (!price_competitiveness_thresholds_dto_local_var) {
        return NULL;
    }
    price_competitiveness_thresholds_dto_local_var->optimal_price = optimal_price;
    price_competitiveness_thresholds_dto_local_var->average_price = average_price;

    return price_competitiveness_thresholds_dto_local_var;
}


void price_competitiveness_thresholds_dto_free(price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto) {
    if(NULL == price_competitiveness_thresholds_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (price_competitiveness_thresholds_dto->optimal_price) {
        base_price_dto_free(price_competitiveness_thresholds_dto->optimal_price);
        price_competitiveness_thresholds_dto->optimal_price = NULL;
    }
    if (price_competitiveness_thresholds_dto->average_price) {
        base_price_dto_free(price_competitiveness_thresholds_dto->average_price);
        price_competitiveness_thresholds_dto->average_price = NULL;
    }
    free(price_competitiveness_thresholds_dto);
}

cJSON *price_competitiveness_thresholds_dto_convertToJSON(price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_competitiveness_thresholds_dto->optimal_price
    if(price_competitiveness_thresholds_dto->optimal_price) {
    cJSON *optimal_price_local_JSON = base_price_dto_convertToJSON(price_competitiveness_thresholds_dto->optimal_price);
    if(optimal_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimalPrice", optimal_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // price_competitiveness_thresholds_dto->average_price
    if(price_competitiveness_thresholds_dto->average_price) {
    cJSON *average_price_local_JSON = base_price_dto_convertToJSON(price_competitiveness_thresholds_dto->average_price);
    if(average_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "averagePrice", average_price_local_JSON);
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

price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto_parseFromJSON(cJSON *price_competitiveness_thresholds_dtoJSON){

    price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto_local_var = NULL;

    // define the local variable for price_competitiveness_thresholds_dto->optimal_price
    base_price_dto_t *optimal_price_local_nonprim = NULL;

    // define the local variable for price_competitiveness_thresholds_dto->average_price
    base_price_dto_t *average_price_local_nonprim = NULL;

    // price_competitiveness_thresholds_dto->optimal_price
    cJSON *optimal_price = cJSON_GetObjectItemCaseSensitive(price_competitiveness_thresholds_dtoJSON, "optimalPrice");
    if (optimal_price) { 
    optimal_price_local_nonprim = base_price_dto_parseFromJSON(optimal_price); //nonprimitive
    }

    // price_competitiveness_thresholds_dto->average_price
    cJSON *average_price = cJSON_GetObjectItemCaseSensitive(price_competitiveness_thresholds_dtoJSON, "averagePrice");
    if (average_price) { 
    average_price_local_nonprim = base_price_dto_parseFromJSON(average_price); //nonprimitive
    }


    price_competitiveness_thresholds_dto_local_var = price_competitiveness_thresholds_dto_create (
        optimal_price ? optimal_price_local_nonprim : NULL,
        average_price ? average_price_local_nonprim : NULL
        );

    return price_competitiveness_thresholds_dto_local_var;
end:
    if (optimal_price_local_nonprim) {
        base_price_dto_free(optimal_price_local_nonprim);
        optimal_price_local_nonprim = NULL;
    }
    if (average_price_local_nonprim) {
        base_price_dto_free(average_price_local_nonprim);
        average_price_local_nonprim = NULL;
    }
    return NULL;

}
