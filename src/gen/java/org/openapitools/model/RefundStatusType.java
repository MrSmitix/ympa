package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum RefundStatusType {
    STARTED_BY_USER, REFUND_IN_PROGRESS, REFUNDED, FAILED, WAITING_FOR_DECISION, DECISION_MADE, REFUNDED_WITH_BONUSES, REFUNDED_BY_SHOP, CANCELLED, COMPLETE_WITHOUT_REFUND, UNKNOWN
}
