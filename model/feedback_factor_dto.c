#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_factor_dto.h"



feedback_factor_dto_t *feedback_factor_dto_create(
    long id,
    char *title,
    char *description,
    int value
    ) {
    feedback_factor_dto_t *feedback_factor_dto_local_var = malloc(sizeof(feedback_factor_dto_t));
    if (!feedback_factor_dto_local_var) {
        return NULL;
    }
    feedback_factor_dto_local_var->id = id;
    feedback_factor_dto_local_var->title = title;
    feedback_factor_dto_local_var->description = description;
    feedback_factor_dto_local_var->value = value;

    return feedback_factor_dto_local_var;
}


void feedback_factor_dto_free(feedback_factor_dto_t *feedback_factor_dto) {
    if(NULL == feedback_factor_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_factor_dto->title) {
        free(feedback_factor_dto->title);
        feedback_factor_dto->title = NULL;
    }
    if (feedback_factor_dto->description) {
        free(feedback_factor_dto->description);
        feedback_factor_dto->description = NULL;
    }
    free(feedback_factor_dto);
}

cJSON *feedback_factor_dto_convertToJSON(feedback_factor_dto_t *feedback_factor_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_factor_dto->id
    if(feedback_factor_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", feedback_factor_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_factor_dto->title
    if(feedback_factor_dto->title) {
    if(cJSON_AddStringToObject(item, "title", feedback_factor_dto->title) == NULL) {
    goto fail; //String
    }
    }


    // feedback_factor_dto->description
    if(feedback_factor_dto->description) {
    if(cJSON_AddStringToObject(item, "description", feedback_factor_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // feedback_factor_dto->value
    if(feedback_factor_dto->value) {
    if(cJSON_AddNumberToObject(item, "value", feedback_factor_dto->value) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feedback_factor_dto_t *feedback_factor_dto_parseFromJSON(cJSON *feedback_factor_dtoJSON){

    feedback_factor_dto_t *feedback_factor_dto_local_var = NULL;

    // feedback_factor_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(feedback_factor_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // feedback_factor_dto->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(feedback_factor_dtoJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // feedback_factor_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(feedback_factor_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // feedback_factor_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(feedback_factor_dtoJSON, "value");
    if (value) { 
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    }


    feedback_factor_dto_local_var = feedback_factor_dto_create (
        id ? id->valuedouble : 0,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        value ? value->valuedouble : 0
        );

    return feedback_factor_dto_local_var;
end:
    return NULL;

}
