#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_dto.h"



business_dto_t *business_dto_create(
    long id,
    char *name
    ) {
    business_dto_t *business_dto_local_var = malloc(sizeof(business_dto_t));
    if (!business_dto_local_var) {
        return NULL;
    }
    business_dto_local_var->id = id;
    business_dto_local_var->name = name;

    return business_dto_local_var;
}


void business_dto_free(business_dto_t *business_dto) {
    if(NULL == business_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (business_dto->name) {
        free(business_dto->name);
        business_dto->name = NULL;
    }
    free(business_dto);
}

cJSON *business_dto_convertToJSON(business_dto_t *business_dto) {
    cJSON *item = cJSON_CreateObject();

    // business_dto->id
    if(business_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", business_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // business_dto->name
    if(business_dto->name) {
    if(cJSON_AddStringToObject(item, "name", business_dto->name) == NULL) {
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

business_dto_t *business_dto_parseFromJSON(cJSON *business_dtoJSON){

    business_dto_t *business_dto_local_var = NULL;

    // business_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(business_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // business_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(business_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    business_dto_local_var = business_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return business_dto_local_var;
end:
    return NULL;

}
