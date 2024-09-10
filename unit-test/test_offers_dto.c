#ifndef offers_dto_TEST
#define offers_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offers_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offers_dto.h"
offers_dto_t* instantiate_offers_dto(int include_optional);



offers_dto_t* instantiate_offers_dto(int include_optional) {
  offers_dto_t* offers_dto = NULL;
  if (include_optional) {
    offers_dto = offers_dto_create(
      list_createList()
    );
  } else {
    offers_dto = offers_dto_create(
      list_createList()
    );
  }

  return offers_dto;
}


#ifdef offers_dto_MAIN

void test_offers_dto(int include_optional) {
    offers_dto_t* offers_dto_1 = instantiate_offers_dto(include_optional);

	cJSON* jsonoffers_dto_1 = offers_dto_convertToJSON(offers_dto_1);
	printf("offers_dto :\n%s\n", cJSON_Print(jsonoffers_dto_1));
	offers_dto_t* offers_dto_2 = offers_dto_parseFromJSON(jsonoffers_dto_1);
	cJSON* jsonoffers_dto_2 = offers_dto_convertToJSON(offers_dto_2);
	printf("repeating offers_dto:\n%s\n", cJSON_Print(jsonoffers_dto_2));
}

int main() {
  test_offers_dto(1);
  test_offers_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offers_dto_MAIN
#endif // offers_dto_TEST
