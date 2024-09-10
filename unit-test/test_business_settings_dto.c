#ifndef business_settings_dto_TEST
#define business_settings_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_settings_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_settings_dto.h"
business_settings_dto_t* instantiate_business_settings_dto(int include_optional);



business_settings_dto_t* instantiate_business_settings_dto(int include_optional) {
  business_settings_dto_t* business_settings_dto = NULL;
  if (include_optional) {
    business_settings_dto = business_settings_dto_create(
      1,
      _api__business_settings_dto__RUR
    );
  } else {
    business_settings_dto = business_settings_dto_create(
      1,
      _api__business_settings_dto__RUR
    );
  }

  return business_settings_dto;
}


#ifdef business_settings_dto_MAIN

void test_business_settings_dto(int include_optional) {
    business_settings_dto_t* business_settings_dto_1 = instantiate_business_settings_dto(include_optional);

	cJSON* jsonbusiness_settings_dto_1 = business_settings_dto_convertToJSON(business_settings_dto_1);
	printf("business_settings_dto :\n%s\n", cJSON_Print(jsonbusiness_settings_dto_1));
	business_settings_dto_t* business_settings_dto_2 = business_settings_dto_parseFromJSON(jsonbusiness_settings_dto_1);
	cJSON* jsonbusiness_settings_dto_2 = business_settings_dto_convertToJSON(business_settings_dto_2);
	printf("repeating business_settings_dto:\n%s\n", cJSON_Print(jsonbusiness_settings_dto_2));
}

int main() {
  test_business_settings_dto(1);
  test_business_settings_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_settings_dto_MAIN
#endif // business_settings_dto_TEST
