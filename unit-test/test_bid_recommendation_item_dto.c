#ifndef bid_recommendation_item_dto_TEST
#define bid_recommendation_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bid_recommendation_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bid_recommendation_item_dto.h"
bid_recommendation_item_dto_t* instantiate_bid_recommendation_item_dto(int include_optional);



bid_recommendation_item_dto_t* instantiate_bid_recommendation_item_dto(int include_optional) {
  bid_recommendation_item_dto_t* bid_recommendation_item_dto = NULL;
  if (include_optional) {
    bid_recommendation_item_dto = bid_recommendation_item_dto_create(
      570,
      0
    );
  } else {
    bid_recommendation_item_dto = bid_recommendation_item_dto_create(
      570,
      0
    );
  }

  return bid_recommendation_item_dto;
}


#ifdef bid_recommendation_item_dto_MAIN

void test_bid_recommendation_item_dto(int include_optional) {
    bid_recommendation_item_dto_t* bid_recommendation_item_dto_1 = instantiate_bid_recommendation_item_dto(include_optional);

	cJSON* jsonbid_recommendation_item_dto_1 = bid_recommendation_item_dto_convertToJSON(bid_recommendation_item_dto_1);
	printf("bid_recommendation_item_dto :\n%s\n", cJSON_Print(jsonbid_recommendation_item_dto_1));
	bid_recommendation_item_dto_t* bid_recommendation_item_dto_2 = bid_recommendation_item_dto_parseFromJSON(jsonbid_recommendation_item_dto_1);
	cJSON* jsonbid_recommendation_item_dto_2 = bid_recommendation_item_dto_convertToJSON(bid_recommendation_item_dto_2);
	printf("repeating bid_recommendation_item_dto:\n%s\n", cJSON_Print(jsonbid_recommendation_item_dto_2));
}

int main() {
  test_bid_recommendation_item_dto(1);
  test_bid_recommendation_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // bid_recommendation_item_dto_MAIN
#endif // bid_recommendation_item_dto_TEST
