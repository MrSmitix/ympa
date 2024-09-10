#ifndef accept_order_cancellation_request_TEST
#define accept_order_cancellation_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define accept_order_cancellation_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/accept_order_cancellation_request.h"
accept_order_cancellation_request_t* instantiate_accept_order_cancellation_request(int include_optional);



accept_order_cancellation_request_t* instantiate_accept_order_cancellation_request(int include_optional) {
  accept_order_cancellation_request_t* accept_order_cancellation_request = NULL;
  if (include_optional) {
    accept_order_cancellation_request = accept_order_cancellation_request_create(
      1,
      _api__accept_order_cancellation_request__ORDER_DELIVERED
    );
  } else {
    accept_order_cancellation_request = accept_order_cancellation_request_create(
      1,
      _api__accept_order_cancellation_request__ORDER_DELIVERED
    );
  }

  return accept_order_cancellation_request;
}


#ifdef accept_order_cancellation_request_MAIN

void test_accept_order_cancellation_request(int include_optional) {
    accept_order_cancellation_request_t* accept_order_cancellation_request_1 = instantiate_accept_order_cancellation_request(include_optional);

	cJSON* jsonaccept_order_cancellation_request_1 = accept_order_cancellation_request_convertToJSON(accept_order_cancellation_request_1);
	printf("accept_order_cancellation_request :\n%s\n", cJSON_Print(jsonaccept_order_cancellation_request_1));
	accept_order_cancellation_request_t* accept_order_cancellation_request_2 = accept_order_cancellation_request_parseFromJSON(jsonaccept_order_cancellation_request_1);
	cJSON* jsonaccept_order_cancellation_request_2 = accept_order_cancellation_request_convertToJSON(accept_order_cancellation_request_2);
	printf("repeating accept_order_cancellation_request:\n%s\n", cJSON_Print(jsonaccept_order_cancellation_request_2));
}

int main() {
  test_accept_order_cancellation_request(1);
  test_accept_order_cancellation_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // accept_order_cancellation_request_MAIN
#endif // accept_order_cancellation_request_TEST
