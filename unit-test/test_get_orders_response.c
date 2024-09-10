#ifndef get_orders_response_TEST
#define get_orders_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_orders_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_orders_response.h"
get_orders_response_t* instantiate_get_orders_response(int include_optional);

#include "test_flipping_pager_dto.c"
#include "test_forward_scrolling_pager_dto.c"


get_orders_response_t* instantiate_get_orders_response(int include_optional) {
  get_orders_response_t* get_orders_response = NULL;
  if (include_optional) {
    get_orders_response = get_orders_response_create(
       // false, not to have infinite recursion
      instantiate_flipping_pager_dto(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0)
    );
  } else {
    get_orders_response = get_orders_response_create(
      NULL,
      list_createList(),
      NULL
    );
  }

  return get_orders_response;
}


#ifdef get_orders_response_MAIN

void test_get_orders_response(int include_optional) {
    get_orders_response_t* get_orders_response_1 = instantiate_get_orders_response(include_optional);

	cJSON* jsonget_orders_response_1 = get_orders_response_convertToJSON(get_orders_response_1);
	printf("get_orders_response :\n%s\n", cJSON_Print(jsonget_orders_response_1));
	get_orders_response_t* get_orders_response_2 = get_orders_response_parseFromJSON(jsonget_orders_response_1);
	cJSON* jsonget_orders_response_2 = get_orders_response_convertToJSON(get_orders_response_2);
	printf("repeating get_orders_response:\n%s\n", cJSON_Print(jsonget_orders_response_2));
}

int main() {
  test_get_orders_response(1);
  test_get_orders_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_orders_response_MAIN
#endif // get_orders_response_TEST
