#ifndef campaign_settings_dto_TEST
#define campaign_settings_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_settings_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_settings_dto.h"
campaign_settings_dto_t* instantiate_campaign_settings_dto(int include_optional);

#include "test_campaign_settings_local_region_dto.c"


campaign_settings_dto_t* instantiate_campaign_settings_dto(int include_optional) {
  campaign_settings_dto_t* campaign_settings_dto = NULL;
  if (include_optional) {
    campaign_settings_dto = campaign_settings_dto_create(
      56,
      "0",
      1,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_campaign_settings_local_region_dto(0)
    );
  } else {
    campaign_settings_dto = campaign_settings_dto_create(
      56,
      "0",
      1,
      1,
      1,
      NULL
    );
  }

  return campaign_settings_dto;
}


#ifdef campaign_settings_dto_MAIN

void test_campaign_settings_dto(int include_optional) {
    campaign_settings_dto_t* campaign_settings_dto_1 = instantiate_campaign_settings_dto(include_optional);

	cJSON* jsoncampaign_settings_dto_1 = campaign_settings_dto_convertToJSON(campaign_settings_dto_1);
	printf("campaign_settings_dto :\n%s\n", cJSON_Print(jsoncampaign_settings_dto_1));
	campaign_settings_dto_t* campaign_settings_dto_2 = campaign_settings_dto_parseFromJSON(jsoncampaign_settings_dto_1);
	cJSON* jsoncampaign_settings_dto_2 = campaign_settings_dto_convertToJSON(campaign_settings_dto_2);
	printf("repeating campaign_settings_dto:\n%s\n", cJSON_Print(jsoncampaign_settings_dto_2));
}

int main() {
  test_campaign_settings_dto(1);
  test_campaign_settings_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_settings_dto_MAIN
#endif // campaign_settings_dto_TEST
