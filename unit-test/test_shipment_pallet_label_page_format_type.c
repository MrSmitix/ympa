#ifndef shipment_pallet_label_page_format_type_TEST
#define shipment_pallet_label_page_format_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shipment_pallet_label_page_format_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shipment_pallet_label_page_format_type.h"
shipment_pallet_label_page_format_type_t* instantiate_shipment_pallet_label_page_format_type(int include_optional);



shipment_pallet_label_page_format_type_t* instantiate_shipment_pallet_label_page_format_type(int include_optional) {
  shipment_pallet_label_page_format_type_t* shipment_pallet_label_page_format_type = NULL;
  if (include_optional) {
    shipment_pallet_label_page_format_type = shipment_pallet_label_page_format_type_create(
    );
  } else {
    shipment_pallet_label_page_format_type = shipment_pallet_label_page_format_type_create(
    );
  }

  return shipment_pallet_label_page_format_type;
}


#ifdef shipment_pallet_label_page_format_type_MAIN

void test_shipment_pallet_label_page_format_type(int include_optional) {
    shipment_pallet_label_page_format_type_t* shipment_pallet_label_page_format_type_1 = instantiate_shipment_pallet_label_page_format_type(include_optional);

	cJSON* jsonshipment_pallet_label_page_format_type_1 = shipment_pallet_label_page_format_type_convertToJSON(shipment_pallet_label_page_format_type_1);
	printf("shipment_pallet_label_page_format_type :\n%s\n", cJSON_Print(jsonshipment_pallet_label_page_format_type_1));
	shipment_pallet_label_page_format_type_t* shipment_pallet_label_page_format_type_2 = shipment_pallet_label_page_format_type_parseFromJSON(jsonshipment_pallet_label_page_format_type_1);
	cJSON* jsonshipment_pallet_label_page_format_type_2 = shipment_pallet_label_page_format_type_convertToJSON(shipment_pallet_label_page_format_type_2);
	printf("repeating shipment_pallet_label_page_format_type:\n%s\n", cJSON_Print(jsonshipment_pallet_label_page_format_type_2));
}

int main() {
  test_shipment_pallet_label_page_format_type(1);
  test_shipment_pallet_label_page_format_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // shipment_pallet_label_page_format_type_MAIN
#endif // shipment_pallet_label_page_format_type_TEST
