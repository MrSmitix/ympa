#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_goods_realization_report_request.h"



generate_goods_realization_report_request_t *generate_goods_realization_report_request_create(
    long campaign_id,
    int year,
    int month
    ) {
    generate_goods_realization_report_request_t *generate_goods_realization_report_request_local_var = malloc(sizeof(generate_goods_realization_report_request_t));
    if (!generate_goods_realization_report_request_local_var) {
        return NULL;
    }
    generate_goods_realization_report_request_local_var->campaign_id = campaign_id;
    generate_goods_realization_report_request_local_var->year = year;
    generate_goods_realization_report_request_local_var->month = month;

    return generate_goods_realization_report_request_local_var;
}


void generate_goods_realization_report_request_free(generate_goods_realization_report_request_t *generate_goods_realization_report_request) {
    if(NULL == generate_goods_realization_report_request){
        return ;
    }
    listEntry_t *listEntry;
    free(generate_goods_realization_report_request);
}

cJSON *generate_goods_realization_report_request_convertToJSON(generate_goods_realization_report_request_t *generate_goods_realization_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_goods_realization_report_request->campaign_id
    if (!generate_goods_realization_report_request->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", generate_goods_realization_report_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_goods_realization_report_request->year
    if (!generate_goods_realization_report_request->year) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "year", generate_goods_realization_report_request->year) == NULL) {
    goto fail; //Numeric
    }


    // generate_goods_realization_report_request->month
    if (!generate_goods_realization_report_request->month) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "month", generate_goods_realization_report_request->month) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_goods_realization_report_request_t *generate_goods_realization_report_request_parseFromJSON(cJSON *generate_goods_realization_report_requestJSON){

    generate_goods_realization_report_request_t *generate_goods_realization_report_request_local_var = NULL;

    // generate_goods_realization_report_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_goods_realization_report_requestJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // generate_goods_realization_report_request->year
    cJSON *year = cJSON_GetObjectItemCaseSensitive(generate_goods_realization_report_requestJSON, "year");
    if (!year) {
        goto end;
    }

    
    if(!cJSON_IsNumber(year))
    {
    goto end; //Numeric
    }

    // generate_goods_realization_report_request->month
    cJSON *month = cJSON_GetObjectItemCaseSensitive(generate_goods_realization_report_requestJSON, "month");
    if (!month) {
        goto end;
    }

    
    if(!cJSON_IsNumber(month))
    {
    goto end; //Numeric
    }


    generate_goods_realization_report_request_local_var = generate_goods_realization_report_request_create (
        campaign_id->valuedouble,
        year->valuedouble,
        month->valuedouble
        );

    return generate_goods_realization_report_request_local_var;
end:
    return NULL;

}
