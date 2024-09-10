#ifndef paged_returns_dto_TEST
#define paged_returns_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define paged_returns_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/paged_returns_dto.h"
paged_returns_dto_t* instantiate_paged_returns_dto(int include_optional);

#include "test_forward_scrolling_pager_dto.c"


paged_returns_dto_t* instantiate_paged_returns_dto(int include_optional) {
  paged_returns_dto_t* paged_returns_dto = NULL;
  if (include_optional) {
    paged_returns_dto = paged_returns_dto_create(
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0),
      list_createList()
    );
  } else {
    paged_returns_dto = paged_returns_dto_create(
      NULL,
      list_createList()
    );
  }

  return paged_returns_dto;
}


#ifdef paged_returns_dto_MAIN

void test_paged_returns_dto(int include_optional) {
    paged_returns_dto_t* paged_returns_dto_1 = instantiate_paged_returns_dto(include_optional);

	cJSON* jsonpaged_returns_dto_1 = paged_returns_dto_convertToJSON(paged_returns_dto_1);
	printf("paged_returns_dto :\n%s\n", cJSON_Print(jsonpaged_returns_dto_1));
	paged_returns_dto_t* paged_returns_dto_2 = paged_returns_dto_parseFromJSON(jsonpaged_returns_dto_1);
	cJSON* jsonpaged_returns_dto_2 = paged_returns_dto_convertToJSON(paged_returns_dto_2);
	printf("repeating paged_returns_dto:\n%s\n", cJSON_Print(jsonpaged_returns_dto_2));
}

int main() {
  test_paged_returns_dto(1);
  test_paged_returns_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // paged_returns_dto_MAIN
#endif // paged_returns_dto_TEST
