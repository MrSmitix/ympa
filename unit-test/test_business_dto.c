#ifndef business_dto_TEST
#define business_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_dto.h"
business_dto_t* instantiate_business_dto(int include_optional);



business_dto_t* instantiate_business_dto(int include_optional) {
  business_dto_t* business_dto = NULL;
  if (include_optional) {
    business_dto = business_dto_create(
      56,
      "0"
    );
  } else {
    business_dto = business_dto_create(
      56,
      "0"
    );
  }

  return business_dto;
}


#ifdef business_dto_MAIN

void test_business_dto(int include_optional) {
    business_dto_t* business_dto_1 = instantiate_business_dto(include_optional);

	cJSON* jsonbusiness_dto_1 = business_dto_convertToJSON(business_dto_1);
	printf("business_dto :\n%s\n", cJSON_Print(jsonbusiness_dto_1));
	business_dto_t* business_dto_2 = business_dto_parseFromJSON(jsonbusiness_dto_1);
	cJSON* jsonbusiness_dto_2 = business_dto_convertToJSON(business_dto_2);
	printf("repeating business_dto:\n%s\n", cJSON_Print(jsonbusiness_dto_2));
}

int main() {
  test_business_dto(1);
  test_business_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_dto_MAIN
#endif // business_dto_TEST
