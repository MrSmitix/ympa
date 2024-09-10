#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brief_order_item_instance_dto.h"



brief_order_item_instance_dto_t *brief_order_item_instance_dto_create(
    char *cis,
    char *uin,
    char *rnpt,
    char *gtd
    ) {
    brief_order_item_instance_dto_t *brief_order_item_instance_dto_local_var = malloc(sizeof(brief_order_item_instance_dto_t));
    if (!brief_order_item_instance_dto_local_var) {
        return NULL;
    }
    brief_order_item_instance_dto_local_var->cis = cis;
    brief_order_item_instance_dto_local_var->uin = uin;
    brief_order_item_instance_dto_local_var->rnpt = rnpt;
    brief_order_item_instance_dto_local_var->gtd = gtd;

    return brief_order_item_instance_dto_local_var;
}


void brief_order_item_instance_dto_free(brief_order_item_instance_dto_t *brief_order_item_instance_dto) {
    if(NULL == brief_order_item_instance_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (brief_order_item_instance_dto->cis) {
        free(brief_order_item_instance_dto->cis);
        brief_order_item_instance_dto->cis = NULL;
    }
    if (brief_order_item_instance_dto->uin) {
        free(brief_order_item_instance_dto->uin);
        brief_order_item_instance_dto->uin = NULL;
    }
    if (brief_order_item_instance_dto->rnpt) {
        free(brief_order_item_instance_dto->rnpt);
        brief_order_item_instance_dto->rnpt = NULL;
    }
    if (brief_order_item_instance_dto->gtd) {
        free(brief_order_item_instance_dto->gtd);
        brief_order_item_instance_dto->gtd = NULL;
    }
    free(brief_order_item_instance_dto);
}

cJSON *brief_order_item_instance_dto_convertToJSON(brief_order_item_instance_dto_t *brief_order_item_instance_dto) {
    cJSON *item = cJSON_CreateObject();

    // brief_order_item_instance_dto->cis
    if(brief_order_item_instance_dto->cis) {
    if(cJSON_AddStringToObject(item, "cis", brief_order_item_instance_dto->cis) == NULL) {
    goto fail; //String
    }
    }


    // brief_order_item_instance_dto->uin
    if(brief_order_item_instance_dto->uin) {
    if(cJSON_AddStringToObject(item, "uin", brief_order_item_instance_dto->uin) == NULL) {
    goto fail; //String
    }
    }


    // brief_order_item_instance_dto->rnpt
    if(brief_order_item_instance_dto->rnpt) {
    if(cJSON_AddStringToObject(item, "rnpt", brief_order_item_instance_dto->rnpt) == NULL) {
    goto fail; //String
    }
    }


    // brief_order_item_instance_dto->gtd
    if(brief_order_item_instance_dto->gtd) {
    if(cJSON_AddStringToObject(item, "gtd", brief_order_item_instance_dto->gtd) == NULL) {
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

brief_order_item_instance_dto_t *brief_order_item_instance_dto_parseFromJSON(cJSON *brief_order_item_instance_dtoJSON){

    brief_order_item_instance_dto_t *brief_order_item_instance_dto_local_var = NULL;

    // brief_order_item_instance_dto->cis
    cJSON *cis = cJSON_GetObjectItemCaseSensitive(brief_order_item_instance_dtoJSON, "cis");
    if (cis) { 
    if(!cJSON_IsString(cis) && !cJSON_IsNull(cis))
    {
    goto end; //String
    }
    }

    // brief_order_item_instance_dto->uin
    cJSON *uin = cJSON_GetObjectItemCaseSensitive(brief_order_item_instance_dtoJSON, "uin");
    if (uin) { 
    if(!cJSON_IsString(uin) && !cJSON_IsNull(uin))
    {
    goto end; //String
    }
    }

    // brief_order_item_instance_dto->rnpt
    cJSON *rnpt = cJSON_GetObjectItemCaseSensitive(brief_order_item_instance_dtoJSON, "rnpt");
    if (rnpt) { 
    if(!cJSON_IsString(rnpt) && !cJSON_IsNull(rnpt))
    {
    goto end; //String
    }
    }

    // brief_order_item_instance_dto->gtd
    cJSON *gtd = cJSON_GetObjectItemCaseSensitive(brief_order_item_instance_dtoJSON, "gtd");
    if (gtd) { 
    if(!cJSON_IsString(gtd) && !cJSON_IsNull(gtd))
    {
    goto end; //String
    }
    }


    brief_order_item_instance_dto_local_var = brief_order_item_instance_dto_create (
        cis && !cJSON_IsNull(cis) ? strdup(cis->valuestring) : NULL,
        uin && !cJSON_IsNull(uin) ? strdup(uin->valuestring) : NULL,
        rnpt && !cJSON_IsNull(rnpt) ? strdup(rnpt->valuestring) : NULL,
        gtd && !cJSON_IsNull(gtd) ? strdup(gtd->valuestring) : NULL
        );

    return brief_order_item_instance_dto_local_var;
end:
    return NULL;

}
