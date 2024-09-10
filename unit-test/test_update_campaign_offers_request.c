#ifndef update_campaign_offers_request_TEST
#define update_campaign_offers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_campaign_offers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_campaign_offers_request.h"
update_campaign_offers_request_t* instantiate_update_campaign_offers_request(int include_optional);



update_campaign_offers_request_t* instantiate_update_campaign_offers_request(int include_optional) {
  update_campaign_offers_request_t* update_campaign_offers_request = NULL;
  if (include_optional) {
    update_campaign_offers_request = update_campaign_offers_request_create(
      list_createList()
    );
  } else {
    update_campaign_offers_request = update_campaign_offers_request_create(
      list_createList()
    );
  }

  return update_campaign_offers_request;
}


#ifdef update_campaign_offers_request_MAIN

void test_update_campaign_offers_request(int include_optional) {
    update_campaign_offers_request_t* update_campaign_offers_request_1 = instantiate_update_campaign_offers_request(include_optional);

	cJSON* jsonupdate_campaign_offers_request_1 = update_campaign_offers_request_convertToJSON(update_campaign_offers_request_1);
	printf("update_campaign_offers_request :\n%s\n", cJSON_Print(jsonupdate_campaign_offers_request_1));
	update_campaign_offers_request_t* update_campaign_offers_request_2 = update_campaign_offers_request_parseFromJSON(jsonupdate_campaign_offers_request_1);
	cJSON* jsonupdate_campaign_offers_request_2 = update_campaign_offers_request_convertToJSON(update_campaign_offers_request_2);
	printf("repeating update_campaign_offers_request:\n%s\n", cJSON_Print(jsonupdate_campaign_offers_request_2));
}

int main() {
  test_update_campaign_offers_request(1);
  test_update_campaign_offers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_campaign_offers_request_MAIN
#endif // update_campaign_offers_request_TEST
