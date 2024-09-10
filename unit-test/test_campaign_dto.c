#ifndef campaign_dto_TEST
#define campaign_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_dto.h"
campaign_dto_t* instantiate_campaign_dto(int include_optional);

#include "test_business_dto.c"


campaign_dto_t* instantiate_campaign_dto(int include_optional) {
  campaign_dto_t* campaign_dto = NULL;
  if (include_optional) {
    campaign_dto = campaign_dto_create(
      "0",
      56,
      56,
       // false, not to have infinite recursion
      instantiate_business_dto(0),
      _api__campaign_dto__FBS
    );
  } else {
    campaign_dto = campaign_dto_create(
      "0",
      56,
      56,
      NULL,
      _api__campaign_dto__FBS
    );
  }

  return campaign_dto;
}


#ifdef campaign_dto_MAIN

void test_campaign_dto(int include_optional) {
    campaign_dto_t* campaign_dto_1 = instantiate_campaign_dto(include_optional);

	cJSON* jsoncampaign_dto_1 = campaign_dto_convertToJSON(campaign_dto_1);
	printf("campaign_dto :\n%s\n", cJSON_Print(jsoncampaign_dto_1));
	campaign_dto_t* campaign_dto_2 = campaign_dto_parseFromJSON(jsoncampaign_dto_1);
	cJSON* jsoncampaign_dto_2 = campaign_dto_convertToJSON(campaign_dto_2);
	printf("repeating campaign_dto:\n%s\n", cJSON_Print(jsoncampaign_dto_2));
}

int main() {
  test_campaign_dto(1);
  test_campaign_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_dto_MAIN
#endif // campaign_dto_TEST
