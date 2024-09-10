#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculate_tariffs_request.h"



calculate_tariffs_request_t *calculate_tariffs_request_create(
    calculate_tariffs_parameters_dto_t *parameters,
    list_t *offers
    ) {
    calculate_tariffs_request_t *calculate_tariffs_request_local_var = malloc(sizeof(calculate_tariffs_request_t));
    if (!calculate_tariffs_request_local_var) {
        return NULL;
    }
    calculate_tariffs_request_local_var->parameters = parameters;
    calculate_tariffs_request_local_var->offers = offers;

    return calculate_tariffs_request_local_var;
}


void calculate_tariffs_request_free(calculate_tariffs_request_t *calculate_tariffs_request) {
    if(NULL == calculate_tariffs_request){
        return ;
    }
    listEntry_t *listEntry;
    if (calculate_tariffs_request->parameters) {
        calculate_tariffs_parameters_dto_free(calculate_tariffs_request->parameters);
        calculate_tariffs_request->parameters = NULL;
    }
    if (calculate_tariffs_request->offers) {
        list_ForEach(listEntry, calculate_tariffs_request->offers) {
            calculate_tariffs_offer_dto_free(listEntry->data);
        }
        list_freeList(calculate_tariffs_request->offers);
        calculate_tariffs_request->offers = NULL;
    }
    free(calculate_tariffs_request);
}

cJSON *calculate_tariffs_request_convertToJSON(calculate_tariffs_request_t *calculate_tariffs_request) {
    cJSON *item = cJSON_CreateObject();

    // calculate_tariffs_request->parameters
    if (!calculate_tariffs_request->parameters) {
        goto fail;
    }
    cJSON *parameters_local_JSON = calculate_tariffs_parameters_dto_convertToJSON(calculate_tariffs_request->parameters);
    if(parameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parameters", parameters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // calculate_tariffs_request->offers
    if (!calculate_tariffs_request->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (calculate_tariffs_request->offers) {
    list_ForEach(offersListEntry, calculate_tariffs_request->offers) {
    cJSON *itemLocal = calculate_tariffs_offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

calculate_tariffs_request_t *calculate_tariffs_request_parseFromJSON(cJSON *calculate_tariffs_requestJSON){

    calculate_tariffs_request_t *calculate_tariffs_request_local_var = NULL;

    // define the local variable for calculate_tariffs_request->parameters
    calculate_tariffs_parameters_dto_t *parameters_local_nonprim = NULL;

    // define the local list for calculate_tariffs_request->offers
    list_t *offersList = NULL;

    // calculate_tariffs_request->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_requestJSON, "parameters");
    if (!parameters) {
        goto end;
    }

    
    parameters_local_nonprim = calculate_tariffs_parameters_dto_parseFromJSON(parameters); //nonprimitive

    // calculate_tariffs_request->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_requestJSON, "offers");
    if (!offers) {
        goto end;
    }

    
    cJSON *offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offers)){
        goto end; //nonprimitive container
    }

    offersList = list_createList();

    cJSON_ArrayForEach(offers_local_nonprimitive,offers )
    {
        if(!cJSON_IsObject(offers_local_nonprimitive)){
            goto end;
        }
        calculate_tariffs_offer_dto_t *offersItem = calculate_tariffs_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    calculate_tariffs_request_local_var = calculate_tariffs_request_create (
        parameters_local_nonprim,
        offersList
        );

    return calculate_tariffs_request_local_var;
end:
    if (parameters_local_nonprim) {
        calculate_tariffs_parameters_dto_free(parameters_local_nonprim);
        parameters_local_nonprim = NULL;
    }
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            calculate_tariffs_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
