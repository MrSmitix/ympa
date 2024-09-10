#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_order_delivery_date_request.h"


char* set_order_delivery_date_request_reason_ToString(_api__set_order_delivery_date_request__e reason) {
    char* reasonArray[] =  { "NULL", "USER_MOVED_DELIVERY_DATES", "PARTNER_MOVED_DELIVERY_DATES" };
    return reasonArray[reason];
}

_api__set_order_delivery_date_request__e set_order_delivery_date_request_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "USER_MOVED_DELIVERY_DATES", "PARTNER_MOVED_DELIVERY_DATES" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

set_order_delivery_date_request_t *set_order_delivery_date_request_create(
    order_delivery_date_dto_t *dates,
    order_delivery_date_reason_type_t *reason
    ) {
    set_order_delivery_date_request_t *set_order_delivery_date_request_local_var = malloc(sizeof(set_order_delivery_date_request_t));
    if (!set_order_delivery_date_request_local_var) {
        return NULL;
    }
    set_order_delivery_date_request_local_var->dates = dates;
    set_order_delivery_date_request_local_var->reason = reason;

    return set_order_delivery_date_request_local_var;
}


void set_order_delivery_date_request_free(set_order_delivery_date_request_t *set_order_delivery_date_request) {
    if(NULL == set_order_delivery_date_request){
        return ;
    }
    listEntry_t *listEntry;
    if (set_order_delivery_date_request->dates) {
        order_delivery_date_dto_free(set_order_delivery_date_request->dates);
        set_order_delivery_date_request->dates = NULL;
    }
    if (set_order_delivery_date_request->reason) {
        order_delivery_date_reason_type_free(set_order_delivery_date_request->reason);
        set_order_delivery_date_request->reason = NULL;
    }
    free(set_order_delivery_date_request);
}

cJSON *set_order_delivery_date_request_convertToJSON(set_order_delivery_date_request_t *set_order_delivery_date_request) {
    cJSON *item = cJSON_CreateObject();

    // set_order_delivery_date_request->dates
    if (!set_order_delivery_date_request->dates) {
        goto fail;
    }
    cJSON *dates_local_JSON = order_delivery_date_dto_convertToJSON(set_order_delivery_date_request->dates);
    if(dates_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dates", dates_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // set_order_delivery_date_request->reason
    if (_api__set_order_delivery_date_request__NULL == set_order_delivery_date_request->reason) {
        goto fail;
    }
    cJSON *reason_local_JSON = order_delivery_date_reason_type_convertToJSON(set_order_delivery_date_request->reason);
    if(reason_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reason", reason_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

set_order_delivery_date_request_t *set_order_delivery_date_request_parseFromJSON(cJSON *set_order_delivery_date_requestJSON){

    set_order_delivery_date_request_t *set_order_delivery_date_request_local_var = NULL;

    // define the local variable for set_order_delivery_date_request->dates
    order_delivery_date_dto_t *dates_local_nonprim = NULL;

    // define the local variable for set_order_delivery_date_request->reason
    order_delivery_date_reason_type_t *reason_local_nonprim = NULL;

    // set_order_delivery_date_request->dates
    cJSON *dates = cJSON_GetObjectItemCaseSensitive(set_order_delivery_date_requestJSON, "dates");
    if (!dates) {
        goto end;
    }

    
    dates_local_nonprim = order_delivery_date_dto_parseFromJSON(dates); //nonprimitive

    // set_order_delivery_date_request->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(set_order_delivery_date_requestJSON, "reason");
    if (!reason) {
        goto end;
    }

    
    reason_local_nonprim = order_delivery_date_reason_type_parseFromJSON(reason); //custom


    set_order_delivery_date_request_local_var = set_order_delivery_date_request_create (
        dates_local_nonprim,
        reason_local_nonprim
        );

    return set_order_delivery_date_request_local_var;
end:
    if (dates_local_nonprim) {
        order_delivery_date_dto_free(dates_local_nonprim);
        dates_local_nonprim = NULL;
    }
    if (reason_local_nonprim) {
        order_delivery_date_reason_type_free(reason_local_nonprim);
        reason_local_nonprim = NULL;
    }
    return NULL;

}
