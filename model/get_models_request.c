#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_models_request.h"



get_models_request_t *get_models_request_create(
    list_t *models
    ) {
    get_models_request_t *get_models_request_local_var = malloc(sizeof(get_models_request_t));
    if (!get_models_request_local_var) {
        return NULL;
    }
    get_models_request_local_var->models = models;

    return get_models_request_local_var;
}


void get_models_request_free(get_models_request_t *get_models_request) {
    if(NULL == get_models_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_models_request->models) {
        list_ForEach(listEntry, get_models_request->models) {
            free(listEntry->data);
        }
        list_freeList(get_models_request->models);
        get_models_request->models = NULL;
    }
    free(get_models_request);
}

cJSON *get_models_request_convertToJSON(get_models_request_t *get_models_request) {
    cJSON *item = cJSON_CreateObject();

    // get_models_request->models
    if (!get_models_request->models) {
        goto fail;
    }
    cJSON *models = cJSON_AddArrayToObject(item, "models");
    if(models == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *modelsListEntry;
    list_ForEach(modelsListEntry, get_models_request->models) {
    if(cJSON_AddNumberToObject(models, "", *(double *)modelsListEntry->data) == NULL)
    {
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

get_models_request_t *get_models_request_parseFromJSON(cJSON *get_models_requestJSON){

    get_models_request_t *get_models_request_local_var = NULL;

    // define the local list for get_models_request->models
    list_t *modelsList = NULL;

    // get_models_request->models
    cJSON *models = cJSON_GetObjectItemCaseSensitive(get_models_requestJSON, "models");
    if (!models) {
        goto end;
    }

    
    cJSON *models_local = NULL;
    if(!cJSON_IsArray(models)) {
        goto end;//primitive container
    }
    modelsList = list_createList();

    cJSON_ArrayForEach(models_local, models)
    {
        if(!cJSON_IsNumber(models_local))
        {
            goto end;
        }
        double *models_local_value = (double *)calloc(1, sizeof(double));
        if(!models_local_value)
        {
            goto end;
        }
        *models_local_value = models_local->valuedouble;
        list_addElement(modelsList , models_local_value);
    }


    get_models_request_local_var = get_models_request_create (
        modelsList
        );

    return get_models_request_local_var;
end:
    if (modelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modelsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modelsList);
        modelsList = NULL;
    }
    return NULL;

}
