#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_param_dto.h"



offer_param_dto_t *offer_param_dto_create(
    char *name,
    char *value
    ) {
    offer_param_dto_t *offer_param_dto_local_var = malloc(sizeof(offer_param_dto_t));
    if (!offer_param_dto_local_var) {
        return NULL;
    }
    offer_param_dto_local_var->name = name;
    offer_param_dto_local_var->value = value;

    return offer_param_dto_local_var;
}


void offer_param_dto_free(offer_param_dto_t *offer_param_dto) {
    if(NULL == offer_param_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_param_dto->name) {
        free(offer_param_dto->name);
        offer_param_dto->name = NULL;
    }
    if (offer_param_dto->value) {
        free(offer_param_dto->value);
        offer_param_dto->value = NULL;
    }
    free(offer_param_dto);
}

cJSON *offer_param_dto_convertToJSON(offer_param_dto_t *offer_param_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_param_dto->name
    if (!offer_param_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", offer_param_dto->name) == NULL) {
    goto fail; //String
    }


    // offer_param_dto->value
    if (!offer_param_dto->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", offer_param_dto->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_param_dto_t *offer_param_dto_parseFromJSON(cJSON *offer_param_dtoJSON){

    offer_param_dto_t *offer_param_dto_local_var = NULL;

    // offer_param_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(offer_param_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // offer_param_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(offer_param_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    offer_param_dto_local_var = offer_param_dto_create (
        strdup(name->valuestring),
        strdup(value->valuestring)
        );

    return offer_param_dto_local_var;
end:
    return NULL;

}
