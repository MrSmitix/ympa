#ifndef feed_content_dto_TEST
#define feed_content_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_content_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_content_dto.h"
feed_content_dto_t* instantiate_feed_content_dto(int include_optional);

#include "test_feed_content_error_dto.c"


feed_content_dto_t* instantiate_feed_content_dto(int include_optional) {
  feed_content_dto_t* feed_content_dto = NULL;
  if (include_optional) {
    feed_content_dto = feed_content_dto_create(
      56,
      _api__feed_content_dto__ERROR,
      56,
       // false, not to have infinite recursion
      instantiate_feed_content_error_dto(0)
    );
  } else {
    feed_content_dto = feed_content_dto_create(
      56,
      _api__feed_content_dto__ERROR,
      56,
      NULL
    );
  }

  return feed_content_dto;
}


#ifdef feed_content_dto_MAIN

void test_feed_content_dto(int include_optional) {
    feed_content_dto_t* feed_content_dto_1 = instantiate_feed_content_dto(include_optional);

	cJSON* jsonfeed_content_dto_1 = feed_content_dto_convertToJSON(feed_content_dto_1);
	printf("feed_content_dto :\n%s\n", cJSON_Print(jsonfeed_content_dto_1));
	feed_content_dto_t* feed_content_dto_2 = feed_content_dto_parseFromJSON(jsonfeed_content_dto_1);
	cJSON* jsonfeed_content_dto_2 = feed_content_dto_convertToJSON(feed_content_dto_2);
	printf("repeating feed_content_dto:\n%s\n", cJSON_Print(jsonfeed_content_dto_2));
}

int main() {
  test_feed_content_dto(1);
  test_feed_content_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_content_dto_MAIN
#endif // feed_content_dto_TEST
