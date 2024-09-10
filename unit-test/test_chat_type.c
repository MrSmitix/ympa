#ifndef chat_type_TEST
#define chat_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_type.h"
chat_type_t* instantiate_chat_type(int include_optional);



chat_type_t* instantiate_chat_type(int include_optional) {
  chat_type_t* chat_type = NULL;
  if (include_optional) {
    chat_type = chat_type_create(
    );
  } else {
    chat_type = chat_type_create(
    );
  }

  return chat_type;
}


#ifdef chat_type_MAIN

void test_chat_type(int include_optional) {
    chat_type_t* chat_type_1 = instantiate_chat_type(include_optional);

	cJSON* jsonchat_type_1 = chat_type_convertToJSON(chat_type_1);
	printf("chat_type :\n%s\n", cJSON_Print(jsonchat_type_1));
	chat_type_t* chat_type_2 = chat_type_parseFromJSON(jsonchat_type_1);
	cJSON* jsonchat_type_2 = chat_type_convertToJSON(chat_type_2);
	printf("repeating chat_type:\n%s\n", cJSON_Print(jsonchat_type_2));
}

int main() {
  test_chat_type(1);
  test_chat_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_type_MAIN
#endif // chat_type_TEST
