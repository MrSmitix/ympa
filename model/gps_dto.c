#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gps_dto.h"



gps_dto_t *gps_dto_create(
    double latitude,
    double longitude
    ) {
    gps_dto_t *gps_dto_local_var = malloc(sizeof(gps_dto_t));
    if (!gps_dto_local_var) {
        return NULL;
    }
    gps_dto_local_var->latitude = latitude;
    gps_dto_local_var->longitude = longitude;

    return gps_dto_local_var;
}


void gps_dto_free(gps_dto_t *gps_dto) {
    if(NULL == gps_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(gps_dto);
}

cJSON *gps_dto_convertToJSON(gps_dto_t *gps_dto) {
    cJSON *item = cJSON_CreateObject();

    // gps_dto->latitude
    if (!gps_dto->latitude) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "latitude", gps_dto->latitude) == NULL) {
    goto fail; //Numeric
    }


    // gps_dto->longitude
    if (!gps_dto->longitude) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "longitude", gps_dto->longitude) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

gps_dto_t *gps_dto_parseFromJSON(cJSON *gps_dtoJSON){

    gps_dto_t *gps_dto_local_var = NULL;

    // gps_dto->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(gps_dtoJSON, "latitude");
    if (!latitude) {
        goto end;
    }

    
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // gps_dto->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(gps_dtoJSON, "longitude");
    if (!longitude) {
        goto end;
    }

    
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }


    gps_dto_local_var = gps_dto_create (
        latitude->valuedouble,
        longitude->valuedouble
        );

    return gps_dto_local_var;
end:
    return NULL;

}
