#ifndef campaign_quality_rating_dto_TEST
#define campaign_quality_rating_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_quality_rating_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_quality_rating_dto.h"
campaign_quality_rating_dto_t* instantiate_campaign_quality_rating_dto(int include_optional);



campaign_quality_rating_dto_t* instantiate_campaign_quality_rating_dto(int include_optional) {
  campaign_quality_rating_dto_t* campaign_quality_rating_dto = NULL;
  if (include_optional) {
    campaign_quality_rating_dto = campaign_quality_rating_dto_create(
      56,
      list_createList()
    );
  } else {
    campaign_quality_rating_dto = campaign_quality_rating_dto_create(
      56,
      list_createList()
    );
  }

  return campaign_quality_rating_dto;
}


#ifdef campaign_quality_rating_dto_MAIN

void test_campaign_quality_rating_dto(int include_optional) {
    campaign_quality_rating_dto_t* campaign_quality_rating_dto_1 = instantiate_campaign_quality_rating_dto(include_optional);

	cJSON* jsoncampaign_quality_rating_dto_1 = campaign_quality_rating_dto_convertToJSON(campaign_quality_rating_dto_1);
	printf("campaign_quality_rating_dto :\n%s\n", cJSON_Print(jsoncampaign_quality_rating_dto_1));
	campaign_quality_rating_dto_t* campaign_quality_rating_dto_2 = campaign_quality_rating_dto_parseFromJSON(jsoncampaign_quality_rating_dto_1);
	cJSON* jsoncampaign_quality_rating_dto_2 = campaign_quality_rating_dto_convertToJSON(campaign_quality_rating_dto_2);
	printf("repeating campaign_quality_rating_dto:\n%s\n", cJSON_Print(jsoncampaign_quality_rating_dto_2));
}

int main() {
  test_campaign_quality_rating_dto(1);
  test_campaign_quality_rating_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_quality_rating_dto_MAIN
#endif // campaign_quality_rating_dto_TEST
