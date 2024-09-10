#ifndef update_offer_mappings_response_TEST
#define update_offer_mappings_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_offer_mappings_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_offer_mappings_response.h"
update_offer_mappings_response_t* instantiate_update_offer_mappings_response(int include_optional);



update_offer_mappings_response_t* instantiate_update_offer_mappings_response(int include_optional) {
  update_offer_mappings_response_t* update_offer_mappings_response = NULL;
  if (include_optional) {
    update_offer_mappings_response = update_offer_mappings_response_create(
      _api__update_offer_mappings_response__OK,
      list_createList()
    );
  } else {
    update_offer_mappings_response = update_offer_mappings_response_create(
      _api__update_offer_mappings_response__OK,
      list_createList()
    );
  }

  return update_offer_mappings_response;
}


#ifdef update_offer_mappings_response_MAIN

void test_update_offer_mappings_response(int include_optional) {
    update_offer_mappings_response_t* update_offer_mappings_response_1 = instantiate_update_offer_mappings_response(include_optional);

	cJSON* jsonupdate_offer_mappings_response_1 = update_offer_mappings_response_convertToJSON(update_offer_mappings_response_1);
	printf("update_offer_mappings_response :\n%s\n", cJSON_Print(jsonupdate_offer_mappings_response_1));
	update_offer_mappings_response_t* update_offer_mappings_response_2 = update_offer_mappings_response_parseFromJSON(jsonupdate_offer_mappings_response_1);
	cJSON* jsonupdate_offer_mappings_response_2 = update_offer_mappings_response_convertToJSON(update_offer_mappings_response_2);
	printf("repeating update_offer_mappings_response:\n%s\n", cJSON_Print(jsonupdate_offer_mappings_response_2));
}

int main() {
  test_update_offer_mappings_response(1);
  test_update_offer_mappings_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_offer_mappings_response_MAIN
#endif // update_offer_mappings_response_TEST
