#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_goods_feedback_request.h"


char* get_goods_feedback_request_reaction_status_ToString(_api__get_goods_feedback_request__e reaction_status) {
    char* reaction_statusArray[] =  { "NULL", "ALL", "NEED_REACTION" };
    return reaction_statusArray[reaction_status];
}

_api__get_goods_feedback_request__e get_goods_feedback_request_reaction_status_FromString(char* reaction_status){
    int stringToReturn = 0;
    char *reaction_statusArray[] =  { "NULL", "ALL", "NEED_REACTION" };
    size_t sizeofArray = sizeof(reaction_statusArray) / sizeof(reaction_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reaction_status, reaction_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_goods_feedback_request_t *get_goods_feedback_request_create(
    char *date_time_from,
    char *date_time_to,
    feedback_reaction_status_type_t *reaction_status,
    list_t *rating_values,
    list_t *model_ids,
    int paid
    ) {
    get_goods_feedback_request_t *get_goods_feedback_request_local_var = malloc(sizeof(get_goods_feedback_request_t));
    if (!get_goods_feedback_request_local_var) {
        return NULL;
    }
    get_goods_feedback_request_local_var->date_time_from = date_time_from;
    get_goods_feedback_request_local_var->date_time_to = date_time_to;
    get_goods_feedback_request_local_var->reaction_status = reaction_status;
    get_goods_feedback_request_local_var->rating_values = rating_values;
    get_goods_feedback_request_local_var->model_ids = model_ids;
    get_goods_feedback_request_local_var->paid = paid;

    return get_goods_feedback_request_local_var;
}


void get_goods_feedback_request_free(get_goods_feedback_request_t *get_goods_feedback_request) {
    if(NULL == get_goods_feedback_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_goods_feedback_request->date_time_from) {
        free(get_goods_feedback_request->date_time_from);
        get_goods_feedback_request->date_time_from = NULL;
    }
    if (get_goods_feedback_request->date_time_to) {
        free(get_goods_feedback_request->date_time_to);
        get_goods_feedback_request->date_time_to = NULL;
    }
    if (get_goods_feedback_request->reaction_status) {
        feedback_reaction_status_type_free(get_goods_feedback_request->reaction_status);
        get_goods_feedback_request->reaction_status = NULL;
    }
    if (get_goods_feedback_request->rating_values) {
        list_ForEach(listEntry, get_goods_feedback_request->rating_values) {
            free(listEntry->data);
        }
        list_freeList(get_goods_feedback_request->rating_values);
        get_goods_feedback_request->rating_values = NULL;
    }
    if (get_goods_feedback_request->model_ids) {
        list_ForEach(listEntry, get_goods_feedback_request->model_ids) {
            free(listEntry->data);
        }
        list_freeList(get_goods_feedback_request->model_ids);
        get_goods_feedback_request->model_ids = NULL;
    }
    free(get_goods_feedback_request);
}

cJSON *get_goods_feedback_request_convertToJSON(get_goods_feedback_request_t *get_goods_feedback_request) {
    cJSON *item = cJSON_CreateObject();

    // get_goods_feedback_request->date_time_from
    if(get_goods_feedback_request->date_time_from) {
    if(cJSON_AddStringToObject(item, "dateTimeFrom", get_goods_feedback_request->date_time_from) == NULL) {
    goto fail; //Date-Time
    }
    }


    // get_goods_feedback_request->date_time_to
    if(get_goods_feedback_request->date_time_to) {
    if(cJSON_AddStringToObject(item, "dateTimeTo", get_goods_feedback_request->date_time_to) == NULL) {
    goto fail; //Date-Time
    }
    }


    // get_goods_feedback_request->reaction_status
    if(get_goods_feedback_request->reaction_status != _api__get_goods_feedback_request__NULL) {
    cJSON *reaction_status_local_JSON = feedback_reaction_status_type_convertToJSON(get_goods_feedback_request->reaction_status);
    if(reaction_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reactionStatus", reaction_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_goods_feedback_request->rating_values
    if(get_goods_feedback_request->rating_values) {
    cJSON *rating_values = cJSON_AddArrayToObject(item, "ratingValues");
    if(rating_values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *rating_valuesListEntry;
    list_ForEach(rating_valuesListEntry, get_goods_feedback_request->rating_values) {
    if(cJSON_AddNumberToObject(rating_values, "", *(double *)rating_valuesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_goods_feedback_request->model_ids
    if(get_goods_feedback_request->model_ids) {
    cJSON *model_ids = cJSON_AddArrayToObject(item, "modelIds");
    if(model_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *model_idsListEntry;
    list_ForEach(model_idsListEntry, get_goods_feedback_request->model_ids) {
    if(cJSON_AddNumberToObject(model_ids, "", *(double *)model_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_goods_feedback_request->paid
    if(get_goods_feedback_request->paid) {
    if(cJSON_AddBoolToObject(item, "paid", get_goods_feedback_request->paid) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_goods_feedback_request_t *get_goods_feedback_request_parseFromJSON(cJSON *get_goods_feedback_requestJSON){

    get_goods_feedback_request_t *get_goods_feedback_request_local_var = NULL;

    // define the local variable for get_goods_feedback_request->reaction_status
    feedback_reaction_status_type_t *reaction_status_local_nonprim = NULL;

    // define the local list for get_goods_feedback_request->rating_values
    list_t *rating_valuesList = NULL;

    // define the local list for get_goods_feedback_request->model_ids
    list_t *model_idsList = NULL;

    // get_goods_feedback_request->date_time_from
    cJSON *date_time_from = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_requestJSON, "dateTimeFrom");
    if (date_time_from) { 
    if(!cJSON_IsString(date_time_from) && !cJSON_IsNull(date_time_from))
    {
    goto end; //DateTime
    }
    }

    // get_goods_feedback_request->date_time_to
    cJSON *date_time_to = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_requestJSON, "dateTimeTo");
    if (date_time_to) { 
    if(!cJSON_IsString(date_time_to) && !cJSON_IsNull(date_time_to))
    {
    goto end; //DateTime
    }
    }

    // get_goods_feedback_request->reaction_status
    cJSON *reaction_status = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_requestJSON, "reactionStatus");
    if (reaction_status) { 
    reaction_status_local_nonprim = feedback_reaction_status_type_parseFromJSON(reaction_status); //custom
    }

    // get_goods_feedback_request->rating_values
    cJSON *rating_values = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_requestJSON, "ratingValues");
    if (rating_values) { 
    cJSON *rating_values_local = NULL;
    if(!cJSON_IsArray(rating_values)) {
        goto end;//primitive container
    }
    rating_valuesList = list_createList();

    cJSON_ArrayForEach(rating_values_local, rating_values)
    {
        if(!cJSON_IsNumber(rating_values_local))
        {
            goto end;
        }
        double *rating_values_local_value = (double *)calloc(1, sizeof(double));
        if(!rating_values_local_value)
        {
            goto end;
        }
        *rating_values_local_value = rating_values_local->valuedouble;
        list_addElement(rating_valuesList , rating_values_local_value);
    }
    }

    // get_goods_feedback_request->model_ids
    cJSON *model_ids = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_requestJSON, "modelIds");
    if (model_ids) { 
    cJSON *model_ids_local = NULL;
    if(!cJSON_IsArray(model_ids)) {
        goto end;//primitive container
    }
    model_idsList = list_createList();

    cJSON_ArrayForEach(model_ids_local, model_ids)
    {
        if(!cJSON_IsNumber(model_ids_local))
        {
            goto end;
        }
        double *model_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!model_ids_local_value)
        {
            goto end;
        }
        *model_ids_local_value = model_ids_local->valuedouble;
        list_addElement(model_idsList , model_ids_local_value);
    }
    }

    // get_goods_feedback_request->paid
    cJSON *paid = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_requestJSON, "paid");
    if (paid) { 
    if(!cJSON_IsBool(paid))
    {
    goto end; //Bool
    }
    }


    get_goods_feedback_request_local_var = get_goods_feedback_request_create (
        date_time_from && !cJSON_IsNull(date_time_from) ? strdup(date_time_from->valuestring) : NULL,
        date_time_to && !cJSON_IsNull(date_time_to) ? strdup(date_time_to->valuestring) : NULL,
        reaction_status ? reaction_status_local_nonprim : NULL,
        rating_values ? rating_valuesList : NULL,
        model_ids ? model_idsList : NULL,
        paid ? paid->valueint : 0
        );

    return get_goods_feedback_request_local_var;
end:
    if (reaction_status_local_nonprim) {
        feedback_reaction_status_type_free(reaction_status_local_nonprim);
        reaction_status_local_nonprim = NULL;
    }
    if (rating_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rating_valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rating_valuesList);
        rating_valuesList = NULL;
    }
    if (model_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, model_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(model_idsList);
        model_idsList = NULL;
    }
    return NULL;

}
