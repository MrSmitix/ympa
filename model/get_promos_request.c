#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promos_request.h"


char* get_promos_request_participation_ToString(_api__get_promos_request__e participation) {
    char* participationArray[] =  { "NULL", "PARTICIPATING_NOW", "PARTICIPATED" };
    return participationArray[participation];
}

_api__get_promos_request__e get_promos_request_participation_FromString(char* participation){
    int stringToReturn = 0;
    char *participationArray[] =  { "NULL", "PARTICIPATING_NOW", "PARTICIPATED" };
    size_t sizeofArray = sizeof(participationArray) / sizeof(participationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(participation, participationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* get_promos_request_mechanics_ToString(_api__get_promos_request__e mechanics) {
    char* mechanicsArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_FLASH", "MARKET_PROMOCODE" };
    return mechanicsArray[mechanics];
}

_api__get_promos_request__e get_promos_request_mechanics_FromString(char* mechanics){
    int stringToReturn = 0;
    char *mechanicsArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_FLASH", "MARKET_PROMOCODE" };
    size_t sizeofArray = sizeof(mechanicsArray) / sizeof(mechanicsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mechanics, mechanicsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_promos_request_t *get_promos_request_create(
    promo_participation_type_t *participation,
    mechanics_type_t *mechanics
    ) {
    get_promos_request_t *get_promos_request_local_var = malloc(sizeof(get_promos_request_t));
    if (!get_promos_request_local_var) {
        return NULL;
    }
    get_promos_request_local_var->participation = participation;
    get_promos_request_local_var->mechanics = mechanics;

    return get_promos_request_local_var;
}


void get_promos_request_free(get_promos_request_t *get_promos_request) {
    if(NULL == get_promos_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promos_request->participation) {
        promo_participation_type_free(get_promos_request->participation);
        get_promos_request->participation = NULL;
    }
    if (get_promos_request->mechanics) {
        mechanics_type_free(get_promos_request->mechanics);
        get_promos_request->mechanics = NULL;
    }
    free(get_promos_request);
}

cJSON *get_promos_request_convertToJSON(get_promos_request_t *get_promos_request) {
    cJSON *item = cJSON_CreateObject();

    // get_promos_request->participation
    if(get_promos_request->participation != _api__get_promos_request__NULL) {
    cJSON *participation_local_JSON = promo_participation_type_convertToJSON(get_promos_request->participation);
    if(participation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "participation", participation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_promos_request->mechanics
    if(get_promos_request->mechanics != _api__get_promos_request__NULL) {
    cJSON *mechanics_local_JSON = mechanics_type_convertToJSON(get_promos_request->mechanics);
    if(mechanics_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "mechanics", mechanics_local_JSON);
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

get_promos_request_t *get_promos_request_parseFromJSON(cJSON *get_promos_requestJSON){

    get_promos_request_t *get_promos_request_local_var = NULL;

    // define the local variable for get_promos_request->participation
    promo_participation_type_t *participation_local_nonprim = NULL;

    // define the local variable for get_promos_request->mechanics
    mechanics_type_t *mechanics_local_nonprim = NULL;

    // get_promos_request->participation
    cJSON *participation = cJSON_GetObjectItemCaseSensitive(get_promos_requestJSON, "participation");
    if (participation) { 
    participation_local_nonprim = promo_participation_type_parseFromJSON(participation); //custom
    }

    // get_promos_request->mechanics
    cJSON *mechanics = cJSON_GetObjectItemCaseSensitive(get_promos_requestJSON, "mechanics");
    if (mechanics) { 
    mechanics_local_nonprim = mechanics_type_parseFromJSON(mechanics); //custom
    }


    get_promos_request_local_var = get_promos_request_create (
        participation ? participation_local_nonprim : NULL,
        mechanics ? mechanics_local_nonprim : NULL
        );

    return get_promos_request_local_var;
end:
    if (participation_local_nonprim) {
        promo_participation_type_free(participation_local_nonprim);
        participation_local_nonprim = NULL;
    }
    if (mechanics_local_nonprim) {
        mechanics_type_free(mechanics_local_nonprim);
        mechanics_local_nonprim = NULL;
    }
    return NULL;

}
