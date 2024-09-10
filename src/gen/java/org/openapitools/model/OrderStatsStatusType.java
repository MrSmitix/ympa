package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OrderStatsStatusType {
    CANCELLED_BEFORE_PROCESSING, CANCELLED_IN_DELIVERY, CANCELLED_IN_PROCESSING, DELIVERY, DELIVERED, PARTIALLY_DELIVERED, PARTIALLY_RETURNED, PENDING, PICKUP, PROCESSING, RESERVED, RETURNED, UNKNOWN, UNPAID, LOST
}
