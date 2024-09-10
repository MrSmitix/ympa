#ifndef get_business_settings_info_dto_TEST
#define get_business_settings_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_business_settings_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_business_settings_info_dto.h"
get_business_settings_info_dto_t* instantiate_get_business_settings_info_dto(int include_optional);

#include "test_business_dto.c"
#include "test_business_settings_dto.c"


get_business_settings_info_dto_t* instantiate_get_business_settings_info_dto(int include_optional) {
  get_business_settings_info_dto_t* get_business_settings_info_dto = NULL;
  if (include_optional) {
    get_business_settings_info_dto = get_business_settings_info_dto_create(
       // false, not to have infinite recursion
      instantiate_business_dto(0),
       // false, not to have infinite recursion
      instantiate_business_settings_dto(0)
    );
  } else {
    get_business_settings_info_dto = get_business_settings_info_dto_create(
      NULL,
      NULL
    );
  }

  return get_business_settings_info_dto;
}


#ifdef get_business_settings_info_dto_MAIN

void test_get_business_settings_info_dto(int include_optional) {
    get_business_settings_info_dto_t* get_business_settings_info_dto_1 = instantiate_get_business_settings_info_dto(include_optional);

	cJSON* jsonget_business_settings_info_dto_1 = get_business_settings_info_dto_convertToJSON(get_business_settings_info_dto_1);
	printf("get_business_settings_info_dto :\n%s\n", cJSON_Print(jsonget_business_settings_info_dto_1));
	get_business_settings_info_dto_t* get_business_settings_info_dto_2 = get_business_settings_info_dto_parseFromJSON(jsonget_business_settings_info_dto_1);
	cJSON* jsonget_business_settings_info_dto_2 = get_business_settings_info_dto_convertToJSON(get_business_settings_info_dto_2);
	printf("repeating get_business_settings_info_dto:\n%s\n", cJSON_Print(jsonget_business_settings_info_dto_2));
}

int main() {
  test_get_business_settings_info_dto(1);
  test_get_business_settings_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_business_settings_info_dto_MAIN
#endif // get_business_settings_info_dto_TEST
