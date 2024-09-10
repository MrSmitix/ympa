#ifndef delete_campaign_offers_dto_TEST
#define delete_campaign_offers_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_campaign_offers_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_campaign_offers_dto.h"
delete_campaign_offers_dto_t* instantiate_delete_campaign_offers_dto(int include_optional);



delete_campaign_offers_dto_t* instantiate_delete_campaign_offers_dto(int include_optional) {
  delete_campaign_offers_dto_t* delete_campaign_offers_dto = NULL;
  if (include_optional) {
    delete_campaign_offers_dto = delete_campaign_offers_dto_create(
      list_createList()
    );
  } else {
    delete_campaign_offers_dto = delete_campaign_offers_dto_create(
      list_createList()
    );
  }

  return delete_campaign_offers_dto;
}


#ifdef delete_campaign_offers_dto_MAIN

void test_delete_campaign_offers_dto(int include_optional) {
    delete_campaign_offers_dto_t* delete_campaign_offers_dto_1 = instantiate_delete_campaign_offers_dto(include_optional);

	cJSON* jsondelete_campaign_offers_dto_1 = delete_campaign_offers_dto_convertToJSON(delete_campaign_offers_dto_1);
	printf("delete_campaign_offers_dto :\n%s\n", cJSON_Print(jsondelete_campaign_offers_dto_1));
	delete_campaign_offers_dto_t* delete_campaign_offers_dto_2 = delete_campaign_offers_dto_parseFromJSON(jsondelete_campaign_offers_dto_1);
	cJSON* jsondelete_campaign_offers_dto_2 = delete_campaign_offers_dto_convertToJSON(delete_campaign_offers_dto_2);
	printf("repeating delete_campaign_offers_dto:\n%s\n", cJSON_Print(jsondelete_campaign_offers_dto_2));
}

int main() {
  test_delete_campaign_offers_dto(1);
  test_delete_campaign_offers_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_campaign_offers_dto_MAIN
#endif // delete_campaign_offers_dto_TEST
