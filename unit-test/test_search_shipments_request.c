#ifndef search_shipments_request_TEST
#define search_shipments_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define search_shipments_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/search_shipments_request.h"
search_shipments_request_t* instantiate_search_shipments_request(int include_optional);



search_shipments_request_t* instantiate_search_shipments_request(int include_optional) {
  search_shipments_request_t* search_shipments_request = NULL;
  if (include_optional) {
    search_shipments_request = search_shipments_request_create(
      "2013-10-20",
      "2013-10-20",
      list_createList(),
      list_createList(),
      1
    );
  } else {
    search_shipments_request = search_shipments_request_create(
      "2013-10-20",
      "2013-10-20",
      list_createList(),
      list_createList(),
      1
    );
  }

  return search_shipments_request;
}


#ifdef search_shipments_request_MAIN

void test_search_shipments_request(int include_optional) {
    search_shipments_request_t* search_shipments_request_1 = instantiate_search_shipments_request(include_optional);

	cJSON* jsonsearch_shipments_request_1 = search_shipments_request_convertToJSON(search_shipments_request_1);
	printf("search_shipments_request :\n%s\n", cJSON_Print(jsonsearch_shipments_request_1));
	search_shipments_request_t* search_shipments_request_2 = search_shipments_request_parseFromJSON(jsonsearch_shipments_request_1);
	cJSON* jsonsearch_shipments_request_2 = search_shipments_request_convertToJSON(search_shipments_request_2);
	printf("repeating search_shipments_request:\n%s\n", cJSON_Print(jsonsearch_shipments_request_2));
}

int main() {
  test_search_shipments_request(1);
  test_search_shipments_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // search_shipments_request_MAIN
#endif // search_shipments_request_TEST
