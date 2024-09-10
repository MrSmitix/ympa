#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_address_dto.h"



order_delivery_address_dto_t *order_delivery_address_dto_create(
    char *country,
    char *postcode,
    char *city,
    char *district,
    char *subway,
    char *street,
    char *house,
    char *block,
    char *entrance,
    char *entryphone,
    char *floor,
    char *apartment,
    char *phone,
    char *recipient,
    gps_dto_t *gps
    ) {
    order_delivery_address_dto_t *order_delivery_address_dto_local_var = malloc(sizeof(order_delivery_address_dto_t));
    if (!order_delivery_address_dto_local_var) {
        return NULL;
    }
    order_delivery_address_dto_local_var->country = country;
    order_delivery_address_dto_local_var->postcode = postcode;
    order_delivery_address_dto_local_var->city = city;
    order_delivery_address_dto_local_var->district = district;
    order_delivery_address_dto_local_var->subway = subway;
    order_delivery_address_dto_local_var->street = street;
    order_delivery_address_dto_local_var->house = house;
    order_delivery_address_dto_local_var->block = block;
    order_delivery_address_dto_local_var->entrance = entrance;
    order_delivery_address_dto_local_var->entryphone = entryphone;
    order_delivery_address_dto_local_var->floor = floor;
    order_delivery_address_dto_local_var->apartment = apartment;
    order_delivery_address_dto_local_var->phone = phone;
    order_delivery_address_dto_local_var->recipient = recipient;
    order_delivery_address_dto_local_var->gps = gps;

    return order_delivery_address_dto_local_var;
}


void order_delivery_address_dto_free(order_delivery_address_dto_t *order_delivery_address_dto) {
    if(NULL == order_delivery_address_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_delivery_address_dto->country) {
        free(order_delivery_address_dto->country);
        order_delivery_address_dto->country = NULL;
    }
    if (order_delivery_address_dto->postcode) {
        free(order_delivery_address_dto->postcode);
        order_delivery_address_dto->postcode = NULL;
    }
    if (order_delivery_address_dto->city) {
        free(order_delivery_address_dto->city);
        order_delivery_address_dto->city = NULL;
    }
    if (order_delivery_address_dto->district) {
        free(order_delivery_address_dto->district);
        order_delivery_address_dto->district = NULL;
    }
    if (order_delivery_address_dto->subway) {
        free(order_delivery_address_dto->subway);
        order_delivery_address_dto->subway = NULL;
    }
    if (order_delivery_address_dto->street) {
        free(order_delivery_address_dto->street);
        order_delivery_address_dto->street = NULL;
    }
    if (order_delivery_address_dto->house) {
        free(order_delivery_address_dto->house);
        order_delivery_address_dto->house = NULL;
    }
    if (order_delivery_address_dto->block) {
        free(order_delivery_address_dto->block);
        order_delivery_address_dto->block = NULL;
    }
    if (order_delivery_address_dto->entrance) {
        free(order_delivery_address_dto->entrance);
        order_delivery_address_dto->entrance = NULL;
    }
    if (order_delivery_address_dto->entryphone) {
        free(order_delivery_address_dto->entryphone);
        order_delivery_address_dto->entryphone = NULL;
    }
    if (order_delivery_address_dto->floor) {
        free(order_delivery_address_dto->floor);
        order_delivery_address_dto->floor = NULL;
    }
    if (order_delivery_address_dto->apartment) {
        free(order_delivery_address_dto->apartment);
        order_delivery_address_dto->apartment = NULL;
    }
    if (order_delivery_address_dto->phone) {
        free(order_delivery_address_dto->phone);
        order_delivery_address_dto->phone = NULL;
    }
    if (order_delivery_address_dto->recipient) {
        free(order_delivery_address_dto->recipient);
        order_delivery_address_dto->recipient = NULL;
    }
    if (order_delivery_address_dto->gps) {
        gps_dto_free(order_delivery_address_dto->gps);
        order_delivery_address_dto->gps = NULL;
    }
    free(order_delivery_address_dto);
}

cJSON *order_delivery_address_dto_convertToJSON(order_delivery_address_dto_t *order_delivery_address_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_delivery_address_dto->country
    if(order_delivery_address_dto->country) {
    if(cJSON_AddStringToObject(item, "country", order_delivery_address_dto->country) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->postcode
    if(order_delivery_address_dto->postcode) {
    if(cJSON_AddStringToObject(item, "postcode", order_delivery_address_dto->postcode) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->city
    if(order_delivery_address_dto->city) {
    if(cJSON_AddStringToObject(item, "city", order_delivery_address_dto->city) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->district
    if(order_delivery_address_dto->district) {
    if(cJSON_AddStringToObject(item, "district", order_delivery_address_dto->district) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->subway
    if(order_delivery_address_dto->subway) {
    if(cJSON_AddStringToObject(item, "subway", order_delivery_address_dto->subway) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->street
    if(order_delivery_address_dto->street) {
    if(cJSON_AddStringToObject(item, "street", order_delivery_address_dto->street) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->house
    if(order_delivery_address_dto->house) {
    if(cJSON_AddStringToObject(item, "house", order_delivery_address_dto->house) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->block
    if(order_delivery_address_dto->block) {
    if(cJSON_AddStringToObject(item, "block", order_delivery_address_dto->block) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->entrance
    if(order_delivery_address_dto->entrance) {
    if(cJSON_AddStringToObject(item, "entrance", order_delivery_address_dto->entrance) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->entryphone
    if(order_delivery_address_dto->entryphone) {
    if(cJSON_AddStringToObject(item, "entryphone", order_delivery_address_dto->entryphone) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->floor
    if(order_delivery_address_dto->floor) {
    if(cJSON_AddStringToObject(item, "floor", order_delivery_address_dto->floor) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->apartment
    if(order_delivery_address_dto->apartment) {
    if(cJSON_AddStringToObject(item, "apartment", order_delivery_address_dto->apartment) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->phone
    if(order_delivery_address_dto->phone) {
    if(cJSON_AddStringToObject(item, "phone", order_delivery_address_dto->phone) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->recipient
    if(order_delivery_address_dto->recipient) {
    if(cJSON_AddStringToObject(item, "recipient", order_delivery_address_dto->recipient) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_address_dto->gps
    if(order_delivery_address_dto->gps) {
    cJSON *gps_local_JSON = gps_dto_convertToJSON(order_delivery_address_dto->gps);
    if(gps_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gps", gps_local_JSON);
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

order_delivery_address_dto_t *order_delivery_address_dto_parseFromJSON(cJSON *order_delivery_address_dtoJSON){

    order_delivery_address_dto_t *order_delivery_address_dto_local_var = NULL;

    // define the local variable for order_delivery_address_dto->gps
    gps_dto_t *gps_local_nonprim = NULL;

    // order_delivery_address_dto->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "country");
    if (country) { 
    if(!cJSON_IsString(country) && !cJSON_IsNull(country))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->postcode
    cJSON *postcode = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "postcode");
    if (postcode) { 
    if(!cJSON_IsString(postcode) && !cJSON_IsNull(postcode))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "city");
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->district
    cJSON *district = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "district");
    if (district) { 
    if(!cJSON_IsString(district) && !cJSON_IsNull(district))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->subway
    cJSON *subway = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "subway");
    if (subway) { 
    if(!cJSON_IsString(subway) && !cJSON_IsNull(subway))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->street
    cJSON *street = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "street");
    if (street) { 
    if(!cJSON_IsString(street) && !cJSON_IsNull(street))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->house
    cJSON *house = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "house");
    if (house) { 
    if(!cJSON_IsString(house) && !cJSON_IsNull(house))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->block
    cJSON *block = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "block");
    if (block) { 
    if(!cJSON_IsString(block) && !cJSON_IsNull(block))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->entrance
    cJSON *entrance = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "entrance");
    if (entrance) { 
    if(!cJSON_IsString(entrance) && !cJSON_IsNull(entrance))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->entryphone
    cJSON *entryphone = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "entryphone");
    if (entryphone) { 
    if(!cJSON_IsString(entryphone) && !cJSON_IsNull(entryphone))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->floor
    cJSON *floor = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "floor");
    if (floor) { 
    if(!cJSON_IsString(floor) && !cJSON_IsNull(floor))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->apartment
    cJSON *apartment = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "apartment");
    if (apartment) { 
    if(!cJSON_IsString(apartment) && !cJSON_IsNull(apartment))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->phone
    cJSON *phone = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "phone");
    if (phone) { 
    if(!cJSON_IsString(phone) && !cJSON_IsNull(phone))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->recipient
    cJSON *recipient = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "recipient");
    if (recipient) { 
    if(!cJSON_IsString(recipient) && !cJSON_IsNull(recipient))
    {
    goto end; //String
    }
    }

    // order_delivery_address_dto->gps
    cJSON *gps = cJSON_GetObjectItemCaseSensitive(order_delivery_address_dtoJSON, "gps");
    if (gps) { 
    gps_local_nonprim = gps_dto_parseFromJSON(gps); //nonprimitive
    }


    order_delivery_address_dto_local_var = order_delivery_address_dto_create (
        country && !cJSON_IsNull(country) ? strdup(country->valuestring) : NULL,
        postcode && !cJSON_IsNull(postcode) ? strdup(postcode->valuestring) : NULL,
        city && !cJSON_IsNull(city) ? strdup(city->valuestring) : NULL,
        district && !cJSON_IsNull(district) ? strdup(district->valuestring) : NULL,
        subway && !cJSON_IsNull(subway) ? strdup(subway->valuestring) : NULL,
        street && !cJSON_IsNull(street) ? strdup(street->valuestring) : NULL,
        house && !cJSON_IsNull(house) ? strdup(house->valuestring) : NULL,
        block && !cJSON_IsNull(block) ? strdup(block->valuestring) : NULL,
        entrance && !cJSON_IsNull(entrance) ? strdup(entrance->valuestring) : NULL,
        entryphone && !cJSON_IsNull(entryphone) ? strdup(entryphone->valuestring) : NULL,
        floor && !cJSON_IsNull(floor) ? strdup(floor->valuestring) : NULL,
        apartment && !cJSON_IsNull(apartment) ? strdup(apartment->valuestring) : NULL,
        phone && !cJSON_IsNull(phone) ? strdup(phone->valuestring) : NULL,
        recipient && !cJSON_IsNull(recipient) ? strdup(recipient->valuestring) : NULL,
        gps ? gps_local_nonprim : NULL
        );

    return order_delivery_address_dto_local_var;
end:
    if (gps_local_nonprim) {
        gps_dto_free(gps_local_nonprim);
        gps_local_nonprim = NULL;
    }
    return NULL;

}
