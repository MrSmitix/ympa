#ifndef confirm_prices_request_TEST
#define confirm_prices_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define confirm_prices_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/confirm_prices_request.h"
confirm_prices_request_t* instantiate_confirm_prices_request(int include_optional);



confirm_prices_request_t* instantiate_confirm_prices_request(int include_optional) {
  confirm_prices_request_t* confirm_prices_request = NULL;
  if (include_optional) {
    confirm_prices_request = confirm_prices_request_create(
      list_createList()
    );
  } else {
    confirm_prices_request = confirm_prices_request_create(
      list_createList()
    );
  }

  return confirm_prices_request;
}


#ifdef confirm_prices_request_MAIN

void test_confirm_prices_request(int include_optional) {
    confirm_prices_request_t* confirm_prices_request_1 = instantiate_confirm_prices_request(include_optional);

	cJSON* jsonconfirm_prices_request_1 = confirm_prices_request_convertToJSON(confirm_prices_request_1);
	printf("confirm_prices_request :\n%s\n", cJSON_Print(jsonconfirm_prices_request_1));
	confirm_prices_request_t* confirm_prices_request_2 = confirm_prices_request_parseFromJSON(jsonconfirm_prices_request_1);
	cJSON* jsonconfirm_prices_request_2 = confirm_prices_request_convertToJSON(confirm_prices_request_2);
	printf("repeating confirm_prices_request:\n%s\n", cJSON_Print(jsonconfirm_prices_request_2));
}

int main() {
  test_confirm_prices_request(1);
  test_confirm_prices_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // confirm_prices_request_MAIN
#endif // confirm_prices_request_TEST
