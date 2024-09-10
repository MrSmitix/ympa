#ifndef price_competitiveness_thresholds_dto_TEST
#define price_competitiveness_thresholds_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_competitiveness_thresholds_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_competitiveness_thresholds_dto.h"
price_competitiveness_thresholds_dto_t* instantiate_price_competitiveness_thresholds_dto(int include_optional);

#include "test_base_price_dto.c"
#include "test_base_price_dto.c"


price_competitiveness_thresholds_dto_t* instantiate_price_competitiveness_thresholds_dto(int include_optional) {
  price_competitiveness_thresholds_dto_t* price_competitiveness_thresholds_dto = NULL;
  if (include_optional) {
    price_competitiveness_thresholds_dto = price_competitiveness_thresholds_dto_create(
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
       // false, not to have infinite recursion
      instantiate_base_price_dto(0)
    );
  } else {
    price_competitiveness_thresholds_dto = price_competitiveness_thresholds_dto_create(
      NULL,
      NULL
    );
  }

  return price_competitiveness_thresholds_dto;
}


#ifdef price_competitiveness_thresholds_dto_MAIN

void test_price_competitiveness_thresholds_dto(int include_optional) {
    price_competitiveness_thresholds_dto_t* price_competitiveness_thresholds_dto_1 = instantiate_price_competitiveness_thresholds_dto(include_optional);

	cJSON* jsonprice_competitiveness_thresholds_dto_1 = price_competitiveness_thresholds_dto_convertToJSON(price_competitiveness_thresholds_dto_1);
	printf("price_competitiveness_thresholds_dto :\n%s\n", cJSON_Print(jsonprice_competitiveness_thresholds_dto_1));
	price_competitiveness_thresholds_dto_t* price_competitiveness_thresholds_dto_2 = price_competitiveness_thresholds_dto_parseFromJSON(jsonprice_competitiveness_thresholds_dto_1);
	cJSON* jsonprice_competitiveness_thresholds_dto_2 = price_competitiveness_thresholds_dto_convertToJSON(price_competitiveness_thresholds_dto_2);
	printf("repeating price_competitiveness_thresholds_dto:\n%s\n", cJSON_Print(jsonprice_competitiveness_thresholds_dto_2));
}

int main() {
  test_price_competitiveness_thresholds_dto(1);
  test_price_competitiveness_thresholds_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_competitiveness_thresholds_dto_MAIN
#endif // price_competitiveness_thresholds_dto_TEST
