#ifndef campaigns_quality_rating_dto_TEST
#define campaigns_quality_rating_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaigns_quality_rating_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaigns_quality_rating_dto.h"
campaigns_quality_rating_dto_t* instantiate_campaigns_quality_rating_dto(int include_optional);



campaigns_quality_rating_dto_t* instantiate_campaigns_quality_rating_dto(int include_optional) {
  campaigns_quality_rating_dto_t* campaigns_quality_rating_dto = NULL;
  if (include_optional) {
    campaigns_quality_rating_dto = campaigns_quality_rating_dto_create(
      list_createList()
    );
  } else {
    campaigns_quality_rating_dto = campaigns_quality_rating_dto_create(
      list_createList()
    );
  }

  return campaigns_quality_rating_dto;
}


#ifdef campaigns_quality_rating_dto_MAIN

void test_campaigns_quality_rating_dto(int include_optional) {
    campaigns_quality_rating_dto_t* campaigns_quality_rating_dto_1 = instantiate_campaigns_quality_rating_dto(include_optional);

	cJSON* jsoncampaigns_quality_rating_dto_1 = campaigns_quality_rating_dto_convertToJSON(campaigns_quality_rating_dto_1);
	printf("campaigns_quality_rating_dto :\n%s\n", cJSON_Print(jsoncampaigns_quality_rating_dto_1));
	campaigns_quality_rating_dto_t* campaigns_quality_rating_dto_2 = campaigns_quality_rating_dto_parseFromJSON(jsoncampaigns_quality_rating_dto_1);
	cJSON* jsoncampaigns_quality_rating_dto_2 = campaigns_quality_rating_dto_convertToJSON(campaigns_quality_rating_dto_2);
	printf("repeating campaigns_quality_rating_dto:\n%s\n", cJSON_Print(jsoncampaigns_quality_rating_dto_2));
}

int main() {
  test_campaigns_quality_rating_dto(1);
  test_campaigns_quality_rating_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaigns_quality_rating_dto_MAIN
#endif // campaigns_quality_rating_dto_TEST
