#ifndef create_outlet_response_TEST
#define create_outlet_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_outlet_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_outlet_response.h"
create_outlet_response_t* instantiate_create_outlet_response(int include_optional);

#include "test_outlet_response_dto.c"


create_outlet_response_t* instantiate_create_outlet_response(int include_optional) {
  create_outlet_response_t* create_outlet_response = NULL;
  if (include_optional) {
    create_outlet_response = create_outlet_response_create(
      _api__create_outlet_response__OK,
       // false, not to have infinite recursion
      instantiate_outlet_response_dto(0)
    );
  } else {
    create_outlet_response = create_outlet_response_create(
      _api__create_outlet_response__OK,
      NULL
    );
  }

  return create_outlet_response;
}


#ifdef create_outlet_response_MAIN

void test_create_outlet_response(int include_optional) {
    create_outlet_response_t* create_outlet_response_1 = instantiate_create_outlet_response(include_optional);

	cJSON* jsoncreate_outlet_response_1 = create_outlet_response_convertToJSON(create_outlet_response_1);
	printf("create_outlet_response :\n%s\n", cJSON_Print(jsoncreate_outlet_response_1));
	create_outlet_response_t* create_outlet_response_2 = create_outlet_response_parseFromJSON(jsoncreate_outlet_response_1);
	cJSON* jsoncreate_outlet_response_2 = create_outlet_response_convertToJSON(create_outlet_response_2);
	printf("repeating create_outlet_response:\n%s\n", cJSON_Print(jsoncreate_outlet_response_2));
}

int main() {
  test_create_outlet_response(1);
  test_create_outlet_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_outlet_response_MAIN
#endif // create_outlet_response_TEST
