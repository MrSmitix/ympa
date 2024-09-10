#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_offers_request.h"


char* get_promo_offers_request_status_type_ToString(_api__get_promo_offers_request__e status_type) {
    char* status_typeArray[] =  { "NULL", "MANUALLY_ADDED", "NOT_MANUALLY_ADDED" };
    return status_typeArray[status_type];
}

_api__get_promo_offers_request__e get_promo_offers_request_status_type_FromString(char* status_type){
    int stringToReturn = 0;
    char *status_typeArray[] =  { "NULL", "MANUALLY_ADDED", "NOT_MANUALLY_ADDED" };
    size_t sizeofArray = sizeof(status_typeArray) / sizeof(status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status_type, status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_promo_offers_request_t *get_promo_offers_request_create(
    char *promo_id,
    promo_offer_participation_status_filter_type_t *status_type
    ) {
    get_promo_offers_request_t *get_promo_offers_request_local_var = malloc(sizeof(get_promo_offers_request_t));
    if (!get_promo_offers_request_local_var) {
        return NULL;
    }
    get_promo_offers_request_local_var->promo_id = promo_id;
    get_promo_offers_request_local_var->status_type = status_type;

    return get_promo_offers_request_local_var;
}


void get_promo_offers_request_free(get_promo_offers_request_t *get_promo_offers_request) {
    if(NULL == get_promo_offers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_offers_request->promo_id) {
        free(get_promo_offers_request->promo_id);
        get_promo_offers_request->promo_id = NULL;
    }
    if (get_promo_offers_request->status_type) {
        promo_offer_participation_status_filter_type_free(get_promo_offers_request->status_type);
        get_promo_offers_request->status_type = NULL;
    }
    free(get_promo_offers_request);
}

cJSON *get_promo_offers_request_convertToJSON(get_promo_offers_request_t *get_promo_offers_request) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_offers_request->promo_id
    if (!get_promo_offers_request->promo_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "promoId", get_promo_offers_request->promo_id) == NULL) {
    goto fail; //String
    }


    // get_promo_offers_request->status_type
    if(get_promo_offers_request->status_type != _api__get_promo_offers_request__NULL) {
    cJSON *status_type_local_JSON = promo_offer_participation_status_filter_type_convertToJSON(get_promo_offers_request->status_type);
    if(status_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "statusType", status_type_local_JSON);
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

get_promo_offers_request_t *get_promo_offers_request_parseFromJSON(cJSON *get_promo_offers_requestJSON){

    get_promo_offers_request_t *get_promo_offers_request_local_var = NULL;

    // define the local variable for get_promo_offers_request->status_type
    promo_offer_participation_status_filter_type_t *status_type_local_nonprim = NULL;

    // get_promo_offers_request->promo_id
    cJSON *promo_id = cJSON_GetObjectItemCaseSensitive(get_promo_offers_requestJSON, "promoId");
    if (!promo_id) {
        goto end;
    }

    
    if(!cJSON_IsString(promo_id))
    {
    goto end; //String
    }

    // get_promo_offers_request->status_type
    cJSON *status_type = cJSON_GetObjectItemCaseSensitive(get_promo_offers_requestJSON, "statusType");
    if (status_type) { 
    status_type_local_nonprim = promo_offer_participation_status_filter_type_parseFromJSON(status_type); //custom
    }


    get_promo_offers_request_local_var = get_promo_offers_request_create (
        strdup(promo_id->valuestring),
        status_type ? status_type_local_nonprim : NULL
        );

    return get_promo_offers_request_local_var;
end:
    if (status_type_local_nonprim) {
        promo_offer_participation_status_filter_type_free(status_type_local_nonprim);
        status_type_local_nonprim = NULL;
    }
    return NULL;

}
