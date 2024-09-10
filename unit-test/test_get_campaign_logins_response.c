#ifndef get_campaign_logins_response_TEST
#define get_campaign_logins_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_campaign_logins_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_campaign_logins_response.h"
get_campaign_logins_response_t* instantiate_get_campaign_logins_response(int include_optional);



get_campaign_logins_response_t* instantiate_get_campaign_logins_response(int include_optional) {
  get_campaign_logins_response_t* get_campaign_logins_response = NULL;
  if (include_optional) {
    get_campaign_logins_response = get_campaign_logins_response_create(
      list_createList()
    );
  } else {
    get_campaign_logins_response = get_campaign_logins_response_create(
      list_createList()
    );
  }

  return get_campaign_logins_response;
}


#ifdef get_campaign_logins_response_MAIN

void test_get_campaign_logins_response(int include_optional) {
    get_campaign_logins_response_t* get_campaign_logins_response_1 = instantiate_get_campaign_logins_response(include_optional);

	cJSON* jsonget_campaign_logins_response_1 = get_campaign_logins_response_convertToJSON(get_campaign_logins_response_1);
	printf("get_campaign_logins_response :\n%s\n", cJSON_Print(jsonget_campaign_logins_response_1));
	get_campaign_logins_response_t* get_campaign_logins_response_2 = get_campaign_logins_response_parseFromJSON(jsonget_campaign_logins_response_1);
	cJSON* jsonget_campaign_logins_response_2 = get_campaign_logins_response_convertToJSON(get_campaign_logins_response_2);
	printf("repeating get_campaign_logins_response:\n%s\n", cJSON_Print(jsonget_campaign_logins_response_2));
}

int main() {
  test_get_campaign_logins_response(1);
  test_get_campaign_logins_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_campaign_logins_response_MAIN
#endif // get_campaign_logins_response_TEST
