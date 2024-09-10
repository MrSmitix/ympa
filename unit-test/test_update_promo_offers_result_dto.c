#ifndef update_promo_offers_result_dto_TEST
#define update_promo_offers_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_promo_offers_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_promo_offers_result_dto.h"
update_promo_offers_result_dto_t* instantiate_update_promo_offers_result_dto(int include_optional);



update_promo_offers_result_dto_t* instantiate_update_promo_offers_result_dto(int include_optional) {
  update_promo_offers_result_dto_t* update_promo_offers_result_dto = NULL;
  if (include_optional) {
    update_promo_offers_result_dto = update_promo_offers_result_dto_create(
      list_createList(),
      list_createList()
    );
  } else {
    update_promo_offers_result_dto = update_promo_offers_result_dto_create(
      list_createList(),
      list_createList()
    );
  }

  return update_promo_offers_result_dto;
}


#ifdef update_promo_offers_result_dto_MAIN

void test_update_promo_offers_result_dto(int include_optional) {
    update_promo_offers_result_dto_t* update_promo_offers_result_dto_1 = instantiate_update_promo_offers_result_dto(include_optional);

	cJSON* jsonupdate_promo_offers_result_dto_1 = update_promo_offers_result_dto_convertToJSON(update_promo_offers_result_dto_1);
	printf("update_promo_offers_result_dto :\n%s\n", cJSON_Print(jsonupdate_promo_offers_result_dto_1));
	update_promo_offers_result_dto_t* update_promo_offers_result_dto_2 = update_promo_offers_result_dto_parseFromJSON(jsonupdate_promo_offers_result_dto_1);
	cJSON* jsonupdate_promo_offers_result_dto_2 = update_promo_offers_result_dto_convertToJSON(update_promo_offers_result_dto_2);
	printf("repeating update_promo_offers_result_dto:\n%s\n", cJSON_Print(jsonupdate_promo_offers_result_dto_2));
}

int main() {
  test_update_promo_offers_result_dto(1);
  test_update_promo_offers_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_promo_offers_result_dto_MAIN
#endif // update_promo_offers_result_dto_TEST
