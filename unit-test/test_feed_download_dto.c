#ifndef feed_download_dto_TEST
#define feed_download_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_download_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_download_dto.h"
feed_download_dto_t* instantiate_feed_download_dto(int include_optional);

#include "test_feed_download_error_dto.c"


feed_download_dto_t* instantiate_feed_download_dto(int include_optional) {
  feed_download_dto_t* feed_download_dto = NULL;
  if (include_optional) {
    feed_download_dto = feed_download_dto_create(
      _api__feed_download_dto__ERROR,
       // false, not to have infinite recursion
      instantiate_feed_download_error_dto(0)
    );
  } else {
    feed_download_dto = feed_download_dto_create(
      _api__feed_download_dto__ERROR,
      NULL
    );
  }

  return feed_download_dto;
}


#ifdef feed_download_dto_MAIN

void test_feed_download_dto(int include_optional) {
    feed_download_dto_t* feed_download_dto_1 = instantiate_feed_download_dto(include_optional);

	cJSON* jsonfeed_download_dto_1 = feed_download_dto_convertToJSON(feed_download_dto_1);
	printf("feed_download_dto :\n%s\n", cJSON_Print(jsonfeed_download_dto_1));
	feed_download_dto_t* feed_download_dto_2 = feed_download_dto_parseFromJSON(jsonfeed_download_dto_1);
	cJSON* jsonfeed_download_dto_2 = feed_download_dto_convertToJSON(feed_download_dto_2);
	printf("repeating feed_download_dto:\n%s\n", cJSON_Print(jsonfeed_download_dto_2));
}

int main() {
  test_feed_download_dto(1);
  test_feed_download_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_download_dto_MAIN
#endif // feed_download_dto_TEST
