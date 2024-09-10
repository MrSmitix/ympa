#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_auto_participating_details_dto.h"



promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto_create(
    list_t *campaign_ids
    ) {
    promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto_local_var = malloc(sizeof(promo_offer_auto_participating_details_dto_t));
    if (!promo_offer_auto_participating_details_dto_local_var) {
        return NULL;
    }
    promo_offer_auto_participating_details_dto_local_var->campaign_ids = campaign_ids;

    return promo_offer_auto_participating_details_dto_local_var;
}


void promo_offer_auto_participating_details_dto_free(promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto) {
    if(NULL == promo_offer_auto_participating_details_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (promo_offer_auto_participating_details_dto->campaign_ids) {
        list_ForEach(listEntry, promo_offer_auto_participating_details_dto->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(promo_offer_auto_participating_details_dto->campaign_ids);
        promo_offer_auto_participating_details_dto->campaign_ids = NULL;
    }
    free(promo_offer_auto_participating_details_dto);
}

cJSON *promo_offer_auto_participating_details_dto_convertToJSON(promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto) {
    cJSON *item = cJSON_CreateObject();

    // promo_offer_auto_participating_details_dto->campaign_ids
    if(promo_offer_auto_participating_details_dto->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaignIds");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, promo_offer_auto_participating_details_dto->campaign_ids) {
    if(cJSON_AddNumberToObject(campaign_ids, "", *(double *)campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto_parseFromJSON(cJSON *promo_offer_auto_participating_details_dtoJSON){

    promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto_local_var = NULL;

    // define the local list for promo_offer_auto_participating_details_dto->campaign_ids
    list_t *campaign_idsList = NULL;

    // promo_offer_auto_participating_details_dto->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(promo_offer_auto_participating_details_dtoJSON, "campaignIds");
    if (campaign_ids) { 
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsNumber(campaign_ids_local))
        {
            goto end;
        }
        double *campaign_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!campaign_ids_local_value)
        {
            goto end;
        }
        *campaign_ids_local_value = campaign_ids_local->valuedouble;
        list_addElement(campaign_idsList , campaign_ids_local_value);
    }
    }


    promo_offer_auto_participating_details_dto_local_var = promo_offer_auto_participating_details_dto_create (
        campaign_ids ? campaign_idsList : NULL
        );

    return promo_offer_auto_participating_details_dto_local_var;
end:
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    return NULL;

}
