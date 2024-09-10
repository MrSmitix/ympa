#ifndef search_models_response_TEST
#define search_models_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define search_models_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/search_models_response.h"
search_models_response_t* instantiate_search_models_response(int include_optional);

#include "test_flipping_pager_dto.c"


search_models_response_t* instantiate_search_models_response(int include_optional) {
  search_models_response_t* search_models_response = NULL;
  if (include_optional) {
    search_models_response = search_models_response_create(
      list_createList(),
      _api__search_models_response__RUR,
      56,
       // false, not to have infinite recursion
      instantiate_flipping_pager_dto(0)
    );
  } else {
    search_models_response = search_models_response_create(
      list_createList(),
      _api__search_models_response__RUR,
      56,
      NULL
    );
  }

  return search_models_response;
}


#ifdef search_models_response_MAIN

void test_search_models_response(int include_optional) {
    search_models_response_t* search_models_response_1 = instantiate_search_models_response(include_optional);

	cJSON* jsonsearch_models_response_1 = search_models_response_convertToJSON(search_models_response_1);
	printf("search_models_response :\n%s\n", cJSON_Print(jsonsearch_models_response_1));
	search_models_response_t* search_models_response_2 = search_models_response_parseFromJSON(jsonsearch_models_response_1);
	cJSON* jsonsearch_models_response_2 = search_models_response_convertToJSON(search_models_response_2);
	printf("repeating search_models_response:\n%s\n", cJSON_Print(jsonsearch_models_response_2));
}

int main() {
  test_search_models_response(1);
  test_search_models_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // search_models_response_MAIN
#endif // search_models_response_TEST
