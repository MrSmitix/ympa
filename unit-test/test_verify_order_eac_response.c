#ifndef verify_order_eac_response_TEST
#define verify_order_eac_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define verify_order_eac_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/verify_order_eac_response.h"
verify_order_eac_response_t* instantiate_verify_order_eac_response(int include_optional);

#include "test_eac_verification_result_dto.c"


verify_order_eac_response_t* instantiate_verify_order_eac_response(int include_optional) {
  verify_order_eac_response_t* verify_order_eac_response = NULL;
  if (include_optional) {
    verify_order_eac_response = verify_order_eac_response_create(
      _api__verify_order_eac_response__OK,
       // false, not to have infinite recursion
      instantiate_eac_verification_result_dto(0)
    );
  } else {
    verify_order_eac_response = verify_order_eac_response_create(
      _api__verify_order_eac_response__OK,
      NULL
    );
  }

  return verify_order_eac_response;
}


#ifdef verify_order_eac_response_MAIN

void test_verify_order_eac_response(int include_optional) {
    verify_order_eac_response_t* verify_order_eac_response_1 = instantiate_verify_order_eac_response(include_optional);

	cJSON* jsonverify_order_eac_response_1 = verify_order_eac_response_convertToJSON(verify_order_eac_response_1);
	printf("verify_order_eac_response :\n%s\n", cJSON_Print(jsonverify_order_eac_response_1));
	verify_order_eac_response_t* verify_order_eac_response_2 = verify_order_eac_response_parseFromJSON(jsonverify_order_eac_response_1);
	cJSON* jsonverify_order_eac_response_2 = verify_order_eac_response_convertToJSON(verify_order_eac_response_2);
	printf("repeating verify_order_eac_response:\n%s\n", cJSON_Print(jsonverify_order_eac_response_2));
}

int main() {
  test_verify_order_eac_response(1);
  test_verify_order_eac_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // verify_order_eac_response_MAIN
#endif // verify_order_eac_response_TEST
