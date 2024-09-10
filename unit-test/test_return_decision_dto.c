#ifndef return_decision_dto_TEST
#define return_decision_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_decision_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_decision_dto.h"
return_decision_dto_t* instantiate_return_decision_dto(int include_optional);



return_decision_dto_t* instantiate_return_decision_dto(int include_optional) {
  return_decision_dto_t* return_decision_dto = NULL;
  if (include_optional) {
    return_decision_dto = return_decision_dto_create(
      56,
      56,
      "0",
      _api__return_decision_dto__BAD_QUALITY,
      _api__return_decision_dto__USER_DID_NOT_LIKE,
      _api__return_decision_dto__REFUND_MONEY,
      56,
      56,
      list_createList()
    );
  } else {
    return_decision_dto = return_decision_dto_create(
      56,
      56,
      "0",
      _api__return_decision_dto__BAD_QUALITY,
      _api__return_decision_dto__USER_DID_NOT_LIKE,
      _api__return_decision_dto__REFUND_MONEY,
      56,
      56,
      list_createList()
    );
  }

  return return_decision_dto;
}


#ifdef return_decision_dto_MAIN

void test_return_decision_dto(int include_optional) {
    return_decision_dto_t* return_decision_dto_1 = instantiate_return_decision_dto(include_optional);

	cJSON* jsonreturn_decision_dto_1 = return_decision_dto_convertToJSON(return_decision_dto_1);
	printf("return_decision_dto :\n%s\n", cJSON_Print(jsonreturn_decision_dto_1));
	return_decision_dto_t* return_decision_dto_2 = return_decision_dto_parseFromJSON(jsonreturn_decision_dto_1);
	cJSON* jsonreturn_decision_dto_2 = return_decision_dto_convertToJSON(return_decision_dto_2);
	printf("repeating return_decision_dto:\n%s\n", cJSON_Print(jsonreturn_decision_dto_2));
}

int main() {
  test_return_decision_dto(1);
  test_return_decision_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_decision_dto_MAIN
#endif // return_decision_dto_TEST
