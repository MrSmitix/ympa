#ifndef get_price_dto_TEST
#define get_price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_price_dto.h"
get_price_dto_t* instantiate_get_price_dto(int include_optional);



get_price_dto_t* instantiate_get_price_dto(int include_optional) {
  get_price_dto_t* get_price_dto = NULL;
  if (include_optional) {
    get_price_dto = get_price_dto_create(
      0,
      _api__get_price_dto__RUR,
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    get_price_dto = get_price_dto_create(
      0,
      _api__get_price_dto__RUR,
      "2013-10-20T19:20:30+01:00"
    );
  }

  return get_price_dto;
}


#ifdef get_price_dto_MAIN

void test_get_price_dto(int include_optional) {
    get_price_dto_t* get_price_dto_1 = instantiate_get_price_dto(include_optional);

	cJSON* jsonget_price_dto_1 = get_price_dto_convertToJSON(get_price_dto_1);
	printf("get_price_dto :\n%s\n", cJSON_Print(jsonget_price_dto_1));
	get_price_dto_t* get_price_dto_2 = get_price_dto_parseFromJSON(jsonget_price_dto_1);
	cJSON* jsonget_price_dto_2 = get_price_dto_convertToJSON(get_price_dto_2);
	printf("repeating get_price_dto:\n%s\n", cJSON_Print(jsonget_price_dto_2));
}

int main() {
  test_get_price_dto(1);
  test_get_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_price_dto_MAIN
#endif // get_price_dto_TEST
