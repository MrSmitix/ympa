#ifndef delete_promo_offers_result_dto_TEST
#define delete_promo_offers_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_promo_offers_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_promo_offers_result_dto.h"
delete_promo_offers_result_dto_t* instantiate_delete_promo_offers_result_dto(int include_optional);



delete_promo_offers_result_dto_t* instantiate_delete_promo_offers_result_dto(int include_optional) {
  delete_promo_offers_result_dto_t* delete_promo_offers_result_dto = NULL;
  if (include_optional) {
    delete_promo_offers_result_dto = delete_promo_offers_result_dto_create(
      list_createList()
    );
  } else {
    delete_promo_offers_result_dto = delete_promo_offers_result_dto_create(
      list_createList()
    );
  }

  return delete_promo_offers_result_dto;
}


#ifdef delete_promo_offers_result_dto_MAIN

void test_delete_promo_offers_result_dto(int include_optional) {
    delete_promo_offers_result_dto_t* delete_promo_offers_result_dto_1 = instantiate_delete_promo_offers_result_dto(include_optional);

	cJSON* jsondelete_promo_offers_result_dto_1 = delete_promo_offers_result_dto_convertToJSON(delete_promo_offers_result_dto_1);
	printf("delete_promo_offers_result_dto :\n%s\n", cJSON_Print(jsondelete_promo_offers_result_dto_1));
	delete_promo_offers_result_dto_t* delete_promo_offers_result_dto_2 = delete_promo_offers_result_dto_parseFromJSON(jsondelete_promo_offers_result_dto_1);
	cJSON* jsondelete_promo_offers_result_dto_2 = delete_promo_offers_result_dto_convertToJSON(delete_promo_offers_result_dto_2);
	printf("repeating delete_promo_offers_result_dto:\n%s\n", cJSON_Print(jsondelete_promo_offers_result_dto_2));
}

int main() {
  test_delete_promo_offers_result_dto(1);
  test_delete_promo_offers_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_promo_offers_result_dto_MAIN
#endif // delete_promo_offers_result_dto_TEST
