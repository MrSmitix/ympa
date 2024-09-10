#ifndef create_chat_response_TEST
#define create_chat_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_response.h"
create_chat_response_t* instantiate_create_chat_response(int include_optional);

#include "test_create_chat_result_dto.c"


create_chat_response_t* instantiate_create_chat_response(int include_optional) {
  create_chat_response_t* create_chat_response = NULL;
  if (include_optional) {
    create_chat_response = create_chat_response_create(
      _api__create_chat_response__OK,
       // false, not to have infinite recursion
      instantiate_create_chat_result_dto(0)
    );
  } else {
    create_chat_response = create_chat_response_create(
      _api__create_chat_response__OK,
      NULL
    );
  }

  return create_chat_response;
}


#ifdef create_chat_response_MAIN

void test_create_chat_response(int include_optional) {
    create_chat_response_t* create_chat_response_1 = instantiate_create_chat_response(include_optional);

	cJSON* jsoncreate_chat_response_1 = create_chat_response_convertToJSON(create_chat_response_1);
	printf("create_chat_response :\n%s\n", cJSON_Print(jsoncreate_chat_response_1));
	create_chat_response_t* create_chat_response_2 = create_chat_response_parseFromJSON(jsoncreate_chat_response_1);
	cJSON* jsoncreate_chat_response_2 = create_chat_response_convertToJSON(create_chat_response_2);
	printf("repeating create_chat_response:\n%s\n", cJSON_Print(jsoncreate_chat_response_2));
}

int main() {
  test_create_chat_response(1);
  test_create_chat_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_response_MAIN
#endif // create_chat_response_TEST
