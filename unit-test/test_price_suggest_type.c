#ifndef price_suggest_type_TEST
#define price_suggest_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_suggest_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_suggest_type.h"
price_suggest_type_t* instantiate_price_suggest_type(int include_optional);



price_suggest_type_t* instantiate_price_suggest_type(int include_optional) {
  price_suggest_type_t* price_suggest_type = NULL;
  if (include_optional) {
    price_suggest_type = price_suggest_type_create(
    );
  } else {
    price_suggest_type = price_suggest_type_create(
    );
  }

  return price_suggest_type;
}


#ifdef price_suggest_type_MAIN

void test_price_suggest_type(int include_optional) {
    price_suggest_type_t* price_suggest_type_1 = instantiate_price_suggest_type(include_optional);

	cJSON* jsonprice_suggest_type_1 = price_suggest_type_convertToJSON(price_suggest_type_1);
	printf("price_suggest_type :\n%s\n", cJSON_Print(jsonprice_suggest_type_1));
	price_suggest_type_t* price_suggest_type_2 = price_suggest_type_parseFromJSON(jsonprice_suggest_type_1);
	cJSON* jsonprice_suggest_type_2 = price_suggest_type_convertToJSON(price_suggest_type_2);
	printf("repeating price_suggest_type:\n%s\n", cJSON_Print(jsonprice_suggest_type_2));
}

int main() {
  test_price_suggest_type(1);
  test_price_suggest_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_suggest_type_MAIN
#endif // price_suggest_type_TEST
