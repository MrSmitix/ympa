#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_digital_item_dto.h"



order_digital_item_dto_t *order_digital_item_dto_create(
    long id,
    char *code,
    char *slip,
    char *activate_till
    ) {
    order_digital_item_dto_t *order_digital_item_dto_local_var = malloc(sizeof(order_digital_item_dto_t));
    if (!order_digital_item_dto_local_var) {
        return NULL;
    }
    order_digital_item_dto_local_var->id = id;
    order_digital_item_dto_local_var->code = code;
    order_digital_item_dto_local_var->slip = slip;
    order_digital_item_dto_local_var->activate_till = activate_till;

    return order_digital_item_dto_local_var;
}


void order_digital_item_dto_free(order_digital_item_dto_t *order_digital_item_dto) {
    if(NULL == order_digital_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_digital_item_dto->code) {
        free(order_digital_item_dto->code);
        order_digital_item_dto->code = NULL;
    }
    if (order_digital_item_dto->slip) {
        free(order_digital_item_dto->slip);
        order_digital_item_dto->slip = NULL;
    }
    if (order_digital_item_dto->activate_till) {
        free(order_digital_item_dto->activate_till);
        order_digital_item_dto->activate_till = NULL;
    }
    free(order_digital_item_dto);
}

cJSON *order_digital_item_dto_convertToJSON(order_digital_item_dto_t *order_digital_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_digital_item_dto->id
    if (!order_digital_item_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", order_digital_item_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // order_digital_item_dto->code
    if (!order_digital_item_dto->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", order_digital_item_dto->code) == NULL) {
    goto fail; //String
    }


    // order_digital_item_dto->slip
    if (!order_digital_item_dto->slip) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "slip", order_digital_item_dto->slip) == NULL) {
    goto fail; //String
    }


    // order_digital_item_dto->activate_till
    if (!order_digital_item_dto->activate_till) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "activate_till", order_digital_item_dto->activate_till) == NULL) {
    goto fail; //Date
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_digital_item_dto_t *order_digital_item_dto_parseFromJSON(cJSON *order_digital_item_dtoJSON){

    order_digital_item_dto_t *order_digital_item_dto_local_var = NULL;

    // order_digital_item_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_digital_item_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // order_digital_item_dto->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(order_digital_item_dtoJSON, "code");
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }

    // order_digital_item_dto->slip
    cJSON *slip = cJSON_GetObjectItemCaseSensitive(order_digital_item_dtoJSON, "slip");
    if (!slip) {
        goto end;
    }

    
    if(!cJSON_IsString(slip))
    {
    goto end; //String
    }

    // order_digital_item_dto->activate_till
    cJSON *activate_till = cJSON_GetObjectItemCaseSensitive(order_digital_item_dtoJSON, "activate_till");
    if (!activate_till) {
        goto end;
    }

    
    if(!cJSON_IsString(activate_till))
    {
    goto end; //Date
    }


    order_digital_item_dto_local_var = order_digital_item_dto_create (
        id->valuedouble,
        strdup(code->valuestring),
        strdup(slip->valuestring),
        strdup(activate_till->valuestring)
        );

    return order_digital_item_dto_local_var;
end:
    return NULL;

}
