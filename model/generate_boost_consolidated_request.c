#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_boost_consolidated_request.h"



generate_boost_consolidated_request_t *generate_boost_consolidated_request_create(
    long business_id,
    char *date_from,
    char *date_to
    ) {
    generate_boost_consolidated_request_t *generate_boost_consolidated_request_local_var = malloc(sizeof(generate_boost_consolidated_request_t));
    if (!generate_boost_consolidated_request_local_var) {
        return NULL;
    }
    generate_boost_consolidated_request_local_var->business_id = business_id;
    generate_boost_consolidated_request_local_var->date_from = date_from;
    generate_boost_consolidated_request_local_var->date_to = date_to;

    return generate_boost_consolidated_request_local_var;
}


void generate_boost_consolidated_request_free(generate_boost_consolidated_request_t *generate_boost_consolidated_request) {
    if(NULL == generate_boost_consolidated_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_boost_consolidated_request->date_from) {
        free(generate_boost_consolidated_request->date_from);
        generate_boost_consolidated_request->date_from = NULL;
    }
    if (generate_boost_consolidated_request->date_to) {
        free(generate_boost_consolidated_request->date_to);
        generate_boost_consolidated_request->date_to = NULL;
    }
    free(generate_boost_consolidated_request);
}

cJSON *generate_boost_consolidated_request_convertToJSON(generate_boost_consolidated_request_t *generate_boost_consolidated_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_boost_consolidated_request->business_id
    if (!generate_boost_consolidated_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_boost_consolidated_request->business_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_boost_consolidated_request->date_from
    if (!generate_boost_consolidated_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", generate_boost_consolidated_request->date_from) == NULL) {
    goto fail; //Date
    }


    // generate_boost_consolidated_request->date_to
    if (!generate_boost_consolidated_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", generate_boost_consolidated_request->date_to) == NULL) {
    goto fail; //Date
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_boost_consolidated_request_t *generate_boost_consolidated_request_parseFromJSON(cJSON *generate_boost_consolidated_requestJSON){

    generate_boost_consolidated_request_t *generate_boost_consolidated_request_local_var = NULL;

    // generate_boost_consolidated_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_boost_consolidated_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }

    // generate_boost_consolidated_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_boost_consolidated_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // generate_boost_consolidated_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_boost_consolidated_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }


    generate_boost_consolidated_request_local_var = generate_boost_consolidated_request_create (
        business_id->valuedouble,
        strdup(date_from->valuestring),
        strdup(date_to->valuestring)
        );

    return generate_boost_consolidated_request_local_var;
end:
    return NULL;

}
