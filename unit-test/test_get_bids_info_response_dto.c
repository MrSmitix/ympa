#ifndef get_bids_info_response_dto_TEST
#define get_bids_info_response_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_bids_info_response_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_bids_info_response_dto.h"
get_bids_info_response_dto_t* instantiate_get_bids_info_response_dto(int include_optional);

#include "test_forward_scrolling_pager_dto.c"


get_bids_info_response_dto_t* instantiate_get_bids_info_response_dto(int include_optional) {
  get_bids_info_response_dto_t* get_bids_info_response_dto = NULL;
  if (include_optional) {
    get_bids_info_response_dto = get_bids_info_response_dto_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0)
    );
  } else {
    get_bids_info_response_dto = get_bids_info_response_dto_create(
      list_createList(),
      NULL
    );
  }

  return get_bids_info_response_dto;
}


#ifdef get_bids_info_response_dto_MAIN

void test_get_bids_info_response_dto(int include_optional) {
    get_bids_info_response_dto_t* get_bids_info_response_dto_1 = instantiate_get_bids_info_response_dto(include_optional);

	cJSON* jsonget_bids_info_response_dto_1 = get_bids_info_response_dto_convertToJSON(get_bids_info_response_dto_1);
	printf("get_bids_info_response_dto :\n%s\n", cJSON_Print(jsonget_bids_info_response_dto_1));
	get_bids_info_response_dto_t* get_bids_info_response_dto_2 = get_bids_info_response_dto_parseFromJSON(jsonget_bids_info_response_dto_1);
	cJSON* jsonget_bids_info_response_dto_2 = get_bids_info_response_dto_convertToJSON(get_bids_info_response_dto_2);
	printf("repeating get_bids_info_response_dto:\n%s\n", cJSON_Print(jsonget_bids_info_response_dto_2));
}

int main() {
  test_get_bids_info_response_dto(1);
  test_get_bids_info_response_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_bids_info_response_dto_MAIN
#endif // get_bids_info_response_dto_TEST
