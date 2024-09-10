#ifndef provide_order_item_identifiers_request_TEST
#define provide_order_item_identifiers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define provide_order_item_identifiers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/provide_order_item_identifiers_request.h"
provide_order_item_identifiers_request_t* instantiate_provide_order_item_identifiers_request(int include_optional);



provide_order_item_identifiers_request_t* instantiate_provide_order_item_identifiers_request(int include_optional) {
  provide_order_item_identifiers_request_t* provide_order_item_identifiers_request = NULL;
  if (include_optional) {
    provide_order_item_identifiers_request = provide_order_item_identifiers_request_create(
      list_createList()
    );
  } else {
    provide_order_item_identifiers_request = provide_order_item_identifiers_request_create(
      list_createList()
    );
  }

  return provide_order_item_identifiers_request;
}


#ifdef provide_order_item_identifiers_request_MAIN

void test_provide_order_item_identifiers_request(int include_optional) {
    provide_order_item_identifiers_request_t* provide_order_item_identifiers_request_1 = instantiate_provide_order_item_identifiers_request(include_optional);

	cJSON* jsonprovide_order_item_identifiers_request_1 = provide_order_item_identifiers_request_convertToJSON(provide_order_item_identifiers_request_1);
	printf("provide_order_item_identifiers_request :\n%s\n", cJSON_Print(jsonprovide_order_item_identifiers_request_1));
	provide_order_item_identifiers_request_t* provide_order_item_identifiers_request_2 = provide_order_item_identifiers_request_parseFromJSON(jsonprovide_order_item_identifiers_request_1);
	cJSON* jsonprovide_order_item_identifiers_request_2 = provide_order_item_identifiers_request_convertToJSON(provide_order_item_identifiers_request_2);
	printf("repeating provide_order_item_identifiers_request:\n%s\n", cJSON_Print(jsonprovide_order_item_identifiers_request_2));
}

int main() {
  test_provide_order_item_identifiers_request(1);
  test_provide_order_item_identifiers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // provide_order_item_identifiers_request_MAIN
#endif // provide_order_item_identifiers_request_TEST
