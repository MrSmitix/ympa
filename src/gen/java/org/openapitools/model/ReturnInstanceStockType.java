package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ReturnInstanceStockType {
    FIT, DEFECT, ANOMALY, SURPLUS, EXPIRED, MISGRADING, UNDEFINED, INCORRECT_IMEI, INCORRECT_SERIAL_NUMBER, INCORRECT_CIS, PART_MISSING, NON_COMPLIENT, NOT_ACCEPTABLE, SERVICE, MARKDOWN, DEMO, REPAIR, FIRMWARE, UNKNOWN
}
