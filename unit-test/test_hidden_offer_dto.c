#ifndef hidden_offer_dto_TEST
#define hidden_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define hidden_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/hidden_offer_dto.h"
hidden_offer_dto_t* instantiate_hidden_offer_dto(int include_optional);



hidden_offer_dto_t* instantiate_hidden_offer_dto(int include_optional) {
  hidden_offer_dto_t* hidden_offer_dto = NULL;
  if (include_optional) {
    hidden_offer_dto = hidden_offer_dto_create(
      "a"
    );
  } else {
    hidden_offer_dto = hidden_offer_dto_create(
      "a"
    );
  }

  return hidden_offer_dto;
}


#ifdef hidden_offer_dto_MAIN

void test_hidden_offer_dto(int include_optional) {
    hidden_offer_dto_t* hidden_offer_dto_1 = instantiate_hidden_offer_dto(include_optional);

	cJSON* jsonhidden_offer_dto_1 = hidden_offer_dto_convertToJSON(hidden_offer_dto_1);
	printf("hidden_offer_dto :\n%s\n", cJSON_Print(jsonhidden_offer_dto_1));
	hidden_offer_dto_t* hidden_offer_dto_2 = hidden_offer_dto_parseFromJSON(jsonhidden_offer_dto_1);
	cJSON* jsonhidden_offer_dto_2 = hidden_offer_dto_convertToJSON(hidden_offer_dto_2);
	printf("repeating hidden_offer_dto:\n%s\n", cJSON_Print(jsonhidden_offer_dto_2));
}

int main() {
  test_hidden_offer_dto(1);
  test_hidden_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // hidden_offer_dto_MAIN
#endif // hidden_offer_dto_TEST
