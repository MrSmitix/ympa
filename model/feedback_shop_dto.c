#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_shop_dto.h"



feedback_shop_dto_t *feedback_shop_dto_create(
    char *name
    ) {
    feedback_shop_dto_t *feedback_shop_dto_local_var = malloc(sizeof(feedback_shop_dto_t));
    if (!feedback_shop_dto_local_var) {
        return NULL;
    }
    feedback_shop_dto_local_var->name = name;

    return feedback_shop_dto_local_var;
}


void feedback_shop_dto_free(feedback_shop_dto_t *feedback_shop_dto) {
    if(NULL == feedback_shop_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_shop_dto->name) {
        free(feedback_shop_dto->name);
        feedback_shop_dto->name = NULL;
    }
    free(feedback_shop_dto);
}

cJSON *feedback_shop_dto_convertToJSON(feedback_shop_dto_t *feedback_shop_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_shop_dto->name
    if(feedback_shop_dto->name) {
    if(cJSON_AddStringToObject(item, "name", feedback_shop_dto->name) == NULL) {
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

feedback_shop_dto_t *feedback_shop_dto_parseFromJSON(cJSON *feedback_shop_dtoJSON){

    feedback_shop_dto_t *feedback_shop_dto_local_var = NULL;

    // feedback_shop_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feedback_shop_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    feedback_shop_dto_local_var = feedback_shop_dto_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return feedback_shop_dto_local_var;
end:
    return NULL;

}
