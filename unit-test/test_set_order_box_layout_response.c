#ifndef set_order_box_layout_response_TEST
#define set_order_box_layout_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define set_order_box_layout_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/set_order_box_layout_response.h"
set_order_box_layout_response_t* instantiate_set_order_box_layout_response(int include_optional);

#include "test_order_boxes_layout_dto.c"


set_order_box_layout_response_t* instantiate_set_order_box_layout_response(int include_optional) {
  set_order_box_layout_response_t* set_order_box_layout_response = NULL;
  if (include_optional) {
    set_order_box_layout_response = set_order_box_layout_response_create(
      _api__set_order_box_layout_response__OK,
       // false, not to have infinite recursion
      instantiate_order_boxes_layout_dto(0)
    );
  } else {
    set_order_box_layout_response = set_order_box_layout_response_create(
      _api__set_order_box_layout_response__OK,
      NULL
    );
  }

  return set_order_box_layout_response;
}


#ifdef set_order_box_layout_response_MAIN

void test_set_order_box_layout_response(int include_optional) {
    set_order_box_layout_response_t* set_order_box_layout_response_1 = instantiate_set_order_box_layout_response(include_optional);

	cJSON* jsonset_order_box_layout_response_1 = set_order_box_layout_response_convertToJSON(set_order_box_layout_response_1);
	printf("set_order_box_layout_response :\n%s\n", cJSON_Print(jsonset_order_box_layout_response_1));
	set_order_box_layout_response_t* set_order_box_layout_response_2 = set_order_box_layout_response_parseFromJSON(jsonset_order_box_layout_response_1);
	cJSON* jsonset_order_box_layout_response_2 = set_order_box_layout_response_convertToJSON(set_order_box_layout_response_2);
	printf("repeating set_order_box_layout_response:\n%s\n", cJSON_Print(jsonset_order_box_layout_response_2));
}

int main() {
  test_set_order_box_layout_response(1);
  test_set_order_box_layout_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // set_order_box_layout_response_MAIN
#endif // set_order_box_layout_response_TEST
