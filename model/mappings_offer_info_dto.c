#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mappings_offer_info_dto.h"


char* mappings_offer_info_dto_supply_schedule_days_ToString(_api__mappings_offer_info_dto__e supply_schedule_days) {
    char *supply_schedule_daysArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    return supply_schedule_daysArray[supply_schedule_days - 1];
}

_api__mappings_offer_info_dto__e mappings_offer_info_dto_supply_schedule_days_FromString(char* supply_schedule_days) {
    int stringToReturn = 0;
    char *supply_schedule_daysArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    size_t sizeofArray = sizeof(supply_schedule_daysArray) / sizeof(supply_schedule_daysArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(supply_schedule_days, supply_schedule_daysArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* mappings_offer_info_dto_availability_ToString(_api__mappings_offer_info_dto__e availability) {
    char* availabilityArray[] =  { "NULL", "ACTIVE", "INACTIVE", "DELISTED" };
    return availabilityArray[availability];
}

_api__mappings_offer_info_dto__e mappings_offer_info_dto_availability_FromString(char* availability){
    int stringToReturn = 0;
    char *availabilityArray[] =  { "NULL", "ACTIVE", "INACTIVE", "DELISTED" };
    size_t sizeofArray = sizeof(availabilityArray) / sizeof(availabilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(availability, availabilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

mappings_offer_info_dto_t *mappings_offer_info_dto_create(
    char *name,
    char *shop_sku,
    char *category,
    char *vendor,
    char *vendor_code,
    char *description,
    char *id,
    long feed_id,
    list_t *barcodes,
    list_t *urls,
    list_t *pictures,
    char *manufacturer,
    list_t *manufacturer_countries,
    int min_shipment,
    int transport_unit_size,
    int quantum_of_supply,
    int delivery_duration_days,
    int box_count,
    list_t *customs_commodity_codes,
    offer_weight_dimensions_dto_t *weight_dimensions,
    list_t *supply_schedule_days,
    int shelf_life_days,
    int life_time_days,
    int guarantee_period_days,
    offer_processing_state_dto_t *processing_state,
    offer_availability_status_type_t *availability,
    time_period_dto_t *shelf_life,
    time_period_dto_t *life_time,
    time_period_dto_t *guarantee_period,
    char *certificate
    ) {
    mappings_offer_info_dto_t *mappings_offer_info_dto_local_var = malloc(sizeof(mappings_offer_info_dto_t));
    if (!mappings_offer_info_dto_local_var) {
        return NULL;
    }
    mappings_offer_info_dto_local_var->name = name;
    mappings_offer_info_dto_local_var->shop_sku = shop_sku;
    mappings_offer_info_dto_local_var->category = category;
    mappings_offer_info_dto_local_var->vendor = vendor;
    mappings_offer_info_dto_local_var->vendor_code = vendor_code;
    mappings_offer_info_dto_local_var->description = description;
    mappings_offer_info_dto_local_var->id = id;
    mappings_offer_info_dto_local_var->feed_id = feed_id;
    mappings_offer_info_dto_local_var->barcodes = barcodes;
    mappings_offer_info_dto_local_var->urls = urls;
    mappings_offer_info_dto_local_var->pictures = pictures;
    mappings_offer_info_dto_local_var->manufacturer = manufacturer;
    mappings_offer_info_dto_local_var->manufacturer_countries = manufacturer_countries;
    mappings_offer_info_dto_local_var->min_shipment = min_shipment;
    mappings_offer_info_dto_local_var->transport_unit_size = transport_unit_size;
    mappings_offer_info_dto_local_var->quantum_of_supply = quantum_of_supply;
    mappings_offer_info_dto_local_var->delivery_duration_days = delivery_duration_days;
    mappings_offer_info_dto_local_var->box_count = box_count;
    mappings_offer_info_dto_local_var->customs_commodity_codes = customs_commodity_codes;
    mappings_offer_info_dto_local_var->weight_dimensions = weight_dimensions;
    mappings_offer_info_dto_local_var->supply_schedule_days = supply_schedule_days;
    mappings_offer_info_dto_local_var->shelf_life_days = shelf_life_days;
    mappings_offer_info_dto_local_var->life_time_days = life_time_days;
    mappings_offer_info_dto_local_var->guarantee_period_days = guarantee_period_days;
    mappings_offer_info_dto_local_var->processing_state = processing_state;
    mappings_offer_info_dto_local_var->availability = availability;
    mappings_offer_info_dto_local_var->shelf_life = shelf_life;
    mappings_offer_info_dto_local_var->life_time = life_time;
    mappings_offer_info_dto_local_var->guarantee_period = guarantee_period;
    mappings_offer_info_dto_local_var->certificate = certificate;

    return mappings_offer_info_dto_local_var;
}


void mappings_offer_info_dto_free(mappings_offer_info_dto_t *mappings_offer_info_dto) {
    if(NULL == mappings_offer_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (mappings_offer_info_dto->name) {
        free(mappings_offer_info_dto->name);
        mappings_offer_info_dto->name = NULL;
    }
    if (mappings_offer_info_dto->shop_sku) {
        free(mappings_offer_info_dto->shop_sku);
        mappings_offer_info_dto->shop_sku = NULL;
    }
    if (mappings_offer_info_dto->category) {
        free(mappings_offer_info_dto->category);
        mappings_offer_info_dto->category = NULL;
    }
    if (mappings_offer_info_dto->vendor) {
        free(mappings_offer_info_dto->vendor);
        mappings_offer_info_dto->vendor = NULL;
    }
    if (mappings_offer_info_dto->vendor_code) {
        free(mappings_offer_info_dto->vendor_code);
        mappings_offer_info_dto->vendor_code = NULL;
    }
    if (mappings_offer_info_dto->description) {
        free(mappings_offer_info_dto->description);
        mappings_offer_info_dto->description = NULL;
    }
    if (mappings_offer_info_dto->id) {
        free(mappings_offer_info_dto->id);
        mappings_offer_info_dto->id = NULL;
    }
    if (mappings_offer_info_dto->barcodes) {
        list_ForEach(listEntry, mappings_offer_info_dto->barcodes) {
            free(listEntry->data);
        }
        list_freeList(mappings_offer_info_dto->barcodes);
        mappings_offer_info_dto->barcodes = NULL;
    }
    if (mappings_offer_info_dto->urls) {
        list_ForEach(listEntry, mappings_offer_info_dto->urls) {
            free(listEntry->data);
        }
        list_freeList(mappings_offer_info_dto->urls);
        mappings_offer_info_dto->urls = NULL;
    }
    if (mappings_offer_info_dto->pictures) {
        list_ForEach(listEntry, mappings_offer_info_dto->pictures) {
            free(listEntry->data);
        }
        list_freeList(mappings_offer_info_dto->pictures);
        mappings_offer_info_dto->pictures = NULL;
    }
    if (mappings_offer_info_dto->manufacturer) {
        free(mappings_offer_info_dto->manufacturer);
        mappings_offer_info_dto->manufacturer = NULL;
    }
    if (mappings_offer_info_dto->manufacturer_countries) {
        list_ForEach(listEntry, mappings_offer_info_dto->manufacturer_countries) {
            free(listEntry->data);
        }
        list_freeList(mappings_offer_info_dto->manufacturer_countries);
        mappings_offer_info_dto->manufacturer_countries = NULL;
    }
    if (mappings_offer_info_dto->customs_commodity_codes) {
        list_ForEach(listEntry, mappings_offer_info_dto->customs_commodity_codes) {
            free(listEntry->data);
        }
        list_freeList(mappings_offer_info_dto->customs_commodity_codes);
        mappings_offer_info_dto->customs_commodity_codes = NULL;
    }
    if (mappings_offer_info_dto->weight_dimensions) {
        offer_weight_dimensions_dto_free(mappings_offer_info_dto->weight_dimensions);
        mappings_offer_info_dto->weight_dimensions = NULL;
    }
    if (mappings_offer_info_dto->supply_schedule_days) {
        list_ForEach(listEntry, mappings_offer_info_dto->supply_schedule_days) {
            day_of_week_type_free(listEntry->data);
        }
        list_freeList(mappings_offer_info_dto->supply_schedule_days);
        mappings_offer_info_dto->supply_schedule_days = NULL;
    }
    if (mappings_offer_info_dto->processing_state) {
        offer_processing_state_dto_free(mappings_offer_info_dto->processing_state);
        mappings_offer_info_dto->processing_state = NULL;
    }
    if (mappings_offer_info_dto->availability) {
        offer_availability_status_type_free(mappings_offer_info_dto->availability);
        mappings_offer_info_dto->availability = NULL;
    }
    if (mappings_offer_info_dto->shelf_life) {
        time_period_dto_free(mappings_offer_info_dto->shelf_life);
        mappings_offer_info_dto->shelf_life = NULL;
    }
    if (mappings_offer_info_dto->life_time) {
        time_period_dto_free(mappings_offer_info_dto->life_time);
        mappings_offer_info_dto->life_time = NULL;
    }
    if (mappings_offer_info_dto->guarantee_period) {
        time_period_dto_free(mappings_offer_info_dto->guarantee_period);
        mappings_offer_info_dto->guarantee_period = NULL;
    }
    if (mappings_offer_info_dto->certificate) {
        free(mappings_offer_info_dto->certificate);
        mappings_offer_info_dto->certificate = NULL;
    }
    free(mappings_offer_info_dto);
}

cJSON *mappings_offer_info_dto_convertToJSON(mappings_offer_info_dto_t *mappings_offer_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // mappings_offer_info_dto->name
    if(mappings_offer_info_dto->name) {
    if(cJSON_AddStringToObject(item, "name", mappings_offer_info_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->shop_sku
    if(mappings_offer_info_dto->shop_sku) {
    if(cJSON_AddStringToObject(item, "shopSku", mappings_offer_info_dto->shop_sku) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->category
    if(mappings_offer_info_dto->category) {
    if(cJSON_AddStringToObject(item, "category", mappings_offer_info_dto->category) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->vendor
    if(mappings_offer_info_dto->vendor) {
    if(cJSON_AddStringToObject(item, "vendor", mappings_offer_info_dto->vendor) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->vendor_code
    if(mappings_offer_info_dto->vendor_code) {
    if(cJSON_AddStringToObject(item, "vendorCode", mappings_offer_info_dto->vendor_code) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->description
    if(mappings_offer_info_dto->description) {
    if(cJSON_AddStringToObject(item, "description", mappings_offer_info_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->id
    if(mappings_offer_info_dto->id) {
    if(cJSON_AddStringToObject(item, "id", mappings_offer_info_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->feed_id
    if(mappings_offer_info_dto->feed_id) {
    if(cJSON_AddNumberToObject(item, "feedId", mappings_offer_info_dto->feed_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->barcodes
    if(mappings_offer_info_dto->barcodes) {
    cJSON *barcodes = cJSON_AddArrayToObject(item, "barcodes");
    if(barcodes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *barcodesListEntry;
    list_ForEach(barcodesListEntry, mappings_offer_info_dto->barcodes) {
    if(cJSON_AddStringToObject(barcodes, "", (char*)barcodesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mappings_offer_info_dto->urls
    if(mappings_offer_info_dto->urls) {
    cJSON *urls = cJSON_AddArrayToObject(item, "urls");
    if(urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *urlsListEntry;
    list_ForEach(urlsListEntry, mappings_offer_info_dto->urls) {
    if(cJSON_AddStringToObject(urls, "", (char*)urlsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mappings_offer_info_dto->pictures
    if(mappings_offer_info_dto->pictures) {
    cJSON *pictures = cJSON_AddArrayToObject(item, "pictures");
    if(pictures == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *picturesListEntry;
    list_ForEach(picturesListEntry, mappings_offer_info_dto->pictures) {
    if(cJSON_AddStringToObject(pictures, "", (char*)picturesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mappings_offer_info_dto->manufacturer
    if(mappings_offer_info_dto->manufacturer) {
    if(cJSON_AddStringToObject(item, "manufacturer", mappings_offer_info_dto->manufacturer) == NULL) {
    goto fail; //String
    }
    }


    // mappings_offer_info_dto->manufacturer_countries
    if(mappings_offer_info_dto->manufacturer_countries) {
    cJSON *manufacturer_countries = cJSON_AddArrayToObject(item, "manufacturerCountries");
    if(manufacturer_countries == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *manufacturer_countriesListEntry;
    list_ForEach(manufacturer_countriesListEntry, mappings_offer_info_dto->manufacturer_countries) {
    if(cJSON_AddStringToObject(manufacturer_countries, "", (char*)manufacturer_countriesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mappings_offer_info_dto->min_shipment
    if(mappings_offer_info_dto->min_shipment) {
    if(cJSON_AddNumberToObject(item, "minShipment", mappings_offer_info_dto->min_shipment) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->transport_unit_size
    if(mappings_offer_info_dto->transport_unit_size) {
    if(cJSON_AddNumberToObject(item, "transportUnitSize", mappings_offer_info_dto->transport_unit_size) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->quantum_of_supply
    if(mappings_offer_info_dto->quantum_of_supply) {
    if(cJSON_AddNumberToObject(item, "quantumOfSupply", mappings_offer_info_dto->quantum_of_supply) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->delivery_duration_days
    if(mappings_offer_info_dto->delivery_duration_days) {
    if(cJSON_AddNumberToObject(item, "deliveryDurationDays", mappings_offer_info_dto->delivery_duration_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->box_count
    if(mappings_offer_info_dto->box_count) {
    if(cJSON_AddNumberToObject(item, "boxCount", mappings_offer_info_dto->box_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->customs_commodity_codes
    if(mappings_offer_info_dto->customs_commodity_codes) {
    cJSON *customs_commodity_codes = cJSON_AddArrayToObject(item, "customsCommodityCodes");
    if(customs_commodity_codes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *customs_commodity_codesListEntry;
    list_ForEach(customs_commodity_codesListEntry, mappings_offer_info_dto->customs_commodity_codes) {
    if(cJSON_AddStringToObject(customs_commodity_codes, "", (char*)customs_commodity_codesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // mappings_offer_info_dto->weight_dimensions
    if(mappings_offer_info_dto->weight_dimensions) {
    cJSON *weight_dimensions_local_JSON = offer_weight_dimensions_dto_convertToJSON(mappings_offer_info_dto->weight_dimensions);
    if(weight_dimensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "weightDimensions", weight_dimensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // mappings_offer_info_dto->supply_schedule_days
    if(mappings_offer_info_dto->supply_schedule_days != _api__mappings_offer_info_dto_SUPPLYSCHEDULEDAYS_NULL) {
    cJSON *supply_schedule_days = cJSON_AddArrayToObject(item, "supplyScheduleDays");
    if(supply_schedule_days == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *supply_schedule_daysListEntry;
    if (mappings_offer_info_dto->supply_schedule_days) {
    list_ForEach(supply_schedule_daysListEntry, mappings_offer_info_dto->supply_schedule_days) {
    cJSON *itemLocal = day_of_week_type_convertToJSON((_api__mappings_offer_info_dto__e)supply_schedule_daysListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(supply_schedule_days, itemLocal);
    }
    }
    }


    // mappings_offer_info_dto->shelf_life_days
    if(mappings_offer_info_dto->shelf_life_days) {
    if(cJSON_AddNumberToObject(item, "shelfLifeDays", mappings_offer_info_dto->shelf_life_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->life_time_days
    if(mappings_offer_info_dto->life_time_days) {
    if(cJSON_AddNumberToObject(item, "lifeTimeDays", mappings_offer_info_dto->life_time_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->guarantee_period_days
    if(mappings_offer_info_dto->guarantee_period_days) {
    if(cJSON_AddNumberToObject(item, "guaranteePeriodDays", mappings_offer_info_dto->guarantee_period_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // mappings_offer_info_dto->processing_state
    if(mappings_offer_info_dto->processing_state) {
    cJSON *processing_state_local_JSON = offer_processing_state_dto_convertToJSON(mappings_offer_info_dto->processing_state);
    if(processing_state_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "processingState", processing_state_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // mappings_offer_info_dto->availability
    if(mappings_offer_info_dto->availability != _api__mappings_offer_info_dto__NULL) {
    cJSON *availability_local_JSON = offer_availability_status_type_convertToJSON(mappings_offer_info_dto->availability);
    if(availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "availability", availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // mappings_offer_info_dto->shelf_life
    if(mappings_offer_info_dto->shelf_life) {
    cJSON *shelf_life_local_JSON = time_period_dto_convertToJSON(mappings_offer_info_dto->shelf_life);
    if(shelf_life_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shelfLife", shelf_life_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // mappings_offer_info_dto->life_time
    if(mappings_offer_info_dto->life_time) {
    cJSON *life_time_local_JSON = time_period_dto_convertToJSON(mappings_offer_info_dto->life_time);
    if(life_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "lifeTime", life_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // mappings_offer_info_dto->guarantee_period
    if(mappings_offer_info_dto->guarantee_period) {
    cJSON *guarantee_period_local_JSON = time_period_dto_convertToJSON(mappings_offer_info_dto->guarantee_period);
    if(guarantee_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "guaranteePeriod", guarantee_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // mappings_offer_info_dto->certificate
    if(mappings_offer_info_dto->certificate) {
    if(cJSON_AddStringToObject(item, "certificate", mappings_offer_info_dto->certificate) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

mappings_offer_info_dto_t *mappings_offer_info_dto_parseFromJSON(cJSON *mappings_offer_info_dtoJSON){

    mappings_offer_info_dto_t *mappings_offer_info_dto_local_var = NULL;

    // define the local list for mappings_offer_info_dto->barcodes
    list_t *barcodesList = NULL;

    // define the local list for mappings_offer_info_dto->urls
    list_t *urlsList = NULL;

    // define the local list for mappings_offer_info_dto->pictures
    list_t *picturesList = NULL;

    // define the local list for mappings_offer_info_dto->manufacturer_countries
    list_t *manufacturer_countriesList = NULL;

    // define the local list for mappings_offer_info_dto->customs_commodity_codes
    list_t *customs_commodity_codesList = NULL;

    // define the local variable for mappings_offer_info_dto->weight_dimensions
    offer_weight_dimensions_dto_t *weight_dimensions_local_nonprim = NULL;

    // define the local list for mappings_offer_info_dto->supply_schedule_days
    list_t *supply_schedule_daysList = NULL;

    // define the local variable for mappings_offer_info_dto->processing_state
    offer_processing_state_dto_t *processing_state_local_nonprim = NULL;

    // define the local variable for mappings_offer_info_dto->availability
    offer_availability_status_type_t *availability_local_nonprim = NULL;

    // define the local variable for mappings_offer_info_dto->shelf_life
    time_period_dto_t *shelf_life_local_nonprim = NULL;

    // define the local variable for mappings_offer_info_dto->life_time
    time_period_dto_t *life_time_local_nonprim = NULL;

    // define the local variable for mappings_offer_info_dto->guarantee_period
    time_period_dto_t *guarantee_period_local_nonprim = NULL;

    // mappings_offer_info_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->shop_sku
    cJSON *shop_sku = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "shopSku");
    if (shop_sku) { 
    if(!cJSON_IsString(shop_sku) && !cJSON_IsNull(shop_sku))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "category");
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->vendor
    cJSON *vendor = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "vendor");
    if (vendor) { 
    if(!cJSON_IsString(vendor) && !cJSON_IsNull(vendor))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->vendor_code
    cJSON *vendor_code = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "vendorCode");
    if (vendor_code) { 
    if(!cJSON_IsString(vendor_code) && !cJSON_IsNull(vendor_code))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "feedId");
    if (feed_id) { 
    if(!cJSON_IsNumber(feed_id))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->barcodes
    cJSON *barcodes = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "barcodes");
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

    // mappings_offer_info_dto->urls
    cJSON *urls = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "urls");
    if (urls) { 
    cJSON *urls_local = NULL;
    if(!cJSON_IsArray(urls)) {
        goto end;//primitive container
    }
    urlsList = list_createList();

    cJSON_ArrayForEach(urls_local, urls)
    {
        if(!cJSON_IsString(urls_local))
        {
            goto end;
        }
        list_addElement(urlsList , strdup(urls_local->valuestring));
    }
    }

    // mappings_offer_info_dto->pictures
    cJSON *pictures = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "pictures");
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

    // mappings_offer_info_dto->manufacturer
    cJSON *manufacturer = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "manufacturer");
    if (manufacturer) { 
    if(!cJSON_IsString(manufacturer) && !cJSON_IsNull(manufacturer))
    {
    goto end; //String
    }
    }

    // mappings_offer_info_dto->manufacturer_countries
    cJSON *manufacturer_countries = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "manufacturerCountries");
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

    // mappings_offer_info_dto->min_shipment
    cJSON *min_shipment = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "minShipment");
    if (min_shipment) { 
    if(!cJSON_IsNumber(min_shipment))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->transport_unit_size
    cJSON *transport_unit_size = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "transportUnitSize");
    if (transport_unit_size) { 
    if(!cJSON_IsNumber(transport_unit_size))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->quantum_of_supply
    cJSON *quantum_of_supply = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "quantumOfSupply");
    if (quantum_of_supply) { 
    if(!cJSON_IsNumber(quantum_of_supply))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->delivery_duration_days
    cJSON *delivery_duration_days = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "deliveryDurationDays");
    if (delivery_duration_days) { 
    if(!cJSON_IsNumber(delivery_duration_days))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->box_count
    cJSON *box_count = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "boxCount");
    if (box_count) { 
    if(!cJSON_IsNumber(box_count))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->customs_commodity_codes
    cJSON *customs_commodity_codes = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "customsCommodityCodes");
    if (customs_commodity_codes) { 
    cJSON *customs_commodity_codes_local = NULL;
    if(!cJSON_IsArray(customs_commodity_codes)) {
        goto end;//primitive container
    }
    customs_commodity_codesList = list_createList();

    cJSON_ArrayForEach(customs_commodity_codes_local, customs_commodity_codes)
    {
        if(!cJSON_IsString(customs_commodity_codes_local))
        {
            goto end;
        }
        list_addElement(customs_commodity_codesList , strdup(customs_commodity_codes_local->valuestring));
    }
    }

    // mappings_offer_info_dto->weight_dimensions
    cJSON *weight_dimensions = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "weightDimensions");
    if (weight_dimensions) { 
    weight_dimensions_local_nonprim = offer_weight_dimensions_dto_parseFromJSON(weight_dimensions); //nonprimitive
    }

    // mappings_offer_info_dto->supply_schedule_days
    cJSON *supply_schedule_days = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "supplyScheduleDays");
    if (supply_schedule_days) { 
    cJSON *supply_schedule_days_local_nonprimitive = NULL;
    if(!cJSON_IsArray(supply_schedule_days)){
        goto end; //nonprimitive container
    }

    supply_schedule_daysList = list_createList();

    cJSON_ArrayForEach(supply_schedule_days_local_nonprimitive,supply_schedule_days )
    {
        if(!cJSON_IsObject(supply_schedule_days_local_nonprimitive)){
            goto end;
        }
        mappings_offer_info_dto_day_of_week_type_e supply_schedule_daysItem = day_of_week_type_parseFromJSON(supply_schedule_days_local_nonprimitive);

        list_addElement(supply_schedule_daysList, (void *)supply_schedule_daysItem);
    }
    }

    // mappings_offer_info_dto->shelf_life_days
    cJSON *shelf_life_days = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "shelfLifeDays");
    if (shelf_life_days) { 
    if(!cJSON_IsNumber(shelf_life_days))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->life_time_days
    cJSON *life_time_days = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "lifeTimeDays");
    if (life_time_days) { 
    if(!cJSON_IsNumber(life_time_days))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->guarantee_period_days
    cJSON *guarantee_period_days = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "guaranteePeriodDays");
    if (guarantee_period_days) { 
    if(!cJSON_IsNumber(guarantee_period_days))
    {
    goto end; //Numeric
    }
    }

    // mappings_offer_info_dto->processing_state
    cJSON *processing_state = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "processingState");
    if (processing_state) { 
    processing_state_local_nonprim = offer_processing_state_dto_parseFromJSON(processing_state); //nonprimitive
    }

    // mappings_offer_info_dto->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "availability");
    if (availability) { 
    availability_local_nonprim = offer_availability_status_type_parseFromJSON(availability); //custom
    }

    // mappings_offer_info_dto->shelf_life
    cJSON *shelf_life = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "shelfLife");
    if (shelf_life) { 
    shelf_life_local_nonprim = time_period_dto_parseFromJSON(shelf_life); //nonprimitive
    }

    // mappings_offer_info_dto->life_time
    cJSON *life_time = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "lifeTime");
    if (life_time) { 
    life_time_local_nonprim = time_period_dto_parseFromJSON(life_time); //nonprimitive
    }

    // mappings_offer_info_dto->guarantee_period
    cJSON *guarantee_period = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "guaranteePeriod");
    if (guarantee_period) { 
    guarantee_period_local_nonprim = time_period_dto_parseFromJSON(guarantee_period); //nonprimitive
    }

    // mappings_offer_info_dto->certificate
    cJSON *certificate = cJSON_GetObjectItemCaseSensitive(mappings_offer_info_dtoJSON, "certificate");
    if (certificate) { 
    if(!cJSON_IsString(certificate) && !cJSON_IsNull(certificate))
    {
    goto end; //String
    }
    }


    mappings_offer_info_dto_local_var = mappings_offer_info_dto_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        shop_sku && !cJSON_IsNull(shop_sku) ? strdup(shop_sku->valuestring) : NULL,
        category && !cJSON_IsNull(category) ? strdup(category->valuestring) : NULL,
        vendor && !cJSON_IsNull(vendor) ? strdup(vendor->valuestring) : NULL,
        vendor_code && !cJSON_IsNull(vendor_code) ? strdup(vendor_code->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        feed_id ? feed_id->valuedouble : 0,
        barcodes ? barcodesList : NULL,
        urls ? urlsList : NULL,
        pictures ? picturesList : NULL,
        manufacturer && !cJSON_IsNull(manufacturer) ? strdup(manufacturer->valuestring) : NULL,
        manufacturer_countries ? manufacturer_countriesList : NULL,
        min_shipment ? min_shipment->valuedouble : 0,
        transport_unit_size ? transport_unit_size->valuedouble : 0,
        quantum_of_supply ? quantum_of_supply->valuedouble : 0,
        delivery_duration_days ? delivery_duration_days->valuedouble : 0,
        box_count ? box_count->valuedouble : 0,
        customs_commodity_codes ? customs_commodity_codesList : NULL,
        weight_dimensions ? weight_dimensions_local_nonprim : NULL,
        supply_schedule_days ? supply_schedule_daysList : NULL,
        shelf_life_days ? shelf_life_days->valuedouble : 0,
        life_time_days ? life_time_days->valuedouble : 0,
        guarantee_period_days ? guarantee_period_days->valuedouble : 0,
        processing_state ? processing_state_local_nonprim : NULL,
        availability ? availability_local_nonprim : NULL,
        shelf_life ? shelf_life_local_nonprim : NULL,
        life_time ? life_time_local_nonprim : NULL,
        guarantee_period ? guarantee_period_local_nonprim : NULL,
        certificate && !cJSON_IsNull(certificate) ? strdup(certificate->valuestring) : NULL
        );

    return mappings_offer_info_dto_local_var;
end:
    if (barcodesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, barcodesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(barcodesList);
        barcodesList = NULL;
    }
    if (urlsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, urlsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(urlsList);
        urlsList = NULL;
    }
    if (picturesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, picturesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(picturesList);
        picturesList = NULL;
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
    if (customs_commodity_codesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, customs_commodity_codesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(customs_commodity_codesList);
        customs_commodity_codesList = NULL;
    }
    if (weight_dimensions_local_nonprim) {
        offer_weight_dimensions_dto_free(weight_dimensions_local_nonprim);
        weight_dimensions_local_nonprim = NULL;
    }
    if (supply_schedule_daysList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, supply_schedule_daysList) {
            day_of_week_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(supply_schedule_daysList);
        supply_schedule_daysList = NULL;
    }
    if (processing_state_local_nonprim) {
        offer_processing_state_dto_free(processing_state_local_nonprim);
        processing_state_local_nonprim = NULL;
    }
    if (availability_local_nonprim) {
        offer_availability_status_type_free(availability_local_nonprim);
        availability_local_nonprim = NULL;
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
    return NULL;

}
