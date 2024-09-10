#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_shows_sales_report_request.h"


char* generate_shows_sales_report_request_grouping_ToString(_api__generate_shows_sales_report_request__e grouping) {
    char* groupingArray[] =  { "NULL", "CATEGORIES", "OFFERS" };
    return groupingArray[grouping];
}

_api__generate_shows_sales_report_request__e generate_shows_sales_report_request_grouping_FromString(char* grouping){
    int stringToReturn = 0;
    char *groupingArray[] =  { "NULL", "CATEGORIES", "OFFERS" };
    size_t sizeofArray = sizeof(groupingArray) / sizeof(groupingArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(grouping, groupingArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

generate_shows_sales_report_request_t *generate_shows_sales_report_request_create(
    long business_id,
    long campaign_id,
    char *date_from,
    char *date_to,
    shows_sales_grouping_type_t *grouping
    ) {
    generate_shows_sales_report_request_t *generate_shows_sales_report_request_local_var = malloc(sizeof(generate_shows_sales_report_request_t));
    if (!generate_shows_sales_report_request_local_var) {
        return NULL;
    }
    generate_shows_sales_report_request_local_var->business_id = business_id;
    generate_shows_sales_report_request_local_var->campaign_id = campaign_id;
    generate_shows_sales_report_request_local_var->date_from = date_from;
    generate_shows_sales_report_request_local_var->date_to = date_to;
    generate_shows_sales_report_request_local_var->grouping = grouping;

    return generate_shows_sales_report_request_local_var;
}


void generate_shows_sales_report_request_free(generate_shows_sales_report_request_t *generate_shows_sales_report_request) {
    if(NULL == generate_shows_sales_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_shows_sales_report_request->date_from) {
        free(generate_shows_sales_report_request->date_from);
        generate_shows_sales_report_request->date_from = NULL;
    }
    if (generate_shows_sales_report_request->date_to) {
        free(generate_shows_sales_report_request->date_to);
        generate_shows_sales_report_request->date_to = NULL;
    }
    if (generate_shows_sales_report_request->grouping) {
        shows_sales_grouping_type_free(generate_shows_sales_report_request->grouping);
        generate_shows_sales_report_request->grouping = NULL;
    }
    free(generate_shows_sales_report_request);
}

cJSON *generate_shows_sales_report_request_convertToJSON(generate_shows_sales_report_request_t *generate_shows_sales_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_shows_sales_report_request->business_id
    if(generate_shows_sales_report_request->business_id) {
    if(cJSON_AddNumberToObject(item, "businessId", generate_shows_sales_report_request->business_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // generate_shows_sales_report_request->campaign_id
    if(generate_shows_sales_report_request->campaign_id) {
    if(cJSON_AddNumberToObject(item, "campaignId", generate_shows_sales_report_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // generate_shows_sales_report_request->date_from
    if (!generate_shows_sales_report_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", generate_shows_sales_report_request->date_from) == NULL) {
    goto fail; //Date
    }


    // generate_shows_sales_report_request->date_to
    if (!generate_shows_sales_report_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", generate_shows_sales_report_request->date_to) == NULL) {
    goto fail; //Date
    }


    // generate_shows_sales_report_request->grouping
    if (_api__generate_shows_sales_report_request__NULL == generate_shows_sales_report_request->grouping) {
        goto fail;
    }
    cJSON *grouping_local_JSON = shows_sales_grouping_type_convertToJSON(generate_shows_sales_report_request->grouping);
    if(grouping_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grouping", grouping_local_JSON);
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

generate_shows_sales_report_request_t *generate_shows_sales_report_request_parseFromJSON(cJSON *generate_shows_sales_report_requestJSON){

    generate_shows_sales_report_request_t *generate_shows_sales_report_request_local_var = NULL;

    // define the local variable for generate_shows_sales_report_request->grouping
    shows_sales_grouping_type_t *grouping_local_nonprim = NULL;

    // generate_shows_sales_report_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_shows_sales_report_requestJSON, "businessId");
    if (business_id) { 
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }
    }

    // generate_shows_sales_report_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_shows_sales_report_requestJSON, "campaignId");
    if (campaign_id) { 
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }
    }

    // generate_shows_sales_report_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_shows_sales_report_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // generate_shows_sales_report_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_shows_sales_report_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }

    // generate_shows_sales_report_request->grouping
    cJSON *grouping = cJSON_GetObjectItemCaseSensitive(generate_shows_sales_report_requestJSON, "grouping");
    if (!grouping) {
        goto end;
    }

    
    grouping_local_nonprim = shows_sales_grouping_type_parseFromJSON(grouping); //custom


    generate_shows_sales_report_request_local_var = generate_shows_sales_report_request_create (
        business_id ? business_id->valuedouble : 0,
        campaign_id ? campaign_id->valuedouble : 0,
        strdup(date_from->valuestring),
        strdup(date_to->valuestring),
        grouping_local_nonprim
        );

    return generate_shows_sales_report_request_local_var;
end:
    if (grouping_local_nonprim) {
        shows_sales_grouping_type_free(grouping_local_nonprim);
        grouping_local_nonprim = NULL;
    }
    return NULL;

}
