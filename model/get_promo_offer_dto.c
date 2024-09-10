#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_offer_dto.h"


char* get_promo_offer_dto_status_ToString(_api__get_promo_offer_dto__e status) {
    char* statusArray[] =  { "NULL", "AUTO", "PARTIALLY_AUTO", "MANUAL", "NOT_PARTICIPATING" };
    return statusArray[status];
}

_api__get_promo_offer_dto__e get_promo_offer_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "AUTO", "PARTIALLY_AUTO", "MANUAL", "NOT_PARTICIPATING" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_promo_offer_dto_t *get_promo_offer_dto_create(
    char *offer_id,
    promo_offer_participation_status_type_t *status,
    promo_offer_params_dto_t *params,
    promo_offer_auto_participating_details_dto_t *auto_participating_details
    ) {
    get_promo_offer_dto_t *get_promo_offer_dto_local_var = malloc(sizeof(get_promo_offer_dto_t));
    if (!get_promo_offer_dto_local_var) {
        return NULL;
    }
    get_promo_offer_dto_local_var->offer_id = offer_id;
    get_promo_offer_dto_local_var->status = status;
    get_promo_offer_dto_local_var->params = params;
    get_promo_offer_dto_local_var->auto_participating_details = auto_participating_details;

    return get_promo_offer_dto_local_var;
}


void get_promo_offer_dto_free(get_promo_offer_dto_t *get_promo_offer_dto) {
    if(NULL == get_promo_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_offer_dto->offer_id) {
        free(get_promo_offer_dto->offer_id);
        get_promo_offer_dto->offer_id = NULL;
    }
    if (get_promo_offer_dto->status) {
        promo_offer_participation_status_type_free(get_promo_offer_dto->status);
        get_promo_offer_dto->status = NULL;
    }
    if (get_promo_offer_dto->params) {
        promo_offer_params_dto_free(get_promo_offer_dto->params);
        get_promo_offer_dto->params = NULL;
    }
    if (get_promo_offer_dto->auto_participating_details) {
        promo_offer_auto_participating_details_dto_free(get_promo_offer_dto->auto_participating_details);
        get_promo_offer_dto->auto_participating_details = NULL;
    }
    free(get_promo_offer_dto);
}

cJSON *get_promo_offer_dto_convertToJSON(get_promo_offer_dto_t *get_promo_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_offer_dto->offer_id
    if (!get_promo_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", get_promo_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // get_promo_offer_dto->status
    if (_api__get_promo_offer_dto__NULL == get_promo_offer_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = promo_offer_participation_status_type_convertToJSON(get_promo_offer_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // get_promo_offer_dto->params
    if (!get_promo_offer_dto->params) {
        goto fail;
    }
    cJSON *params_local_JSON = promo_offer_params_dto_convertToJSON(get_promo_offer_dto->params);
    if(params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "params", params_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // get_promo_offer_dto->auto_participating_details
    if(get_promo_offer_dto->auto_participating_details) {
    cJSON *auto_participating_details_local_JSON = promo_offer_auto_participating_details_dto_convertToJSON(get_promo_offer_dto->auto_participating_details);
    if(auto_participating_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "autoParticipatingDetails", auto_participating_details_local_JSON);
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

get_promo_offer_dto_t *get_promo_offer_dto_parseFromJSON(cJSON *get_promo_offer_dtoJSON){

    get_promo_offer_dto_t *get_promo_offer_dto_local_var = NULL;

    // define the local variable for get_promo_offer_dto->status
    promo_offer_participation_status_type_t *status_local_nonprim = NULL;

    // define the local variable for get_promo_offer_dto->params
    promo_offer_params_dto_t *params_local_nonprim = NULL;

    // define the local variable for get_promo_offer_dto->auto_participating_details
    promo_offer_auto_participating_details_dto_t *auto_participating_details_local_nonprim = NULL;

    // get_promo_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(get_promo_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // get_promo_offer_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_promo_offer_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = promo_offer_participation_status_type_parseFromJSON(status); //custom

    // get_promo_offer_dto->params
    cJSON *params = cJSON_GetObjectItemCaseSensitive(get_promo_offer_dtoJSON, "params");
    if (!params) {
        goto end;
    }

    
    params_local_nonprim = promo_offer_params_dto_parseFromJSON(params); //nonprimitive

    // get_promo_offer_dto->auto_participating_details
    cJSON *auto_participating_details = cJSON_GetObjectItemCaseSensitive(get_promo_offer_dtoJSON, "autoParticipatingDetails");
    if (auto_participating_details) { 
    auto_participating_details_local_nonprim = promo_offer_auto_participating_details_dto_parseFromJSON(auto_participating_details); //nonprimitive
    }


    get_promo_offer_dto_local_var = get_promo_offer_dto_create (
        strdup(offer_id->valuestring),
        status_local_nonprim,
        params_local_nonprim,
        auto_participating_details ? auto_participating_details_local_nonprim : NULL
        );

    return get_promo_offer_dto_local_var;
end:
    if (status_local_nonprim) {
        promo_offer_participation_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (params_local_nonprim) {
        promo_offer_params_dto_free(params_local_nonprim);
        params_local_nonprim = NULL;
    }
    if (auto_participating_details_local_nonprim) {
        promo_offer_auto_participating_details_dto_free(auto_participating_details_local_nonprim);
        auto_participating_details_local_nonprim = NULL;
    }
    return NULL;

}
