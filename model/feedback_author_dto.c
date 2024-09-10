#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_author_dto.h"



feedback_author_dto_t *feedback_author_dto_create(
    char *name,
    region_dto_t *region
    ) {
    feedback_author_dto_t *feedback_author_dto_local_var = malloc(sizeof(feedback_author_dto_t));
    if (!feedback_author_dto_local_var) {
        return NULL;
    }
    feedback_author_dto_local_var->name = name;
    feedback_author_dto_local_var->region = region;

    return feedback_author_dto_local_var;
}


void feedback_author_dto_free(feedback_author_dto_t *feedback_author_dto) {
    if(NULL == feedback_author_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_author_dto->name) {
        free(feedback_author_dto->name);
        feedback_author_dto->name = NULL;
    }
    if (feedback_author_dto->region) {
        region_dto_free(feedback_author_dto->region);
        feedback_author_dto->region = NULL;
    }
    free(feedback_author_dto);
}

cJSON *feedback_author_dto_convertToJSON(feedback_author_dto_t *feedback_author_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_author_dto->name
    if(feedback_author_dto->name) {
    if(cJSON_AddStringToObject(item, "name", feedback_author_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // feedback_author_dto->region
    if(feedback_author_dto->region) {
    cJSON *region_local_JSON = region_dto_convertToJSON(feedback_author_dto->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feedback_author_dto_t *feedback_author_dto_parseFromJSON(cJSON *feedback_author_dtoJSON){

    feedback_author_dto_t *feedback_author_dto_local_var = NULL;

    // define the local variable for feedback_author_dto->region
    region_dto_t *region_local_nonprim = NULL;

    // feedback_author_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feedback_author_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // feedback_author_dto->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(feedback_author_dtoJSON, "region");
    if (region) { 
    region_local_nonprim = region_dto_parseFromJSON(region); //nonprimitive
    }


    feedback_author_dto_local_var = feedback_author_dto_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        region ? region_local_nonprim : NULL
        );

    return feedback_author_dto_local_var;
end:
    if (region_local_nonprim) {
        region_dto_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    return NULL;

}
