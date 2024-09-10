#ifndef transfer_orders_from_shipment_request_TEST
#define transfer_orders_from_shipment_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define transfer_orders_from_shipment_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/transfer_orders_from_shipment_request.h"
transfer_orders_from_shipment_request_t* instantiate_transfer_orders_from_shipment_request(int include_optional);



transfer_orders_from_shipment_request_t* instantiate_transfer_orders_from_shipment_request(int include_optional) {
  transfer_orders_from_shipment_request_t* transfer_orders_from_shipment_request = NULL;
  if (include_optional) {
    transfer_orders_from_shipment_request = transfer_orders_from_shipment_request_create(
      list_createList()
    );
  } else {
    transfer_orders_from_shipment_request = transfer_orders_from_shipment_request_create(
      list_createList()
    );
  }

  return transfer_orders_from_shipment_request;
}


#ifdef transfer_orders_from_shipment_request_MAIN

void test_transfer_orders_from_shipment_request(int include_optional) {
    transfer_orders_from_shipment_request_t* transfer_orders_from_shipment_request_1 = instantiate_transfer_orders_from_shipment_request(include_optional);

	cJSON* jsontransfer_orders_from_shipment_request_1 = transfer_orders_from_shipment_request_convertToJSON(transfer_orders_from_shipment_request_1);
	printf("transfer_orders_from_shipment_request :\n%s\n", cJSON_Print(jsontransfer_orders_from_shipment_request_1));
	transfer_orders_from_shipment_request_t* transfer_orders_from_shipment_request_2 = transfer_orders_from_shipment_request_parseFromJSON(jsontransfer_orders_from_shipment_request_1);
	cJSON* jsontransfer_orders_from_shipment_request_2 = transfer_orders_from_shipment_request_convertToJSON(transfer_orders_from_shipment_request_2);
	printf("repeating transfer_orders_from_shipment_request:\n%s\n", cJSON_Print(jsontransfer_orders_from_shipment_request_2));
}

int main() {
  test_transfer_orders_from_shipment_request(1);
  test_transfer_orders_from_shipment_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // transfer_orders_from_shipment_request_MAIN
#endif // transfer_orders_from_shipment_request_TEST
