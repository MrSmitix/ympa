#ifndef price_suggest_dto_TEST
#define price_suggest_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_suggest_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_suggest_dto.h"
price_suggest_dto_t* instantiate_price_suggest_dto(int include_optional);



price_suggest_dto_t* instantiate_price_suggest_dto(int include_optional) {
  price_suggest_dto_t* price_suggest_dto = NULL;
  if (include_optional) {
    price_suggest_dto = price_suggest_dto_create(
      _api__price_suggest_dto__BUYBOX,
      1.337
    );
  } else {
    price_suggest_dto = price_suggest_dto_create(
      _api__price_suggest_dto__BUYBOX,
      1.337
    );
  }

  return price_suggest_dto;
}


#ifdef price_suggest_dto_MAIN

void test_price_suggest_dto(int include_optional) {
    price_suggest_dto_t* price_suggest_dto_1 = instantiate_price_suggest_dto(include_optional);

	cJSON* jsonprice_suggest_dto_1 = price_suggest_dto_convertToJSON(price_suggest_dto_1);
	printf("price_suggest_dto :\n%s\n", cJSON_Print(jsonprice_suggest_dto_1));
	price_suggest_dto_t* price_suggest_dto_2 = price_suggest_dto_parseFromJSON(jsonprice_suggest_dto_1);
	cJSON* jsonprice_suggest_dto_2 = price_suggest_dto_convertToJSON(price_suggest_dto_2);
	printf("repeating price_suggest_dto:\n%s\n", cJSON_Print(jsonprice_suggest_dto_2));
}

int main() {
  test_price_suggest_dto(1);
  test_price_suggest_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_suggest_dto_MAIN
#endif // price_suggest_dto_TEST
