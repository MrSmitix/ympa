#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_promocode_info_dto.h"



get_promo_promocode_info_dto_t *get_promo_promocode_info_dto_create(
    char *promocode,
    int discount
    ) {
    get_promo_promocode_info_dto_t *get_promo_promocode_info_dto_local_var = malloc(sizeof(get_promo_promocode_info_dto_t));
    if (!get_promo_promocode_info_dto_local_var) {
        return NULL;
    }
    get_promo_promocode_info_dto_local_var->promocode = promocode;
    get_promo_promocode_info_dto_local_var->discount = discount;

    return get_promo_promocode_info_dto_local_var;
}


void get_promo_promocode_info_dto_free(get_promo_promocode_info_dto_t *get_promo_promocode_info_dto) {
    if(NULL == get_promo_promocode_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_promocode_info_dto->promocode) {
        free(get_promo_promocode_info_dto->promocode);
        get_promo_promocode_info_dto->promocode = NULL;
    }
    free(get_promo_promocode_info_dto);
}

cJSON *get_promo_promocode_info_dto_convertToJSON(get_promo_promocode_info_dto_t *get_promo_promocode_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_promocode_info_dto->promocode
    if (!get_promo_promocode_info_dto->promocode) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "promocode", get_promo_promocode_info_dto->promocode) == NULL) {
    goto fail; //String
    }


    // get_promo_promocode_info_dto->discount
    if (!get_promo_promocode_info_dto->discount) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "discount", get_promo_promocode_info_dto->discount) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_promo_promocode_info_dto_t *get_promo_promocode_info_dto_parseFromJSON(cJSON *get_promo_promocode_info_dtoJSON){

    get_promo_promocode_info_dto_t *get_promo_promocode_info_dto_local_var = NULL;

    // get_promo_promocode_info_dto->promocode
    cJSON *promocode = cJSON_GetObjectItemCaseSensitive(get_promo_promocode_info_dtoJSON, "promocode");
    if (!promocode) {
        goto end;
    }

    
    if(!cJSON_IsString(promocode))
    {
    goto end; //String
    }

    // get_promo_promocode_info_dto->discount
    cJSON *discount = cJSON_GetObjectItemCaseSensitive(get_promo_promocode_info_dtoJSON, "discount");
    if (!discount) {
        goto end;
    }

    
    if(!cJSON_IsNumber(discount))
    {
    goto end; //Numeric
    }


    get_promo_promocode_info_dto_local_var = get_promo_promocode_info_dto_create (
        strdup(promocode->valuestring),
        discount->valuedouble
        );

    return get_promo_promocode_info_dto_local_var;
end:
    return NULL;

}
