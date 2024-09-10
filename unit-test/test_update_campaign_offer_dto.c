#ifndef update_campaign_offer_dto_TEST
#define update_campaign_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_campaign_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_campaign_offer_dto.h"
update_campaign_offer_dto_t* instantiate_update_campaign_offer_dto(int include_optional);

#include "test_quantum_dto.c"


update_campaign_offer_dto_t* instantiate_update_campaign_offer_dto(int include_optional) {
  update_campaign_offer_dto_t* update_campaign_offer_dto = NULL;
  if (include_optional) {
    update_campaign_offer_dto = update_campaign_offer_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_quantum_dto(0),
      1,
      56
    );
  } else {
    update_campaign_offer_dto = update_campaign_offer_dto_create(
      "a",
      NULL,
      1,
      56
    );
  }

  return update_campaign_offer_dto;
}


#ifdef update_campaign_offer_dto_MAIN

void test_update_campaign_offer_dto(int include_optional) {
    update_campaign_offer_dto_t* update_campaign_offer_dto_1 = instantiate_update_campaign_offer_dto(include_optional);

	cJSON* jsonupdate_campaign_offer_dto_1 = update_campaign_offer_dto_convertToJSON(update_campaign_offer_dto_1);
	printf("update_campaign_offer_dto :\n%s\n", cJSON_Print(jsonupdate_campaign_offer_dto_1));
	update_campaign_offer_dto_t* update_campaign_offer_dto_2 = update_campaign_offer_dto_parseFromJSON(jsonupdate_campaign_offer_dto_1);
	cJSON* jsonupdate_campaign_offer_dto_2 = update_campaign_offer_dto_convertToJSON(update_campaign_offer_dto_2);
	printf("repeating update_campaign_offer_dto:\n%s\n", cJSON_Print(jsonupdate_campaign_offer_dto_2));
}

int main() {
  test_update_campaign_offer_dto(1);
  test_update_campaign_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_campaign_offer_dto_MAIN
#endif // update_campaign_offer_dto_TEST
