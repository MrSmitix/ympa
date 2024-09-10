#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_shipment_pallets_count_request.h"



set_shipment_pallets_count_request_t *set_shipment_pallets_count_request_create(
    int places_count
    ) {
    set_shipment_pallets_count_request_t *set_shipment_pallets_count_request_local_var = malloc(sizeof(set_shipment_pallets_count_request_t));
    if (!set_shipment_pallets_count_request_local_var) {
        return NULL;
    }
    set_shipment_pallets_count_request_local_var->places_count = places_count;

    return set_shipment_pallets_count_request_local_var;
}


void set_shipment_pallets_count_request_free(set_shipment_pallets_count_request_t *set_shipment_pallets_count_request) {
    if(NULL == set_shipment_pallets_count_request){
        return ;
    }
    listEntry_t *listEntry;
    free(set_shipment_pallets_count_request);
}

cJSON *set_shipment_pallets_count_request_convertToJSON(set_shipment_pallets_count_request_t *set_shipment_pallets_count_request) {
    cJSON *item = cJSON_CreateObject();

    // set_shipment_pallets_count_request->places_count
    if (!set_shipment_pallets_count_request->places_count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "placesCount", set_shipment_pallets_count_request->places_count) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

set_shipment_pallets_count_request_t *set_shipment_pallets_count_request_parseFromJSON(cJSON *set_shipment_pallets_count_requestJSON){

    set_shipment_pallets_count_request_t *set_shipment_pallets_count_request_local_var = NULL;

    // set_shipment_pallets_count_request->places_count
    cJSON *places_count = cJSON_GetObjectItemCaseSensitive(set_shipment_pallets_count_requestJSON, "placesCount");
    if (!places_count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(places_count))
    {
    goto end; //Numeric
    }


    set_shipment_pallets_count_request_local_var = set_shipment_pallets_count_request_create (
        places_count->valuedouble
        );

    return set_shipment_pallets_count_request_local_var;
end:
    return NULL;

}
