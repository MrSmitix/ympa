#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_outlet_response.h"



get_outlet_response_t *get_outlet_response_create(
    full_outlet_dto_t *outlet
    ) {
    get_outlet_response_t *get_outlet_response_local_var = malloc(sizeof(get_outlet_response_t));
    if (!get_outlet_response_local_var) {
        return NULL;
    }
    get_outlet_response_local_var->outlet = outlet;

    return get_outlet_response_local_var;
}


void get_outlet_response_free(get_outlet_response_t *get_outlet_response) {
    if(NULL == get_outlet_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_outlet_response->outlet) {
        full_outlet_dto_free(get_outlet_response->outlet);
        get_outlet_response->outlet = NULL;
    }
    free(get_outlet_response);
}

cJSON *get_outlet_response_convertToJSON(get_outlet_response_t *get_outlet_response) {
    cJSON *item = cJSON_CreateObject();

    // get_outlet_response->outlet
    if(get_outlet_response->outlet) {
    cJSON *outlet_local_JSON = full_outlet_dto_convertToJSON(get_outlet_response->outlet);
    if(outlet_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "outlet", outlet_local_JSON);
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

get_outlet_response_t *get_outlet_response_parseFromJSON(cJSON *get_outlet_responseJSON){

    get_outlet_response_t *get_outlet_response_local_var = NULL;

    // define the local variable for get_outlet_response->outlet
    full_outlet_dto_t *outlet_local_nonprim = NULL;

    // get_outlet_response->outlet
    cJSON *outlet = cJSON_GetObjectItemCaseSensitive(get_outlet_responseJSON, "outlet");
    if (outlet) { 
    outlet_local_nonprim = full_outlet_dto_parseFromJSON(outlet); //nonprimitive
    }


    get_outlet_response_local_var = get_outlet_response_create (
        outlet ? outlet_local_nonprim : NULL
        );

    return get_outlet_response_local_var;
end:
    if (outlet_local_nonprim) {
        full_outlet_dto_free(outlet_local_nonprim);
        outlet_local_nonprim = NULL;
    }
    return NULL;

}
