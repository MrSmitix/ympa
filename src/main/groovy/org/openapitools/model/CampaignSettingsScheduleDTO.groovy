package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignSettingsTimePeriodDTO;

@Canonical
class CampaignSettingsScheduleDTO {
    /* Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  */
    Boolean availableOnHolidays
    /* Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. */
    List<String> customHolidays = new ArrayList<>()
    /* Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. */
    List<String> customWorkingDays = new ArrayList<>()
    
    CampaignSettingsTimePeriodDTO period
    /* Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. */
    List<String> totalHolidays = new ArrayList<>()
    /* Список выходных дней недели и государственных праздников. */
    List<Integer> weeklyHolidays = new ArrayList<>()
}
