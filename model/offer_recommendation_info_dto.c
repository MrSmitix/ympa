#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_recommendation_info_dto.h"



offer_recommendation_info_dto_t *offer_recommendation_info_dto_create(
    char *offer_id,
    base_price_dto_t *recommended_cofinance_price,
    price_competitiveness_thresholds_dto_t *competitiveness_thresholds
    ) {
    offer_recommendation_info_dto_t *offer_recommendation_info_dto_local_var = malloc(sizeof(offer_recommendation_info_dto_t));
    if (!offer_recommendation_info_dto_local_var) {
        return NULL;
    }
    offer_recommendation_info_dto_local_var->offer_id = offer_id;
    offer_recommendation_info_dto_local_var->recommended_cofinance_price = recommended_cofinance_price;
    offer_recommendation_info_dto_local_var->competitiveness_thresholds = competitiveness_thresholds;

    return offer_recommendation_info_dto_local_var;
}


void offer_recommendation_info_dto_free(offer_recommendation_info_dto_t *offer_recommendation_info_dto) {
    if(NULL == offer_recommendation_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_recommendation_info_dto->offer_id) {
        free(offer_recommendation_info_dto->offer_id);
        offer_recommendation_info_dto->offer_id = NULL;
    }
    if (offer_recommendation_info_dto->recommended_cofinance_price) {
        base_price_dto_free(offer_recommendation_info_dto->recommended_cofinance_price);
        offer_recommendation_info_dto->recommended_cofinance_price = NULL;
    }
    if (offer_recommendation_info_dto->competitiveness_thresholds) {
        price_competitiveness_thresholds_dto_free(offer_recommendation_info_dto->competitiveness_thresholds);
        offer_recommendation_info_dto->competitiveness_thresholds = NULL;
    }
    free(offer_recommendation_info_dto);
}

cJSON *offer_recommendation_info_dto_convertToJSON(offer_recommendation_info_dto_t *offer_recommendation_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_recommendation_info_dto->offer_id
    if(offer_recommendation_info_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", offer_recommendation_info_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // offer_recommendation_info_dto->recommended_cofinance_price
    if(offer_recommendation_info_dto->recommended_cofinance_price) {
    cJSON *recommended_cofinance_price_local_JSON = base_price_dto_convertToJSON(offer_recommendation_info_dto->recommended_cofinance_price);
    if(recommended_cofinance_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "recommendedCofinancePrice", recommended_cofinance_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_recommendation_info_dto->competitiveness_thresholds
    if(offer_recommendation_info_dto->competitiveness_thresholds) {
    cJSON *competitiveness_thresholds_local_JSON = price_competitiveness_thresholds_dto_convertToJSON(offer_recommendation_info_dto->competitiveness_thresholds);
    if(competitiveness_thresholds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "competitivenessThresholds", competitiveness_thresholds_local_JSON);
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

offer_recommendation_info_dto_t *offer_recommendation_info_dto_parseFromJSON(cJSON *offer_recommendation_info_dtoJSON){

    offer_recommendation_info_dto_t *offer_recommendation_info_dto_local_var = NULL;

    // define the local variable for offer_recommendation_info_dto->recommended_cofinance_price
    base_price_dto_t *recommended_cofinance_price_local_nonprim = NULL;

    // define the local variable for offer_recommendation_info_dto->competitiveness_thresholds
    price_competitiveness_thresholds_dto_t *competitiveness_thresholds_local_nonprim = NULL;

    // offer_recommendation_info_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(offer_recommendation_info_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // offer_recommendation_info_dto->recommended_cofinance_price
    cJSON *recommended_cofinance_price = cJSON_GetObjectItemCaseSensitive(offer_recommendation_info_dtoJSON, "recommendedCofinancePrice");
    if (recommended_cofinance_price) { 
    recommended_cofinance_price_local_nonprim = base_price_dto_parseFromJSON(recommended_cofinance_price); //nonprimitive
    }

    // offer_recommendation_info_dto->competitiveness_thresholds
    cJSON *competitiveness_thresholds = cJSON_GetObjectItemCaseSensitive(offer_recommendation_info_dtoJSON, "competitivenessThresholds");
    if (competitiveness_thresholds) { 
    competitiveness_thresholds_local_nonprim = price_competitiveness_thresholds_dto_parseFromJSON(competitiveness_thresholds); //nonprimitive
    }


    offer_recommendation_info_dto_local_var = offer_recommendation_info_dto_create (
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        recommended_cofinance_price ? recommended_cofinance_price_local_nonprim : NULL,
        competitiveness_thresholds ? competitiveness_thresholds_local_nonprim : NULL
        );

    return offer_recommendation_info_dto_local_var;
end:
    if (recommended_cofinance_price_local_nonprim) {
        base_price_dto_free(recommended_cofinance_price_local_nonprim);
        recommended_cofinance_price_local_nonprim = NULL;
    }
    if (competitiveness_thresholds_local_nonprim) {
        price_competitiveness_thresholds_dto_free(competitiveness_thresholds_local_nonprim);
        competitiveness_thresholds_local_nonprim = NULL;
    }
    return NULL;

}
