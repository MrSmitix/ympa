package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ReturnShipmentStatusType {
    CREATED, RECEIVED, IN_TRANSIT, READY_FOR_PICKUP, PICKED, LOST, EXPIRED, CANCELLED, FULFILMENT_RECEIVED, PREPARED_FOR_UTILIZATION, NOT_IN_DEMAND, UTILIZED, READY_FOR_EXPROPRIATION, RECEIVED_FOR_EXPROPRIATION
}
