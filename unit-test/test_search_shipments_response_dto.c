#ifndef search_shipments_response_dto_TEST
#define search_shipments_response_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define search_shipments_response_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/search_shipments_response_dto.h"
search_shipments_response_dto_t* instantiate_search_shipments_response_dto(int include_optional);

#include "test_forward_scrolling_pager_dto.c"


search_shipments_response_dto_t* instantiate_search_shipments_response_dto(int include_optional) {
  search_shipments_response_dto_t* search_shipments_response_dto = NULL;
  if (include_optional) {
    search_shipments_response_dto = search_shipments_response_dto_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0)
    );
  } else {
    search_shipments_response_dto = search_shipments_response_dto_create(
      list_createList(),
      NULL
    );
  }

  return search_shipments_response_dto;
}


#ifdef search_shipments_response_dto_MAIN

void test_search_shipments_response_dto(int include_optional) {
    search_shipments_response_dto_t* search_shipments_response_dto_1 = instantiate_search_shipments_response_dto(include_optional);

	cJSON* jsonsearch_shipments_response_dto_1 = search_shipments_response_dto_convertToJSON(search_shipments_response_dto_1);
	printf("search_shipments_response_dto :\n%s\n", cJSON_Print(jsonsearch_shipments_response_dto_1));
	search_shipments_response_dto_t* search_shipments_response_dto_2 = search_shipments_response_dto_parseFromJSON(jsonsearch_shipments_response_dto_1);
	cJSON* jsonsearch_shipments_response_dto_2 = search_shipments_response_dto_convertToJSON(search_shipments_response_dto_2);
	printf("repeating search_shipments_response_dto:\n%s\n", cJSON_Print(jsonsearch_shipments_response_dto_2));
}

int main() {
  test_search_shipments_response_dto(1);
  test_search_shipments_response_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // search_shipments_response_dto_MAIN
#endif // search_shipments_response_dto_TEST
