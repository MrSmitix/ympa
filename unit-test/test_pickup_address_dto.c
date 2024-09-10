#ifndef pickup_address_dto_TEST
#define pickup_address_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pickup_address_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pickup_address_dto.h"
pickup_address_dto_t* instantiate_pickup_address_dto(int include_optional);



pickup_address_dto_t* instantiate_pickup_address_dto(int include_optional) {
  pickup_address_dto_t* pickup_address_dto = NULL;
  if (include_optional) {
    pickup_address_dto = pickup_address_dto_create(
      "Россия",
      "Москва",
      "Стрелецкая улица",
      "9к2",
      "123518"
    );
  } else {
    pickup_address_dto = pickup_address_dto_create(
      "Россия",
      "Москва",
      "Стрелецкая улица",
      "9к2",
      "123518"
    );
  }

  return pickup_address_dto;
}


#ifdef pickup_address_dto_MAIN

void test_pickup_address_dto(int include_optional) {
    pickup_address_dto_t* pickup_address_dto_1 = instantiate_pickup_address_dto(include_optional);

	cJSON* jsonpickup_address_dto_1 = pickup_address_dto_convertToJSON(pickup_address_dto_1);
	printf("pickup_address_dto :\n%s\n", cJSON_Print(jsonpickup_address_dto_1));
	pickup_address_dto_t* pickup_address_dto_2 = pickup_address_dto_parseFromJSON(jsonpickup_address_dto_1);
	cJSON* jsonpickup_address_dto_2 = pickup_address_dto_convertToJSON(pickup_address_dto_2);
	printf("repeating pickup_address_dto:\n%s\n", cJSON_Print(jsonpickup_address_dto_2));
}

int main() {
  test_pickup_address_dto(1);
  test_pickup_address_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // pickup_address_dto_MAIN
#endif // pickup_address_dto_TEST
