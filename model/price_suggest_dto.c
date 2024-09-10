#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_suggest_dto.h"


char* price_suggest_dto_type_ToString(_api__price_suggest_dto__e type) {
    char* typeArray[] =  { "NULL", "BUYBOX", "DEFAULT_OFFER", "MIN_PRICE_MARKET" };
    return typeArray[type];
}

_api__price_suggest_dto__e price_suggest_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "BUYBOX", "DEFAULT_OFFER", "MIN_PRICE_MARKET" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

price_suggest_dto_t *price_suggest_dto_create(
    price_suggest_type_t *type,
    double price
    ) {
    price_suggest_dto_t *price_suggest_dto_local_var = malloc(sizeof(price_suggest_dto_t));
    if (!price_suggest_dto_local_var) {
        return NULL;
    }
    price_suggest_dto_local_var->type = type;
    price_suggest_dto_local_var->price = price;

    return price_suggest_dto_local_var;
}


void price_suggest_dto_free(price_suggest_dto_t *price_suggest_dto) {
    if(NULL == price_suggest_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (price_suggest_dto->type) {
        price_suggest_type_free(price_suggest_dto->type);
        price_suggest_dto->type = NULL;
    }
    free(price_suggest_dto);
}

cJSON *price_suggest_dto_convertToJSON(price_suggest_dto_t *price_suggest_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_suggest_dto->type
    if(price_suggest_dto->type != _api__price_suggest_dto__NULL) {
    cJSON *type_local_JSON = price_suggest_type_convertToJSON(price_suggest_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // price_suggest_dto->price
    if(price_suggest_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", price_suggest_dto->price) == NULL) {
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

price_suggest_dto_t *price_suggest_dto_parseFromJSON(cJSON *price_suggest_dtoJSON){

    price_suggest_dto_t *price_suggest_dto_local_var = NULL;

    // define the local variable for price_suggest_dto->type
    price_suggest_type_t *type_local_nonprim = NULL;

    // price_suggest_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(price_suggest_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = price_suggest_type_parseFromJSON(type); //custom
    }

    // price_suggest_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(price_suggest_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }


    price_suggest_dto_local_var = price_suggest_dto_create (
        type ? type_local_nonprim : NULL,
        price ? price->valuedouble : 0
        );

    return price_suggest_dto_local_var;
end:
    if (type_local_nonprim) {
        price_suggest_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
