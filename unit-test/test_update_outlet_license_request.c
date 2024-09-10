#ifndef update_outlet_license_request_TEST
#define update_outlet_license_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_outlet_license_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_outlet_license_request.h"
update_outlet_license_request_t* instantiate_update_outlet_license_request(int include_optional);



update_outlet_license_request_t* instantiate_update_outlet_license_request(int include_optional) {
  update_outlet_license_request_t* update_outlet_license_request = NULL;
  if (include_optional) {
    update_outlet_license_request = update_outlet_license_request_create(
      list_createList()
    );
  } else {
    update_outlet_license_request = update_outlet_license_request_create(
      list_createList()
    );
  }

  return update_outlet_license_request;
}


#ifdef update_outlet_license_request_MAIN

void test_update_outlet_license_request(int include_optional) {
    update_outlet_license_request_t* update_outlet_license_request_1 = instantiate_update_outlet_license_request(include_optional);

	cJSON* jsonupdate_outlet_license_request_1 = update_outlet_license_request_convertToJSON(update_outlet_license_request_1);
	printf("update_outlet_license_request :\n%s\n", cJSON_Print(jsonupdate_outlet_license_request_1));
	update_outlet_license_request_t* update_outlet_license_request_2 = update_outlet_license_request_parseFromJSON(jsonupdate_outlet_license_request_1);
	cJSON* jsonupdate_outlet_license_request_2 = update_outlet_license_request_convertToJSON(update_outlet_license_request_2);
	printf("repeating update_outlet_license_request:\n%s\n", cJSON_Print(jsonupdate_outlet_license_request_2));
}

int main() {
  test_update_outlet_license_request(1);
  test_update_outlet_license_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_outlet_license_request_MAIN
#endif // update_outlet_license_request_TEST
