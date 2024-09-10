#ifndef feed_publication_full_dto_TEST
#define feed_publication_full_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_publication_full_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_publication_full_dto.h"
feed_publication_full_dto_t* instantiate_feed_publication_full_dto(int include_optional);



feed_publication_full_dto_t* instantiate_feed_publication_full_dto(int include_optional) {
  feed_publication_full_dto_t* feed_publication_full_dto = NULL;
  if (include_optional) {
    feed_publication_full_dto = feed_publication_full_dto_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    feed_publication_full_dto = feed_publication_full_dto_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  }

  return feed_publication_full_dto;
}


#ifdef feed_publication_full_dto_MAIN

void test_feed_publication_full_dto(int include_optional) {
    feed_publication_full_dto_t* feed_publication_full_dto_1 = instantiate_feed_publication_full_dto(include_optional);

	cJSON* jsonfeed_publication_full_dto_1 = feed_publication_full_dto_convertToJSON(feed_publication_full_dto_1);
	printf("feed_publication_full_dto :\n%s\n", cJSON_Print(jsonfeed_publication_full_dto_1));
	feed_publication_full_dto_t* feed_publication_full_dto_2 = feed_publication_full_dto_parseFromJSON(jsonfeed_publication_full_dto_1);
	cJSON* jsonfeed_publication_full_dto_2 = feed_publication_full_dto_convertToJSON(feed_publication_full_dto_2);
	printf("repeating feed_publication_full_dto:\n%s\n", cJSON_Print(jsonfeed_publication_full_dto_2));
}

int main() {
  test_feed_publication_full_dto(1);
  test_feed_publication_full_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_publication_full_dto_MAIN
#endif // feed_publication_full_dto_TEST
