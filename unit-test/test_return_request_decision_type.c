#ifndef return_request_decision_type_TEST
#define return_request_decision_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_request_decision_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_request_decision_type.h"
return_request_decision_type_t* instantiate_return_request_decision_type(int include_optional);



return_request_decision_type_t* instantiate_return_request_decision_type(int include_optional) {
  return_request_decision_type_t* return_request_decision_type = NULL;
  if (include_optional) {
    return_request_decision_type = return_request_decision_type_create(
    );
  } else {
    return_request_decision_type = return_request_decision_type_create(
    );
  }

  return return_request_decision_type;
}


#ifdef return_request_decision_type_MAIN

void test_return_request_decision_type(int include_optional) {
    return_request_decision_type_t* return_request_decision_type_1 = instantiate_return_request_decision_type(include_optional);

	cJSON* jsonreturn_request_decision_type_1 = return_request_decision_type_convertToJSON(return_request_decision_type_1);
	printf("return_request_decision_type :\n%s\n", cJSON_Print(jsonreturn_request_decision_type_1));
	return_request_decision_type_t* return_request_decision_type_2 = return_request_decision_type_parseFromJSON(jsonreturn_request_decision_type_1);
	cJSON* jsonreturn_request_decision_type_2 = return_request_decision_type_convertToJSON(return_request_decision_type_2);
	printf("repeating return_request_decision_type:\n%s\n", cJSON_Print(jsonreturn_request_decision_type_2));
}

int main() {
  test_return_request_decision_type(1);
  test_return_request_decision_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_request_decision_type_MAIN
#endif // return_request_decision_type_TEST
