#ifndef pallets_count_dto_TEST
#define pallets_count_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pallets_count_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pallets_count_dto.h"
pallets_count_dto_t* instantiate_pallets_count_dto(int include_optional);



pallets_count_dto_t* instantiate_pallets_count_dto(int include_optional) {
  pallets_count_dto_t* pallets_count_dto = NULL;
  if (include_optional) {
    pallets_count_dto = pallets_count_dto_create(
      56,
      56
    );
  } else {
    pallets_count_dto = pallets_count_dto_create(
      56,
      56
    );
  }

  return pallets_count_dto;
}


#ifdef pallets_count_dto_MAIN

void test_pallets_count_dto(int include_optional) {
    pallets_count_dto_t* pallets_count_dto_1 = instantiate_pallets_count_dto(include_optional);

	cJSON* jsonpallets_count_dto_1 = pallets_count_dto_convertToJSON(pallets_count_dto_1);
	printf("pallets_count_dto :\n%s\n", cJSON_Print(jsonpallets_count_dto_1));
	pallets_count_dto_t* pallets_count_dto_2 = pallets_count_dto_parseFromJSON(jsonpallets_count_dto_1);
	cJSON* jsonpallets_count_dto_2 = pallets_count_dto_convertToJSON(pallets_count_dto_2);
	printf("repeating pallets_count_dto:\n%s\n", cJSON_Print(jsonpallets_count_dto_2));
}

int main() {
  test_pallets_count_dto(1);
  test_pallets_count_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // pallets_count_dto_MAIN
#endif // pallets_count_dto_TEST
