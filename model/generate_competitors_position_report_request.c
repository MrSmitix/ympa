#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_competitors_position_report_request.h"



generate_competitors_position_report_request_t *generate_competitors_position_report_request_create(
    long business_id,
    long category_id,
    char *date_from,
    char *date_to
    ) {
    generate_competitors_position_report_request_t *generate_competitors_position_report_request_local_var = malloc(sizeof(generate_competitors_position_report_request_t));
    if (!generate_competitors_position_report_request_local_var) {
        return NULL;
    }
    generate_competitors_position_report_request_local_var->business_id = business_id;
    generate_competitors_position_report_request_local_var->category_id = category_id;
    generate_competitors_position_report_request_local_var->date_from = date_from;
    generate_competitors_position_report_request_local_var->date_to = date_to;

    return generate_competitors_position_report_request_local_var;
}


void generate_competitors_position_report_request_free(generate_competitors_position_report_request_t *generate_competitors_position_report_request) {
    if(NULL == generate_competitors_position_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_competitors_position_report_request->date_from) {
        free(generate_competitors_position_report_request->date_from);
        generate_competitors_position_report_request->date_from = NULL;
    }
    if (generate_competitors_position_report_request->date_to) {
        free(generate_competitors_position_report_request->date_to);
        generate_competitors_position_report_request->date_to = NULL;
    }
    free(generate_competitors_position_report_request);
}

cJSON *generate_competitors_position_report_request_convertToJSON(generate_competitors_position_report_request_t *generate_competitors_position_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_competitors_position_report_request->business_id
    if (!generate_competitors_position_report_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_competitors_position_report_request->business_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_competitors_position_report_request->category_id
    if (!generate_competitors_position_report_request->category_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "categoryId", generate_competitors_position_report_request->category_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_competitors_position_report_request->date_from
    if (!generate_competitors_position_report_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", generate_competitors_position_report_request->date_from) == NULL) {
    goto fail; //Date
    }


    // generate_competitors_position_report_request->date_to
    if (!generate_competitors_position_report_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", generate_competitors_position_report_request->date_to) == NULL) {
    goto fail; //Date
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_competitors_position_report_request_t *generate_competitors_position_report_request_parseFromJSON(cJSON *generate_competitors_position_report_requestJSON){

    generate_competitors_position_report_request_t *generate_competitors_position_report_request_local_var = NULL;

    // generate_competitors_position_report_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_competitors_position_report_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }

    // generate_competitors_position_report_request->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(generate_competitors_position_report_requestJSON, "categoryId");
    if (!category_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }

    // generate_competitors_position_report_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_competitors_position_report_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // generate_competitors_position_report_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_competitors_position_report_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }


    generate_competitors_position_report_request_local_var = generate_competitors_position_report_request_create (
        business_id->valuedouble,
        category_id->valuedouble,
        strdup(date_from->valuestring),
        strdup(date_to->valuestring)
        );

    return generate_competitors_position_report_request_local_var;
end:
    return NULL;

}
