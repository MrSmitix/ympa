#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_united_orders_request.h"



generate_united_orders_request_t *generate_united_orders_request_create(
    long business_id,
    char *date_from,
    char *date_to,
    list_t *campaign_ids,
    char *promo_id
    ) {
    generate_united_orders_request_t *generate_united_orders_request_local_var = malloc(sizeof(generate_united_orders_request_t));
    if (!generate_united_orders_request_local_var) {
        return NULL;
    }
    generate_united_orders_request_local_var->business_id = business_id;
    generate_united_orders_request_local_var->date_from = date_from;
    generate_united_orders_request_local_var->date_to = date_to;
    generate_united_orders_request_local_var->campaign_ids = campaign_ids;
    generate_united_orders_request_local_var->promo_id = promo_id;

    return generate_united_orders_request_local_var;
}


void generate_united_orders_request_free(generate_united_orders_request_t *generate_united_orders_request) {
    if(NULL == generate_united_orders_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_united_orders_request->date_from) {
        free(generate_united_orders_request->date_from);
        generate_united_orders_request->date_from = NULL;
    }
    if (generate_united_orders_request->date_to) {
        free(generate_united_orders_request->date_to);
        generate_united_orders_request->date_to = NULL;
    }
    if (generate_united_orders_request->campaign_ids) {
        list_ForEach(listEntry, generate_united_orders_request->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_united_orders_request->campaign_ids);
        generate_united_orders_request->campaign_ids = NULL;
    }
    if (generate_united_orders_request->promo_id) {
        free(generate_united_orders_request->promo_id);
        generate_united_orders_request->promo_id = NULL;
    }
    free(generate_united_orders_request);
}

cJSON *generate_united_orders_request_convertToJSON(generate_united_orders_request_t *generate_united_orders_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_united_orders_request->business_id
    if (!generate_united_orders_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_united_orders_request->business_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_united_orders_request->date_from
    if (!generate_united_orders_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", generate_united_orders_request->date_from) == NULL) {
    goto fail; //Date
    }


    // generate_united_orders_request->date_to
    if (!generate_united_orders_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", generate_united_orders_request->date_to) == NULL) {
    goto fail; //Date
    }


    // generate_united_orders_request->campaign_ids
    if(generate_united_orders_request->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaignIds");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, generate_united_orders_request->campaign_ids) {
    if(cJSON_AddNumberToObject(campaign_ids, "", *(double *)campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // generate_united_orders_request->promo_id
    if(generate_united_orders_request->promo_id) {
    if(cJSON_AddStringToObject(item, "promoId", generate_united_orders_request->promo_id) == NULL) {
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

generate_united_orders_request_t *generate_united_orders_request_parseFromJSON(cJSON *generate_united_orders_requestJSON){

    generate_united_orders_request_t *generate_united_orders_request_local_var = NULL;

    // define the local list for generate_united_orders_request->campaign_ids
    list_t *campaign_idsList = NULL;

    // generate_united_orders_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_united_orders_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }

    // generate_united_orders_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_united_orders_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // generate_united_orders_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_united_orders_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }

    // generate_united_orders_request->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(generate_united_orders_requestJSON, "campaignIds");
    if (campaign_ids) { 
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
    }

    // generate_united_orders_request->promo_id
    cJSON *promo_id = cJSON_GetObjectItemCaseSensitive(generate_united_orders_requestJSON, "promoId");
    if (promo_id) { 
    if(!cJSON_IsString(promo_id) && !cJSON_IsNull(promo_id))
    {
    goto end; //String
    }
    }


    generate_united_orders_request_local_var = generate_united_orders_request_create (
        business_id->valuedouble,
        strdup(date_from->valuestring),
        strdup(date_to->valuestring),
        campaign_ids ? campaign_idsList : NULL,
        promo_id && !cJSON_IsNull(promo_id) ? strdup(promo_id->valuestring) : NULL
        );

    return generate_united_orders_request_local_var;
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
