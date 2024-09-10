#ifndef campaign_settings_schedule_dto_TEST
#define campaign_settings_schedule_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_settings_schedule_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_settings_schedule_dto.h"
campaign_settings_schedule_dto_t* instantiate_campaign_settings_schedule_dto(int include_optional);

#include "test_campaign_settings_time_period_dto.c"


campaign_settings_schedule_dto_t* instantiate_campaign_settings_schedule_dto(int include_optional) {
  campaign_settings_schedule_dto_t* campaign_settings_schedule_dto = NULL;
  if (include_optional) {
    campaign_settings_schedule_dto = campaign_settings_schedule_dto_create(
      1,
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_campaign_settings_time_period_dto(0),
      list_createList(),
      list_createList()
    );
  } else {
    campaign_settings_schedule_dto = campaign_settings_schedule_dto_create(
      1,
      list_createList(),
      list_createList(),
      NULL,
      list_createList(),
      list_createList()
    );
  }

  return campaign_settings_schedule_dto;
}


#ifdef campaign_settings_schedule_dto_MAIN

void test_campaign_settings_schedule_dto(int include_optional) {
    campaign_settings_schedule_dto_t* campaign_settings_schedule_dto_1 = instantiate_campaign_settings_schedule_dto(include_optional);

	cJSON* jsoncampaign_settings_schedule_dto_1 = campaign_settings_schedule_dto_convertToJSON(campaign_settings_schedule_dto_1);
	printf("campaign_settings_schedule_dto :\n%s\n", cJSON_Print(jsoncampaign_settings_schedule_dto_1));
	campaign_settings_schedule_dto_t* campaign_settings_schedule_dto_2 = campaign_settings_schedule_dto_parseFromJSON(jsoncampaign_settings_schedule_dto_1);
	cJSON* jsoncampaign_settings_schedule_dto_2 = campaign_settings_schedule_dto_convertToJSON(campaign_settings_schedule_dto_2);
	printf("repeating campaign_settings_schedule_dto:\n%s\n", cJSON_Print(jsoncampaign_settings_schedule_dto_2));
}

int main() {
  test_campaign_settings_schedule_dto(1);
  test_campaign_settings_schedule_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_settings_schedule_dto_MAIN
#endif // campaign_settings_schedule_dto_TEST
