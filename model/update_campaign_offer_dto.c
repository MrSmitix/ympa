#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_campaign_offer_dto.h"



update_campaign_offer_dto_t *update_campaign_offer_dto_create(
    char *offer_id,
    quantum_dto_t *quantum,
    int available,
    int vat
    ) {
    update_campaign_offer_dto_t *update_campaign_offer_dto_local_var = malloc(sizeof(update_campaign_offer_dto_t));
    if (!update_campaign_offer_dto_local_var) {
        return NULL;
    }
    update_campaign_offer_dto_local_var->offer_id = offer_id;
    update_campaign_offer_dto_local_var->quantum = quantum;
    update_campaign_offer_dto_local_var->available = available;
    update_campaign_offer_dto_local_var->vat = vat;

    return update_campaign_offer_dto_local_var;
}


void update_campaign_offer_dto_free(update_campaign_offer_dto_t *update_campaign_offer_dto) {
    if(NULL == update_campaign_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_campaign_offer_dto->offer_id) {
        free(update_campaign_offer_dto->offer_id);
        update_campaign_offer_dto->offer_id = NULL;
    }
    if (update_campaign_offer_dto->quantum) {
        quantum_dto_free(update_campaign_offer_dto->quantum);
        update_campaign_offer_dto->quantum = NULL;
    }
    free(update_campaign_offer_dto);
}

cJSON *update_campaign_offer_dto_convertToJSON(update_campaign_offer_dto_t *update_campaign_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_campaign_offer_dto->offer_id
    if (!update_campaign_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", update_campaign_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // update_campaign_offer_dto->quantum
    if(update_campaign_offer_dto->quantum) {
    cJSON *quantum_local_JSON = quantum_dto_convertToJSON(update_campaign_offer_dto->quantum);
    if(quantum_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quantum", quantum_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_campaign_offer_dto->available
    if(update_campaign_offer_dto->available) {
    if(cJSON_AddBoolToObject(item, "available", update_campaign_offer_dto->available) == NULL) {
    goto fail; //Bool
    }
    }


    // update_campaign_offer_dto->vat
    if(update_campaign_offer_dto->vat) {
    if(cJSON_AddNumberToObject(item, "vat", update_campaign_offer_dto->vat) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_campaign_offer_dto_t *update_campaign_offer_dto_parseFromJSON(cJSON *update_campaign_offer_dtoJSON){

    update_campaign_offer_dto_t *update_campaign_offer_dto_local_var = NULL;

    // define the local variable for update_campaign_offer_dto->quantum
    quantum_dto_t *quantum_local_nonprim = NULL;

    // update_campaign_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(update_campaign_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // update_campaign_offer_dto->quantum
    cJSON *quantum = cJSON_GetObjectItemCaseSensitive(update_campaign_offer_dtoJSON, "quantum");
    if (quantum) { 
    quantum_local_nonprim = quantum_dto_parseFromJSON(quantum); //nonprimitive
    }

    // update_campaign_offer_dto->available
    cJSON *available = cJSON_GetObjectItemCaseSensitive(update_campaign_offer_dtoJSON, "available");
    if (available) { 
    if(!cJSON_IsBool(available))
    {
    goto end; //Bool
    }
    }

    // update_campaign_offer_dto->vat
    cJSON *vat = cJSON_GetObjectItemCaseSensitive(update_campaign_offer_dtoJSON, "vat");
    if (vat) { 
    if(!cJSON_IsNumber(vat))
    {
    goto end; //Numeric
    }
    }


    update_campaign_offer_dto_local_var = update_campaign_offer_dto_create (
        strdup(offer_id->valuestring),
        quantum ? quantum_local_nonprim : NULL,
        available ? available->valueint : 0,
        vat ? vat->valuedouble : 0
        );

    return update_campaign_offer_dto_local_var;
end:
    if (quantum_local_nonprim) {
        quantum_dto_free(quantum_local_nonprim);
        quantum_local_nonprim = NULL;
    }
    return NULL;

}
