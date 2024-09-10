#ifndef scrolling_pager_dto_TEST
#define scrolling_pager_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define scrolling_pager_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/scrolling_pager_dto.h"
scrolling_pager_dto_t* instantiate_scrolling_pager_dto(int include_optional);



scrolling_pager_dto_t* instantiate_scrolling_pager_dto(int include_optional) {
  scrolling_pager_dto_t* scrolling_pager_dto = NULL;
  if (include_optional) {
    scrolling_pager_dto = scrolling_pager_dto_create(
      "0",
      "0"
    );
  } else {
    scrolling_pager_dto = scrolling_pager_dto_create(
      "0",
      "0"
    );
  }

  return scrolling_pager_dto;
}


#ifdef scrolling_pager_dto_MAIN

void test_scrolling_pager_dto(int include_optional) {
    scrolling_pager_dto_t* scrolling_pager_dto_1 = instantiate_scrolling_pager_dto(include_optional);

	cJSON* jsonscrolling_pager_dto_1 = scrolling_pager_dto_convertToJSON(scrolling_pager_dto_1);
	printf("scrolling_pager_dto :\n%s\n", cJSON_Print(jsonscrolling_pager_dto_1));
	scrolling_pager_dto_t* scrolling_pager_dto_2 = scrolling_pager_dto_parseFromJSON(jsonscrolling_pager_dto_1);
	cJSON* jsonscrolling_pager_dto_2 = scrolling_pager_dto_convertToJSON(scrolling_pager_dto_2);
	printf("repeating scrolling_pager_dto:\n%s\n", cJSON_Print(jsonscrolling_pager_dto_2));
}

int main() {
  test_scrolling_pager_dto(1);
  test_scrolling_pager_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // scrolling_pager_dto_MAIN
#endif // scrolling_pager_dto_TEST
