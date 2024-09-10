#ifndef get_regions_response_TEST
#define get_regions_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_regions_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_regions_response.h"
get_regions_response_t* instantiate_get_regions_response(int include_optional);

#include "test_forward_scrolling_pager_dto.c"


get_regions_response_t* instantiate_get_regions_response(int include_optional) {
  get_regions_response_t* get_regions_response = NULL;
  if (include_optional) {
    get_regions_response = get_regions_response_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0)
    );
  } else {
    get_regions_response = get_regions_response_create(
      list_createList(),
      NULL
    );
  }

  return get_regions_response;
}


#ifdef get_regions_response_MAIN

void test_get_regions_response(int include_optional) {
    get_regions_response_t* get_regions_response_1 = instantiate_get_regions_response(include_optional);

	cJSON* jsonget_regions_response_1 = get_regions_response_convertToJSON(get_regions_response_1);
	printf("get_regions_response :\n%s\n", cJSON_Print(jsonget_regions_response_1));
	get_regions_response_t* get_regions_response_2 = get_regions_response_parseFromJSON(jsonget_regions_response_1);
	cJSON* jsonget_regions_response_2 = get_regions_response_convertToJSON(get_regions_response_2);
	printf("repeating get_regions_response:\n%s\n", cJSON_Print(jsonget_regions_response_2));
}

int main() {
  test_get_regions_response(1);
  test_get_regions_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_regions_response_MAIN
#endif // get_regions_response_TEST
