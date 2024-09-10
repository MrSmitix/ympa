#ifndef offer_campaign_status_type_TEST
#define offer_campaign_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_campaign_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_campaign_status_type.h"
offer_campaign_status_type_t* instantiate_offer_campaign_status_type(int include_optional);



offer_campaign_status_type_t* instantiate_offer_campaign_status_type(int include_optional) {
  offer_campaign_status_type_t* offer_campaign_status_type = NULL;
  if (include_optional) {
    offer_campaign_status_type = offer_campaign_status_type_create(
    );
  } else {
    offer_campaign_status_type = offer_campaign_status_type_create(
    );
  }

  return offer_campaign_status_type;
}


#ifdef offer_campaign_status_type_MAIN

void test_offer_campaign_status_type(int include_optional) {
    offer_campaign_status_type_t* offer_campaign_status_type_1 = instantiate_offer_campaign_status_type(include_optional);

	cJSON* jsonoffer_campaign_status_type_1 = offer_campaign_status_type_convertToJSON(offer_campaign_status_type_1);
	printf("offer_campaign_status_type :\n%s\n", cJSON_Print(jsonoffer_campaign_status_type_1));
	offer_campaign_status_type_t* offer_campaign_status_type_2 = offer_campaign_status_type_parseFromJSON(jsonoffer_campaign_status_type_1);
	cJSON* jsonoffer_campaign_status_type_2 = offer_campaign_status_type_convertToJSON(offer_campaign_status_type_2);
	printf("repeating offer_campaign_status_type:\n%s\n", cJSON_Print(jsonoffer_campaign_status_type_2));
}

int main() {
  test_offer_campaign_status_type(1);
  test_offer_campaign_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_campaign_status_type_MAIN
#endif // offer_campaign_status_type_TEST
