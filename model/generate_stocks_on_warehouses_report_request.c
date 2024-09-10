#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_stocks_on_warehouses_report_request.h"



generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request_create(
    long campaign_id,
    list_t *warehouse_ids,
    char *report_date,
    list_t *category_ids,
    int has_stocks
    ) {
    generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request_local_var = malloc(sizeof(generate_stocks_on_warehouses_report_request_t));
    if (!generate_stocks_on_warehouses_report_request_local_var) {
        return NULL;
    }
    generate_stocks_on_warehouses_report_request_local_var->campaign_id = campaign_id;
    generate_stocks_on_warehouses_report_request_local_var->warehouse_ids = warehouse_ids;
    generate_stocks_on_warehouses_report_request_local_var->report_date = report_date;
    generate_stocks_on_warehouses_report_request_local_var->category_ids = category_ids;
    generate_stocks_on_warehouses_report_request_local_var->has_stocks = has_stocks;

    return generate_stocks_on_warehouses_report_request_local_var;
}


void generate_stocks_on_warehouses_report_request_free(generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request) {
    if(NULL == generate_stocks_on_warehouses_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_stocks_on_warehouses_report_request->warehouse_ids) {
        list_ForEach(listEntry, generate_stocks_on_warehouses_report_request->warehouse_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_stocks_on_warehouses_report_request->warehouse_ids);
        generate_stocks_on_warehouses_report_request->warehouse_ids = NULL;
    }
    if (generate_stocks_on_warehouses_report_request->report_date) {
        free(generate_stocks_on_warehouses_report_request->report_date);
        generate_stocks_on_warehouses_report_request->report_date = NULL;
    }
    if (generate_stocks_on_warehouses_report_request->category_ids) {
        list_ForEach(listEntry, generate_stocks_on_warehouses_report_request->category_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_stocks_on_warehouses_report_request->category_ids);
        generate_stocks_on_warehouses_report_request->category_ids = NULL;
    }
    free(generate_stocks_on_warehouses_report_request);
}

cJSON *generate_stocks_on_warehouses_report_request_convertToJSON(generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_stocks_on_warehouses_report_request->campaign_id
    if (!generate_stocks_on_warehouses_report_request->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", generate_stocks_on_warehouses_report_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_stocks_on_warehouses_report_request->warehouse_ids
    if(generate_stocks_on_warehouses_report_request->warehouse_ids) {
    cJSON *warehouse_ids = cJSON_AddArrayToObject(item, "warehouseIds");
    if(warehouse_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *warehouse_idsListEntry;
    list_ForEach(warehouse_idsListEntry, generate_stocks_on_warehouses_report_request->warehouse_ids) {
    if(cJSON_AddNumberToObject(warehouse_ids, "", *(double *)warehouse_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // generate_stocks_on_warehouses_report_request->report_date
    if(generate_stocks_on_warehouses_report_request->report_date) {
    if(cJSON_AddStringToObject(item, "reportDate", generate_stocks_on_warehouses_report_request->report_date) == NULL) {
    goto fail; //Date
    }
    }


    // generate_stocks_on_warehouses_report_request->category_ids
    if(generate_stocks_on_warehouses_report_request->category_ids) {
    cJSON *category_ids = cJSON_AddArrayToObject(item, "categoryIds");
    if(category_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *category_idsListEntry;
    list_ForEach(category_idsListEntry, generate_stocks_on_warehouses_report_request->category_ids) {
    if(cJSON_AddNumberToObject(category_ids, "", *(double *)category_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // generate_stocks_on_warehouses_report_request->has_stocks
    if(generate_stocks_on_warehouses_report_request->has_stocks) {
    if(cJSON_AddBoolToObject(item, "hasStocks", generate_stocks_on_warehouses_report_request->has_stocks) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request_parseFromJSON(cJSON *generate_stocks_on_warehouses_report_requestJSON){

    generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request_local_var = NULL;

    // define the local list for generate_stocks_on_warehouses_report_request->warehouse_ids
    list_t *warehouse_idsList = NULL;

    // define the local list for generate_stocks_on_warehouses_report_request->category_ids
    list_t *category_idsList = NULL;

    // generate_stocks_on_warehouses_report_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_stocks_on_warehouses_report_requestJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // generate_stocks_on_warehouses_report_request->warehouse_ids
    cJSON *warehouse_ids = cJSON_GetObjectItemCaseSensitive(generate_stocks_on_warehouses_report_requestJSON, "warehouseIds");
    if (warehouse_ids) { 
    cJSON *warehouse_ids_local = NULL;
    if(!cJSON_IsArray(warehouse_ids)) {
        goto end;//primitive container
    }
    warehouse_idsList = list_createList();

    cJSON_ArrayForEach(warehouse_ids_local, warehouse_ids)
    {
        if(!cJSON_IsNumber(warehouse_ids_local))
        {
            goto end;
        }
        double *warehouse_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!warehouse_ids_local_value)
        {
            goto end;
        }
        *warehouse_ids_local_value = warehouse_ids_local->valuedouble;
        list_addElement(warehouse_idsList , warehouse_ids_local_value);
    }
    }

    // generate_stocks_on_warehouses_report_request->report_date
    cJSON *report_date = cJSON_GetObjectItemCaseSensitive(generate_stocks_on_warehouses_report_requestJSON, "reportDate");
    if (report_date) { 
    if(!cJSON_IsString(report_date))
    {
    goto end; //Date
    }
    }

    // generate_stocks_on_warehouses_report_request->category_ids
    cJSON *category_ids = cJSON_GetObjectItemCaseSensitive(generate_stocks_on_warehouses_report_requestJSON, "categoryIds");
    if (category_ids) { 
    cJSON *category_ids_local = NULL;
    if(!cJSON_IsArray(category_ids)) {
        goto end;//primitive container
    }
    category_idsList = list_createList();

    cJSON_ArrayForEach(category_ids_local, category_ids)
    {
        if(!cJSON_IsNumber(category_ids_local))
        {
            goto end;
        }
        double *category_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!category_ids_local_value)
        {
            goto end;
        }
        *category_ids_local_value = category_ids_local->valuedouble;
        list_addElement(category_idsList , category_ids_local_value);
    }
    }

    // generate_stocks_on_warehouses_report_request->has_stocks
    cJSON *has_stocks = cJSON_GetObjectItemCaseSensitive(generate_stocks_on_warehouses_report_requestJSON, "hasStocks");
    if (has_stocks) { 
    if(!cJSON_IsBool(has_stocks))
    {
    goto end; //Bool
    }
    }


    generate_stocks_on_warehouses_report_request_local_var = generate_stocks_on_warehouses_report_request_create (
        campaign_id->valuedouble,
        warehouse_ids ? warehouse_idsList : NULL,
        report_date ? strdup(report_date->valuestring) : NULL,
        category_ids ? category_idsList : NULL,
        has_stocks ? has_stocks->valueint : 0
        );

    return generate_stocks_on_warehouses_report_request_local_var;
end:
    if (warehouse_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehouse_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehouse_idsList);
        warehouse_idsList = NULL;
    }
    if (category_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, category_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(category_idsList);
        category_idsList = NULL;
    }
    return NULL;

}
