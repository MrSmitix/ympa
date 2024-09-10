#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_campaign_status_dto.h"


char* offer_campaign_status_dto_status_ToString(_api__offer_campaign_status_dto__e status) {
    char* statusArray[] =  { "NULL", "PUBLISHED", "CHECKING", "DISABLED_BY_PARTNER", "DISABLED_AUTOMATICALLY", "REJECTED_BY_MARKET", "CREATING_CARD", "NO_CARD", "NO_STOCKS", "ARCHIVED" };
    return statusArray[status];
}

_api__offer_campaign_status_dto__e offer_campaign_status_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PUBLISHED", "CHECKING", "DISABLED_BY_PARTNER", "DISABLED_AUTOMATICALLY", "REJECTED_BY_MARKET", "CREATING_CARD", "NO_CARD", "NO_STOCKS", "ARCHIVED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_campaign_status_dto_t *offer_campaign_status_dto_create(
    long campaign_id,
    offer_campaign_status_type_t *status
    ) {
    offer_campaign_status_dto_t *offer_campaign_status_dto_local_var = malloc(sizeof(offer_campaign_status_dto_t));
    if (!offer_campaign_status_dto_local_var) {
        return NULL;
    }
    offer_campaign_status_dto_local_var->campaign_id = campaign_id;
    offer_campaign_status_dto_local_var->status = status;

    return offer_campaign_status_dto_local_var;
}


void offer_campaign_status_dto_free(offer_campaign_status_dto_t *offer_campaign_status_dto) {
    if(NULL == offer_campaign_status_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_campaign_status_dto->status) {
        offer_campaign_status_type_free(offer_campaign_status_dto->status);
        offer_campaign_status_dto->status = NULL;
    }
    free(offer_campaign_status_dto);
}

cJSON *offer_campaign_status_dto_convertToJSON(offer_campaign_status_dto_t *offer_campaign_status_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_campaign_status_dto->campaign_id
    if (!offer_campaign_status_dto->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", offer_campaign_status_dto->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // offer_campaign_status_dto->status
    if (_api__offer_campaign_status_dto__NULL == offer_campaign_status_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = offer_campaign_status_type_convertToJSON(offer_campaign_status_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_campaign_status_dto_t *offer_campaign_status_dto_parseFromJSON(cJSON *offer_campaign_status_dtoJSON){

    offer_campaign_status_dto_t *offer_campaign_status_dto_local_var = NULL;

    // define the local variable for offer_campaign_status_dto->status
    offer_campaign_status_type_t *status_local_nonprim = NULL;

    // offer_campaign_status_dto->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(offer_campaign_status_dtoJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // offer_campaign_status_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(offer_campaign_status_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = offer_campaign_status_type_parseFromJSON(status); //custom


    offer_campaign_status_dto_local_var = offer_campaign_status_dto_create (
        campaign_id->valuedouble,
        status_local_nonprim
        );

    return offer_campaign_status_dto_local_var;
end:
    if (status_local_nonprim) {
        offer_campaign_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
