#ifndef get_region_with_children_response_TEST
#define get_region_with_children_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_region_with_children_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_region_with_children_response.h"
get_region_with_children_response_t* instantiate_get_region_with_children_response(int include_optional);

#include "test_flipping_pager_dto.c"
#include "test_region_dto.c"


get_region_with_children_response_t* instantiate_get_region_with_children_response(int include_optional) {
  get_region_with_children_response_t* get_region_with_children_response = NULL;
  if (include_optional) {
    get_region_with_children_response = get_region_with_children_response_create(
       // false, not to have infinite recursion
      instantiate_flipping_pager_dto(0),
       // false, not to have infinite recursion
      instantiate_region_dto(0)
    );
  } else {
    get_region_with_children_response = get_region_with_children_response_create(
      NULL,
      NULL
    );
  }

  return get_region_with_children_response;
}


#ifdef get_region_with_children_response_MAIN

void test_get_region_with_children_response(int include_optional) {
    get_region_with_children_response_t* get_region_with_children_response_1 = instantiate_get_region_with_children_response(include_optional);

	cJSON* jsonget_region_with_children_response_1 = get_region_with_children_response_convertToJSON(get_region_with_children_response_1);
	printf("get_region_with_children_response :\n%s\n", cJSON_Print(jsonget_region_with_children_response_1));
	get_region_with_children_response_t* get_region_with_children_response_2 = get_region_with_children_response_parseFromJSON(jsonget_region_with_children_response_1);
	cJSON* jsonget_region_with_children_response_2 = get_region_with_children_response_convertToJSON(get_region_with_children_response_2);
	printf("repeating get_region_with_children_response:\n%s\n", cJSON_Print(jsonget_region_with_children_response_2));
}

int main() {
  test_get_region_with_children_response(1);
  test_get_region_with_children_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_region_with_children_response_MAIN
#endif // get_region_with_children_response_TEST
