#ifndef get_shipment_response_TEST
#define get_shipment_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_shipment_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_shipment_response.h"
get_shipment_response_t* instantiate_get_shipment_response(int include_optional);

#include "test_shipment_dto.c"


get_shipment_response_t* instantiate_get_shipment_response(int include_optional) {
  get_shipment_response_t* get_shipment_response = NULL;
  if (include_optional) {
    get_shipment_response = get_shipment_response_create(
      _api__get_shipment_response__OK,
       // false, not to have infinite recursion
      instantiate_shipment_dto(0)
    );
  } else {
    get_shipment_response = get_shipment_response_create(
      _api__get_shipment_response__OK,
      NULL
    );
  }

  return get_shipment_response;
}


#ifdef get_shipment_response_MAIN

void test_get_shipment_response(int include_optional) {
    get_shipment_response_t* get_shipment_response_1 = instantiate_get_shipment_response(include_optional);

	cJSON* jsonget_shipment_response_1 = get_shipment_response_convertToJSON(get_shipment_response_1);
	printf("get_shipment_response :\n%s\n", cJSON_Print(jsonget_shipment_response_1));
	get_shipment_response_t* get_shipment_response_2 = get_shipment_response_parseFromJSON(jsonget_shipment_response_1);
	cJSON* jsonget_shipment_response_2 = get_shipment_response_convertToJSON(get_shipment_response_2);
	printf("repeating get_shipment_response:\n%s\n", cJSON_Print(jsonget_shipment_response_2));
}

int main() {
  test_get_shipment_response(1);
  test_get_shipment_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_shipment_response_MAIN
#endif // get_shipment_response_TEST
