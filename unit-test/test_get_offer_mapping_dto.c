#ifndef get_offer_mapping_dto_TEST
#define get_offer_mapping_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_offer_mapping_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_offer_mapping_dto.h"
get_offer_mapping_dto_t* instantiate_get_offer_mapping_dto(int include_optional);

#include "test_get_offer_dto.c"
#include "test_get_mapping_dto.c"


get_offer_mapping_dto_t* instantiate_get_offer_mapping_dto(int include_optional) {
  get_offer_mapping_dto_t* get_offer_mapping_dto = NULL;
  if (include_optional) {
    get_offer_mapping_dto = get_offer_mapping_dto_create(
       // false, not to have infinite recursion
      instantiate_get_offer_dto(0),
       // false, not to have infinite recursion
      instantiate_get_mapping_dto(0)
    );
  } else {
    get_offer_mapping_dto = get_offer_mapping_dto_create(
      NULL,
      NULL
    );
  }

  return get_offer_mapping_dto;
}


#ifdef get_offer_mapping_dto_MAIN

void test_get_offer_mapping_dto(int include_optional) {
    get_offer_mapping_dto_t* get_offer_mapping_dto_1 = instantiate_get_offer_mapping_dto(include_optional);

	cJSON* jsonget_offer_mapping_dto_1 = get_offer_mapping_dto_convertToJSON(get_offer_mapping_dto_1);
	printf("get_offer_mapping_dto :\n%s\n", cJSON_Print(jsonget_offer_mapping_dto_1));
	get_offer_mapping_dto_t* get_offer_mapping_dto_2 = get_offer_mapping_dto_parseFromJSON(jsonget_offer_mapping_dto_1);
	cJSON* jsonget_offer_mapping_dto_2 = get_offer_mapping_dto_convertToJSON(get_offer_mapping_dto_2);
	printf("repeating get_offer_mapping_dto:\n%s\n", cJSON_Print(jsonget_offer_mapping_dto_2));
}

int main() {
  test_get_offer_mapping_dto(1);
  test_get_offer_mapping_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_offer_mapping_dto_MAIN
#endif // get_offer_mapping_dto_TEST
