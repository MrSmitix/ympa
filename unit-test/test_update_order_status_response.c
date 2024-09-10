#ifndef update_order_status_response_TEST
#define update_order_status_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_order_status_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_order_status_response.h"
update_order_status_response_t* instantiate_update_order_status_response(int include_optional);

#include "test_order_dto.c"


update_order_status_response_t* instantiate_update_order_status_response(int include_optional) {
  update_order_status_response_t* update_order_status_response = NULL;
  if (include_optional) {
    update_order_status_response = update_order_status_response_create(
       // false, not to have infinite recursion
      instantiate_order_dto(0)
    );
  } else {
    update_order_status_response = update_order_status_response_create(
      NULL
    );
  }

  return update_order_status_response;
}


#ifdef update_order_status_response_MAIN

void test_update_order_status_response(int include_optional) {
    update_order_status_response_t* update_order_status_response_1 = instantiate_update_order_status_response(include_optional);

	cJSON* jsonupdate_order_status_response_1 = update_order_status_response_convertToJSON(update_order_status_response_1);
	printf("update_order_status_response :\n%s\n", cJSON_Print(jsonupdate_order_status_response_1));
	update_order_status_response_t* update_order_status_response_2 = update_order_status_response_parseFromJSON(jsonupdate_order_status_response_1);
	cJSON* jsonupdate_order_status_response_2 = update_order_status_response_convertToJSON(update_order_status_response_2);
	printf("repeating update_order_status_response:\n%s\n", cJSON_Print(jsonupdate_order_status_response_2));
}

int main() {
  test_update_order_status_response(1);
  test_update_order_status_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_order_status_response_MAIN
#endif // update_order_status_response_TEST
