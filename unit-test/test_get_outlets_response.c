#ifndef get_outlets_response_TEST
#define get_outlets_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_outlets_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_outlets_response.h"
get_outlets_response_t* instantiate_get_outlets_response(int include_optional);

#include "test_scrolling_pager_dto.c"
#include "test_flipping_pager_dto.c"


get_outlets_response_t* instantiate_get_outlets_response(int include_optional) {
  get_outlets_response_t* get_outlets_response = NULL;
  if (include_optional) {
    get_outlets_response = get_outlets_response_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_scrolling_pager_dto(0),
       // false, not to have infinite recursion
      instantiate_flipping_pager_dto(0)
    );
  } else {
    get_outlets_response = get_outlets_response_create(
      list_createList(),
      NULL,
      NULL
    );
  }

  return get_outlets_response;
}


#ifdef get_outlets_response_MAIN

void test_get_outlets_response(int include_optional) {
    get_outlets_response_t* get_outlets_response_1 = instantiate_get_outlets_response(include_optional);

	cJSON* jsonget_outlets_response_1 = get_outlets_response_convertToJSON(get_outlets_response_1);
	printf("get_outlets_response :\n%s\n", cJSON_Print(jsonget_outlets_response_1));
	get_outlets_response_t* get_outlets_response_2 = get_outlets_response_parseFromJSON(jsonget_outlets_response_1);
	cJSON* jsonget_outlets_response_2 = get_outlets_response_convertToJSON(get_outlets_response_2);
	printf("repeating get_outlets_response:\n%s\n", cJSON_Print(jsonget_outlets_response_2));
}

int main() {
  test_get_outlets_response(1);
  test_get_outlets_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_outlets_response_MAIN
#endif // get_outlets_response_TEST
