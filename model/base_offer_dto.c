#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_offer_dto.h"


char* base_offer_dto_type_ToString(_api__base_offer_dto__e type) {
    char* typeArray[] =  { "NULL", "DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND" };
    return typeArray[type];
}

_api__base_offer_dto__e base_offer_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

base_offer_dto_t *base_offer_dto_create(
    char *offer_id,
    char *name,
    long market_category_id,
    char *category,
    list_t *pictures,
    list_t *videos,
    list_t *manuals,
    char *vendor,
    list_t *barcodes,
    char *description,
    list_t *manufacturer_countries,
    offer_weight_dimensions_dto_t *weight_dimensions,
    char *vendor_code,
    list_t *tags,
    time_period_dto_t *shelf_life,
    time_period_dto_t *life_time,
    time_period_dto_t *guarantee_period,
    char *customs_commodity_code,
    list_t *certificates,
    int box_count,
    offer_condition_dto_t *condition,
    offer_type_t *type,
    int downloadable,
    int adult,
    age_dto_t *age,
    list_t *params
    ) {
    base_offer_dto_t *base_offer_dto_local_var = malloc(sizeof(base_offer_dto_t));
    if (!base_offer_dto_local_var) {
        return NULL;
    }
    base_offer_dto_local_var->offer_id = offer_id;
    base_offer_dto_local_var->name = name;
    base_offer_dto_local_var->market_category_id = market_category_id;
    base_offer_dto_local_var->category = category;
    base_offer_dto_local_var->pictures = pictures;
    base_offer_dto_local_var->videos = videos;
    base_offer_dto_local_var->manuals = manuals;
    base_offer_dto_local_var->vendor = vendor;
    base_offer_dto_local_var->barcodes = barcodes;
    base_offer_dto_local_var->description = description;
    base_offer_dto_local_var->manufacturer_countries = manufacturer_countries;
    base_offer_dto_local_var->weight_dimensions = weight_dimensions;
    base_offer_dto_local_var->vendor_code = vendor_code;
    base_offer_dto_local_var->tags = tags;
    base_offer_dto_local_var->shelf_life = shelf_life;
    base_offer_dto_local_var->life_time = life_time;
    base_offer_dto_local_var->guarantee_period = guarantee_period;
    base_offer_dto_local_var->customs_commodity_code = customs_commodity_code;
    base_offer_dto_local_var->certificates = certificates;
    base_offer_dto_local_var->box_count = box_count;
    base_offer_dto_local_var->condition = condition;
    base_offer_dto_local_var->type = type;
    base_offer_dto_local_var->downloadable = downloadable;
    base_offer_dto_local_var->adult = adult;
    base_offer_dto_local_var->age = age;
    base_offer_dto_local_var->params = params;

    return base_offer_dto_local_var;
}


void base_offer_dto_free(base_offer_dto_t *base_offer_dto) {
    if(NULL == base_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (base_offer_dto->offer_id) {
        free(base_offer_dto->offer_id);
        base_offer_dto->offer_id = NULL;
    }
    if (base_offer_dto->name) {
        free(base_offer_dto->name);
        base_offer_dto->name = NULL;
    }
    if (base_offer_dto->category) {
        free(base_offer_dto->category);
        base_offer_dto->category = NULL;
    }
    if (base_offer_dto->pictures) {
        list_ForEach(listEntry, base_offer_dto->pictures) {
            free(listEntry->data);
        }
        list_freeList(base_offer_dto->pictures);
        base_offer_dto->pictures = NULL;
    }
    if (base_offer_dto->videos) {
        list_ForEach(listEntry, base_offer_dto->videos) {
            free(listEntry->data);
        }
        list_freeList(base_offer_dto->videos);
        base_offer_dto->videos = NULL;
    }
    if (base_offer_dto->manuals) {
        list_ForEach(listEntry, base_offer_dto->manuals) {
            offer_manual_dto_free(listEntry->data);
        }
        list_freeList(base_offer_dto->manuals);
        base_offer_dto->manuals = NULL;
    }
    if (base_offer_dto->vendor) {
        free(base_offer_dto->vendor);
        base_offer_dto->vendor = NULL;
    }
    if (base_offer_dto->barcodes) {
        list_ForEach(listEntry, base_offer_dto->barcodes) {
            free(listEntry->data);
        }
        list_freeList(base_offer_dto->barcodes);
        base_offer_dto->barcodes = NULL;
    }
    if (base_offer_dto->description) {
        free(base_offer_dto->description);
        base_offer_dto->description = NULL;
    }
    if (base_offer_dto->manufacturer_countries) {
        list_ForEach(listEntry, base_offer_dto->manufacturer_countries) {
            free(listEntry->data);
        }
        list_freeList(base_offer_dto->manufacturer_countries);
        base_offer_dto->manufacturer_countries = NULL;
    }
    if (base_offer_dto->weight_dimensions) {
        offer_weight_dimensions_dto_free(base_offer_dto->weight_dimensions);
        base_offer_dto->weight_dimensions = NULL;
    }
    if (base_offer_dto->vendor_code) {
        free(base_offer_dto->vendor_code);
        base_offer_dto->vendor_code = NULL;
    }
    if (base_offer_dto->tags) {
        list_ForEach(listEntry, base_offer_dto->tags) {
            free(listEntry->data);
        }
        list_freeList(base_offer_dto->tags);
        base_offer_dto->tags = NULL;
    }
    if (base_offer_dto->shelf_life) {
        time_period_dto_free(base_offer_dto->shelf_life);
        base_offer_dto->shelf_life = NULL;
    }
    if (base_offer_dto->life_time) {
        time_period_dto_free(base_offer_dto->life_time);
        base_offer_dto->life_time = NULL;
    }
    if (base_offer_dto->guarantee_period) {
        time_period_dto_free(base_offer_dto->guarantee_period);
        base_offer_dto->guarantee_period = NULL;
    }
    if (base_offer_dto->customs_commodity_code) {
        free(base_offer_dto->customs_commodity_code);
        base_offer_dto->customs_commodity_code = NULL;
    }
    if (base_offer_dto->certificates) {
        list_ForEach(listEntry, base_offer_dto->certificates) {
            free(listEntry->data);
        }
        list_freeList(base_offer_dto->certificates);
        base_offer_dto->certificates = NULL;
    }
    if (base_offer_dto->condition) {
        offer_condition_dto_free(base_offer_dto->condition);
        base_offer_dto->condition = NULL;
    }
    if (base_offer_dto->type) {
        offer_type_free(base_offer_dto->type);
        base_offer_dto->type = NULL;
    }
    if (base_offer_dto->age) {
        age_dto_free(base_offer_dto->age);
        base_offer_dto->age = NULL;
    }
    if (base_offer_dto->params) {
        list_ForEach(listEntry, base_offer_dto->params) {
            offer_param_dto_free(listEntry->data);
        }
        list_freeList(base_offer_dto->params);
        base_offer_dto->params = NULL;
    }
    free(base_offer_dto);
}

cJSON *base_offer_dto_convertToJSON(base_offer_dto_t *base_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // base_offer_dto->offer_id
    if (!base_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", base_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // base_offer_dto->name
    if(base_offer_dto->name) {
    if(cJSON_AddStringToObject(item, "name", base_offer_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // base_offer_dto->market_category_id
    if(base_offer_dto->market_category_id) {
    if(cJSON_AddNumberToObject(item, "marketCategoryId", base_offer_dto->market_category_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_offer_dto->category
    if(base_offer_dto->category) {
    if(cJSON_AddStringToObject(item, "category", base_offer_dto->category) == NULL) {
    goto fail; //String
    }
    }


    // base_offer_dto->pictures
    if(base_offer_dto->pictures) {
    cJSON *pictures = cJSON_AddArrayToObject(item, "pictures");
    if(pictures == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *picturesListEntry;
    list_ForEach(picturesListEntry, base_offer_dto->pictures) {
    if(cJSON_AddStringToObject(pictures, "", (char*)picturesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // base_offer_dto->videos
    if(base_offer_dto->videos) {
    cJSON *videos = cJSON_AddArrayToObject(item, "videos");
    if(videos == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *videosListEntry;
    list_ForEach(videosListEntry, base_offer_dto->videos) {
    if(cJSON_AddStringToObject(videos, "", (char*)videosListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // base_offer_dto->manuals
    if(base_offer_dto->manuals) {
    cJSON *manuals = cJSON_AddArrayToObject(item, "manuals");
    if(manuals == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *manualsListEntry;
    if (base_offer_dto->manuals) {
    list_ForEach(manualsListEntry, base_offer_dto->manuals) {
    cJSON *itemLocal = offer_manual_dto_convertToJSON(manualsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(manuals, itemLocal);
    }
    }
    }


    // base_offer_dto->vendor
    if(base_offer_dto->vendor) {
    if(cJSON_AddStringToObject(item, "vendor", base_offer_dto->vendor) == NULL) {
    goto fail; //String
    }
    }


    // base_offer_dto->barcodes
    if(base_offer_dto->barcodes) {
    cJSON *barcodes = cJSON_AddArrayToObject(item, "barcodes");
    if(barcodes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *barcodesListEntry;
    list_ForEach(barcodesListEntry, base_offer_dto->barcodes) {
    if(cJSON_AddStringToObject(barcodes, "", (char*)barcodesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // base_offer_dto->description
    if(base_offer_dto->description) {
    if(cJSON_AddStringToObject(item, "description", base_offer_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // base_offer_dto->manufacturer_countries
    if(base_offer_dto->manufacturer_countries) {
    cJSON *manufacturer_countries = cJSON_AddArrayToObject(item, "manufacturerCountries");
    if(manufacturer_countries == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *manufacturer_countriesListEntry;
    list_ForEach(manufacturer_countriesListEntry, base_offer_dto->manufacturer_countries) {
    if(cJSON_AddStringToObject(manufacturer_countries, "", (char*)manufacturer_countriesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // base_offer_dto->weight_dimensions
    if(base_offer_dto->weight_dimensions) {
    cJSON *weight_dimensions_local_JSON = offer_weight_dimensions_dto_convertToJSON(base_offer_dto->weight_dimensions);
    if(weight_dimensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "weightDimensions", weight_dimensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_offer_dto->vendor_code
    if(base_offer_dto->vendor_code) {
    if(cJSON_AddStringToObject(item, "vendorCode", base_offer_dto->vendor_code) == NULL) {
    goto fail; //String
    }
    }


    // base_offer_dto->tags
    if(base_offer_dto->tags) {
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
    if(tags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tagsListEntry;
    list_ForEach(tagsListEntry, base_offer_dto->tags) {
    if(cJSON_AddStringToObject(tags, "", (char*)tagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // base_offer_dto->shelf_life
    if(base_offer_dto->shelf_life) {
    cJSON *shelf_life_local_JSON = time_period_dto_convertToJSON(base_offer_dto->shelf_life);
    if(shelf_life_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shelfLife", shelf_life_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_offer_dto->life_time
    if(base_offer_dto->life_time) {
    cJSON *life_time_local_JSON = time_period_dto_convertToJSON(base_offer_dto->life_time);
    if(life_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "lifeTime", life_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_offer_dto->guarantee_period
    if(base_offer_dto->guarantee_period) {
    cJSON *guarantee_period_local_JSON = time_period_dto_convertToJSON(base_offer_dto->guarantee_period);
    if(guarantee_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "guaranteePeriod", guarantee_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_offer_dto->customs_commodity_code
    if(base_offer_dto->customs_commodity_code) {
    if(cJSON_AddStringToObject(item, "customsCommodityCode", base_offer_dto->customs_commodity_code) == NULL) {
    goto fail; //String
    }
    }


    // base_offer_dto->certificates
    if(base_offer_dto->certificates) {
    cJSON *certificates = cJSON_AddArrayToObject(item, "certificates");
    if(certificates == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *certificatesListEntry;
    list_ForEach(certificatesListEntry, base_offer_dto->certificates) {
    if(cJSON_AddStringToObject(certificates, "", (char*)certificatesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // base_offer_dto->box_count
    if(base_offer_dto->box_count) {
    if(cJSON_AddNumberToObject(item, "boxCount", base_offer_dto->box_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_offer_dto->condition
    if(base_offer_dto->condition) {
    cJSON *condition_local_JSON = offer_condition_dto_convertToJSON(base_offer_dto->condition);
    if(condition_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "condition", condition_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_offer_dto->type
    if(base_offer_dto->type != _api__base_offer_dto__NULL) {
    cJSON *type_local_JSON = offer_type_convertToJSON(base_offer_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // base_offer_dto->downloadable
    if(base_offer_dto->downloadable) {
    if(cJSON_AddBoolToObject(item, "downloadable", base_offer_dto->downloadable) == NULL) {
    goto fail; //Bool
    }
    }


    // base_offer_dto->adult
    if(base_offer_dto->adult) {
    if(cJSON_AddBoolToObject(item, "adult", base_offer_dto->adult) == NULL) {
    goto fail; //Bool
    }
    }


    // base_offer_dto->age
    if(base_offer_dto->age) {
    cJSON *age_local_JSON = age_dto_convertToJSON(base_offer_dto->age);
    if(age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "age", age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_offer_dto->params
    if(base_offer_dto->params) {
    cJSON *params = cJSON_AddArrayToObject(item, "params");
    if(params == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *paramsListEntry;
    if (base_offer_dto->params) {
    list_ForEach(paramsListEntry, base_offer_dto->params) {
    cJSON *itemLocal = offer_param_dto_convertToJSON(paramsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(params, itemLocal);
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

base_offer_dto_t *base_offer_dto_parseFromJSON(cJSON *base_offer_dtoJSON){

    base_offer_dto_t *base_offer_dto_local_var = NULL;

    // define the local list for base_offer_dto->pictures
    list_t *picturesList = NULL;

    // define the local list for base_offer_dto->videos
    list_t *videosList = NULL;

    // define the local list for base_offer_dto->manuals
    list_t *manualsList = NULL;

    // define the local list for base_offer_dto->barcodes
    list_t *barcodesList = NULL;

    // define the local list for base_offer_dto->manufacturer_countries
    list_t *manufacturer_countriesList = NULL;

    // define the local variable for base_offer_dto->weight_dimensions
    offer_weight_dimensions_dto_t *weight_dimensions_local_nonprim = NULL;

    // define the local list for base_offer_dto->tags
    list_t *tagsList = NULL;

    // define the local variable for base_offer_dto->shelf_life
    time_period_dto_t *shelf_life_local_nonprim = NULL;

    // define the local variable for base_offer_dto->life_time
    time_period_dto_t *life_time_local_nonprim = NULL;

    // define the local variable for base_offer_dto->guarantee_period
    time_period_dto_t *guarantee_period_local_nonprim = NULL;

    // define the local list for base_offer_dto->certificates
    list_t *certificatesList = NULL;

    // define the local variable for base_offer_dto->condition
    offer_condition_dto_t *condition_local_nonprim = NULL;

    // define the local variable for base_offer_dto->type
    offer_type_t *type_local_nonprim = NULL;

    // define the local variable for base_offer_dto->age
    age_dto_t *age_local_nonprim = NULL;

    // define the local list for base_offer_dto->params
    list_t *paramsList = NULL;

    // base_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // base_offer_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // base_offer_dto->market_category_id
    cJSON *market_category_id = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "marketCategoryId");
    if (market_category_id) { 
    if(!cJSON_IsNumber(market_category_id))
    {
    goto end; //Numeric
    }
    }

    // base_offer_dto->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "category");
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // base_offer_dto->pictures
    cJSON *pictures = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "pictures");
    if (pictures) { 
    cJSON *pictures_local = NULL;
    if(!cJSON_IsArray(pictures)) {
        goto end;//primitive container
    }
    picturesList = list_createList();

    cJSON_ArrayForEach(pictures_local, pictures)
    {
        if(!cJSON_IsString(pictures_local))
        {
            goto end;
        }
        list_addElement(picturesList , strdup(pictures_local->valuestring));
    }
    }

    // base_offer_dto->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "videos");
    if (videos) { 
    cJSON *videos_local = NULL;
    if(!cJSON_IsArray(videos)) {
        goto end;//primitive container
    }
    videosList = list_createList();

    cJSON_ArrayForEach(videos_local, videos)
    {
        if(!cJSON_IsString(videos_local))
        {
            goto end;
        }
        list_addElement(videosList , strdup(videos_local->valuestring));
    }
    }

    // base_offer_dto->manuals
    cJSON *manuals = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "manuals");
    if (manuals) { 
    cJSON *manuals_local_nonprimitive = NULL;
    if(!cJSON_IsArray(manuals)){
        goto end; //nonprimitive container
    }

    manualsList = list_createList();

    cJSON_ArrayForEach(manuals_local_nonprimitive,manuals )
    {
        if(!cJSON_IsObject(manuals_local_nonprimitive)){
            goto end;
        }
        offer_manual_dto_t *manualsItem = offer_manual_dto_parseFromJSON(manuals_local_nonprimitive);

        list_addElement(manualsList, manualsItem);
    }
    }

    // base_offer_dto->vendor
    cJSON *vendor = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "vendor");
    if (vendor) { 
    if(!cJSON_IsString(vendor) && !cJSON_IsNull(vendor))
    {
    goto end; //String
    }
    }

    // base_offer_dto->barcodes
    cJSON *barcodes = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "barcodes");
    if (barcodes) { 
    cJSON *barcodes_local = NULL;
    if(!cJSON_IsArray(barcodes)) {
        goto end;//primitive container
    }
    barcodesList = list_createList();

    cJSON_ArrayForEach(barcodes_local, barcodes)
    {
        if(!cJSON_IsString(barcodes_local))
        {
            goto end;
        }
        list_addElement(barcodesList , strdup(barcodes_local->valuestring));
    }
    }

    // base_offer_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // base_offer_dto->manufacturer_countries
    cJSON *manufacturer_countries = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "manufacturerCountries");
    if (manufacturer_countries) { 
    cJSON *manufacturer_countries_local = NULL;
    if(!cJSON_IsArray(manufacturer_countries)) {
        goto end;//primitive container
    }
    manufacturer_countriesList = list_createList();

    cJSON_ArrayForEach(manufacturer_countries_local, manufacturer_countries)
    {
        if(!cJSON_IsString(manufacturer_countries_local))
        {
            goto end;
        }
        list_addElement(manufacturer_countriesList , strdup(manufacturer_countries_local->valuestring));
    }
    }

    // base_offer_dto->weight_dimensions
    cJSON *weight_dimensions = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "weightDimensions");
    if (weight_dimensions) { 
    weight_dimensions_local_nonprim = offer_weight_dimensions_dto_parseFromJSON(weight_dimensions); //nonprimitive
    }

    // base_offer_dto->vendor_code
    cJSON *vendor_code = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "vendorCode");
    if (vendor_code) { 
    if(!cJSON_IsString(vendor_code) && !cJSON_IsNull(vendor_code))
    {
    goto end; //String
    }
    }

    // base_offer_dto->tags
    cJSON *tags = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "tags");
    if (tags) { 
    cJSON *tags_local = NULL;
    if(!cJSON_IsArray(tags)) {
        goto end;//primitive container
    }
    tagsList = list_createList();

    cJSON_ArrayForEach(tags_local, tags)
    {
        if(!cJSON_IsString(tags_local))
        {
            goto end;
        }
        list_addElement(tagsList , strdup(tags_local->valuestring));
    }
    }

    // base_offer_dto->shelf_life
    cJSON *shelf_life = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "shelfLife");
    if (shelf_life) { 
    shelf_life_local_nonprim = time_period_dto_parseFromJSON(shelf_life); //nonprimitive
    }

    // base_offer_dto->life_time
    cJSON *life_time = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "lifeTime");
    if (life_time) { 
    life_time_local_nonprim = time_period_dto_parseFromJSON(life_time); //nonprimitive
    }

    // base_offer_dto->guarantee_period
    cJSON *guarantee_period = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "guaranteePeriod");
    if (guarantee_period) { 
    guarantee_period_local_nonprim = time_period_dto_parseFromJSON(guarantee_period); //nonprimitive
    }

    // base_offer_dto->customs_commodity_code
    cJSON *customs_commodity_code = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "customsCommodityCode");
    if (customs_commodity_code) { 
    if(!cJSON_IsString(customs_commodity_code) && !cJSON_IsNull(customs_commodity_code))
    {
    goto end; //String
    }
    }

    // base_offer_dto->certificates
    cJSON *certificates = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "certificates");
    if (certificates) { 
    cJSON *certificates_local = NULL;
    if(!cJSON_IsArray(certificates)) {
        goto end;//primitive container
    }
    certificatesList = list_createList();

    cJSON_ArrayForEach(certificates_local, certificates)
    {
        if(!cJSON_IsString(certificates_local))
        {
            goto end;
        }
        list_addElement(certificatesList , strdup(certificates_local->valuestring));
    }
    }

    // base_offer_dto->box_count
    cJSON *box_count = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "boxCount");
    if (box_count) { 
    if(!cJSON_IsNumber(box_count))
    {
    goto end; //Numeric
    }
    }

    // base_offer_dto->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "condition");
    if (condition) { 
    condition_local_nonprim = offer_condition_dto_parseFromJSON(condition); //nonprimitive
    }

    // base_offer_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = offer_type_parseFromJSON(type); //custom
    }

    // base_offer_dto->downloadable
    cJSON *downloadable = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "downloadable");
    if (downloadable) { 
    if(!cJSON_IsBool(downloadable))
    {
    goto end; //Bool
    }
    }

    // base_offer_dto->adult
    cJSON *adult = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "adult");
    if (adult) { 
    if(!cJSON_IsBool(adult))
    {
    goto end; //Bool
    }
    }

    // base_offer_dto->age
    cJSON *age = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "age");
    if (age) { 
    age_local_nonprim = age_dto_parseFromJSON(age); //nonprimitive
    }

    // base_offer_dto->params
    cJSON *params = cJSON_GetObjectItemCaseSensitive(base_offer_dtoJSON, "params");
    if (params) { 
    cJSON *params_local_nonprimitive = NULL;
    if(!cJSON_IsArray(params)){
        goto end; //nonprimitive container
    }

    paramsList = list_createList();

    cJSON_ArrayForEach(params_local_nonprimitive,params )
    {
        if(!cJSON_IsObject(params_local_nonprimitive)){
            goto end;
        }
        offer_param_dto_t *paramsItem = offer_param_dto_parseFromJSON(params_local_nonprimitive);

        list_addElement(paramsList, paramsItem);
    }
    }


    base_offer_dto_local_var = base_offer_dto_create (
        strdup(offer_id->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        market_category_id ? market_category_id->valuedouble : 0,
        category && !cJSON_IsNull(category) ? strdup(category->valuestring) : NULL,
        pictures ? picturesList : NULL,
        videos ? videosList : NULL,
        manuals ? manualsList : NULL,
        vendor && !cJSON_IsNull(vendor) ? strdup(vendor->valuestring) : NULL,
        barcodes ? barcodesList : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        manufacturer_countries ? manufacturer_countriesList : NULL,
        weight_dimensions ? weight_dimensions_local_nonprim : NULL,
        vendor_code && !cJSON_IsNull(vendor_code) ? strdup(vendor_code->valuestring) : NULL,
        tags ? tagsList : NULL,
        shelf_life ? shelf_life_local_nonprim : NULL,
        life_time ? life_time_local_nonprim : NULL,
        guarantee_period ? guarantee_period_local_nonprim : NULL,
        customs_commodity_code && !cJSON_IsNull(customs_commodity_code) ? strdup(customs_commodity_code->valuestring) : NULL,
        certificates ? certificatesList : NULL,
        box_count ? box_count->valuedouble : 0,
        condition ? condition_local_nonprim : NULL,
        type ? type_local_nonprim : NULL,
        downloadable ? downloadable->valueint : 0,
        adult ? adult->valueint : 0,
        age ? age_local_nonprim : NULL,
        params ? paramsList : NULL
        );

    return base_offer_dto_local_var;
end:
    if (picturesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, picturesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(picturesList);
        picturesList = NULL;
    }
    if (videosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, videosList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(videosList);
        videosList = NULL;
    }
    if (manualsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, manualsList) {
            offer_manual_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(manualsList);
        manualsList = NULL;
    }
    if (barcodesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, barcodesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(barcodesList);
        barcodesList = NULL;
    }
    if (manufacturer_countriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, manufacturer_countriesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(manufacturer_countriesList);
        manufacturer_countriesList = NULL;
    }
    if (weight_dimensions_local_nonprim) {
        offer_weight_dimensions_dto_free(weight_dimensions_local_nonprim);
        weight_dimensions_local_nonprim = NULL;
    }
    if (tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tagsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tagsList);
        tagsList = NULL;
    }
    if (shelf_life_local_nonprim) {
        time_period_dto_free(shelf_life_local_nonprim);
        shelf_life_local_nonprim = NULL;
    }
    if (life_time_local_nonprim) {
        time_period_dto_free(life_time_local_nonprim);
        life_time_local_nonprim = NULL;
    }
    if (guarantee_period_local_nonprim) {
        time_period_dto_free(guarantee_period_local_nonprim);
        guarantee_period_local_nonprim = NULL;
    }
    if (certificatesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, certificatesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(certificatesList);
        certificatesList = NULL;
    }
    if (condition_local_nonprim) {
        offer_condition_dto_free(condition_local_nonprim);
        condition_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        offer_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (age_local_nonprim) {
        age_dto_free(age_local_nonprim);
        age_local_nonprim = NULL;
    }
    if (paramsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, paramsList) {
            offer_param_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(paramsList);
        paramsList = NULL;
    }
    return NULL;

}
