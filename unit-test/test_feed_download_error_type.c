#ifndef feed_download_error_type_TEST
#define feed_download_error_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_download_error_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_download_error_type.h"
feed_download_error_type_t* instantiate_feed_download_error_type(int include_optional);



feed_download_error_type_t* instantiate_feed_download_error_type(int include_optional) {
  feed_download_error_type_t* feed_download_error_type = NULL;
  if (include_optional) {
    feed_download_error_type = feed_download_error_type_create(
    );
  } else {
    feed_download_error_type = feed_download_error_type_create(
    );
  }

  return feed_download_error_type;
}


#ifdef feed_download_error_type_MAIN

void test_feed_download_error_type(int include_optional) {
    feed_download_error_type_t* feed_download_error_type_1 = instantiate_feed_download_error_type(include_optional);

	cJSON* jsonfeed_download_error_type_1 = feed_download_error_type_convertToJSON(feed_download_error_type_1);
	printf("feed_download_error_type :\n%s\n", cJSON_Print(jsonfeed_download_error_type_1));
	feed_download_error_type_t* feed_download_error_type_2 = feed_download_error_type_parseFromJSON(jsonfeed_download_error_type_1);
	cJSON* jsonfeed_download_error_type_2 = feed_download_error_type_convertToJSON(feed_download_error_type_2);
	printf("repeating feed_download_error_type:\n%s\n", cJSON_Print(jsonfeed_download_error_type_2));
}

int main() {
  test_feed_download_error_type(1);
  test_feed_download_error_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_download_error_type_MAIN
#endif // feed_download_error_type_TEST
