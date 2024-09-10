#ifndef provide_order_item_identifiers_response_TEST
#define provide_order_item_identifiers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define provide_order_item_identifiers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/provide_order_item_identifiers_response.h"
provide_order_item_identifiers_response_t* instantiate_provide_order_item_identifiers_response(int include_optional);

#include "test_order_items_modification_result_dto.c"


provide_order_item_identifiers_response_t* instantiate_provide_order_item_identifiers_response(int include_optional) {
  provide_order_item_identifiers_response_t* provide_order_item_identifiers_response = NULL;
  if (include_optional) {
    provide_order_item_identifiers_response = provide_order_item_identifiers_response_create(
      _api__provide_order_item_identifiers_response__OK,
       // false, not to have infinite recursion
      instantiate_order_items_modification_result_dto(0)
    );
  } else {
    provide_order_item_identifiers_response = provide_order_item_identifiers_response_create(
      _api__provide_order_item_identifiers_response__OK,
      NULL
    );
  }

  return provide_order_item_identifiers_response;
}


#ifdef provide_order_item_identifiers_response_MAIN

void test_provide_order_item_identifiers_response(int include_optional) {
    provide_order_item_identifiers_response_t* provide_order_item_identifiers_response_1 = instantiate_provide_order_item_identifiers_response(include_optional);

	cJSON* jsonprovide_order_item_identifiers_response_1 = provide_order_item_identifiers_response_convertToJSON(provide_order_item_identifiers_response_1);
	printf("provide_order_item_identifiers_response :\n%s\n", cJSON_Print(jsonprovide_order_item_identifiers_response_1));
	provide_order_item_identifiers_response_t* provide_order_item_identifiers_response_2 = provide_order_item_identifiers_response_parseFromJSON(jsonprovide_order_item_identifiers_response_1);
	cJSON* jsonprovide_order_item_identifiers_response_2 = provide_order_item_identifiers_response_convertToJSON(provide_order_item_identifiers_response_2);
	printf("repeating provide_order_item_identifiers_response:\n%s\n", cJSON_Print(jsonprovide_order_item_identifiers_response_2));
}

int main() {
  test_provide_order_item_identifiers_response(1);
  test_provide_order_item_identifiers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // provide_order_item_identifiers_response_MAIN
#endif // provide_order_item_identifiers_response_TEST
