#ifndef get_hidden_offers_result_dto_TEST
#define get_hidden_offers_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_hidden_offers_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_hidden_offers_result_dto.h"
get_hidden_offers_result_dto_t* instantiate_get_hidden_offers_result_dto(int include_optional);

#include "test_scrolling_pager_dto.c"


get_hidden_offers_result_dto_t* instantiate_get_hidden_offers_result_dto(int include_optional) {
  get_hidden_offers_result_dto_t* get_hidden_offers_result_dto = NULL;
  if (include_optional) {
    get_hidden_offers_result_dto = get_hidden_offers_result_dto_create(
       // false, not to have infinite recursion
      instantiate_scrolling_pager_dto(0),
      list_createList()
    );
  } else {
    get_hidden_offers_result_dto = get_hidden_offers_result_dto_create(
      NULL,
      list_createList()
    );
  }

  return get_hidden_offers_result_dto;
}


#ifdef get_hidden_offers_result_dto_MAIN

void test_get_hidden_offers_result_dto(int include_optional) {
    get_hidden_offers_result_dto_t* get_hidden_offers_result_dto_1 = instantiate_get_hidden_offers_result_dto(include_optional);

	cJSON* jsonget_hidden_offers_result_dto_1 = get_hidden_offers_result_dto_convertToJSON(get_hidden_offers_result_dto_1);
	printf("get_hidden_offers_result_dto :\n%s\n", cJSON_Print(jsonget_hidden_offers_result_dto_1));
	get_hidden_offers_result_dto_t* get_hidden_offers_result_dto_2 = get_hidden_offers_result_dto_parseFromJSON(jsonget_hidden_offers_result_dto_1);
	cJSON* jsonget_hidden_offers_result_dto_2 = get_hidden_offers_result_dto_convertToJSON(get_hidden_offers_result_dto_2);
	printf("repeating get_hidden_offers_result_dto:\n%s\n", cJSON_Print(jsonget_hidden_offers_result_dto_2));
}

int main() {
  test_get_hidden_offers_result_dto(1);
  test_get_hidden_offers_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_hidden_offers_result_dto_MAIN
#endif // get_hidden_offers_result_dto_TEST
