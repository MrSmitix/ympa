#ifndef return_type_TEST
#define return_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_type.h"
return_type_t* instantiate_return_type(int include_optional);



return_type_t* instantiate_return_type(int include_optional) {
  return_type_t* return_type = NULL;
  if (include_optional) {
    return_type = return_type_create(
    );
  } else {
    return_type = return_type_create(
    );
  }

  return return_type;
}


#ifdef return_type_MAIN

void test_return_type(int include_optional) {
    return_type_t* return_type_1 = instantiate_return_type(include_optional);

	cJSON* jsonreturn_type_1 = return_type_convertToJSON(return_type_1);
	printf("return_type :\n%s\n", cJSON_Print(jsonreturn_type_1));
	return_type_t* return_type_2 = return_type_parseFromJSON(jsonreturn_type_1);
	cJSON* jsonreturn_type_2 = return_type_convertToJSON(return_type_2);
	printf("repeating return_type:\n%s\n", cJSON_Print(jsonreturn_type_2));
}

int main() {
  test_return_type(1);
  test_return_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_type_MAIN
#endif // return_type_TEST
