#ifndef chat_message_sender_type_TEST
#define chat_message_sender_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_message_sender_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_message_sender_type.h"
chat_message_sender_type_t* instantiate_chat_message_sender_type(int include_optional);



chat_message_sender_type_t* instantiate_chat_message_sender_type(int include_optional) {
  chat_message_sender_type_t* chat_message_sender_type = NULL;
  if (include_optional) {
    chat_message_sender_type = chat_message_sender_type_create(
    );
  } else {
    chat_message_sender_type = chat_message_sender_type_create(
    );
  }

  return chat_message_sender_type;
}


#ifdef chat_message_sender_type_MAIN

void test_chat_message_sender_type(int include_optional) {
    chat_message_sender_type_t* chat_message_sender_type_1 = instantiate_chat_message_sender_type(include_optional);

	cJSON* jsonchat_message_sender_type_1 = chat_message_sender_type_convertToJSON(chat_message_sender_type_1);
	printf("chat_message_sender_type :\n%s\n", cJSON_Print(jsonchat_message_sender_type_1));
	chat_message_sender_type_t* chat_message_sender_type_2 = chat_message_sender_type_parseFromJSON(jsonchat_message_sender_type_1);
	cJSON* jsonchat_message_sender_type_2 = chat_message_sender_type_convertToJSON(chat_message_sender_type_2);
	printf("repeating chat_message_sender_type:\n%s\n", cJSON_Print(jsonchat_message_sender_type_2));
}

int main() {
  test_chat_message_sender_type(1);
  test_chat_message_sender_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_message_sender_type_MAIN
#endif // chat_message_sender_type_TEST
