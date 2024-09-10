#ifndef feed_dto_TEST
#define feed_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_dto.h"
feed_dto_t* instantiate_feed_dto(int include_optional);

#include "test_feed_content_dto.c"
#include "test_feed_download_dto.c"
#include "test_feed_placement_dto.c"
#include "test_feed_publication_dto.c"


feed_dto_t* instantiate_feed_dto(int include_optional) {
  feed_dto_t* feed_dto = NULL;
  if (include_optional) {
    feed_dto = feed_dto_create(
      56,
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
       // false, not to have infinite recursion
      instantiate_feed_content_dto(0),
       // false, not to have infinite recursion
      instantiate_feed_download_dto(0),
       // false, not to have infinite recursion
      instantiate_feed_placement_dto(0),
       // false, not to have infinite recursion
      instantiate_feed_publication_dto(0)
    );
  } else {
    feed_dto = feed_dto_create(
      56,
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return feed_dto;
}


#ifdef feed_dto_MAIN

void test_feed_dto(int include_optional) {
    feed_dto_t* feed_dto_1 = instantiate_feed_dto(include_optional);

	cJSON* jsonfeed_dto_1 = feed_dto_convertToJSON(feed_dto_1);
	printf("feed_dto :\n%s\n", cJSON_Print(jsonfeed_dto_1));
	feed_dto_t* feed_dto_2 = feed_dto_parseFromJSON(jsonfeed_dto_1);
	cJSON* jsonfeed_dto_2 = feed_dto_convertToJSON(feed_dto_2);
	printf("repeating feed_dto:\n%s\n", cJSON_Print(jsonfeed_dto_2));
}

int main() {
  test_feed_dto(1);
  test_feed_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_dto_MAIN
#endif // feed_dto_TEST
