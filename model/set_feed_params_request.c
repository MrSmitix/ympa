#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_feed_params_request.h"



set_feed_params_request_t *set_feed_params_request_create(
    list_t *parameters
    ) {
    set_feed_params_request_t *set_feed_params_request_local_var = malloc(sizeof(set_feed_params_request_t));
    if (!set_feed_params_request_local_var) {
        return NULL;
    }
    set_feed_params_request_local_var->parameters = parameters;

    return set_feed_params_request_local_var;
}


void set_feed_params_request_free(set_feed_params_request_t *set_feed_params_request) {
    if(NULL == set_feed_params_request){
        return ;
    }
    listEntry_t *listEntry;
    if (set_feed_params_request->parameters) {
        list_ForEach(listEntry, set_feed_params_request->parameters) {
            feed_parameter_dto_free(listEntry->data);
        }
        list_freeList(set_feed_params_request->parameters);
        set_feed_params_request->parameters = NULL;
    }
    free(set_feed_params_request);
}

cJSON *set_feed_params_request_convertToJSON(set_feed_params_request_t *set_feed_params_request) {
    cJSON *item = cJSON_CreateObject();

    // set_feed_params_request->parameters
    if (!set_feed_params_request->parameters) {
        goto fail;
    }
    cJSON *parameters = cJSON_AddArrayToObject(item, "parameters");
    if(parameters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parametersListEntry;
    if (set_feed_params_request->parameters) {
    list_ForEach(parametersListEntry, set_feed_params_request->parameters) {
    cJSON *itemLocal = feed_parameter_dto_convertToJSON(parametersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parameters, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

set_feed_params_request_t *set_feed_params_request_parseFromJSON(cJSON *set_feed_params_requestJSON){

    set_feed_params_request_t *set_feed_params_request_local_var = NULL;

    // define the local list for set_feed_params_request->parameters
    list_t *parametersList = NULL;

    // set_feed_params_request->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(set_feed_params_requestJSON, "parameters");
    if (!parameters) {
        goto end;
    }

    
    cJSON *parameters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parameters)){
        goto end; //nonprimitive container
    }

    parametersList = list_createList();

    cJSON_ArrayForEach(parameters_local_nonprimitive,parameters )
    {
        if(!cJSON_IsObject(parameters_local_nonprimitive)){
            goto end;
        }
        feed_parameter_dto_t *parametersItem = feed_parameter_dto_parseFromJSON(parameters_local_nonprimitive);

        list_addElement(parametersList, parametersItem);
    }


    set_feed_params_request_local_var = set_feed_params_request_create (
        parametersList
        );

    return set_feed_params_request_local_var;
end:
    if (parametersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parametersList) {
            feed_parameter_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parametersList);
        parametersList = NULL;
    }
    return NULL;

}
