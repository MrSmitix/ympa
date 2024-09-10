#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_dto.h"



get_promo_dto_t *get_promo_dto_create(
    char *id,
    char *name,
    promo_period_dto_t *period,
    int participating,
    get_promo_assortment_info_dto_t *assortment_info,
    get_promo_mechanics_info_dto_t *mechanics_info,
    get_promo_bestseller_info_dto_t *bestseller_info,
    list_t *channels,
    get_promo_constraints_dto_t *constraints
    ) {
    get_promo_dto_t *get_promo_dto_local_var = malloc(sizeof(get_promo_dto_t));
    if (!get_promo_dto_local_var) {
        return NULL;
    }
    get_promo_dto_local_var->id = id;
    get_promo_dto_local_var->name = name;
    get_promo_dto_local_var->period = period;
    get_promo_dto_local_var->participating = participating;
    get_promo_dto_local_var->assortment_info = assortment_info;
    get_promo_dto_local_var->mechanics_info = mechanics_info;
    get_promo_dto_local_var->bestseller_info = bestseller_info;
    get_promo_dto_local_var->channels = channels;
    get_promo_dto_local_var->constraints = constraints;

    return get_promo_dto_local_var;
}


void get_promo_dto_free(get_promo_dto_t *get_promo_dto) {
    if(NULL == get_promo_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_dto->id) {
        free(get_promo_dto->id);
        get_promo_dto->id = NULL;
    }
    if (get_promo_dto->name) {
        free(get_promo_dto->name);
        get_promo_dto->name = NULL;
    }
    if (get_promo_dto->period) {
        promo_period_dto_free(get_promo_dto->period);
        get_promo_dto->period = NULL;
    }
    if (get_promo_dto->assortment_info) {
        get_promo_assortment_info_dto_free(get_promo_dto->assortment_info);
        get_promo_dto->assortment_info = NULL;
    }
    if (get_promo_dto->mechanics_info) {
        get_promo_mechanics_info_dto_free(get_promo_dto->mechanics_info);
        get_promo_dto->mechanics_info = NULL;
    }
    if (get_promo_dto->bestseller_info) {
        get_promo_bestseller_info_dto_free(get_promo_dto->bestseller_info);
        get_promo_dto->bestseller_info = NULL;
    }
    if (get_promo_dto->channels) {
        list_ForEach(listEntry, get_promo_dto->channels) {
            channel_type_free(listEntry->data);
        }
        list_freeList(get_promo_dto->channels);
        get_promo_dto->channels = NULL;
    }
    if (get_promo_dto->constraints) {
        get_promo_constraints_dto_free(get_promo_dto->constraints);
        get_promo_dto->constraints = NULL;
    }
    free(get_promo_dto);
}

cJSON *get_promo_dto_convertToJSON(get_promo_dto_t *get_promo_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_dto->id
    if (!get_promo_dto->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", get_promo_dto->id) == NULL) {
    goto fail; //String
    }


    // get_promo_dto->name
    if (!get_promo_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", get_promo_dto->name) == NULL) {
    goto fail; //String
    }


    // get_promo_dto->period
    if (!get_promo_dto->period) {
        goto fail;
    }
    cJSON *period_local_JSON = promo_period_dto_convertToJSON(get_promo_dto->period);
    if(period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "period", period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // get_promo_dto->participating
    if (!get_promo_dto->participating) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "participating", get_promo_dto->participating) == NULL) {
    goto fail; //Bool
    }


    // get_promo_dto->assortment_info
    if (!get_promo_dto->assortment_info) {
        goto fail;
    }
    cJSON *assortment_info_local_JSON = get_promo_assortment_info_dto_convertToJSON(get_promo_dto->assortment_info);
    if(assortment_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "assortmentInfo", assortment_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // get_promo_dto->mechanics_info
    if (!get_promo_dto->mechanics_info) {
        goto fail;
    }
    cJSON *mechanics_info_local_JSON = get_promo_mechanics_info_dto_convertToJSON(get_promo_dto->mechanics_info);
    if(mechanics_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mechanicsInfo", mechanics_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // get_promo_dto->bestseller_info
    if (!get_promo_dto->bestseller_info) {
        goto fail;
    }
    cJSON *bestseller_info_local_JSON = get_promo_bestseller_info_dto_convertToJSON(get_promo_dto->bestseller_info);
    if(bestseller_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bestsellerInfo", bestseller_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // get_promo_dto->channels
    if(get_promo_dto->channels != _api__get_promo_dto_CHANNELS_NULL) {
    cJSON *channels = cJSON_AddArrayToObject(item, "channels");
    if(channels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *channelsListEntry;
    if (get_promo_dto->channels) {
    list_ForEach(channelsListEntry, get_promo_dto->channels) {
    cJSON *itemLocal = channel_type_convertToJSON((_api__get_promo_dto__e)channelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(channels, itemLocal);
    }
    }
    }


    // get_promo_dto->constraints
    if(get_promo_dto->constraints) {
    cJSON *constraints_local_JSON = get_promo_constraints_dto_convertToJSON(get_promo_dto->constraints);
    if(constraints_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "constraints", constraints_local_JSON);
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

get_promo_dto_t *get_promo_dto_parseFromJSON(cJSON *get_promo_dtoJSON){

    get_promo_dto_t *get_promo_dto_local_var = NULL;

    // define the local variable for get_promo_dto->period
    promo_period_dto_t *period_local_nonprim = NULL;

    // define the local variable for get_promo_dto->assortment_info
    get_promo_assortment_info_dto_t *assortment_info_local_nonprim = NULL;

    // define the local variable for get_promo_dto->mechanics_info
    get_promo_mechanics_info_dto_t *mechanics_info_local_nonprim = NULL;

    // define the local variable for get_promo_dto->bestseller_info
    get_promo_bestseller_info_dto_t *bestseller_info_local_nonprim = NULL;

    // define the local list for get_promo_dto->channels
    list_t *channelsList = NULL;

    // define the local variable for get_promo_dto->constraints
    get_promo_constraints_dto_t *constraints_local_nonprim = NULL;

    // get_promo_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // get_promo_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // get_promo_dto->period
    cJSON *period = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "period");
    if (!period) {
        goto end;
    }

    
    period_local_nonprim = promo_period_dto_parseFromJSON(period); //nonprimitive

    // get_promo_dto->participating
    cJSON *participating = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "participating");
    if (!participating) {
        goto end;
    }

    
    if(!cJSON_IsBool(participating))
    {
    goto end; //Bool
    }

    // get_promo_dto->assortment_info
    cJSON *assortment_info = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "assortmentInfo");
    if (!assortment_info) {
        goto end;
    }

    
    assortment_info_local_nonprim = get_promo_assortment_info_dto_parseFromJSON(assortment_info); //nonprimitive

    // get_promo_dto->mechanics_info
    cJSON *mechanics_info = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "mechanicsInfo");
    if (!mechanics_info) {
        goto end;
    }

    
    mechanics_info_local_nonprim = get_promo_mechanics_info_dto_parseFromJSON(mechanics_info); //nonprimitive

    // get_promo_dto->bestseller_info
    cJSON *bestseller_info = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "bestsellerInfo");
    if (!bestseller_info) {
        goto end;
    }

    
    bestseller_info_local_nonprim = get_promo_bestseller_info_dto_parseFromJSON(bestseller_info); //nonprimitive

    // get_promo_dto->channels
    cJSON *channels = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "channels");
    if (channels) { 
    cJSON *channels_local_nonprimitive = NULL;
    if(!cJSON_IsArray(channels)){
        goto end; //nonprimitive container
    }

    channelsList = list_createList();

    cJSON_ArrayForEach(channels_local_nonprimitive,channels )
    {
        if(!cJSON_IsObject(channels_local_nonprimitive)){
            goto end;
        }
        get_promo_dto_channel_type_e channelsItem = channel_type_parseFromJSON(channels_local_nonprimitive);

        list_addElement(channelsList, (void *)channelsItem);
    }
    }

    // get_promo_dto->constraints
    cJSON *constraints = cJSON_GetObjectItemCaseSensitive(get_promo_dtoJSON, "constraints");
    if (constraints) { 
    constraints_local_nonprim = get_promo_constraints_dto_parseFromJSON(constraints); //nonprimitive
    }


    get_promo_dto_local_var = get_promo_dto_create (
        strdup(id->valuestring),
        strdup(name->valuestring),
        period_local_nonprim,
        participating->valueint,
        assortment_info_local_nonprim,
        mechanics_info_local_nonprim,
        bestseller_info_local_nonprim,
        channels ? channelsList : NULL,
        constraints ? constraints_local_nonprim : NULL
        );

    return get_promo_dto_local_var;
end:
    if (period_local_nonprim) {
        promo_period_dto_free(period_local_nonprim);
        period_local_nonprim = NULL;
    }
    if (assortment_info_local_nonprim) {
        get_promo_assortment_info_dto_free(assortment_info_local_nonprim);
        assortment_info_local_nonprim = NULL;
    }
    if (mechanics_info_local_nonprim) {
        get_promo_mechanics_info_dto_free(mechanics_info_local_nonprim);
        mechanics_info_local_nonprim = NULL;
    }
    if (bestseller_info_local_nonprim) {
        get_promo_bestseller_info_dto_free(bestseller_info_local_nonprim);
        bestseller_info_local_nonprim = NULL;
    }
    if (channelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, channelsList) {
            channel_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(channelsList);
        channelsList = NULL;
    }
    if (constraints_local_nonprim) {
        get_promo_constraints_dto_free(constraints_local_nonprim);
        constraints_local_nonprim = NULL;
    }
    return NULL;

}
