#ifndef get_chats_request_TEST
#define get_chats_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_chats_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_chats_request.h"
get_chats_request_t* instantiate_get_chats_request(int include_optional);



get_chats_request_t* instantiate_get_chats_request(int include_optional) {
  get_chats_request_t* get_chats_request = NULL;
  if (include_optional) {
    get_chats_request = get_chats_request_create(
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    get_chats_request = get_chats_request_create(
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return get_chats_request;
}


#ifdef get_chats_request_MAIN

void test_get_chats_request(int include_optional) {
    get_chats_request_t* get_chats_request_1 = instantiate_get_chats_request(include_optional);

	cJSON* jsonget_chats_request_1 = get_chats_request_convertToJSON(get_chats_request_1);
	printf("get_chats_request :\n%s\n", cJSON_Print(jsonget_chats_request_1));
	get_chats_request_t* get_chats_request_2 = get_chats_request_parseFromJSON(jsonget_chats_request_1);
	cJSON* jsonget_chats_request_2 = get_chats_request_convertToJSON(get_chats_request_2);
	printf("repeating get_chats_request:\n%s\n", cJSON_Print(jsonget_chats_request_2));
}

int main() {
  test_get_chats_request(1);
  test_get_chats_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_chats_request_MAIN
#endif // get_chats_request_TEST
