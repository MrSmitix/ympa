#ifndef get_order_response_TEST
#define get_order_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_order_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_order_response.h"
get_order_response_t* instantiate_get_order_response(int include_optional);

#include "test_order_dto.c"


get_order_response_t* instantiate_get_order_response(int include_optional) {
  get_order_response_t* get_order_response = NULL;
  if (include_optional) {
    get_order_response = get_order_response_create(
       // false, not to have infinite recursion
      instantiate_order_dto(0)
    );
  } else {
    get_order_response = get_order_response_create(
      NULL
    );
  }

  return get_order_response;
}


#ifdef get_order_response_MAIN

void test_get_order_response(int include_optional) {
    get_order_response_t* get_order_response_1 = instantiate_get_order_response(include_optional);

	cJSON* jsonget_order_response_1 = get_order_response_convertToJSON(get_order_response_1);
	printf("get_order_response :\n%s\n", cJSON_Print(jsonget_order_response_1));
	get_order_response_t* get_order_response_2 = get_order_response_parseFromJSON(jsonget_order_response_1);
	cJSON* jsonget_order_response_2 = get_order_response_convertToJSON(get_order_response_2);
	printf("repeating get_order_response:\n%s\n", cJSON_Print(jsonget_order_response_2));
}

int main() {
  test_get_order_response(1);
  test_get_order_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_order_response_MAIN
#endif // get_order_response_TEST
