#ifndef confirm_shipment_request_TEST
#define confirm_shipment_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define confirm_shipment_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/confirm_shipment_request.h"
confirm_shipment_request_t* instantiate_confirm_shipment_request(int include_optional);



confirm_shipment_request_t* instantiate_confirm_shipment_request(int include_optional) {
  confirm_shipment_request_t* confirm_shipment_request = NULL;
  if (include_optional) {
    confirm_shipment_request = confirm_shipment_request_create(
      "0"
    );
  } else {
    confirm_shipment_request = confirm_shipment_request_create(
      "0"
    );
  }

  return confirm_shipment_request;
}


#ifdef confirm_shipment_request_MAIN

void test_confirm_shipment_request(int include_optional) {
    confirm_shipment_request_t* confirm_shipment_request_1 = instantiate_confirm_shipment_request(include_optional);

	cJSON* jsonconfirm_shipment_request_1 = confirm_shipment_request_convertToJSON(confirm_shipment_request_1);
	printf("confirm_shipment_request :\n%s\n", cJSON_Print(jsonconfirm_shipment_request_1));
	confirm_shipment_request_t* confirm_shipment_request_2 = confirm_shipment_request_parseFromJSON(jsonconfirm_shipment_request_1);
	cJSON* jsonconfirm_shipment_request_2 = confirm_shipment_request_convertToJSON(confirm_shipment_request_2);
	printf("repeating confirm_shipment_request:\n%s\n", cJSON_Print(jsonconfirm_shipment_request_2));
}

int main() {
  test_confirm_shipment_request(1);
  test_confirm_shipment_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // confirm_shipment_request_MAIN
#endif // confirm_shipment_request_TEST
