#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_prices_report_request.h"



generate_prices_report_request_t *generate_prices_report_request_create(
    long business_id,
    long campaign_id,
    list_t *category_ids,
    char *creation_date_from,
    char *creation_date_to
    ) {
    generate_prices_report_request_t *generate_prices_report_request_local_var = malloc(sizeof(generate_prices_report_request_t));
    if (!generate_prices_report_request_local_var) {
        return NULL;
    }
    generate_prices_report_request_local_var->business_id = business_id;
    generate_prices_report_request_local_var->campaign_id = campaign_id;
    generate_prices_report_request_local_var->category_ids = category_ids;
    generate_prices_report_request_local_var->creation_date_from = creation_date_from;
    generate_prices_report_request_local_var->creation_date_to = creation_date_to;

    return generate_prices_report_request_local_var;
}


void generate_prices_report_request_free(generate_prices_report_request_t *generate_prices_report_request) {
    if(NULL == generate_prices_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_prices_report_request->category_ids) {
        list_ForEach(listEntry, generate_prices_report_request->category_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_prices_report_request->category_ids);
        generate_prices_report_request->category_ids = NULL;
    }
    if (generate_prices_report_request->creation_date_from) {
        free(generate_prices_report_request->creation_date_from);
        generate_prices_report_request->creation_date_from = NULL;
    }
    if (generate_prices_report_request->creation_date_to) {
        free(generate_prices_report_request->creation_date_to);
        generate_prices_report_request->creation_date_to = NULL;
    }
    free(generate_prices_report_request);
}

cJSON *generate_prices_report_request_convertToJSON(generate_prices_report_request_t *generate_prices_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_prices_report_request->business_id
    if(generate_prices_report_request->business_id) {
    if(cJSON_AddNumberToObject(item, "businessId", generate_prices_report_request->business_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // generate_prices_report_request->campaign_id
    if(generate_prices_report_request->campaign_id) {
    if(cJSON_AddNumberToObject(item, "campaignId", generate_prices_report_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // generate_prices_report_request->category_ids
    if(generate_prices_report_request->category_ids) {
    cJSON *category_ids = cJSON_AddArrayToObject(item, "categoryIds");
    if(category_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *category_idsListEntry;
    list_ForEach(category_idsListEntry, generate_prices_report_request->category_ids) {
    if(cJSON_AddNumberToObject(category_ids, "", *(double *)category_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // generate_prices_report_request->creation_date_from
    if(generate_prices_report_request->creation_date_from) {
    if(cJSON_AddStringToObject(item, "creationDateFrom", generate_prices_report_request->creation_date_from) == NULL) {
    goto fail; //Date
    }
    }


    // generate_prices_report_request->creation_date_to
    if(generate_prices_report_request->creation_date_to) {
    if(cJSON_AddStringToObject(item, "creationDateTo", generate_prices_report_request->creation_date_to) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_prices_report_request_t *generate_prices_report_request_parseFromJSON(cJSON *generate_prices_report_requestJSON){

    generate_prices_report_request_t *generate_prices_report_request_local_var = NULL;

    // define the local list for generate_prices_report_request->category_ids
    list_t *category_idsList = NULL;

    // generate_prices_report_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_prices_report_requestJSON, "businessId");
    if (business_id) { 
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }
    }

    // generate_prices_report_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_prices_report_requestJSON, "campaignId");
    if (campaign_id) { 
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }
    }

    // generate_prices_report_request->category_ids
    cJSON *category_ids = cJSON_GetObjectItemCaseSensitive(generate_prices_report_requestJSON, "categoryIds");
    if (category_ids) { 
    cJSON *category_ids_local = NULL;
    if(!cJSON_IsArray(category_ids)) {
        goto end;//primitive container
    }
    category_idsList = list_createList();

    cJSON_ArrayForEach(category_ids_local, category_ids)
    {
        if(!cJSON_IsNumber(category_ids_local))
        {
            goto end;
        }
        double *category_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!category_ids_local_value)
        {
            goto end;
        }
        *category_ids_local_value = category_ids_local->valuedouble;
        list_addElement(category_idsList , category_ids_local_value);
    }
    }

    // generate_prices_report_request->creation_date_from
    cJSON *creation_date_from = cJSON_GetObjectItemCaseSensitive(generate_prices_report_requestJSON, "creationDateFrom");
    if (creation_date_from) { 
    if(!cJSON_IsString(creation_date_from))
    {
    goto end; //Date
    }
    }

    // generate_prices_report_request->creation_date_to
    cJSON *creation_date_to = cJSON_GetObjectItemCaseSensitive(generate_prices_report_requestJSON, "creationDateTo");
    if (creation_date_to) { 
    if(!cJSON_IsString(creation_date_to))
    {
    goto end; //Date
    }
    }


    generate_prices_report_request_local_var = generate_prices_report_request_create (
        business_id ? business_id->valuedouble : 0,
        campaign_id ? campaign_id->valuedouble : 0,
        category_ids ? category_idsList : NULL,
        creation_date_from ? strdup(creation_date_from->valuestring) : NULL,
        creation_date_to ? strdup(creation_date_to->valuestring) : NULL
        );

    return generate_prices_report_request_local_var;
end:
    if (category_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, category_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(category_idsList);
        category_idsList = NULL;
    }
    return NULL;

}
