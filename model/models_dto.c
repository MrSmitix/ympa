#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "models_dto.h"



models_dto_t *models_dto_create(
    list_t *models
    ) {
    models_dto_t *models_dto_local_var = malloc(sizeof(models_dto_t));
    if (!models_dto_local_var) {
        return NULL;
    }
    models_dto_local_var->models = models;

    return models_dto_local_var;
}


void models_dto_free(models_dto_t *models_dto) {
    if(NULL == models_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (models_dto->models) {
        list_ForEach(listEntry, models_dto->models) {
            model_dto_free(listEntry->data);
        }
        list_freeList(models_dto->models);
        models_dto->models = NULL;
    }
    free(models_dto);
}

cJSON *models_dto_convertToJSON(models_dto_t *models_dto) {
    cJSON *item = cJSON_CreateObject();

    // models_dto->models
    if (!models_dto->models) {
        goto fail;
    }
    cJSON *models = cJSON_AddArrayToObject(item, "models");
    if(models == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *modelsListEntry;
    if (models_dto->models) {
    list_ForEach(modelsListEntry, models_dto->models) {
    cJSON *itemLocal = model_dto_convertToJSON(modelsListEntry->data);
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

models_dto_t *models_dto_parseFromJSON(cJSON *models_dtoJSON){

    models_dto_t *models_dto_local_var = NULL;

    // define the local list for models_dto->models
    list_t *modelsList = NULL;

    // models_dto->models
    cJSON *models = cJSON_GetObjectItemCaseSensitive(models_dtoJSON, "models");
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
        model_dto_t *modelsItem = model_dto_parseFromJSON(models_local_nonprimitive);

        list_addElement(modelsList, modelsItem);
    }


    models_dto_local_var = models_dto_create (
        modelsList
        );

    return models_dto_local_var;
end:
    if (modelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modelsList) {
            model_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modelsList);
        modelsList = NULL;
    }
    return NULL;

}
