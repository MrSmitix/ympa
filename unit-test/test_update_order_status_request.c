#ifndef update_order_status_request_TEST
#define update_order_status_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_order_status_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_order_status_request.h"
update_order_status_request_t* instantiate_update_order_status_request(int include_optional);

#include "test_order_status_change_dto.c"


update_order_status_request_t* instantiate_update_order_status_request(int include_optional) {
  update_order_status_request_t* update_order_status_request = NULL;
  if (include_optional) {
    update_order_status_request = update_order_status_request_create(
       // false, not to have infinite recursion
      instantiate_order_status_change_dto(0)
    );
  } else {
    update_order_status_request = update_order_status_request_create(
      NULL
    );
  }

  return update_order_status_request;
}


#ifdef update_order_status_request_MAIN

void test_update_order_status_request(int include_optional) {
    update_order_status_request_t* update_order_status_request_1 = instantiate_update_order_status_request(include_optional);

	cJSON* jsonupdate_order_status_request_1 = update_order_status_request_convertToJSON(update_order_status_request_1);
	printf("update_order_status_request :\n%s\n", cJSON_Print(jsonupdate_order_status_request_1));
	update_order_status_request_t* update_order_status_request_2 = update_order_status_request_parseFromJSON(jsonupdate_order_status_request_1);
	cJSON* jsonupdate_order_status_request_2 = update_order_status_request_convertToJSON(update_order_status_request_2);
	printf("repeating update_order_status_request:\n%s\n", cJSON_Print(jsonupdate_order_status_request_2));
}

int main() {
  test_update_order_status_request(1);
  test_update_order_status_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_order_status_request_MAIN
#endif // update_order_status_request_TEST
