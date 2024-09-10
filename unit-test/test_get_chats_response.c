#ifndef get_chats_response_TEST
#define get_chats_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_chats_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_chats_response.h"
get_chats_response_t* instantiate_get_chats_response(int include_optional);

#include "test_get_chats_info_dto.c"


get_chats_response_t* instantiate_get_chats_response(int include_optional) {
  get_chats_response_t* get_chats_response = NULL;
  if (include_optional) {
    get_chats_response = get_chats_response_create(
      _api__get_chats_response__OK,
       // false, not to have infinite recursion
      instantiate_get_chats_info_dto(0)
    );
  } else {
    get_chats_response = get_chats_response_create(
      _api__get_chats_response__OK,
      NULL
    );
  }

  return get_chats_response;
}


#ifdef get_chats_response_MAIN

void test_get_chats_response(int include_optional) {
    get_chats_response_t* get_chats_response_1 = instantiate_get_chats_response(include_optional);

	cJSON* jsonget_chats_response_1 = get_chats_response_convertToJSON(get_chats_response_1);
	printf("get_chats_response :\n%s\n", cJSON_Print(jsonget_chats_response_1));
	get_chats_response_t* get_chats_response_2 = get_chats_response_parseFromJSON(jsonget_chats_response_1);
	cJSON* jsonget_chats_response_2 = get_chats_response_convertToJSON(get_chats_response_2);
	printf("repeating get_chats_response:\n%s\n", cJSON_Print(jsonget_chats_response_2));
}

int main() {
  test_get_chats_response(1);
  test_get_chats_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_chats_response_MAIN
#endif // get_chats_response_TEST
