#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_mechanics_info_dto.h"


char* get_promo_mechanics_info_dto_type_ToString(_api__get_promo_mechanics_info_dto__e type) {
    char* typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_FLASH", "MARKET_PROMOCODE" };
    return typeArray[type];
}

_api__get_promo_mechanics_info_dto__e get_promo_mechanics_info_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_FLASH", "MARKET_PROMOCODE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto_create(
    mechanics_type_t *type,
    get_promo_promocode_info_dto_t *promocode_info
    ) {
    get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto_local_var = malloc(sizeof(get_promo_mechanics_info_dto_t));
    if (!get_promo_mechanics_info_dto_local_var) {
        return NULL;
    }
    get_promo_mechanics_info_dto_local_var->type = type;
    get_promo_mechanics_info_dto_local_var->promocode_info = promocode_info;

    return get_promo_mechanics_info_dto_local_var;
}


void get_promo_mechanics_info_dto_free(get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto) {
    if(NULL == get_promo_mechanics_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_mechanics_info_dto->type) {
        mechanics_type_free(get_promo_mechanics_info_dto->type);
        get_promo_mechanics_info_dto->type = NULL;
    }
    if (get_promo_mechanics_info_dto->promocode_info) {
        get_promo_promocode_info_dto_free(get_promo_mechanics_info_dto->promocode_info);
        get_promo_mechanics_info_dto->promocode_info = NULL;
    }
    free(get_promo_mechanics_info_dto);
}

cJSON *get_promo_mechanics_info_dto_convertToJSON(get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_mechanics_info_dto->type
    if (_api__get_promo_mechanics_info_dto__NULL == get_promo_mechanics_info_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = mechanics_type_convertToJSON(get_promo_mechanics_info_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // get_promo_mechanics_info_dto->promocode_info
    if(get_promo_mechanics_info_dto->promocode_info) {
    cJSON *promocode_info_local_JSON = get_promo_promocode_info_dto_convertToJSON(get_promo_mechanics_info_dto->promocode_info);
    if(promocode_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "promocodeInfo", promocode_info_local_JSON);
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

get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto_parseFromJSON(cJSON *get_promo_mechanics_info_dtoJSON){

    get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto_local_var = NULL;

    // define the local variable for get_promo_mechanics_info_dto->type
    mechanics_type_t *type_local_nonprim = NULL;

    // define the local variable for get_promo_mechanics_info_dto->promocode_info
    get_promo_promocode_info_dto_t *promocode_info_local_nonprim = NULL;

    // get_promo_mechanics_info_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(get_promo_mechanics_info_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = mechanics_type_parseFromJSON(type); //custom

    // get_promo_mechanics_info_dto->promocode_info
    cJSON *promocode_info = cJSON_GetObjectItemCaseSensitive(get_promo_mechanics_info_dtoJSON, "promocodeInfo");
    if (promocode_info) { 
    promocode_info_local_nonprim = get_promo_promocode_info_dto_parseFromJSON(promocode_info); //nonprimitive
    }


    get_promo_mechanics_info_dto_local_var = get_promo_mechanics_info_dto_create (
        type_local_nonprim,
        promocode_info ? promocode_info_local_nonprim : NULL
        );

    return get_promo_mechanics_info_dto_local_var;
end:
    if (type_local_nonprim) {
        mechanics_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (promocode_info_local_nonprim) {
        get_promo_promocode_info_dto_free(promocode_info_local_nonprim);
        promocode_info_local_nonprim = NULL;
    }
    return NULL;

}
