#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_campaign_offer_dto.h"



base_campaign_offer_dto_t *base_campaign_offer_dto_create(
    char *offer_id,
    quantum_dto_t *quantum,
    int available
    ) {
    base_campaign_offer_dto_t *base_campaign_offer_dto_local_var = malloc(sizeof(base_campaign_offer_dto_t));
    if (!base_campaign_offer_dto_local_var) {
        return NULL;
    }
    base_campaign_offer_dto_local_var->offer_id = offer_id;
    base_campaign_offer_dto_local_var->quantum = quantum;
    base_campaign_offer_dto_local_var->available = available;

    return base_campaign_offer_dto_local_var;
}


void base_campaign_offer_dto_free(base_campaign_offer_dto_t *base_campaign_offer_dto) {
    if(NULL == base_campaign_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (base_campaign_offer_dto->offer_id) {
        free(base_campaign_offer_dto->offer_id);
        base_campaign_offer_dto->offer_id = NULL;
    }
    if (base_campaign_offer_dto->quantum) {
        quantum_dto_free(base_campaign_offer_dto->quantum);
        base_campaign_offer_dto->quantum = NULL;
    }
    free(base_campaign_offer_dto);
}

cJSON *base_campaign_offer_dto_convertToJSON(base_campaign_offer_dto_t *base_campaign_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // base_campaign_offer_dto->offer_id
    if (!base_campaign_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", base_campaign_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // base_campaign_offer_dto->quantum
    if(base_campaign_offer_dto->quantum) {
    cJSON *quantum_local_JSON = quantum_dto_convertToJSON(base_campaign_offer_dto->quantum);
    if(quantum_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quantum", quantum_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_campaign_offer_dto->available
    if(base_campaign_offer_dto->available) {
    if(cJSON_AddBoolToObject(item, "available", base_campaign_offer_dto->available) == NULL) {
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

base_campaign_offer_dto_t *base_campaign_offer_dto_parseFromJSON(cJSON *base_campaign_offer_dtoJSON){

    base_campaign_offer_dto_t *base_campaign_offer_dto_local_var = NULL;

    // define the local variable for base_campaign_offer_dto->quantum
    quantum_dto_t *quantum_local_nonprim = NULL;

    // base_campaign_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(base_campaign_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // base_campaign_offer_dto->quantum
    cJSON *quantum = cJSON_GetObjectItemCaseSensitive(base_campaign_offer_dtoJSON, "quantum");
    if (quantum) { 
    quantum_local_nonprim = quantum_dto_parseFromJSON(quantum); //nonprimitive
    }

    // base_campaign_offer_dto->available
    cJSON *available = cJSON_GetObjectItemCaseSensitive(base_campaign_offer_dtoJSON, "available");
    if (available) { 
    if(!cJSON_IsBool(available))
    {
    goto end; //Bool
    }
    }


    base_campaign_offer_dto_local_var = base_campaign_offer_dto_create (
        strdup(offer_id->valuestring),
        quantum ? quantum_local_nonprim : NULL,
        available ? available->valueint : 0
        );

    return base_campaign_offer_dto_local_var;
end:
    if (quantum_local_nonprim) {
        quantum_dto_free(quantum_local_nonprim);
        quantum_local_nonprim = NULL;
    }
    return NULL;

}
