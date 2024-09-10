#ifndef update_price_with_discount_dto_TEST
#define update_price_with_discount_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_price_with_discount_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_price_with_discount_dto.h"
update_price_with_discount_dto_t* instantiate_update_price_with_discount_dto(int include_optional);



update_price_with_discount_dto_t* instantiate_update_price_with_discount_dto(int include_optional) {
  update_price_with_discount_dto_t* update_price_with_discount_dto = NULL;
  if (include_optional) {
    update_price_with_discount_dto = update_price_with_discount_dto_create(
      0,
      _api__update_price_with_discount_dto__RUR,
      0
    );
  } else {
    update_price_with_discount_dto = update_price_with_discount_dto_create(
      0,
      _api__update_price_with_discount_dto__RUR,
      0
    );
  }

  return update_price_with_discount_dto;
}


#ifdef update_price_with_discount_dto_MAIN

void test_update_price_with_discount_dto(int include_optional) {
    update_price_with_discount_dto_t* update_price_with_discount_dto_1 = instantiate_update_price_with_discount_dto(include_optional);

	cJSON* jsonupdate_price_with_discount_dto_1 = update_price_with_discount_dto_convertToJSON(update_price_with_discount_dto_1);
	printf("update_price_with_discount_dto :\n%s\n", cJSON_Print(jsonupdate_price_with_discount_dto_1));
	update_price_with_discount_dto_t* update_price_with_discount_dto_2 = update_price_with_discount_dto_parseFromJSON(jsonupdate_price_with_discount_dto_1);
	cJSON* jsonupdate_price_with_discount_dto_2 = update_price_with_discount_dto_convertToJSON(update_price_with_discount_dto_2);
	printf("repeating update_price_with_discount_dto:\n%s\n", cJSON_Print(jsonupdate_price_with_discount_dto_2));
}

int main() {
  test_update_price_with_discount_dto(1);
  test_update_price_with_discount_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_price_with_discount_dto_MAIN
#endif // update_price_with_discount_dto_TEST
