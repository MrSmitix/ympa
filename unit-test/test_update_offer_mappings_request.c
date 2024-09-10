#ifndef update_offer_mappings_request_TEST
#define update_offer_mappings_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_offer_mappings_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_offer_mappings_request.h"
update_offer_mappings_request_t* instantiate_update_offer_mappings_request(int include_optional);



update_offer_mappings_request_t* instantiate_update_offer_mappings_request(int include_optional) {
  update_offer_mappings_request_t* update_offer_mappings_request = NULL;
  if (include_optional) {
    update_offer_mappings_request = update_offer_mappings_request_create(
      list_createList(),
      1
    );
  } else {
    update_offer_mappings_request = update_offer_mappings_request_create(
      list_createList(),
      1
    );
  }

  return update_offer_mappings_request;
}


#ifdef update_offer_mappings_request_MAIN

void test_update_offer_mappings_request(int include_optional) {
    update_offer_mappings_request_t* update_offer_mappings_request_1 = instantiate_update_offer_mappings_request(include_optional);

	cJSON* jsonupdate_offer_mappings_request_1 = update_offer_mappings_request_convertToJSON(update_offer_mappings_request_1);
	printf("update_offer_mappings_request :\n%s\n", cJSON_Print(jsonupdate_offer_mappings_request_1));
	update_offer_mappings_request_t* update_offer_mappings_request_2 = update_offer_mappings_request_parseFromJSON(jsonupdate_offer_mappings_request_1);
	cJSON* jsonupdate_offer_mappings_request_2 = update_offer_mappings_request_convertToJSON(update_offer_mappings_request_2);
	printf("repeating update_offer_mappings_request:\n%s\n", cJSON_Print(jsonupdate_offer_mappings_request_2));
}

int main() {
  test_update_offer_mappings_request(1);
  test_update_offer_mappings_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_offer_mappings_request_MAIN
#endif // update_offer_mappings_request_TEST
