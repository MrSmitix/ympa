#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_dto.h"


char* order_delivery_dto_type_ToString(_api__order_delivery_dto__e type) {
    char* typeArray[] =  { "NULL", "DELIVERY", "PICKUP", "POST", "DIGITAL", "UNKNOWN" };
    return typeArray[type];
}

_api__order_delivery_dto__e order_delivery_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "DELIVERY", "PICKUP", "POST", "DIGITAL", "UNKNOWN" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_delivery_dto_delivery_partner_type_ToString(_api__order_delivery_dto__e delivery_partner_type) {
    char* delivery_partner_typeArray[] =  { "NULL", "SHOP", "YANDEX_MARKET", "UNKNOWN" };
    return delivery_partner_typeArray[delivery_partner_type];
}

_api__order_delivery_dto__e order_delivery_dto_delivery_partner_type_FromString(char* delivery_partner_type){
    int stringToReturn = 0;
    char *delivery_partner_typeArray[] =  { "NULL", "SHOP", "YANDEX_MARKET", "UNKNOWN" };
    size_t sizeofArray = sizeof(delivery_partner_typeArray) / sizeof(delivery_partner_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(delivery_partner_type, delivery_partner_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_delivery_dto_vat_ToString(_api__order_delivery_dto__e vat) {
    char* vatArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    return vatArray[vat];
}

_api__order_delivery_dto__e order_delivery_dto_vat_FromString(char* vat){
    int stringToReturn = 0;
    char *vatArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    size_t sizeofArray = sizeof(vatArray) / sizeof(vatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(vat, vatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_delivery_dto_lift_type_ToString(_api__order_delivery_dto__e lift_type) {
    char* lift_typeArray[] =  { "NULL", "NOT_NEEDED", "MANUAL", "ELEVATOR", "CARGO_ELEVATOR", "FREE", "UNKNOWN" };
    return lift_typeArray[lift_type];
}

_api__order_delivery_dto__e order_delivery_dto_lift_type_FromString(char* lift_type){
    int stringToReturn = 0;
    char *lift_typeArray[] =  { "NULL", "NOT_NEEDED", "MANUAL", "ELEVATOR", "CARGO_ELEVATOR", "FREE", "UNKNOWN" };
    size_t sizeofArray = sizeof(lift_typeArray) / sizeof(lift_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(lift_type, lift_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_delivery_dto_dispatch_type_ToString(_api__order_delivery_dto__e dispatch_type) {
    char* dispatch_typeArray[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
    return dispatch_typeArray[dispatch_type];
}

_api__order_delivery_dto__e order_delivery_dto_dispatch_type_FromString(char* dispatch_type){
    int stringToReturn = 0;
    char *dispatch_typeArray[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
    size_t sizeofArray = sizeof(dispatch_typeArray) / sizeof(dispatch_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(dispatch_type, dispatch_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_delivery_dto_eac_type_ToString(_api__order_delivery_dto__e eac_type) {
    char* eac_typeArray[] =  { "NULL", "MERCHANT_TO_COURIER", "COURIER_TO_MERCHANT", "CHECKING_BY_MERCHANT" };
    return eac_typeArray[eac_type];
}

_api__order_delivery_dto__e order_delivery_dto_eac_type_FromString(char* eac_type){
    int stringToReturn = 0;
    char *eac_typeArray[] =  { "NULL", "MERCHANT_TO_COURIER", "COURIER_TO_MERCHANT", "CHECKING_BY_MERCHANT" };
    size_t sizeofArray = sizeof(eac_typeArray) / sizeof(eac_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(eac_type, eac_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

order_delivery_dto_t *order_delivery_dto_create(
    char *id,
    order_delivery_type_t *type,
    char *service_name,
    double price,
    order_delivery_partner_type_t *delivery_partner_type,
    order_courier_dto_t *courier,
    order_delivery_dates_dto_t *dates,
    region_dto_t *region,
    order_delivery_address_dto_t *address,
    order_vat_type_t *vat,
    long delivery_service_id,
    order_lift_type_t *lift_type,
    double lift_price,
    char *outlet_code,
    char *outlet_storage_limit_date,
    order_delivery_dispatch_type_t *dispatch_type,
    list_t *tracks,
    list_t *shipments,
    int estimated,
    order_delivery_eac_type_t *eac_type,
    char *eac_code
    ) {
    order_delivery_dto_t *order_delivery_dto_local_var = malloc(sizeof(order_delivery_dto_t));
    if (!order_delivery_dto_local_var) {
        return NULL;
    }
    order_delivery_dto_local_var->id = id;
    order_delivery_dto_local_var->type = type;
    order_delivery_dto_local_var->service_name = service_name;
    order_delivery_dto_local_var->price = price;
    order_delivery_dto_local_var->delivery_partner_type = delivery_partner_type;
    order_delivery_dto_local_var->courier = courier;
    order_delivery_dto_local_var->dates = dates;
    order_delivery_dto_local_var->region = region;
    order_delivery_dto_local_var->address = address;
    order_delivery_dto_local_var->vat = vat;
    order_delivery_dto_local_var->delivery_service_id = delivery_service_id;
    order_delivery_dto_local_var->lift_type = lift_type;
    order_delivery_dto_local_var->lift_price = lift_price;
    order_delivery_dto_local_var->outlet_code = outlet_code;
    order_delivery_dto_local_var->outlet_storage_limit_date = outlet_storage_limit_date;
    order_delivery_dto_local_var->dispatch_type = dispatch_type;
    order_delivery_dto_local_var->tracks = tracks;
    order_delivery_dto_local_var->shipments = shipments;
    order_delivery_dto_local_var->estimated = estimated;
    order_delivery_dto_local_var->eac_type = eac_type;
    order_delivery_dto_local_var->eac_code = eac_code;

    return order_delivery_dto_local_var;
}


void order_delivery_dto_free(order_delivery_dto_t *order_delivery_dto) {
    if(NULL == order_delivery_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_delivery_dto->id) {
        free(order_delivery_dto->id);
        order_delivery_dto->id = NULL;
    }
    if (order_delivery_dto->type) {
        order_delivery_type_free(order_delivery_dto->type);
        order_delivery_dto->type = NULL;
    }
    if (order_delivery_dto->service_name) {
        free(order_delivery_dto->service_name);
        order_delivery_dto->service_name = NULL;
    }
    if (order_delivery_dto->delivery_partner_type) {
        order_delivery_partner_type_free(order_delivery_dto->delivery_partner_type);
        order_delivery_dto->delivery_partner_type = NULL;
    }
    if (order_delivery_dto->courier) {
        order_courier_dto_free(order_delivery_dto->courier);
        order_delivery_dto->courier = NULL;
    }
    if (order_delivery_dto->dates) {
        order_delivery_dates_dto_free(order_delivery_dto->dates);
        order_delivery_dto->dates = NULL;
    }
    if (order_delivery_dto->region) {
        region_dto_free(order_delivery_dto->region);
        order_delivery_dto->region = NULL;
    }
    if (order_delivery_dto->address) {
        order_delivery_address_dto_free(order_delivery_dto->address);
        order_delivery_dto->address = NULL;
    }
    if (order_delivery_dto->vat) {
        order_vat_type_free(order_delivery_dto->vat);
        order_delivery_dto->vat = NULL;
    }
    if (order_delivery_dto->lift_type) {
        order_lift_type_free(order_delivery_dto->lift_type);
        order_delivery_dto->lift_type = NULL;
    }
    if (order_delivery_dto->outlet_code) {
        free(order_delivery_dto->outlet_code);
        order_delivery_dto->outlet_code = NULL;
    }
    if (order_delivery_dto->outlet_storage_limit_date) {
        free(order_delivery_dto->outlet_storage_limit_date);
        order_delivery_dto->outlet_storage_limit_date = NULL;
    }
    if (order_delivery_dto->dispatch_type) {
        order_delivery_dispatch_type_free(order_delivery_dto->dispatch_type);
        order_delivery_dto->dispatch_type = NULL;
    }
    if (order_delivery_dto->tracks) {
        list_ForEach(listEntry, order_delivery_dto->tracks) {
            order_track_dto_free(listEntry->data);
        }
        list_freeList(order_delivery_dto->tracks);
        order_delivery_dto->tracks = NULL;
    }
    if (order_delivery_dto->shipments) {
        list_ForEach(listEntry, order_delivery_dto->shipments) {
            order_shipment_dto_free(listEntry->data);
        }
        list_freeList(order_delivery_dto->shipments);
        order_delivery_dto->shipments = NULL;
    }
    if (order_delivery_dto->eac_type) {
        order_delivery_eac_type_free(order_delivery_dto->eac_type);
        order_delivery_dto->eac_type = NULL;
    }
    if (order_delivery_dto->eac_code) {
        free(order_delivery_dto->eac_code);
        order_delivery_dto->eac_code = NULL;
    }
    free(order_delivery_dto);
}

cJSON *order_delivery_dto_convertToJSON(order_delivery_dto_t *order_delivery_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_delivery_dto->id
    if(order_delivery_dto->id) {
    if(cJSON_AddStringToObject(item, "id", order_delivery_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dto->type
    if(order_delivery_dto->type != _api__order_delivery_dto__NULL) {
    cJSON *type_local_JSON = order_delivery_type_convertToJSON(order_delivery_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_delivery_dto->service_name
    if(order_delivery_dto->service_name) {
    if(cJSON_AddStringToObject(item, "serviceName", order_delivery_dto->service_name) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dto->price
    if(order_delivery_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", order_delivery_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_delivery_dto->delivery_partner_type
    if(order_delivery_dto->delivery_partner_type != _api__order_delivery_dto__NULL) {
    cJSON *delivery_partner_type_local_JSON = order_delivery_partner_type_convertToJSON(order_delivery_dto->delivery_partner_type);
    if(delivery_partner_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "deliveryPartnerType", delivery_partner_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_delivery_dto->courier
    if(order_delivery_dto->courier) {
    cJSON *courier_local_JSON = order_courier_dto_convertToJSON(order_delivery_dto->courier);
    if(courier_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "courier", courier_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_delivery_dto->dates
    if(order_delivery_dto->dates) {
    cJSON *dates_local_JSON = order_delivery_dates_dto_convertToJSON(order_delivery_dto->dates);
    if(dates_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dates", dates_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_delivery_dto->region
    if(order_delivery_dto->region) {
    cJSON *region_local_JSON = region_dto_convertToJSON(order_delivery_dto->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_delivery_dto->address
    if(order_delivery_dto->address) {
    cJSON *address_local_JSON = order_delivery_address_dto_convertToJSON(order_delivery_dto->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_delivery_dto->vat
    if(order_delivery_dto->vat != _api__order_delivery_dto__NULL) {
    cJSON *vat_local_JSON = order_vat_type_convertToJSON(order_delivery_dto->vat);
    if(vat_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "vat", vat_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_delivery_dto->delivery_service_id
    if(order_delivery_dto->delivery_service_id) {
    if(cJSON_AddNumberToObject(item, "deliveryServiceId", order_delivery_dto->delivery_service_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_delivery_dto->lift_type
    if(order_delivery_dto->lift_type != _api__order_delivery_dto__NULL) {
    cJSON *lift_type_local_JSON = order_lift_type_convertToJSON(order_delivery_dto->lift_type);
    if(lift_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "liftType", lift_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_delivery_dto->lift_price
    if(order_delivery_dto->lift_price) {
    if(cJSON_AddNumberToObject(item, "liftPrice", order_delivery_dto->lift_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_delivery_dto->outlet_code
    if(order_delivery_dto->outlet_code) {
    if(cJSON_AddStringToObject(item, "outletCode", order_delivery_dto->outlet_code) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dto->outlet_storage_limit_date
    if(order_delivery_dto->outlet_storage_limit_date) {
    if(cJSON_AddStringToObject(item, "outletStorageLimitDate", order_delivery_dto->outlet_storage_limit_date) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dto->dispatch_type
    if(order_delivery_dto->dispatch_type != _api__order_delivery_dto__NULL) {
    cJSON *dispatch_type_local_JSON = order_delivery_dispatch_type_convertToJSON(order_delivery_dto->dispatch_type);
    if(dispatch_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "dispatchType", dispatch_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_delivery_dto->tracks
    if(order_delivery_dto->tracks) {
    cJSON *tracks = cJSON_AddArrayToObject(item, "tracks");
    if(tracks == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tracksListEntry;
    if (order_delivery_dto->tracks) {
    list_ForEach(tracksListEntry, order_delivery_dto->tracks) {
    cJSON *itemLocal = order_track_dto_convertToJSON(tracksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tracks, itemLocal);
    }
    }
    }


    // order_delivery_dto->shipments
    if(order_delivery_dto->shipments) {
    cJSON *shipments = cJSON_AddArrayToObject(item, "shipments");
    if(shipments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *shipmentsListEntry;
    if (order_delivery_dto->shipments) {
    list_ForEach(shipmentsListEntry, order_delivery_dto->shipments) {
    cJSON *itemLocal = order_shipment_dto_convertToJSON(shipmentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(shipments, itemLocal);
    }
    }
    }


    // order_delivery_dto->estimated
    if(order_delivery_dto->estimated) {
    if(cJSON_AddBoolToObject(item, "estimated", order_delivery_dto->estimated) == NULL) {
    goto fail; //Bool
    }
    }


    // order_delivery_dto->eac_type
    if(order_delivery_dto->eac_type != _api__order_delivery_dto__NULL) {
    cJSON *eac_type_local_JSON = order_delivery_eac_type_convertToJSON(order_delivery_dto->eac_type);
    if(eac_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "eacType", eac_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_delivery_dto->eac_code
    if(order_delivery_dto->eac_code) {
    if(cJSON_AddStringToObject(item, "eacCode", order_delivery_dto->eac_code) == NULL) {
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

order_delivery_dto_t *order_delivery_dto_parseFromJSON(cJSON *order_delivery_dtoJSON){

    order_delivery_dto_t *order_delivery_dto_local_var = NULL;

    // define the local variable for order_delivery_dto->type
    order_delivery_type_t *type_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->delivery_partner_type
    order_delivery_partner_type_t *delivery_partner_type_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->courier
    order_courier_dto_t *courier_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->dates
    order_delivery_dates_dto_t *dates_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->region
    region_dto_t *region_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->address
    order_delivery_address_dto_t *address_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->vat
    order_vat_type_t *vat_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->lift_type
    order_lift_type_t *lift_type_local_nonprim = NULL;

    // define the local variable for order_delivery_dto->dispatch_type
    order_delivery_dispatch_type_t *dispatch_type_local_nonprim = NULL;

    // define the local list for order_delivery_dto->tracks
    list_t *tracksList = NULL;

    // define the local list for order_delivery_dto->shipments
    list_t *shipmentsList = NULL;

    // define the local variable for order_delivery_dto->eac_type
    order_delivery_eac_type_t *eac_type_local_nonprim = NULL;

    // order_delivery_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // order_delivery_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = order_delivery_type_parseFromJSON(type); //custom
    }

    // order_delivery_dto->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "serviceName");
    if (service_name) { 
    if(!cJSON_IsString(service_name) && !cJSON_IsNull(service_name))
    {
    goto end; //String
    }
    }

    // order_delivery_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // order_delivery_dto->delivery_partner_type
    cJSON *delivery_partner_type = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "deliveryPartnerType");
    if (delivery_partner_type) { 
    delivery_partner_type_local_nonprim = order_delivery_partner_type_parseFromJSON(delivery_partner_type); //custom
    }

    // order_delivery_dto->courier
    cJSON *courier = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "courier");
    if (courier) { 
    courier_local_nonprim = order_courier_dto_parseFromJSON(courier); //nonprimitive
    }

    // order_delivery_dto->dates
    cJSON *dates = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "dates");
    if (dates) { 
    dates_local_nonprim = order_delivery_dates_dto_parseFromJSON(dates); //nonprimitive
    }

    // order_delivery_dto->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "region");
    if (region) { 
    region_local_nonprim = region_dto_parseFromJSON(region); //nonprimitive
    }

    // order_delivery_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "address");
    if (address) { 
    address_local_nonprim = order_delivery_address_dto_parseFromJSON(address); //nonprimitive
    }

    // order_delivery_dto->vat
    cJSON *vat = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "vat");
    if (vat) { 
    vat_local_nonprim = order_vat_type_parseFromJSON(vat); //custom
    }

    // order_delivery_dto->delivery_service_id
    cJSON *delivery_service_id = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "deliveryServiceId");
    if (delivery_service_id) { 
    if(!cJSON_IsNumber(delivery_service_id))
    {
    goto end; //Numeric
    }
    }

    // order_delivery_dto->lift_type
    cJSON *lift_type = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "liftType");
    if (lift_type) { 
    lift_type_local_nonprim = order_lift_type_parseFromJSON(lift_type); //custom
    }

    // order_delivery_dto->lift_price
    cJSON *lift_price = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "liftPrice");
    if (lift_price) { 
    if(!cJSON_IsNumber(lift_price))
    {
    goto end; //Numeric
    }
    }

    // order_delivery_dto->outlet_code
    cJSON *outlet_code = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "outletCode");
    if (outlet_code) { 
    if(!cJSON_IsString(outlet_code) && !cJSON_IsNull(outlet_code))
    {
    goto end; //String
    }
    }

    // order_delivery_dto->outlet_storage_limit_date
    cJSON *outlet_storage_limit_date = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "outletStorageLimitDate");
    if (outlet_storage_limit_date) { 
    if(!cJSON_IsString(outlet_storage_limit_date) && !cJSON_IsNull(outlet_storage_limit_date))
    {
    goto end; //String
    }
    }

    // order_delivery_dto->dispatch_type
    cJSON *dispatch_type = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "dispatchType");
    if (dispatch_type) { 
    dispatch_type_local_nonprim = order_delivery_dispatch_type_parseFromJSON(dispatch_type); //custom
    }

    // order_delivery_dto->tracks
    cJSON *tracks = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "tracks");
    if (tracks) { 
    cJSON *tracks_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tracks)){
        goto end; //nonprimitive container
    }

    tracksList = list_createList();

    cJSON_ArrayForEach(tracks_local_nonprimitive,tracks )
    {
        if(!cJSON_IsObject(tracks_local_nonprimitive)){
            goto end;
        }
        order_track_dto_t *tracksItem = order_track_dto_parseFromJSON(tracks_local_nonprimitive);

        list_addElement(tracksList, tracksItem);
    }
    }

    // order_delivery_dto->shipments
    cJSON *shipments = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "shipments");
    if (shipments) { 
    cJSON *shipments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(shipments)){
        goto end; //nonprimitive container
    }

    shipmentsList = list_createList();

    cJSON_ArrayForEach(shipments_local_nonprimitive,shipments )
    {
        if(!cJSON_IsObject(shipments_local_nonprimitive)){
            goto end;
        }
        order_shipment_dto_t *shipmentsItem = order_shipment_dto_parseFromJSON(shipments_local_nonprimitive);

        list_addElement(shipmentsList, shipmentsItem);
    }
    }

    // order_delivery_dto->estimated
    cJSON *estimated = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "estimated");
    if (estimated) { 
    if(!cJSON_IsBool(estimated))
    {
    goto end; //Bool
    }
    }

    // order_delivery_dto->eac_type
    cJSON *eac_type = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "eacType");
    if (eac_type) { 
    eac_type_local_nonprim = order_delivery_eac_type_parseFromJSON(eac_type); //custom
    }

    // order_delivery_dto->eac_code
    cJSON *eac_code = cJSON_GetObjectItemCaseSensitive(order_delivery_dtoJSON, "eacCode");
    if (eac_code) { 
    if(!cJSON_IsString(eac_code) && !cJSON_IsNull(eac_code))
    {
    goto end; //String
    }
    }


    order_delivery_dto_local_var = order_delivery_dto_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        type ? type_local_nonprim : NULL,
        service_name && !cJSON_IsNull(service_name) ? strdup(service_name->valuestring) : NULL,
        price ? price->valuedouble : 0,
        delivery_partner_type ? delivery_partner_type_local_nonprim : NULL,
        courier ? courier_local_nonprim : NULL,
        dates ? dates_local_nonprim : NULL,
        region ? region_local_nonprim : NULL,
        address ? address_local_nonprim : NULL,
        vat ? vat_local_nonprim : NULL,
        delivery_service_id ? delivery_service_id->valuedouble : 0,
        lift_type ? lift_type_local_nonprim : NULL,
        lift_price ? lift_price->valuedouble : 0,
        outlet_code && !cJSON_IsNull(outlet_code) ? strdup(outlet_code->valuestring) : NULL,
        outlet_storage_limit_date && !cJSON_IsNull(outlet_storage_limit_date) ? strdup(outlet_storage_limit_date->valuestring) : NULL,
        dispatch_type ? dispatch_type_local_nonprim : NULL,
        tracks ? tracksList : NULL,
        shipments ? shipmentsList : NULL,
        estimated ? estimated->valueint : 0,
        eac_type ? eac_type_local_nonprim : NULL,
        eac_code && !cJSON_IsNull(eac_code) ? strdup(eac_code->valuestring) : NULL
        );

    return order_delivery_dto_local_var;
end:
    if (type_local_nonprim) {
        order_delivery_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (delivery_partner_type_local_nonprim) {
        order_delivery_partner_type_free(delivery_partner_type_local_nonprim);
        delivery_partner_type_local_nonprim = NULL;
    }
    if (courier_local_nonprim) {
        order_courier_dto_free(courier_local_nonprim);
        courier_local_nonprim = NULL;
    }
    if (dates_local_nonprim) {
        order_delivery_dates_dto_free(dates_local_nonprim);
        dates_local_nonprim = NULL;
    }
    if (region_local_nonprim) {
        region_dto_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    if (address_local_nonprim) {
        order_delivery_address_dto_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    if (vat_local_nonprim) {
        order_vat_type_free(vat_local_nonprim);
        vat_local_nonprim = NULL;
    }
    if (lift_type_local_nonprim) {
        order_lift_type_free(lift_type_local_nonprim);
        lift_type_local_nonprim = NULL;
    }
    if (dispatch_type_local_nonprim) {
        order_delivery_dispatch_type_free(dispatch_type_local_nonprim);
        dispatch_type_local_nonprim = NULL;
    }
    if (tracksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tracksList) {
            order_track_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tracksList);
        tracksList = NULL;
    }
    if (shipmentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, shipmentsList) {
            order_shipment_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(shipmentsList);
        shipmentsList = NULL;
    }
    if (eac_type_local_nonprim) {
        order_delivery_eac_type_free(eac_type_local_nonprim);
        eac_type_local_nonprim = NULL;
    }
    return NULL;

}
