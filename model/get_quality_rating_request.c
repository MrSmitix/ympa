#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_quality_rating_request.h"



get_quality_rating_request_t *get_quality_rating_request_create(
    char *date_from,
    char *date_to,
    list_t *campaign_ids
    ) {
    get_quality_rating_request_t *get_quality_rating_request_local_var = malloc(sizeof(get_quality_rating_request_t));
    if (!get_quality_rating_request_local_var) {
        return NULL;
    }
    get_quality_rating_request_local_var->date_from = date_from;
    get_quality_rating_request_local_var->date_to = date_to;
    get_quality_rating_request_local_var->campaign_ids = campaign_ids;

    return get_quality_rating_request_local_var;
}


void get_quality_rating_request_free(get_quality_rating_request_t *get_quality_rating_request) {
    if(NULL == get_quality_rating_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_quality_rating_request->date_from) {
        free(get_quality_rating_request->date_from);
        get_quality_rating_request->date_from = NULL;
    }
    if (get_quality_rating_request->date_to) {
        free(get_quality_rating_request->date_to);
        get_quality_rating_request->date_to = NULL;
    }
    if (get_quality_rating_request->campaign_ids) {
        list_ForEach(listEntry, get_quality_rating_request->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(get_quality_rating_request->campaign_ids);
        get_quality_rating_request->campaign_ids = NULL;
    }
    free(get_quality_rating_request);
}

cJSON *get_quality_rating_request_convertToJSON(get_quality_rating_request_t *get_quality_rating_request) {
    cJSON *item = cJSON_CreateObject();

    // get_quality_rating_request->date_from
    if(get_quality_rating_request->date_from) {
    if(cJSON_AddStringToObject(item, "dateFrom", get_quality_rating_request->date_from) == NULL) {
    goto fail; //Date
    }
    }


    // get_quality_rating_request->date_to
    if(get_quality_rating_request->date_to) {
    if(cJSON_AddStringToObject(item, "dateTo", get_quality_rating_request->date_to) == NULL) {
    goto fail; //Date
    }
    }


    // get_quality_rating_request->campaign_ids
    if (!get_quality_rating_request->campaign_ids) {
        goto fail;
    }
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaignIds");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, get_quality_rating_request->campaign_ids) {
    if(cJSON_AddNumberToObject(campaign_ids, "", *(double *)campaign_idsListEntry->data) == NULL)
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

get_quality_rating_request_t *get_quality_rating_request_parseFromJSON(cJSON *get_quality_rating_requestJSON){

    get_quality_rating_request_t *get_quality_rating_request_local_var = NULL;

    // define the local list for get_quality_rating_request->campaign_ids
    list_t *campaign_idsList = NULL;

    // get_quality_rating_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(get_quality_rating_requestJSON, "dateFrom");
    if (date_from) { 
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }
    }

    // get_quality_rating_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(get_quality_rating_requestJSON, "dateTo");
    if (date_to) { 
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }
    }

    // get_quality_rating_request->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(get_quality_rating_requestJSON, "campaignIds");
    if (!campaign_ids) {
        goto end;
    }

    
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsNumber(campaign_ids_local))
        {
            goto end;
        }
        double *campaign_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!campaign_ids_local_value)
        {
            goto end;
        }
        *campaign_ids_local_value = campaign_ids_local->valuedouble;
        list_addElement(campaign_idsList , campaign_ids_local_value);
    }


    get_quality_rating_request_local_var = get_quality_rating_request_create (
        date_from ? strdup(date_from->valuestring) : NULL,
        date_to ? strdup(date_to->valuestring) : NULL,
        campaign_idsList
        );

    return get_quality_rating_request_local_var;
end:
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    return NULL;

}
