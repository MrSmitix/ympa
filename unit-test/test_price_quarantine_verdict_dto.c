#ifndef price_quarantine_verdict_dto_TEST
#define price_quarantine_verdict_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_quarantine_verdict_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_quarantine_verdict_dto.h"
price_quarantine_verdict_dto_t* instantiate_price_quarantine_verdict_dto(int include_optional);



price_quarantine_verdict_dto_t* instantiate_price_quarantine_verdict_dto(int include_optional) {
  price_quarantine_verdict_dto_t* price_quarantine_verdict_dto = NULL;
  if (include_optional) {
    price_quarantine_verdict_dto = price_quarantine_verdict_dto_create(
      _api__price_quarantine_verdict_dto__PRICE_CHANGE,
      list_createList()
    );
  } else {
    price_quarantine_verdict_dto = price_quarantine_verdict_dto_create(
      _api__price_quarantine_verdict_dto__PRICE_CHANGE,
      list_createList()
    );
  }

  return price_quarantine_verdict_dto;
}


#ifdef price_quarantine_verdict_dto_MAIN

void test_price_quarantine_verdict_dto(int include_optional) {
    price_quarantine_verdict_dto_t* price_quarantine_verdict_dto_1 = instantiate_price_quarantine_verdict_dto(include_optional);

	cJSON* jsonprice_quarantine_verdict_dto_1 = price_quarantine_verdict_dto_convertToJSON(price_quarantine_verdict_dto_1);
	printf("price_quarantine_verdict_dto :\n%s\n", cJSON_Print(jsonprice_quarantine_verdict_dto_1));
	price_quarantine_verdict_dto_t* price_quarantine_verdict_dto_2 = price_quarantine_verdict_dto_parseFromJSON(jsonprice_quarantine_verdict_dto_1);
	cJSON* jsonprice_quarantine_verdict_dto_2 = price_quarantine_verdict_dto_convertToJSON(price_quarantine_verdict_dto_2);
	printf("repeating price_quarantine_verdict_dto:\n%s\n", cJSON_Print(jsonprice_quarantine_verdict_dto_2));
}

int main() {
  test_price_quarantine_verdict_dto(1);
  test_price_quarantine_verdict_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_quarantine_verdict_dto_MAIN
#endif // price_quarantine_verdict_dto_TEST
