#ifndef report_info_dto_TEST
#define report_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define report_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/report_info_dto.h"
report_info_dto_t* instantiate_report_info_dto(int include_optional);



report_info_dto_t* instantiate_report_info_dto(int include_optional) {
  report_info_dto_t* report_info_dto = NULL;
  if (include_optional) {
    report_info_dto = report_info_dto_create(
      _api__report_info_dto__PENDING,
      _api__report_info_dto__NO_DATA,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      "0",
      56
    );
  } else {
    report_info_dto = report_info_dto_create(
      _api__report_info_dto__PENDING,
      _api__report_info_dto__NO_DATA,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      "0",
      56
    );
  }

  return report_info_dto;
}


#ifdef report_info_dto_MAIN

void test_report_info_dto(int include_optional) {
    report_info_dto_t* report_info_dto_1 = instantiate_report_info_dto(include_optional);

	cJSON* jsonreport_info_dto_1 = report_info_dto_convertToJSON(report_info_dto_1);
	printf("report_info_dto :\n%s\n", cJSON_Print(jsonreport_info_dto_1));
	report_info_dto_t* report_info_dto_2 = report_info_dto_parseFromJSON(jsonreport_info_dto_1);
	cJSON* jsonreport_info_dto_2 = report_info_dto_convertToJSON(report_info_dto_2);
	printf("repeating report_info_dto:\n%s\n", cJSON_Print(jsonreport_info_dto_2));
}

int main() {
  test_report_info_dto(1);
  test_report_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // report_info_dto_MAIN
#endif // report_info_dto_TEST
