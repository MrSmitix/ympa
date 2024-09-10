#ifndef set_return_decision_request_TEST
#define set_return_decision_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define set_return_decision_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/set_return_decision_request.h"
set_return_decision_request_t* instantiate_set_return_decision_request(int include_optional);



set_return_decision_request_t* instantiate_set_return_decision_request(int include_optional) {
  set_return_decision_request_t* set_return_decision_request = NULL;
  if (include_optional) {
    set_return_decision_request = set_return_decision_request_create(
      56,
      _api__set_return_decision_request__REFUND_MONEY,
      "0"
    );
  } else {
    set_return_decision_request = set_return_decision_request_create(
      56,
      _api__set_return_decision_request__REFUND_MONEY,
      "0"
    );
  }

  return set_return_decision_request;
}


#ifdef set_return_decision_request_MAIN

void test_set_return_decision_request(int include_optional) {
    set_return_decision_request_t* set_return_decision_request_1 = instantiate_set_return_decision_request(include_optional);

	cJSON* jsonset_return_decision_request_1 = set_return_decision_request_convertToJSON(set_return_decision_request_1);
	printf("set_return_decision_request :\n%s\n", cJSON_Print(jsonset_return_decision_request_1));
	set_return_decision_request_t* set_return_decision_request_2 = set_return_decision_request_parseFromJSON(jsonset_return_decision_request_1);
	cJSON* jsonset_return_decision_request_2 = set_return_decision_request_convertToJSON(set_return_decision_request_2);
	printf("repeating set_return_decision_request:\n%s\n", cJSON_Print(jsonset_return_decision_request_2));
}

int main() {
  test_set_return_decision_request(1);
  test_set_return_decision_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // set_return_decision_request_MAIN
#endif // set_return_decision_request_TEST
