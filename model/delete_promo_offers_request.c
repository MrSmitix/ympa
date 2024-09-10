#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_promo_offers_request.h"



delete_promo_offers_request_t *delete_promo_offers_request_create(
    char *promo_id,
    int delete_all_offers,
    list_t *offer_ids
    ) {
    delete_promo_offers_request_t *delete_promo_offers_request_local_var = malloc(sizeof(delete_promo_offers_request_t));
    if (!delete_promo_offers_request_local_var) {
        return NULL;
    }
    delete_promo_offers_request_local_var->promo_id = promo_id;
    delete_promo_offers_request_local_var->delete_all_offers = delete_all_offers;
    delete_promo_offers_request_local_var->offer_ids = offer_ids;

    return delete_promo_offers_request_local_var;
}


void delete_promo_offers_request_free(delete_promo_offers_request_t *delete_promo_offers_request) {
    if(NULL == delete_promo_offers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_promo_offers_request->promo_id) {
        free(delete_promo_offers_request->promo_id);
        delete_promo_offers_request->promo_id = NULL;
    }
    if (delete_promo_offers_request->offer_ids) {
        list_ForEach(listEntry, delete_promo_offers_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(delete_promo_offers_request->offer_ids);
        delete_promo_offers_request->offer_ids = NULL;
    }
    free(delete_promo_offers_request);
}

cJSON *delete_promo_offers_request_convertToJSON(delete_promo_offers_request_t *delete_promo_offers_request) {
    cJSON *item = cJSON_CreateObject();

    // delete_promo_offers_request->promo_id
    if (!delete_promo_offers_request->promo_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "promoId", delete_promo_offers_request->promo_id) == NULL) {
    goto fail; //String
    }


    // delete_promo_offers_request->delete_all_offers
    if(delete_promo_offers_request->delete_all_offers) {
    if(cJSON_AddBoolToObject(item, "deleteAllOffers", delete_promo_offers_request->delete_all_offers) == NULL) {
    goto fail; //Bool
    }
    }


    // delete_promo_offers_request->offer_ids
    if(delete_promo_offers_request->offer_ids) {
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, delete_promo_offers_request->offer_ids) {
    if(cJSON_AddStringToObject(offer_ids, "", (char*)offer_idsListEntry->data) == NULL)
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

delete_promo_offers_request_t *delete_promo_offers_request_parseFromJSON(cJSON *delete_promo_offers_requestJSON){

    delete_promo_offers_request_t *delete_promo_offers_request_local_var = NULL;

    // define the local list for delete_promo_offers_request->offer_ids
    list_t *offer_idsList = NULL;

    // delete_promo_offers_request->promo_id
    cJSON *promo_id = cJSON_GetObjectItemCaseSensitive(delete_promo_offers_requestJSON, "promoId");
    if (!promo_id) {
        goto end;
    }

    
    if(!cJSON_IsString(promo_id))
    {
    goto end; //String
    }

    // delete_promo_offers_request->delete_all_offers
    cJSON *delete_all_offers = cJSON_GetObjectItemCaseSensitive(delete_promo_offers_requestJSON, "deleteAllOffers");
    if (delete_all_offers) { 
    if(!cJSON_IsBool(delete_all_offers))
    {
    goto end; //Bool
    }
    }

    // delete_promo_offers_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(delete_promo_offers_requestJSON, "offerIds");
    if (offer_ids) { 
    cJSON *offer_ids_local = NULL;
    if(!cJSON_IsArray(offer_ids)) {
        goto end;//primitive container
    }
    offer_idsList = list_createList();

    cJSON_ArrayForEach(offer_ids_local, offer_ids)
    {
        if(!cJSON_IsString(offer_ids_local))
        {
            goto end;
        }
        list_addElement(offer_idsList , strdup(offer_ids_local->valuestring));
    }
    }


    delete_promo_offers_request_local_var = delete_promo_offers_request_create (
        strdup(promo_id->valuestring),
        delete_all_offers ? delete_all_offers->valueint : 0,
        offer_ids ? offer_idsList : NULL
        );

    return delete_promo_offers_request_local_var;
end:
    if (offer_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_idsList);
        offer_idsList = NULL;
    }
    return NULL;

}
