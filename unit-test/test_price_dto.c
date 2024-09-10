#ifndef price_dto_TEST
#define price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_dto.h"
price_dto_t* instantiate_price_dto(int include_optional);



price_dto_t* instantiate_price_dto(int include_optional) {
  price_dto_t* price_dto = NULL;
  if (include_optional) {
    price_dto = price_dto_create(
      1.337,
      1.337,
      _api__price_dto__RUR,
      56
    );
  } else {
    price_dto = price_dto_create(
      1.337,
      1.337,
      _api__price_dto__RUR,
      56
    );
  }

  return price_dto;
}


#ifdef price_dto_MAIN

void test_price_dto(int include_optional) {
    price_dto_t* price_dto_1 = instantiate_price_dto(include_optional);

	cJSON* jsonprice_dto_1 = price_dto_convertToJSON(price_dto_1);
	printf("price_dto :\n%s\n", cJSON_Print(jsonprice_dto_1));
	price_dto_t* price_dto_2 = price_dto_parseFromJSON(jsonprice_dto_1);
	cJSON* jsonprice_dto_2 = price_dto_convertToJSON(price_dto_2);
	printf("repeating price_dto:\n%s\n", cJSON_Print(jsonprice_dto_2));
}

int main() {
  test_price_dto(1);
  test_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_dto_MAIN
#endif // price_dto_TEST
