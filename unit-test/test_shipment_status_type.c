#ifndef shipment_status_type_TEST
#define shipment_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shipment_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shipment_status_type.h"
shipment_status_type_t* instantiate_shipment_status_type(int include_optional);



shipment_status_type_t* instantiate_shipment_status_type(int include_optional) {
  shipment_status_type_t* shipment_status_type = NULL;
  if (include_optional) {
    shipment_status_type = shipment_status_type_create(
    );
  } else {
    shipment_status_type = shipment_status_type_create(
    );
  }

  return shipment_status_type;
}


#ifdef shipment_status_type_MAIN

void test_shipment_status_type(int include_optional) {
    shipment_status_type_t* shipment_status_type_1 = instantiate_shipment_status_type(include_optional);

	cJSON* jsonshipment_status_type_1 = shipment_status_type_convertToJSON(shipment_status_type_1);
	printf("shipment_status_type :\n%s\n", cJSON_Print(jsonshipment_status_type_1));
	shipment_status_type_t* shipment_status_type_2 = shipment_status_type_parseFromJSON(jsonshipment_status_type_1);
	cJSON* jsonshipment_status_type_2 = shipment_status_type_convertToJSON(shipment_status_type_2);
	printf("repeating shipment_status_type:\n%s\n", cJSON_Print(jsonshipment_status_type_2));
}

int main() {
  test_shipment_status_type(1);
  test_shipment_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // shipment_status_type_MAIN
#endif // shipment_status_type_TEST
