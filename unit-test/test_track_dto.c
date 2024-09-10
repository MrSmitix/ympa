#ifndef track_dto_TEST
#define track_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define track_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/track_dto.h"
track_dto_t* instantiate_track_dto(int include_optional);



track_dto_t* instantiate_track_dto(int include_optional) {
  track_dto_t* track_dto = NULL;
  if (include_optional) {
    track_dto = track_dto_create(
      "0"
    );
  } else {
    track_dto = track_dto_create(
      "0"
    );
  }

  return track_dto;
}


#ifdef track_dto_MAIN

void test_track_dto(int include_optional) {
    track_dto_t* track_dto_1 = instantiate_track_dto(include_optional);

	cJSON* jsontrack_dto_1 = track_dto_convertToJSON(track_dto_1);
	printf("track_dto :\n%s\n", cJSON_Print(jsontrack_dto_1));
	track_dto_t* track_dto_2 = track_dto_parseFromJSON(jsontrack_dto_1);
	cJSON* jsontrack_dto_2 = track_dto_convertToJSON(track_dto_2);
	printf("repeating track_dto:\n%s\n", cJSON_Print(jsontrack_dto_2));
}

int main() {
  test_track_dto(1);
  test_track_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // track_dto_MAIN
#endif // track_dto_TEST
