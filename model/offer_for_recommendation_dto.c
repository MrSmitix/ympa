#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_for_recommendation_dto.h"


char* offer_for_recommendation_dto_competitiveness_ToString(_api__offer_for_recommendation_dto__e competitiveness) {
    char* competitivenessArray[] =  { "NULL", "OPTIMAL", "AVERAGE", "LOW" };
    return competitivenessArray[competitiveness];
}

_api__offer_for_recommendation_dto__e offer_for_recommendation_dto_competitiveness_FromString(char* competitiveness){
    int stringToReturn = 0;
    char *competitivenessArray[] =  { "NULL", "OPTIMAL", "AVERAGE", "LOW" };
    size_t sizeofArray = sizeof(competitivenessArray) / sizeof(competitivenessArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(competitiveness, competitivenessArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_for_recommendation_dto_t *offer_for_recommendation_dto_create(
    char *offer_id,
    base_price_dto_t *price,
    get_price_dto_t *cofinance_price,
    price_competitiveness_type_t *competitiveness,
    long shows
    ) {
    offer_for_recommendation_dto_t *offer_for_recommendation_dto_local_var = malloc(sizeof(offer_for_recommendation_dto_t));
    if (!offer_for_recommendation_dto_local_var) {
        return NULL;
    }
    offer_for_recommendation_dto_local_var->offer_id = offer_id;
    offer_for_recommendation_dto_local_var->price = price;
    offer_for_recommendation_dto_local_var->cofinance_price = cofinance_price;
    offer_for_recommendation_dto_local_var->competitiveness = competitiveness;
    offer_for_recommendation_dto_local_var->shows = shows;

    return offer_for_recommendation_dto_local_var;
}


void offer_for_recommendation_dto_free(offer_for_recommendation_dto_t *offer_for_recommendation_dto) {
    if(NULL == offer_for_recommendation_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_for_recommendation_dto->offer_id) {
        free(offer_for_recommendation_dto->offer_id);
        offer_for_recommendation_dto->offer_id = NULL;
    }
    if (offer_for_recommendation_dto->price) {
        base_price_dto_free(offer_for_recommendation_dto->price);
        offer_for_recommendation_dto->price = NULL;
    }
    if (offer_for_recommendation_dto->cofinance_price) {
        get_price_dto_free(offer_for_recommendation_dto->cofinance_price);
        offer_for_recommendation_dto->cofinance_price = NULL;
    }
    if (offer_for_recommendation_dto->competitiveness) {
        price_competitiveness_type_free(offer_for_recommendation_dto->competitiveness);
        offer_for_recommendation_dto->competitiveness = NULL;
    }
    free(offer_for_recommendation_dto);
}

cJSON *offer_for_recommendation_dto_convertToJSON(offer_for_recommendation_dto_t *offer_for_recommendation_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_for_recommendation_dto->offer_id
    if(offer_for_recommendation_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", offer_for_recommendation_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // offer_for_recommendation_dto->price
    if(offer_for_recommendation_dto->price) {
    cJSON *price_local_JSON = base_price_dto_convertToJSON(offer_for_recommendation_dto->price);
    if(price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "price", price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_for_recommendation_dto->cofinance_price
    if(offer_for_recommendation_dto->cofinance_price) {
    cJSON *cofinance_price_local_JSON = get_price_dto_convertToJSON(offer_for_recommendation_dto->cofinance_price);
    if(cofinance_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cofinancePrice", cofinance_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_for_recommendation_dto->competitiveness
    if(offer_for_recommendation_dto->competitiveness != _api__offer_for_recommendation_dto__NULL) {
    cJSON *competitiveness_local_JSON = price_competitiveness_type_convertToJSON(offer_for_recommendation_dto->competitiveness);
    if(competitiveness_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "competitiveness", competitiveness_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_for_recommendation_dto->shows
    if(offer_for_recommendation_dto->shows) {
    if(cJSON_AddNumberToObject(item, "shows", offer_for_recommendation_dto->shows) == NULL) {
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

offer_for_recommendation_dto_t *offer_for_recommendation_dto_parseFromJSON(cJSON *offer_for_recommendation_dtoJSON){

    offer_for_recommendation_dto_t *offer_for_recommendation_dto_local_var = NULL;

    // define the local variable for offer_for_recommendation_dto->price
    base_price_dto_t *price_local_nonprim = NULL;

    // define the local variable for offer_for_recommendation_dto->cofinance_price
    get_price_dto_t *cofinance_price_local_nonprim = NULL;

    // define the local variable for offer_for_recommendation_dto->competitiveness
    price_competitiveness_type_t *competitiveness_local_nonprim = NULL;

    // offer_for_recommendation_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(offer_for_recommendation_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // offer_for_recommendation_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(offer_for_recommendation_dtoJSON, "price");
    if (price) { 
    price_local_nonprim = base_price_dto_parseFromJSON(price); //nonprimitive
    }

    // offer_for_recommendation_dto->cofinance_price
    cJSON *cofinance_price = cJSON_GetObjectItemCaseSensitive(offer_for_recommendation_dtoJSON, "cofinancePrice");
    if (cofinance_price) { 
    cofinance_price_local_nonprim = get_price_dto_parseFromJSON(cofinance_price); //nonprimitive
    }

    // offer_for_recommendation_dto->competitiveness
    cJSON *competitiveness = cJSON_GetObjectItemCaseSensitive(offer_for_recommendation_dtoJSON, "competitiveness");
    if (competitiveness) { 
    competitiveness_local_nonprim = price_competitiveness_type_parseFromJSON(competitiveness); //custom
    }

    // offer_for_recommendation_dto->shows
    cJSON *shows = cJSON_GetObjectItemCaseSensitive(offer_for_recommendation_dtoJSON, "shows");
    if (shows) { 
    if(!cJSON_IsNumber(shows))
    {
    goto end; //Numeric
    }
    }


    offer_for_recommendation_dto_local_var = offer_for_recommendation_dto_create (
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        price ? price_local_nonprim : NULL,
        cofinance_price ? cofinance_price_local_nonprim : NULL,
        competitiveness ? competitiveness_local_nonprim : NULL,
        shows ? shows->valuedouble : 0
        );

    return offer_for_recommendation_dto_local_var;
end:
    if (price_local_nonprim) {
        base_price_dto_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    if (cofinance_price_local_nonprim) {
        get_price_dto_free(cofinance_price_local_nonprim);
        cofinance_price_local_nonprim = NULL;
    }
    if (competitiveness_local_nonprim) {
        price_competitiveness_type_free(competitiveness_local_nonprim);
        competitiveness_local_nonprim = NULL;
    }
    return NULL;

}
