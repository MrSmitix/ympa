#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hidden_offer_dto.h"



hidden_offer_dto_t *hidden_offer_dto_create(
    char *offer_id
    ) {
    hidden_offer_dto_t *hidden_offer_dto_local_var = malloc(sizeof(hidden_offer_dto_t));
    if (!hidden_offer_dto_local_var) {
        return NULL;
    }
    hidden_offer_dto_local_var->offer_id = offer_id;

    return hidden_offer_dto_local_var;
}


void hidden_offer_dto_free(hidden_offer_dto_t *hidden_offer_dto) {
    if(NULL == hidden_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (hidden_offer_dto->offer_id) {
        free(hidden_offer_dto->offer_id);
        hidden_offer_dto->offer_id = NULL;
    }
    free(hidden_offer_dto);
}

cJSON *hidden_offer_dto_convertToJSON(hidden_offer_dto_t *hidden_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // hidden_offer_dto->offer_id
    if (!hidden_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", hidden_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

hidden_offer_dto_t *hidden_offer_dto_parseFromJSON(cJSON *hidden_offer_dtoJSON){

    hidden_offer_dto_t *hidden_offer_dto_local_var = NULL;

    // hidden_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(hidden_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }


    hidden_offer_dto_local_var = hidden_offer_dto_create (
        strdup(offer_id->valuestring)
        );

    return hidden_offer_dto_local_var;
end:
    return NULL;

}
