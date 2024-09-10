#ifndef set_order_shipment_boxes_request_TEST
#define set_order_shipment_boxes_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define set_order_shipment_boxes_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/set_order_shipment_boxes_request.h"
set_order_shipment_boxes_request_t* instantiate_set_order_shipment_boxes_request(int include_optional);



set_order_shipment_boxes_request_t* instantiate_set_order_shipment_boxes_request(int include_optional) {
  set_order_shipment_boxes_request_t* set_order_shipment_boxes_request = NULL;
  if (include_optional) {
    set_order_shipment_boxes_request = set_order_shipment_boxes_request_create(
      list_createList()
    );
  } else {
    set_order_shipment_boxes_request = set_order_shipment_boxes_request_create(
      list_createList()
    );
  }

  return set_order_shipment_boxes_request;
}


#ifdef set_order_shipment_boxes_request_MAIN

void test_set_order_shipment_boxes_request(int include_optional) {
    set_order_shipment_boxes_request_t* set_order_shipment_boxes_request_1 = instantiate_set_order_shipment_boxes_request(include_optional);

	cJSON* jsonset_order_shipment_boxes_request_1 = set_order_shipment_boxes_request_convertToJSON(set_order_shipment_boxes_request_1);
	printf("set_order_shipment_boxes_request :\n%s\n", cJSON_Print(jsonset_order_shipment_boxes_request_1));
	set_order_shipment_boxes_request_t* set_order_shipment_boxes_request_2 = set_order_shipment_boxes_request_parseFromJSON(jsonset_order_shipment_boxes_request_1);
	cJSON* jsonset_order_shipment_boxes_request_2 = set_order_shipment_boxes_request_convertToJSON(set_order_shipment_boxes_request_2);
	printf("repeating set_order_shipment_boxes_request:\n%s\n", cJSON_Print(jsonset_order_shipment_boxes_request_2));
}

int main() {
  test_set_order_shipment_boxes_request(1);
  test_set_order_shipment_boxes_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // set_order_shipment_boxes_request_MAIN
#endif // set_order_shipment_boxes_request_TEST
