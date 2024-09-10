#ifndef update_prices_request_TEST
#define update_prices_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_prices_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_prices_request.h"
update_prices_request_t* instantiate_update_prices_request(int include_optional);



update_prices_request_t* instantiate_update_prices_request(int include_optional) {
  update_prices_request_t* update_prices_request = NULL;
  if (include_optional) {
    update_prices_request = update_prices_request_create(
      list_createList()
    );
  } else {
    update_prices_request = update_prices_request_create(
      list_createList()
    );
  }

  return update_prices_request;
}


#ifdef update_prices_request_MAIN

void test_update_prices_request(int include_optional) {
    update_prices_request_t* update_prices_request_1 = instantiate_update_prices_request(include_optional);

	cJSON* jsonupdate_prices_request_1 = update_prices_request_convertToJSON(update_prices_request_1);
	printf("update_prices_request :\n%s\n", cJSON_Print(jsonupdate_prices_request_1));
	update_prices_request_t* update_prices_request_2 = update_prices_request_parseFromJSON(jsonupdate_prices_request_1);
	cJSON* jsonupdate_prices_request_2 = update_prices_request_convertToJSON(update_prices_request_2);
	printf("repeating update_prices_request:\n%s\n", cJSON_Print(jsonupdate_prices_request_2));
}

int main() {
  test_update_prices_request(1);
  test_update_prices_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_prices_request_MAIN
#endif // update_prices_request_TEST
