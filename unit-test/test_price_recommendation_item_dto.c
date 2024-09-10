#ifndef price_recommendation_item_dto_TEST
#define price_recommendation_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_recommendation_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_recommendation_item_dto.h"
price_recommendation_item_dto_t* instantiate_price_recommendation_item_dto(int include_optional);



price_recommendation_item_dto_t* instantiate_price_recommendation_item_dto(int include_optional) {
  price_recommendation_item_dto_t* price_recommendation_item_dto = NULL;
  if (include_optional) {
    price_recommendation_item_dto = price_recommendation_item_dto_create(
      56,
      1
    );
  } else {
    price_recommendation_item_dto = price_recommendation_item_dto_create(
      56,
      1
    );
  }

  return price_recommendation_item_dto;
}


#ifdef price_recommendation_item_dto_MAIN

void test_price_recommendation_item_dto(int include_optional) {
    price_recommendation_item_dto_t* price_recommendation_item_dto_1 = instantiate_price_recommendation_item_dto(include_optional);

	cJSON* jsonprice_recommendation_item_dto_1 = price_recommendation_item_dto_convertToJSON(price_recommendation_item_dto_1);
	printf("price_recommendation_item_dto :\n%s\n", cJSON_Print(jsonprice_recommendation_item_dto_1));
	price_recommendation_item_dto_t* price_recommendation_item_dto_2 = price_recommendation_item_dto_parseFromJSON(jsonprice_recommendation_item_dto_1);
	cJSON* jsonprice_recommendation_item_dto_2 = price_recommendation_item_dto_convertToJSON(price_recommendation_item_dto_2);
	printf("repeating price_recommendation_item_dto:\n%s\n", cJSON_Print(jsonprice_recommendation_item_dto_2));
}

int main() {
  test_price_recommendation_item_dto(1);
  test_price_recommendation_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_recommendation_item_dto_MAIN
#endif // price_recommendation_item_dto_TEST
