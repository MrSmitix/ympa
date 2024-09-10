#ifndef get_returns_response_TEST
#define get_returns_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_returns_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_returns_response.h"
get_returns_response_t* instantiate_get_returns_response(int include_optional);

#include "test_paged_returns_dto.c"


get_returns_response_t* instantiate_get_returns_response(int include_optional) {
  get_returns_response_t* get_returns_response = NULL;
  if (include_optional) {
    get_returns_response = get_returns_response_create(
      _api__get_returns_response__OK,
       // false, not to have infinite recursion
      instantiate_paged_returns_dto(0)
    );
  } else {
    get_returns_response = get_returns_response_create(
      _api__get_returns_response__OK,
      NULL
    );
  }

  return get_returns_response;
}


#ifdef get_returns_response_MAIN

void test_get_returns_response(int include_optional) {
    get_returns_response_t* get_returns_response_1 = instantiate_get_returns_response(include_optional);

	cJSON* jsonget_returns_response_1 = get_returns_response_convertToJSON(get_returns_response_1);
	printf("get_returns_response :\n%s\n", cJSON_Print(jsonget_returns_response_1));
	get_returns_response_t* get_returns_response_2 = get_returns_response_parseFromJSON(jsonget_returns_response_1);
	cJSON* jsonget_returns_response_2 = get_returns_response_convertToJSON(get_returns_response_2);
	printf("repeating get_returns_response:\n%s\n", cJSON_Print(jsonget_returns_response_2));
}

int main() {
  test_get_returns_response(1);
  test_get_returns_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_returns_response_MAIN
#endif // get_returns_response_TEST
