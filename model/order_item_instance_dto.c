#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_instance_dto.h"



order_item_instance_dto_t *order_item_instance_dto_create(
    char *cis,
    char *cis_full,
    char *uin,
    char *rnpt,
    char *gtd
    ) {
    order_item_instance_dto_t *order_item_instance_dto_local_var = malloc(sizeof(order_item_instance_dto_t));
    if (!order_item_instance_dto_local_var) {
        return NULL;
    }
    order_item_instance_dto_local_var->cis = cis;
    order_item_instance_dto_local_var->cis_full = cis_full;
    order_item_instance_dto_local_var->uin = uin;
    order_item_instance_dto_local_var->rnpt = rnpt;
    order_item_instance_dto_local_var->gtd = gtd;

    return order_item_instance_dto_local_var;
}


void order_item_instance_dto_free(order_item_instance_dto_t *order_item_instance_dto) {
    if(NULL == order_item_instance_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_item_instance_dto->cis) {
        free(order_item_instance_dto->cis);
        order_item_instance_dto->cis = NULL;
    }
    if (order_item_instance_dto->cis_full) {
        free(order_item_instance_dto->cis_full);
        order_item_instance_dto->cis_full = NULL;
    }
    if (order_item_instance_dto->uin) {
        free(order_item_instance_dto->uin);
        order_item_instance_dto->uin = NULL;
    }
    if (order_item_instance_dto->rnpt) {
        free(order_item_instance_dto->rnpt);
        order_item_instance_dto->rnpt = NULL;
    }
    if (order_item_instance_dto->gtd) {
        free(order_item_instance_dto->gtd);
        order_item_instance_dto->gtd = NULL;
    }
    free(order_item_instance_dto);
}

cJSON *order_item_instance_dto_convertToJSON(order_item_instance_dto_t *order_item_instance_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_item_instance_dto->cis
    if(order_item_instance_dto->cis) {
    if(cJSON_AddStringToObject(item, "cis", order_item_instance_dto->cis) == NULL) {
    goto fail; //String
    }
    }


    // order_item_instance_dto->cis_full
    if(order_item_instance_dto->cis_full) {
    if(cJSON_AddStringToObject(item, "cisFull", order_item_instance_dto->cis_full) == NULL) {
    goto fail; //String
    }
    }


    // order_item_instance_dto->uin
    if(order_item_instance_dto->uin) {
    if(cJSON_AddStringToObject(item, "uin", order_item_instance_dto->uin) == NULL) {
    goto fail; //String
    }
    }


    // order_item_instance_dto->rnpt
    if(order_item_instance_dto->rnpt) {
    if(cJSON_AddStringToObject(item, "rnpt", order_item_instance_dto->rnpt) == NULL) {
    goto fail; //String
    }
    }


    // order_item_instance_dto->gtd
    if(order_item_instance_dto->gtd) {
    if(cJSON_AddStringToObject(item, "gtd", order_item_instance_dto->gtd) == NULL) {
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

order_item_instance_dto_t *order_item_instance_dto_parseFromJSON(cJSON *order_item_instance_dtoJSON){

    order_item_instance_dto_t *order_item_instance_dto_local_var = NULL;

    // order_item_instance_dto->cis
    cJSON *cis = cJSON_GetObjectItemCaseSensitive(order_item_instance_dtoJSON, "cis");
    if (cis) { 
    if(!cJSON_IsString(cis) && !cJSON_IsNull(cis))
    {
    goto end; //String
    }
    }

    // order_item_instance_dto->cis_full
    cJSON *cis_full = cJSON_GetObjectItemCaseSensitive(order_item_instance_dtoJSON, "cisFull");
    if (cis_full) { 
    if(!cJSON_IsString(cis_full) && !cJSON_IsNull(cis_full))
    {
    goto end; //String
    }
    }

    // order_item_instance_dto->uin
    cJSON *uin = cJSON_GetObjectItemCaseSensitive(order_item_instance_dtoJSON, "uin");
    if (uin) { 
    if(!cJSON_IsString(uin) && !cJSON_IsNull(uin))
    {
    goto end; //String
    }
    }

    // order_item_instance_dto->rnpt
    cJSON *rnpt = cJSON_GetObjectItemCaseSensitive(order_item_instance_dtoJSON, "rnpt");
    if (rnpt) { 
    if(!cJSON_IsString(rnpt) && !cJSON_IsNull(rnpt))
    {
    goto end; //String
    }
    }

    // order_item_instance_dto->gtd
    cJSON *gtd = cJSON_GetObjectItemCaseSensitive(order_item_instance_dtoJSON, "gtd");
    if (gtd) { 
    if(!cJSON_IsString(gtd) && !cJSON_IsNull(gtd))
    {
    goto end; //String
    }
    }


    order_item_instance_dto_local_var = order_item_instance_dto_create (
        cis && !cJSON_IsNull(cis) ? strdup(cis->valuestring) : NULL,
        cis_full && !cJSON_IsNull(cis_full) ? strdup(cis_full->valuestring) : NULL,
        uin && !cJSON_IsNull(uin) ? strdup(uin->valuestring) : NULL,
        rnpt && !cJSON_IsNull(rnpt) ? strdup(rnpt->valuestring) : NULL,
        gtd && !cJSON_IsNull(gtd) ? strdup(gtd->valuestring) : NULL
        );

    return order_item_instance_dto_local_var;
end:
    return NULL;

}
