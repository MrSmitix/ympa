#ifndef flipping_pager_dto_TEST
#define flipping_pager_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define flipping_pager_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/flipping_pager_dto.h"
flipping_pager_dto_t* instantiate_flipping_pager_dto(int include_optional);



flipping_pager_dto_t* instantiate_flipping_pager_dto(int include_optional) {
  flipping_pager_dto_t* flipping_pager_dto = NULL;
  if (include_optional) {
    flipping_pager_dto = flipping_pager_dto_create(
      56,
      56,
      56,
      56,
      56,
      56
    );
  } else {
    flipping_pager_dto = flipping_pager_dto_create(
      56,
      56,
      56,
      56,
      56,
      56
    );
  }

  return flipping_pager_dto;
}


#ifdef flipping_pager_dto_MAIN

void test_flipping_pager_dto(int include_optional) {
    flipping_pager_dto_t* flipping_pager_dto_1 = instantiate_flipping_pager_dto(include_optional);

	cJSON* jsonflipping_pager_dto_1 = flipping_pager_dto_convertToJSON(flipping_pager_dto_1);
	printf("flipping_pager_dto :\n%s\n", cJSON_Print(jsonflipping_pager_dto_1));
	flipping_pager_dto_t* flipping_pager_dto_2 = flipping_pager_dto_parseFromJSON(jsonflipping_pager_dto_1);
	cJSON* jsonflipping_pager_dto_2 = flipping_pager_dto_convertToJSON(flipping_pager_dto_2);
	printf("repeating flipping_pager_dto:\n%s\n", cJSON_Print(jsonflipping_pager_dto_2));
}

int main() {
  test_flipping_pager_dto(1);
  test_flipping_pager_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // flipping_pager_dto_MAIN
#endif // flipping_pager_dto_TEST
