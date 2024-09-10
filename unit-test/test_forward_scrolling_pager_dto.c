#ifndef forward_scrolling_pager_dto_TEST
#define forward_scrolling_pager_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define forward_scrolling_pager_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/forward_scrolling_pager_dto.h"
forward_scrolling_pager_dto_t* instantiate_forward_scrolling_pager_dto(int include_optional);



forward_scrolling_pager_dto_t* instantiate_forward_scrolling_pager_dto(int include_optional) {
  forward_scrolling_pager_dto_t* forward_scrolling_pager_dto = NULL;
  if (include_optional) {
    forward_scrolling_pager_dto = forward_scrolling_pager_dto_create(
      "0"
    );
  } else {
    forward_scrolling_pager_dto = forward_scrolling_pager_dto_create(
      "0"
    );
  }

  return forward_scrolling_pager_dto;
}


#ifdef forward_scrolling_pager_dto_MAIN

void test_forward_scrolling_pager_dto(int include_optional) {
    forward_scrolling_pager_dto_t* forward_scrolling_pager_dto_1 = instantiate_forward_scrolling_pager_dto(include_optional);

	cJSON* jsonforward_scrolling_pager_dto_1 = forward_scrolling_pager_dto_convertToJSON(forward_scrolling_pager_dto_1);
	printf("forward_scrolling_pager_dto :\n%s\n", cJSON_Print(jsonforward_scrolling_pager_dto_1));
	forward_scrolling_pager_dto_t* forward_scrolling_pager_dto_2 = forward_scrolling_pager_dto_parseFromJSON(jsonforward_scrolling_pager_dto_1);
	cJSON* jsonforward_scrolling_pager_dto_2 = forward_scrolling_pager_dto_convertToJSON(forward_scrolling_pager_dto_2);
	printf("repeating forward_scrolling_pager_dto:\n%s\n", cJSON_Print(jsonforward_scrolling_pager_dto_2));
}

int main() {
  test_forward_scrolling_pager_dto(1);
  test_forward_scrolling_pager_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // forward_scrolling_pager_dto_MAIN
#endif // forward_scrolling_pager_dto_TEST
