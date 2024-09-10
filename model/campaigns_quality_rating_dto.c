#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaigns_quality_rating_dto.h"



campaigns_quality_rating_dto_t *campaigns_quality_rating_dto_create(
    list_t *campaign_ratings
    ) {
    campaigns_quality_rating_dto_t *campaigns_quality_rating_dto_local_var = malloc(sizeof(campaigns_quality_rating_dto_t));
    if (!campaigns_quality_rating_dto_local_var) {
        return NULL;
    }
    campaigns_quality_rating_dto_local_var->campaign_ratings = campaign_ratings;

    return campaigns_quality_rating_dto_local_var;
}


void campaigns_quality_rating_dto_free(campaigns_quality_rating_dto_t *campaigns_quality_rating_dto) {
    if(NULL == campaigns_quality_rating_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaigns_quality_rating_dto->campaign_ratings) {
        list_ForEach(listEntry, campaigns_quality_rating_dto->campaign_ratings) {
            campaign_quality_rating_dto_free(listEntry->data);
        }
        list_freeList(campaigns_quality_rating_dto->campaign_ratings);
        campaigns_quality_rating_dto->campaign_ratings = NULL;
    }
    free(campaigns_quality_rating_dto);
}

cJSON *campaigns_quality_rating_dto_convertToJSON(campaigns_quality_rating_dto_t *campaigns_quality_rating_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaigns_quality_rating_dto->campaign_ratings
    if (!campaigns_quality_rating_dto->campaign_ratings) {
        goto fail;
    }
    cJSON *campaign_ratings = cJSON_AddArrayToObject(item, "campaignRatings");
    if(campaign_ratings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaign_ratingsListEntry;
    if (campaigns_quality_rating_dto->campaign_ratings) {
    list_ForEach(campaign_ratingsListEntry, campaigns_quality_rating_dto->campaign_ratings) {
    cJSON *itemLocal = campaign_quality_rating_dto_convertToJSON(campaign_ratingsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaign_ratings, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaigns_quality_rating_dto_t *campaigns_quality_rating_dto_parseFromJSON(cJSON *campaigns_quality_rating_dtoJSON){

    campaigns_quality_rating_dto_t *campaigns_quality_rating_dto_local_var = NULL;

    // define the local list for campaigns_quality_rating_dto->campaign_ratings
    list_t *campaign_ratingsList = NULL;

    // campaigns_quality_rating_dto->campaign_ratings
    cJSON *campaign_ratings = cJSON_GetObjectItemCaseSensitive(campaigns_quality_rating_dtoJSON, "campaignRatings");
    if (!campaign_ratings) {
        goto end;
    }

    
    cJSON *campaign_ratings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(campaign_ratings)){
        goto end; //nonprimitive container
    }

    campaign_ratingsList = list_createList();

    cJSON_ArrayForEach(campaign_ratings_local_nonprimitive,campaign_ratings )
    {
        if(!cJSON_IsObject(campaign_ratings_local_nonprimitive)){
            goto end;
        }
        campaign_quality_rating_dto_t *campaign_ratingsItem = campaign_quality_rating_dto_parseFromJSON(campaign_ratings_local_nonprimitive);

        list_addElement(campaign_ratingsList, campaign_ratingsItem);
    }


    campaigns_quality_rating_dto_local_var = campaigns_quality_rating_dto_create (
        campaign_ratingsList
        );

    return campaigns_quality_rating_dto_local_var;
end:
    if (campaign_ratingsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_ratingsList) {
            campaign_quality_rating_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_ratingsList);
        campaign_ratingsList = NULL;
    }
    return NULL;

}
