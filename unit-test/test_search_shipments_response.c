#ifndef search_shipments_response_TEST
#define search_shipments_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define search_shipments_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/search_shipments_response.h"
search_shipments_response_t* instantiate_search_shipments_response(int include_optional);

#include "test_search_shipments_response_dto.c"


search_shipments_response_t* instantiate_search_shipments_response(int include_optional) {
  search_shipments_response_t* search_shipments_response = NULL;
  if (include_optional) {
    search_shipments_response = search_shipments_response_create(
      _api__search_shipments_response__OK,
       // false, not to have infinite recursion
      instantiate_search_shipments_response_dto(0)
    );
  } else {
    search_shipments_response = search_shipments_response_create(
      _api__search_shipments_response__OK,
      NULL
    );
  }

  return search_shipments_response;
}


#ifdef search_shipments_response_MAIN

void test_search_shipments_response(int include_optional) {
    search_shipments_response_t* search_shipments_response_1 = instantiate_search_shipments_response(include_optional);

	cJSON* jsonsearch_shipments_response_1 = search_shipments_response_convertToJSON(search_shipments_response_1);
	printf("search_shipments_response :\n%s\n", cJSON_Print(jsonsearch_shipments_response_1));
	search_shipments_response_t* search_shipments_response_2 = search_shipments_response_parseFromJSON(jsonsearch_shipments_response_1);
	cJSON* jsonsearch_shipments_response_2 = search_shipments_response_convertToJSON(search_shipments_response_2);
	printf("repeating search_shipments_response:\n%s\n", cJSON_Print(jsonsearch_shipments_response_2));
}

int main() {
  test_search_shipments_response(1);
  test_search_shipments_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // search_shipments_response_MAIN
#endif // search_shipments_response_TEST
