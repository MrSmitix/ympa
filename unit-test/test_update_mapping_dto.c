#ifndef update_mapping_dto_TEST
#define update_mapping_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_mapping_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_mapping_dto.h"
update_mapping_dto_t* instantiate_update_mapping_dto(int include_optional);



update_mapping_dto_t* instantiate_update_mapping_dto(int include_optional) {
  update_mapping_dto_t* update_mapping_dto = NULL;
  if (include_optional) {
    update_mapping_dto = update_mapping_dto_create(
      56
    );
  } else {
    update_mapping_dto = update_mapping_dto_create(
      56
    );
  }

  return update_mapping_dto;
}


#ifdef update_mapping_dto_MAIN

void test_update_mapping_dto(int include_optional) {
    update_mapping_dto_t* update_mapping_dto_1 = instantiate_update_mapping_dto(include_optional);

	cJSON* jsonupdate_mapping_dto_1 = update_mapping_dto_convertToJSON(update_mapping_dto_1);
	printf("update_mapping_dto :\n%s\n", cJSON_Print(jsonupdate_mapping_dto_1));
	update_mapping_dto_t* update_mapping_dto_2 = update_mapping_dto_parseFromJSON(jsonupdate_mapping_dto_1);
	cJSON* jsonupdate_mapping_dto_2 = update_mapping_dto_convertToJSON(update_mapping_dto_2);
	printf("repeating update_mapping_dto:\n%s\n", cJSON_Print(jsonupdate_mapping_dto_2));
}

int main() {
  test_update_mapping_dto(1);
  test_update_mapping_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_mapping_dto_MAIN
#endif // update_mapping_dto_TEST
