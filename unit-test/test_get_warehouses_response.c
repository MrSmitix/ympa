#ifndef get_warehouses_response_TEST
#define get_warehouses_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_warehouses_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_warehouses_response.h"
get_warehouses_response_t* instantiate_get_warehouses_response(int include_optional);

#include "test_warehouses_dto.c"


get_warehouses_response_t* instantiate_get_warehouses_response(int include_optional) {
  get_warehouses_response_t* get_warehouses_response = NULL;
  if (include_optional) {
    get_warehouses_response = get_warehouses_response_create(
      _api__get_warehouses_response__OK,
       // false, not to have infinite recursion
      instantiate_warehouses_dto(0)
    );
  } else {
    get_warehouses_response = get_warehouses_response_create(
      _api__get_warehouses_response__OK,
      NULL
    );
  }

  return get_warehouses_response;
}


#ifdef get_warehouses_response_MAIN

void test_get_warehouses_response(int include_optional) {
    get_warehouses_response_t* get_warehouses_response_1 = instantiate_get_warehouses_response(include_optional);

	cJSON* jsonget_warehouses_response_1 = get_warehouses_response_convertToJSON(get_warehouses_response_1);
	printf("get_warehouses_response :\n%s\n", cJSON_Print(jsonget_warehouses_response_1));
	get_warehouses_response_t* get_warehouses_response_2 = get_warehouses_response_parseFromJSON(jsonget_warehouses_response_1);
	cJSON* jsonget_warehouses_response_2 = get_warehouses_response_convertToJSON(get_warehouses_response_2);
	printf("repeating get_warehouses_response:\n%s\n", cJSON_Print(jsonget_warehouses_response_2));
}

int main() {
  test_get_warehouses_response(1);
  test_get_warehouses_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_warehouses_response_MAIN
#endif // get_warehouses_response_TEST
