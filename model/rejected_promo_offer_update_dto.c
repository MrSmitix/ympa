#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "rejected_promo_offer_update_dto.h"


char* rejected_promo_offer_update_dto_reason_ToString(_api__rejected_promo_offer_update_dto__e reason) {
    char* reasonArray[] =  { "NULL", "OFFER_DOES_NOT_EXIST", "OFFER_DUPLICATION", "OFFER_NOT_ELIGIBLE_FOR_PROMO", "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED", "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED", "EMPTY_OLD_PRICE", "EMPTY_PROMO_PRICE", "MAX_PROMO_PRICE_EXCEEDED", "PROMO_PRICE_BIGGER_THAN_MAX", "PROMO_PRICE_SMALLER_THAN_MIN" };
    return reasonArray[reason];
}

_api__rejected_promo_offer_update_dto__e rejected_promo_offer_update_dto_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "OFFER_DOES_NOT_EXIST", "OFFER_DUPLICATION", "OFFER_NOT_ELIGIBLE_FOR_PROMO", "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED", "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED", "EMPTY_OLD_PRICE", "EMPTY_PROMO_PRICE", "MAX_PROMO_PRICE_EXCEEDED", "PROMO_PRICE_BIGGER_THAN_MAX", "PROMO_PRICE_SMALLER_THAN_MIN" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto_create(
    char *offer_id,
    rejected_promo_offer_update_reason_type_t *reason
    ) {
    rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto_local_var = malloc(sizeof(rejected_promo_offer_update_dto_t));
    if (!rejected_promo_offer_update_dto_local_var) {
        return NULL;
    }
    rejected_promo_offer_update_dto_local_var->offer_id = offer_id;
    rejected_promo_offer_update_dto_local_var->reason = reason;

    return rejected_promo_offer_update_dto_local_var;
}


void rejected_promo_offer_update_dto_free(rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto) {
    if(NULL == rejected_promo_offer_update_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (rejected_promo_offer_update_dto->offer_id) {
        free(rejected_promo_offer_update_dto->offer_id);
        rejected_promo_offer_update_dto->offer_id = NULL;
    }
    if (rejected_promo_offer_update_dto->reason) {
        rejected_promo_offer_update_reason_type_free(rejected_promo_offer_update_dto->reason);
        rejected_promo_offer_update_dto->reason = NULL;
    }
    free(rejected_promo_offer_update_dto);
}

cJSON *rejected_promo_offer_update_dto_convertToJSON(rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto) {
    cJSON *item = cJSON_CreateObject();

    // rejected_promo_offer_update_dto->offer_id
    if (!rejected_promo_offer_update_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", rejected_promo_offer_update_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // rejected_promo_offer_update_dto->reason
    if (_api__rejected_promo_offer_update_dto__NULL == rejected_promo_offer_update_dto->reason) {
        goto fail;
    }
    cJSON *reason_local_JSON = rejected_promo_offer_update_reason_type_convertToJSON(rejected_promo_offer_update_dto->reason);
    if(reason_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reason", reason_local_JSON);
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

rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto_parseFromJSON(cJSON *rejected_promo_offer_update_dtoJSON){

    rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto_local_var = NULL;

    // define the local variable for rejected_promo_offer_update_dto->reason
    rejected_promo_offer_update_reason_type_t *reason_local_nonprim = NULL;

    // rejected_promo_offer_update_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(rejected_promo_offer_update_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // rejected_promo_offer_update_dto->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(rejected_promo_offer_update_dtoJSON, "reason");
    if (!reason) {
        goto end;
    }

    
    reason_local_nonprim = rejected_promo_offer_update_reason_type_parseFromJSON(reason); //custom


    rejected_promo_offer_update_dto_local_var = rejected_promo_offer_update_dto_create (
        strdup(offer_id->valuestring),
        reason_local_nonprim
        );

    return rejected_promo_offer_update_dto_local_var;
end:
    if (reason_local_nonprim) {
        rejected_promo_offer_update_reason_type_free(reason_local_nonprim);
        reason_local_nonprim = NULL;
    }
    return NULL;

}
