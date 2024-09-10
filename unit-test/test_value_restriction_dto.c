#ifndef value_restriction_dto_TEST
#define value_restriction_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define value_restriction_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/value_restriction_dto.h"
value_restriction_dto_t* instantiate_value_restriction_dto(int include_optional);



value_restriction_dto_t* instantiate_value_restriction_dto(int include_optional) {
  value_restriction_dto_t* value_restriction_dto = NULL;
  if (include_optional) {
    value_restriction_dto = value_restriction_dto_create(
      56,
      list_createList()
    );
  } else {
    value_restriction_dto = value_restriction_dto_create(
      56,
      list_createList()
    );
  }

  return value_restriction_dto;
}


#ifdef value_restriction_dto_MAIN

void test_value_restriction_dto(int include_optional) {
    value_restriction_dto_t* value_restriction_dto_1 = instantiate_value_restriction_dto(include_optional);

	cJSON* jsonvalue_restriction_dto_1 = value_restriction_dto_convertToJSON(value_restriction_dto_1);
	printf("value_restriction_dto :\n%s\n", cJSON_Print(jsonvalue_restriction_dto_1));
	value_restriction_dto_t* value_restriction_dto_2 = value_restriction_dto_parseFromJSON(jsonvalue_restriction_dto_1);
	cJSON* jsonvalue_restriction_dto_2 = value_restriction_dto_convertToJSON(value_restriction_dto_2);
	printf("repeating value_restriction_dto:\n%s\n", cJSON_Print(jsonvalue_restriction_dto_2));
}

int main() {
  test_value_restriction_dto(1);
  test_value_restriction_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // value_restriction_dto_MAIN
#endif // value_restriction_dto_TEST
