#ifndef currency_type_TEST
#define currency_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define currency_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/currency_type.h"
currency_type_t* instantiate_currency_type(int include_optional);



currency_type_t* instantiate_currency_type(int include_optional) {
  currency_type_t* currency_type = NULL;
  if (include_optional) {
    currency_type = currency_type_create(
    );
  } else {
    currency_type = currency_type_create(
    );
  }

  return currency_type;
}


#ifdef currency_type_MAIN

void test_currency_type(int include_optional) {
    currency_type_t* currency_type_1 = instantiate_currency_type(include_optional);

	cJSON* jsoncurrency_type_1 = currency_type_convertToJSON(currency_type_1);
	printf("currency_type :\n%s\n", cJSON_Print(jsoncurrency_type_1));
	currency_type_t* currency_type_2 = currency_type_parseFromJSON(jsoncurrency_type_1);
	cJSON* jsoncurrency_type_2 = currency_type_convertToJSON(currency_type_2);
	printf("repeating currency_type:\n%s\n", cJSON_Print(jsoncurrency_type_2));
}

int main() {
  test_currency_type(1);
  test_currency_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // currency_type_MAIN
#endif // currency_type_TEST
