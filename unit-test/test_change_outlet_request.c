#ifndef change_outlet_request_TEST
#define change_outlet_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define change_outlet_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/change_outlet_request.h"
change_outlet_request_t* instantiate_change_outlet_request(int include_optional);

#include "test_outlet_address_dto.c"
#include "test_outlet_working_schedule_dto.c"


change_outlet_request_t* instantiate_change_outlet_request(int include_optional) {
  change_outlet_request_t* change_outlet_request = NULL;
  if (include_optional) {
    change_outlet_request = change_outlet_request_create(
      "0",
      _api__change_outlet_request__DEPOT,
      "0",
      1,
      "0",
      _api__change_outlet_request__HIDDEN,
       // false, not to have infinite recursion
      instantiate_outlet_address_dto(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_outlet_working_schedule_dto(0),
      list_createList(),
      56
    );
  } else {
    change_outlet_request = change_outlet_request_create(
      "0",
      _api__change_outlet_request__DEPOT,
      "0",
      1,
      "0",
      _api__change_outlet_request__HIDDEN,
      NULL,
      list_createList(),
      NULL,
      list_createList(),
      56
    );
  }

  return change_outlet_request;
}


#ifdef change_outlet_request_MAIN

void test_change_outlet_request(int include_optional) {
    change_outlet_request_t* change_outlet_request_1 = instantiate_change_outlet_request(include_optional);

	cJSON* jsonchange_outlet_request_1 = change_outlet_request_convertToJSON(change_outlet_request_1);
	printf("change_outlet_request :\n%s\n", cJSON_Print(jsonchange_outlet_request_1));
	change_outlet_request_t* change_outlet_request_2 = change_outlet_request_parseFromJSON(jsonchange_outlet_request_1);
	cJSON* jsonchange_outlet_request_2 = change_outlet_request_convertToJSON(change_outlet_request_2);
	printf("repeating change_outlet_request:\n%s\n", cJSON_Print(jsonchange_outlet_request_2));
}

int main() {
  test_change_outlet_request(1);
  test_change_outlet_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // change_outlet_request_MAIN
#endif // change_outlet_request_TEST
