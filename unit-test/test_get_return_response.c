#ifndef get_return_response_TEST
#define get_return_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_return_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_return_response.h"
get_return_response_t* instantiate_get_return_response(int include_optional);

#include "test_return_dto.c"


get_return_response_t* instantiate_get_return_response(int include_optional) {
  get_return_response_t* get_return_response = NULL;
  if (include_optional) {
    get_return_response = get_return_response_create(
      _api__get_return_response__OK,
       // false, not to have infinite recursion
      instantiate_return_dto(0)
    );
  } else {
    get_return_response = get_return_response_create(
      _api__get_return_response__OK,
      NULL
    );
  }

  return get_return_response;
}


#ifdef get_return_response_MAIN

void test_get_return_response(int include_optional) {
    get_return_response_t* get_return_response_1 = instantiate_get_return_response(include_optional);

	cJSON* jsonget_return_response_1 = get_return_response_convertToJSON(get_return_response_1);
	printf("get_return_response :\n%s\n", cJSON_Print(jsonget_return_response_1));
	get_return_response_t* get_return_response_2 = get_return_response_parseFromJSON(jsonget_return_response_1);
	cJSON* jsonget_return_response_2 = get_return_response_convertToJSON(get_return_response_2);
	printf("repeating get_return_response:\n%s\n", cJSON_Print(jsonget_return_response_2));
}

int main() {
  test_get_return_response(1);
  test_get_return_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_return_response_MAIN
#endif // get_return_response_TEST
