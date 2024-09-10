#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "flipping_pager_dto.h"



flipping_pager_dto_t *flipping_pager_dto_create(
    int total,
    int from,
    int to,
    int current_page,
    int pages_count,
    int page_size
    ) {
    flipping_pager_dto_t *flipping_pager_dto_local_var = malloc(sizeof(flipping_pager_dto_t));
    if (!flipping_pager_dto_local_var) {
        return NULL;
    }
    flipping_pager_dto_local_var->total = total;
    flipping_pager_dto_local_var->from = from;
    flipping_pager_dto_local_var->to = to;
    flipping_pager_dto_local_var->current_page = current_page;
    flipping_pager_dto_local_var->pages_count = pages_count;
    flipping_pager_dto_local_var->page_size = page_size;

    return flipping_pager_dto_local_var;
}


void flipping_pager_dto_free(flipping_pager_dto_t *flipping_pager_dto) {
    if(NULL == flipping_pager_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(flipping_pager_dto);
}

cJSON *flipping_pager_dto_convertToJSON(flipping_pager_dto_t *flipping_pager_dto) {
    cJSON *item = cJSON_CreateObject();

    // flipping_pager_dto->total
    if(flipping_pager_dto->total) {
    if(cJSON_AddNumberToObject(item, "total", flipping_pager_dto->total) == NULL) {
    goto fail; //Numeric
    }
    }


    // flipping_pager_dto->from
    if(flipping_pager_dto->from) {
    if(cJSON_AddNumberToObject(item, "from", flipping_pager_dto->from) == NULL) {
    goto fail; //Numeric
    }
    }


    // flipping_pager_dto->to
    if(flipping_pager_dto->to) {
    if(cJSON_AddNumberToObject(item, "to", flipping_pager_dto->to) == NULL) {
    goto fail; //Numeric
    }
    }


    // flipping_pager_dto->current_page
    if(flipping_pager_dto->current_page) {
    if(cJSON_AddNumberToObject(item, "currentPage", flipping_pager_dto->current_page) == NULL) {
    goto fail; //Numeric
    }
    }


    // flipping_pager_dto->pages_count
    if(flipping_pager_dto->pages_count) {
    if(cJSON_AddNumberToObject(item, "pagesCount", flipping_pager_dto->pages_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // flipping_pager_dto->page_size
    if(flipping_pager_dto->page_size) {
    if(cJSON_AddNumberToObject(item, "pageSize", flipping_pager_dto->page_size) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

flipping_pager_dto_t *flipping_pager_dto_parseFromJSON(cJSON *flipping_pager_dtoJSON){

    flipping_pager_dto_t *flipping_pager_dto_local_var = NULL;

    // flipping_pager_dto->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(flipping_pager_dtoJSON, "total");
    if (total) { 
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }
    }

    // flipping_pager_dto->from
    cJSON *from = cJSON_GetObjectItemCaseSensitive(flipping_pager_dtoJSON, "from");
    if (from) { 
    if(!cJSON_IsNumber(from))
    {
    goto end; //Numeric
    }
    }

    // flipping_pager_dto->to
    cJSON *to = cJSON_GetObjectItemCaseSensitive(flipping_pager_dtoJSON, "to");
    if (to) { 
    if(!cJSON_IsNumber(to))
    {
    goto end; //Numeric
    }
    }

    // flipping_pager_dto->current_page
    cJSON *current_page = cJSON_GetObjectItemCaseSensitive(flipping_pager_dtoJSON, "currentPage");
    if (current_page) { 
    if(!cJSON_IsNumber(current_page))
    {
    goto end; //Numeric
    }
    }

    // flipping_pager_dto->pages_count
    cJSON *pages_count = cJSON_GetObjectItemCaseSensitive(flipping_pager_dtoJSON, "pagesCount");
    if (pages_count) { 
    if(!cJSON_IsNumber(pages_count))
    {
    goto end; //Numeric
    }
    }

    // flipping_pager_dto->page_size
    cJSON *page_size = cJSON_GetObjectItemCaseSensitive(flipping_pager_dtoJSON, "pageSize");
    if (page_size) { 
    if(!cJSON_IsNumber(page_size))
    {
    goto end; //Numeric
    }
    }


    flipping_pager_dto_local_var = flipping_pager_dto_create (
        total ? total->valuedouble : 0,
        from ? from->valuedouble : 0,
        to ? to->valuedouble : 0,
        current_page ? current_page->valuedouble : 0,
        pages_count ? pages_count->valuedouble : 0,
        page_size ? page_size->valuedouble : 0
        );

    return flipping_pager_dto_local_var;
end:
    return NULL;

}
