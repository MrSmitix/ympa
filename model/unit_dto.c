#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "unit_dto.h"



unit_dto_t *unit_dto_create(
    long id,
    char *name,
    char *full_name
    ) {
    unit_dto_t *unit_dto_local_var = malloc(sizeof(unit_dto_t));
    if (!unit_dto_local_var) {
        return NULL;
    }
    unit_dto_local_var->id = id;
    unit_dto_local_var->name = name;
    unit_dto_local_var->full_name = full_name;

    return unit_dto_local_var;
}


void unit_dto_free(unit_dto_t *unit_dto) {
    if(NULL == unit_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (unit_dto->name) {
        free(unit_dto->name);
        unit_dto->name = NULL;
    }
    if (unit_dto->full_name) {
        free(unit_dto->full_name);
        unit_dto->full_name = NULL;
    }
    free(unit_dto);
}

cJSON *unit_dto_convertToJSON(unit_dto_t *unit_dto) {
    cJSON *item = cJSON_CreateObject();

    // unit_dto->id
    if (!unit_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", unit_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // unit_dto->name
    if (!unit_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", unit_dto->name) == NULL) {
    goto fail; //String
    }


    // unit_dto->full_name
    if (!unit_dto->full_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "fullName", unit_dto->full_name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

unit_dto_t *unit_dto_parseFromJSON(cJSON *unit_dtoJSON){

    unit_dto_t *unit_dto_local_var = NULL;

    // unit_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(unit_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // unit_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(unit_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // unit_dto->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(unit_dtoJSON, "fullName");
    if (!full_name) {
        goto end;
    }

    
    if(!cJSON_IsString(full_name))
    {
    goto end; //String
    }


    unit_dto_local_var = unit_dto_create (
        id->valuedouble,
        strdup(name->valuestring),
        strdup(full_name->valuestring)
        );

    return unit_dto_local_var;
end:
    return NULL;

}
