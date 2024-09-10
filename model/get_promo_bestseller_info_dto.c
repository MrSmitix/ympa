#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_bestseller_info_dto.h"



get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto_create(
    int bestseller,
    char *entry_deadline
    ) {
    get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto_local_var = malloc(sizeof(get_promo_bestseller_info_dto_t));
    if (!get_promo_bestseller_info_dto_local_var) {
        return NULL;
    }
    get_promo_bestseller_info_dto_local_var->bestseller = bestseller;
    get_promo_bestseller_info_dto_local_var->entry_deadline = entry_deadline;

    return get_promo_bestseller_info_dto_local_var;
}


void get_promo_bestseller_info_dto_free(get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto) {
    if(NULL == get_promo_bestseller_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_bestseller_info_dto->entry_deadline) {
        free(get_promo_bestseller_info_dto->entry_deadline);
        get_promo_bestseller_info_dto->entry_deadline = NULL;
    }
    free(get_promo_bestseller_info_dto);
}

cJSON *get_promo_bestseller_info_dto_convertToJSON(get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_bestseller_info_dto->bestseller
    if (!get_promo_bestseller_info_dto->bestseller) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "bestseller", get_promo_bestseller_info_dto->bestseller) == NULL) {
    goto fail; //Bool
    }


    // get_promo_bestseller_info_dto->entry_deadline
    if(get_promo_bestseller_info_dto->entry_deadline) {
    if(cJSON_AddStringToObject(item, "entryDeadline", get_promo_bestseller_info_dto->entry_deadline) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto_parseFromJSON(cJSON *get_promo_bestseller_info_dtoJSON){

    get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto_local_var = NULL;

    // get_promo_bestseller_info_dto->bestseller
    cJSON *bestseller = cJSON_GetObjectItemCaseSensitive(get_promo_bestseller_info_dtoJSON, "bestseller");
    if (!bestseller) {
        goto end;
    }

    
    if(!cJSON_IsBool(bestseller))
    {
    goto end; //Bool
    }

    // get_promo_bestseller_info_dto->entry_deadline
    cJSON *entry_deadline = cJSON_GetObjectItemCaseSensitive(get_promo_bestseller_info_dtoJSON, "entryDeadline");
    if (entry_deadline) { 
    if(!cJSON_IsString(entry_deadline) && !cJSON_IsNull(entry_deadline))
    {
    goto end; //DateTime
    }
    }


    get_promo_bestseller_info_dto_local_var = get_promo_bestseller_info_dto_create (
        bestseller->valueint,
        entry_deadline && !cJSON_IsNull(entry_deadline) ? strdup(entry_deadline->valuestring) : NULL
        );

    return get_promo_bestseller_info_dto_local_var;
end:
    return NULL;

}
