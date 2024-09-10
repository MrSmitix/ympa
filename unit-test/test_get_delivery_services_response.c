#ifndef get_delivery_services_response_TEST
#define get_delivery_services_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_delivery_services_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_delivery_services_response.h"
get_delivery_services_response_t* instantiate_get_delivery_services_response(int include_optional);

#include "test_delivery_services_dto.c"


get_delivery_services_response_t* instantiate_get_delivery_services_response(int include_optional) {
  get_delivery_services_response_t* get_delivery_services_response = NULL;
  if (include_optional) {
    get_delivery_services_response = get_delivery_services_response_create(
       // false, not to have infinite recursion
      instantiate_delivery_services_dto(0)
    );
  } else {
    get_delivery_services_response = get_delivery_services_response_create(
      NULL
    );
  }

  return get_delivery_services_response;
}


#ifdef get_delivery_services_response_MAIN

void test_get_delivery_services_response(int include_optional) {
    get_delivery_services_response_t* get_delivery_services_response_1 = instantiate_get_delivery_services_response(include_optional);

	cJSON* jsonget_delivery_services_response_1 = get_delivery_services_response_convertToJSON(get_delivery_services_response_1);
	printf("get_delivery_services_response :\n%s\n", cJSON_Print(jsonget_delivery_services_response_1));
	get_delivery_services_response_t* get_delivery_services_response_2 = get_delivery_services_response_parseFromJSON(jsonget_delivery_services_response_1);
	cJSON* jsonget_delivery_services_response_2 = get_delivery_services_response_convertToJSON(get_delivery_services_response_2);
	printf("repeating get_delivery_services_response:\n%s\n", cJSON_Print(jsonget_delivery_services_response_2));
}

int main() {
  test_get_delivery_services_response(1);
  test_get_delivery_services_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_delivery_services_response_MAIN
#endif // get_delivery_services_response_TEST
