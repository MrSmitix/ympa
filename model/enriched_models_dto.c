#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "enriched_models_dto.h"



enriched_models_dto_t *enriched_models_dto_create(
    list_t *models
    ) {
    enriched_models_dto_t *enriched_models_dto_local_var = malloc(sizeof(enriched_models_dto_t));
    if (!enriched_models_dto_local_var) {
        return NULL;
    }
    enriched_models_dto_local_var->models = models;

    return enriched_models_dto_local_var;
}


void enriched_models_dto_free(enriched_models_dto_t *enriched_models_dto) {
    if(NULL == enriched_models_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (enriched_models_dto->models) {
        list_ForEach(listEntry, enriched_models_dto->models) {
            enriched_model_dto_free(listEntry->data);
        }
        list_freeList(enriched_models_dto->models);
        enriched_models_dto->models = NULL;
    }
    free(enriched_models_dto);
}

cJSON *enriched_models_dto_convertToJSON(enriched_models_dto_t *enriched_models_dto) {
    cJSON *item = cJSON_CreateObject();

    // enriched_models_dto->models
    if (!enriched_models_dto->models) {
        goto fail;
    }
    cJSON *models = cJSON_AddArrayToObject(item, "models");
    if(models == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *modelsListEntry;
    if (enriched_models_dto->models) {
    list_ForEach(modelsListEntry, enriched_models_dto->models) {
    cJSON *itemLocal = enriched_model_dto_convertToJSON(modelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(models, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

enriched_models_dto_t *enriched_models_dto_parseFromJSON(cJSON *enriched_models_dtoJSON){

    enriched_models_dto_t *enriched_models_dto_local_var = NULL;

    // define the local list for enriched_models_dto->models
    list_t *modelsList = NULL;

    // enriched_models_dto->models
    cJSON *models = cJSON_GetObjectItemCaseSensitive(enriched_models_dtoJSON, "models");
    if (!models) {
        goto end;
    }

    
    cJSON *models_local_nonprimitive = NULL;
    if(!cJSON_IsArray(models)){
        goto end; //nonprimitive container
    }

    modelsList = list_createList();

    cJSON_ArrayForEach(models_local_nonprimitive,models )
    {
        if(!cJSON_IsObject(models_local_nonprimitive)){
            goto end;
        }
        enriched_model_dto_t *modelsItem = enriched_model_dto_parseFromJSON(models_local_nonprimitive);

        list_addElement(modelsList, modelsItem);
    }


    enriched_models_dto_local_var = enriched_models_dto_create (
        modelsList
        );

    return enriched_models_dto_local_var;
end:
    if (modelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modelsList) {
            enriched_model_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modelsList);
        modelsList = NULL;
    }
    return NULL;

}
