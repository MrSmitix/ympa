#ifndef gps_dto_TEST
#define gps_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gps_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gps_dto.h"
gps_dto_t* instantiate_gps_dto(int include_optional);



gps_dto_t* instantiate_gps_dto(int include_optional) {
  gps_dto_t* gps_dto = NULL;
  if (include_optional) {
    gps_dto = gps_dto_create(
      1.337,
      1.337
    );
  } else {
    gps_dto = gps_dto_create(
      1.337,
      1.337
    );
  }

  return gps_dto;
}


#ifdef gps_dto_MAIN

void test_gps_dto(int include_optional) {
    gps_dto_t* gps_dto_1 = instantiate_gps_dto(include_optional);

	cJSON* jsongps_dto_1 = gps_dto_convertToJSON(gps_dto_1);
	printf("gps_dto :\n%s\n", cJSON_Print(jsongps_dto_1));
	gps_dto_t* gps_dto_2 = gps_dto_parseFromJSON(jsongps_dto_1);
	cJSON* jsongps_dto_2 = gps_dto_convertToJSON(gps_dto_2);
	printf("repeating gps_dto:\n%s\n", cJSON_Print(jsongps_dto_2));
}

int main() {
  test_gps_dto(1);
  test_gps_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // gps_dto_MAIN
#endif // gps_dto_TEST
