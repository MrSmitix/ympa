#ifndef get_chat_history_response_TEST
#define get_chat_history_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_chat_history_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_chat_history_response.h"
get_chat_history_response_t* instantiate_get_chat_history_response(int include_optional);

#include "test_chat_messages_result_dto.c"


get_chat_history_response_t* instantiate_get_chat_history_response(int include_optional) {
  get_chat_history_response_t* get_chat_history_response = NULL;
  if (include_optional) {
    get_chat_history_response = get_chat_history_response_create(
      _api__get_chat_history_response__OK,
       // false, not to have infinite recursion
      instantiate_chat_messages_result_dto(0)
    );
  } else {
    get_chat_history_response = get_chat_history_response_create(
      _api__get_chat_history_response__OK,
      NULL
    );
  }

  return get_chat_history_response;
}


#ifdef get_chat_history_response_MAIN

void test_get_chat_history_response(int include_optional) {
    get_chat_history_response_t* get_chat_history_response_1 = instantiate_get_chat_history_response(include_optional);

	cJSON* jsonget_chat_history_response_1 = get_chat_history_response_convertToJSON(get_chat_history_response_1);
	printf("get_chat_history_response :\n%s\n", cJSON_Print(jsonget_chat_history_response_1));
	get_chat_history_response_t* get_chat_history_response_2 = get_chat_history_response_parseFromJSON(jsonget_chat_history_response_1);
	cJSON* jsonget_chat_history_response_2 = get_chat_history_response_convertToJSON(get_chat_history_response_2);
	printf("repeating get_chat_history_response:\n%s\n", cJSON_Print(jsonget_chat_history_response_2));
}

int main() {
  test_get_chat_history_response(1);
  test_get_chat_history_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_chat_history_response_MAIN
#endif // get_chat_history_response_TEST
