#ifndef chat_status_type_TEST
#define chat_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_status_type.h"
chat_status_type_t* instantiate_chat_status_type(int include_optional);



chat_status_type_t* instantiate_chat_status_type(int include_optional) {
  chat_status_type_t* chat_status_type = NULL;
  if (include_optional) {
    chat_status_type = chat_status_type_create(
    );
  } else {
    chat_status_type = chat_status_type_create(
    );
  }

  return chat_status_type;
}


#ifdef chat_status_type_MAIN

void test_chat_status_type(int include_optional) {
    chat_status_type_t* chat_status_type_1 = instantiate_chat_status_type(include_optional);

	cJSON* jsonchat_status_type_1 = chat_status_type_convertToJSON(chat_status_type_1);
	printf("chat_status_type :\n%s\n", cJSON_Print(jsonchat_status_type_1));
	chat_status_type_t* chat_status_type_2 = chat_status_type_parseFromJSON(jsonchat_status_type_1);
	cJSON* jsonchat_status_type_2 = chat_status_type_convertToJSON(chat_status_type_2);
	printf("repeating chat_status_type:\n%s\n", cJSON_Print(jsonchat_status_type_2));
}

int main() {
  test_chat_status_type(1);
  test_chat_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_status_type_MAIN
#endif // chat_status_type_TEST
