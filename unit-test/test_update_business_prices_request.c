#ifndef update_business_prices_request_TEST
#define update_business_prices_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_business_prices_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_business_prices_request.h"
update_business_prices_request_t* instantiate_update_business_prices_request(int include_optional);



update_business_prices_request_t* instantiate_update_business_prices_request(int include_optional) {
  update_business_prices_request_t* update_business_prices_request = NULL;
  if (include_optional) {
    update_business_prices_request = update_business_prices_request_create(
      list_createList()
    );
  } else {
    update_business_prices_request = update_business_prices_request_create(
      list_createList()
    );
  }

  return update_business_prices_request;
}


#ifdef update_business_prices_request_MAIN

void test_update_business_prices_request(int include_optional) {
    update_business_prices_request_t* update_business_prices_request_1 = instantiate_update_business_prices_request(include_optional);

	cJSON* jsonupdate_business_prices_request_1 = update_business_prices_request_convertToJSON(update_business_prices_request_1);
	printf("update_business_prices_request :\n%s\n", cJSON_Print(jsonupdate_business_prices_request_1));
	update_business_prices_request_t* update_business_prices_request_2 = update_business_prices_request_parseFromJSON(jsonupdate_business_prices_request_1);
	cJSON* jsonupdate_business_prices_request_2 = update_business_prices_request_convertToJSON(update_business_prices_request_2);
	printf("repeating update_business_prices_request:\n%s\n", cJSON_Print(jsonupdate_business_prices_request_2));
}

int main() {
  test_update_business_prices_request(1);
  test_update_business_prices_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_business_prices_request_MAIN
#endif // update_business_prices_request_TEST
