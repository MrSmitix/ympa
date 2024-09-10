#ifndef campaign_settings_schedule_source_type_TEST
#define campaign_settings_schedule_source_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_settings_schedule_source_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_settings_schedule_source_type.h"
campaign_settings_schedule_source_type_t* instantiate_campaign_settings_schedule_source_type(int include_optional);



campaign_settings_schedule_source_type_t* instantiate_campaign_settings_schedule_source_type(int include_optional) {
  campaign_settings_schedule_source_type_t* campaign_settings_schedule_source_type = NULL;
  if (include_optional) {
    campaign_settings_schedule_source_type = campaign_settings_schedule_source_type_create(
    );
  } else {
    campaign_settings_schedule_source_type = campaign_settings_schedule_source_type_create(
    );
  }

  return campaign_settings_schedule_source_type;
}


#ifdef campaign_settings_schedule_source_type_MAIN

void test_campaign_settings_schedule_source_type(int include_optional) {
    campaign_settings_schedule_source_type_t* campaign_settings_schedule_source_type_1 = instantiate_campaign_settings_schedule_source_type(include_optional);

	cJSON* jsoncampaign_settings_schedule_source_type_1 = campaign_settings_schedule_source_type_convertToJSON(campaign_settings_schedule_source_type_1);
	printf("campaign_settings_schedule_source_type :\n%s\n", cJSON_Print(jsoncampaign_settings_schedule_source_type_1));
	campaign_settings_schedule_source_type_t* campaign_settings_schedule_source_type_2 = campaign_settings_schedule_source_type_parseFromJSON(jsoncampaign_settings_schedule_source_type_1);
	cJSON* jsoncampaign_settings_schedule_source_type_2 = campaign_settings_schedule_source_type_convertToJSON(campaign_settings_schedule_source_type_2);
	printf("repeating campaign_settings_schedule_source_type:\n%s\n", cJSON_Print(jsoncampaign_settings_schedule_source_type_2));
}

int main() {
  test_campaign_settings_schedule_source_type(1);
  test_campaign_settings_schedule_source_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_settings_schedule_source_type_MAIN
#endif // campaign_settings_schedule_source_type_TEST
