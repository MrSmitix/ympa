#ifndef option_values_limited_dto_TEST
#define option_values_limited_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define option_values_limited_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/option_values_limited_dto.h"
option_values_limited_dto_t* instantiate_option_values_limited_dto(int include_optional);



option_values_limited_dto_t* instantiate_option_values_limited_dto(int include_optional) {
  option_values_limited_dto_t* option_values_limited_dto = NULL;
  if (include_optional) {
    option_values_limited_dto = option_values_limited_dto_create(
      56,
      list_createList()
    );
  } else {
    option_values_limited_dto = option_values_limited_dto_create(
      56,
      list_createList()
    );
  }

  return option_values_limited_dto;
}


#ifdef option_values_limited_dto_MAIN

void test_option_values_limited_dto(int include_optional) {
    option_values_limited_dto_t* option_values_limited_dto_1 = instantiate_option_values_limited_dto(include_optional);

	cJSON* jsonoption_values_limited_dto_1 = option_values_limited_dto_convertToJSON(option_values_limited_dto_1);
	printf("option_values_limited_dto :\n%s\n", cJSON_Print(jsonoption_values_limited_dto_1));
	option_values_limited_dto_t* option_values_limited_dto_2 = option_values_limited_dto_parseFromJSON(jsonoption_values_limited_dto_1);
	cJSON* jsonoption_values_limited_dto_2 = option_values_limited_dto_convertToJSON(option_values_limited_dto_2);
	printf("repeating option_values_limited_dto:\n%s\n", cJSON_Print(jsonoption_values_limited_dto_2));
}

int main() {
  test_option_values_limited_dto(1);
  test_option_values_limited_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // option_values_limited_dto_MAIN
#endif // option_values_limited_dto_TEST
