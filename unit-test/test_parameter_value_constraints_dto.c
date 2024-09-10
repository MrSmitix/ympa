#ifndef parameter_value_constraints_dto_TEST
#define parameter_value_constraints_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define parameter_value_constraints_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/parameter_value_constraints_dto.h"
parameter_value_constraints_dto_t* instantiate_parameter_value_constraints_dto(int include_optional);



parameter_value_constraints_dto_t* instantiate_parameter_value_constraints_dto(int include_optional) {
  parameter_value_constraints_dto_t* parameter_value_constraints_dto = NULL;
  if (include_optional) {
    parameter_value_constraints_dto = parameter_value_constraints_dto_create(
      1.337,
      1.337,
      56
    );
  } else {
    parameter_value_constraints_dto = parameter_value_constraints_dto_create(
      1.337,
      1.337,
      56
    );
  }

  return parameter_value_constraints_dto;
}


#ifdef parameter_value_constraints_dto_MAIN

void test_parameter_value_constraints_dto(int include_optional) {
    parameter_value_constraints_dto_t* parameter_value_constraints_dto_1 = instantiate_parameter_value_constraints_dto(include_optional);

	cJSON* jsonparameter_value_constraints_dto_1 = parameter_value_constraints_dto_convertToJSON(parameter_value_constraints_dto_1);
	printf("parameter_value_constraints_dto :\n%s\n", cJSON_Print(jsonparameter_value_constraints_dto_1));
	parameter_value_constraints_dto_t* parameter_value_constraints_dto_2 = parameter_value_constraints_dto_parseFromJSON(jsonparameter_value_constraints_dto_1);
	cJSON* jsonparameter_value_constraints_dto_2 = parameter_value_constraints_dto_convertToJSON(parameter_value_constraints_dto_2);
	printf("repeating parameter_value_constraints_dto:\n%s\n", cJSON_Print(jsonparameter_value_constraints_dto_2));
}

int main() {
  test_parameter_value_constraints_dto(1);
  test_parameter_value_constraints_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // parameter_value_constraints_dto_MAIN
#endif // parameter_value_constraints_dto_TEST
