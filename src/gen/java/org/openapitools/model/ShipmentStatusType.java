package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ShipmentStatusType {
    OUTBOUND_CREATED, OUTBOUND_READY_FOR_CONFIRMATION, OUTBOUND_CONFIRMED, OUTBOUND_SIGNED, FINISHED, ACCEPTED, ACCEPTED_WITH_DISCREPANCIES, ERROR
}
