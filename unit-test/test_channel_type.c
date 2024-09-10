#ifndef channel_type_TEST
#define channel_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define channel_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/channel_type.h"
channel_type_t* instantiate_channel_type(int include_optional);



channel_type_t* instantiate_channel_type(int include_optional) {
  channel_type_t* channel_type = NULL;
  if (include_optional) {
    channel_type = channel_type_create(
    );
  } else {
    channel_type = channel_type_create(
    );
  }

  return channel_type;
}


#ifdef channel_type_MAIN

void test_channel_type(int include_optional) {
    channel_type_t* channel_type_1 = instantiate_channel_type(include_optional);

	cJSON* jsonchannel_type_1 = channel_type_convertToJSON(channel_type_1);
	printf("channel_type :\n%s\n", cJSON_Print(jsonchannel_type_1));
	channel_type_t* channel_type_2 = channel_type_parseFromJSON(jsonchannel_type_1);
	cJSON* jsonchannel_type_2 = channel_type_convertToJSON(channel_type_2);
	printf("repeating channel_type:\n%s\n", cJSON_Print(jsonchannel_type_2));
}

int main() {
  test_channel_type(1);
  test_channel_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // channel_type_MAIN
#endif // channel_type_TEST
