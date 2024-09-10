#ifndef feed_status_type_TEST
#define feed_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_status_type.h"
feed_status_type_t* instantiate_feed_status_type(int include_optional);



feed_status_type_t* instantiate_feed_status_type(int include_optional) {
  feed_status_type_t* feed_status_type = NULL;
  if (include_optional) {
    feed_status_type = feed_status_type_create(
    );
  } else {
    feed_status_type = feed_status_type_create(
    );
  }

  return feed_status_type;
}


#ifdef feed_status_type_MAIN

void test_feed_status_type(int include_optional) {
    feed_status_type_t* feed_status_type_1 = instantiate_feed_status_type(include_optional);

	cJSON* jsonfeed_status_type_1 = feed_status_type_convertToJSON(feed_status_type_1);
	printf("feed_status_type :\n%s\n", cJSON_Print(jsonfeed_status_type_1));
	feed_status_type_t* feed_status_type_2 = feed_status_type_parseFromJSON(jsonfeed_status_type_1);
	cJSON* jsonfeed_status_type_2 = feed_status_type_convertToJSON(feed_status_type_2);
	printf("repeating feed_status_type:\n%s\n", cJSON_Print(jsonfeed_status_type_2));
}

int main() {
  test_feed_status_type(1);
  test_feed_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_status_type_MAIN
#endif // feed_status_type_TEST
