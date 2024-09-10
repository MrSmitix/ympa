#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_recommendation_dto.h"



offer_recommendation_dto_t *offer_recommendation_dto_create(
    offer_for_recommendation_dto_t *offer,
    offer_recommendation_info_dto_t *recommendation
    ) {
    offer_recommendation_dto_t *offer_recommendation_dto_local_var = malloc(sizeof(offer_recommendation_dto_t));
    if (!offer_recommendation_dto_local_var) {
        return NULL;
    }
    offer_recommendation_dto_local_var->offer = offer;
    offer_recommendation_dto_local_var->recommendation = recommendation;

    return offer_recommendation_dto_local_var;
}


void offer_recommendation_dto_free(offer_recommendation_dto_t *offer_recommendation_dto) {
    if(NULL == offer_recommendation_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_recommendation_dto->offer) {
        offer_for_recommendation_dto_free(offer_recommendation_dto->offer);
        offer_recommendation_dto->offer = NULL;
    }
    if (offer_recommendation_dto->recommendation) {
        offer_recommendation_info_dto_free(offer_recommendation_dto->recommendation);
        offer_recommendation_dto->recommendation = NULL;
    }
    free(offer_recommendation_dto);
}

cJSON *offer_recommendation_dto_convertToJSON(offer_recommendation_dto_t *offer_recommendation_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_recommendation_dto->offer
    if(offer_recommendation_dto->offer) {
    cJSON *offer_local_JSON = offer_for_recommendation_dto_convertToJSON(offer_recommendation_dto->offer);
    if(offer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offer", offer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_recommendation_dto->recommendation
    if(offer_recommendation_dto->recommendation) {
    cJSON *recommendation_local_JSON = offer_recommendation_info_dto_convertToJSON(offer_recommendation_dto->recommendation);
    if(recommendation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "recommendation", recommendation_local_JSON);
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

offer_recommendation_dto_t *offer_recommendation_dto_parseFromJSON(cJSON *offer_recommendation_dtoJSON){

    offer_recommendation_dto_t *offer_recommendation_dto_local_var = NULL;

    // define the local variable for offer_recommendation_dto->offer
    offer_for_recommendation_dto_t *offer_local_nonprim = NULL;

    // define the local variable for offer_recommendation_dto->recommendation
    offer_recommendation_info_dto_t *recommendation_local_nonprim = NULL;

    // offer_recommendation_dto->offer
    cJSON *offer = cJSON_GetObjectItemCaseSensitive(offer_recommendation_dtoJSON, "offer");
    if (offer) { 
    offer_local_nonprim = offer_for_recommendation_dto_parseFromJSON(offer); //nonprimitive
    }

    // offer_recommendation_dto->recommendation
    cJSON *recommendation = cJSON_GetObjectItemCaseSensitive(offer_recommendation_dtoJSON, "recommendation");
    if (recommendation) { 
    recommendation_local_nonprim = offer_recommendation_info_dto_parseFromJSON(recommendation); //nonprimitive
    }


    offer_recommendation_dto_local_var = offer_recommendation_dto_create (
        offer ? offer_local_nonprim : NULL,
        recommendation ? recommendation_local_nonprim : NULL
        );

    return offer_recommendation_dto_local_var;
end:
    if (offer_local_nonprim) {
        offer_for_recommendation_dto_free(offer_local_nonprim);
        offer_local_nonprim = NULL;
    }
    if (recommendation_local_nonprim) {
        offer_recommendation_info_dto_free(recommendation_local_nonprim);
        recommendation_local_nonprim = NULL;
    }
    return NULL;

}
