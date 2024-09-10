#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "enriched_model_dto.h"



enriched_model_dto_t *enriched_model_dto_create(
    long id,
    char *name,
    model_price_dto_t *prices,
    list_t *offers,
    int offline_offers,
    int online_offers
    ) {
    enriched_model_dto_t *enriched_model_dto_local_var = malloc(sizeof(enriched_model_dto_t));
    if (!enriched_model_dto_local_var) {
        return NULL;
    }
    enriched_model_dto_local_var->id = id;
    enriched_model_dto_local_var->name = name;
    enriched_model_dto_local_var->prices = prices;
    enriched_model_dto_local_var->offers = offers;
    enriched_model_dto_local_var->offline_offers = offline_offers;
    enriched_model_dto_local_var->online_offers = online_offers;

    return enriched_model_dto_local_var;
}


void enriched_model_dto_free(enriched_model_dto_t *enriched_model_dto) {
    if(NULL == enriched_model_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (enriched_model_dto->name) {
        free(enriched_model_dto->name);
        enriched_model_dto->name = NULL;
    }
    if (enriched_model_dto->prices) {
        model_price_dto_free(enriched_model_dto->prices);
        enriched_model_dto->prices = NULL;
    }
    if (enriched_model_dto->offers) {
        list_ForEach(listEntry, enriched_model_dto->offers) {
            model_offer_dto_free(listEntry->data);
        }
        list_freeList(enriched_model_dto->offers);
        enriched_model_dto->offers = NULL;
    }
    free(enriched_model_dto);
}

cJSON *enriched_model_dto_convertToJSON(enriched_model_dto_t *enriched_model_dto) {
    cJSON *item = cJSON_CreateObject();

    // enriched_model_dto->id
    if(enriched_model_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", enriched_model_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // enriched_model_dto->name
    if(enriched_model_dto->name) {
    if(cJSON_AddStringToObject(item, "name", enriched_model_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // enriched_model_dto->prices
    if(enriched_model_dto->prices) {
    cJSON *prices_local_JSON = model_price_dto_convertToJSON(enriched_model_dto->prices);
    if(prices_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prices", prices_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // enriched_model_dto->offers
    if(enriched_model_dto->offers) {
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (enriched_model_dto->offers) {
    list_ForEach(offersListEntry, enriched_model_dto->offers) {
    cJSON *itemLocal = model_offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }
    }


    // enriched_model_dto->offline_offers
    if(enriched_model_dto->offline_offers) {
    if(cJSON_AddNumberToObject(item, "offlineOffers", enriched_model_dto->offline_offers) == NULL) {
    goto fail; //Numeric
    }
    }


    // enriched_model_dto->online_offers
    if(enriched_model_dto->online_offers) {
    if(cJSON_AddNumberToObject(item, "onlineOffers", enriched_model_dto->online_offers) == NULL) {
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

enriched_model_dto_t *enriched_model_dto_parseFromJSON(cJSON *enriched_model_dtoJSON){

    enriched_model_dto_t *enriched_model_dto_local_var = NULL;

    // define the local variable for enriched_model_dto->prices
    model_price_dto_t *prices_local_nonprim = NULL;

    // define the local list for enriched_model_dto->offers
    list_t *offersList = NULL;

    // enriched_model_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(enriched_model_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // enriched_model_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(enriched_model_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // enriched_model_dto->prices
    cJSON *prices = cJSON_GetObjectItemCaseSensitive(enriched_model_dtoJSON, "prices");
    if (prices) { 
    prices_local_nonprim = model_price_dto_parseFromJSON(prices); //nonprimitive
    }

    // enriched_model_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(enriched_model_dtoJSON, "offers");
    if (offers) { 
    cJSON *offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offers)){
        goto end; //nonprimitive container
    }

    offersList = list_createList();

    cJSON_ArrayForEach(offers_local_nonprimitive,offers )
    {
        if(!cJSON_IsObject(offers_local_nonprimitive)){
            goto end;
        }
        model_offer_dto_t *offersItem = model_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }
    }

    // enriched_model_dto->offline_offers
    cJSON *offline_offers = cJSON_GetObjectItemCaseSensitive(enriched_model_dtoJSON, "offlineOffers");
    if (offline_offers) { 
    if(!cJSON_IsNumber(offline_offers))
    {
    goto end; //Numeric
    }
    }

    // enriched_model_dto->online_offers
    cJSON *online_offers = cJSON_GetObjectItemCaseSensitive(enriched_model_dtoJSON, "onlineOffers");
    if (online_offers) { 
    if(!cJSON_IsNumber(online_offers))
    {
    goto end; //Numeric
    }
    }


    enriched_model_dto_local_var = enriched_model_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        prices ? prices_local_nonprim : NULL,
        offers ? offersList : NULL,
        offline_offers ? offline_offers->valuedouble : 0,
        online_offers ? online_offers->valuedouble : 0
        );

    return enriched_model_dto_local_var;
end:
    if (prices_local_nonprim) {
        model_price_dto_free(prices_local_nonprim);
        prices_local_nonprim = NULL;
    }
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            model_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
