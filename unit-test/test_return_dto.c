#ifndef return_dto_TEST
#define return_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_dto.h"
return_dto_t* instantiate_return_dto(int include_optional);

#include "test_logistic_pickup_point_dto.c"


return_dto_t* instantiate_return_dto(int include_optional) {
  return_dto_t* return_dto = NULL;
  if (include_optional) {
    return_dto = return_dto_create(
      56,
      56,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__return_dto__STARTED_BY_USER,
       // false, not to have infinite recursion
      instantiate_logistic_pickup_point_dto(0),
      _api__return_dto__SHOP,
      _api__return_dto__CREATED,
      56,
      list_createList(),
      _api__return_dto__UNREDEEMED,
      1
    );
  } else {
    return_dto = return_dto_create(
      56,
      56,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__return_dto__STARTED_BY_USER,
      NULL,
      _api__return_dto__SHOP,
      _api__return_dto__CREATED,
      56,
      list_createList(),
      _api__return_dto__UNREDEEMED,
      1
    );
  }

  return return_dto;
}


#ifdef return_dto_MAIN

void test_return_dto(int include_optional) {
    return_dto_t* return_dto_1 = instantiate_return_dto(include_optional);

	cJSON* jsonreturn_dto_1 = return_dto_convertToJSON(return_dto_1);
	printf("return_dto :\n%s\n", cJSON_Print(jsonreturn_dto_1));
	return_dto_t* return_dto_2 = return_dto_parseFromJSON(jsonreturn_dto_1);
	cJSON* jsonreturn_dto_2 = return_dto_convertToJSON(return_dto_2);
	printf("repeating return_dto:\n%s\n", cJSON_Print(jsonreturn_dto_2));
}

int main() {
  test_return_dto(1);
  test_return_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_dto_MAIN
#endif // return_dto_TEST
