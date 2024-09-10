#ifndef get_promo_assortment_info_dto_TEST
#define get_promo_assortment_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_promo_assortment_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_promo_assortment_info_dto.h"
get_promo_assortment_info_dto_t* instantiate_get_promo_assortment_info_dto(int include_optional);



get_promo_assortment_info_dto_t* instantiate_get_promo_assortment_info_dto(int include_optional) {
  get_promo_assortment_info_dto_t* get_promo_assortment_info_dto = NULL;
  if (include_optional) {
    get_promo_assortment_info_dto = get_promo_assortment_info_dto_create(
      56,
      56,
      1
    );
  } else {
    get_promo_assortment_info_dto = get_promo_assortment_info_dto_create(
      56,
      56,
      1
    );
  }

  return get_promo_assortment_info_dto;
}


#ifdef get_promo_assortment_info_dto_MAIN

void test_get_promo_assortment_info_dto(int include_optional) {
    get_promo_assortment_info_dto_t* get_promo_assortment_info_dto_1 = instantiate_get_promo_assortment_info_dto(include_optional);

	cJSON* jsonget_promo_assortment_info_dto_1 = get_promo_assortment_info_dto_convertToJSON(get_promo_assortment_info_dto_1);
	printf("get_promo_assortment_info_dto :\n%s\n", cJSON_Print(jsonget_promo_assortment_info_dto_1));
	get_promo_assortment_info_dto_t* get_promo_assortment_info_dto_2 = get_promo_assortment_info_dto_parseFromJSON(jsonget_promo_assortment_info_dto_1);
	cJSON* jsonget_promo_assortment_info_dto_2 = get_promo_assortment_info_dto_convertToJSON(get_promo_assortment_info_dto_2);
	printf("repeating get_promo_assortment_info_dto:\n%s\n", cJSON_Print(jsonget_promo_assortment_info_dto_2));
}

int main() {
  test_get_promo_assortment_info_dto(1);
  test_get_promo_assortment_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_promo_assortment_info_dto_MAIN
#endif // get_promo_assortment_info_dto_TEST
