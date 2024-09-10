#ifndef create_chat_request_TEST
#define create_chat_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_request.h"
create_chat_request_t* instantiate_create_chat_request(int include_optional);



create_chat_request_t* instantiate_create_chat_request(int include_optional) {
  create_chat_request_t* create_chat_request = NULL;
  if (include_optional) {
    create_chat_request = create_chat_request_create(
      56
    );
  } else {
    create_chat_request = create_chat_request_create(
      56
    );
  }

  return create_chat_request;
}


#ifdef create_chat_request_MAIN

void test_create_chat_request(int include_optional) {
    create_chat_request_t* create_chat_request_1 = instantiate_create_chat_request(include_optional);

	cJSON* jsoncreate_chat_request_1 = create_chat_request_convertToJSON(create_chat_request_1);
	printf("create_chat_request :\n%s\n", cJSON_Print(jsoncreate_chat_request_1));
	create_chat_request_t* create_chat_request_2 = create_chat_request_parseFromJSON(jsoncreate_chat_request_1);
	cJSON* jsoncreate_chat_request_2 = create_chat_request_convertToJSON(create_chat_request_2);
	printf("repeating create_chat_request:\n%s\n", cJSON_Print(jsoncreate_chat_request_2));
}

int main() {
  test_create_chat_request(1);
  test_create_chat_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_request_MAIN
#endif // create_chat_request_TEST
