#ifndef verify_order_eac_request_TEST
#define verify_order_eac_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define verify_order_eac_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/verify_order_eac_request.h"
verify_order_eac_request_t* instantiate_verify_order_eac_request(int include_optional);



verify_order_eac_request_t* instantiate_verify_order_eac_request(int include_optional) {
  verify_order_eac_request_t* verify_order_eac_request = NULL;
  if (include_optional) {
    verify_order_eac_request = verify_order_eac_request_create(
      "0"
    );
  } else {
    verify_order_eac_request = verify_order_eac_request_create(
      "0"
    );
  }

  return verify_order_eac_request;
}


#ifdef verify_order_eac_request_MAIN

void test_verify_order_eac_request(int include_optional) {
    verify_order_eac_request_t* verify_order_eac_request_1 = instantiate_verify_order_eac_request(include_optional);

	cJSON* jsonverify_order_eac_request_1 = verify_order_eac_request_convertToJSON(verify_order_eac_request_1);
	printf("verify_order_eac_request :\n%s\n", cJSON_Print(jsonverify_order_eac_request_1));
	verify_order_eac_request_t* verify_order_eac_request_2 = verify_order_eac_request_parseFromJSON(jsonverify_order_eac_request_1);
	cJSON* jsonverify_order_eac_request_2 = verify_order_eac_request_convertToJSON(verify_order_eac_request_2);
	printf("repeating verify_order_eac_request:\n%s\n", cJSON_Print(jsonverify_order_eac_request_2));
}

int main() {
  test_verify_order_eac_request(1);
  test_verify_order_eac_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // verify_order_eac_request_MAIN
#endif // verify_order_eac_request_TEST
