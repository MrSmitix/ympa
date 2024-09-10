#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_united_netting_report_request.h"


char* generate_united_netting_report_request_placement_programs_ToString(_api__generate_united_netting_report_request__e placement_programs) {
    char *placement_programsArray[] =  { "NULL", "FBS", "FBY", "DBS" };
    return placement_programsArray[placement_programs - 1];
}

_api__generate_united_netting_report_request__e generate_united_netting_report_request_placement_programs_FromString(char* placement_programs) {
    int stringToReturn = 0;
    char *placement_programsArray[] =  { "NULL", "FBS", "FBY", "DBS" };
    size_t sizeofArray = sizeof(placement_programsArray) / sizeof(placement_programsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_programs, placement_programsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

generate_united_netting_report_request_t *generate_united_netting_report_request_create(
    long business_id,
    char *date_time_from,
    char *date_time_to,
    char *date_from,
    char *date_to,
    long bank_order_id,
    char *bank_order_date_time,
    list_t *placement_programs,
    list_t *inns,
    list_t *campaign_ids
    ) {
    generate_united_netting_report_request_t *generate_united_netting_report_request_local_var = malloc(sizeof(generate_united_netting_report_request_t));
    if (!generate_united_netting_report_request_local_var) {
        return NULL;
    }
    generate_united_netting_report_request_local_var->business_id = business_id;
    generate_united_netting_report_request_local_var->date_time_from = date_time_from;
    generate_united_netting_report_request_local_var->date_time_to = date_time_to;
    generate_united_netting_report_request_local_var->date_from = date_from;
    generate_united_netting_report_request_local_var->date_to = date_to;
    generate_united_netting_report_request_local_var->bank_order_id = bank_order_id;
    generate_united_netting_report_request_local_var->bank_order_date_time = bank_order_date_time;
    generate_united_netting_report_request_local_var->placement_programs = placement_programs;
    generate_united_netting_report_request_local_var->inns = inns;
    generate_united_netting_report_request_local_var->campaign_ids = campaign_ids;

    return generate_united_netting_report_request_local_var;
}


void generate_united_netting_report_request_free(generate_united_netting_report_request_t *generate_united_netting_report_request) {
    if(NULL == generate_united_netting_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_united_netting_report_request->date_time_from) {
        free(generate_united_netting_report_request->date_time_from);
        generate_united_netting_report_request->date_time_from = NULL;
    }
    if (generate_united_netting_report_request->date_time_to) {
        free(generate_united_netting_report_request->date_time_to);
        generate_united_netting_report_request->date_time_to = NULL;
    }
    if (generate_united_netting_report_request->date_from) {
        free(generate_united_netting_report_request->date_from);
        generate_united_netting_report_request->date_from = NULL;
    }
    if (generate_united_netting_report_request->date_to) {
        free(generate_united_netting_report_request->date_to);
        generate_united_netting_report_request->date_to = NULL;
    }
    if (generate_united_netting_report_request->bank_order_date_time) {
        free(generate_united_netting_report_request->bank_order_date_time);
        generate_united_netting_report_request->bank_order_date_time = NULL;
    }
    if (generate_united_netting_report_request->placement_programs) {
        list_ForEach(listEntry, generate_united_netting_report_request->placement_programs) {
            placement_type_free(listEntry->data);
        }
        list_freeList(generate_united_netting_report_request->placement_programs);
        generate_united_netting_report_request->placement_programs = NULL;
    }
    if (generate_united_netting_report_request->inns) {
        list_ForEach(listEntry, generate_united_netting_report_request->inns) {
            free(listEntry->data);
        }
        list_freeList(generate_united_netting_report_request->inns);
        generate_united_netting_report_request->inns = NULL;
    }
    if (generate_united_netting_report_request->campaign_ids) {
        list_ForEach(listEntry, generate_united_netting_report_request->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_united_netting_report_request->campaign_ids);
        generate_united_netting_report_request->campaign_ids = NULL;
    }
    free(generate_united_netting_report_request);
}

cJSON *generate_united_netting_report_request_convertToJSON(generate_united_netting_report_request_t *generate_united_netting_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_united_netting_report_request->business_id
    if (!generate_united_netting_report_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_united_netting_report_request->business_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_united_netting_report_request->date_time_from
    if(generate_united_netting_report_request->date_time_from) {
    if(cJSON_AddStringToObject(item, "dateTimeFrom", generate_united_netting_report_request->date_time_from) == NULL) {
    goto fail; //Date-Time
    }
    }


    // generate_united_netting_report_request->date_time_to
    if(generate_united_netting_report_request->date_time_to) {
    if(cJSON_AddStringToObject(item, "dateTimeTo", generate_united_netting_report_request->date_time_to) == NULL) {
    goto fail; //Date-Time
    }
    }


    // generate_united_netting_report_request->date_from
    if(generate_united_netting_report_request->date_from) {
    if(cJSON_AddStringToObject(item, "dateFrom", generate_united_netting_report_request->date_from) == NULL) {
    goto fail; //Date
    }
    }


    // generate_united_netting_report_request->date_to
    if(generate_united_netting_report_request->date_to) {
    if(cJSON_AddStringToObject(item, "dateTo", generate_united_netting_report_request->date_to) == NULL) {
    goto fail; //Date
    }
    }


    // generate_united_netting_report_request->bank_order_id
    if(generate_united_netting_report_request->bank_order_id) {
    if(cJSON_AddNumberToObject(item, "bankOrderId", generate_united_netting_report_request->bank_order_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // generate_united_netting_report_request->bank_order_date_time
    if(generate_united_netting_report_request->bank_order_date_time) {
    if(cJSON_AddStringToObject(item, "bankOrderDateTime", generate_united_netting_report_request->bank_order_date_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // generate_united_netting_report_request->placement_programs
    if(generate_united_netting_report_request->placement_programs != _api__generate_united_netting_report_request_PLACEMENTPROGRAMS_NULL) {
    cJSON *placement_programs = cJSON_AddArrayToObject(item, "placementPrograms");
    if(placement_programs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *placement_programsListEntry;
    if (generate_united_netting_report_request->placement_programs) {
    list_ForEach(placement_programsListEntry, generate_united_netting_report_request->placement_programs) {
    cJSON *itemLocal = placement_type_convertToJSON((_api__generate_united_netting_report_request__e)placement_programsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(placement_programs, itemLocal);
    }
    }
    }


    // generate_united_netting_report_request->inns
    if(generate_united_netting_report_request->inns) {
    cJSON *inns = cJSON_AddArrayToObject(item, "inns");
    if(inns == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *innsListEntry;
    list_ForEach(innsListEntry, generate_united_netting_report_request->inns) {
    if(cJSON_AddStringToObject(inns, "", (char*)innsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // generate_united_netting_report_request->campaign_ids
    if(generate_united_netting_report_request->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaignIds");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, generate_united_netting_report_request->campaign_ids) {
    if(cJSON_AddNumberToObject(campaign_ids, "", *(double *)campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_united_netting_report_request_t *generate_united_netting_report_request_parseFromJSON(cJSON *generate_united_netting_report_requestJSON){

    generate_united_netting_report_request_t *generate_united_netting_report_request_local_var = NULL;

    // define the local list for generate_united_netting_report_request->placement_programs
    list_t *placement_programsList = NULL;

    // define the local list for generate_united_netting_report_request->inns
    list_t *innsList = NULL;

    // define the local list for generate_united_netting_report_request->campaign_ids
    list_t *campaign_idsList = NULL;

    // generate_united_netting_report_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }

    // generate_united_netting_report_request->date_time_from
    cJSON *date_time_from = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "dateTimeFrom");
    if (date_time_from) { 
    if(!cJSON_IsString(date_time_from) && !cJSON_IsNull(date_time_from))
    {
    goto end; //DateTime
    }
    }

    // generate_united_netting_report_request->date_time_to
    cJSON *date_time_to = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "dateTimeTo");
    if (date_time_to) { 
    if(!cJSON_IsString(date_time_to) && !cJSON_IsNull(date_time_to))
    {
    goto end; //DateTime
    }
    }

    // generate_united_netting_report_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "dateFrom");
    if (date_from) { 
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }
    }

    // generate_united_netting_report_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "dateTo");
    if (date_to) { 
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }
    }

    // generate_united_netting_report_request->bank_order_id
    cJSON *bank_order_id = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "bankOrderId");
    if (bank_order_id) { 
    if(!cJSON_IsNumber(bank_order_id))
    {
    goto end; //Numeric
    }
    }

    // generate_united_netting_report_request->bank_order_date_time
    cJSON *bank_order_date_time = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "bankOrderDateTime");
    if (bank_order_date_time) { 
    if(!cJSON_IsString(bank_order_date_time) && !cJSON_IsNull(bank_order_date_time))
    {
    goto end; //DateTime
    }
    }

    // generate_united_netting_report_request->placement_programs
    cJSON *placement_programs = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "placementPrograms");
    if (placement_programs) { 
    cJSON *placement_programs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(placement_programs)){
        goto end; //nonprimitive container
    }

    placement_programsList = list_createList();

    cJSON_ArrayForEach(placement_programs_local_nonprimitive,placement_programs )
    {
        if(!cJSON_IsObject(placement_programs_local_nonprimitive)){
            goto end;
        }
        generate_united_netting_report_request_placement_type_e placement_programsItem = placement_type_parseFromJSON(placement_programs_local_nonprimitive);

        list_addElement(placement_programsList, (void *)placement_programsItem);
    }
    }

    // generate_united_netting_report_request->inns
    cJSON *inns = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "inns");
    if (inns) { 
    cJSON *inns_local = NULL;
    if(!cJSON_IsArray(inns)) {
        goto end;//primitive container
    }
    innsList = list_createList();

    cJSON_ArrayForEach(inns_local, inns)
    {
        if(!cJSON_IsString(inns_local))
        {
            goto end;
        }
        list_addElement(innsList , strdup(inns_local->valuestring));
    }
    }

    // generate_united_netting_report_request->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(generate_united_netting_report_requestJSON, "campaignIds");
    if (campaign_ids) { 
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsNumber(campaign_ids_local))
        {
            goto end;
        }
        double *campaign_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!campaign_ids_local_value)
        {
            goto end;
        }
        *campaign_ids_local_value = campaign_ids_local->valuedouble;
        list_addElement(campaign_idsList , campaign_ids_local_value);
    }
    }


    generate_united_netting_report_request_local_var = generate_united_netting_report_request_create (
        business_id->valuedouble,
        date_time_from && !cJSON_IsNull(date_time_from) ? strdup(date_time_from->valuestring) : NULL,
        date_time_to && !cJSON_IsNull(date_time_to) ? strdup(date_time_to->valuestring) : NULL,
        date_from ? strdup(date_from->valuestring) : NULL,
        date_to ? strdup(date_to->valuestring) : NULL,
        bank_order_id ? bank_order_id->valuedouble : 0,
        bank_order_date_time && !cJSON_IsNull(bank_order_date_time) ? strdup(bank_order_date_time->valuestring) : NULL,
        placement_programs ? placement_programsList : NULL,
        inns ? innsList : NULL,
        campaign_ids ? campaign_idsList : NULL
        );

    return generate_united_netting_report_request_local_var;
end:
    if (placement_programsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, placement_programsList) {
            placement_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(placement_programsList);
        placement_programsList = NULL;
    }
    if (innsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, innsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(innsList);
        innsList = NULL;
    }
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    return NULL;

}
