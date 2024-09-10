#ifndef get_outlet_licenses_response_TEST
#define get_outlet_licenses_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_outlet_licenses_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_outlet_licenses_response.h"
get_outlet_licenses_response_t* instantiate_get_outlet_licenses_response(int include_optional);

#include "test_outlet_licenses_response_dto.c"


get_outlet_licenses_response_t* instantiate_get_outlet_licenses_response(int include_optional) {
  get_outlet_licenses_response_t* get_outlet_licenses_response = NULL;
  if (include_optional) {
    get_outlet_licenses_response = get_outlet_licenses_response_create(
      _api__get_outlet_licenses_response__OK,
       // false, not to have infinite recursion
      instantiate_outlet_licenses_response_dto(0)
    );
  } else {
    get_outlet_licenses_response = get_outlet_licenses_response_create(
      _api__get_outlet_licenses_response__OK,
      NULL
    );
  }

  return get_outlet_licenses_response;
}


#ifdef get_outlet_licenses_response_MAIN

void test_get_outlet_licenses_response(int include_optional) {
    get_outlet_licenses_response_t* get_outlet_licenses_response_1 = instantiate_get_outlet_licenses_response(include_optional);

	cJSON* jsonget_outlet_licenses_response_1 = get_outlet_licenses_response_convertToJSON(get_outlet_licenses_response_1);
	printf("get_outlet_licenses_response :\n%s\n", cJSON_Print(jsonget_outlet_licenses_response_1));
	get_outlet_licenses_response_t* get_outlet_licenses_response_2 = get_outlet_licenses_response_parseFromJSON(jsonget_outlet_licenses_response_1);
	cJSON* jsonget_outlet_licenses_response_2 = get_outlet_licenses_response_convertToJSON(get_outlet_licenses_response_2);
	printf("repeating get_outlet_licenses_response:\n%s\n", cJSON_Print(jsonget_outlet_licenses_response_2));
}

int main() {
  test_get_outlet_licenses_response(1);
  test_get_outlet_licenses_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_outlet_licenses_response_MAIN
#endif // get_outlet_licenses_response_TEST
