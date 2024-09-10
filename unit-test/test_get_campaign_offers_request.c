#ifndef get_campaign_offers_request_TEST
#define get_campaign_offers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_campaign_offers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_campaign_offers_request.h"
get_campaign_offers_request_t* instantiate_get_campaign_offers_request(int include_optional);



get_campaign_offers_request_t* instantiate_get_campaign_offers_request(int include_optional) {
  get_campaign_offers_request_t* get_campaign_offers_request = NULL;
  if (include_optional) {
    get_campaign_offers_request = get_campaign_offers_request_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    get_campaign_offers_request = get_campaign_offers_request_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return get_campaign_offers_request;
}


#ifdef get_campaign_offers_request_MAIN

void test_get_campaign_offers_request(int include_optional) {
    get_campaign_offers_request_t* get_campaign_offers_request_1 = instantiate_get_campaign_offers_request(include_optional);

	cJSON* jsonget_campaign_offers_request_1 = get_campaign_offers_request_convertToJSON(get_campaign_offers_request_1);
	printf("get_campaign_offers_request :\n%s\n", cJSON_Print(jsonget_campaign_offers_request_1));
	get_campaign_offers_request_t* get_campaign_offers_request_2 = get_campaign_offers_request_parseFromJSON(jsonget_campaign_offers_request_1);
	cJSON* jsonget_campaign_offers_request_2 = get_campaign_offers_request_convertToJSON(get_campaign_offers_request_2);
	printf("repeating get_campaign_offers_request:\n%s\n", cJSON_Print(jsonget_campaign_offers_request_2));
}

int main() {
  test_get_campaign_offers_request(1);
  test_get_campaign_offers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_campaign_offers_request_MAIN
#endif // get_campaign_offers_request_TEST
