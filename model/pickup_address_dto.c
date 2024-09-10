#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pickup_address_dto.h"



pickup_address_dto_t *pickup_address_dto_create(
    char *country,
    char *city,
    char *street,
    char *house,
    char *postcode
    ) {
    pickup_address_dto_t *pickup_address_dto_local_var = malloc(sizeof(pickup_address_dto_t));
    if (!pickup_address_dto_local_var) {
        return NULL;
    }
    pickup_address_dto_local_var->country = country;
    pickup_address_dto_local_var->city = city;
    pickup_address_dto_local_var->street = street;
    pickup_address_dto_local_var->house = house;
    pickup_address_dto_local_var->postcode = postcode;

    return pickup_address_dto_local_var;
}


void pickup_address_dto_free(pickup_address_dto_t *pickup_address_dto) {
    if(NULL == pickup_address_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (pickup_address_dto->country) {
        free(pickup_address_dto->country);
        pickup_address_dto->country = NULL;
    }
    if (pickup_address_dto->city) {
        free(pickup_address_dto->city);
        pickup_address_dto->city = NULL;
    }
    if (pickup_address_dto->street) {
        free(pickup_address_dto->street);
        pickup_address_dto->street = NULL;
    }
    if (pickup_address_dto->house) {
        free(pickup_address_dto->house);
        pickup_address_dto->house = NULL;
    }
    if (pickup_address_dto->postcode) {
        free(pickup_address_dto->postcode);
        pickup_address_dto->postcode = NULL;
    }
    free(pickup_address_dto);
}

cJSON *pickup_address_dto_convertToJSON(pickup_address_dto_t *pickup_address_dto) {
    cJSON *item = cJSON_CreateObject();

    // pickup_address_dto->country
    if(pickup_address_dto->country) {
    if(cJSON_AddStringToObject(item, "country", pickup_address_dto->country) == NULL) {
    goto fail; //String
    }
    }


    // pickup_address_dto->city
    if(pickup_address_dto->city) {
    if(cJSON_AddStringToObject(item, "city", pickup_address_dto->city) == NULL) {
    goto fail; //String
    }
    }


    // pickup_address_dto->street
    if(pickup_address_dto->street) {
    if(cJSON_AddStringToObject(item, "street", pickup_address_dto->street) == NULL) {
    goto fail; //String
    }
    }


    // pickup_address_dto->house
    if(pickup_address_dto->house) {
    if(cJSON_AddStringToObject(item, "house", pickup_address_dto->house) == NULL) {
    goto fail; //String
    }
    }


    // pickup_address_dto->postcode
    if(pickup_address_dto->postcode) {
    if(cJSON_AddStringToObject(item, "postcode", pickup_address_dto->postcode) == NULL) {
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

pickup_address_dto_t *pickup_address_dto_parseFromJSON(cJSON *pickup_address_dtoJSON){

    pickup_address_dto_t *pickup_address_dto_local_var = NULL;

    // pickup_address_dto->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(pickup_address_dtoJSON, "country");
    if (country) { 
    if(!cJSON_IsString(country) && !cJSON_IsNull(country))
    {
    goto end; //String
    }
    }

    // pickup_address_dto->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(pickup_address_dtoJSON, "city");
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // pickup_address_dto->street
    cJSON *street = cJSON_GetObjectItemCaseSensitive(pickup_address_dtoJSON, "street");
    if (street) { 
    if(!cJSON_IsString(street) && !cJSON_IsNull(street))
    {
    goto end; //String
    }
    }

    // pickup_address_dto->house
    cJSON *house = cJSON_GetObjectItemCaseSensitive(pickup_address_dtoJSON, "house");
    if (house) { 
    if(!cJSON_IsString(house) && !cJSON_IsNull(house))
    {
    goto end; //String
    }
    }

    // pickup_address_dto->postcode
    cJSON *postcode = cJSON_GetObjectItemCaseSensitive(pickup_address_dtoJSON, "postcode");
    if (postcode) { 
    if(!cJSON_IsString(postcode) && !cJSON_IsNull(postcode))
    {
    goto end; //String
    }
    }


    pickup_address_dto_local_var = pickup_address_dto_create (
        country && !cJSON_IsNull(country) ? strdup(country->valuestring) : NULL,
        city && !cJSON_IsNull(city) ? strdup(city->valuestring) : NULL,
        street && !cJSON_IsNull(street) ? strdup(street->valuestring) : NULL,
        house && !cJSON_IsNull(house) ? strdup(house->valuestring) : NULL,
        postcode && !cJSON_IsNull(postcode) ? strdup(postcode->valuestring) : NULL
        );

    return pickup_address_dto_local_var;
end:
    return NULL;

}
