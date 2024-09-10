#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_recommendations_result_dto.h"



offer_recommendations_result_dto_t *offer_recommendations_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offer_recommendations
    ) {
    offer_recommendations_result_dto_t *offer_recommendations_result_dto_local_var = malloc(sizeof(offer_recommendations_result_dto_t));
    if (!offer_recommendations_result_dto_local_var) {
        return NULL;
    }
    offer_recommendations_result_dto_local_var->paging = paging;
    offer_recommendations_result_dto_local_var->offer_recommendations = offer_recommendations;

    return offer_recommendations_result_dto_local_var;
}


void offer_recommendations_result_dto_free(offer_recommendations_result_dto_t *offer_recommendations_result_dto) {
    if(NULL == offer_recommendations_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_recommendations_result_dto->paging) {
        scrolling_pager_dto_free(offer_recommendations_result_dto->paging);
        offer_recommendations_result_dto->paging = NULL;
    }
    if (offer_recommendations_result_dto->offer_recommendations) {
        list_ForEach(listEntry, offer_recommendations_result_dto->offer_recommendations) {
            offer_recommendation_dto_free(listEntry->data);
        }
        list_freeList(offer_recommendations_result_dto->offer_recommendations);
        offer_recommendations_result_dto->offer_recommendations = NULL;
    }
    free(offer_recommendations_result_dto);
}

cJSON *offer_recommendations_result_dto_convertToJSON(offer_recommendations_result_dto_t *offer_recommendations_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_recommendations_result_dto->paging
    if(offer_recommendations_result_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(offer_recommendations_result_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_recommendations_result_dto->offer_recommendations
    if (!offer_recommendations_result_dto->offer_recommendations) {
        goto fail;
    }
    cJSON *offer_recommendations = cJSON_AddArrayToObject(item, "offerRecommendations");
    if(offer_recommendations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offer_recommendationsListEntry;
    if (offer_recommendations_result_dto->offer_recommendations) {
    list_ForEach(offer_recommendationsListEntry, offer_recommendations_result_dto->offer_recommendations) {
    cJSON *itemLocal = offer_recommendation_dto_convertToJSON(offer_recommendationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offer_recommendations, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_recommendations_result_dto_t *offer_recommendations_result_dto_parseFromJSON(cJSON *offer_recommendations_result_dtoJSON){

    offer_recommendations_result_dto_t *offer_recommendations_result_dto_local_var = NULL;

    // define the local variable for offer_recommendations_result_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for offer_recommendations_result_dto->offer_recommendations
    list_t *offer_recommendationsList = NULL;

    // offer_recommendations_result_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(offer_recommendations_result_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // offer_recommendations_result_dto->offer_recommendations
    cJSON *offer_recommendations = cJSON_GetObjectItemCaseSensitive(offer_recommendations_result_dtoJSON, "offerRecommendations");
    if (!offer_recommendations) {
        goto end;
    }

    
    cJSON *offer_recommendations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offer_recommendations)){
        goto end; //nonprimitive container
    }

    offer_recommendationsList = list_createList();

    cJSON_ArrayForEach(offer_recommendations_local_nonprimitive,offer_recommendations )
    {
        if(!cJSON_IsObject(offer_recommendations_local_nonprimitive)){
            goto end;
        }
        offer_recommendation_dto_t *offer_recommendationsItem = offer_recommendation_dto_parseFromJSON(offer_recommendations_local_nonprimitive);

        list_addElement(offer_recommendationsList, offer_recommendationsItem);
    }


    offer_recommendations_result_dto_local_var = offer_recommendations_result_dto_create (
        paging ? paging_local_nonprim : NULL,
        offer_recommendationsList
        );

    return offer_recommendations_result_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (offer_recommendationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_recommendationsList) {
            offer_recommendation_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_recommendationsList);
        offer_recommendationsList = NULL;
    }
    return NULL;

}
