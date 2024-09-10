#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_mass_order_labels_request.h"



generate_mass_order_labels_request_t *generate_mass_order_labels_request_create(
    long business_id,
    list_t *order_ids
    ) {
    generate_mass_order_labels_request_t *generate_mass_order_labels_request_local_var = malloc(sizeof(generate_mass_order_labels_request_t));
    if (!generate_mass_order_labels_request_local_var) {
        return NULL;
    }
    generate_mass_order_labels_request_local_var->business_id = business_id;
    generate_mass_order_labels_request_local_var->order_ids = order_ids;

    return generate_mass_order_labels_request_local_var;
}


void generate_mass_order_labels_request_free(generate_mass_order_labels_request_t *generate_mass_order_labels_request) {
    if(NULL == generate_mass_order_labels_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_mass_order_labels_request->order_ids) {
        list_ForEach(listEntry, generate_mass_order_labels_request->order_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_mass_order_labels_request->order_ids);
        generate_mass_order_labels_request->order_ids = NULL;
    }
    free(generate_mass_order_labels_request);
}

cJSON *generate_mass_order_labels_request_convertToJSON(generate_mass_order_labels_request_t *generate_mass_order_labels_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_mass_order_labels_request->business_id
    if (!generate_mass_order_labels_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_mass_order_labels_request->business_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_mass_order_labels_request->order_ids
    if (!generate_mass_order_labels_request->order_ids) {
        goto fail;
    }
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, generate_mass_order_labels_request->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
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

generate_mass_order_labels_request_t *generate_mass_order_labels_request_parseFromJSON(cJSON *generate_mass_order_labels_requestJSON){

    generate_mass_order_labels_request_t *generate_mass_order_labels_request_local_var = NULL;

    // define the local list for generate_mass_order_labels_request->order_ids
    list_t *order_idsList = NULL;

    // generate_mass_order_labels_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_mass_order_labels_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }

    // generate_mass_order_labels_request->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(generate_mass_order_labels_requestJSON, "orderIds");
    if (!order_ids) {
        goto end;
    }

    
    cJSON *order_ids_local = NULL;
    if(!cJSON_IsArray(order_ids)) {
        goto end;//primitive container
    }
    order_idsList = list_createList();

    cJSON_ArrayForEach(order_ids_local, order_ids)
    {
        if(!cJSON_IsNumber(order_ids_local))
        {
            goto end;
        }
        double *order_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!order_ids_local_value)
        {
            goto end;
        }
        *order_ids_local_value = order_ids_local->valuedouble;
        list_addElement(order_idsList , order_ids_local_value);
    }


    generate_mass_order_labels_request_local_var = generate_mass_order_labels_request_create (
        business_id->valuedouble,
        order_idsList
        );

    return generate_mass_order_labels_request_local_var;
end:
    if (order_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_idsList);
        order_idsList = NULL;
    }
    return NULL;

}
