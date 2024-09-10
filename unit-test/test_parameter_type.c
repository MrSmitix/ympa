#ifndef parameter_type_TEST
#define parameter_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define parameter_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/parameter_type.h"
parameter_type_t* instantiate_parameter_type(int include_optional);



parameter_type_t* instantiate_parameter_type(int include_optional) {
  parameter_type_t* parameter_type = NULL;
  if (include_optional) {
    parameter_type = parameter_type_create(
    );
  } else {
    parameter_type = parameter_type_create(
    );
  }

  return parameter_type;
}


#ifdef parameter_type_MAIN

void test_parameter_type(int include_optional) {
    parameter_type_t* parameter_type_1 = instantiate_parameter_type(include_optional);

	cJSON* jsonparameter_type_1 = parameter_type_convertToJSON(parameter_type_1);
	printf("parameter_type :\n%s\n", cJSON_Print(jsonparameter_type_1));
	parameter_type_t* parameter_type_2 = parameter_type_parseFromJSON(jsonparameter_type_1);
	cJSON* jsonparameter_type_2 = parameter_type_convertToJSON(parameter_type_2);
	printf("repeating parameter_type:\n%s\n", cJSON_Print(jsonparameter_type_2));
}

int main() {
  test_parameter_type(1);
  test_parameter_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // parameter_type_MAIN
#endif // parameter_type_TEST
