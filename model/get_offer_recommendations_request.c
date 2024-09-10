#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_offer_recommendations_request.h"


char* get_offer_recommendations_request_cofinance_price_filter_ToString(_api__get_offer_recommendations_request__e cofinance_price_filter) {
    char* cofinance_price_filterArray[] =  { "NULL", "SPECIFIED", "EMPTY" };
    return cofinance_price_filterArray[cofinance_price_filter];
}

_api__get_offer_recommendations_request__e get_offer_recommendations_request_cofinance_price_filter_FromString(char* cofinance_price_filter){
    int stringToReturn = 0;
    char *cofinance_price_filterArray[] =  { "NULL", "SPECIFIED", "EMPTY" };
    size_t sizeofArray = sizeof(cofinance_price_filterArray) / sizeof(cofinance_price_filterArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(cofinance_price_filter, cofinance_price_filterArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* get_offer_recommendations_request_recommended_cofinance_price_filter_ToString(_api__get_offer_recommendations_request__e recommended_cofinance_price_filter) {
    char* recommended_cofinance_price_filterArray[] =  { "NULL", "SPECIFIED", "EMPTY" };
    return recommended_cofinance_price_filterArray[recommended_cofinance_price_filter];
}

_api__get_offer_recommendations_request__e get_offer_recommendations_request_recommended_cofinance_price_filter_FromString(char* recommended_cofinance_price_filter){
    int stringToReturn = 0;
    char *recommended_cofinance_price_filterArray[] =  { "NULL", "SPECIFIED", "EMPTY" };
    size_t sizeofArray = sizeof(recommended_cofinance_price_filterArray) / sizeof(recommended_cofinance_price_filterArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(recommended_cofinance_price_filter, recommended_cofinance_price_filterArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* get_offer_recommendations_request_competitiveness_filter_ToString(_api__get_offer_recommendations_request__e competitiveness_filter) {
    char* competitiveness_filterArray[] =  { "NULL", "OPTIMAL", "AVERAGE", "LOW" };
    return competitiveness_filterArray[competitiveness_filter];
}

_api__get_offer_recommendations_request__e get_offer_recommendations_request_competitiveness_filter_FromString(char* competitiveness_filter){
    int stringToReturn = 0;
    char *competitiveness_filterArray[] =  { "NULL", "OPTIMAL", "AVERAGE", "LOW" };
    size_t sizeofArray = sizeof(competitiveness_filterArray) / sizeof(competitiveness_filterArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(competitiveness_filter, competitiveness_filterArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_offer_recommendations_request_t *get_offer_recommendations_request_create(
    list_t *offer_ids,
    field_state_type_t *cofinance_price_filter,
    field_state_type_t *recommended_cofinance_price_filter,
    price_competitiveness_type_t *competitiveness_filter
    ) {
    get_offer_recommendations_request_t *get_offer_recommendations_request_local_var = malloc(sizeof(get_offer_recommendations_request_t));
    if (!get_offer_recommendations_request_local_var) {
        return NULL;
    }
    get_offer_recommendations_request_local_var->offer_ids = offer_ids;
    get_offer_recommendations_request_local_var->cofinance_price_filter = cofinance_price_filter;
    get_offer_recommendations_request_local_var->recommended_cofinance_price_filter = recommended_cofinance_price_filter;
    get_offer_recommendations_request_local_var->competitiveness_filter = competitiveness_filter;

    return get_offer_recommendations_request_local_var;
}


void get_offer_recommendations_request_free(get_offer_recommendations_request_t *get_offer_recommendations_request) {
    if(NULL == get_offer_recommendations_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_offer_recommendations_request->offer_ids) {
        list_ForEach(listEntry, get_offer_recommendations_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(get_offer_recommendations_request->offer_ids);
        get_offer_recommendations_request->offer_ids = NULL;
    }
    if (get_offer_recommendations_request->cofinance_price_filter) {
        field_state_type_free(get_offer_recommendations_request->cofinance_price_filter);
        get_offer_recommendations_request->cofinance_price_filter = NULL;
    }
    if (get_offer_recommendations_request->recommended_cofinance_price_filter) {
        field_state_type_free(get_offer_recommendations_request->recommended_cofinance_price_filter);
        get_offer_recommendations_request->recommended_cofinance_price_filter = NULL;
    }
    if (get_offer_recommendations_request->competitiveness_filter) {
        price_competitiveness_type_free(get_offer_recommendations_request->competitiveness_filter);
        get_offer_recommendations_request->competitiveness_filter = NULL;
    }
    free(get_offer_recommendations_request);
}

cJSON *get_offer_recommendations_request_convertToJSON(get_offer_recommendations_request_t *get_offer_recommendations_request) {
    cJSON *item = cJSON_CreateObject();

    // get_offer_recommendations_request->offer_ids
    if(get_offer_recommendations_request->offer_ids) {
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, get_offer_recommendations_request->offer_ids) {
    if(cJSON_AddStringToObject(offer_ids, "", (char*)offer_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_offer_recommendations_request->cofinance_price_filter
    if(get_offer_recommendations_request->cofinance_price_filter != _api__get_offer_recommendations_request__NULL) {
    cJSON *cofinance_price_filter_local_JSON = field_state_type_convertToJSON(get_offer_recommendations_request->cofinance_price_filter);
    if(cofinance_price_filter_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "cofinancePriceFilter", cofinance_price_filter_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_offer_recommendations_request->recommended_cofinance_price_filter
    if(get_offer_recommendations_request->recommended_cofinance_price_filter != _api__get_offer_recommendations_request__NULL) {
    cJSON *recommended_cofinance_price_filter_local_JSON = field_state_type_convertToJSON(get_offer_recommendations_request->recommended_cofinance_price_filter);
    if(recommended_cofinance_price_filter_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "recommendedCofinancePriceFilter", recommended_cofinance_price_filter_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_offer_recommendations_request->competitiveness_filter
    if(get_offer_recommendations_request->competitiveness_filter != _api__get_offer_recommendations_request__NULL) {
    cJSON *competitiveness_filter_local_JSON = price_competitiveness_type_convertToJSON(get_offer_recommendations_request->competitiveness_filter);
    if(competitiveness_filter_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "competitivenessFilter", competitiveness_filter_local_JSON);
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

get_offer_recommendations_request_t *get_offer_recommendations_request_parseFromJSON(cJSON *get_offer_recommendations_requestJSON){

    get_offer_recommendations_request_t *get_offer_recommendations_request_local_var = NULL;

    // define the local list for get_offer_recommendations_request->offer_ids
    list_t *offer_idsList = NULL;

    // define the local variable for get_offer_recommendations_request->cofinance_price_filter
    field_state_type_t *cofinance_price_filter_local_nonprim = NULL;

    // define the local variable for get_offer_recommendations_request->recommended_cofinance_price_filter
    field_state_type_t *recommended_cofinance_price_filter_local_nonprim = NULL;

    // define the local variable for get_offer_recommendations_request->competitiveness_filter
    price_competitiveness_type_t *competitiveness_filter_local_nonprim = NULL;

    // get_offer_recommendations_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(get_offer_recommendations_requestJSON, "offerIds");
    if (offer_ids) { 
    cJSON *offer_ids_local = NULL;
    if(!cJSON_IsArray(offer_ids)) {
        goto end;//primitive container
    }
    offer_idsList = list_createList();

    cJSON_ArrayForEach(offer_ids_local, offer_ids)
    {
        if(!cJSON_IsString(offer_ids_local))
        {
            goto end;
        }
        list_addElement(offer_idsList , strdup(offer_ids_local->valuestring));
    }
    }

    // get_offer_recommendations_request->cofinance_price_filter
    cJSON *cofinance_price_filter = cJSON_GetObjectItemCaseSensitive(get_offer_recommendations_requestJSON, "cofinancePriceFilter");
    if (cofinance_price_filter) { 
    cofinance_price_filter_local_nonprim = field_state_type_parseFromJSON(cofinance_price_filter); //custom
    }

    // get_offer_recommendations_request->recommended_cofinance_price_filter
    cJSON *recommended_cofinance_price_filter = cJSON_GetObjectItemCaseSensitive(get_offer_recommendations_requestJSON, "recommendedCofinancePriceFilter");
    if (recommended_cofinance_price_filter) { 
    recommended_cofinance_price_filter_local_nonprim = field_state_type_parseFromJSON(recommended_cofinance_price_filter); //custom
    }

    // get_offer_recommendations_request->competitiveness_filter
    cJSON *competitiveness_filter = cJSON_GetObjectItemCaseSensitive(get_offer_recommendations_requestJSON, "competitivenessFilter");
    if (competitiveness_filter) { 
    competitiveness_filter_local_nonprim = price_competitiveness_type_parseFromJSON(competitiveness_filter); //custom
    }


    get_offer_recommendations_request_local_var = get_offer_recommendations_request_create (
        offer_ids ? offer_idsList : NULL,
        cofinance_price_filter ? cofinance_price_filter_local_nonprim : NULL,
        recommended_cofinance_price_filter ? recommended_cofinance_price_filter_local_nonprim : NULL,
        competitiveness_filter ? competitiveness_filter_local_nonprim : NULL
        );

    return get_offer_recommendations_request_local_var;
end:
    if (offer_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_idsList);
        offer_idsList = NULL;
    }
    if (cofinance_price_filter_local_nonprim) {
        field_state_type_free(cofinance_price_filter_local_nonprim);
        cofinance_price_filter_local_nonprim = NULL;
    }
    if (recommended_cofinance_price_filter_local_nonprim) {
        field_state_type_free(recommended_cofinance_price_filter_local_nonprim);
        recommended_cofinance_price_filter_local_nonprim = NULL;
    }
    if (competitiveness_filter_local_nonprim) {
        price_competitiveness_type_free(competitiveness_filter_local_nonprim);
        competitiveness_filter_local_nonprim = NULL;
    }
    return NULL;

}
