#ifndef return_instance_dto_TEST
#define return_instance_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_instance_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_instance_dto.h"
return_instance_dto_t* instantiate_return_instance_dto(int include_optional);



return_instance_dto_t* instantiate_return_instance_dto(int include_optional) {
  return_instance_dto_t* return_instance_dto = NULL;
  if (include_optional) {
    return_instance_dto = return_instance_dto_create(
      _api__return_instance_dto__FIT,
      _api__return_instance_dto__CREATED,
      "0",
      "0"
    );
  } else {
    return_instance_dto = return_instance_dto_create(
      _api__return_instance_dto__FIT,
      _api__return_instance_dto__CREATED,
      "0",
      "0"
    );
  }

  return return_instance_dto;
}


#ifdef return_instance_dto_MAIN

void test_return_instance_dto(int include_optional) {
    return_instance_dto_t* return_instance_dto_1 = instantiate_return_instance_dto(include_optional);

	cJSON* jsonreturn_instance_dto_1 = return_instance_dto_convertToJSON(return_instance_dto_1);
	printf("return_instance_dto :\n%s\n", cJSON_Print(jsonreturn_instance_dto_1));
	return_instance_dto_t* return_instance_dto_2 = return_instance_dto_parseFromJSON(jsonreturn_instance_dto_1);
	cJSON* jsonreturn_instance_dto_2 = return_instance_dto_convertToJSON(return_instance_dto_2);
	printf("repeating return_instance_dto:\n%s\n", cJSON_Print(jsonreturn_instance_dto_2));
}

int main() {
  test_return_instance_dto(1);
  test_return_instance_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_instance_dto_MAIN
#endif // return_instance_dto_TEST
