#ifndef set_shipment_pallets_count_request_TEST
#define set_shipment_pallets_count_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define set_shipment_pallets_count_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/set_shipment_pallets_count_request.h"
set_shipment_pallets_count_request_t* instantiate_set_shipment_pallets_count_request(int include_optional);



set_shipment_pallets_count_request_t* instantiate_set_shipment_pallets_count_request(int include_optional) {
  set_shipment_pallets_count_request_t* set_shipment_pallets_count_request = NULL;
  if (include_optional) {
    set_shipment_pallets_count_request = set_shipment_pallets_count_request_create(
      0
    );
  } else {
    set_shipment_pallets_count_request = set_shipment_pallets_count_request_create(
      0
    );
  }

  return set_shipment_pallets_count_request;
}


#ifdef set_shipment_pallets_count_request_MAIN

void test_set_shipment_pallets_count_request(int include_optional) {
    set_shipment_pallets_count_request_t* set_shipment_pallets_count_request_1 = instantiate_set_shipment_pallets_count_request(include_optional);

	cJSON* jsonset_shipment_pallets_count_request_1 = set_shipment_pallets_count_request_convertToJSON(set_shipment_pallets_count_request_1);
	printf("set_shipment_pallets_count_request :\n%s\n", cJSON_Print(jsonset_shipment_pallets_count_request_1));
	set_shipment_pallets_count_request_t* set_shipment_pallets_count_request_2 = set_shipment_pallets_count_request_parseFromJSON(jsonset_shipment_pallets_count_request_1);
	cJSON* jsonset_shipment_pallets_count_request_2 = set_shipment_pallets_count_request_convertToJSON(set_shipment_pallets_count_request_2);
	printf("repeating set_shipment_pallets_count_request:\n%s\n", cJSON_Print(jsonset_shipment_pallets_count_request_2));
}

int main() {
  test_set_shipment_pallets_count_request(1);
  test_set_shipment_pallets_count_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // set_shipment_pallets_count_request_MAIN
#endif // set_shipment_pallets_count_request_TEST
