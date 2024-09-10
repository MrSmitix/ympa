#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "suggested_offer_dto.h"



suggested_offer_dto_t *suggested_offer_dto_create(
    char *offer_id,
    char *name,
    char *category,
    char *vendor,
    list_t *barcodes,
    char *description,
    char *vendor_code,
    base_price_dto_t *basic_price
    ) {
    suggested_offer_dto_t *suggested_offer_dto_local_var = malloc(sizeof(suggested_offer_dto_t));
    if (!suggested_offer_dto_local_var) {
        return NULL;
    }
    suggested_offer_dto_local_var->offer_id = offer_id;
    suggested_offer_dto_local_var->name = name;
    suggested_offer_dto_local_var->category = category;
    suggested_offer_dto_local_var->vendor = vendor;
    suggested_offer_dto_local_var->barcodes = barcodes;
    suggested_offer_dto_local_var->description = description;
    suggested_offer_dto_local_var->vendor_code = vendor_code;
    suggested_offer_dto_local_var->basic_price = basic_price;

    return suggested_offer_dto_local_var;
}


void suggested_offer_dto_free(suggested_offer_dto_t *suggested_offer_dto) {
    if(NULL == suggested_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (suggested_offer_dto->offer_id) {
        free(suggested_offer_dto->offer_id);
        suggested_offer_dto->offer_id = NULL;
    }
    if (suggested_offer_dto->name) {
        free(suggested_offer_dto->name);
        suggested_offer_dto->name = NULL;
    }
    if (suggested_offer_dto->category) {
        free(suggested_offer_dto->category);
        suggested_offer_dto->category = NULL;
    }
    if (suggested_offer_dto->vendor) {
        free(suggested_offer_dto->vendor);
        suggested_offer_dto->vendor = NULL;
    }
    if (suggested_offer_dto->barcodes) {
        list_ForEach(listEntry, suggested_offer_dto->barcodes) {
            free(listEntry->data);
        }
        list_freeList(suggested_offer_dto->barcodes);
        suggested_offer_dto->barcodes = NULL;
    }
    if (suggested_offer_dto->description) {
        free(suggested_offer_dto->description);
        suggested_offer_dto->description = NULL;
    }
    if (suggested_offer_dto->vendor_code) {
        free(suggested_offer_dto->vendor_code);
        suggested_offer_dto->vendor_code = NULL;
    }
    if (suggested_offer_dto->basic_price) {
        base_price_dto_free(suggested_offer_dto->basic_price);
        suggested_offer_dto->basic_price = NULL;
    }
    free(suggested_offer_dto);
}

cJSON *suggested_offer_dto_convertToJSON(suggested_offer_dto_t *suggested_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // suggested_offer_dto->offer_id
    if(suggested_offer_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", suggested_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // suggested_offer_dto->name
    if(suggested_offer_dto->name) {
    if(cJSON_AddStringToObject(item, "name", suggested_offer_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // suggested_offer_dto->category
    if(suggested_offer_dto->category) {
    if(cJSON_AddStringToObject(item, "category", suggested_offer_dto->category) == NULL) {
    goto fail; //String
    }
    }


    // suggested_offer_dto->vendor
    if(suggested_offer_dto->vendor) {
    if(cJSON_AddStringToObject(item, "vendor", suggested_offer_dto->vendor) == NULL) {
    goto fail; //String
    }
    }


    // suggested_offer_dto->barcodes
    if(suggested_offer_dto->barcodes) {
    cJSON *barcodes = cJSON_AddArrayToObject(item, "barcodes");
    if(barcodes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *barcodesListEntry;
    list_ForEach(barcodesListEntry, suggested_offer_dto->barcodes) {
    if(cJSON_AddStringToObject(barcodes, "", (char*)barcodesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // suggested_offer_dto->description
    if(suggested_offer_dto->description) {
    if(cJSON_AddStringToObject(item, "description", suggested_offer_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // suggested_offer_dto->vendor_code
    if(suggested_offer_dto->vendor_code) {
    if(cJSON_AddStringToObject(item, "vendorCode", suggested_offer_dto->vendor_code) == NULL) {
    goto fail; //String
    }
    }


    // suggested_offer_dto->basic_price
    if(suggested_offer_dto->basic_price) {
    cJSON *basic_price_local_JSON = base_price_dto_convertToJSON(suggested_offer_dto->basic_price);
    if(basic_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "basicPrice", basic_price_local_JSON);
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

suggested_offer_dto_t *suggested_offer_dto_parseFromJSON(cJSON *suggested_offer_dtoJSON){

    suggested_offer_dto_t *suggested_offer_dto_local_var = NULL;

    // define the local list for suggested_offer_dto->barcodes
    list_t *barcodesList = NULL;

    // define the local variable for suggested_offer_dto->basic_price
    base_price_dto_t *basic_price_local_nonprim = NULL;

    // suggested_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // suggested_offer_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // suggested_offer_dto->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "category");
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // suggested_offer_dto->vendor
    cJSON *vendor = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "vendor");
    if (vendor) { 
    if(!cJSON_IsString(vendor) && !cJSON_IsNull(vendor))
    {
    goto end; //String
    }
    }

    // suggested_offer_dto->barcodes
    cJSON *barcodes = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "barcodes");
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

    // suggested_offer_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // suggested_offer_dto->vendor_code
    cJSON *vendor_code = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "vendorCode");
    if (vendor_code) { 
    if(!cJSON_IsString(vendor_code) && !cJSON_IsNull(vendor_code))
    {
    goto end; //String
    }
    }

    // suggested_offer_dto->basic_price
    cJSON *basic_price = cJSON_GetObjectItemCaseSensitive(suggested_offer_dtoJSON, "basicPrice");
    if (basic_price) { 
    basic_price_local_nonprim = base_price_dto_parseFromJSON(basic_price); //nonprimitive
    }


    suggested_offer_dto_local_var = suggested_offer_dto_create (
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        category && !cJSON_IsNull(category) ? strdup(category->valuestring) : NULL,
        vendor && !cJSON_IsNull(vendor) ? strdup(vendor->valuestring) : NULL,
        barcodes ? barcodesList : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        vendor_code && !cJSON_IsNull(vendor_code) ? strdup(vendor_code->valuestring) : NULL,
        basic_price ? basic_price_local_nonprim : NULL
        );

    return suggested_offer_dto_local_var;
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
    if (basic_price_local_nonprim) {
        base_price_dto_free(basic_price_local_nonprim);
        basic_price_local_nonprim = NULL;
    }
    return NULL;

}
