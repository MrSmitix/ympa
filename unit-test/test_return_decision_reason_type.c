#ifndef return_decision_reason_type_TEST
#define return_decision_reason_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_decision_reason_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_decision_reason_type.h"
return_decision_reason_type_t* instantiate_return_decision_reason_type(int include_optional);



return_decision_reason_type_t* instantiate_return_decision_reason_type(int include_optional) {
  return_decision_reason_type_t* return_decision_reason_type = NULL;
  if (include_optional) {
    return_decision_reason_type = return_decision_reason_type_create(
    );
  } else {
    return_decision_reason_type = return_decision_reason_type_create(
    );
  }

  return return_decision_reason_type;
}


#ifdef return_decision_reason_type_MAIN

void test_return_decision_reason_type(int include_optional) {
    return_decision_reason_type_t* return_decision_reason_type_1 = instantiate_return_decision_reason_type(include_optional);

	cJSON* jsonreturn_decision_reason_type_1 = return_decision_reason_type_convertToJSON(return_decision_reason_type_1);
	printf("return_decision_reason_type :\n%s\n", cJSON_Print(jsonreturn_decision_reason_type_1));
	return_decision_reason_type_t* return_decision_reason_type_2 = return_decision_reason_type_parseFromJSON(jsonreturn_decision_reason_type_1);
	cJSON* jsonreturn_decision_reason_type_2 = return_decision_reason_type_convertToJSON(return_decision_reason_type_2);
	printf("repeating return_decision_reason_type:\n%s\n", cJSON_Print(jsonreturn_decision_reason_type_2));
}

int main() {
  test_return_decision_reason_type(1);
  test_return_decision_reason_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_decision_reason_type_MAIN
#endif // return_decision_reason_type_TEST
