#ifndef suggest_offer_price_dto_TEST
#define suggest_offer_price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define suggest_offer_price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/suggest_offer_price_dto.h"
suggest_offer_price_dto_t* instantiate_suggest_offer_price_dto(int include_optional);



suggest_offer_price_dto_t* instantiate_suggest_offer_price_dto(int include_optional) {
  suggest_offer_price_dto_t* suggest_offer_price_dto = NULL;
  if (include_optional) {
    suggest_offer_price_dto = suggest_offer_price_dto_create(
      "a",
      56
    );
  } else {
    suggest_offer_price_dto = suggest_offer_price_dto_create(
      "a",
      56
    );
  }

  return suggest_offer_price_dto;
}


#ifdef suggest_offer_price_dto_MAIN

void test_suggest_offer_price_dto(int include_optional) {
    suggest_offer_price_dto_t* suggest_offer_price_dto_1 = instantiate_suggest_offer_price_dto(include_optional);

	cJSON* jsonsuggest_offer_price_dto_1 = suggest_offer_price_dto_convertToJSON(suggest_offer_price_dto_1);
	printf("suggest_offer_price_dto :\n%s\n", cJSON_Print(jsonsuggest_offer_price_dto_1));
	suggest_offer_price_dto_t* suggest_offer_price_dto_2 = suggest_offer_price_dto_parseFromJSON(jsonsuggest_offer_price_dto_1);
	cJSON* jsonsuggest_offer_price_dto_2 = suggest_offer_price_dto_convertToJSON(suggest_offer_price_dto_2);
	printf("repeating suggest_offer_price_dto:\n%s\n", cJSON_Print(jsonsuggest_offer_price_dto_2));
}

int main() {
  test_suggest_offer_price_dto(1);
  test_suggest_offer_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // suggest_offer_price_dto_MAIN
#endif // suggest_offer_price_dto_TEST
