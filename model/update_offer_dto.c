#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_dto.h"


char* update_offer_dto_type_ToString(_api__update_offer_dto__e type) {
    char* typeArray[] =  { "NULL", "DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND" };
    return typeArray[type];
}

_api__update_offer_dto__e update_offer_dto_type_FromString(char* type){
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

update_offer_dto_t *update_offer_dto_create(
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
    list_t *params,
    list_t *parameter_values,
    update_price_with_discount_dto_t *basic_price,
    base_price_dto_t *purchase_price,
    base_price_dto_t *additional_expenses,
    base_price_dto_t *cofinance_price
    ) {
    update_offer_dto_t *update_offer_dto_local_var = malloc(sizeof(update_offer_dto_t));
    if (!update_offer_dto_local_var) {
        return NULL;
    }
    update_offer_dto_local_var->offer_id = offer_id;
    update_offer_dto_local_var->name = name;
    update_offer_dto_local_var->market_category_id = market_category_id;
    update_offer_dto_local_var->category = category;
    update_offer_dto_local_var->pictures = pictures;
    update_offer_dto_local_var->videos = videos;
    update_offer_dto_local_var->manuals = manuals;
    update_offer_dto_local_var->vendor = vendor;
    update_offer_dto_local_var->barcodes = barcodes;
    update_offer_dto_local_var->description = description;
    update_offer_dto_local_var->manufacturer_countries = manufacturer_countries;
    update_offer_dto_local_var->weight_dimensions = weight_dimensions;
    update_offer_dto_local_var->vendor_code = vendor_code;
    update_offer_dto_local_var->tags = tags;
    update_offer_dto_local_var->shelf_life = shelf_life;
    update_offer_dto_local_var->life_time = life_time;
    update_offer_dto_local_var->guarantee_period = guarantee_period;
    update_offer_dto_local_var->customs_commodity_code = customs_commodity_code;
    update_offer_dto_local_var->certificates = certificates;
    update_offer_dto_local_var->box_count = box_count;
    update_offer_dto_local_var->condition = condition;
    update_offer_dto_local_var->type = type;
    update_offer_dto_local_var->downloadable = downloadable;
    update_offer_dto_local_var->adult = adult;
    update_offer_dto_local_var->age = age;
    update_offer_dto_local_var->params = params;
    update_offer_dto_local_var->parameter_values = parameter_values;
    update_offer_dto_local_var->basic_price = basic_price;
    update_offer_dto_local_var->purchase_price = purchase_price;
    update_offer_dto_local_var->additional_expenses = additional_expenses;
    update_offer_dto_local_var->cofinance_price = cofinance_price;

    return update_offer_dto_local_var;
}


void update_offer_dto_free(update_offer_dto_t *update_offer_dto) {
    if(NULL == update_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_dto->offer_id) {
        free(update_offer_dto->offer_id);
        update_offer_dto->offer_id = NULL;
    }
    if (update_offer_dto->name) {
        free(update_offer_dto->name);
        update_offer_dto->name = NULL;
    }
    if (update_offer_dto->category) {
        free(update_offer_dto->category);
        update_offer_dto->category = NULL;
    }
    if (update_offer_dto->pictures) {
        list_ForEach(listEntry, update_offer_dto->pictures) {
            free(listEntry->data);
        }
        list_freeList(update_offer_dto->pictures);
        update_offer_dto->pictures = NULL;
    }
    if (update_offer_dto->videos) {
        list_ForEach(listEntry, update_offer_dto->videos) {
            free(listEntry->data);
        }
        list_freeList(update_offer_dto->videos);
        update_offer_dto->videos = NULL;
    }
    if (update_offer_dto->manuals) {
        list_ForEach(listEntry, update_offer_dto->manuals) {
            offer_manual_dto_free(listEntry->data);
        }
        list_freeList(update_offer_dto->manuals);
        update_offer_dto->manuals = NULL;
    }
    if (update_offer_dto->vendor) {
        free(update_offer_dto->vendor);
        update_offer_dto->vendor = NULL;
    }
    if (update_offer_dto->barcodes) {
        list_ForEach(listEntry, update_offer_dto->barcodes) {
            free(listEntry->data);
        }
        list_freeList(update_offer_dto->barcodes);
        update_offer_dto->barcodes = NULL;
    }
    if (update_offer_dto->description) {
        free(update_offer_dto->description);
        update_offer_dto->description = NULL;
    }
    if (update_offer_dto->manufacturer_countries) {
        list_ForEach(listEntry, update_offer_dto->manufacturer_countries) {
            free(listEntry->data);
        }
        list_freeList(update_offer_dto->manufacturer_countries);
        update_offer_dto->manufacturer_countries = NULL;
    }
    if (update_offer_dto->weight_dimensions) {
        offer_weight_dimensions_dto_free(update_offer_dto->weight_dimensions);
        update_offer_dto->weight_dimensions = NULL;
    }
    if (update_offer_dto->vendor_code) {
        free(update_offer_dto->vendor_code);
        update_offer_dto->vendor_code = NULL;
    }
    if (update_offer_dto->tags) {
        list_ForEach(listEntry, update_offer_dto->tags) {
            free(listEntry->data);
        }
        list_freeList(update_offer_dto->tags);
        update_offer_dto->tags = NULL;
    }
    if (update_offer_dto->shelf_life) {
        time_period_dto_free(update_offer_dto->shelf_life);
        update_offer_dto->shelf_life = NULL;
    }
    if (update_offer_dto->life_time) {
        time_period_dto_free(update_offer_dto->life_time);
        update_offer_dto->life_time = NULL;
    }
    if (update_offer_dto->guarantee_period) {
        time_period_dto_free(update_offer_dto->guarantee_period);
        update_offer_dto->guarantee_period = NULL;
    }
    if (update_offer_dto->customs_commodity_code) {
        free(update_offer_dto->customs_commodity_code);
        update_offer_dto->customs_commodity_code = NULL;
    }
    if (update_offer_dto->certificates) {
        list_ForEach(listEntry, update_offer_dto->certificates) {
            free(listEntry->data);
        }
        list_freeList(update_offer_dto->certificates);
        update_offer_dto->certificates = NULL;
    }
    if (update_offer_dto->condition) {
        offer_condition_dto_free(update_offer_dto->condition);
        update_offer_dto->condition = NULL;
    }
    if (update_offer_dto->type) {
        offer_type_free(update_offer_dto->type);
        update_offer_dto->type = NULL;
    }
    if (update_offer_dto->age) {
        age_dto_free(update_offer_dto->age);
        update_offer_dto->age = NULL;
    }
    if (update_offer_dto->params) {
        list_ForEach(listEntry, update_offer_dto->params) {
            offer_param_dto_free(listEntry->data);
        }
        list_freeList(update_offer_dto->params);
        update_offer_dto->params = NULL;
    }
    if (update_offer_dto->parameter_values) {
        list_ForEach(listEntry, update_offer_dto->parameter_values) {
            parameter_value_dto_free(listEntry->data);
        }
        list_freeList(update_offer_dto->parameter_values);
        update_offer_dto->parameter_values = NULL;
    }
    if (update_offer_dto->basic_price) {
        update_price_with_discount_dto_free(update_offer_dto->basic_price);
        update_offer_dto->basic_price = NULL;
    }
    if (update_offer_dto->purchase_price) {
        base_price_dto_free(update_offer_dto->purchase_price);
        update_offer_dto->purchase_price = NULL;
    }
    if (update_offer_dto->additional_expenses) {
        base_price_dto_free(update_offer_dto->additional_expenses);
        update_offer_dto->additional_expenses = NULL;
    }
    if (update_offer_dto->cofinance_price) {
        base_price_dto_free(update_offer_dto->cofinance_price);
        update_offer_dto->cofinance_price = NULL;
    }
    free(update_offer_dto);
}

cJSON *update_offer_dto_convertToJSON(update_offer_dto_t *update_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_dto->offer_id
    if (!update_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", update_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // update_offer_dto->name
    if(update_offer_dto->name) {
    if(cJSON_AddStringToObject(item, "name", update_offer_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // update_offer_dto->market_category_id
    if(update_offer_dto->market_category_id) {
    if(cJSON_AddNumberToObject(item, "marketCategoryId", update_offer_dto->market_category_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_offer_dto->category
    if(update_offer_dto->category) {
    if(cJSON_AddStringToObject(item, "category", update_offer_dto->category) == NULL) {
    goto fail; //String
    }
    }


    // update_offer_dto->pictures
    if(update_offer_dto->pictures) {
    cJSON *pictures = cJSON_AddArrayToObject(item, "pictures");
    if(pictures == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *picturesListEntry;
    list_ForEach(picturesListEntry, update_offer_dto->pictures) {
    if(cJSON_AddStringToObject(pictures, "", (char*)picturesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_offer_dto->videos
    if(update_offer_dto->videos) {
    cJSON *videos = cJSON_AddArrayToObject(item, "videos");
    if(videos == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *videosListEntry;
    list_ForEach(videosListEntry, update_offer_dto->videos) {
    if(cJSON_AddStringToObject(videos, "", (char*)videosListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_offer_dto->manuals
    if(update_offer_dto->manuals) {
    cJSON *manuals = cJSON_AddArrayToObject(item, "manuals");
    if(manuals == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *manualsListEntry;
    if (update_offer_dto->manuals) {
    list_ForEach(manualsListEntry, update_offer_dto->manuals) {
    cJSON *itemLocal = offer_manual_dto_convertToJSON(manualsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(manuals, itemLocal);
    }
    }
    }


    // update_offer_dto->vendor
    if(update_offer_dto->vendor) {
    if(cJSON_AddStringToObject(item, "vendor", update_offer_dto->vendor) == NULL) {
    goto fail; //String
    }
    }


    // update_offer_dto->barcodes
    if(update_offer_dto->barcodes) {
    cJSON *barcodes = cJSON_AddArrayToObject(item, "barcodes");
    if(barcodes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *barcodesListEntry;
    list_ForEach(barcodesListEntry, update_offer_dto->barcodes) {
    if(cJSON_AddStringToObject(barcodes, "", (char*)barcodesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_offer_dto->description
    if(update_offer_dto->description) {
    if(cJSON_AddStringToObject(item, "description", update_offer_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // update_offer_dto->manufacturer_countries
    if(update_offer_dto->manufacturer_countries) {
    cJSON *manufacturer_countries = cJSON_AddArrayToObject(item, "manufacturerCountries");
    if(manufacturer_countries == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *manufacturer_countriesListEntry;
    list_ForEach(manufacturer_countriesListEntry, update_offer_dto->manufacturer_countries) {
    if(cJSON_AddStringToObject(manufacturer_countries, "", (char*)manufacturer_countriesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_offer_dto->weight_dimensions
    if(update_offer_dto->weight_dimensions) {
    cJSON *weight_dimensions_local_JSON = offer_weight_dimensions_dto_convertToJSON(update_offer_dto->weight_dimensions);
    if(weight_dimensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "weightDimensions", weight_dimensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->vendor_code
    if(update_offer_dto->vendor_code) {
    if(cJSON_AddStringToObject(item, "vendorCode", update_offer_dto->vendor_code) == NULL) {
    goto fail; //String
    }
    }


    // update_offer_dto->tags
    if(update_offer_dto->tags) {
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
    if(tags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tagsListEntry;
    list_ForEach(tagsListEntry, update_offer_dto->tags) {
    if(cJSON_AddStringToObject(tags, "", (char*)tagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_offer_dto->shelf_life
    if(update_offer_dto->shelf_life) {
    cJSON *shelf_life_local_JSON = time_period_dto_convertToJSON(update_offer_dto->shelf_life);
    if(shelf_life_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shelfLife", shelf_life_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->life_time
    if(update_offer_dto->life_time) {
    cJSON *life_time_local_JSON = time_period_dto_convertToJSON(update_offer_dto->life_time);
    if(life_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "lifeTime", life_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->guarantee_period
    if(update_offer_dto->guarantee_period) {
    cJSON *guarantee_period_local_JSON = time_period_dto_convertToJSON(update_offer_dto->guarantee_period);
    if(guarantee_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "guaranteePeriod", guarantee_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->customs_commodity_code
    if(update_offer_dto->customs_commodity_code) {
    if(cJSON_AddStringToObject(item, "customsCommodityCode", update_offer_dto->customs_commodity_code) == NULL) {
    goto fail; //String
    }
    }


    // update_offer_dto->certificates
    if(update_offer_dto->certificates) {
    cJSON *certificates = cJSON_AddArrayToObject(item, "certificates");
    if(certificates == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *certificatesListEntry;
    list_ForEach(certificatesListEntry, update_offer_dto->certificates) {
    if(cJSON_AddStringToObject(certificates, "", (char*)certificatesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_offer_dto->box_count
    if(update_offer_dto->box_count) {
    if(cJSON_AddNumberToObject(item, "boxCount", update_offer_dto->box_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_offer_dto->condition
    if(update_offer_dto->condition) {
    cJSON *condition_local_JSON = offer_condition_dto_convertToJSON(update_offer_dto->condition);
    if(condition_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "condition", condition_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->type
    if(update_offer_dto->type != _api__update_offer_dto__NULL) {
    cJSON *type_local_JSON = offer_type_convertToJSON(update_offer_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_offer_dto->downloadable
    if(update_offer_dto->downloadable) {
    if(cJSON_AddBoolToObject(item, "downloadable", update_offer_dto->downloadable) == NULL) {
    goto fail; //Bool
    }
    }


    // update_offer_dto->adult
    if(update_offer_dto->adult) {
    if(cJSON_AddBoolToObject(item, "adult", update_offer_dto->adult) == NULL) {
    goto fail; //Bool
    }
    }


    // update_offer_dto->age
    if(update_offer_dto->age) {
    cJSON *age_local_JSON = age_dto_convertToJSON(update_offer_dto->age);
    if(age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "age", age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->params
    if(update_offer_dto->params) {
    cJSON *params = cJSON_AddArrayToObject(item, "params");
    if(params == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *paramsListEntry;
    if (update_offer_dto->params) {
    list_ForEach(paramsListEntry, update_offer_dto->params) {
    cJSON *itemLocal = offer_param_dto_convertToJSON(paramsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(params, itemLocal);
    }
    }
    }


    // update_offer_dto->parameter_values
    if(update_offer_dto->parameter_values) {
    cJSON *parameter_values = cJSON_AddArrayToObject(item, "parameterValues");
    if(parameter_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parameter_valuesListEntry;
    if (update_offer_dto->parameter_values) {
    list_ForEach(parameter_valuesListEntry, update_offer_dto->parameter_values) {
    cJSON *itemLocal = parameter_value_dto_convertToJSON(parameter_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parameter_values, itemLocal);
    }
    }
    }


    // update_offer_dto->basic_price
    if(update_offer_dto->basic_price) {
    cJSON *basic_price_local_JSON = update_price_with_discount_dto_convertToJSON(update_offer_dto->basic_price);
    if(basic_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "basicPrice", basic_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->purchase_price
    if(update_offer_dto->purchase_price) {
    cJSON *purchase_price_local_JSON = base_price_dto_convertToJSON(update_offer_dto->purchase_price);
    if(purchase_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "purchasePrice", purchase_price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->additional_expenses
    if(update_offer_dto->additional_expenses) {
    cJSON *additional_expenses_local_JSON = base_price_dto_convertToJSON(update_offer_dto->additional_expenses);
    if(additional_expenses_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "additionalExpenses", additional_expenses_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_offer_dto->cofinance_price
    if(update_offer_dto->cofinance_price) {
    cJSON *cofinance_price_local_JSON = base_price_dto_convertToJSON(update_offer_dto->cofinance_price);
    if(cofinance_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cofinancePrice", cofinance_price_local_JSON);
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

update_offer_dto_t *update_offer_dto_parseFromJSON(cJSON *update_offer_dtoJSON){

    update_offer_dto_t *update_offer_dto_local_var = NULL;

    // define the local list for update_offer_dto->pictures
    list_t *picturesList = NULL;

    // define the local list for update_offer_dto->videos
    list_t *videosList = NULL;

    // define the local list for update_offer_dto->manuals
    list_t *manualsList = NULL;

    // define the local list for update_offer_dto->barcodes
    list_t *barcodesList = NULL;

    // define the local list for update_offer_dto->manufacturer_countries
    list_t *manufacturer_countriesList = NULL;

    // define the local variable for update_offer_dto->weight_dimensions
    offer_weight_dimensions_dto_t *weight_dimensions_local_nonprim = NULL;

    // define the local list for update_offer_dto->tags
    list_t *tagsList = NULL;

    // define the local variable for update_offer_dto->shelf_life
    time_period_dto_t *shelf_life_local_nonprim = NULL;

    // define the local variable for update_offer_dto->life_time
    time_period_dto_t *life_time_local_nonprim = NULL;

    // define the local variable for update_offer_dto->guarantee_period
    time_period_dto_t *guarantee_period_local_nonprim = NULL;

    // define the local list for update_offer_dto->certificates
    list_t *certificatesList = NULL;

    // define the local variable for update_offer_dto->condition
    offer_condition_dto_t *condition_local_nonprim = NULL;

    // define the local variable for update_offer_dto->type
    offer_type_t *type_local_nonprim = NULL;

    // define the local variable for update_offer_dto->age
    age_dto_t *age_local_nonprim = NULL;

    // define the local list for update_offer_dto->params
    list_t *paramsList = NULL;

    // define the local list for update_offer_dto->parameter_values
    list_t *parameter_valuesList = NULL;

    // define the local variable for update_offer_dto->basic_price
    update_price_with_discount_dto_t *basic_price_local_nonprim = NULL;

    // define the local variable for update_offer_dto->purchase_price
    base_price_dto_t *purchase_price_local_nonprim = NULL;

    // define the local variable for update_offer_dto->additional_expenses
    base_price_dto_t *additional_expenses_local_nonprim = NULL;

    // define the local variable for update_offer_dto->cofinance_price
    base_price_dto_t *cofinance_price_local_nonprim = NULL;

    // update_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // update_offer_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // update_offer_dto->market_category_id
    cJSON *market_category_id = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "marketCategoryId");
    if (market_category_id) { 
    if(!cJSON_IsNumber(market_category_id))
    {
    goto end; //Numeric
    }
    }

    // update_offer_dto->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "category");
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // update_offer_dto->pictures
    cJSON *pictures = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "pictures");
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

    // update_offer_dto->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "videos");
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

    // update_offer_dto->manuals
    cJSON *manuals = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "manuals");
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

    // update_offer_dto->vendor
    cJSON *vendor = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "vendor");
    if (vendor) { 
    if(!cJSON_IsString(vendor) && !cJSON_IsNull(vendor))
    {
    goto end; //String
    }
    }

    // update_offer_dto->barcodes
    cJSON *barcodes = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "barcodes");
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

    // update_offer_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // update_offer_dto->manufacturer_countries
    cJSON *manufacturer_countries = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "manufacturerCountries");
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

    // update_offer_dto->weight_dimensions
    cJSON *weight_dimensions = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "weightDimensions");
    if (weight_dimensions) { 
    weight_dimensions_local_nonprim = offer_weight_dimensions_dto_parseFromJSON(weight_dimensions); //nonprimitive
    }

    // update_offer_dto->vendor_code
    cJSON *vendor_code = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "vendorCode");
    if (vendor_code) { 
    if(!cJSON_IsString(vendor_code) && !cJSON_IsNull(vendor_code))
    {
    goto end; //String
    }
    }

    // update_offer_dto->tags
    cJSON *tags = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "tags");
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

    // update_offer_dto->shelf_life
    cJSON *shelf_life = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "shelfLife");
    if (shelf_life) { 
    shelf_life_local_nonprim = time_period_dto_parseFromJSON(shelf_life); //nonprimitive
    }

    // update_offer_dto->life_time
    cJSON *life_time = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "lifeTime");
    if (life_time) { 
    life_time_local_nonprim = time_period_dto_parseFromJSON(life_time); //nonprimitive
    }

    // update_offer_dto->guarantee_period
    cJSON *guarantee_period = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "guaranteePeriod");
    if (guarantee_period) { 
    guarantee_period_local_nonprim = time_period_dto_parseFromJSON(guarantee_period); //nonprimitive
    }

    // update_offer_dto->customs_commodity_code
    cJSON *customs_commodity_code = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "customsCommodityCode");
    if (customs_commodity_code) { 
    if(!cJSON_IsString(customs_commodity_code) && !cJSON_IsNull(customs_commodity_code))
    {
    goto end; //String
    }
    }

    // update_offer_dto->certificates
    cJSON *certificates = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "certificates");
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

    // update_offer_dto->box_count
    cJSON *box_count = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "boxCount");
    if (box_count) { 
    if(!cJSON_IsNumber(box_count))
    {
    goto end; //Numeric
    }
    }

    // update_offer_dto->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "condition");
    if (condition) { 
    condition_local_nonprim = offer_condition_dto_parseFromJSON(condition); //nonprimitive
    }

    // update_offer_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = offer_type_parseFromJSON(type); //custom
    }

    // update_offer_dto->downloadable
    cJSON *downloadable = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "downloadable");
    if (downloadable) { 
    if(!cJSON_IsBool(downloadable))
    {
    goto end; //Bool
    }
    }

    // update_offer_dto->adult
    cJSON *adult = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "adult");
    if (adult) { 
    if(!cJSON_IsBool(adult))
    {
    goto end; //Bool
    }
    }

    // update_offer_dto->age
    cJSON *age = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "age");
    if (age) { 
    age_local_nonprim = age_dto_parseFromJSON(age); //nonprimitive
    }

    // update_offer_dto->params
    cJSON *params = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "params");
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

    // update_offer_dto->parameter_values
    cJSON *parameter_values = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "parameterValues");
    if (parameter_values) { 
    cJSON *parameter_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parameter_values)){
        goto end; //nonprimitive container
    }

    parameter_valuesList = list_createList();

    cJSON_ArrayForEach(parameter_values_local_nonprimitive,parameter_values )
    {
        if(!cJSON_IsObject(parameter_values_local_nonprimitive)){
            goto end;
        }
        parameter_value_dto_t *parameter_valuesItem = parameter_value_dto_parseFromJSON(parameter_values_local_nonprimitive);

        list_addElement(parameter_valuesList, parameter_valuesItem);
    }
    }

    // update_offer_dto->basic_price
    cJSON *basic_price = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "basicPrice");
    if (basic_price) { 
    basic_price_local_nonprim = update_price_with_discount_dto_parseFromJSON(basic_price); //nonprimitive
    }

    // update_offer_dto->purchase_price
    cJSON *purchase_price = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "purchasePrice");
    if (purchase_price) { 
    purchase_price_local_nonprim = base_price_dto_parseFromJSON(purchase_price); //nonprimitive
    }

    // update_offer_dto->additional_expenses
    cJSON *additional_expenses = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "additionalExpenses");
    if (additional_expenses) { 
    additional_expenses_local_nonprim = base_price_dto_parseFromJSON(additional_expenses); //nonprimitive
    }

    // update_offer_dto->cofinance_price
    cJSON *cofinance_price = cJSON_GetObjectItemCaseSensitive(update_offer_dtoJSON, "cofinancePrice");
    if (cofinance_price) { 
    cofinance_price_local_nonprim = base_price_dto_parseFromJSON(cofinance_price); //nonprimitive
    }


    update_offer_dto_local_var = update_offer_dto_create (
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
        params ? paramsList : NULL,
        parameter_values ? parameter_valuesList : NULL,
        basic_price ? basic_price_local_nonprim : NULL,
        purchase_price ? purchase_price_local_nonprim : NULL,
        additional_expenses ? additional_expenses_local_nonprim : NULL,
        cofinance_price ? cofinance_price_local_nonprim : NULL
        );

    return update_offer_dto_local_var;
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
    if (parameter_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parameter_valuesList) {
            parameter_value_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parameter_valuesList);
        parameter_valuesList = NULL;
    }
    if (basic_price_local_nonprim) {
        update_price_with_discount_dto_free(basic_price_local_nonprim);
        basic_price_local_nonprim = NULL;
    }
    if (purchase_price_local_nonprim) {
        base_price_dto_free(purchase_price_local_nonprim);
        purchase_price_local_nonprim = NULL;
    }
    if (additional_expenses_local_nonprim) {
        base_price_dto_free(additional_expenses_local_nonprim);
        additional_expenses_local_nonprim = NULL;
    }
    if (cofinance_price_local_nonprim) {
        base_price_dto_free(cofinance_price_local_nonprim);
        cofinance_price_local_nonprim = NULL;
    }
    return NULL;

}
