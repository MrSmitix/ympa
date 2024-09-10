#ifndef update_stocks_request_TEST
#define update_stocks_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_stocks_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_stocks_request.h"
update_stocks_request_t* instantiate_update_stocks_request(int include_optional);



update_stocks_request_t* instantiate_update_stocks_request(int include_optional) {
  update_stocks_request_t* update_stocks_request = NULL;
  if (include_optional) {
    update_stocks_request = update_stocks_request_create(
      list_createList()
    );
  } else {
    update_stocks_request = update_stocks_request_create(
      list_createList()
    );
  }

  return update_stocks_request;
}


#ifdef update_stocks_request_MAIN

void test_update_stocks_request(int include_optional) {
    update_stocks_request_t* update_stocks_request_1 = instantiate_update_stocks_request(include_optional);

	cJSON* jsonupdate_stocks_request_1 = update_stocks_request_convertToJSON(update_stocks_request_1);
	printf("update_stocks_request :\n%s\n", cJSON_Print(jsonupdate_stocks_request_1));
	update_stocks_request_t* update_stocks_request_2 = update_stocks_request_parseFromJSON(jsonupdate_stocks_request_1);
	cJSON* jsonupdate_stocks_request_2 = update_stocks_request_convertToJSON(update_stocks_request_2);
	printf("repeating update_stocks_request:\n%s\n", cJSON_Print(jsonupdate_stocks_request_2));
}

int main() {
  test_update_stocks_request(1);
  test_update_stocks_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_stocks_request_MAIN
#endif // update_stocks_request_TEST
