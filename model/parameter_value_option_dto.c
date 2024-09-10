#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parameter_value_option_dto.h"



parameter_value_option_dto_t *parameter_value_option_dto_create(
    long id,
    char *value,
    char *description
    ) {
    parameter_value_option_dto_t *parameter_value_option_dto_local_var = malloc(sizeof(parameter_value_option_dto_t));
    if (!parameter_value_option_dto_local_var) {
        return NULL;
    }
    parameter_value_option_dto_local_var->id = id;
    parameter_value_option_dto_local_var->value = value;
    parameter_value_option_dto_local_var->description = description;

    return parameter_value_option_dto_local_var;
}


void parameter_value_option_dto_free(parameter_value_option_dto_t *parameter_value_option_dto) {
    if(NULL == parameter_value_option_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (parameter_value_option_dto->value) {
        free(parameter_value_option_dto->value);
        parameter_value_option_dto->value = NULL;
    }
    if (parameter_value_option_dto->description) {
        free(parameter_value_option_dto->description);
        parameter_value_option_dto->description = NULL;
    }
    free(parameter_value_option_dto);
}

cJSON *parameter_value_option_dto_convertToJSON(parameter_value_option_dto_t *parameter_value_option_dto) {
    cJSON *item = cJSON_CreateObject();

    // parameter_value_option_dto->id
    if (!parameter_value_option_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", parameter_value_option_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // parameter_value_option_dto->value
    if (!parameter_value_option_dto->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", parameter_value_option_dto->value) == NULL) {
    goto fail; //String
    }


    // parameter_value_option_dto->description
    if(parameter_value_option_dto->description) {
    if(cJSON_AddStringToObject(item, "description", parameter_value_option_dto->description) == NULL) {
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

parameter_value_option_dto_t *parameter_value_option_dto_parseFromJSON(cJSON *parameter_value_option_dtoJSON){

    parameter_value_option_dto_t *parameter_value_option_dto_local_var = NULL;

    // parameter_value_option_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(parameter_value_option_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // parameter_value_option_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(parameter_value_option_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }

    // parameter_value_option_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(parameter_value_option_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }


    parameter_value_option_dto_local_var = parameter_value_option_dto_create (
        id->valuedouble,
        strdup(value->valuestring),
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL
        );

    return parameter_value_option_dto_local_var;
end:
    return NULL;

}
