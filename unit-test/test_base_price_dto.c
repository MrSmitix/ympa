#ifndef base_price_dto_TEST
#define base_price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define base_price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/base_price_dto.h"
base_price_dto_t* instantiate_base_price_dto(int include_optional);



base_price_dto_t* instantiate_base_price_dto(int include_optional) {
  base_price_dto_t* base_price_dto = NULL;
  if (include_optional) {
    base_price_dto = base_price_dto_create(
      0,
      _api__base_price_dto__RUR
    );
  } else {
    base_price_dto = base_price_dto_create(
      0,
      _api__base_price_dto__RUR
    );
  }

  return base_price_dto;
}


#ifdef base_price_dto_MAIN

void test_base_price_dto(int include_optional) {
    base_price_dto_t* base_price_dto_1 = instantiate_base_price_dto(include_optional);

	cJSON* jsonbase_price_dto_1 = base_price_dto_convertToJSON(base_price_dto_1);
	printf("base_price_dto :\n%s\n", cJSON_Print(jsonbase_price_dto_1));
	base_price_dto_t* base_price_dto_2 = base_price_dto_parseFromJSON(jsonbase_price_dto_1);
	cJSON* jsonbase_price_dto_2 = base_price_dto_convertToJSON(base_price_dto_2);
	printf("repeating base_price_dto:\n%s\n", cJSON_Print(jsonbase_price_dto_2));
}

int main() {
  test_base_price_dto(1);
  test_base_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // base_price_dto_MAIN
#endif // base_price_dto_TEST
